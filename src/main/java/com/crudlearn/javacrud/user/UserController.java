package com.crudlearn.javacrud.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "api/user")
public class UserController {
    @GetMapping
    public List<User> getUser() {
        return List.of(
                new User(
                        1L,
                        "Yusuf",
                        "yusuf@example.com",
                        LocalDate.of(2023, Month.AUGUST, 23)
                )
        );
    }
}
