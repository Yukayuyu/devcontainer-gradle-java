package com.example.demo.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.example.demo.dto.UserDto;

public class UserValidator implements ConstraintValidator<ValidUser, UserDto> {

  @Override
  public void initialize(ValidUser constraintAnnotation) {
  }

  @Override
  public boolean isValid(UserDto userDto, ConstraintValidatorContext context) {
    if (userDto.getId() == null || userDto.getName() == null) {
      context.buildConstraintViolationWithTemplate("User no Id or Name").addPropertyNode("name")
          .addConstraintViolation();
      return false;
    }
    // Add any other complex validation logic here
    return true;
  }
}
