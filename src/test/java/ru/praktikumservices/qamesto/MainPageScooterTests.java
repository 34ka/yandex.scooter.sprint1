package ru.praktikumservices.qamesto;

import com.codeborne.selenide.Configuration;
import org.junit.Before;
import org.junit.Test;
import ru.praktikumservices.qamesto.pageobject.MainPageScooter;

import static com.codeborne.selenide.Selenide.open;
import static ru.praktikumservices.qamesto.pageobject.MainPageScooter.homePageScooter;

public class MainPageScooterTests {

    @Before
    public void setup() {
        //открыть браузер в максимальном разрешении
        Configuration.startMaximized = true;
    }

    @Test
    public void checkTextUnderTheDropDownLists() {

        //перейти на страницу тестового стенда
        //перейти на страницу тестового стенда
        MainPageScooter mainPage = open(homePageScooter, MainPageScooter.class);

        //закрыть куки
        mainPage.clickСookiesButton();

        //нажать на 1-й выпадающий список и проверить на наличие текста
        mainPage.clickDropDownListAndAssertText1();
        //нажать на 2-й выпадающий список и проверить на наличие текста
        mainPage.clickDropDownListAndAssertText2();
        //нажать на 3-й выпадающий список и проверить на наличие текста
        mainPage.clickDropDownListAndAssertText3();
        //нажать на 4-й выпадающий список и проверить на наличие текста
        mainPage.clickDropDownListAndAssertText4();
        //нажать на 5-й выпадающий список и проверить на наличие текста
        mainPage.clickDropDownListAndAssertText5();
        //нажать на 6-й выпадающий список и проверить на наличие текста
        mainPage.clickDropDownListAndAssertText6();
        //нажать на 7-й выпадающий список и проверить на наличие текста
        mainPage.clickDropDownListAndAssertText7();
        //нажать на 8-й выпадающий список и проверить на наличие текста
        mainPage.clickDropDownListAndAssertText8();
    }
}
