package project.components;

import project.models.File;
import project.models.Folder;
import project.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import project.repositories.FileRepository;
import project.repositories.FolderRepository;
import project.repositories.UserRepository;

@Component
public class DataLoader implements ApplicationRunner {
    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository  userRepository;

    public DataLoader() {

    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        User user1 = new User("Yousef");
        User user2 = new User("Joey");
        userRepository.save(user1);
        userRepository.save(user2);

        Folder folder = new Folder("HWK",user1);
        folderRepository.save(folder);

        File file = new File("Task1","txt",30,folder);

        fileRepository.save(file);


    }
}
