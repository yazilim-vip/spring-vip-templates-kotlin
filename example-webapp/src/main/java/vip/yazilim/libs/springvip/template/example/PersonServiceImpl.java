package vip.yazilim.libs.springvip.template.example;

import org.jetbrains.annotations.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import vip.yazilim.libs.springvip.util.generic.service.impl.AGenericServiceCrud;

@Service
public class PersonServiceImpl extends AGenericServiceCrud<Person, Integer> implements IPersonService {

    public PersonServiceImpl(@NotNull JpaRepository<Person, Integer> repository) {
        super(repository, Person.class, Integer.class);
    }

    @NotNull
    @Override
    protected Integer getId(@NotNull Person entity) {
        return entity.getId();
    }
}
