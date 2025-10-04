fun main() {
    // Instancia de un banco
    val bank = Bank()

    bank.operate()

    // Suma los depósitos al cierre del día
    bank.totalDeposits()
}