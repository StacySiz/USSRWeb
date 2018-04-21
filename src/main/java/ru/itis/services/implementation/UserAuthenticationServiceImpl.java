package ru.itis.services.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;
import ru.itis.models.User;
import ru.itis.repositories.UserRepository;
import ru.itis.security.details.UserDetailsImpl;
import ru.itis.security.details.UserDetailsServiceImpl;
import ru.itis.services.UserAuthenticationService;

@Service
public class UserAuthenticationServiceImpl implements UserAuthenticationService {
    @Autowired
    private UserRepository userRepository;

    public User getUserByAuthentication(Authentication authentication){
        UserDetailsImpl detailsService = (UserDetailsImpl) authentication.getPrincipal();
        int id = detailsService.getUser().getId();
        return userRepository.findById(id);
    }
}
