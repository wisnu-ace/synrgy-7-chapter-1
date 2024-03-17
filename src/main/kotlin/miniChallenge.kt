fun main () {
    // buat contoh 6 menu, dan jika user pilih 6 akan exit, selain itu boleh tampilkan apa saja
    // jika memilih selain 6, loop masih berjalan
    var opsi: Int
    do {
        println("Pilih Menu anda \n1. Canai\n2. Maryam\n3. Kebab\n4. Shawarma\n5. Nasi Biryani\n6. Exit")
        opsi = readLine()?.toIntOrNull() ?: 0

        when (opsi) {
            1 -> println("Roti Canai")
            2 -> println("Roti Maryam")
            3 -> println("Kebab")
            4 -> println("Shawarma")
            5 -> println("Nasi Biryani")
            6 -> break
            else -> println("Angka yang diinput harus 1-6")
            }
        } while (opsi != 6)
            println("Terima Kasih")

}
