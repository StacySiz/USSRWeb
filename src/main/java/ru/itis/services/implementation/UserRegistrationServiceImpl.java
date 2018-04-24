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
import ru.itis.security.enums.Role;
import ru.itis.services.EmailService;
import ru.itis.services.UserRegistrationService;

@Service
//@Qualifier(value = "userService")
public class UserRegistrationServiceImpl implements UserRegistrationService {

    @Autowired
    private UserRepository repository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private EmailService emailService;

    public void registration(RegistrationForm registrationForm){
        User user = User.builder()
            .firstName(registrationForm.getFirstName())
            .secondName(registrationForm.getSecondName())
            .country(registrationForm.getCountry())
            .email(registrationForm.getEmail())
            .password(passwordEncoder.encode(registrationForm.getPassword()))
            .role(Role.USER)
            .build();

        System.out.println("THIS NAME IS FROM SERVICE " + user.getFirstName());
        repository.save(user);
        emailService.sendMail("Hello!You've just completed a registration on Strana Sovietov," +
                "we hope you will be an active user!","Registration",user.getEmail());
    }
}
