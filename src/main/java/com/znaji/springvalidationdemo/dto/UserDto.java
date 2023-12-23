package com.znaji.springvalidationdemo.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDto
{

    @NotBlank(message = "invalid name")
    private String name;

    @Email(message = "invalid email")
    private String email;


    @Pattern(regexp = "^\\d{10}$", message = "invalid mobile number")
    private String mobile;

    private String gender;


    @Min(value = 18, message = "User age, should be > 18")
    private int age;

    @NotBlank
    private String nationality;

}
