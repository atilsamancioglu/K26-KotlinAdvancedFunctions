package com.atilsamancioglu.kotlinhighorderfunctions

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    private var myInt : Int? = null
    private var i = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Scope Functions
        //let
        if (myInt != null) {
            val num = myInt!! + 1

        }
        myInt?.let {
            val num = it + 1
        }

        //returning something with let
        val myNum = myInt?.let {
            it + 1
        } ?: 0


        //also

        val atil = Person("Atil",30)
        val atlas = Person("Atlas",1)
        val zeynep = Person("Zeynep",27)

        val people = listOf<Person>(atil,atlas,zeynep)

        people.filter { it.age > 18 }
            .also {
                for (person in it) {
                    println(person.name)
                }
            }


        //apply
        //modify object without hassle

        val intent = Intent()
        intent.putExtra("","")
        intent.putExtra("","")
        intent.`package` = ""
        intent.action = ""

        val intentWithApply = Intent().apply {
            putExtra("","")
            putExtra("","")
            `package` = ""
            action = ""
        }

        //with vs apply
        //apply runs on the object reference, whereas with just passes it as an argument.
        Person("barley",4).apply {
            name = "Barley"
        }.also {
            println(it.name)
        }


        val newBarley = Person("bar",4).apply {
            name = "Barley"
        }
        println(newBarley.name)

        val anotherBarley = with(Person("arley",4)){
            name = "Barley"
        }

        println(anotherBarley) //does not return anything

        val withBarley = Person("arely",4)
        with(withBarley) {
            name = "Barley"
            age = 4
        }
        println(withBarley.name)
    }



}

data class Person(var name: String, var age: Int)