package com.example.note.domain

import androidx.lifecycle.LiveData

interface Repository {

    fun getNoteList(): LiveData<List<Note>>

    fun addNote(note: Note)

    fun editNote(note: Note)

    fun deleteNote(note: Note)

    fun getNote(id: Int): Note
}