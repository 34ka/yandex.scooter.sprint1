package ru.praktikumservices.qamesto.pageobject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.sleep;

public class OrderPageScooter {

    //локатор поля ввода имени
    @FindBy(how = How.XPATH,using = ".//input[@placeholder='* Имя']")
    private SelenideElement nameField;
    //локатор поля ввода фамилии
    @FindBy(how = How.XPATH,using = ".//input[@placeholder='* Фамилия']")
    private SelenideElement surnameField;
    //локатор поля ввода адреса
    @FindBy(how = How.XPATH,using = ".//input[@placeholder='* Адрес: куда привезти заказ']")
    private SelenideElement addressField;
    //локатор поля станции метро
    @FindBy(how = How.CLASS_NAME,using = "select-search__input")
    private SelenideElement metroStationField;
    //локатор выбора станций метро
    @FindBy(how = How.CLASS_NAME,using = "select-search")
    private SelenideElement metroStationChoice;
    //локатор поля номера телефона
    @FindBy(how = How.XPATH,using = ".//input[@placeholder='* Телефон: на него позвонит курьер']")
    private SelenideElement phoneNumberField;
    //локатор кнопки "Далее"
    @FindBy(how = How.XPATH,using = ".//button[text()='Далее']")
    private SelenideElement nextButton;

    //локатор поля даты доставки
    @FindBy(how = How.XPATH,using = ".//input[@placeholder='* Когда привезти самокат']")
    private SelenideElement deliveryDateField;
    //локатор поля срок аренды
    @FindBy(how = How.CLASS_NAME,using = "Dropdown-placeholder")
    private SelenideElement rentalPeriodField;
    //локатор выбора срока аренды
    @FindBy(how = How.CLASS_NAME,using = "Dropdown-menu")
    private SelenideElement rentalPeriodChoice;
    //локатор выбора чёрного цвета
    @FindBy(how = How.ID,using = "black")
    private SelenideElement blackColor;
    //локатор выбора серого цвета
    @FindBy(how = How.ID,using = "grey")
    private SelenideElement greyColor;
    //локатор поля комментарий для курьера
    @FindBy(how = How.XPATH,using = ".//input[@placeholder='Комментарий для курьера']")
    private SelenideElement commentForCourierField;

    //локатор кнопки "Заказать"
    @FindBy(how = How.XPATH,using = ".//div[@class='Order_Buttons__1xGrp']/button[text()='Заказать']")
    private SelenideElement orderButton;
    //локатор кнопки "Назад"
    @FindBy(how = How.XPATH,using = ".//div[@class='Order_Buttons__1xGrp']/button[text()='Назад']")
    private SelenideElement backButton;
    //локатор кнопки "Да"
    @FindBy(how = How.XPATH,using = ".//button[text()='Да']")
    private SelenideElement yesButton;
    //локатор заголовок окна "Заказ оформлен"
    @FindBy(how = How.CLASS_NAME,using = "Order_ModalHeader__3FDaJ")
    private SelenideElement windowTitle;
    //локатор подзаголовка окна "Заказ оформлен"
    @FindBy(how = How.CLASS_NAME,using = "Order_Text__2broi")
    private SelenideElement windowSubtitle;
    //локатор кнопки "Посмотреть статус"
    @FindBy(how = How.XPATH,using = "//button[text()='Посмотреть статус']")
    private SelenideElement lookAtStatusButton;

    //метод заполнения поля ввода имени
    public void setName(String name) {
        nameField.setValue(name);
    }
    //метод заполнения поля ввода фамилии
    public void setSurname(String surname) {
        surnameField.setValue(surname);
    }
    //метод заполнения поля ввода адреса
    public void setAddress(String address) {
        addressField.setValue(address);
    }
    //метод клика по полю станции метро
    public void clickMetroStationField() {
        metroStationField.click();
    }
    //метод выбора станций метро
    public void setMetroStationChoice(String station) {
        metroStationChoice.find(byText(station)).click();
    }
    //метод заполнения поля номера телефона
    public void setPhoneNumberField(String phoneNumber) {
        phoneNumberField.setValue(phoneNumber);
    }
    //метод клика по кнопке "Далее"
    public void clickNextButton() {
        nextButton.click();
    }
    //метод заполнения формы объединяет: ввод имени, фамилии, адреса, выбора станции метро, ввода номера телефона и клик по кнопке "Далее"
    public void successfulFillFormForWhom(String name, String surname, String address, String station, String phoneNumber){
        setName(name);
        setSurname(surname);
        setAddress(address);
        clickMetroStationField();
        setMetroStationChoice(station);
        setPhoneNumberField(phoneNumber);
        clickNextButton();
    }

    //метод заполнения даты доставки
    public void setDeliveryDateField(String deliveryDate) {
        deliveryDateField.setValue(deliveryDate + "\n");
    }
    //метод клика по полю срок аренды
    public void clickRentalPeriodField() {
        rentalPeriodField.click();
    }
    //метод выбора срока аренды
    public void setRentalPeriodChoice(String rentalPeriod) {
        rentalPeriodChoice.find(byText(rentalPeriod)).click();
    }
    //метод клика по полю c чёрным цветом
    public void clickBlackColor() {
        blackColor.click();
    }
    //метод клика по полю c серым цветом
    public void clickGreyColor() {
        greyColor.click();
    }
    //метод заполнения поля комментарий для курьера
    public void setCommentForCourierField(String commentForCourier) {
        commentForCourierField.setValue(commentForCourier);
    }
    //метод клика по кнопке "Заказать"
    public void clickOrderButton() {
        orderButton.click();
    }
    //метод клика по кнопке "Назад"
    public void clickBackButton() {
        backButton.click();
    }
    //метод заполнения формы объединяет: заполнение поля "Дата доставки", клика и выбора срока аренды, выбора цвета,
    //заполнение поля "Комментарий для курьера", нажатия кнопки "Заказать", нажатия кнопки "Да",
    // проверка заголовка "Заказ оформлен", клик на кнопку "Посмотреть заказ"
    public void successfulFillFormAboutRent(String deliveryDate, String rentalPeriod, String commentForCourier){
        setDeliveryDateField(deliveryDate);
        clickRentalPeriodField();
        setRentalPeriodChoice(rentalPeriod);
        clickBlackColor();
        setCommentForCourierField(commentForCourier);
        clickOrderButton();
        clickYesButton();
        shouldHaveWindowTitle();
        shouldHaveNumberOrder();
        clickLookAtStatusButton();
    }

    //метод клика по кнопке "Да"
    public void clickYesButton() {
        yesButton.click();
    }
    //метод проверки наличия заголовка с текстом
    public void shouldHaveWindowTitle() {
        windowTitle.shouldHave(text("Заказ оформлен"));
        sleep(200);
    }
    //метод проверки наличия номера заказа
    public void shouldHaveNumberOrder() {
        //Получить текст, найти в нём цифры, цифры преобразовать в строку, удостовериться, что цифры есть.
        String windowText = windowSubtitle.getText();
        Pattern pattern = Pattern.compile("\\d+");
        String text = windowText; //пример строки
        Matcher matcher = pattern.matcher(text);
        int start = 0;
        while (matcher.find(start)) {
            String value = text.substring(matcher.start(), matcher.end());
            int result = Integer.parseInt(value);
            start = matcher.end();
            //преобразование числа в строку для сравнения
            String stringResult = String.valueOf(result);
            //assert
            windowSubtitle.shouldHave(text(stringResult));
        }
    }
    //метод клика по кнопке "Посмотреть статус"
    public void clickLookAtStatusButton() {
        lookAtStatusButton.click();
    }
}
