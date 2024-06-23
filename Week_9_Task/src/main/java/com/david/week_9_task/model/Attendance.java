package com.david.week_9_task.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name ="attendance")
public class Attendance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    //multiple instances of an entity (many side) are associated with a single instance of another entity(the one)
    @JoinColumn(name = "employee_id")
    Employee employeeId;

    private String employeeName;

    @Column(name = "date")
    private LocalDate date;
}
