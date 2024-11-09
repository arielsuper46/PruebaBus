package com.example.sistema.entity

import jakarta.persistence.*

@Entity
@Table(name = "Sistema")
class Sistema {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null
    var model: String? = null
    var brand: String? = null
    var age: String? = null

}
