package com.example.demo

class StoreCharacters {

    var characterService: service = service()

    /*
 @args : Array of GameCharacters
 @return : nothing
 * */
    fun addCharacter(Characters: Array<Characters>) {
        for (character in Characters) {
            println(" Characters being stored ${character.name}")
            if (characterService.finalCharacters.size < 16) {
                characterService.finalCharacters.put(character.name.toString(), character.max_power!!)
            } else {
                var minPower = characterService.finalCharacters.minBy { it.value }
                var characterWithMinPower = minPower?.key
                characterService.finalCharacters.remove(characterWithMinPower)
                characterService.finalCharacters.put(character.name.toString(), character.max_power!!)
            }
        }
    }
}