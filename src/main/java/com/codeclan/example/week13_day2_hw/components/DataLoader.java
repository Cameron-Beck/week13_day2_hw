package com.codeclan.example.week13_day2_hw.components;

import com.codeclan.example.week13_day2_hw.models.File;
import com.codeclan.example.week13_day2_hw.repositories.FileRepository;
import com.codeclan.example.week13_day2_hw.repositories.FolderRepository;
import com.codeclan.example.week13_day2_hw.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;


@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;


    public DataLoader() {

    }

    public void run(ApplicationArguments args) {

        File idea = new File("idea","txt", 23, file);
        fileRepository.save(idea);



    }
}