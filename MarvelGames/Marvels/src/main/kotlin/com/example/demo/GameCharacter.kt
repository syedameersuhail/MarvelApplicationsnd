package com.example.demo

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true)
class GameCharacter {
    private var name: String? = null
    private var characters: Array<Characters>? = null

    fun getName(): String? {
        return name
    }

    fun setName(name: String?) {
        this.name = name
    }

    fun getCharacter(): Array<Characters>? {
        return characters
    }

    fun setCharacter(characters: Array<Characters>?) {
        this.characters = characters
    }

    override fun toString(): String {
        return "GameCharacter(name=$name, characters=${characters?.contentToString()})"
    }

}