# Task 2
:mortar_board: :mortar_board: Task 2 состоит из шести задач. Все заготовки задач находятся в корне проекта в папке *src/main/kotlin*. В каждой заготовке вам дан класс с открытым методом, в который нужно написать код для решения поставленной задачи. Все - как и для Task 1.

<img alt="structure_of_tasks" src="/images/img1.PNG" />

Тесты находятся в папке *src/test/kotlin*. Тесты можно запускать различными способами. Например, выполнить таск Gradle: *Gradle -> Tasks -> verification -> test*. Тогда прогонятся все unit-тесты сразу:

<img alt="launch test via Gradle" src="/images/img_5.PNG" />

Или открыть класс с тестом и нажать на зелёный треугольник рядом с объявлением класса. Если все тесты пройдены успешно :smiley_cat:, они отмечаются зеленым значком :heavy_check_mark:, иначе :scream_cat: - красным :heavy_exclamation_mark:

:point_up: У многих после клонирования Task 1 студия не показывала значек запуска теста перед именем класса с тестом. Есть два совета:
- Используйте стабильную версию Android Studio, на данный момент 3.6.1 
- Клонируйте проект через консоль и затем открывайте в студии.

В любом случае, запуск через пункт Gradle в студии или через консоль будет работать. 

Если вы пришли к выводу, что выполнили максимум того что могли сделать, то сделайте Submit задачи через 
https://app.rs.school/
</br></br>

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


**Input:** three parameters - day: String, month: String, year: String

**Output:** text representation of Date - "$day $text_month, $text_day_of_the_week" or "Такого дня не существует" 
</br></br>

### 2) Time Converter

Given the time in numerals we may convert it into words, as shown below:

<img alt="time converter" src="/images/img2.PNG" />

At **minutes = 0**, use "o' clock". For **1 <= minutes <= 30**, use "past", and for **30 > minutes** use "to". Note the space between the apostrophe and clock in "o' clock". For **15 minutes** use "quarter past", for **45 minutes** - "quarter to". Complete function which returns the time in words for the input given in the format described.

**Input:** two parameters - hour: String, minute: String

**Output:** text representation (String) of time according to need format (see above)
</br></br>

### 3) Abbreviation

You can perform the following operations on the string **a** 

1. Capitalize zero or more of **a**'s lowercase letters.
2. Delete all of the remaining lowercase letters in **a**.

Given two strings, **a** and **b**, determine if it's possible to make **a** equal to **b** as described. If so, print *"YES"* on a new line. Otherwise, print *"NO"*.

For example, given **a = AbcDE** and **b = ABDE**, in **a** we can convert *"b"* and delete *"c"* to match **b**. If **a = AbcDE** and **b = AFDE**, matching is not possible because letters may only be capitalized or discarded, not changed.

**Function Description**

Complete the function *abbreviation()*. It must return either *YES* or *NO*.


**Input:** two parameters - **a**: the String to modify, **b**: the String to match. String **a** consits only of uppercase and lowercase English letters, ascii[A-Za-z]. String **b** consists only of uppercase English letters, ascii[A-Z]

**Output:** String "YES" if it's possible to make string **a** equal to string **b**. Otherwise, print "NO" 

**Sample Input:** abbreviation("daBcd", "ABC")

**Output:** "YES"

<img alt="abbreviation" src="/images/img3.PNG" />

We have **a = daBcd** and **b = ABC**. We perform the following operation:
1. Capitalize the letters *"a"* and *"c"* in **a** so that **a = daBcd**
2. Delete all the remaining lowercase letters in *a* so that **a = ABC**

Because we were able to successfully convert **a** to **b**, we print *"YES"* .
</br></br>

### 4) Pangram

Pangram - a sentence that contains each letter of the alphabet at least one time.

Pangram example: "Farmer jack realized that big yellow quilts were expensive".

Сonvert method should transform string according to the following rules:

1) if the given string is pangram:

- all words of a given string should be sorted by count of vowels; notes: (vowels: a,e,i,o,u,y), (words: all substrings of a given string separated by space), words shouldn't have 0 lengths, a word may contain a punctuation character ("someWord," or even ",").
- all vowels should be capitalized (no need to change letters that are already capitalized)
- each word should begin with a count of vowels (before: name, after: 2nAmE)
</br></br>

2) if the given string is not pangram:

- all words of a given string should be sorted by count of consonants; notes: (consonants: all letters of English alphabet excluding vowels), (words: all substrings of a given string separated by space), words shouldn't have 0 lengths, a word may contain a punctuation character ("someWord," or even ",").
- all consonants should be capitalized (no need to change letters that are already capitalized)
- each word should begin with a count of consonants (before: name, after: 2NaMe) newline characters should be replaced with spaces
</br></br>

**Example:** 
pangrams "The five boxing wizards jump quickly." should return "1ThE 1jUmp 2fIvE 2bOxIng 2wIzArds 3qUIcklY."

"A mad boxer shot a quick, gloved jab to the jaw of his dizzy opponent." should return "1A 1mAd 1shOt 1A 1jAb 1tO 1thE 1jAw 1Of 1hIs 2bOxEr 2qUIck, 2glOvEd 2dIzzY 3OppOnEnt."

no pangrams "Even the most complicated sentences start with a simple structure." should return "0a 2EVeN 2THe 3MoST 3WiTH 4STaRT 4SiMPLe 6SeNTeNCeS 6STRuCTuRe. 7CoMPLiCaTeD"

**Input:** pangram or not-pangram String

**Output:** result String according to description (see above)
</br></br>

### 5) Blocks

Робот Пафнутий узнал про блоки. И теперь он отказывается работать как-то по другому.

Помоги Пафнутию выполнить простейшие операции с разными типами объектов.

blockA — принимает данные. В блок передается массив разных объектов. Числа, строки, даты. Массив без данных Пафнутий не принимает.

blockB — принимает данные. В блок передается класс объекта, с которым нужно работать.

blockC — возвращает данные на основе тех, которые были получены в блоках A и B.

В зависимости от принимаемого массива в блоке A и класса в блоке B в блок C возвращается:
1. Для чисел — сумма всех чисел
2. Для строк — конкатенация всех строк
3. Для дат — самая позняя (т.е. ближайшая к текущему дню) дата в виде строки в формате dd.MM.yyyy

blockC вызывается, когда у Пафнутия хватает данных для вычисления

Пример:
- В blockA передаем массив [1, "4", 2, "3"]
- В blockB передаем класс String
- В blockC возвращает "43", так как из массива в блоке А берутся элементы типа String (из блока B) - "4" и "3" - и происходит их конкатенация

**Input:** 
- blockA - cписок с объектами Array типа Any (тип объектов может быть String, Int или LocalDate)
- blockB - тип объекта KClass<*>
  
**Output:** blockC: Any - результат, согласно условиям описанным выше
</br></br>


### 6) Fibonacci

The Fibonacci numbers are the numbers in the following integer sequence (Fn):

0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, ...

such as

F(n) = F(n-1) + F(n-2) with F(0) = 0 and F(1) = 1.

Given a number, say product, we search two Fibonacci numbers

F(n) and F(n+1) verifying

F(n) * F(n+1) = prod.

Your function productFib takes an NSNumber (prod) and returns an array of Int:

[F(n), F(n+1), (0 or 1))]

1 if F(n) * F(n+1) = prod and 0 if F(n) * F(n+1) is not equal to prod

Example:
productFibonacciSequenceFor(15) - should return (3, 5, 1)

since F(4) = 3, F(5) = 5 and 15 = 3 * 5

productFibonacciSequenceFor(30) should return (5, 8, 0),

since F(4) = 3, F(5) = 5, F(6) = 8 and 3 * 5 < 30 < 5 * 8

**Input:** n: Int

**Output:** array: IntArray - according to task description (see above)
</br></br>
:ok_hand:
