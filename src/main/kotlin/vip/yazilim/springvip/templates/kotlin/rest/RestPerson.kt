package vip.yazilim.springvipexamples.rest

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import vip.yazilim.libs.springvip.config.bean.IRestResponseBuilder
import vip.yazilim.libs.springvip.util.generic.rest.AGenericRest
import vip.yazilim.libs.springvip.util.generic.service.IGenericServiceCrud
import vip.yazilim.springvipexamples.entity.Person
import vip.yazilim.springvipexamples.service.IPersonService
import kotlin.reflect.KClass

/**
 *
 * @author maemresen - maemresen@yazilim.vip
 * 12/30/2020
 */
@RestController
@RequestMapping("/person")
class RestPerson(
    restResponseBuilder: IRestResponseBuilder,
    personService: IPersonService,
) : AGenericRest<Person, Long>(restResponseBuilder, personService, Person::class, Long::class) {


}