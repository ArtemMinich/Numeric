package ua.numeric.authservice.dto.response;

public record UserDetailsResponse(String name, String surname, String patronymic,
                                  String rank, String position, String birth, Integer group) {
}
