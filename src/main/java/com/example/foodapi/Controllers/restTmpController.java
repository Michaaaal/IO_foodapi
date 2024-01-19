package com.example.foodapi.Controllers;

import com.example.foodapi.Models.User.Gender;
import com.example.foodapi.Models.User.UserEntity;
import com.example.foodapi.Repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class restTmpController {

    private final UserRepository userRepository;

    @GetMapping("/cos")
    public UserEntity user(){


        return userRepository.saveAndFlush(new UserEntity(1L,"abc@.a.pl","hash",12,85.3,175.4, Gender.MALE));
    }

}
