package io.learning.securecapita.query;

/*
 * @author: Nagendra
 * version: 1.0.0
 * @created: 13/07/2023 - 14:06
 */
public class UserQuery {
    public static final String INSERT_USER_QUERY =
            "INSERT INTO users(first_name, last_name, email, password) VALUES (:firstName, :lastName, :email, :password)";
    public static final String COUNT_USER_EMAIL_QUERY = "SELECT COUNT(*) FROM users WHERE email = :email";
    public static final String INSET_ACCOUNT_VERIFICATION_URL_QUERY =
            "INSERT INTO accountverifications(user_id, url) VALUES (:userId, :url)";

}
