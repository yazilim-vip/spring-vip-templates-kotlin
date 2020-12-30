package vip.yazilim.springvipexamples.repo

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import vip.yazilim.springvipexamples.entity.Person

/**
 *
 * @author maemresen - maemresen@yazilim.vip
 * 12/30/2020
 */
@Repository
interface IPersonRepo : JpaRepository<Person, Long>