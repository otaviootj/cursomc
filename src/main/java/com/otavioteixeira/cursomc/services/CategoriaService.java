package com.otavioteixeira.cursomc.services;

import com.otavioteixeira.cursomc.domain.Categoria;
import com.otavioteixeira.cursomc.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public Categoria buscar(Integer id){
        Optional<Categoria> resultId = categoriaRepository.findById(id);
        return resultId.orElse(null);
    }

}
