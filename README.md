# JetNote2

A modern note-taking application built with Jetpack Compose and following MVVM architecture pattern.

## Overview

JetNote2 is an Android application that allows users to create, read, update, and delete notes. The app is built using modern Android development practices including Jetpack Compose for UI, Room for data persistence, Hilt for dependency injection, and MVVM architecture.

## Project Structure

The project follows a clean architecture approach with the following structure:

- **component**: UI components used across the app
- **data**: Data layer including entity classes and database implementations
  - `NoteData`: Note data entity
  - `NoteDataBase`: Room database implementation
  - `NoteDatabaseDao`: Data Access Object for database operations
- **di**: Dependency injection modules
- **model**: Domain models
  - `Note`: Note domain model
- **repository**: Repository layer for data operations
  - `NoteRepository`: Handles data operations between the ViewModel and data sources
- **screens**: UI screens
  - `NoteScreen.kt`: Main note screen implementation
  - `NoteViewModel`: ViewModel for handling UI logic
- **utils**: Utility classes
  - `DateConverter`: Utility for date conversions
  - `UUIDConverter`: Utility for UUID conversions

## Technologies Used

- **Jetpack Compose**: Modern toolkit for building native UI
- **Kotlin Coroutines**: For asynchronous programming
- **Room**: SQLite object mapping library
- **Hilt**: Dependency injection library
- **MVVM Architecture**: Separation of concerns with Model-View-ViewModel pattern
- **Lifecycle Components**: For lifecycle-aware programming

## Setup Requirements

- Android Studio Hedgehog or later
- Kotlin 1.9.22 or higher
- Android SDK 35
- Gradle 8.2

## Getting Started

1. Clone the repository
```
git clone https://github.com/yourusername/JetNote2.git
```

2. Open the project in Android Studio

3. Sync project with Gradle files

4. Run the app on an emulator or physical device with API 26+

## Features

- Create new notes with title and content
- View list of saved notes
- Edit existing notes
- Delete notes
- Automatic date/time stamping of notes

## License

[Add your license information here]

## Contributing

Contributions are welcome! Please feel free to submit a Pull Request.

## Contact

[Add your contact information here]
