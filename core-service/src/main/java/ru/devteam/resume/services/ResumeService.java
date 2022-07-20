package ru.devteam.resume.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.devteam.resume.dtos.CreateNewResumeDto;
import ru.devteam.resume.entities.Resume;
import ru.devteam.resume.repositories.ResumeRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ResumeService {
    private final ResumeRepository resumeRepository;

    public List<Resume> findAll(){
        return resumeRepository.findAll();
    }

    public void createNewResume(CreateNewResumeDto resumeDto) {
        Resume resume = new Resume();
//        resume.setUserId(resumeDto.getUserId());
        resume.setPost(resumeDto.getPost());
        resume.setSalary(resumeDto.getSalary());
        resume.setSchedule(resumeDto.getSchedule());
        resume.setAboutMyself(resumeDto.getAboutMyself());
        resumeRepository.save(resume);
    }
}
