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
public class Payment {
    @Id private String id;
    private String bookingId;
    private String userId;
    private double amount;
    private String status; // SUCCESS or FAILURE
}
