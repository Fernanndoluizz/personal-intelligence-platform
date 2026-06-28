package io.personalintelligence.platform.user.service;

import io.personalintelligence.platform.user.domain.User;
import io.personalintelligence.platform.user.dto.CreateUserRequest;
import io.personalintelligence.platform.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public User create(CreateUserRequest request) {
        User user = User.builder()
                .firstName(request.getFirstName())
                .lastName(request.getLastName())
                .email(request.getEmail())
                .createdAt(LocalDateTime.now())
                .updatedAt(LocalDateTime.now())
                .build();
        return userRepository.save(user);
    }
}


