package ku.menu.controller;

import ku.menu.entity.Menu;
import ku.menu.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
public class MenuController {
    @Autowired
    private MenuService service;

    @GetMapping("/menu")
    public List<Menu> getAll() {
        return service.getAll();
    }

    @GetMapping("/menu/{id}")
    public Menu getMenuById(@PathVariable UUID id) {
        return service.getMenuById(id);
    }

    @PostMapping("/menu")
    public Menu create(@RequestBody Menu menu) {
        return service.create(menu);
    }

    @PutMapping("/menu")
    public Menu update(@RequestBody Menu menu) {
        return service.update(menu);
    }

    @DeleteMapping("/menu/{id}")
    public Menu delete(@PathVariable UUID id) {
        return service.delete(id);
    }



}
