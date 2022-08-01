package ru.practicum.shareit.requests;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ItemRequest {
    private long id;
    private long description;
    private long requestor;
    private LocalDateTime created;
}
