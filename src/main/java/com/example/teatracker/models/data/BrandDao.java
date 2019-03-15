package com.example.teatracker.models.data;


import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;

@Repository
@Transactional
public class BrandDao extends CrudRepository<Brand, Integer>{
    public Object findAll() {
    }
}
