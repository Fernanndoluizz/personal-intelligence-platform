package io.personalintelligence.platform.user.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateUserRequest {
    
    private String firstName;
    private String lastName;
    private String email;

}
