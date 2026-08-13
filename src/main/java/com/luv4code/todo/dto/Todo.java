package com.luv4code.todo.dto;

import lombok.Builder;

@Builder
public record Todo(
        Long id,
        String title,
        String description
) {
}
