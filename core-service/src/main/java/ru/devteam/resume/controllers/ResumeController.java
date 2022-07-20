package ru.devteam.resume.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ru.devteam.resume.dtos.CreateNewResumeDto;
import ru.devteam.resume.entities.Resume;
import ru.devteam.resume.services.ResumeService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/resumes")
@RequiredArgsConstructor
public class ResumeController {
    private final ResumeService resumeService;

    @GetMapping
    public List<Resume> getAllResumes() {
        return resumeService.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createNewResume(@RequestBody CreateNewResumeDto createNewResumeDto) {
        resumeService.createNewResume(createNewResumeDto);
    }
}
