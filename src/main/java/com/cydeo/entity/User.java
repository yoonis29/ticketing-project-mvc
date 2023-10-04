package com.cydeo.entity;

import com.cydeo.enums.Gender;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@Data
public class User extends BaseEntity{

    private String firstName;
    private String lastName;
    private String userName;
    private String passWord;
    private boolean enabled;
    private Role role;
    private Gender gender;

    public User(Long id, LocalDateTime insertDateTime, Long insertUserID, LocalDateTime lastUpdateDateTime, Long lastUpdateUserId, String firstName, String lastName, String userName, String passWord, boolean enabled, Role role, Gender gender) {
        super(id, insertDateTime, insertUserID, lastUpdateDateTime, lastUpdateUserId);
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.passWord = passWord;
        this.enabled = enabled;
        this.role = role;
        this.gender = gender;
    }
}
