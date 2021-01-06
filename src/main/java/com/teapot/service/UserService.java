package com.teapot.service;

import com.teapot.dto.UserDTO;

import java.util.List;

public interface UserService extends CrudService<UserDTO,String> {

    List<UserDTO> findManagers();
    List<UserDTO> findEmployees();
}
