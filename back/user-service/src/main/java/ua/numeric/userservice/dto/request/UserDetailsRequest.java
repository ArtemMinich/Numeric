package ua.numeric.userservice.dto.request;

public record UserDetailsRequest(String name, String surname, String patronymic, String rank,
                                 String position, String birth, Integer group) {
}
