package com.example.granne

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.Button
import android.widget.CheckBox
import android.widget.ListView
import androidx.core.view.isVisible
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class FindMatchActivity : AppCompatActivity() {

    lateinit var interestButton: Button
    lateinit var searchMatchButton: Button
    lateinit var recyclerView: RecyclerView

    var persons = mutableListOf<PersonFindMatch>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_find_match)

        interestButton = findViewById(R.id.interestButton)
        searchMatchButton = findViewById(R.id.searchMatchButton)
        recyclerView = findViewById(R.id.rwFindMatch)


        interestButton.setOnClickListener {
            val dialog = InterestDialogFragment()
            dialog.show(supportFragmentManager, "interestdialog")
        }

        searchMatchButton.setOnClickListener {
            Log.d("!", "Match button pressed")
            // Sök efter användare med intressena som var Checkade
            recyclerView.isVisible = true
        }


        recyclerView()
    }


    fun recyclerView() {

        recyclerView.layoutManager = LinearLayoutManager(this)

        persons.add(PersonFindMatch("testNamn", "Bio"))

        val adapter = PersonFindMatchRecycleViewAdapter(this, persons)
        recyclerView.adapter = adapter
        recyclerView.isVisible = false
    }

    fun onCheckBoxesListener(view: View) {

        if (view is CheckBox) {
            var interestCount: Int = 0
            val checked: Boolean = view.isChecked

            when (view.id) {
                R.id.checkBox1 -> {
                    if (checked) {
                        Log.d("!", "Checked 1")
                        // Lägg till i databasen
                    } else {
                        Log.d("!", "Un-checked! 1")
                        // Ta bort från databasen
                    }
                }

                R.id.checkBox2 -> {
                    if (checked) {
                        Log.d("!", "Checked 2")
                        // Lägg till i databasen
                    } else {
                        Log.d("!", "Un-checked! 2")
                        // Ta bort från databasen
                    }
                }

                R.id.checkBox3 -> {
                    if (checked) {
                        Log.d("!", "Checked 3")
                        // Lägg till i databasen
                    } else {
                        Log.d("!", "Un-checked! 3")
                        // Ta bort från databasen
                    }
                }

                R.id.checkBox4 -> {
                    if (checked) {
                        Log.d("!", "Checked 4")
                        // Lägg till i databasen
                    } else {
                        Log.d("!", "Un-checked! 4")
                        // Ta bort från databasen
                    }
                }

                R.id.checkBox5 -> {
                    if (checked) {
                        Log.d("!", "Checked 5")
                        // Lägg till i databasen
                    } else {
                        Log.d("!", "Un-checked! 5")
                        // Ta bort från databasen
                    }
                }

                R.id.checkBox6 -> {
                    if (checked) {
                        Log.d("!", "Checked 6")
                        // Lägg till i databasen
                    } else {
                        Log.d("!", "Un-checked! 6")
                        // Ta bort från databasen
                    }
                }

            }

        }
    }

}