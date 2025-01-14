package secondaryConstructors1

import atomictest.eq
import secondaryConstructors1.Material.*

enum class Material {
  Ceramic, Metal, Plastic
}

class GardenItem(
    val name: String = "Strange Thing",
    val material: Material = Plastic
) {
  override fun toString() = "$material $name"
}

fun main() {
  GardenItem("Snowman") eq "Plastic Snowman"
  GardenItem("Elf") eq "Plastic Elf"
  GardenItem("Gazing Ball", Metal) eq
      "Metal Gazing Ball"
  GardenItem(material = Metal) eq
      "Metal Strange Thing"
}