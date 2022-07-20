package ru.devteam.resume.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class CreateNewEducationDto {
    private String organization;
    private String speciality;
    private LocalDate yearEnd;
}
