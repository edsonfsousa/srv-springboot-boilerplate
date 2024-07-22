package com.edsonfsousa.srvspringbootboilerplate.presentation.controllers;

import com.edsonfsousa.srvspringbootboilerplate.application.exceptions.ResourceNotFoundException;
import com.edsonfsousa.srvspringbootboilerplate.application.services.DummyService;
import com.edsonfsousa.srvspringbootboilerplate.domain.entities.Dummy;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Dummy", description = "API para operações em Dummies")
@RestController
@RequestMapping("/v1/dummies")
public class DummyController {

    @Autowired
    private DummyService dummyService;

    @Operation(summary = "Obter todos os dummies", description = "Retorna uma lista de todos os dummies")
    @GetMapping
    public List<Dummy> getAllDummies() {
        return dummyService.findAll();
    }

    @Operation(summary = "Obter dummy por ID", description = "Retorna um dummy pelo seu ID")
    @GetMapping("/{id}")
    public Dummy getDummyById(@PathVariable Long id) {
        return dummyService.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Dummy not found for this id :: " + id));
    }

    @Operation(summary = "Criar um novo dummy", description = "Cria um novo dummy")
    @PostMapping
    public Dummy createDummy(@RequestBody Dummy dummy) {
        return dummyService.save(dummy);
    }

    @Operation(summary = "Atualizar um dummy", description = "Atualiza um dummy existente")
    @PutMapping("/{id}")
    public Dummy updateDummy(@PathVariable Long id, @RequestBody Dummy dummyDetails) {
        Dummy dummy = dummyService.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Dummy not found for this id :: " + id));
        dummy.setName(dummyDetails.getName());
        return dummyService.save(dummy);
    }

    @Operation(summary = "Deletar um dummy", description = "Deleta um dummy existente pelo seu ID")
    @DeleteMapping("/{id}")
    public void deleteDummy(@PathVariable Long id) {
        Dummy dummy = dummyService.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Dummy not found for this id :: " + id));
        dummyService.deleteById(id);
    }
}