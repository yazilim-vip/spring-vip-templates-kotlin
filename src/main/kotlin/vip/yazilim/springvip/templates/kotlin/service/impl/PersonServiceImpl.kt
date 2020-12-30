package vip.yazilim.springvipexamples.service.impl

import vip.yazilim.libs.springvip.util.generic.service.impl.AGenericServiceCrud
import vip.yazilim.springvipexamples.entity.Person
import vip.yazilim.springvipexamples.repo.IPersonRepo
import vip.yazilim.springvipexamples.service.IPersonService

/**
 *
 * @author maemresen - maemresen@yazilim.vip
 * 12/30/2020
 */
class PersonServiceImpl(
    private val personRepository: IPersonRepo
) : AGenericServiceCrud<Person, Long>(personRepository, Person::class, Long::class), IPersonService {
    override fun getId(entity: Person): Long {
        return entity.id
    }
}