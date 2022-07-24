package com.example.note.domain

class AddNoteUseCase(private val repository: Repository) {

    fun addNoteUseCase(note: Note) {
        repository.addNote(note)
    }
}