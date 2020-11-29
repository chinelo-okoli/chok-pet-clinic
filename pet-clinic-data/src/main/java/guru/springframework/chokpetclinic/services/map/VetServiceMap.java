package guru.springframework.chokpetclinic.services.map;

import guru.springframework.chokpetclinic.model.Vet;
import guru.springframework.chokpetclinic.services.VetService;
import org.springframework.stereotype.Service;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {
}
