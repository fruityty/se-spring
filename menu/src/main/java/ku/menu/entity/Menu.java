package ku.menu.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.UUID;

@Entity // Spring auto new object
@Data // Lombok auto add getter setter
public class Menu {

    @Id // Primary key
    @GeneratedValue // Auto generate ID
    private UUID id;

    private String name;
    private double price;
    private String category;

}
