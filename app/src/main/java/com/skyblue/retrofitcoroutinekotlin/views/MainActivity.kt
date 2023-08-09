package com.skyblue.retrofitcoroutinekotlin.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import com.skyblue.retrofitcoroutinekotlin.R
import com.skyblue.retrofitcoroutinekotlin.databinding.ActivityMainBinding
import com.skyblue.retrofitcoroutinekotlin.retrofit.APIClient
import com.skyblue.retrofitcoroutinekotlin.retrofit.APIInterface
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    @OptIn(DelicateCoroutinesApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val apiInterface = APIClient.getInstance().create(APIInterface::class.java)

        // launching a new coroutine
        GlobalScope.launch {
            val result = apiInterface.getQuotes()
            Log.e("prasanth: ", result.body().toString())
        }
    }
}