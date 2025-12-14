package org.fossify.messages.arj.interfaces

import androidx.room.Dao
import androidx.room.Query
import org.fossify.messages.arj.models.MessageAttachment

@Dao
interface MessageAttachmentsDao {
    @Query("SELECT * FROM message_attachments")
    fun getAll(): List<MessageAttachment>
}
