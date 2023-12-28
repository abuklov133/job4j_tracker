package ru.job4j.pojo;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LicenseTest {

    @Test
    void eqName() {
        License first = new License();
        first.setCode("Audio");
        License second = new License();
        second.setCode("Audio");
        assertThat(first).isEqualTo(second);
    }
}