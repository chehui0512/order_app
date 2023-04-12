// 組員名單
// 11136005 羅毓翔
// 11136007 林哲卉
// 11136008 郭溱卉
package com.example.order_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.result.contract.ActivityResultContracts

class MainActivity : AppCompatActivity() {
    private lateinit var txtUserName: TextView
    private lateinit var txtTakeOut: TextView
    private lateinit var txtDrink: TextView
    private lateinit var txtSugar: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtUserName = findViewById(R.id.txtUserName)
        txtTakeOut = findViewById(R.id.txtTakeOut)
        txtDrink = findViewById(R.id.txtDrink)
        txtSugar = findViewById(R.id.txtSugar)

        val launcherDetail = registerForActivityResult(ActivityResultContracts.StartActivityForResult()){result->
            if(result.resultCode == RESULT_OK){
                val userName = result.data?.getStringExtra("userName")
                txtUserName.text = userName
                result.data?.getBooleanExtra("isTakeout", false)
                    ?.let { isCheck->
                        txtTakeOut.text = if(isCheck) "外帶"
                        else "內用"
                    }
                result.data?.getStringExtra("drink")?.let {
                        txtDrink.text = it
                    }
                result.data?.getStringExtra("sugar")?.let {
                    txtSugar.text = it
                }
            }
        }
        findViewById<Button>(R.id.btnOrder).setOnClickListener {
            val it = Intent(this, DetailActivity::class.java)
            launcherDetail.launch(it)
        }
    }
}