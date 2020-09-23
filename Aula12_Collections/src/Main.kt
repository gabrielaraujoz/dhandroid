fun main() {
    // Collection geral utiliza LIST

    // quando não queremos ter elementos duplicados, utilizamos o Set<Type>
    val numeros = mutableSetOf(1,2,3,4)

    //numeros.get(1)
    // .get não funciona, tem que usar o iterator ou elementAt

    val iterator = numeros.iterator()

    println(numeros.elementAt(1))

    while (iterator.hasNext()) {
        println(iterator.next())
    }

    // Agora é a vez do MAP - quando queremos ter uma chave que aponte para um valor)

    val pessoas = mutableMapOf<Long, String>(112233L to "Felipe", 22334455L to "Gabriel", 334455L to "Lucas" )

    pessoas[445566L] = "Anthony" //atualize

    if(!pessoas.containsKey(334455L)) {
        pessoas[334455L] = "Johnny"
    }

    for (pessoa in pessoas.values) {
        println(pessoa)
    }

    for (key in pessoas.keys) {
        println(key)
        println(pessoas[key])
    }
}