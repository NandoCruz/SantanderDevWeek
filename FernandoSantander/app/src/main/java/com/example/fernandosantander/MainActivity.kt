package com.example.fernandosantander


import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflate = menuInflater
        inflate.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId){
            R.id.item_0 -> {
                Toast.makeText(applicationContext, "Notificação foi clicado", Toast.LENGTH_SHORT).show()
                true }
            R.id.item_1 -> {
                Toast.makeText(applicationContext, "Emprestimo foi clicado", Toast.LENGTH_SHORT).show()
                true }
            R.id.item_2 -> {
                Toast.makeText(applicationContext, "Financiamento foi clicado", Toast.LENGTH_SHORT).show()
                true }
            R.id.item_3 -> {
                Toast.makeText(applicationContext, "Investimento foi clicado", Toast.LENGTH_SHORT).show()
                true }
            R.id.item_4 -> {
                Toast.makeText(applicationContext, "Seguro foi clicado", Toast.LENGTH_SHORT).show()
                true }
            R.id.item_5 -> {
                Toast.makeText(applicationContext, "Consórcio foi clicado", Toast.LENGTH_SHORT).show()
                true }
            R.id.item_6 -> {
                Toast.makeText(applicationContext, "Cobrar foi clicado", Toast.LENGTH_SHORT).show()
                true }
            R.id.item_7 -> {
                Toast.makeText(applicationContext, "Comprovante foi clicado", Toast.LENGTH_SHORT).show()
                true }
            R.id.item_8 -> {
                Toast.makeText(applicationContext, "Sair foi clicado", Toast.LENGTH_SHORT).show()
                true }
            else -> super.onOptionsItemSelected(item)
        }
    }
}
