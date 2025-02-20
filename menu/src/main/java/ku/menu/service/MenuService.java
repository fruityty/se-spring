package ku.menu.service;

import ku.menu.entity.Menu;
import ku.menu.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class MenuService {

    @Autowired
    private MenuRepository menuRepository;

    public List<Menu> getAll() {

        return menuRepository.findAll();
    }

    public Menu create(Menu menu) {
        return menuRepository.save(menu);
    }

    public Menu getMenuById(UUID id) {
        return menuRepository.findById(id).get();
    }

    public Menu update(Menu requestBody) {
        UUID id = requestBody.getId();
        Menu record = menuRepository.findById(id).get();
        record.setName(requestBody.getName());
        record.setPrice(requestBody.getPrice());
        record.setCategory(requestBody.getCategory());

        record = menuRepository.save(record);
        return record;
    }

    public Menu delete(UUID id) {
        Menu record = menuRepository.findById(id).get();
        menuRepository.deleteById(id);
        return record;
    }

//    @Autowired can replace code below
//    public MenuService(MenuRepository repo) {
//        this.menuRepository = repo;
//    }
}
