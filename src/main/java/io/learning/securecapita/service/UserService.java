package io.learning.securecapita.service;

/*
 * @author: Nagendra
 * version: 1.0.0
 * @created: 14/07/2023 - 08:23
 */

import io.learning.securecapita.domain.User;
import io.learning.securecapita.dto.UserDTO;

public interface UserService {
    UserDTO createUser(User user);
}
