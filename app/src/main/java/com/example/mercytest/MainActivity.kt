package com.example.mercytest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.strictmode.IntentReceiverLeakedViolation
import android.util.Log
import android.util.Patterns
import android.widget.Toast
import androidx.core.util.PatternsCompat.EMAIL_ADDRESS
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import kotlinx.android.synthetic.main.activity_main.*
import java.util.regex.Pattern

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()

        btnEntrar.setOnClickListener {

            if (validarCampos()) {
                clickConfirmado()
            }

        }
    }

    private fun clickConfirmado() {
        Toast.makeText(this, "Acesso Confirmado", Toast.LENGTH_LONG).show()
    }

    fun validarCampos(): Boolean {
        val email = edtLayoutEmail.text.toString()
        val senha = edtLayoutSenha.text.toString()

        var ehValido = true

        if (email.isEmpty()) {
            ehValido = false
            edtLayoutEmail.error = "Coloque seu email"
        }
        if (senha.isEmpty()) {
            ehValido = false
            edtLayoutSenha.error = "Coloque sua senha"
        }

        if (!validarEmail(email.trim())) {
            ehValido = false
            edtLayoutEmail.error = "Email Invalido"
        }

        return ehValido
    }
}