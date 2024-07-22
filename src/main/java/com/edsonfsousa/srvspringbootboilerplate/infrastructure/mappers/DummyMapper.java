package com.edsonfsousa.srvspringbootboilerplate.infrastructure.mappers;

import com.edsonfsousa.srvspringbootboilerplate.application.dtos.DummyDto;
import com.edsonfsousa.srvspringbootboilerplate.domain.entities.Dummy;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DummyMapper {
    DummyDto toDto(Dummy dummy);

    Dummy toEntity(DummyDto dummyDto);
}