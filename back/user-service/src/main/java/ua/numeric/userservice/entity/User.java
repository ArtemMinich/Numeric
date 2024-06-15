package ua.numeric.userservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ua.numeric.userservice.util.Role;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "users")
public class User {

    @Id
    @Column(name = "id_token")
    private String idToken;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "patronymic")
    private String patronymic;

    @Column(name = "military_rank")
    private String rank;

    @Column(name = "position")
    private String position;

    @Column(name = "birth")
    private String birth;

    @Column(name = "study_group")
    private int group;

    @Column(name="role")
    @Enumerated(EnumType.STRING)
    private Role role;
}