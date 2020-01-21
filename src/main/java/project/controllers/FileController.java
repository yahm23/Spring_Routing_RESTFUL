package project.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.repositories.FileRepository;

@RestController
@RequestMapping(value="/files")
public class FileController {
    @Autowired
    FileRepository fileRepository;
}
