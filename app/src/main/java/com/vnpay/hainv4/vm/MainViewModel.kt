package com.vnpay.hainv4.vm

import android.app.Application
import androidx.lifecycle.ViewModel
import com.vnpay.hainv4.database.AccountDatabase
import com.vnpay.hainv4.model.Account

class MainViewModel(application: Application) : ViewModel() {

    private val accountDao = AccountDatabase.getInstance(application).getAccountDao()

    suspend fun getAllAccount():List<Account>{
        return accountDao.getAllAccount()
    }
    suspend fun addAccount(account: Account){
        accountDao.insertAccount(account)
    }
}