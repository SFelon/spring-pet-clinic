package sebastian.felon.springpetclinic.services;

import sebastian.felon.springpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}

