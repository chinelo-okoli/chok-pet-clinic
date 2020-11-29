package guru.springframework.chokpetclinic.services.map;

import guru.springframework.chokpetclinic.model.BaseEntity;
import guru.springframework.chokpetclinic.services.CrudService;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class AbstractMapService<T extends BaseEntity<Long>, ID extends Long> implements CrudService<T, ID> {
    protected Map<Long, T> map = new HashMap<>();

    @Override
    public Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    @Override
    public T findById(ID id) {
        return map.get(id);
    }

    @Override
    public T save(T object) {
        if(object != null && object.getId() == null) {
            object.setId(getNextId());
        } else if(object == null) {
            throw new RuntimeException("Object cannot be null");
        }
        map.put(object.getId(), object);
        return object;
    }

    @Override
    public void delete(T object) {
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }

    @Override
    public void deleteById(ID id) {
        map.remove(id);
    }

    private Long getNextId() {
        Long maxKey = map.isEmpty() ? 0L : map.keySet().stream().reduce(Long::max).get();
        return maxKey + 1L;
    }
}
