package ru.job4j.tracker;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.jupiter.api.Assertions.assertNull;

class StartUITest {
    @Test
    void whenDeleteItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("New item");
        tracker.add(item);
        Item edited = tracker.findById(item.getId());
        tracker.delete(item.getId());
        assertSame(tracker.findAll().length, 0);
    }
}