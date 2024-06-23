package com.david.week_9_task.Repository;

import com.david.week_9_task.model.Leave;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeaveRepository extends JpaRepository<Leave, Long> {
}
