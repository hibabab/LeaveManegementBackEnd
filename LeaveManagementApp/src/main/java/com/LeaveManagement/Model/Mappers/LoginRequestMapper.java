/*package com.LeaveManagement.Model.Mappers;

import org.modelmapper.ModelMapper;
import com.LeaveManagement.Model.Dto.LoginRequestDto;
import com.LeaveManagement.Model.Entity.LoginRequest;

public class LoginRequestMapper {
    private static final ModelMapper modelMapper = new ModelMapper();

    public static LoginRequestDto convertToDTO(LoginRequest loginRequest) {
        return modelMapper.map(loginRequest, LoginRequestDto.class);
    }

    public static LoginRequest convertToEntity(LoginRequestDto loginRequestDto) {
        return modelMapper.map(loginRequestDto, LoginRequest.class);
    }
}
*/