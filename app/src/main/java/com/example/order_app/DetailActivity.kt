package com.example.order_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Gravity
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.order_app.databinding.ActivityOrderDetailBinding

class DetailActivity : AppCompatActivity() {
    private lateinit var binding:ActivityOrderDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_order_detail)

        binding = ActivityOrderDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnOk.setOnClickListener {
            var userName = ""
            if(binding.editName.text.toString()=="")
                userName = "未知"
            else userName = binding.editName.text.toString()
            intent.putExtra("userName", userName)
            intent.putExtra("isTakeout",binding.chkTakeOut.isChecked)
            val drink = when(binding.rdgDrink.checkedRadioButtonId) {
                R.id.rbtnCoffee -> "咖啡"
                R.id.rbtnTea -> "茶"
                R.id.rbtnWater -> "氣泡水"
                else -> "未知"
            }
            intent.putExtra("drink",drink)
            val sugar = when(binding.rdgSugar.checkedRadioButtonId) {
                R.id.rbtnNoSugar -> "無糖"
                R.id.rbtnFullSugar -> "全糖"
                R.id.rbtnHalfSugar -> "半糖"
                else -> "未知"
            }
            intent.putExtra("sugar",sugar)
            setResult(RESULT_OK, intent)
            finish()
        }
        binding.btnCancel.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("提醒")
                .setMessage("是否要取消訂餐？")
                .setPositiveButton("是"){dialog, which->
                    setResult(RESULT_CANCELED)
                    finish()
                    val toast = Toast.makeText(this, R.string.cancel_toast, Toast.LENGTH_LONG)
                    toast.setGravity(Gravity.BOTTOM, 0, 0)
                    toast.show()
                    Log.d("AlertDialog", "AlertDiaDialog.Builder: positive" + which)
                }
                .setNegativeButton("否"){dialog, which->
                    Log.d("AlertDialog", "AlertDialog.Builder: negative $which")
                }
                .show()

        }
    }
}