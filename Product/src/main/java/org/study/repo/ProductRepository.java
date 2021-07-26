package org.study.repo;
import org.springframework.data.repository.CrudRepository;
import org.study.model.Product;
public interface ProductRepository extends CrudRepository<Product,Integer>{// crud- create read update and delete

}
