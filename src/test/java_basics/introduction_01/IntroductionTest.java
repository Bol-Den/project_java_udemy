package java_basics.introduction_01;

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