package guru.springframework.chokpetclinic.services.map;

import guru.springframework.chokpetclinic.model.Pet;
import guru.springframework.chokpetclinic.services.PetService;
import org.springframework.stereotype.Service;

@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {
}
