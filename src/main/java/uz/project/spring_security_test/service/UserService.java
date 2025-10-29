package uz.project.spring_security_test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import uz.project.spring_security_test.model.User;
import uz.project.spring_security_test.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

        private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);

    public User save(User user) {
        user.setPassword(encoder.encode(user.getPassword()));

        return userRepository.save(user);
    }
}
