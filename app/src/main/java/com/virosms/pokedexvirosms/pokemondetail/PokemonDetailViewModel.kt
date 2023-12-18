package com.virosms.pokedexvirosms.pokemondetail

import androidx.lifecycle.ViewModel
import com.virosms.pokedexvirosms.data.remote.responses.Pokemon
import com.virosms.pokedexvirosms.repository.PokemonRepository
import com.virosms.pokedexvirosms.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PokemonDetailViewModel @Inject constructor(
    private val repository: PokemonRepository
) : ViewModel() {

    suspend fun getPokemonInfo(pokemonName: String): Resource<Pokemon>{
        return repository.getPokemonInfo(pokemonName)
    }
}