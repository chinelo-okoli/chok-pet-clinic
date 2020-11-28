package guru.springframework.chokpetclinic.services;

import guru.springframework.chokpetclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
