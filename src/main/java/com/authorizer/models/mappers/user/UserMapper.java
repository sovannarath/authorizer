//package com.authorizer.models.mappers.user;
//
//import com.authorizer.models.dao.entities.User;
//import com.authorizer.models.dto.UserDto;
//import org.mapstruct.Mapper;
//import org.mapstruct.Mapping;
//
//@Mapper(componentModel = "spring")
//public interface UserMapper {
//
//    @Mapping(target = "id", ignore = true)
//    @Mapping(target = "deleted", ignore = true)
//    @Mapping(target = "createdAt", ignore = true)
//    @Mapping(target = "updatedAt", ignore = true)
//    @Mapping(target = "deletedAt", ignore = true)
//    User userDtoToUser(UserDto userDto);
//
//    @Mapping(target = "id", ignore = true)
//    @Mapping(target = "deleted", ignore = true)
//    @Mapping(target = "createdAt", ignore = true)
//    @Mapping(target = "updatedAt", ignore = true)
//    @Mapping(target = "deletedAt", ignore = true)
//    UserDto userToUserDto(User user);
//
//}
