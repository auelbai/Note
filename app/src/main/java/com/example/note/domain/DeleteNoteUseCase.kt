package com.example.note.domain

class DeleteNoteUseCase(private val repository: Repository) {

    fun deleteNoteUseCase(note: Note) {
        repository.deleteNote(note)
    }
}