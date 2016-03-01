package edu.sjsu.cmpe295.resonance.services.User;

import edu.sjsu.cmpe295.resonance.models.User.User;


public interface UserService {
    public User create(User user);
    public User getUserById(long userid);
    public void isEmailAvailable(String email);
    public User getUserByEmail(String email);
   // public void updateSessionId(long id,String sesionId);
}
