package guru.springframework.chokpetclinic.services;

import guru.springframework.chokpetclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
