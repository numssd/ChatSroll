package com.example.chatsroll

import android.graphics.Color
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.NestedScrollView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    private val messageData = mutableListOf(
        "Первое в мире SMS-сообщение продали в качестве NFT за 132 680 евро",
        "В РФ вступил закон о блокировке звонков и SMS из-за границы по подменным номерам",
        "Любой телефон можно взломать простым SMS-сообщением",
        "Эксперты оценили экономию банков от отмены СМС-уведомлений",
        "«Мегафон» оспорил в суде решение ФАС по делу об SMS-рассылках",
        "Банки потратили 20 млрд на SMS и переходят на push-уведомления",
        "ФАС признала «Вымпелком», МТС и Tele2 нарушителями антимонопольного законодательства",
        "J’son & Partners: выручка мобильного информирования составила 22,97 млрд рублей",
        "Банки потратили 20 млрд рублей на SMS и переходят на push-уведомления",
        "ФАС против «большой четверки»",
        "ФАС не смогла заставить операторов снизить цены на SMS-рассылки",
        "ФАС выдала предписание из-за повышения стоимости смс-рассылки",
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initDataMessage()

        addNewMessage()

    }


    private fun initDataMessage() {

        for (i in messageData) {
            val textViewMessage = TextView(this)
            textViewMessage.text = i
            textViewMessage.textSize = 30F
            textViewMessage.setBackgroundColor(Color.parseColor("#26A69A"))
            textViewMessage.setPadding(10, 10, 10, 10)
            val params = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            )
            params.setMargins(20, 20, 20, 20)
            textViewMessage.layoutParams = params

            container.addView(textViewMessage)
        }
    }

    private fun addNewMessage() {

        Handler(Looper.getMainLooper()).postDelayed({
            val textViewNewMessage = TextView(this@MainActivity)
            textViewNewMessage.text = "Новое сообщение"
            textViewNewMessage.textSize = 30F
            textViewNewMessage.setBackgroundColor(Color.parseColor("#26A69A"))
            textViewNewMessage.setPadding(10, 10, 10, 10)
            val params = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            )
            params.setMargins(20, 20, 20, 20)
            textViewNewMessage.layoutParams = params

            container.addView(textViewNewMessage)
        }, 2000)

        Handler(Looper.getMainLooper()).postDelayed({
            scrollVIewNested.fullScroll(NestedScrollView.FOCUS_DOWN)
        }, 3000)

    }
}