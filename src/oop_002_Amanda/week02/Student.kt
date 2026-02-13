package oop_002_Amanda.week02

class Student(val name: String, val nim: String, val major: String)
{
    init {
        println("LOG: Objek Student $name berhasil dialokasikan di Memory.")
    }

    constructor(name: String, nim: String)
            : this(name, nim, "Non-Matriculated") {
        println("LOG: Menggunakan constructor jalur umum (Tanpa Jurusan).")
    }
}