package threads;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeadlockExampleTest {

    @Test
    void testDeadlock() {
        assertDoesNotThrow(DeadlockExample::createDeadlock);
    }
}

