package tests.demoqa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {

    @BeforeAll
    static void setUp() {
        Configuration.baseUrl = "http://demoqa.com";
        Configuration.browserSize = "1920x1080";
    }
}
