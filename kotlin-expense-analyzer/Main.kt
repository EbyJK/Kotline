fun main() {
    val expenses = mutableListOf<Int>()

    println("How many expenses do you want to enter?")
    val count = readLine()?.toIntOrNull()

    if (count == null || count <= 0) {
        println("Invalid number")
        return
    }

    for (i in 1..count) {
        println("Enter expense $i:")

        val amount = readLine()?.toIntOrNull()

        if (amount != null) {
            expenses.add(amount)
        } else {
            println("Invalid input, skipping...")
        }
    }

    println("\nAll expenses: $expenses")




    val total = expenses.sum()
val average = if (expenses.isNotEmpty()) expenses.average() else 0.0

println("\nSummary:")

var low = 0
var mid = 0
var high = 0

for (e in expenses) {
    when {
        e < 100 -> low++
        e in 100..1000 -> mid++
        else -> high++
    }
}

println("\nCategory Breakdown:")
println("Under ₹100: $low")
println("₹100–₹1000: $mid")
println("Above ₹1000: $high")




println("\nBehavior Analysis:")

if (average < 100) {
    println("You are a conservative spender (mostly small expenses).")
} else if (average <= 1000) {
    println("You have balanced spending habits.")
} else {
    println("You tend towards premium spending.")
}

if (high > mid && high > low) {
    println("Most of your expenses are high-value purchases.")
} else if (low > mid && low > high) {
    println("You frequently make small daily expenses.")
} else {
    println("Your spending is fairly distributed.")
}
println("Total spending: ₹$total")
println("Average spending: ₹$average")
}