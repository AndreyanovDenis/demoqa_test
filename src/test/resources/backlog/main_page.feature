# language: ru
@visual
Функция: Наличие текста на странице

  @success
  Сценарий: Открыта страница Student Registration Form
    Дано  открыта страница Practice Form
    Тогда есть баннер "Practice Form"
    Тогда есть заголовок "Student Registration Form"
    Тогда есть текст "Name"
    Тогда есть текст "Email"
    Тогда есть текст "Gender"
    Тогда есть текст "Mobile(10 Digits)"
    Тогда есть текст "Date of Birth"
    Тогда есть текст "Subjects"
    Тогда есть текст "Hobbies"
    Тогда есть текст "Picture"
    Тогда есть текст "Current Address"
    Тогда есть текст "State and City"
    Тогда есть кнопка Submit
    Тогда есть поле "firstName"
    Тогда есть поле "lastName"
    Тогда есть поле "userEmail"
    Тогда есть радио-кнопка "Male"
    Тогда есть радио-кнопка "Female"
    Тогда есть радио-кнопка "Other"
    Тогда есть поле "userNumber"
    Тогда есть поле "dateOfBirthInput"
    Тогда есть поле "subjectsContainer"
    Тогда есть чекбокс "Sports"
    Тогда есть чекбокс "Reading"
    Тогда есть чекбокс "Music"
    Тогда есть кнопка загрузки файлов
    Тогда есть поле "currentAddress"
#    Тогда есть выпадающий список
#    |NCR          |
#    |Uttar Pradesh|
#    |Haryana      |
#    |Rajasthan    |

#    Тогда есть поле ""
#    Тогда есть поле ""

  @success
  Сценарий: Не заполенено ни одно поле
    Дано открыта страница Practice Form
    Тогда пользователь нажимает кнопку Submit
