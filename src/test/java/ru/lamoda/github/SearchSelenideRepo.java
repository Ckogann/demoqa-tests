package ru.lamoda.github;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class SearchSelenideRepo {

//    @BeforeAll
//    static void beforeAll() {
//        Configuration.browserSize = "1920x1080";
//    }

    @Test
    void shouldSelenideRepositoryInGithub() {
        open("https://github.com/");
        $("[data-test-selector=nav-search-input]").setValue("selenide").pressEnter();

        // находит все элементы li в коллекции ul с классом repo-list,
        // затем выбирает первый li и кликает по элементу a, который находится внутри первого li
        $$("ul.repo-list li").first().$("a").click();

        $("h1").shouldHave(text("selenide / selenide"));
    }
}