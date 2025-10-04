class Client(var name: String) {
    var balance: Double = 0.0

    fun deposit(amount: Double) {
        if (amount > 0) {
            balance += amount
            println("$name depositó $$amount. Valor de cuenta actual: $$balance")
        } else {
            println("El depósito debe ser mayor a 0")
        }
    }

    fun withdraw(amount: Double) {
        if (amount > 0 && amount <= balance) {
            balance -= amount
            println("$name retiró $$amount. Valor de cuenta actual: $$balance")
        } else {
            println("Retiro inválido para $name. Balance: $$balance")
        }
    }

    fun printInfo() {
        println("Cliente: $name, Balance: $$balance")
    }
}