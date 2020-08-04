package com.example.mercytest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_criar_conta.*
import java.lang.Integer.parseInt

class CriarConta : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_criar_conta)

        var conta = TesteConta()


        btnCriarConta.setOnClickListener {
            val voltarInicio = Intent (this, MainActivity::class.java)
            val intent = Intent(this, MainActivity::class.java)

            val criarNome = edtCriarNome.text.toString()
            val criarLogin = edtCriarLogin.text.toString()



//            conta.criarSenha = edtCriarSenha.text.toString()
//            conta.criarEmail = edtCriarEmail.text.toString()

            intent.putExtra("nome",criarNome)
            intent.putExtra("login",criarLogin)


            Toast.makeText(this,"Conta Criada Com Sucesso !!!",Toast.LENGTH_LONG)
            startActivity(voltarInicio)
        }

    }


}