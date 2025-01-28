package com.example.bookstore_bff.feign;

import com.example.bookstore_bff.domain.dto.AutorDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "autor-feign", url = "${bookstore-ms.url}/autores")
public interface AutorFeignClient {

    @GetMapping
    List<AutorDTO> buscarTodos();

    @GetMapping("/{id}")
    AutorDTO buscarPorId(@PathVariable("id") Long id);

}
