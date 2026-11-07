import java.util.Scanner

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
//    // break jarayonni yokida takrorlanishni to'xtatadi
////    var i = 0
////    while (i < 10) {
////        println(i)
////        i++
////        if (i == 4) {
////            break
////        }
////    }
//
//    // tashab o'tib ketadi
//    var i = 0
//    while (i < 10) {
//        if (i == 4) {
//            i++
//            continue
//        }
//        println(i)
//        i++
//    }


    var count = 0
    val scanner = Scanner(System.`in`)
    while (true) {
        val n = scanner.nextInt()
        if (n % 5 == 0) {
            count++
        }
        if (n < 0) {
            break
        }
    }
    println("5 ga bo'linadigan sonlar $count ta")

    // GIT -> local asosida.
    // GITHUB -> cloud asosida

    // commit - > har bir o'zgargan code nomi
    // push - > o'sha oz'gargan codelarni claude ga yuborish

    // commit -> CTRL + K
    // push -> CTRL + SHIFT + K


}