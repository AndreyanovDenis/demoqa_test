# language: ru
@functional
Функция: Smoke-тест

  @smoke
  Структура сценария: Заполнение всех полей и отправка анкеты
    Дано открыта страница Practice Form
    Когда пользователь вводит <firstName> в поле "firstName"
    Когда пользователь вводит <lastName> в поле "lastName"
    Когда пользователь вводит <email> в поле "userEmail"
    Когда пользователь нажимает <gender> радио-кнопку
    Когда пользователь вводит <phone> в поле "userNumber"
    Когда пользователь кликает на календарь
    Когда пользователь выбирает <month> в выборе месяца календаря
    Когда пользователь выбирает <year> в выборе года календаря
    Когда пользователь кликает число <day> в календаре
    Когда пользователь кликает на поле "subjectsContainer"
    Когда пользователь выбирает <subject> в поле subjects
    Когда пользователь кликает <check> чекбокс
    Когда пользователь загружает файл <attach>
    Когда пользователь вводит <address> в поле "currentAddress"
    Когда пользователь выбирает NCR в поле state
    Когда пользователь выбирает Noida в поле city
    Когда пользователь нажимает кнопку Submit
    Тогда пользователь видит надпись Thanks for submitting the form
    Тогда в строке "Student Name" есть запись "Denis Andreyanov"
    Тогда в строке "Student Email" есть запись <email>
    Тогда в строке "Gender" есть запись <gender>
    Тогда в строке "Mobile" есть запись <phone>
    Тогда в строке "Date of Birth" есть запись "12 December,1992"
    Тогда в строке "Subjects" есть запись <subject>
    Тогда в строке "Hobbies" есть запись <check>
    Тогда в строке "Picture" есть запись <attach>
    Тогда в строке "Address" есть запись <address>
    Тогда в строке "State and City" есть запись "NCR Noida"
    Когда пользователь нажимает кнопку Close
    Примеры:
      | firstName    | lastName        | email                          | gender | phone        | month      | year   | day  |  subject   | check     | attach    | address                |
      | "Denis"      | "Andreyanov"    | "andreyanov.denis92@gmail.com" | "Male" | "9190895613" | "December" | "1992" | "12" |  "English" | "Reading" | "mem.jpg" | "На деревню дедушке"   |