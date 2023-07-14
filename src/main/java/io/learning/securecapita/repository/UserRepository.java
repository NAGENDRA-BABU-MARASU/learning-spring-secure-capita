package io.learning.securecapita.repository;

import io.learning.securecapita.domain.User;

import java.util.Collection;

/*
 * @author: Nagendra
 * @version: 1.0
 * @since: 13/7/2023
 */

public interface UserRepository<T extends User>  {
    /* Basic CRUD operations */
    T create(T data);
    Collection<T> list(int page, int pageSize);
    T get(Long id);
    T update(T data);
    Boolean delete(Long id);

    /* More complex operations */
}
