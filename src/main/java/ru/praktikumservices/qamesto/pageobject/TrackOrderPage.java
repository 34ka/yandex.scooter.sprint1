package ru.praktikumservices.qamesto.pageobject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TrackOrderPage {
    //локатор кнопки "Отменить заказ"
    @FindBy(how = How.XPATH,using = ".//button[text()='Отменить заказ']")
    private SelenideElement cancelOrderButton;
    //локатор кнопки "Посмотреть"
    @FindBy(how = How.XPATH,using = ".//button[text()='Посмотреть']")
    private SelenideElement lookAtButton;

    //локатор элемента "Имя"
    @FindBy(how = How.XPATH,using = ".//div[text()='Имя']")
    private SelenideElement nameElement;
    //локатор элемента "Фамилия"
    @FindBy(how = How.XPATH,using = ".//div[text()='Фамилия']")
    private SelenideElement surnameElement;
    //локатор элемента "Адрес"
    @FindBy(how = How.XPATH,using = ".//div[text()='Адрес']")
    private SelenideElement addressElement;
    //локатор элемента "Станция метро"
    @FindBy(how = How.XPATH,using = ".//div[text()='Станция метро']")
    private SelenideElement metroStationElement;
    //локатор элемента "Телефон"
    @FindBy(how = How.XPATH,using = ".//div[text()='Телефон']")
    private SelenideElement numberPhoneElement;
    //локатор элемента "Дата доставки"
    @FindBy(how = How.XPATH,using = ".//div[text()='Дата доставки']")
    private SelenideElement deliveryDateElement;
    //локатор элемента "Срок аренды"
    @FindBy(how = How.XPATH,using = ".//div[text()='Срок аренды']")
    private SelenideElement rentalPeriodElement;
    //локатор элемента "Цвет"
    @FindBy(how = How.XPATH,using = ".//div[text()='Цвет']")
    private SelenideElement colorElement;
}
