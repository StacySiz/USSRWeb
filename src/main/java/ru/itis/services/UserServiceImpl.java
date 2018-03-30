package ru.itis.services;

import org.springframework.beans.factory.annotation.Qualifier;
import ru.itis.models.User;
import ru.itis.models.forms.RegistrationForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import ru.itis.repositories.UserRepository;

@Service
//@Qualifier(value = "userService")
public class UserServiceImpl {

    @Autowired
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
