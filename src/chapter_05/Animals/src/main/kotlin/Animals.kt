class Animals {
    fun main(args: Array<String>) {

        val vet = Vet()
        val wolf = Wolf()
        val hippo = Hippo()

        val animals = arrayOf(hippo, wolf)
        for (item in animals) {
            item.roam()
            item.eat()
        }

        vet.giveShot(wolf)
        vet.giveShot(hippo)
    }
}