package com.foodelivery.dewswit.security;


import com.foodelivery.dewswit.models.User;
import com.foodelivery.dewswit.rep.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserDetailsServices implements UserDetailsService {

    private final UserRepository userRepository;

    public UserDetailsServices(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> user = userRepository.findByUsername(username);
        if(user.isEmpty())
            throw new UsernameNotFoundException("Пользоватль не найден");
        return new UserDetailsImp(user.get());
    }
}
