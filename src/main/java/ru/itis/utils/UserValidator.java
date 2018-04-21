package ru.itis.utils;

import org.springframework.beans.factory.annotation.Autowired;
import ru.itis.models.User;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import ru.itis.models.forms.RegistrationForm;
import ru.itis.repositories.UserRepository;

import java.util.Optional;

public class UserValidator implements Validator {
    @Override
    public boolean supports(Class<?> aClass) {
        return aClass.getName().equals(RegistrationForm.class.getName());
    }
    @Autowired
    private UserRepository userRepository;

    @Override
    public void validate(Object o, Errors errors) {
        RegistrationForm regForm = (RegistrationForm) o;
//        User user = (User) o;
//        ValidationUtils.rejectIfEmptyOrWhitespace(errors,"firstName","NotEmpty");
//        if (regForm.getFirstName().length() < 3 || regForm.getFirstName().length() > 15){
//            errors.rejectValue("firstName","Size.registrationForm.firstName");
//        }
//        ValidationUtils.rejectIfEmptyOrWhitespace(errors,"secondName","NotEmpty");
//        if (regForm.getSecondName().length() < 3 || regForm.getSecondName().length() > 15){
//            errors.rejectValue("secondName","Size.registrationForm.secondName");
//        }
//        ValidationUtils.rejectIfEmptyOrWhitespace(errors,"password","NotEmpty");
//        if(regForm.getPassword().length() < 5 ||regForm.getPassword().length()>30){
//            errors.rejectValue("password","Size.registrationForm.password");
//        }

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "firstName", "empty.login", "Пустой логин");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "secondName", "empty.password", "Пустой пароль");

    }
    }

