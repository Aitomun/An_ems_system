package com.david.week_9_task.model;

import com.david.week_9_task.enums.LeaveType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name ="leave_Table")
public class Leave {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime startLeave;

    private LocalDateTime endLeave;

    @Enumerated(EnumType.STRING)
    private LeaveType leaveType;

    @ManyToOne
    Employee employeeId;
}
