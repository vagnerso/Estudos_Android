package com.example.loginretrofit

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.loginretrofit.model.Posts

class PostsAdapter(val posts: List<Posts>) : RecyclerView.Adapter<PostsAdapter.PostsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostsViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.post_item, parent, false)
        return PostsViewHolder(view)
    }

    override fun getItemCount(): Int = posts.size

    override fun onBindViewHolder(holder: PostsViewHolder, position: Int) {
        holder.bind(posts[position])
    }

    inner class PostsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bind(posts: Posts){
            with(posts) {
                val hash = posts.hashCode()
                itemView.txt_icon.text = posts.first().toString
                itemView.txt_user.background = posts.title.first().toString()
            }
        }
    }

}