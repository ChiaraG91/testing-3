import org.junit.jupiter.api.BeforeEach;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    private final Main testing = new Main();
    @org.junit.jupiter.api.Test
    void dateForm() {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        String dataStringLong = String.valueOf(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG));
        assertEquals("1 marzo 2023","1 marzo 2023");
    }
}