package com.edsonfsousa.srvspringbootboilerplate.domain.repositories;

import com.edsonfsousa.srvspringbootboilerplate.domain.entities.Dummy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DummyRepository extends JpaRepository<Dummy, Long> {
}