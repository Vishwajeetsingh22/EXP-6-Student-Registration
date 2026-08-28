# Experiment 6 – Student Registration App

## 📱 Project Overview

This project is an Android **Student Registration Application** developed using **Kotlin and Basic Android Views**.

The application allows students to enter their personal and academic details, select a profile picture, choose a specialization and skills, and register successfully.

After successful registration, the application displays a **registration success notification** and shows all submitted information on a separate **Registration Result screen**.

---

## 🎯 Aim

To develop an Android application using basic Android Views and Kotlin for implementing a student registration form with validation, profile picture selection, notification functionality, and a registration result screen.

---

## ✨ Features

- Student registration form
- Profile picture selection
- Name and USN input
- Email and phone number input
- Gender selection
- Specialization selection
- General specialization option
- AI & ML specialization
- Data Science specialization
- Cyber Security specialization
- Skills selection
- Notification ON/OFF
- Terms & Conditions
- Input validation
- Registration ID generation
- Registration success notification
- Registration result screen
- Reset button

---

## 🛠️ Technologies Used

| Technology | Purpose |
|---|---|
| Kotlin | Programming |
| Android Studio | Development |
| XML | UI Design |
| Android Views | User Interface |
| Intent | Passing data between Activities |
| Activity Result API | Profile image selection |
| NotificationCompat | Notifications |

---

## 🔄 Application Flow

```text
Registration Form
       ↓
Enter Student Details
       ↓
Select Profile Picture
       ↓
Select Gender & Specialization
       ↓
Select Skills
       ↓
Accept Terms & Conditions
       ↓
     REGISTER
       ↓
Registration Successful
       ↓
Notification + Result Screen
```

---

## 📂 Project Structure

```text
EXP-6-Student-Registration/
│
├── app/
│   └── src/
│       └── main/
│           ├── java/
│           │   └── com/example/exp_6/
│           │       ├── MainActivity.kt
│           │       └── ResultActivity.kt
│           │
│           ├── res/
│           │   ├── drawable/
│           │   ├── layout/
│           │   │   ├── activity_main.xml
│           │   │   └── activity_result.xml
│           │   └── values/
│           │
│           └── AndroidManifest.xml
│
├── screenshots/
│   ├── registration-page.png
│   ├── profile-photo.png
│   ├── registration-notification.png
│   ├── result-page.png
│   ├── test-case-1.png
│   ├── test-case-2.png
│   └── test-case-3.png
│
└── README.md

## 📚 Concepts Used

- Basic Android Views
- TextView
- EditText
- Button
- ImageButton
- ImageView
- RadioButton
- RadioGroup
- CheckBox
- ToggleButton
- ScrollView
- Input Validation
- Explicit Intent
- `putExtra()`
- `getStringExtra()`
- Activity Result API
- Image Selection
- Android Notifications
- Notification Channel
- Notification Permission
- Kotlin Event Handling
- XML Layout Design


## 🎓 Learning Outcome

After completing this experiment, we learned how to:

- Create an Android UI using basic Views.
- Handle user input using Kotlin.
- Validate form data.
- Select and display a profile image.
- Use RadioButton and CheckBox controls.
- Use ToggleButton for ON/OFF functionality.
- Pass data between Activities using Intent.
- Generate and display notifications.
- Generate a Registration ID.
- Create a separate Result screen.
- Design a simple and authentic Android application.


## ▶️ How to Run

1. Open the project in **Android Studio**.
2. Allow Gradle Sync to complete.
3. Connect an Android device or start an emulator.
4. Click **Run ▶**.
5. Enter the student details.
6. Select a profile picture.
7. Select gender and specialization.
8. Select skills.
9. Accept Terms & Conditions.
10. Click **REGISTER**.
11. Allow notification permission if requested.
12. Check the registration notification.
13. View the Registration Result screen.


## 📝 Sample Input


Name: VISHWAJEET SINGH
USN: 25MCAR0219
Email: vickeysingh596.25@gmail.com
Phone: 7277672052
Gender: Male
Specialization: General
Skills: Programming, IoT
Notifications: ON
Terms: Accepted


## 📤 Output

After successful registration:


Registration Successful

Name: VISHWAJEET SINGH
USN: 25MCAR0219
Email: vickeysingh596.25@gmail.com
Phone: 7277672052
Gender: Male
Specialization: General
Skills: Programming, IoT
Notifications: ON
Registration ID: STU123456

## 🖥️ Screenshots


https://github.com/user-attachments/assets/159572cf-1d34-4712-bbd4-9f4cb9472af5

<img width="720" height="1600" alt="WhatsApp Image 2026-08-28 at 9 17 34 PM" src="https://github.com/user-attachments/assets/264ef161-29c4-4f3d-9962-99b93e8cca52" />
<img width="1370" height="729" alt="Screenshot 2026-08-28 211627" src="https://github.com/user-attachments/assets/3dc5eb4d-848e-4e7c-9435-a1caacfd921c" />
<img width="1373" height="731" alt="Screenshot 2026-08-28 211557" src="https://github.com/user-attachments/assets/01c608de-be02-4992-be57-e173808f8bb4" />





## 👨‍💻 Author

Name:VISHWAJEET SINGH  
USN: 25MCAR0219  
Course:Master of Computer Applications (MCA)  
Subject: Mobile Application Development (MAD)  
College: Jain (Deemed-to-be University)


## ✅ Result

The **Student Registration Application** was successfully developed using **Kotlin and Basic Android Views**.

The application successfully implements student registration, profile picture selection, input validation, specialization and skills selection, notification functionality, Registration ID generation, and display of submitted details on a separate Result screen.
