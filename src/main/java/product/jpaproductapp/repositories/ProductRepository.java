package product.jpaproductapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import product.jpaproductapp.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
