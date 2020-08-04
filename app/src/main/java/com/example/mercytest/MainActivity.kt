package com.example.mercytest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.strictmode.IntentReceiverLeakedViolation
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()

        val email : TextInputEditText = findViewById(R.id.edtLayoutEmail)
        val senha : TextInputEditText = findViewById(R.id.edtLayoutSenha)

        btnEntrar.setOnClickListener {

            if(email.text.toString().isEmpty()) {

                email.error = "Coloque seu email"
            }
            if (senha.text.toString().isEmpty()){
                senha.error = "Coloque sua senha"
            }

            if(email.text.toString().isNotEmpty() && senha.text.toString().length > 0 ){

                Toast.makeText(this,"Acesso Confirmado",Toast.LENGTH_LONG).show()

            }


        }
   }
}