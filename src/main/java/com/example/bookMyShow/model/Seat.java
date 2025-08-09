package com.example.bookMyShow.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Seat {
    @Id private String id;
    private String screenId;
    private String row;
    private int number;
}
