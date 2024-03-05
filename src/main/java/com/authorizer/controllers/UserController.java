//package com.authorizer.controllers;
//
//import com.authorizer.models.mappers.user.UserVOMapper;
//import com.authorizer.models.mappers.user.vo.UserResponseVO;
//import com.authorizer.services.user.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/v1")
//public class UserController {
//
//    @Autowired
//    private UserService userService;
//
//    @Autowired
//    private UserVOMapper userVOMapper;
//
//    @GetMapping("/users")
//    public List<UserResponseVO> getAll() {
//        return userVOMapper.toListUserResponseVO(userService.getAll());
//    }
//
//}
