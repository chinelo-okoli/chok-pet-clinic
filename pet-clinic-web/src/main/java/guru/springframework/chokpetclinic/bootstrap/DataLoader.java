package guru.springframework.chokpetclinic.bootstrap;


import guru.springframework.chokpetclinic.model.Owner;
import guru.springframework.chokpetclinic.model.Vet;
import guru.springframework.chokpetclinic.services.OwnerService;
import guru.springframework.chokpetclinic.services.VetService;
import guru.springframework.chokpetclinic.services.map.OwnerServiceMap;
import guru.springframework.chokpetclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner = new Owner();
        owner.setId(1L);
        owner.setFirstName("Michael");
        owner.setLastName("Weston");
        ownerService.save(owner);

        owner = new Owner();
        owner.setId(2L);
        owner.setFirstName("Fiona");
        owner.setLastName("Glenanne");
        ownerService.save(owner);

        System.out.println("Loaded Owners....");

        Vet vet = new Vet();
        vet.setId(1L);
        vet.setFirstName("Sam");
        vet.setLastName("Axe");
        vetService.save(vet);

        vet = new Vet();
        vet.setId(2L);
        vet.setFirstName("Jessie");
        vet.setLastName("Porter");
        vetService.save(vet);

        System.out.println("Loaded Vets....");
    }
}
