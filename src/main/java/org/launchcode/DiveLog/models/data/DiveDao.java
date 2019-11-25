package org.launchcode.DiveLog.models.data;


import org.launchcode.DiveLog.models.Dive;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface DiveDao extends CrudRepository <Dive, Integer>{
}
