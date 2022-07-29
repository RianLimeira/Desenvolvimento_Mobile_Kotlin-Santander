package com.example.simulator.ui

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.simulator.R
import com.example.simulator.data.MatchesApi
import com.example.simulator.databinding.ActivityMainBinding
import com.example.simulator.domain.Match
import com.google.android.material.snackbar.Snackbar
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {
    private lateinit var matchesApi: MatchesApi
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /*setContentView(R.layout.activity_main)
        val textHello = findViewById<TextView>(R.id.hello)*/

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupHTTPCliente()
        setupMatchesList()
        setupMatchesRefresh()
        setupFloatingActionButton()

    }

    private fun setupHTTPCliente() {
        val retrofit = Retrofit.Builder()
            .baseUrl("https://rianlimeira.github.io/matches-simulator-api/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        matchesApi = retrofit.create(MatchesApi::class.java)
    }

    private fun setupMatchesList() {
        //TODO LISTAR AS PARTIDAS, CONSUMINDO API

        //TODO LISTAR AS PARTIDAS, CONSUMINDO API
        matchesApi.matches.enqueue(object : Callback<List<Match?>> {
            override fun onResponse(call: Call<List<Match?>>, response: Response<List<Match?>>) {
                if (response.isSuccessful) {
                    val matches = response.body()!!
                    Log.i("SIMULATOR", "Deu tudo certo! Partidas = " + matches.size)
                } else {
                    showErrorManager()
                }
            }

            override fun onFailure(call: Call<List<Match?>>, t: Throwable) {
                showErrorManager()
            }
        })
    }

    private fun setupFloatingActionButton() {
        //TODO: CRIAR EVENTO DE CLICK E SIMULÇÃO
    }


    private fun setupMatchesRefresh(){
        //TODO: ATUALIZAR AS PARTIDAS NA AÇÃO DE SWIPE
    }

    private fun showErrorManager() {
        Snackbar.make(binding.fabSimulator, R.string.error_api, Snackbar.LENGTH_LONG).show()
    }
}

