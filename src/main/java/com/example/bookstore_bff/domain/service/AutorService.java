package com.example.bookstore_bff.domain.service;

import com.example.bookstore_bff.domain.dto.AutorDTO;
import com.example.bookstore_bff.feign.AutorFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutorService {

    @Autowired
    private AutorFeignClient autorClient;

    public List<AutorDTO> buscarTodos() {
        return autorClient.buscarTodos();
    }

    public AutorDTO buscarPorId(Long id) {
        return autorClient.buscarPorId(id);
    }

}
