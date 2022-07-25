package ru.devteam.resume.converters;

import org.springframework.stereotype.Component;
import ru.devteam.resume.dtos.CreateNewResumeDto;
import ru.devteam.resume.dtos.CreateNewWorkDto;
import ru.devteam.resume.entities.Resume;
import ru.devteam.resume.entities.Work;

@Component
public class WorkConverter {
    public CreateNewWorkDto entityToDto(Work w) {
        CreateNewWorkDto createNewWorkDto = new CreateNewWorkDto();
//        createNewWorkDto.setUserId(w.getUserId());
        createNewWorkDto.setOrganization(w.getOrganization());
        createNewWorkDto.setPost(w.getPost());
        createNewWorkDto.setStartWork(w.getStartWork());
        createNewWorkDto.setEndWork(w.getEndWork());
        createNewWorkDto.setProgress(w.getProgress());
        return createNewWorkDto;
    }
}
