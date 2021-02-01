# language: ru
@functional
Функция: Smoke-тест

  @smoke
  Структура сценария: Заполнение всех полей и отправка анкеты
    Дано открыта страница Practice Form
    Тогда пользователь вводит <text> в поле <first name>
    Тогда пользователь вводит <text1> в поле <last name>
    Тогда пользователь вводит <text2> в поле <email>
    Тогда пользователь нажимает <gender> радио-кнопку
    Тогда пользователь вводит <text3> в поле <mobile>
    Тогда пользователь кликает на календарь
    Тогда пользователь выбирает <mounth> в выборе месяца календаря
    Тогда пользователь выбирает <year> в выборе года календаря
    Тогда пользователь кликает число <day> в календаре
    Тогда пользователь кликает на поле <name5>
    Тогда пользователь выбирает <subject> в поле subjects
    Тогда пользователь кликает <check> чекбокс
    Тогда пользователь кликает <check1> чекбокс
    Тогда пользователь загружает файл <attach>
    Тогда пользователь вводит <text4> в поле <curent address>
    Тогда пользователь выбирает NCR в поле state
    Тогда пользователь выбирает Noida в поле city
    Тогда пользователь нажимает кнопку Submit
    Примеры:
      | text    | first name  | text1        | last name  | text2                          | email       | gender | text3        | mobile       | mounth     | year   | day  | name5               | subject   | check     | check1  | attach    | text4                | curent address   |
      | "Denis" | "firstName" | "Andreyanov" | "lastName" | "andreyanov.denis92@gmail.com" | "userEmail" | "Male" | "9190895613" | "userNumber" | "December" | "1992" | "12" | "subjectsContainer" | "English" | "Reading" | "Music" | "mem.jpg" | "На деревню дедушке" | "currentAddress" |