package ua.numeric.authservice.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import ua.numeric.authservice.util.Role;

@Getter
@Setter
@Entity
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

    @Column(name = "rank")
    private String rank;

    @Column(name = "position")
    private String position;

    @Column(name = "birth")
    private String birth;

    @Column(name = "group")
    private int group;

    @Column(name="role")
    @Enumerated(EnumType.STRING)
    private Role role;
}