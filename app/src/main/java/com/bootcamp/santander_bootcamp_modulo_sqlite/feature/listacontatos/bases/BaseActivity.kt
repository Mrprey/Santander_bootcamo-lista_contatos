package com.bootcamp.santander_bootcamp_modulo_sqlite.feature.listacontatos.bases

import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.bootcamp.santander_bootcamp_modulo_sqlite.R

open class BaseActivity : AppCompatActivity(){
    protected fun setupToolBar(toolBar: Toolbar, title: String, navgationBack: Boolean) {
        toolBar.title = title
        setSupportActionBar(toolBar)
        supportActionBar?.setDisplayHomeAsUpEnabled(navgationBack)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.home -> {
                this.onBackPressed()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}