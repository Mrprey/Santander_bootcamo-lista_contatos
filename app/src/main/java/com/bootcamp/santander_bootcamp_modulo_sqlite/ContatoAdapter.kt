package com.bootcamp.santander_bootcamp_modulo_sqlite

import android.content.Context
import android.view.LayoutInflater

class ContatoAdapter {
    private  val context : Context
    private  val lista: List<ContatosVO>
    private  val onClick: ((Int) -> Unit)
} : RecyclerView.Adapter<ContatoViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContatoViewHolder {
        val view: View = LayoutInflater.from(context).inflate(R.layout.item_contato, parent, false)
        return ContatoViewHolder(view)
    }

    override fun getItemCount(): Int = lista.size

    override fun onBindViewHolder(holder: ContatoViewHolder, position: Int){
        val contato = lista[position]
        with(holder.itemView){
            tvNome.text = contato.nome
            tvTelefone = contato.telefone

        }
    }
}

class ContatoViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)