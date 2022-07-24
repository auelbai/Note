package com.example.note.domain

class EditNoteUseCase(private val repository: Repository) {

    fun editNoteUseCase(note: Note) {
        repository.editNote(note)
    }
}