package com.viettin.webbansach_backend.entity;

import lombok.Data;

import java.util.List;
@Data
public class Role {
    private int roleId;
    private String roleName;
    List<User> users;
}
