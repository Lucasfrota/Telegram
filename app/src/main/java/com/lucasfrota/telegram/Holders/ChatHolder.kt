package com.lucasfrota.telegram.Holders

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.lucasfrota.telegram.Models.ChatItem
import kotlinx.android.synthetic.main.chat_item.view.*

class ChatHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

    fun setItemUp(chatItem: ChatItem){
        itemView.chatSubject.text = chatItem.chatSubject
        itemView.ChatSentMessageTimeStamp.text = chatItem.ChatSentMessageTimeStamp
        itemView.ChatSentMessageTimeStamp.text = chatItem.ChatSentMessageTimeStamp
    }

}