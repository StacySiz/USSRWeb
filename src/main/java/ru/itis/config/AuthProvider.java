package ru.itis.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import ru.itis.models.User;
import ru.itis.repositories.UserRepository;
import ru.itis.security.details.UserDetailsServiceImpl;

import java.util.Collection;
import java.util.Optional;

@Component
public class AuthProvider implements AuthenticationProvider {

    @Autowired
    private UserRepository usersRepository;

    @Autowired
    private UserDetailsServiceImpl userDetailsService;

    private PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String email = authentication.getName();
        String password = authentication.getCredentials()
                .toString();
        Optional<User> usersList = usersRepository.findByEmail(email);
        User user = null;
        if (usersList.isPresent()) {
            user = usersList.get();
        }
        UserDetails details = null;
        Collection<? extends GrantedAuthority> authorities = null;
        if (passwordEncoder.matches(password, user.getPassword())) {
            details = userDetailsService.loadUserByUsername(email);
            authorities = details.getAuthorities();
        }
        return new UsernamePasswordAuthenticationToken(details, password, authorities);
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return true;
    }
}
