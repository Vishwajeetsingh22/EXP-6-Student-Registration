# Experiment 6 – Student Registration App

## 📱 Project Overview

Student Registration App is an Android application developed using **Kotlin, XML, and Basic Android Views**.

The app allows students to enter their personal and academic details, select a profile picture, choose specialization and skills, and complete registration.

After registration, the app displays a success notification and shows the submitted details on a separate result screen.

## 🎯 Aim

To develop an Android student registration application using Kotlin and basic Android Views with form validation, profile image selection, notifications, and a result screen.

## ✨ Features

- Student registration form
- Name and USN input
- Email and phone number input
- Profile picture selection
- Gender selection
- Specialization selection
- Skills selection
- Notification ON/OFF
- Terms & Conditions
- Input validation
- Registration ID generation
- Registration success notification
- Registration result screen
- Reset button

## 🛠️ Technologies Used

| Technology | Purpose |
|------------|---------|
| Kotlin | Application programming |
| Android Studio | Development |
| XML | UI design |
| Android Views | User interface |
| Intent | Passing data between activities |
| Activity Result API | Profile image selection |
| NotificationCompat | Notifications |

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
│   ├── registration.png
│   ├── result.png
│   └── notification.png
│
└── README.md
```

## 📚 Concepts Used

- Basic Android Views
- TextView
- EditText
- Button
- ImageView
- RadioButton
- RadioGroup
- CheckBox
- ToggleButton
- ScrollView
- Input Validation
- Intent
- `putExtra()`
- `getStringExtra()`
- Activity Result API
- Image Selection
- Android Notifications
- Notification Channel
- Kotlin Event Handling
- XML Layout Design

## 🎓 Learning Outcome

After completing this experiment, I learned how to:

- Create Android interfaces using basic Views
- Handle user input using Kotlin
- Validate form data
- Select and display a profile image
- Use RadioButton, CheckBox, and ToggleButton
- Pass data between activities using Intent
- Create Android notifications
- Generate a Registration ID
- Create a separate Result screen
- Design a functional Android application

## ▶️ How to Run

1. Open the project in **Android Studio**.
2. Allow Gradle Sync to complete.
3. Connect an Android device or start an emulator.
4. Click **Run ▶**.
5. Enter the student details.
6. Select a profile picture.
7. Select gender, specialization, and skills.
8. Accept Terms & Conditions.
9. Click **REGISTER**.
10. Allow notification permission if requested.
11. View the registration notification.
12. Check the Registration Result screen.

## 🖥️ Screenshots

### Registration Form
<img width="1373" height="731" alt="Screenshot 2026-08-28 211557" src="https://github.com/user-attachments/assets/8f5bf9a6-31c7-45a2-982a-721d81ebec62" />

![Registration Form](screenshots/registration.png)

### Registration Result
<img width="1370" height="729" alt="Screenshot 2026-08-28 211627" src="https://github.com/user-attachments/assets/d471ccb4-1f69-4f20-bc66-c6d460ca151e" />

![Registration Result](screenshots/result.png)

### Notification
<img width="720" height="1600" alt="WhatsApp Image 2026-08-28 at 9 17 34 PM" src="https://github.com/user-attachments/assets/19fa16ae-cf09-45a0-a778-f421c907c6ef" />

![Notification](screenshots/notification.png)


https://github.com/user-attachments/assets/c30dc34f-8a91-4002-8f43-b87b2139415a



## 👨‍💻 Author

**VISHWAJEET SINGH**

- **USN:** 25MCAR0219
- **Course:** Master of Computer Applications (MCA)
- **Subject:** Mobile Application Development (MAD)
- **College:** Jain (Deemed-to-be University)

## ✅ Result

The **Student Registration Application** was successfully developed using Kotlin and Basic Android Views.

The application implements student registration, profile picture selection, input validation, specialization and skills selection, notification functionality, Registration ID generation, and a separate Result screen.
