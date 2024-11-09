# String Operations

Цей проєкт є завданням до лабораторної роботи #2 в рамках курсу Java Basic Track. Він реалізує операції над рядками на мові Java.

## Вимоги

- **Java**: Вам потрібно встановити Java версії 23 або вище. Ви можете перевірити встановлену версію, виконавши команду:

  ```bash
  java -version
  ```

## Запуск проєкту

### Запуск за допомогою Java

1. Скачайте або клонуйте репозиторій на свій комп'ютер.

2. Відкрийте термінал або командний рядок та перейдіть до каталогу проєкту.

3. Скомпілюйте проект:

   ```bash
   javac src/Main.java src/com/illiakornyk/stringoperations/StringOperations.java
   ```

4. Запустіть програму:

   ```bash
   java -cp src Main
   ```

### Запуск за допомогою скриптів

- Для **Mac/Linux** запустіть скрипт `run.sh`:

  ```bash
  ./run.sh
  ```

- Для **Windows** запустіть скрипт `run.bat`:

  ```cmd
  run.bat
  ```

### Запуск за допомогою Docker

1. Переконайтесь, що у вас встановлений Docker.

2. Скачайте або клонуйте репозиторій на свій комп'ютер.

3. Відкрийте термінал або командний рядок та перейдіть до каталогу проєкту.

4. Складіть образ Docker:

   ```bash
   docker build -t my-java-app .
   ```

5. Запустіть контейнер:

   ```bash
   docker run my-java-app
   ```