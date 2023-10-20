package org.example;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class LeapYearShould {
    @Test
    public void is_not_leap_year_if_not_divisible_by_4() {
        assertFalse(LeapYear.isLeapYear(1));
        assertThat(LeapYear.isLeapYear(2017)).isFalse();
    }
}
