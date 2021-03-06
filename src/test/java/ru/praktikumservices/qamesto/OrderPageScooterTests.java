package ru.praktikumservices.qamesto;

import com.codeborne.selenide.Configuration;
import org.junit.Before;
import org.junit.Test;
import ru.praktikumservices.qamesto.pageobject.MainPageScooter;
import ru.praktikumservices.qamesto.pageobject.OrderPageScooter;

import static com.codeborne.selenide.Selenide.*;
import static ru.praktikumservices.qamesto.pageobject.MainPageScooter.homePageScooter;


public class OrderPageScooterTests {

    @Before
     public void setup() {
        //открыть браузер в максимальном разрешении
        Configuration.startMaximized = true;
    }

    @Test
    public void orderScooterByButtonTop() {

        //перейти на страницу тестового стенда
        MainPageScooter mainPage = open(homePageScooter, MainPageScooter.class);

        //закрыть куки
        mainPage.clickСookiesButton();

        //перейти в форму заполнения заказа, через верхнюю кнопку "Заказать"
        mainPage.clickTopOrderButton();

        OrderPageScooter fillFormPage = page(OrderPageScooter.class);
        //заполнить форму c именем, фамилией, адресов, станцией метро, номером телефона
        fillFormPage.successfulFillFormForWhom("Василий", "Петров",
                "Москва", "Красные Ворота", "11111111111");

        //заполнить форму c датой доставки, сроком аренды, комменатрием для курьера
        fillFormPage.successfulFillFormAboutRent("10.12.2021",
                "шестеро суток", "-");
    }

    @Test
    public void orderScooterByButtonBottom() {

        //перейти на страницу тестового стенда
        MainPageScooter mainPage = open(homePageScooter, MainPageScooter.class);

        //закрыть куки
        mainPage.clickСookiesButton();

        //перейти в форму заполнения заказа, через нижнюю кнопку "Заказать"
        mainPage.clickBottomOrderButton();

        OrderPageScooter fillFormPage = page(OrderPageScooter.class);
        //заполнить форму c именем, фамилией, адресов, станцией метро, номером телефона
        fillFormPage.successfulFillFormForWhom("Олег", "Анатольев",
                "Москва", "Сокольники", "12345612345");

        //заполнить форму c датой доставки, сроком аренды, комменатрием для курьера
        fillFormPage.successfulFillFormAboutRent("23.10.2021", "сутки",
                "Позвоните, пожалуйста, за 30 минут. Не хочу опоздать");
    }
}
