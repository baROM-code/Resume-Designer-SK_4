package ru.devteam.resume.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ru.devteam.resume.dtos.CreateNewEducationDto;
import ru.devteam.resume.dtos.CreateNewResumeDto;
import ru.devteam.resume.entities.Education;
import ru.devteam.resume.services.EducationService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/educations")
@RequiredArgsConstructor
public class EducationController {
    private final EducationService educationService;

    @GetMapping
    public List<Education> getAllEducations() {
        return educationService.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createNewResume(@RequestBody CreateNewEducationDto createNewEducationDto) {
        educationService.createNewEducation(createNewEducationDto);
    }
}
