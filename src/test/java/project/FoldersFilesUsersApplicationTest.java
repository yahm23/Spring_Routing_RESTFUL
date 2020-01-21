package project;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import project.models.File;
import project.models.Folder;
import project.models.User;
import project.repositories.FileRepository;
import project.repositories.FolderRepository;
import project.repositories.UserRepository;

@RunWith(SpringRunner.class)
@SpringBootTest

public class FoldersFilesUsersApplicationTest {
    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    @Test
    public void contextLoads(){
    }

    @Test
    public void canMakeFilesAndFoldersandUsers(){

        User user1 = new User("Yousef");
        userRepository.save(user1);
        Folder folder = new Folder("HWK",user1);
        folderRepository.save(folder);

        File file = new File("Task1","txt",30,folder);

        fileRepository.save(file);



    }
}
