package com.example.note.data

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.note.domain.Note

@Dao
interface NoteListDao {

    @Query("SELECT * FROM note_db")
    fun getNoteList(): LiveData<List<NoteDbModel>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun addNote(noteDbModel: NoteDbModel)

    @Query("DELETE FROM note_db WHERE :id = id")
    fun deleteNote(id: Int)

    @Query("SELECT * FROM note_db WHERE :id = id LIMIT 1")
    fun getNote(id: Int): NoteDbModel
}