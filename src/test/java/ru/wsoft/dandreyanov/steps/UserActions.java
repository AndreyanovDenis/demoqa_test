package ru.wsoft.dandreyanov.steps;

import com.codeborne.selenide.Condition;
import io.cucumber.java.ru.Тогда;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
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
        $$(By.id("genterWrapper")).findBy(text(name)).click();
    }

    @Тогда("пользователь кликает на календарь")
    public void пользовательКликаетНаКалендарь() {
        $(By.id("dateOfBirthInput")).click();
    }

    @Тогда("пользователь выбирает {string} в выборе месяца календаря")
    public void пользовательВыбираетВВыбореМесяцаКалендаря(String mounth) {
        $(By.className("react-datepicker__month-select")).selectOption(mounth);
    }

    @Тогда("пользователь выбирает {string} в выборе года календаря")
    public void пользовательВыбираетВВыбореГодаКалендаря(String year) {
        $(By.className("react-datepicker__year-select")).selectOption(year);
    }

    @Тогда("пользователь кликает число {string} в календаре")
    public void пользовательКликаетЧислоВКалендаре(String day) {
        $$(By.className("react-datepicker__week")).findBy(text(day));
    }

    @Тогда("пользователь кликает {string} чекбокс")
    public void пользовательКликаетЧекбокс(String check) {
        $$(By.id("hobbiesWrapper")).findBy(text(check));
    }

    @Тогда("пользователь кликает на поле {string}")
    public void пользовательКликаетНаПоле(String name) {
        $(By.id(name)).click();
        $(By.id(name)).sendKeys("E");
    }

    @Тогда("пользователь выбирает {string} в поле subjects")
    public void пользовательВыбираетВПолеSubjects(String option) {
        $(By.id("subjectsContainer")).selectOption(option);
    }
}
