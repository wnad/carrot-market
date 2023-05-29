package com.carrotmarket.service;

import com.carrotmarket.dto.CommonResponseDto;
import com.carrotmarket.dto.user.UserDto;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface UserService {

    CommonResponseDto<Object> saveUser(UserDto.Create userSaveRequestDto);

    UserDto.Response findUser(Integer id);

    List<UserDto.Response> findUserList();

    CommonResponseDto<Object> deleteUserById(Integer userId);
}
