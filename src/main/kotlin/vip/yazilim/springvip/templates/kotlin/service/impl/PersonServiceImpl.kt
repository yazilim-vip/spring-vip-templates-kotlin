package vip.yazilim.springvip.templates.kotlin.service.impl

import org.springframework.stereotype.Service
import vip.yazilim.libs.springvip.util.generic.service.impl.AGenericServiceCrud
import vip.yazilim.springvip.templates.kotlin.entity.Person
import vip.yazilim.springvip.templates.kotlin.repo.IPersonRepo
import vip.yazilim.springvip.templates.kotlin.service.IPersonService

/**
 *
 * @author maemresen - maemresen@yazilim.vip
 * 12/30/2020
 */
@Service
class PersonServiceImpl(
    private val personRepo: IPersonRepo
) : AGenericServiceCrud<Person, Long>(personRepo, Person::class, Long::class), IPersonService {
    override fun getId(entity: Person): Long {
        return entity.id
    }

    override fun getByName(name: String): Person? {
        return personRepo.findByName(name)
    }
}