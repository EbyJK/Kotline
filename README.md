# 💸 Smart Expense Analyzer (Kotlin CLI)

A simple yet insightful **command-line application built using Kotlin** that analyzes user expenses and provides meaningful behavioral insights based on spending patterns.

---

## 🚀 Features

* 📥 Accepts multiple user expenses
* 🔢 Calculates total and average spending
* 📊 Categorizes expenses into:

  * Under ₹100 (Casual)
  * ₹100–₹1000 (Moderate)
  * Above ₹1000 (Premium)
* 🧠 Provides behavioral insights based on spending patterns
* ⚠️ Handles invalid inputs gracefully

---

## 🛠️ Tech Stack

* **Language:** Kotlin
* **Platform:** JVM (Java)
* **IDE:** VS Code
* **Type:** Command-Line Interface (CLI)

---

## 📂 Project Structure

```
kotlin-expense-analyzer/
│
├── Main.kt
├── main.jar (generated after compilation)
└── README.md
```

---

## ▶️ How to Run

### 1. Compile the program

```
kotlinc Main.kt -include-runtime -d main.jar
```

### 2. Run the program

```
java -jar main.jar
```

---

## 🧪 Sample Input & Output

```
How many expenses do you want to enter?
3

Enter expense 1:
100
Enter expense 2:
500
Enter expense 3:
1500

All expenses: [100, 500, 1500]

Summary:
Total spending: ₹2100
Average spending: ₹700.0

Category Breakdown:
Under ₹100: 0
₹100–₹1000: 2
Above ₹1000: 1

Behavior Analysis:
You have balanced spending habits.
Your spending is fairly distributed.
```

---

## 🧠 Concept Behind the Project

This project is inspired by real-world consumer behavior, where spending is often psychologically categorized into:

* Small daily expenses
* Moderate routine purchases
* High-value or premium spending

The application uses these categories to provide simple yet meaningful insights.

---

## 📈 Future Improvements

* 💾 Save and load expenses from a file
* 📅 Monthly expense tracking
* 📊 Data visualization
* 🌐 Web-based version using React
* 🤖 Advanced analytics

---

## 🙌 Author

**Eby J K**

---

## ⭐ If you like this project

Give it a star ⭐ and feel free to contribute!
