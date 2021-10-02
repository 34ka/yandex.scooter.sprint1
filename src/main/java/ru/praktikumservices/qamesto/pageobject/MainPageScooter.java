package ru.praktikumservices.qamesto.pageobject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Condition.*;

public class MainPageScooter {

    //локатор логотипа Яндекс
    @FindBy(how = How.XPATH,using = ".//img[@alt='Yandex']")
    private SelenideElement logoYandex;
    //локатор логотипа Скутер
    @FindBy(how = How.XPATH,using = ".//img[@alt='Scooter']")
    private SelenideElement logoScooter;
    //локатор изображения Скутер
    @FindBy(how = How.XPATH,using = ".//img[@alt='Scooter blueprint']")
    private SelenideElement blueprintScooter;

    //локатор кнопки "Заказать" сверху
    @FindBy(how = How.XPATH,using = ".//div[@class='Header_Nav__AGCXC']/button[text()='Заказать']")
    private SelenideElement topOrderButton;
    //локатор кнопки "Заказать" снизу
    @FindBy(how = How.XPATH,using = ".//div[@class='Home_FinishButton__1_cWm']/button[text()='Заказать']")
    private SelenideElement bottomOrderButton;
    //локатор кнопки "Статус заказа"
    @FindBy(how = How.XPATH,using = ".//button[text()='Статус заказа']")
    private SelenideElement statusOrderButton;
    //локатор кнопки в окне с куками
    @FindBy(how = How.ID,using = "rcc-confirm-button")
    private SelenideElement cookiesButton;

    //локатор 1-го выпадающего списка
    @FindBy(how = How.ID,using = "accordion__heading-0")
    private SelenideElement dropDownListElement1;
    //локатор 2-го выпадающего списка
    @FindBy(how = How.ID,using = "accordion__heading-1")
    private SelenideElement dropDownListElement2;
    //локатор 3-го выпадающего списка
    @FindBy(how = How.ID,using = "accordion__heading-2")
    private SelenideElement dropDownListElement3;
    //локатор 4-го выпадающего списка
    @FindBy(how = How.ID,using = "accordion__heading-3")
    private SelenideElement dropDownListElement4;
    //локатор 5-го выпадающего списка
    @FindBy(how = How.ID,using = "accordion__heading-4")
    private SelenideElement dropDownListElement5;
    //локатор 6-го выпадающего списка
    @FindBy(how = How.ID,using = "accordion__heading-5")
    private SelenideElement dropDownListElement6;
    //локатор 7-го выпадающего списка
    @FindBy(how = How.ID,using = "accordion__heading-6")
    private SelenideElement dropDownListElement7;
    //локатор 8-го выпадающего списка
    @FindBy(how = How.ID,using = "accordion__heading-7")
    private SelenideElement dropDownListElement8;


    //локатор текста после клика на 1-й выпадающий список
    @FindBy(how = How.ID,using = "accordion__panel-0")
    private SelenideElement textDropDownListElement1;
    //локатор текста после клика на 2-й выпадающий список
    @FindBy(how = How.ID,using = "accordion__panel-1")
    private SelenideElement textDropDownListElement2;
    //локатор текста после клика на 3-й выпадающий список
    @FindBy(how = How.ID,using = "accordion__panel-2")
    private SelenideElement textDropDownListElement3;
    //локатор текста после клика на 4-й выпадающий список
    @FindBy(how = How.ID,using = "accordion__panel-3")
    private SelenideElement textDropDownListElement4;
    //локатор текста после клика на 5-й выпадающий список
    @FindBy(how = How.ID,using = "accordion__panel-4")
    private SelenideElement textDropDownListElement5;
    //локатор текста после клика на 6-й выпадающий список
    @FindBy(how = How.ID,using = "accordion__panel-5")
    private SelenideElement textDropDownListElement6;
    //локатор текста после клика на 7-й выпадающий список
    @FindBy(how = How.ID,using = "accordion__panel-6")
    private SelenideElement textDropDownListElement7;
    //локатор текста после клика на 8-й выпадающий список
    @FindBy(how = How.ID,using = "accordion__panel-7")
    private SelenideElement textDropDownListElement8;


    //метод клика по 1-му выпадающему списку
    public void clickInDropDownList1() {
        dropDownListElement1.click();
    }
    //метод клика по 2-му выпадающему списку
    public void clickInDropDownList2() {
        dropDownListElement2.click();
    }
    //метод клика по 3-му выпадающему списку
    public void clickInDropDownList3() {
        dropDownListElement3.click();
    }
    //метод клика по 4-му выпадающему списку
    public void clickInDropDownList4() {
        dropDownListElement4.click();
    }
    //метод клика по 5-му выпадающему списку
    public void clickInDropDownList5() {
        dropDownListElement5.click();
    }
    //метод клика по 6-му выпадающему списку
    public void clickInDropDownList6() {
        dropDownListElement6.click();
    }
    //метод клика по 7-му выпадающему списку
    public void clickInDropDownList7() {
        dropDownListElement7.click();
    }
    //метод клика по 8-му выпадающему списку
    public void clickInDropDownList8() {
        dropDownListElement8.click();
    }

    //метод клика по верхней кнопке "Заказать"
    public void clickTopOrderButton() {
        topOrderButton.click();
    }
    //метод клика по нижней кнопке "Заказать"
    public void clickBottomOrderButton() {
        bottomOrderButton.click();
    }

    //метод проверящий текст в 1-м открывшемся выпадающем списке
    public void shouldHaveTextDropDownListElement1() {
        textDropDownListElement1.shouldHave(exactText("Сутки — 400 рублей. Оплата курьеру — наличными или картой."));
    }
    //метод проверящий текст в 2-м открывшемся выпадающем списке
    public void shouldHaveTextDropDownListElement2() {
        textDropDownListElement2.shouldHave(exactText("Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим."));
    }
    //метод проверящий текст в 3-м открывшемся выпадающем списке
    public void shouldHaveTextDropDownListElement3() {
        textDropDownListElement3.shouldHave(exactText("Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30."));
    }
    //метод проверящий текст в 4-м открывшемся выпадающем списке
    public void shouldHaveTextDropDownListElement4() {
        textDropDownListElement4.shouldHave(exactText("Только начиная с завтрашнего дня. Но скоро станем расторопнее."));
    }
    //метод проверящий текст в 5-м открывшемся выпадающем списке
    public void shouldHaveTextDropDownListElement5() {
        textDropDownListElement5.shouldHave(exactText("Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010."));
    }
    //метод проверящий текст в 6-м открывшемся выпадающем списке
    public void shouldHaveTextDropDownListElement6() {
        textDropDownListElement6.shouldHave(exactText("Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится."));
    }
    //метод проверящий текст в 7-м открывшемся выпадающем списке
    public void shouldHaveTextDropDownListElement7() {
        textDropDownListElement7.shouldHave(exactText("Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои."));
    }
    //метод проверящий текст в 8-м открывшемся выпадающем списке
    public void shouldHaveTextDropDownListElement8() {
        textDropDownListElement8.shouldHave(exactText("Да, обязательно. Всем самокатов! И Москве, и Московской области."));
    }

    //метод: объединяет клик по 1-му выпадающему списку и проверка текста в 1-м элементе
    public void clickDropDownListAndAssertText1() {
        clickInDropDownList1();
        shouldHaveTextDropDownListElement1();
    }
    //метод: объединяет клик по 2-му выпадающему списку и проверка текста в 2-м элементе
    public void clickDropDownListAndAssertText2() {
        clickInDropDownList2();
        shouldHaveTextDropDownListElement2();
    }
    //метод: объединяет клик по 3-му выпадающему списку и проверка текста в 3-м элементе
    public void clickDropDownListAndAssertText3() {
        clickInDropDownList3();
        shouldHaveTextDropDownListElement3();
    }
    //метод: объединяет клик по 4-му выпадающему списку и проверка текста в 4-м элементе
    public void clickDropDownListAndAssertText4() {
        clickInDropDownList4();
        shouldHaveTextDropDownListElement4();
    }
    //метод: объединяет клик по 5-му выпадающему списку и проверка текста в 5-м элементе
    public void clickDropDownListAndAssertText5() {
        clickInDropDownList5();
        shouldHaveTextDropDownListElement5();
    }
    //метод: объединяет клик по 6-му выпадающему списку и проверка текста в 6-м элементе
    public void clickDropDownListAndAssertText6() {
        clickInDropDownList6();
        shouldHaveTextDropDownListElement6();
    }
    //метод: объединяет клик по 7-му выпадающему списку и проверка текста в 7-м элементе
    public void clickDropDownListAndAssertText7() {
        clickInDropDownList7();
        shouldHaveTextDropDownListElement7();
    }
    //метод: объединяет клик по 8-му выпадающему списку и проверка текста в 8-м элементе
    public void clickDropDownListAndAssertText8() {
        clickInDropDownList8();
        shouldHaveTextDropDownListElement8();
    }

    //метод клика по кнопке куков
    public void clickСookiesButton () {
        if (cookiesButton.isDisplayed()) {
            cookiesButton.click();
        }
    }
}