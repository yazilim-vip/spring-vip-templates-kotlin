package vip.yazilim.springvipexamples.service

import vip.yazilim.libs.springvip.util.generic.service.IGenericServiceCrud
import vip.yazilim.springvipexamples.entity.Person

/**
 *
 * @author maemresen - maemresen@yazilim.vip
 * 12/30/2020
 */
interface IPersonService : IGenericServiceCrud<Person, Long>