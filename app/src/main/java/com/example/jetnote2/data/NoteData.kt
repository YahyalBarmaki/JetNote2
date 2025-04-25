package com.example.jetnote2.data

import com.example.jetnote2.model.Note

class NoteData {
    fun loadNotes(): List<Note> {
        return listOf(
            Note(title = "Grocery List", description = "Milk, Eggs, Bread, Coffee"),
            Note(
                title = "Workout Plan",
                description = "Monday: Chest, Tuesday: Back, Wednesday: Legs"
            ),
            Note(
                title = "Meeting Notes",
                description = "Finalize UI design and assign API integration tasks"
            ),
            Note(
                title = "Birthday Reminder",
                description = "Don't forget Sarah's birthday on April 25th"
            ),
            Note(
                title = "Reading List",
                description = "1. Clean Code\n2. Atomic Habits\n3. Kotlin in Action"
            ),
            Note(
                title = "Vacation Ideas",
                description = "Bali, Iceland, or Japan for summer vacation"
            ),
            Note(
                title = "App Feedback",
                description = "User reported slow loading on the login screen"
            ),
            Note(
                title = "Learning Goals",
                description = "Master MVVM with Jetpack Compose by end of May"
            ),
            Note(
                title = "Daily Journal",
                description = "Felt productive today, completed 3 major tasks"
            ),
            Note(
                title = "Recipe",
                description = "Pasta Carbonara: eggs, parmesan, pancetta, black pepper"
            )

        )
    }
}