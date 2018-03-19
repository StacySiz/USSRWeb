package services;

import models.User;
import models.forms.RegistrationForm;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import repositories.UserRepository;

@Service
public class UserServiceImpl {
    private UserRepository repository;
    private PasswordEncoder passwordEncoder;


    public void registration(RegistrationForm registrationForm){
        User user = new User();
        if(repository.findByEmail(user.getEmail() )!=null){
            throw new DuplicateKeyException("Emails are the same!");
        }
        user.setFirstName(registrationForm.getFirstName());
        user.setSecondName(registrationForm.getSecondName());
        user.setCountry(registrationForm.getCountry());
        user.setEmail(registrationForm.getEmail());
        user.setPassword(passwordEncoder.encode(user.getPassword()));

        repository.save(user);
    }
}
