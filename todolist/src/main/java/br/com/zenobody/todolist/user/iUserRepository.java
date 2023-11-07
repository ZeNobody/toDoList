package br.com.zenobody.todolist.user;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;


public interface iUserRepository extends JpaRepository<UserModel, UUID> {
    UserModel findByName(String username);
}
