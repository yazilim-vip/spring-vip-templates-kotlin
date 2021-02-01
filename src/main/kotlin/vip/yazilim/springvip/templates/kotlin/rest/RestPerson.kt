package vip.yazilim.springvip.templates.kotlin.rest

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import vip.yazilim.libs.springvip.config.bean.IRestResponseBuilder
import vip.yazilim.libs.springvip.util.generic.rest.AGenericRest
import vip.yazilim.libs.springvip.util.generic.rest.GenericRest
import vip.yazilim.libs.springvip.util.generic.rest.method.*
import vip.yazilim.libs.springvip.util.generic.service.IGenericServiceCrud
import vip.yazilim.springvip.templates.kotlin.entity.Person
import vip.yazilim.springvip.templates.kotlin.service.IPersonService
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse
import kotlin.reflect.KClass

/**
 *
 * @author maemresen - maemresen@yazilim.vip
 * 12/30/2020
 */
@RestController
@RequestMapping("/person")
@GenericRest
@GetAll
@GetById
@Save
@DeleteById
class RestPerson(private val restResponseBuilder: IRestResponseBuilder, private val personService: IPersonService) :
    AGenericRest<Person, Long>(
        restResponseBuilder,
        personService,
        Person::class,
        Long::class
    ) {

    @GetMapping("/{name}")
    fun getByName(
        request: HttpServletRequest,
        response: HttpServletResponse,
        @PathVariable("name") name: String
    ): Any {
        val person: Person? = personService.getByName(name)
        return if (person == null) {
            restResponseBuilder.generateRestResponse(
                "Person with name=${name} not found",
                HttpStatus.NOT_FOUND,
                request,
                response
            )
        } else {
            restResponseBuilder.generateRestResponse(person, HttpStatus.OK, request, response)
        }
    }
}