package com.codedecode.userinfo.mapper;

import com.codedecode.userinfo.dto.UserDTO;
import com.codedecode.userinfo.entity.User;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-09-08T08:14:41+0200",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.4.1 (Oracle Corporation)"
)
public class UserMapperImpl implements UserMapper {

    @Override
    public User mapUserDTOToUser(UserDTO userDTO) {
        if ( userDTO == null ) {
            return null;
        }

        User user = new User();

        user.setUserId( userDTO.getUserId() );
        user.setUserName( userDTO.getUserName() );
        user.setUserPassword( userDTO.getUserPassword() );
        user.setAddress( userDTO.getAddress() );
        user.setCity( userDTO.getCity() );

        return user;
    }

    @Override
    public UserDTO userToUserDTO(User user) {
        if ( user == null ) {
            return null;
        }

        UserDTO userDTO = new UserDTO();

        userDTO.setUserId( user.getUserId() );
        userDTO.setUserName( user.getUserName() );
        userDTO.setUserPassword( user.getUserPassword() );
        userDTO.setAddress( user.getAddress() );
        userDTO.setCity( user.getCity() );

        return userDTO;
    }
}
