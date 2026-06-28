package io.personalintelligence.platform.user.controller;

import io.personalintelligence.platform.user.domain.User;
import io.personalintelligence.platform.user.dto.CreateUserRequest;
import io.personalintelligence.platform.user.service.UserService;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Builder
@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping
    public User create(@RequestBody CreateUserRequest request) {
        return userService.create(request);
    }

}


