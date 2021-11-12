package com.springboot.CraftAngle.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.springboot.CraftAngle.Entity.Product;

public interface ProductRepository extends JpaRepository<Product,Long>{

}
