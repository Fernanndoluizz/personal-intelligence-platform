package io.personalintelligence.platform.user.repository;

import io.personalintelligence.platform.user.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {

}
