package ua.numeric.authservice.dto.response;

import ua.numeric.authservice.util.Role;

public record UserDetailsResponse(String name, String surname, String patronymic,
                                  String rank, String position, String birth, Integer group, String role) {
}
