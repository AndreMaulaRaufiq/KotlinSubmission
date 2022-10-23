package id.infinitelearning.KotlinSubmission.exercise4

fun main() {

    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
        val name = ""

        try {
            validateName(name)
        } catch (_: Exception) {
        }
    }
fun validateName(name: String) {
    try {
        if (name.isEmpty()) {
            throw Exception("Nama tidak boleh kosong")
        } else {
            println("Nama anda adalah $name")
        }
    } catch (e: Exception) {
        println(e.message)
    }
}

