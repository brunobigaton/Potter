package com.bigaton.hogwarts.ui.detail


import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.bigaton.hogwarts.data.repository.Repository
import com.bigaton.hogwarts.model.Character
import com.bigaton.hogwarts.ui.HouseType
import kotlinx.coroutines.Dispatchers

class DetailViewModel(house: HouseType, private val repository: Repository) : ViewModel() {

    val characterList : LiveData<List<Character>> = liveData(Dispatchers.IO) {
        isLoading.postValue(true)
        emit(repository.getCharacters(house.name))
        isLoading.postValue(false)
    }

    val isLoading = MutableLiveData<Boolean>()

}