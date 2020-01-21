package project.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.repositories.FolderRepository;

@RestController
@RequestMapping(value ="/folders")

public class FolderController {
    @Autowired
    FolderRepository folderRepository;
}
