package testsWithoutPO;

import com.codeborne.selenide.Configuration;
import org.junit.Before;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class TestsWithoutPO {

    @Before
    public void setup() {
        //открыть браузер в максимальном разрешении
        Configuration.startMaximized = true;
        Configuration.browser = "opera";
    }

    //@Test
    public void one() {

        //перейти на страницу тестового стенда
        open("https://qa-scooter.praktikum-services.ru/");

        //закрыть окно с куками
        $(byId("rcc-confirm-button")).click();
        //нажать на 1-й выпадающий список
        $(byId("accordion__heading-0")).click();
        //проверить на наличие текста
        $(byId("accordion__panel-0")).shouldHave(exactText("Сутки — 400 рублей. Оплата курьеру — наличными или картой."));
        //нажать на 2-й выпадающий список
        $(byId("accordion__heading-1")).click();
        //проверить на наличие текста
        $(byId("accordion__panel-1")).shouldHave(exactText("Пока что у нас так: один заказ — один самокат.Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим."));
        //нажать на 3-й выпадающий список
        $(byId("accordion__heading-2")).click();
        //проверить на наличие текста
        $(byId("accordion__panel-2")).shouldHave(exactText("Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30."));
        //нажать на 4-й выпадающий список
        $(byId("accordion__heading-3")).click();
        //проверить на наличие текста
        $(byId("accordion__panel-3")).shouldHave(exactText("Только начиная с завтрашнего дня. Но скоро станем расторопнее."));
        //нажать на 5-й выпадающий список
        $(byId("accordion__heading-4")).click();
        ///проверить на наличие текста
        $(byId("accordion__panel-4")).shouldHave(exactText("Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010."));
        //нажать на 6-й выпадающий список
        $(byId("accordion__heading-5")).click();
        //проверить на наличие текста
        $(byId("accordion__panel-5")).shouldHave(exactText("Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится."));
        //нажать на 7-й выпадающий список
        $(byId("accordion__heading-6")).click();
        //проверить на наличие текста
        $(byId("accordion__panel-6")).shouldHave(exactText("Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои."));
        //нажать на 8-й выпадающий список
        $(byId("accordion__heading-7")).click();
        //проверить на наличие текста
        $(byId("accordion__panel-7")).shouldHave(exactText("Да, обязательно. Всем самокатов! И Москве, и Московской области."));
    }
    //@Test
    public void two() {

        //перейти на страницу тестового стенда
        open("https://qa-scooter.praktikum-services.ru/");
        //закрыть окно с куками
        $(byId("rcc-confirm-button")).click();

        //нажать на верхнюю кнопку "Заказать"
        $(byXpath(".//div[@class='Header_Nav__AGCXC']/button[text()='Заказать']")).click();

        //заполнить форму 1
        $(byXpath(".//input[@placeholder='* Имя']")).setValue("Василий");
        $(byXpath(".//input[@placeholder='* Фамилия']")).setValue("Петров");
        $(byXpath(".//input[@placeholder='* Адрес: куда привезти заказ']")).setValue("Москва");
        $(byClassName("select-search__input")).click();
        $(byClassName("select-search")).find(byText("Красные Ворота")).click();
        $(byXpath(".//input[@placeholder='* Телефон: на него позвонит курьер']")).setValue("11111111111");
        $(byXpath(".//button[text()='Далее']")).click();

        //заполнить форму 2
        $(byXpath(".//input[@placeholder='* Когда привезти самокат']")).setValue("10.12.2021" + "\n");
        $(byClassName("Dropdown-placeholder")).click();
        $(byClassName("Dropdown-menu")).find(byText("шестеро суток")).click();
        $(byId("black")).click();
        $(byXpath(".//input[@placeholder='Комментарий для курьера']")).setValue("-");
        $(byXpath(".//div[@class='Order_Buttons__1xGrp']/button[text()='Заказать']")).click();

        $(byXpath(".//button[text()='Да']")).click();

        //assert
        $(byClassName("Order_ModalHeader__3FDaJ")).shouldHave(text("Заказ оформлен"));
        sleep(200);
        //Получить текст, найти в нём цифры, цифры преобразовать в строку, удостовриться, что цифры есть.
        String windowText = $(byClassName("Order_Text__2broi")).getText();
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
            $(byClassName("Order_Text__2broi")).shouldHave(text(stringResult));
        }
        $(byXpath(".//button[text()='Посмотреть статус']")).click();
    }

    //@Test
    public void three() {

        //перейти на страницу тестового стенда
        open("https://qa-scooter.praktikum-services.ru/");
        //закрыть окно с куками
        $(byId("rcc-confirm-button")).click();

        //нажать на нижнюю кнопку "Заказать"
        $(byXpath(".//div[@class='Home_FinishButton__1_cWm']/button[text()='Заказать']")).click();

        //заполнить форму 1
        $(byXpath(".//input[@placeholder='* Имя']")).setValue("Олег");
        $(byXpath(".//input[@placeholder='* Фамилия']")).setValue("Анатольев");
        $(byXpath(".//input[@placeholder='* Адрес: куда привезти заказ']")).setValue("Москва");
        $(byClassName("select-search__input")).click();
        $(byClassName("select-search")).find(byText("Сокольники")).click();
        $(byXpath(".//input[@placeholder='* Телефон: на него позвонит курьер']")).setValue("12345612345");
        $(byXpath(".//button[text()='Далее']")).click();

        //заполнить форму 2
        $(byXpath(".//input[@placeholder='* Когда привезти самокат']")).setValue("23.10.2021" + "\n");
        $(byClassName("Dropdown-placeholder")).click();
        $(byClassName("Dropdown-menu")).find(byText("сутки")).click();
        $(byId("grey")).click();
        $(byXpath(".//input[@placeholder='Комментарий для курьера']")).setValue("Позвоните, пожалуйста, за 30 минут. Не хочу опоздать");
        $(byXpath(".//div[@class='Order_Buttons__1xGrp']/button[text()='Заказать']")).click();

        //продолжить процесс заказа
        $(byXpath(".//button[text()='Да']")).click();

        //assert
        $(byClassName("Order_ModalHeader__3FDaJ")).shouldHave(text("Заказ оформлен"));
        sleep(200);
        //Получить текст, найти в нём цифры, цифры преобразовать в строку, удостовериться, что цифры есть.
        String windowText = $(byClassName("Order_Text__2broi")).getText();
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(windowText);
        int start = 0;
        while (matcher.find(start)) {
            String value = windowText.substring(matcher.start(), matcher.end());
            int result = Integer.parseInt(value);
            start = matcher.end();
            //преобразование числа в строку для сравнения
            String stringResult = String.valueOf(result);
            //assert
            $(byClassName("Order_Text__2broi")).shouldHave(text(stringResult));
        }
        $(byXpath("//button[text()='Посмотреть статус']")).click();
    }
}