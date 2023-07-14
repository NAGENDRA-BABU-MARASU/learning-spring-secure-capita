package io.learning.securecapita.dtomapper;

/*
 * @author: Nagendra
 * version: 1.0.0
 * @created: 14/07/2023 - 08:28
 */

import com.fasterxml.jackson.databind.util.BeanUtil;
import io.learning.securecapita.domain.User;
import io.learning.securecapita.dto.UserDTO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class UserDTOMapper {
    public static UserDTO fromUser(User user){
        UserDTO userDTO = new UserDTO();
        BeanUtils.copyProperties(user, userDTO);
        return userDTO;
    }

    public static User toUser(UserDTO userDTO){
        User user = new User();
        BeanUtils.copyProperties(userDTO, user);
        return user;
    }
}
