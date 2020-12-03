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

    val roamables = arrayOf(Hippo(), Wolf(), Vehicle())
    for (item in roamables) {
        item.roam()
        if (item is Animal) {
            item.eat()
        }
    }
}