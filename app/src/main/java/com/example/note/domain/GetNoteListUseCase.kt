package com.example.note.domain

import androidx.lifecycle.LiveData

class GetNoteListUseCase(private val repository: Repository) {

    fun getNoteListUseCase(): LiveData<List<Note>> {
        return repository.getNoteList()
    }
}