# Task 2
:mortar_board: :mortar_board: Task 2 состоит из шести задач. Все заготовки задач находятся в корне проекта в папке *src/main/kotlin*. В каждой заготовке вам дан класс с открытым методом, в который вам нужно написать код для решения поставленной задачи. Все - как и для Task 1.

<img alt="structure_of_tasks" src="/images/img1.PNG" />

Тесты находятся в папке *src/test/kotlin*. Тесты можно запускать различными способами. Например, выполнить таск Gradle: *Gradle -> Tasks -> verification -> test*. Тогда прогонятся все unit-тесты сразу:

<img alt="launch test via Gradle" src="/images/img_5.PNG" />

Или открыть класс с тестом и нажать на зелёный треугольник рядом с объявлением класса. Если все тесты пройдены успешно :smiley_cat:, они отмечаются зеленым значком :heavy_check_mark:, иначе :scream_cat: - красным :heavy_exclamation_mark:

:point_up: У многих после клонирования Task 1 студия не показывала значек запуска теста перед именем класса с тестом. Есть два совета: 1) используйте стабильную версию Android Studio, например 3.6.1, 2) Клонируйте проект через консоль и затем открывайте в студии.

В любом случае, запуск через пункт Gradle в студии или через консоль будет работать. 

Если вы пришли к выводу, что выполнили максимум того что могли сделать, то сделайте Submit задачи через 
https://app.rs.school/


## Условия задач

### 1) Date Formatter

Робот Геннадий, умный робот. Он умеет говорить на правильном русском языке и по дате определяет день недели. Будь как Геннадий.

Задача:
Реализуйте метод, который по числу, месяцу и году определяет день недели и возвращает его в правильном падеже.

Пример:
Входные данные: 17 11 2020
Выходная строка: 17 ноября, вторник

Входные данные: 18 3 2019
Выходная строка: 18 марта, понедельник

Входные данные: 29 2 2017
Выходная строка: Такого дня не существует

**Input:** three values - day: String, month: String, year: String

**Output:** text representation of Date - "$day $text_month, $text_day_of_the_week" or "Такого дня не существует" 


### 2) Time Converter

Given the time in numerals we may convert it into words, as shown below:

<img alt="time converter" src="/images/img2.PNG" />

At **minutes = 0**, use "o' clock". For **1 <= minutes <= 30**, use "past", and for **30 < minutes** use "to". Note the space between the apostrophe and clock in "o' clock". Write a program which prints the time in words for the input given in the format described.

**Input:** two values - hour: String, minute: String

**Output:** An array of integers denoting the respective minimum
and maximum values that can be calculated by summing exactly four of the
five integers.

Sample Input: 1 2 3 4 5

Sample Output: 10 14


### 3) Abbreviation

Anna and Brian are sharing a meal at a restaurant and they agree to split the
bill equally. Brian wants to order something that Anna is allergic to though,
and they agree that Anna won't pay for that item. Brian gets the check and
calculates Anna's portion. You must determine if his calculation is correct.
For example, assume the bill has the following prices: *bill = [2, 4, 6]* .Anna
declines to eat item *k = bill[2]* which costs *6*. If Brian calculates the bill
correctly, Anna will pay *(2 + 4)/2 = 3*. If he includes the cost of , he will
calculate *(2 + 4 + 6)/2 = 6*. In the second case, he should refund *3* to Anna.

Complete the function. It should print "Bon Appetit" if the bill
is fairly split. Otherwise, it should print the amount of money that Brian
owes Anna.

**Input:**

 - *bill*: An array of integers representing the cost of each item ordered
 - *k*: An integer representing the zero-based index of the item Anna doesn't eat
 - *b*: The amount of money that Anna contributed to the bill

**Output:**
If Brian did not overcharge Anna, return *"Bon Appetit"*; otherwise, return
the difference (i.e., *b_charged - b_actual*) that Brian must refund to Anna. This will
always be a String (e.g. *"10"*).


### 4) Pangram

Given a string with open-close brackets, which are [], <> or (). Find *all the substrings*
substrings, that are met between the brackets.

Note that substring must be located between **first** met open and close
bracket. As an example, for «(here is) some text)» the input would be «here
is», not «(here is) some text)» due the **second** «)» bracket.

**Input:** String that might contain the following brackets: [], <>, ()

**Output:** An Array of Strings. Each element of the array must contain
substring between the open-close bracket.

Sample Input:

«It’s <an> [example] (string)»

Sample Output:

[«an», «example», «string»]

Nota Bene: Please, do not forget to handle situation with nested brackets (e.g.
«(ipsum [dolor<] amet)>»).


### 5) Blocks

Palindromes are strings that read the same from the left or right, for example *madam* or *0110*.

You will be given a string representation of a number and a maximum number of changes you can make.
Alter the string, one digit at a time, to create the string representation of the largest number possible
given the limit to the number of changes. The length of the string may not be altered, so you must
consider 0's left of all higher digits in your tests. For example **0110** is valid, **0011** is not.

Given a string representing the starting number and a maximum number of changes allowed, create the
largest palindromic string of digits possible or the string *-1* if it's impossible to create a palindrome under
the contstraints.

Note Bene: Treat the integers as numeric strings. Leading zeros are permitted and can't be ignored so **0011** is
not a palindrome, but **0110** is. A digit can be modified more than once.

**Input:**
Two integers, *n* (the number of digits in the number) and *k* (the
maximum number of changes allowed) and *n*—digit *String* of numbers that Sandy must attempt to make palindromic.

**Output:** *String* with the largest number that can be made by changing no more than *k*: digits; if this is
not possible, print *"-1"*. This will always be a String.

Sample Input 0 

4 1 "3943"

Sample Output 0

"3993"

Explanation:

There are two ways to make "3943" a palindrome by changing no more than *k* = 1 digits:
 1. 3943 —> 3443
 2. 3943 —> 3993
3993 > 3443, so we print "3993".

Sample Input 1

6 3 "092282"

Sample Output 1

"992299"

Sample Input 2

4 1 "0011"

Sample Output 2

"-1"

### 6) Fibonacci

:ok_hand:
