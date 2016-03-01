package edu.sjsu.cmpe295.resonance.services.User;

import edu.sjsu.cmpe295.resonance.exceptions.BadRequestException;
import edu.sjsu.cmpe295.resonance.models.User.User;
import edu.sjsu.cmpe295.resonance.models.User.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
/**
 * Created by 010028252 on 11/24/2015.
 */

@Service("UserService")
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public User create(User user) {

        userDao.save(user);
        return user;
    }

    @Override
    public User getUserById(long userid) {
        User user = userDao.findOne(userid);
        return user;
    }

    @Override
    public void isEmailAvailable(String email){
        ArrayList<User> users = userDao.getUserByEmail(email);
        if(users.size()!=0){
            throw new BadRequestException("Email already in use");
        }
    }

    @Override
    public User getUserByEmail(String email){

        ArrayList<User> users = userDao.getUserByEmail(email);
        if(users.size()==0){
            throw new BadRequestException("Email does not exist");
        }
        else{
            return users.get(0);
        }
    }

   /* @Override
    public void updateSessionId(long userid,String sessionid)
    {
        userDao.updateUserSession(sessionid, userid);
    }*/

}
