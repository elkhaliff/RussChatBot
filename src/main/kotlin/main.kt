//import java.util.Scanner

val scanner = java.util.Scanner(System.`in`)

fun main(args: Array<String>) {
    println("Hello World!")
    greet("Юнона", "2021")
    remindName()
    guessAge()
    count()
    test()
    end()
}

fun greet(assistantName: String, birthYear: String) {
    println("Привет! Моё имя: ${assistantName}.")
    println("Я была создана ${birthYear}.")
    println("Пожалуйста, скажите мне свое имя.")
}

fun remindName() {
    val name = scanner.nextLine()
    println("Какое прекрасное имя у вас, ${name}!")
}

fun guessAge() {
    println("Позвольте угадать мне ваш возраст.")
    println("Введите последовательно остатки от деления вашего возраста на 3, 5 и 7")
    val rem3 = scanner.nextInt()
    val rem5 = scanner.nextInt()
    val rem7 = scanner.nextInt()
    val age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105
    println("Я угадала, Ваш возраст - ${age}; это хорошее время для начала обучения программированию!")
}

fun count() {
    println("А теперь я хочу доказать, что умею считать до числа, которое вы назовете:")
    val num = scanner.nextInt()
    for (i in 0..num) {
        print(i)
        println("!")
    }
}

fun test() {
    println("Давайте проверим ваши знания программирования")
    println("Почему мы используем методы?")
    println("1. Повторить определение несколько раз.")
    println("2. Разложить программу на несколько небольших подпрограмм.")
    println("3. Для возможности определить время выполнения программы.")
    println("4. Для того, чтобы иметь возможность прервать выполнение программы.")
    var ans = scanner.nextInt()
    while (ans != 2) {
        println("Неправильно, попробуйте ещё раз.")
        ans = scanner.nextInt()
    }
}

fun end() {
    println("Поздравляем, хорошего Вам дня!") // Do not change this text
}