package guru.springframework.chokpetclinic.services.map;

import guru.springframework.chokpetclinic.model.Owner;
import guru.springframework.chokpetclinic.services.OwnerService;
import org.springframework.stereotype.Service;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {
    @Override
    public Owner findByLastName(String lastName) {
        return super.map.values().stream().filter(owner -> owner.getLastName().equals(lastName)).
                findFirst().orElse(null);
    }
}
