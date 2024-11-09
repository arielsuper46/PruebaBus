package com.example.sistema.dto

import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotNull


class SistemaDto {

    @NotNull(message = "ID es requerido")
    @NotBlank(message = "ID no puede estar en blanco")
    var id: Long? = null

    @NotNull(message = "El Modelo es requerido")
    @NotBlank(message = "EL Modelo no puede estar en blanco")
    var model: String? = null

    @NotNull(message = "La Marca es requerida")
    var brand: String? = null

    @NotNull(message = "El año es requerida")
    var age: String? = null

}