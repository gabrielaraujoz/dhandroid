package Homework

fun main() {
    print("Digite o número A: ")
    var numA = readLine()!!.toInt()
    print("Digite o número B: ")
    var numB = readLine()!!.toInt()
    print("Digite o número C: ")
    var numC = readLine()!!.toInt()
    print("Digite o número D: ")
    var numD = readLine()!!.toInt()
    print((numA > numC && numA > numD) || (numB > numC && numB > numD))
}