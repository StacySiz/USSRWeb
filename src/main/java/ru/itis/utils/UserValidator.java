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
        Optional<User> user = userRepository.findByEmail(regForm.getEmail());
        if (user.isPresent()) {
            errors.reject("occupied.login", "Пользователь с этой почтой уже зарегистрирован");
        }
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "firstName", "NotEmpty", "Заполните все поля корректно,возможно где-то пропуск");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "NotEmpty", "Заполните все поля корректно,возможно где-то пропуск");
//        if (regForm.getFirstName().length() < 3 || regForm.getFirstName().length() > 15){
//            errors.rejectValue("firstName","Ваше имя должно быть о");
//        }
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "secondName", "NotEmpty", "Please fill in all fields correctly");
//        if (regForm.getSecondName().length() < 3 || regForm.getSecondName().length() > 15){
//            errors.rejectValue("secondName","Size.registrationForm.secondName");
//        }
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "NotEmpty", "Please fill in all fields correctly");
        if (regForm.getPassword().length() < 5 || regForm.getPassword().length() > 30) {
            errors.reject("password", "Ваш пароль должен быть больше 5 символов");
        }

//        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "firstName", "empty.login", "Пустой логин");
//        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "secondName", "empty.password", "Пустой пароль");

    }
}

