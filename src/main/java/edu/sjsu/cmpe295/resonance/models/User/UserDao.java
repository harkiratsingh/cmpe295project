package edu.sjsu.cmpe295.resonance.models.User;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface UserDao extends CrudRepository<User, Long> {

    @Query(value="SELECT * FROM users u  WHERE  u.email=?1",nativeQuery = true)
    ArrayList<User> getUserByEmail(String email);


    @Query(value = "select * from users where userid=?1 and sessionid=?2",nativeQuery = true)
    User getUserByUseridAndSessionid(long userid,long sessionid);
}