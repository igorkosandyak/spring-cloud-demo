package com.entities.value_objects;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class UserVO {


    private String id;
    private String email;
    private String password;
    private String role;

}
