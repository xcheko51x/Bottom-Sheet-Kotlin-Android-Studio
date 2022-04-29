package com.example.bottomsheetkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.google.android.material.bottomsheet.BottomSheetDialog

class MainActivity : AppCompatActivity() {

    lateinit var btnMuestraBottomSheet: Button
    lateinit var tvNombre: TextView
    lateinit var tvEdad: TextView
    lateinit var tvPuesto: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var trabajador = object {
            var nombre = "Sergio Peralta"
            var edad = 33
            var puesto = "Developer"
        }

        btnMuestraBottomSheet = findViewById(R.id.idBtnShowBottomSheet)

        btnMuestraBottomSheet.setOnClickListener(View.OnClickListener {

            val dialog = BottomSheetDialog(this)
            val vista = layoutInflater.inflate(R.layout.bottom_sheet_dialog, null)

            tvNombre = vista.findViewById(R.id.tvNombre)
            tvEdad = vista.findViewById(R.id.tvEdad)
            tvPuesto = vista.findViewById(R.id.tvPuesto)

            tvNombre.text = trabajador.nombre
            tvEdad.text = "EDAD: ${trabajador.edad}"
            tvPuesto.text = "PUESTO: ${trabajador.puesto}"

            dialog.setCancelable(true)
            dialog.setContentView(vista)

            dialog.show()

        })

    }
}