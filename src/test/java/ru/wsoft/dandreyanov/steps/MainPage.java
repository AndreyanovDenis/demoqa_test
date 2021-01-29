package ru.wsoft.dandreyanov.steps;

import com.codeborne.selenide.Condition;
import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.Тогда;
import org.openqa.selenium.By;

import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class MainPage {


    @Дано("открыта страница Practice Form")
    public void открытаСтраницаPracticeForm() {
        open("https://demoqa.com/automation-practice-form");
    }

    @Тогда("есть баннер {string}")
    public void естьБаннерPracticeForm(String name) {
        $(By.className("body-height")).shouldHave(Condition.text(name));
    }

    @Тогда("есть заголовок {string}")
    public void естьЗаголовок(String title) {
        $(By.className("practice-form-wrapper")).shouldBe(Condition.visible);
        $(By.className("practice-form-wrapper")).shouldHave(Condition.text(title));
    }

    @Тогда("есть текст {string}")
    public void естьТекст(String text) {
        $(By.className("practice-form-wrapper")).shouldHave(Condition.text(text));
    }

    @Тогда("есть кнопка Submit")
    public void естьКнопкаSubmit() {
        $(By.id("submit")).shouldBe(Condition.visible);
    }

    @Тогда("есть поле {string}")
    public void естьПоле(String name) {
        $(By.id(name)).shouldBe(Condition.visible);
    }

    @Тогда("есть радио-кнопка {string}")
    public void естьРадиоКнопка(String name) {
        $(By.id("genterWrapper")).shouldHave(Condition.text(name));
    }

    @Тогда("есть чекбокс {string}")
    public void естьЧекбокс(String name) {
        $(By.id("hobbiesWrapper")).shouldHave(Condition.text(name));
    }

    @Тогда("есть кнопка загрузки файлов")
    public void естьКнопкаЗагрузкиФайлов() {
        $(By.id("uploadPicture")).shouldHave(Condition.visible);
    }

//    @Тогда("есть выпадающий список")
//    public void естьВыпадающийСписок(List<String> string) {
//        $(By.id("state")).shouldHave(Condition.text(string.toArray(new String[0])));
//    }


}

