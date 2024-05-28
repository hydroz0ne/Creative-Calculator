package com.example.creativecalculator

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.*
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    //Options for both lists
    private val color = arrayOf("Red", "Orange", "Yellow", "Green", "Blue", "Violet", "Indigo")
    private val season = arrayOf("Spring", "Summer", "Autumn", "Winter")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Adapters values
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, color)
        val adapter2 = ArrayAdapter(this, android.R.layout.simple_spinner_item, season)

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item)
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_item)

        //Variables
        val b1 = findViewById<Button>(R.id.button)
        val colorlist = findViewById<Spinner>(R.id.spinner)
        val seasonlist = findViewById<Spinner>(R.id.spinner2)

        //First and Second Spinner
        colorlist.adapter = adapter
        seasonlist.adapter = adapter2

        //Result list
        b1.setOnClickListener {
            val colorPosition = colorlist.selectedItemPosition
            val seasonPosition = seasonlist.selectedItemPosition
            var resultText = ""
            var imageResId = 0
            var descriptionText = ""

            //Red
            if (colorPosition == 0 && seasonPosition == 0) {
                resultText = "The best red flowers for spring are tulips!"
                imageResId = R.drawable.tulips
                descriptionText = "Symbolizing renewal and beauty, tulips are a classic spring flower."
            }
            if (colorPosition == 0 && seasonPosition == 1) {
                resultText = "The best red flowers for summer are poppies!"
                imageResId = R.drawable.poppies
                descriptionText = "Vibrant, delicate flowers often associated with remembrance."
            }
            if (colorPosition == 0 && seasonPosition == 2) {
                resultText = "The best red flowers for autumn are red chrysanthemums!"
                imageResId = R.drawable.chrys
                descriptionText = "Known for their rich colors and autumnal blooms."
            }
            if (colorPosition == 0 && seasonPosition == 3) {
                resultText = "The best red flowers for winter are camellias!"
                imageResId = R.drawable.camellias
                descriptionText = "Elegant, multi-petaled flowers representing admiration."
            }

            //Orange
            if (colorPosition == 1 && seasonPosition == 0) {
                resultText = "The best orange flowers for spring are marigolds!"
                imageResId = R.drawable.marigolds
                descriptionText = "Bright and cheerful, often planted in early spring."
            }
            if (colorPosition == 1 && seasonPosition == 1) {
                resultText = "The best orange flowers for summer are daylilies!"
                imageResId = R.drawable.daylilies
                descriptionText = "Hardy, trumpet-shaped flowers that thrive in the heat."
            }
            if (colorPosition == 1 && seasonPosition == 2) {
                resultText = "The best orange flowers for autumn are zinnias!"
                imageResId = R.drawable.zinnias
                descriptionText = "Their bold colors make them a fall favorite."
            }
            if (colorPosition == 1 && seasonPosition == 3) {
                resultText = "The best orange flowers for winter are calendulas!"
                imageResId = R.drawable.calendulas
                descriptionText = "Also known as pot marigolds, they can bloom in cooler climates."
            }

            //Yellow
            if (colorPosition == 2 && seasonPosition == 0) {
                resultText = "The best yellow flowers for spring are daffodils!"
                imageResId = R.drawable.daffodils
                descriptionText = "A quintessential spring flower, symbolizing new beginnings."
            }
            if (colorPosition == 2 && seasonPosition == 1) {
                resultText = "The best yellow flowers for summer are sunflowers!"
                imageResId = R.drawable.sunflowers
                descriptionText = "Iconic and towering, they love the summer sun."
            }
            if (colorPosition == 2 && seasonPosition == 2) {
                resultText = "The best yellow flowers for autumn are goldenrods!"
                imageResId = R.drawable.goldenrods
                descriptionText = "Adding bright yellow to autumn landscapes."
            }
            if (colorPosition == 2 && seasonPosition == 3) {
                resultText = "The best yellow flowers for winter are winter jasmines!"
                imageResId = R.drawable.winterjasmine
                descriptionText = "One of the few yellow flowers that bloom in winter."
            }

            //Green
            if (colorPosition == 3 && seasonPosition == 0) {
                resultText = "The best green flowers for spring are green hellebores!"
                imageResId = R.drawable.greenhellebore
                descriptionText = "Early-blooming, nodding flowers with a greenish tint."
            }
            if (colorPosition == 3 && seasonPosition == 1) {
                resultText = "The best green flowers for summer are ferns!"
                imageResId = R.drawable.ferns
                descriptionText = "Lush and green, ferns are perfect for shaded summer areas."
            }
            if (colorPosition == 3 && seasonPosition == 2) {
                resultText = "The best green flowers for autumn are green chrysanthemums!"
                imageResId = R.drawable.greenchrys
                descriptionText = "Unique and eye-catching, they bloom in autumn."
            }
            if (colorPosition == 3 && seasonPosition == 3) {
                resultText = "The best green flowers for winter are primroses!"
                imageResId = R.drawable.primrose
                descriptionText = "Defying the winter cold, they symbolize hope and renewal as winter transitions into spring."
            }

            //Blue
            if (colorPosition == 4 && seasonPosition == 0) {
                resultText = "The best blue flowers for spring are hyacinths!"
                imageResId = R.drawable.hyacinths
                descriptionText = "Fragrant and colorful, they are a spring garden favorite."
            }
            if (colorPosition == 4 && seasonPosition == 1) {
                resultText = "The best blue flowers for summer are hydrangeas!"
                imageResId = R.drawable.hydrangeas
                descriptionText = "Known for their large, vibrant blooms."
            }
            if (colorPosition == 4 && seasonPosition == 2) {
                resultText = "The best blue flowers for autumn are asters!"
                imageResId = R.drawable.asters
                descriptionText = "These fall-blooming flowers add a pop of blue."
            }
            if (colorPosition == 4 && seasonPosition == 3) {
                resultText = "The best blue flowers for winter are snowdrops!"
                imageResId = R.drawable.snowdrops
                descriptionText = "Delicate and early-blooming, they often emerge in late winter."
            }

            //Violet
            if (colorPosition == 5 && seasonPosition == 0) {
                resultText = "The best violet flowers for spring are crocus!"
                imageResId = R.drawable.crocus
                descriptionText = "One of the first flowers to bloom in spring."
            }
            if (colorPosition == 5 && seasonPosition == 1) {
                resultText = "The best violet flowers for summer are lavenders!"
                imageResId = R.drawable.lavenders
                descriptionText = "Fragrant and enduring, perfect for summer."
            }
            if (colorPosition == 5 && seasonPosition == 2) {
                resultText = "The best violet flowers for autumn are violettas!"
                imageResId = R.drawable.violettas
                descriptionText = "Hardy flowers providing a splash of violet in the fall."
            }
            if (colorPosition == 5 && seasonPosition == 3) {
                resultText = "The best violet flowers for winter are violas!"
                imageResId = R.drawable.violas
                descriptionText = "Hardy and capable of blooming in cool weather."
            }

            //Indigo
            if (colorPosition == 6 && seasonPosition == 0) {
                resultText = "The best indigo flowers for spring are iris!"
                imageResId = R.drawable.iris
                descriptionText = "Known for their deep colors and intricate blooms."
            }
            if (colorPosition == 6 && seasonPosition == 1) {
                resultText = "The best indigo flowers for summer are lobelias!"
                imageResId = R.drawable.lobelia
                descriptionText = "Vibrant and commonly found in summer gardens."
            }
            if (colorPosition == 6 && seasonPosition == 2) {
                resultText = "The best indigo flowers for autumn are salvias!"
                imageResId = R.drawable.salvias
                descriptionText = "Tall, spiky flowers that bloom in late summer and fall."
            }
            if (colorPosition == 6 && seasonPosition == 3) {
                resultText = "The best indigo flowers for winter are grape hyacinths!"
                imageResId = R.drawable.indigohyacinths
                descriptionText = "Early bloomers that bring indigo hues to late winter."
            }

            // Show the dialog with the result text and image
            showDialog(resultText, imageResId, descriptionText)
        }
    }

    private fun showDialog(resultText: String, imageResId: Int, descriptionText: String) {
        // Inflate the dialog with popup view
        val dialogView = LayoutInflater.from(this).inflate(R.layout.popup, null)
        val builder = AlertDialog.Builder(this).setView(dialogView)
        val dialog = builder.create()

        // Find views within the dialog
        val resultTextView = dialogView.findViewById<TextView>(R.id.result)
        val descriptionTextView = dialogView.findViewById<TextView>(R.id.description)
        val flowerPhoto = dialogView.findViewById<ImageView>(R.id.flowerphoto)
        val okayButton: Button = dialogView.findViewById(R.id.okaybutton)

        // Set the text for the result TextView and image for the flowerPhoto ImageView
        resultTextView.text = resultText
        descriptionTextView.text = descriptionText
        flowerPhoto.setImageResource(imageResId)

        okayButton.setOnClickListener {
            dialog.dismiss()
        }

        dialog.show()
    }
}