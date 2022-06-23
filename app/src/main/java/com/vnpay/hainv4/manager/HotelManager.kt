package com.vnpay.hainv4.manager

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.vnpay.hainv4.model.Item

object HotelManager {
    var type = arrayListOf<Item>()
    var allComic = arrayListOf<Comic>()
    var currentComic: Comic? = null
    private var allComics = MutableLiveData<ArrayList<Comic>>()
    val listComic: LiveData<ArrayList<Comic>>
        get() = allComics

    private fun getComic(): List<Comic>{
        val list = comic
        list?.forEach{
            allComic.addAll(listOf(it))
        }
        return allComic
    }
    fun getAllComic() {
        getComic()
        allComics.postValue(allComic)
    }


    fun setCurrentComic(c: Comic): Int{
        for (i in 0 until comic.size){
            if (comic[i] == c){
                currentComic = c
                return 1
            }
        }
        return -1
    }
}