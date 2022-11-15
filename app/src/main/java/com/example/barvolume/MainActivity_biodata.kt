package com.example.barvolume

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.DatePicker
import android.widget.EditText
import java.util.*

class MainActivity_biodata : AppCompatActivity(), View.OnClickListener {
    lateinit var etTanggal : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_biodata)

        val btnSimpan: Button= findViewById(R.id.btn_simpan)
        btnSimpan.setOnClickListener(this)

        etTanggal = findViewById(R.id.et_input_tanggal)
        etTanggal.setOnClickListener{
            val c = Calendar.getInstance()
            val year =c.get(Calendar.YEAR)
            val month =c.get(Calendar.MONTH)
            val day =c.get(Calendar.DAY_OF_MONTH)

            val datePickerDialog=DatePickerDialog(this, {view, year, monthOfYear, dayOfMonth ->
                val dat = (dayOfMonth.toString()+ "-" +
                            (monthOfYear +1)+ "-" +year)
                    etTanggal.setText(dat)
                }, year, month, day)
            datePickerDialog
        }
        fun OnClick(y: View){
            when(y?.id){
                R.id.btn_simpan->{
                    val edit_nama_depan : EditText = findViewById(R.id.et_input_namaDepan)
                    val edit_nama_belakang : EditText = findViewById(R.id.et_input_namaBelakang)
                }
            }
        }
}

    override fun onClick(p0: View?) {
        TODO("Not yet implemented")
    }


}