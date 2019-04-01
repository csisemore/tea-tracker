package com.example.teatracker.models.data;


import com.example.teatracker.models.TeaType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface TeaTypeDao extends CrudRepository<TeaType, Integer> {
}
