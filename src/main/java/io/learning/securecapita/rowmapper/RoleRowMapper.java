package io.learning.securecapita.rowmapper;

import io.learning.securecapita.domain.Role;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * @author: Nagendra
 * version: 1.0.0
 * @created: 13/07/2023 - 19:13
 */public class RoleRowMapper implements RowMapper<Role> {
    @Override
    public Role mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        return Role.builder()
                .id(resultSet.getLong("id"))
                .name(resultSet.getString("name"))
                .permission(resultSet.getString("permission"))
                .build();
    }
}
