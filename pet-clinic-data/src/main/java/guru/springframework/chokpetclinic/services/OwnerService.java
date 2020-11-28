package guru.springframework.chokpetclinic.services;

import guru.springframework.chokpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
