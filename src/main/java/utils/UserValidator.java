package utils;

import models.User;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class UserValidator implements Validator {
    @Override
    public boolean supports(Class<?> aClass) {
        return User.class.equals(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        User user = (User) o;
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,"firstName","NotEmpty");
        if (user.getFirstName().length() < 3 || user.getFirstName().length() > 15){
            errors.rejectValue("firstName","Size.registrationForm.firstName");
        }
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,"secondName","NotEmpty");
        if (user.getSecondName().length() < 3 || user.getSecondName().length() > 15){
            errors.rejectValue("secondName","Size.registrationForm.secondName");
        }
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,"password","NotEmpty");
        if(user.getPassword().length() < 7 ||user.getPassword().length()>30){
            errors.rejectValue("password","Size.registrationForm.password");
        }

    }
}
