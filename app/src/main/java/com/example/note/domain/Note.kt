package com.example.note.domain

data class Note(
    val title: String,
    val description: String,
    val color: Int,
    val lastUpdate: String,
    val id: Int = UNDEFINED_ID
) {
    companion object {
        const val UNDEFINED_ID = -1
    }
}
