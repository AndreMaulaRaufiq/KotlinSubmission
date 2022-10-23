package id.infinitelearning.KotlinSubmission.exercise5

fun main() {

    /**
     * Latihan 1
     * Buat variable dengan nama hero dibawah ini dan isi nilai variable tersebut dengan class Hero
     *
     */
    val hero = Hero()


    /**
     * Latihan 2
     * Set data profile dengan memanggil fungsi setProfile() dibawah ini
     * Dan isi argumen-argumen / data dari parameter sesuai data diri Anda (Name, Age, Height)
     *
     */
    hero.setProfile("Andre", 20, 175)


    /**
     * Latihan 3
     * Tampilkan data profile dibawah ini, sebelum melakukan aktivitas
     *
     */
    hero.profile()


    /**
    Challenge:
    Group 6: jalan 2x, lari 4x, makan 2x, minum 2x, lompat 7x, duduk 4x
    **/
    /**
     * Latihan 4
     * Jalankan aktivitas-aktivitas dengan memanggil fungsi-fungsi sesuai challenge diatas
     *
     */
    for (i in 1..2) {
        hero.jalan()
    }
    for (i in 1..4) {
        hero.lari()
    }
    for (i in 1..2) {
        hero.makan()
    }
    for (i in 1..2) {
        hero.minum()
    }
    for (i in 1..7) {
        hero.lompat()
    }
    for (i in 1..4) {
        hero.duduk()
    }

    /**
     * Latihan 5
     * Panggil fungsi profile dibawah ini untuk menampilkan status terkini setelah melakukan aktivitas
     *
     */
    hero.profile()

}