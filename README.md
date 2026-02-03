📝 Notes App – Jetpack Compose

A modern Android Notes application built using Jetpack Compose, following clean architecture principles and recommended Android development practices. The app allows users to create, edit, delete, and organize notes with a smooth and intuitive UI.

🚀 Features

Create, update, and delete notes

Offline-first architecture

Clean and minimal UI built with Jetpack Compose

Search and filter notes

Local data persistence

Light/Dark theme support

MVVM architecture with state management

🛠 Tech Stack

Kotlin – Primary language

Jetpack Compose – Declarative UI

Room Database – Local storage

ViewModel & LiveData / StateFlow – State management

Coroutines & Flow – Asynchronous operations

Navigation Compose – In-app navigation

Material 3 – Modern UI components

🏗 Architecture

The project follows MVVM + Clean Architecture:

UI Layer – Compose screens, state handling

Domain Layer – Business logic, use cases

Data Layer – Repository & Room database

This separation makes the app scalable, testable, and maintainable.

📂 Project Structure
app
 ┣ data
 ┃ ┣ local
 ┃ ┣ repository
 ┣ domain
 ┃ ┣ model
 ┃ ┣ usecase
 ┣ ui
 ┃ ┣ screens
 ┃ ┣ components
 ┃ ┣ theme

▶️ How to Run

Clone the repository

Open in Android Studio (latest version recommended)

Sync Gradle

Run on emulator or physical device

📌 Future Improvements

Add note categories & tags

Image attachments in notes

Export notes as PDF

Cloud sync support

Unit & UI tests

🤝 Contributions

Feel free to open issues or submit pull requests. Any suggestions to improve architecture or UI are welcome.
