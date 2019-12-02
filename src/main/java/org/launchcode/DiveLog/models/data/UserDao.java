package org.launchcode.DiveLog.models.data;

import org.launchcode.DiveLog.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository <User, Integer>{
}
