package edu.temple.diceroll

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlin.random.Random

class DiceViewModel : ViewModel() {

    private val rolledNumber = MutableLiveData<Int>()
    val _rolledNumber : LiveData<Int> = rolledNumber

    fun setRoll(sides: Int){
        rolledNumber.value = sides
    }

    fun getRoll(sides : Int) : LiveData<Int> {
        rolledNumber.value = Random.nextInt(1, sides + 1)
        return rolledNumber
    }




    
}