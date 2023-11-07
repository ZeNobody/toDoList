package br.com.zenobody.todolist.task;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity(name = "tb_tasks")
public class TaskModel {

    private UUID id;
    private String description;
    @Column(length = 50)
    private String title;
    private String priority;
    private LocalDateTime startAt;
    private LocalDateTime endAt;
    
    private UUID idUser;

    @CreationTimestamp
    private LocalDateTime createdAt;


    
}
