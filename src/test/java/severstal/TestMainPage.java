package severstal;

import severstal.helpers.BaseState;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class TestMainPage extends BaseState {

    @Test
    @DisplayName("Проверка заголовка страницы")
    void testTitle() {
        step("Открыть страницу:", ()-> open("https://www.severstal.com"));

        step("Проверить title открытой страницы:", ()-> {
            $("title").shouldHave(attribute("text", "Северсталь"));
        });
    }

    @Test
    @DisplayName("Проверка наличия текста 'О компании'")
    void testAbout() {
        step("Открыть страницу:",
                ()-> open("https://www.severstal.com"));

        step("Проверка наличия текста 'О компании'", ()-> {
            $("#divMainMenu").shouldHave(text("О компании"));
        });
    }

    @Test
    @DisplayName("Проверка наличия текста 'Продукция и услуги'")
    void testHaveTextAboutProducts() {
        step("Открыть страницу:",
                ()-> open("https://www.severstal.com"));

        step("Проверка наличия текста 'Продукция и услуги'", ()-> {
            $("#divMainMenu").shouldHave(text("Продукция и услуги"));
        });
    }

    @Test
    @DisplayName("Проверка наличия текста 'Инвесторам'")
    void testHaveTextAboutInvests() {
        step("Открыть страницу:",
                ()-> open("https://www.severstal.com"));

        step("Проверка наличия текста 'Инвесторам'", ()-> {
            $("#divMainMenu").shouldHave(text("Инвесторам"));
        });
    }

    @Test
    @DisplayName("Проверка наличия текста 'Работа в компании'")
    void testHaveTextAboutWorkInCompany() {
        step("Открыть страницу:",
                ()-> open("https://www.severstal.com"));

        step("Проверка наличия текста 'Работа в компании'", ()-> {
            $("#divMainMenu").shouldHave(text("Работа в компании"));
        });
    }
}