package vip.yazilim.springvip.templates.kotlin.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

/**
 *
 * @author maemresen - maemresen@yazilim.vip
 * 12/30/2020
 */
@Entity
class Person(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long,
    val name: String,
    val age: Double
)