package product.jpaproductapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import product.jpaproductapp.entities.Product;
import product.jpaproductapp.repositories.ProductRepository;

import java.util.List;

@SpringBootApplication
public class JpaProductAppApplication implements CommandLineRunner {
    @Autowired
    private ProductRepository productRepository;
    public static void main(String[] args) {
        SpringApplication.run(JpaProductAppApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        productRepository.save(new Product(null, "Telephone", 3000, 6));
        productRepository.save(new Product(null, "Computer", 5600, 3));
        productRepository.save(new Product(null, "TV", 10999, 10));
        List<Product> products = productRepository.findAll();
        products.forEach(p->{
            System.out.println(p.toString());
        });
        Product product = productRepository.findById(1L).get();
        System.out.println("************");
        System.out.println(product.getId());
        System.out.println(product.getName());
        System.out.println(product.getPrice());
        System.out.println(product.getQuantity());
        System.out.println("************");


    }

}
