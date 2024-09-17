import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;
class StudentRepoTest {

    @org.junit.jupiter.api.Test
    void findByID() {
            String givenID = "1";
            StudentRepo studentRepo = new StudentRepo();
            assertThrows(NoSuchElementException.class, ()->studentRepo.findByID(givenID));

    }
}