package com.grabagrade.models;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Getter
@Setter
public class PersonalInfoModel {
    String firstName;
    String lastName;
    String role;
    int phoneNumber;
}
