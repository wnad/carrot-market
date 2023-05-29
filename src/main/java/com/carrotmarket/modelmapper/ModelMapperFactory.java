package com.carrotmarket.modelmapper;

import com.carrotmarket.domain.User;
import com.carrotmarket.dto.user.UserDto;
import lombok.RequiredArgsConstructor;
import org.modelmapper.Converter;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ModelMapperFactory {

    public ModelMapper getUserModelMapper() {
        ModelMapper modelMapper = new ModelMapper();

        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

        modelMapper.createTypeMap(User.class, UserDto.Response.class);

        return modelMapper;
    }
}
