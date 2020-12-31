package vip.yazilim.springvip.templates.kotlin.repo

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import vip.yazilim.springvip.templates.kotlin.entity.Person
import java.util.*

/**
 *
 * @author maemresen - maemresen@yazilim.vip
 * 12/30/2020
 */
@Repository
interface IPersonRepo : JpaRepository<Person, Long> {
    fun findByName(name: String): Person?
}