# Проект "Простейший анализ чисел из файла"

Этот проект реализует простую программу на Java для анализа чисел, считанных из файла. Программа выполняет такие операции, как поиск минимального и максимального чисел, вычисление суммы и произведения всех чисел из файла.

## Как использовать

1. **Установите Java**: Убедитесь, что у вас установлена Java на вашем компьютере.

2. **Клонируйте репозиторий**: Склонируйте этот репозиторий на свой локальный компьютер, используя следующую команду:

   ```
   git clone https://github.com/ваш-проект.git
   ```

3. **Откройте проект**: Откройте проект в вашей любимой интегрированной среде разработки (IDE).

4. **Запустите программу**: Запустите программу, предоставив путь к файлу с числами в качестве аргумента командной строки.

   Пример:

   ```
   java Main numbers.txt
   ```

## Функции

Программа предоставляет следующие функции:

- `_min`: находит минимальное число в файле.
- `_max`: находит максимальное число в файле.
- `_sum`: вычисляет сумму всех чисел в файле.
- `_mult`: вычисляет произведение всех чисел в файле.

## Пример работы

Предположим, у нас есть файл `numbers.txt` с содержимым:

```
5 8 3 7
```

Запуск программы:

```
java Main numbers.txt
```

Вывод программы:

```
Минимальное число: 3
Максимальное число: 8
Сумма чисел: 23
Произведение чисел: 840
```

## Тесты

Проект включает в себя тесты для проверки корректности работы функций и их производительности при увеличении размера входного файла.

## CI/CD

Проект настроен для работы с GitHub Actions. Тесты запускаются автоматически при каждом новом коммите. Текущий статус сборки отображается в бейдже в README.md файле.

![Build Status](https://github.com/TZ2/workflows/CI/badge.svg)

## Интеграция с мессенджером

CI настроен на отправку уведомлений в Telegram:
- При успешном прохождении тестов отправляется сообщение "все ок".
- При неуспешном прохождении тестов отправляется информация о неудачных тестах.
