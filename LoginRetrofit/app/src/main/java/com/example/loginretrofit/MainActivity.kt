package com.example.loginretrofit

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.loginretrofit.api.Endpoint
import com.example.loginretrofit.model.Posts
import com.example.loginretrofit.util.NetworkUtils
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    private lateinit var textViewPosts : TextView
    private lateinit var recycler_view_main : RecyclerView;
    private lateinit var listPosts : List<Posts>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getData()

        recycler_view_main.adapter = PostsAdapter(listPosts)
        recycler_view_main.layoutManager = LinearLayoutManager(this)


    }

    private fun getData() {
       val retrofitClient = NetworkUtils.getRetrofitInstance("https://jsonplaceholder.typicode.com")
       val endpoint = retrofitClient.create(Endpoint::class.java)

       val callback = endpoint.getPosts()

       callback.enqueue(object : Callback<List<Posts>> {
           override fun onFailure(call: Call<List<Posts>>, t: Throwable) {
               Toast.makeText(baseContext, t.message, Toast.LENGTH_SHORT).show()
           }

           override fun onResponse(call: Call<List<Posts>>, response: Response<List<Posts>>) {
               response.body()?.forEach {

                   listPosts.
                   listPosts = (Posts(it.body))
                   //Toast.makeText(baseContext, it.body.toString(), Toast.LENGTH_SHORT).show()

               }


           }



       })

    }

}