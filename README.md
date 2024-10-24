# GoF patterns 

# Creational Patterns GoF 

## Factory method

Write a program using the Factory method pattern

❑ Food cooking oven

❑ Cooks different dishes depending on the incoming parameters

## Abstract factory

Write a program using the Abstract Factory pattern

❑ A cafe specializing in several national cuisines

❑ Each cuisine contains traditional dishes

❑ We prepare set meals – for Japanese, American and Ukrainian cuisine

## Prototype

Create a car class that has three different preset variants (passenger, truck and minivan), allowing only the color and number fields to be changed

Attention - not three classes, but one, simply with three preset variants.

The clone method should not be called from the client code. On the contrary - methods should be provided that allow creating different types

## Builder

Write a program using the Builder pattern

❑ Cooking pizza

❑ According to a custom recipe from a user containing in different combinations:

❑ Cheese

❑ Bacon

❑ Pineapples

❑ Mushrooms

❑ Seafood

## Singleton

Create a class that allows no more than 10 instances of itself to be created and stores references to all of these instances.

# Structural Design Patterns GoF

## Adapter

Create an adapter for a class that has a non-English interface, one or two methods are enough

## Bridge

Expand and change the cafe program using the Bridge pattern

❑ Preparing a dish of a certain cuisine

❑ First, second, third course and dessert

## Composite

Create an object tree that allows incrementing and decrementing the value of an entire field across all elements of the tree below it

## Decorator

Write a program using the Decorator pattern

❑ Cook pizza
❑ According to a custom recipe from a user containing in different combinations:

❑ Cheese

❑ Bacon

❑ Pineapples

❑ Mushrooms

❑ Seafood

## Facade

Create a Facade for this web service: http://www.dneonline.com/calculator.asmx

## Flyweight

Write a program that supports work with two types of computer game units (tanks and infantry or infantry and cavalry) so that it would be possible to include different units in a single list (creating an army) and change their coordinates simultaneously (moving an army). Moreover, so that the heavy data of each unit - texture and sounds - are stored in memory only once for one type of units.

## Proxy

Create a caching proxy for the code from the Facade example - that is, a proxy that checks whether such a request has already been made and if so, returns it from its memory. If not, places it in memory. There is no need to implement cache clearing and access time tracking.

# Behavioral Design Patterns GoF 

## Chain of Responsibility

Write a program using the Chain of Responsibility pattern

❑ Calling an emergency service through a single interface

❑ You can call:

❑ Firefighters

❑ Police

❑ Medical assistance

## Command

Write a program using the Command pattern

❑ Cook pizza

❑ According to a custom recipe from a user containing in different combinations:

❑ Cheese

❑ Bacon

❑ Pineapples

❑ Mushrooms

❑ Seafood

## Interpreter

Extend the Command program by adding processing of a custom recipe as a string

## Iterator

Create three iterators for the list of books (Author's name, Title, year of publication), running through the list of books according to three fields in ascending order

## Mediator

Write a program using the Mediator pattern. Concierge service. You can give tasks for:

❑ Calling a taxi
❑  Calling a technician to your home
❑ Flower delivery

and notify the sender without directly connecting them

## Memento

Write a program using the Memento pattern. Text editor

There are functions:
❑  Save a new version of a document
❑  Return a specific version of a document

## Observer

Write a program using the Observer pattern. Storm Warning Service:

❑ Can notify subscribers about a storm

❑ Different subscribers - schools, airport, road services react to different levels of warning

## State

Write a program using the State pattern. Pizza oven: 

❑ States:

❑ Cold

❑ Ready to work

❑ Overheated

And methods for transitioning between states.

And also the bake() method, which behaves differently depending on the state of the oven - when not heated and when overheated it throws exceptions, and when normal it works.

## Strategy

Write a program using the Strategy pattern. List sorter. Strategies:

❑ Bubble sort

❑ Quick sort

## Template Method

Write a program using the Template Method pattern. Program for writing information to a file:

❑ Write the current date

❑ Write the current time

## Visitor

Write a program using the Visitor pattern. Cook pizza. A custom recipe from a user contains:

❑ Cheese

❑ Bacon

❑ Pineapples

❑ Mushrooms

❑ Seafood


# Породжувальні шаблони GoF

## Factory method

Написати програму, використовуючи патерн Factory method:

❑ Піч для приготування їжі

❑ Готує різні страви, залежно від параметрів, що надходять

## Abstract factory

Написати програму, використовуючи патерн Abstract Factory

❑ Кафе, що спеціалізується на кількох національних кухнях

❑ Кожна кухня має традиційні страви

❑ Готуємо комплексні обіди – для японської, американської та української кухні

## Prototype

Створіть клас автомобіль, що має три різних встановлених варіанти (легковий, вантажний і мінівен), що дозволяє змінювати тільки поля колір і номер.

Увага - не три класи, а один, просто з трьома встановленими варіантами.

Метод clone повинен викликатися з клієнтського коду. Мають бути надані методи, що дозволяють створювати різні типи.

## Builder

Написати програму, використовуючи патерн Builder: готуємо піцу

❑ За кастомним рецептом від користувача, що містить у різних поєднаннях:

❑ Сир

❑ Бекон

❑ Ананаси

❑ Гриби

❑ Морепродукти

## Singleton

Створіть клас, що допускає створення не більше 10 екземплярів себе (Multitone) і зберігає посилання на всі ці екземпляри.

# Структурні шаблони GoF

## Adapter

Створіть адаптер для класу, що має інтерфейс не англійською мовою, достатньо одного-двох методів

## Bridge

Розширюємо та змінюємо програму кафе, використовуючи патерн Bridge

❑ Готуємо страву певної кухні

❑ Перша, друга, третя страви та десерт

## Composite

Створіть дерево об'єктів, що дозволяє інкрементувати і декрементувати значення цілого поля по всіх елементах дерева, що знаходяться нижче.

## Decorator

Написати програму, використовуючи патерн Decorator

❑ Готуємо піцу за кастомним рецептом від користувача, що містить у різних поєднаннях:

❑ Сир

❑ Бекон

❑ Ананаси

❑ Гриби

❑ Морепродукти

## Facade

Створіть Facade для цього веб-сервісу: http://www.dneonline.com/calculator.asmx

## Flyweight

Напишіть програму, яка підтримує роботу з двома типами юнітів комп'ютерної гри (танки та піхота або піхота та кавалерія) так, щоб можна було включати різнорідні юніти до єдиного списку (створення армії) та змінювати їх координати одночасно (переміщення армії). Причому так, щоб важкі дані кожного юніту – текстура та звуки зберігалися в пам'яті лише один раз для одного типу юнітів.

## Proxy

Створіть до коду з прикладу Facade кешуючий проксі - тобто проксі, який перевіряє чи був такий запит і якщо був - віддає його зі своєї пам'яті. Якщо ні – поміщає його в кеш. Реалізувати очищення кешу та стеження за часом доступу не треба.

# Поведінкові шаблони GoF

## Chain of Responsibility

Написати програму, використовуючи патерн Chain of responsibility

❑ Виклик екстреної служби через єдиний інтерфейс

❑ Можна викликати:

❑ Пожежних

❑ Поліцію

❑ Медичну допомогу

## Command

Написати програму, використовуючи патерн Command

❑ Готуємо піцу

❑ За кастомним рецептом від користувача, що містить у різних поєднаннях:

❑ Сир

❑ Бекон

❑ Ананаси

❑ Гриби

❑ Морепродукти

## Interpreter

Розширюємо програму Command, додаючи обробку кастомного рецепта у вигляді рядка

## Iterator

Створіть до списку з книг (Ім'я автора, Назва, рік видання) три ітератори, які пробігають список книг відповідно за трьома полями за зростанням

## Mediator

Написати програму з використанням патерну Mediator. Консьєрж сервіс. Можна давати завдання на:

❑ Виклик таксі

❑ Виклик майстра додому

❑ Доставка квітів

та повідомляти відправника, не пов'язуючи їх безпосередньо

## Memento

Написати програму, використовуючи патерн Memento. Текстовий редактор. Є функції:

❑ Зберігати нову версію документа

❑ Повертати певну версію документа

## Observer

Написати програму, використовуючи патерн Observer. Сервіс попередження про шторми:

❑ Може повідомляти передплатників про настання шторму.

❑ Різні передплатники – школи, аеропорт, дорожні служби реагують на різний рівень попередження.

## State

Написати програму, використовуючи патерн State. Піч для приготування піци.

❑ Стани:

❑ Холодна

❑ Готова до роботи

❑ Перегрів

І методи переходу між станами.

А так само метод bake(), який поводиться по-різному в залежності від того, в якому стані пекти - в непрогрітому і в перегрітому кидає ексепшени, а в нормальному - працює.

## Strategy

Написати програму, використовуючи патерн Strategy. Сортувальник списку. Стратегії:

❑ Bubble сортування

❑ Швидке сортування

## Template Method

Написати програму, використовуючи патерн Template Method. Програма для запису інформації у файл:

❑ Записати поточну дату

❑ Записати поточний час

## Visitor

Написати програму, використовуючи патерн Visitor. Готуємо піцу за кастомним рецептом від користувача, що містить:

❑ Сир

❑ Бекон

❑ Ананаси

❑ Гриби

❑ Морепродукти