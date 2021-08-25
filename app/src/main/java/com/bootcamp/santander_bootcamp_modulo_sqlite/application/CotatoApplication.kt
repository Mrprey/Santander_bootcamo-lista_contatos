package com.bootcamp.santander_bootcamp_modulo_sqlite.application

import android.app.Application
import com.bootcamp.santander_bootcamp_modulo_sqlite.helpers.HelperDB

class ContatoApplication : Application() {

    var helperDB: HelperDB? = null
        private set

    companion object {
        lateinit var instance: ContatoApplication
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
        helperDB = HelperDB(this)
    }
}