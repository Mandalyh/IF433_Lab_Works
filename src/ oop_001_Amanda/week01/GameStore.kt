package oop_001_Amanda.week01

fun main() {

    val gameTitle = "Black Myth: Wukong"
    val price = 750000

    val discount = calculateDiscount(price)
    val finalPrice = price - discount

    printReceipt(
        title = gameTitle,
        originalPrice = price,
        finalPrice = finalPrice
    )
}

fun calculateDiscount(price: Int): Int =
    if (price > 500000) (price * 20) / 100
    else (price * 10) / 100

fun printReceipt(title: String, originalPrice: Int, finalPrice: Int) {
    println("===== SteamKW by Amanda =====")
    println("Judul Game : $title")
    println("Harga Asli : Rp $originalPrice")
    println("Harga Akhir: Rp $finalPrice")
}
