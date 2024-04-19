package com.example.tienda

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ProductosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_productos)

        // Obtener la referencia del RecyclerView
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerViewProductos)

        // Crear una lista de productos (esto debería ser reemplazado con tus datos reales)
        val productos = listOf(
            Producto("Producto 1", "Descripción del producto 1", 10.99, R.drawable.producto1),
            Producto("Producto 2", "Descripción del producto 2", 15.99, R.drawable.producto2),
            Producto("Producto 3", "Descripción del producto 3", 20.99, R.drawable.producto3),
            // Agrega más productos aquí según sea necesario
        )

        // Crear un adaptador para el RecyclerView
        val adapter = ProductosAdapter(productos)

        // Asignar el adaptador al RecyclerView
        recyclerView.adapter = adapter

        // Asignar un LinearLayoutManager al RecyclerView
        recyclerView.layoutManager = LinearLayoutManager(this)
    }
}
