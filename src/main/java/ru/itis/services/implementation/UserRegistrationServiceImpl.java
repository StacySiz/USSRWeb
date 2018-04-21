package ru.itis.services.implementation;

import org.springframework.beans.factory.annotation.Qualifier;
import ru.itis.exceptions.NotFoundExc;
import ru.itis.models.User;
import ru.itis.models.forms.RegistrationForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import ru.itis.repositories.UserRepository;
import ru.itis.services.UserRegistrationService;

@Service
//@Qualifier(value = "userService")
public class UserRegistrationServiceImpl implements UserRegistrationService {

    @Autowired
    private UserRepository repository;

    @Autowired
    private PasswordEncoder passwordEncoder;


    public void registration(RegistrationForm registrationForm){
        User user = User.builder()
            .firstName(registrationForm.getFirstName())
            .secondName(registrationForm.getSecondName())
            .country(registrationForm.getCountry())
            .email(registrationForm.getEmail())
            .password(passwordEncoder.encode(registrationForm.getPassword()))
            .build();

//        if(repository.findByEmail(user.getEmail() )!=null){
////            throw new DuplicateKeyException("Emails are the same!");
//            throw new NotFoundExc("user");
//        }
//        user.setFirstName(registrationForm.getFirstName());
//        user.setSecondName(registrationForm.getSecondName());
//        user.setCountry(registrationForm.getCountry());
//        user.setEmail(registrationForm.getEmail());
//        user.setPassword(passwordEncoder.encode(registrationForm.getPassword()));
        System.out.println("THIS NAME IS FROM SERVICE " + user.getFirstName());
        repository.save(user);
    }
}