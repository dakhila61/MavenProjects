package threads;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;

class SingletonPatternTest {

    @Test
    void testSingletonInstance() {
        SingletonPattern instance1 = SingletonPattern.getInstance();
        SingletonPattern instance2 = SingletonPattern.getInstance();

        // Check if both instances refer to the same object
        assertSame(instance1, instance2);
    }
}
