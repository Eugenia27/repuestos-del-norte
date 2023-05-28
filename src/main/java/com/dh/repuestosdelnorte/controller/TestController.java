package com.dh.repuestosdelnorte.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.security.Principal;

@RestController
@RequestMapping("/test")
public class TestController {


    @GetMapping("/admin")
    public ResponseEntity<String> getAdmin() {

        return ResponseEntity.ok("Bienvenido Administrador del Sistema!");
    }

    @GetMapping("/seller")
    public ResponseEntity<String> getSeller(Principal principal) {
        return ResponseEntity.ok("Bienvenido Señor Vendedor!");
    }

    @GetMapping("/supplier")
    public ResponseEntity<String> getSupplier(Principal principal) {
        return ResponseEntity.ok("Hola Proveedor, cómo está usted?");
    }
}