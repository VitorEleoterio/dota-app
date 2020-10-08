fun main() {
    println("Bem vindo ao Bytebank")

    testaFuncionario()

    val contaCorrente = ContaCorrente(
            titular = "Alex",
            numero = 1000)

    val contaPoupanca = ContaPoupanca(
            titular = "Fran",
            numero = 1001)

    contaPoupanca.deposita(1000.0)
    contaPoupanca.saca(100.0)
    contaCorrente.deposita(1000.0)
    contaCorrente.saca(100.0)

    println("Saldo após saque conta corrente: ${contaCorrente.saldo}")
    println("Saldo após saque conta poupança: ${contaPoupanca.saldo}")

    contaCorrente.transfere(100.0, contaPoupanca)

    println("Saldo após transferencia da conta corrente para a conta poupança: ${contaCorrente.saldo}")
    println("Saldo poupança após receber transferencia: ${contaPoupanca.saldo}")


}








