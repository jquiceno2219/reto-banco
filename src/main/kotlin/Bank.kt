class Bank {
    val client1 = Client("Martín")
    val client2 = Client("Gallegol")
    val client3 = Client("Juanda")

    fun operate() {
        client1.deposit(100.0)
        client2.deposit(200.0)
        client3.deposit(300.0)

        client1.withdraw(50.0)
        client2.withdraw(30.0)

        // Datos de cada cliente
        client1.printInfo()
        client2.printInfo()
        client3.printInfo()
    }

    fun totalDeposits() {
        val total = client1.balance + client2.balance + client3.balance
        println("Cierre del día. El dinero total en el banco es: $$total")
    }
}