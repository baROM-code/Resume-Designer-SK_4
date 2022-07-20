package ru.devteam.resume.converters;

import org.springframework.stereotype.Component;
import ru.devteam.resume.dtos.CreateNewResumeDto;
import ru.devteam.resume.entities.Resume;

@Component
public class ResumeConverter {
    public CreateNewResumeDto entityToDto(Resume r) {
        CreateNewResumeDto createNewResumeDto = new CreateNewResumeDto();
//        createNewResumeDto.setId(r.getId());
        createNewResumeDto.setUserId(r.getUserId());
        createNewResumeDto.setPost(r.getPost());
        createNewResumeDto.setSalary(r.getSalary());
        createNewResumeDto.setSchedule(r.getSchedule());
        createNewResumeDto.setAboutMyself(r.getAboutMyself());
        return createNewResumeDto;
    }
}
