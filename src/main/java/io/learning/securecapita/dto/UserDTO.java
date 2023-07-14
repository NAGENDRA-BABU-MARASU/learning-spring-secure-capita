package io.learning.securecapita.dto;

/*
 * @author: Nagendra
 * version: 1.0.0
 * @created: 14/07/2023 - 08:25
 */

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UserDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private String phone;
    private String title;
    private String bio;
    private String imageUrl;
    private boolean enabled;
    private boolean isNotLocked;
    private boolean isUsingMfa;
    private LocalDateTime createdAt;
}
