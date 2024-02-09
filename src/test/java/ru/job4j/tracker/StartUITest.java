package ru.job4j.tracker;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

class StartUITest {

    @Test
    void whenDeleteItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("New item");
        tracker.add(item);
        Item edited = tracker.findById(item.getId());
        tracker.delete(item.getId());
        Item expected = null;
        Item actual = tracker.findById(item.getId());
        assertEquals(expected, actual);
    }
}