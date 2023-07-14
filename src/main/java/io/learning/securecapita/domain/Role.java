package io.learning.securecapita.domain;

/*
 * @author: Nagendra
 * version: 1.0.0
 * @created: 13/07/2023 - 14:10
 */

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_DEFAULT;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(NON_DEFAULT)
public class Role {
    private Long id;
    private String name;
    private String permission;
}
