package java_basics.introduction;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IntroductionTest {

    Introduction intro = new Introduction();

    @Test
    void shoudlReturnTrue() {
        String result = intro.returnWelcome();
        assertTrue("Welcome to the course".equals(result));
    }

}