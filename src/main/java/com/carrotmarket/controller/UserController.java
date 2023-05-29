package com.carrotmarket.controller;

import com.carrotmarket.dto.CommonResponseDto;
import com.carrotmarket.dto.user.UserDto;
import com.carrotmarket.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@RequestMapping("/api/v1/carrot-market/")
@RestController
public class UserController {

    private final UserService userService;

    @GetMapping("/user/{id}")
    public ResponseEntity<UserDto.Response> findUser(@PathVariable Integer id) {
        log.debug("find User");
        UserDto.Response userDto = userService.findUser(id);

        return ResponseEntity.ok()
                .body(userDto);
    }

    @GetMapping("/users")
    public ResponseEntity<List<UserDto.Response>> findUserList() {
        log.debug("find UserList()");
        List<UserDto.Response> userDtoList = userService.findUserList();

        return ResponseEntity.ok()
                .body(userDtoList);
    }

    @PostMapping("/user")
    public ResponseEntity<CommonResponseDto<Object>> saveUser(@RequestBody UserDto.Create userSaveRequestDto) {
        log.debug("save User()");

        CommonResponseDto<Object> responseDto = userService.saveUser(userSaveRequestDto);

        return ResponseEntity.ok()
                .body(responseDto);
    }

    @DeleteMapping("/user/{id}")
    public ResponseEntity<CommonResponseDto<Object>> deleteUser(@PathVariable("id") Integer id) {
        log.debug("deleteUser()");

        CommonResponseDto<Object> responseDto = userService.deleteUserById(id);

        return ResponseEntity.ok()
                .body(responseDto);
    }



}
