package inventory.model.dao;

import org.springframework.data.repository.CrudRepository;

import inventory.entity.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {

}
