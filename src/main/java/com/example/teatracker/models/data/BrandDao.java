package com.example.teatracker.models.data;

import com.example.teatracker.models.Brand;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;
//import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface BrandDao extends CrudRepository<Brand, Integer> {

}
