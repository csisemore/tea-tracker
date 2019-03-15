package com.example.teatracker.models.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Repository;
//import javax.transaction.Transactional;
import org.springframework.transaction.annotation.Transactional;

@Repository

public class BrandDao extends CrudRepository<Brand, Integer>{
    public Object findAll() {
    }
}
