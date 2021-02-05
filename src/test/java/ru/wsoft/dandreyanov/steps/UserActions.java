package ru.wsoft.dandreyanov.steps;

import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;
import org.openqa.selenium.By;

import java.io.File;

import static com.codeborne.selenide.CollectionCondition.texts;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.textCaseSensitive;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class UserActions {
    @Тогда("пользователь нажимает кнопку Submit")
    public void пользовательНажимаетКнопкуSubmit() {
        $(By.id("submit")).click();
    }

    @Тогда("пользователь скроллит вниз")
    public void пользовательСкроллитВниз() {
        $(By.id("uploadPicture")).scrollTo();
    }

    @Тогда("поле {string} красное")
    public void полеКрасное(String name) {
//        $(By.id(name)).shouldBe(Condition.have());
    }

    @Тогда("пользователь вводит {string} в поле {string}")
    public void пользовательВводитВПоле(String text, String name) {
        $(By.id(name)).setValue(text);
    }

    @Тогда("пользователь нажимает {string} радио-кнопку")
    public void пользовательНажимаетРадиоКнопку(String name) {
        $(By.xpath("//label[contains(.,'"+name+"')]")).click();
    }

    @Тогда("пользователь кликает на календарь")
    public void пользовательКликаетНаКалендарь() {
        $(By.id("dateOfBirthInput")).click();
    }

    @Тогда("пользователь выбирает {string} в выборе месяца календаря")
    public void пользовательВыбираетВВыбореМесяцаКалендаря(String mounth) {
        $(By.cssSelector("div.body-height:nth-child(2) div.container.playgound-body div.row div.col-12.mt-4.col-md-6:nth-child(2) div.practice-form-wrapper div.mt-2.row:nth-child(5) div.col-md-9.col-sm-12 div.react-datepicker__tab-loop div.react-datepicker-popper div.react-datepicker div.react-datepicker__month-container:nth-child(4) div.react-datepicker__header div.react-datepicker__header__dropdown.react-datepicker__header__dropdown--select div.react-datepicker__month-dropdown-container.react-datepicker__month-dropdown-container--select > select.react-datepicker__month-select")).click();
        $(By.cssSelector("div.body-height:nth-child(2) div.container.playgound-body div.row div.col-12.mt-4.col-md-6:nth-child(2) div.practice-form-wrapper div.mt-2.row:nth-child(5) div.col-md-9.col-sm-12 div.react-datepicker__tab-loop div.react-datepicker-popper div.react-datepicker div.react-datepicker__month-container:nth-child(4) div.react-datepicker__header div.react-datepicker__header__dropdown.react-datepicker__header__dropdown--select div.react-datepicker__month-dropdown-container.react-datepicker__month-dropdown-container--select > select.react-datepicker__month-select")).selectOption(mounth);
    }

    @Тогда("пользователь выбирает {string} в выборе года календаря")
    public void пользовательВыбираетВВыбореГодаКалендаря(String year) {
        $(By.cssSelector("div.body-height:nth-child(2) div.container.playgound-body div.row div.col-12.mt-4.col-md-6:nth-child(2) div.practice-form-wrapper div.mt-2.row:nth-child(5) div.col-md-9.col-sm-12 div.react-datepicker__tab-loop div.react-datepicker-popper div.react-datepicker div.react-datepicker__month-container:nth-child(4) div.react-datepicker__header div.react-datepicker__header__dropdown.react-datepicker__header__dropdown--select div.react-datepicker__year-dropdown-container.react-datepicker__year-dropdown-container--select > select.react-datepicker__year-select")).click();
        $(By.cssSelector("div.body-height:nth-child(2) div.container.playgound-body div.row div.col-12.mt-4.col-md-6:nth-child(2) div.practice-form-wrapper div.mt-2.row:nth-child(5) div.col-md-9.col-sm-12 div.react-datepicker__tab-loop div.react-datepicker-popper div.react-datepicker div.react-datepicker__month-container:nth-child(4) div.react-datepicker__header div.react-datepicker__header__dropdown.react-datepicker__header__dropdown--select div.react-datepicker__year-dropdown-container.react-datepicker__year-dropdown-container--select > select.react-datepicker__year-select")).selectOption(year);
    }

    @Тогда("пользователь кликает число {string} в календаре")
    public void пользовательКликаетЧислоВКалендаре(String day) {
        $(By.cssSelector(".react-datepicker__day--0"+day+"")).click();
    }

    @Тогда("пользователь кликает {string} чекбокс")
    public void пользовательКликаетЧекбокс(String check) {
        $$(By.id("hobbiesWrapper")).findBy(text(check)).click();
    }

    @Тогда("пользователь кликает на поле {string}")
    public void пользовательКликаетНаПоле(String name) {
        $(By.xpath("//div[@id='"+name+"']/div/div")).click();
    }

    @Тогда("пользователь выбирает {string} в поле subjects")
    public void пользовательВыбираетВПолеSubjects(String option) {
        $(By.xpath("//input[@id='subjectsInput']")).setValue(option);
        $(By.id("react-select-2-option-0")).click();
    }

    @Тогда("пользователь кликает на выбор месяца")
    public void пользовательКликаетНаВыборМесяца() {
    }

    @Тогда("пользователь вводит {string} в поле темы")
    public void пользовательВводитВПолеТемы(String text) {
        $(By.xpath("//input[@id='subjectsInput']")).setValue(text);
    }

    @Тогда("пользователь загружает файл {string}")
    public void пользовательЗагружаетФайл(String attach) {
        File file = new File("src/"+attach+"");
        $(By.cssSelector("#uploadPicture")).uploadFile(file);
    }

    @Тогда("пользователь выбирает NCR в поле state")
    public void пользовательВыбираетВПолеState() {
        $(By.xpath("//div[contains(text(),'Select State')]")).click();
        $(By.xpath("//div[@id='react-select-3-option-0']")).click();
    }

    @Когда("пользователь выбирает Noida в поле city")
    public void пользовательВыбираетNoidaВПолеCity() {
        $(By.xpath("//div[contains(text(),'Select City')]")).click();
        $(By.xpath("//div[@id='react-select-4-option-2']")).click();
    }

    @Тогда("пользователь видит надпись Thanks for submitting the form")
    public void пользовательВидитНадписьThanksForSubmittingTheForm() {
        $(By.id("example-modal-sizes-title-lg")).shouldHave(textCaseSensitive("Thanks for submitting the form"));
    }

    @Тогда("в строке {string} есть запись {string}")
    public void вСтрокеЕстьЗапись(String tr, String result) {
        $$(".table-responsive tr").filterBy(text(tr)).shouldHave(texts(result));
    }

    @Когда("пользователь нажимает кнопку Close")
    public void пользовательНажимаетКнопкуClose() {
        $(By.id("closeLargeModal")).click();
    }
}
