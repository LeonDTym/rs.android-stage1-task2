# Task 2
:mortar_board: :mortar_board: Task 2 состоит из шести задач. Все заготовки задач находятся в корне проекта в папке *src/main/kotlin*. В каждой заготовке вам дан класс с открытым методом, в который вам нужно написать код для решения поставленной задачи. Все - как и для Task 1.

<img alt="structure_of_tasks" src="/images/img1.PNG" />

Тесты находятся в папке *src/test/kotlin*. Тесты можно запускать различными способами. Например, выполнить таск Gradle: *Gradle -> Tasks -> verification -> test*. Тогда прогонятся все unit-тесты сразу:

<img alt="launch test via Gradle" src="/images/img_5.PNG" />

Или открыть класс с тестом и нажать на зелёный треугольник рядом с объявлением класса. Если все тесты пройдены успешно :smiley_cat:, они отмечаются зеленым значком :heavy_check_mark:, иначе :scream_cat: - красным :heavy_exclamation_mark:

:point_up: У многих после клонирования Task 1 студия не показывала значек запуска теста перед именем класса с тестом. Есть два совета:
- Используйте стабильную версию Android Studio, например 3.6.1 
- Клонируйте проект через консоль и затем открывайте в студии.

В любом случае, запуск через пункт Gradle в студии или через консоль будет работать. 

Если вы пришли к выводу, что выполнили максимум того что могли сделать, то сделайте Submit задачи через 
https://app.rs.school/


## Условия задач

### 1) Date Formatter

Робот Геннадий, умный робот. Он умеет говорить на правильном русском языке и по дате определяет день недели. Будь как Геннадий.

Задача:
Реализуйте метод, который по числу, месяцу и году определяет день недели и возвращает его в правильном падеже.

Пример:

- Входные данные: 17 11 2020
- Выходная строка: 17 ноября, вторник
</br></br>

- Входные данные: 18 3 2019
- Выходная строка: 18 марта, понедельник
</br></br>

- Входные данные: 29 2 2017
- Выходная строка: Такого дня не существует
</br></br>


**Input:** three values - day: String, month: String, year: String

**Output:** text representation of Date - "$day $text_month, $text_day_of_the_week" or "Такого дня не существует" 
</br></br>

### 2) Time Converter

Given the time in numerals we may convert it into words, as shown below:

<img alt="time converter" src="/images/img2.PNG" />

At **minutes = 0**, use "o' clock". For **1 <= minutes <= 30**, use "past", and for **30 > minutes** use "to". Note the space between the apostrophe and clock in "o' clock". For **15 minutes** use "quarter past", for **45 minutes** - "quarter to". Complete function which returns the time in words for the input given in the format described.

**Input:** two values - hour: String, minute: String

**Output:** text representation (String) of time according to need format (see above)
</br></br>

### 3) Abbreviation



**Input:**

**Output:**
</br></br>

### 4) Pangram

**Input:** 

**Output:** 
</br></br>

### 5) Blocks


**Input:**

**Output:** 
</br></br>


### 6) Fibonacci

**Input:**

**Output:** 
</br></br>
:ok_hand:
