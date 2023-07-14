package io.learning.securecapita.service.implementation;

import io.learning.securecapita.domain.User;
import io.learning.securecapita.dto.UserDTO;
import io.learning.securecapita.dtomapper.UserDTOMapper;
import io.learning.securecapita.repository.UserRepository;
import io.learning.securecapita.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/*
 * @author: Nagendra
 * version: 1.0.0
 * @created: 14/07/2023 - 08:32
 */

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository<User> userRepository;

    @Override
    public UserDTO createUser(User user) {
        return UserDTOMapper.fromUser(userRepository.create(user));
    }
}



















