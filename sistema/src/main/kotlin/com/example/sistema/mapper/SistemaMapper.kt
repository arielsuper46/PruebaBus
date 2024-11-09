package com.example.sistema.mapper

import com.example.sistema.dto.SistemaDto
import com.example.sistema.entity.Sistema

object SistemaMapper {
    fun toEntity(sistemaDto: SistemaDto): Sistema {
        val sistema = Sistema()
        sistema.id = sistemaDto.id
        sistema.model = sistemaDto.model
        sistema.brand = sistemaDto.brand
        sistema.age = sistemaDto.age
        return sistema
    }
}
