package org.fossify.messages.arj.interfaces

import androidx.room.Dao
import androidx.room.Query
import org.fossify.messages.arj.models.Attachment

@Dao
interface AttachmentsDao {
    @Query("SELECT * FROM attachments")
    fun getAll(): List<Attachment>
}
