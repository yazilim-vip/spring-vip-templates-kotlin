package vip.yazilim.springvip.templates.kotlin.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.validation.constraints.NotBlank

/**
 *
 * @author maemresen - maemresen@yazilim.vip
 * 12/30/2020
 */
@Entity
data class Person(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long,

    @NotBlank(message = "name is a mandatory name")
    var name: String,

    @NotBlank(message = "age is a mandatory field")
    var age: Double
)
