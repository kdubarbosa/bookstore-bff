package com.example.bookstore_bff.web.controller;

import com.example.bookstore_bff.domain.dto.AutorDTO;
import com.example.bookstore_bff.domain.service.AutorService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@ApiResponse(responseCode = "400", description = "Bad Request")
@RestController
@RequestMapping("/api/v1/autores")
public class AutorController {

    @Autowired
    private AutorService autorService;

    @GetMapping
    @Operation(summary = "Busca uma lista com todos os autores com seus livros.", description = "autor")
    public ResponseEntity<List<AutorDTO>> buscarTodos() {
        List<AutorDTO> autores = autorService.buscarTodos();
        return autores.isEmpty()
                ? ResponseEntity.noContent().build()
                : ResponseEntity.ok(autores);
    }

    @GetMapping("/{id}")
    @Operation(summary = "Busca um autor pelo seu ID.", description = "autor")
    public ResponseEntity<AutorDTO> buscarPorId(@PathVariable Long id) {
        AutorDTO autor = autorService.buscarPorId(id);
        return autor != null
                ? ResponseEntity.ok(autor)
                : ResponseEntity.notFound().build();
    }

}
