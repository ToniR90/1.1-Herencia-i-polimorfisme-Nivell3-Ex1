# 1.1-Herencia-i-polimorfisme-Nivell3-Ex1

📄 Description - Exercise Statement
This project implements a system for managing a sports newsroom, where news articles are categorized by sports such as football, basketball, tennis, Formula 1, and motorcycling. The project demonstrates the management of reporters, news articles, and their specific attributes, as well as calculates news scores and prices based on predefined criteria.

Objectives:
1. **Reporters**:
   - Each reporter has a `name`, `DNI`, and `salary`.
   - The `DNI` is immutable (cannot be changed once assigned).
   - All reporters share the same salary, which is currently set at 1500€ but can be updated for everyone in the future.

2. **News Articles**:
   - Each article has a `holder`, an empty `text` by default, a `score`, and a `price`.
   - Additional attributes are specific to the type of sport:
     - **Football**: Competition (`String`), club (`String`), and player (`String`).
     - **Basketball**: Competition (`String`) and club (`String`).
     - **Tennis**: Competition (`String`) and players (`String`).
     - **Formula 1**: Team (`String`).
     - **Motorcycling**: Team (`String`).

3. **Price Calculation**:
   Implement the `calculatePrice()` method to determine the price of each news article based on the following criteria:
   - **Football**:
     - Base price: 300€
     - Champions League: +100€
     - Barça or Madrid: +100€
     - Ferran Torres or Benzema: +50€
   - **Basketball**:
     - Base price: 250€
     - Euroleague: +75€
     - Barça or Madrid: +75€
   - **Tennis**:
     - Base price: 150€
     - Federer, Nadal, or Djokovic: +100€
   - **Formula 1**:
     - Base price: 100€
     - Ferrari or Mercedes: +50€
   - **Motorcycling**:
     - Base price: 100€
     - Honda or Yamaha: +50€

4. **Score Calculation**:
   Implement the `calculatePunctuation()` method to determine the score of each news article:
   - **Football**:
     - Base score: 5 points
     - Champions League: +3 points
     - League: +2 points
     - Barça or Madrid: +1 point
     - Ferran Torres or Benzema: +1 point
   - **Basketball**:
     - Base score: 4 points
     - Euroleague: +3 points
     - ACB: +2 points
     - Barça or Madrid: +1 point
   - **Tennis**:
     - Base score: 4 points
     - Federer, Nadal, or Djokovic: +3 points
   - **Formula 1**:
     - Base score: 4 points
     - Ferrari or Mercedes: +2 points
   - **Motorcycling**:
     - Base score: 3 points
     - Honda or Yamaha: +3 points

5. **Main Menu**:
   The main class should include a menu with the following options:
   1. Add a reporter.
   2. Remove a reporter.
   3. Add a news article to a reporter.
   4. Remove a news article (requires reporter and holder).
   5. Show all news articles by reporter.
   6. Calculate the score of a news article.
   7. Calculate the price of a news article.

## 💻 Technologies Used
- **Java 11** or higher
- **IntelliJ IDEA** or any Java IDE
- **Git and GitHub** for version control

## 📋 Requirements
- **JDK 11** or higher.
- A Java IDE, such as IntelliJ IDEA or Eclipse.
- Knowledge of object-oriented programming and Java.

## 🛠️ Installation
1. Clone this repository to your local machine:
   git clone https://github.com/ToniR90/1.1-Herencia-i-polimorfisme-Nivell3-Ex1.git
