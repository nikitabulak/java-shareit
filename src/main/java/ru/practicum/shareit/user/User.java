package ru.practicum.shareit.user;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
public class User {
    private static long userId = 1;

    private long id;
    @NotNull
    private String name;
    @Email
    @NotNull
    private String email;

    public static long generateId() {
        return userId++;
    }
}
