package oop_005_Amanda.week05.task2

class CreditCard(accountName: String, val limit: Double) : PaymentMethod(accountName) {
    var usedAmount: Double = 0.0

    override fun processPayment(amount: Double) {
        if (usedAmount + amount <= limit) {
            usedAmount += amount
            println("[$accountName] Pembayaran Kartu Kredit sebesar \$${amount} Berhasil. Sisa limit: \$${limit - usedAmount}")
        } else {
            println("[$accountName] Pembayaran Gagal: Transaksi ditolak (Melebihi Limit).")
        }
    }
}