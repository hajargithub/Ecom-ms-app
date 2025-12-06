package hajar.net.inventoryservice;

import hajar.net.inventoryservice.entities.Product;
import hajar.net.inventoryservice.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }
@Bean
    CommandLineRunner start(ProductRepository productRepository) {
        return args -> {
            productRepository.save(Product.builder()
                    .name("Laptop").price(5000.0).quantity(10).build());
            productRepository.save(Product.builder()
                    .name("Smart Phone").price(3500.0).quantity(20).build());
            productRepository.save(Product.builder()
                    .name("Printer").price(2500.0).quantity(5).build());
        };
}
}
