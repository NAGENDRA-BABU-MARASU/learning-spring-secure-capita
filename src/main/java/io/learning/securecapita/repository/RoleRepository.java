package io.learning.securecapita.repository;

import io.learning.securecapita.domain.Role;

import java.util.Collection;

/*
 * @author: Nagendra
 * version: 1.0.0
 * @created: 13/07/2023 - 14:08
 */

public interface RoleRepository <T extends Role>  {
    /* Basic CRUD operations */
    T create(T data);
    Collection<T> list(int page, int pageSize);
    T get(Long id);
    T update(T data);
    Boolean delete(Long id);

    /* More complex operations */
    void addRoleToUser(Long userId, String roleName);
    Role getRoleByUserId(Long userId);
    Role getRoleByUserEmail(String email);
    void updateUserRole(Long userId, String roleName);
}

















