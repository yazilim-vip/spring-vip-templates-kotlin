package vip.yazilim.libs.springvip.template.example;

import org.jetbrains.annotations.NotNull;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vip.yazilim.libs.springvip.config.bean.IRestResponseBuilder;
import vip.yazilim.libs.springvip.util.generic.rest.AGenericRest;
import vip.yazilim.libs.springvip.util.generic.rest.GenericRest;
import vip.yazilim.libs.springvip.util.generic.rest.method.DeleteById;
import vip.yazilim.libs.springvip.util.generic.rest.method.GetAll;
import vip.yazilim.libs.springvip.util.generic.rest.method.GetById;

@RestController
@RequestMapping("/rest/person")
@GenericRest
@GetAll @GetById @DeleteById
public class RestPerson extends AGenericRest<Person, Integer> {
    public RestPerson(@NotNull IRestResponseBuilder restResponseBuilder, @NotNull IPersonService personCrudService) {
        super(restResponseBuilder, personCrudService, Person.class, Integer.class);
    }
}