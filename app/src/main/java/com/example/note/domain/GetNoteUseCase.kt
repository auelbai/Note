package com.example.note.domain

class GetNoteUseCase(private val repository: Repository) {

    fun getNoteUseCase(id: Int) {
        repository.getNote(id)
    }
}