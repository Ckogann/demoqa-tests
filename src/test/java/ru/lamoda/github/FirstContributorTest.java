package ru.lamoda.github;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class FirstContributorTest {

    @Test
    void firstContributorShouldBeAndreiSolntsev() {
        open("https://github.com/selenide/selenide");
        $(".Layout-sidebar").$(byText("Contributors")).closest("div")
                .$$("ul li").first().hover();
        $$(".Popover-message").find(visible).shouldHave(text("Andrei Solntsev"));
    }
}
