package li.selman.project;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Hasan Kara
 */
@ExtendWith(MockitoExtension.class)
class MainTest {

    @Test
    void succeedingTest() {
        assertEquals(1,1);
    }
}
