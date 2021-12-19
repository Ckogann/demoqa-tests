package ru.lamoda.tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class TextBoxTests {
//    @BeforeAll
//    static void beforeAll() {
//        Configuration.browserSize = "1920x1080";
//    }

    @Test
    void successTest() {
        open("https://demoqa.com/text-box");
        $("#userName").setValue("Alex");
        $("#userEmail").setValue("email@gmail.com");
        $("#currentAddress").setValue("address");
        $("#permanentAddress").setValue("another address");
        $("#submit").scrollTo().click();

        $("#output").shouldBe(visible);

        $("#name").shouldHave(text("Alex"));
        $("#email").shouldHave(text("email@gmail.com"));
        $("#output #currentAddress").shouldHave(text("address"));
        $("#output").$("#permanentAddress").shouldHave(text("another address"));
    }
}