package com.edsonfsousa.srvspringbootboilerplate.application.services;

import com.edsonfsousa.srvspringbootboilerplate.domain.entities.Dummy;
import com.edsonfsousa.srvspringbootboilerplate.domain.repositories.DummyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DummyService {
    @Autowired
    private DummyRepository dummyRepository;

    public List<Dummy> findAll() {
        return dummyRepository.findAll();
    }

    public Optional<Dummy> findById(Long id) {
        return dummyRepository.findById(id);
    }

    public Dummy save(Dummy dummy) {
        return dummyRepository.save(dummy);
    }

    public void deleteById(Long id) {
        dummyRepository.deleteById(id);
    }
}