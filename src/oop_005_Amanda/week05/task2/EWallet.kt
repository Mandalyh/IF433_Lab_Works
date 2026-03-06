package oop_005_Amanda.week05.task2

class EWallet(accountName: String, var balance: Double) : PaymentMethod(accountName) {

    override fun processPayment(amount: Double) {
        if (balance >= amount) {
            balance -= amount
            println("[$accountName] Pembayaran E-Wallet sebesar \$${amount} Berhasil. Sisa saldo: \$${balance}")
        } else {
            println("[$accountName] Pembayaran Gagal: Saldo tidak cukup.")
        }
    }

    fun topUp(amount: Double) {
        balance += amount
        println("[$accountName] Top Up Berhasil! Saldo sekarang: \$${balance}")
    }
}