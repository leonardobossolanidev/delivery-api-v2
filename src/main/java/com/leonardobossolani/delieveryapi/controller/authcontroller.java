package com.leonardobossolani.deliveryapi.controller;

import com.leonardobossolani.deliveryapi.model.User;
import com.leonardobossolani.deliveryapi.repository.UserRepository;
import com.leonardobossolani.deliveryapi.service.JwtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private JwtService jwtService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping("/register")
    public String register(@RequestBody User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);
        return "Usuário registrado com sucesso!";
    }

    @PostMapping("/login")
    public Map<String, String> login(@RequestBody User user) {
        User usuario = userRepository.findByUsername(user.getUsername())
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));

        if (passwordEncoder.matches(user.getPassword(), usuario.getPassword())) {
            String token = jwtService.generateToken(usuario.getUsername());
            return Map.of("token", token);
        } else {
            throw new RuntimeException("Senha inválida");
        }
    }
}
