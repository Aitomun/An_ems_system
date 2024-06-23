package com.david.week_9_task.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ErrorDetails {
    private LocalDateTime timestamp;
    private String errorMessage;
    private String errorDetails;

}
