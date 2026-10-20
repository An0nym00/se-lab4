package hu.bme.mit.spaceship;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.beans.Transient;

import org.junit.jupiter.api.Test;

class TorpedoStoreTest {


    @Test
    void fire_Success() {
        // Arrange
        TorpedoStore store = new TorpedoStore(1);

        // Act
        boolean result = store.fire(1);

        // Assert
        assertEquals(true, result);
    }

    @Test
    void torpedo_count(){
        TorpedoStore store = new TorpedoStore(1);

        store.fire(1);

        assertEquals(store.getTorpedoCount(), 0);
    }

    @Test
    void fire_success_from_GT4500(){
        GT4500 spaceship = new GT4500(2, 0, 4, 0);

        assertEquals(true, spaceship.fireTorpedo(FiringMode.SINGLE));
    }

    @Test
    void torped_isEmpty(){
        TorpedoStore store = new TorpedoStore(2);

        store.fire(1);
        store.fire(1);

        assertEquals(true, store.isEmpty());
    }

}
