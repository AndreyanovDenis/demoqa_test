package ru.wsoft.dandreyanov.steps;

import com.codeborne.selenide.Condition;
import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;

import static com.codeborne.selenide.CollectionCondition.exactTexts;
import static com.codeborne.selenide.Selenide.*;

public class GitHubActions {
    @Когда("пользователь вводит {string} в поле поиска")
    public void пользовательВводитВПолеПоиска(String text) {
        $("[name=q]").setValue(text).pressEnter();
    }

    @Тогда("пользователь выбирает первый результат поиска")
    public void пользовательВыбираетПервыйРезультатПоиска() {
        $$("ul.repo-list li").first().$("a").click();
    }

    @Когда("пользователь нажимает {string}")
    public void пользовательНажимает(String button) {
        $x("//span[contains(text(),'"+button+"')]").click();
    }

    @Тогда("пользователь видит надпись SoftAssertions")
    public void пользовательВидитНадписьSoftAssertions() {
        $x("//a[contains(text(),'Soft assertions')]").shouldHave(Condition.visible).click();
    }

    @Тогда("пользователь видит текст {string}")
    public void пользовательВидитТекст(String sample) {
        $(".highlight:nth-child(9) > pre").shouldHave(Condition.textCaseSensitive(sample));
    }

    @Когда("пользователь перетаскивает А на место В")
    public void пользовательПеретаскиваетАНаМестоВ() {
        $x("//div[@id='column-a']").dragAndDropTo($x("//div[@id='column-b']"));
    }

    @Тогда("пользователь видит, что прямоугольники поменялись местами")
    public void пользовательВидитЧтоПрямоугольникиПоменялисьМестами() {
        $$x("//div[@id='columns']").shouldHave(exactTexts("B A"));
    }
}
