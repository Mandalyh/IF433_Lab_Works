package oop_010_Amanda.week10.task1

fun main() {
    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC", 0.5))
    coinRepo.add(Coin("ETH", 2.0))
    coinRepo.add(Coin("USDT", 1000.0))

    val response = ApiResponse(
        "200 OK",
        coinRepo.getAll()
    )

    println("Status Response: ${response.status}")
    println()

    response.data.forEach {
        println("Coin: ${it.name}")
        println("Balance: ${it.balance}")
        println()
    }

    val txRepo = WalletRepository<Transaction>()

    txRepo.add(Transaction("TX001", 50000.0))
    txRepo.add(Transaction("TX002", 120000.0))
    txRepo.add(Transaction("TX003", 75000.0))
}