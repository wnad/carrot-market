package com.carrotmarket.service;

import com.carrotmarket.domain.User;
import com.carrotmarket.dto.CommonResponseDto;
import com.carrotmarket.dto.user.UserDto;
import com.carrotmarket.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    @Transactional
    public CommonResponseDto<Object> saveUser(UserDto.Create userSaveRequestDto) {

        User newUser = userSaveRequestDto.toEntity();

        userRepository.save(newUser);

        return CommonResponseDto.builder()
                .message("유저 등록이 완료되었습니다.")
                .build();

    }

    @Override
    public UserDto.Response findUser(Integer id) {
        return userRepository.findById(id).orElseThrow().toDto();
    }

    @Override
    public List<UserDto.Response> findUserList() {
        return userRepository.findAll()
                .stream()
                .map(User::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public CommonResponseDto<Object> deleteUserById(Integer userId) {

        userRepository.deleteById(userId); // User 삭제

        return CommonResponseDto.builder()
                .message("유저 삭제가 완료되었습니다.")
                .build();
    }

}
