package com.api.picpay.dtos;

import java.math.BigDecimal;

public record UserDTO(String firstName, String lastName, String document, BigDecimal balance, String email, String password, com.api.picpay.domain.user.UserType userType) {
}
