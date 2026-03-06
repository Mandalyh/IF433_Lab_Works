package oop_005_Amanda.week05.task1

fun main() {

    val math = MathHelper()

    val luasPersegi = math.hitungLuas(4)
    val luasPersegiPanjang = math.hitungLuas(5, 3)
    val luasLingkaran = math.hitungLuas(7.0)

    println("Luas Persegi: $luasPersegi")
    println("Luas Persegi Panjang: $luasPersegiPanjang")
    println("Luas Lingkaran: $luasLingkaran")

}