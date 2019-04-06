package com.example.teatracker.models.data;

//import com.example.teatracker.models.TType;
import com.example.teatracker.models.Tea;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface TeaDao extends CrudRepository<Tea, Integer> {

}
