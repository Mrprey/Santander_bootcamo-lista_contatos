package com.bootcamp.santander_bootcamp_modulo_sqlite.singleton

import com.bootcamp.santander_bootcamp_modulo_sqlite.feature.listacontatos.model.ContatosVO

object ContatoSingleton {
    var lista: MutableList<ContatosVO> = mutableListOf()
}