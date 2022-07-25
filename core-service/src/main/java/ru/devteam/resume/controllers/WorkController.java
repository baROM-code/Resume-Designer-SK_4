package ru.devteam.resume.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ru.devteam.resume.dtos.CreateNewEducationDto;
import ru.devteam.resume.dtos.CreateNewWorkDto;
import ru.devteam.resume.entities.Work;
import ru.devteam.resume.services.WorkService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/works")
@RequiredArgsConstructor
public class WorkController {
    private final WorkService workService;

    @GetMapping
    public List<Work> getAllWorks() {
        return workService.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createNewWork(@RequestBody CreateNewWorkDto createNewWorkDto) {
        workService.createNewWork(createNewWorkDto);
    }
}
