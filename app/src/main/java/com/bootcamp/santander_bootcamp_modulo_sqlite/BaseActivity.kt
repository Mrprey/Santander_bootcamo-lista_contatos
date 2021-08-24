package com.bootcamp.santander_bootcamp_modulo_sqlite

import android.widget.Toolbar
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class BaseActivity: AppCompatActivity() {

    protected fun setupToolBar(toolBar: Toolbar, title: String, navegationBack: Boolean){
        toolBar.title = title
        setSupportActionBar(tollBar)
        supportActionBar?.setDisplayHomeAsUpEnabled(navigableBack)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean{
        when (item.itemId){
            R.id.home -> {
                this.onBackPressed()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }

}