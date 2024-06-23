package com.david.week_9_task.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name ="admin")
public class Admin extends Person {
    @Size(min = 5, max = 16, message = "Password must contain at least 5 digits")
    @NotBlank(message = "required!")
    private String password;
}
