package io.learning.securecapita.query;

/*
 * @author: Nagendra
 * version: 1.0.0
 * @created: 14/07/2023 - 08:09
 */public class RoleQuery {

    public static final String INSERT_ROLE_TO_USER_QUERY =
            "INSERT INTO userroles (user_id, role_id) VALUES (:userId, :roleId)";
    public static final String SELECT_ROLE_BY_NAME_QUERY =
            "SELECT * FROM roles WHERE name = :roleName";
}
