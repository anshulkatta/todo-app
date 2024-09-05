package com.todo.app.record;

import java.time.LocalDateTime;

public record TodoItem(
        String itemName,
        String itemDescription,
        LocalDateTime itemExpiryDateTime) {}
