package coffee.pastry.joshuablog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import coffee.pastry.joshuablog.model.user.User;
import coffee.pastry.joshuablog.model.user.UserRepository;

@Transactional(readOnly = true)
@Service
public class UserService {

     @Autowired
     private UserRepository userRepository;

     @Transactional
     public void 회원가입(User user) {

          userRepository.save(user);
     }

     public User 로그인(User user) {
          return userRepository.findByUsernameAndPassword(user.getUsername(), user.getPassword());
     }
}