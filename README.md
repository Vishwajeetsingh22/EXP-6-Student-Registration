Experiment 6 – Student Registration App
📱 Project Overview

This project is an Android Student Registration Application developed using Kotlin and basic Android Views.

The app allows students to enter their personal and academic details, select a profile picture, choose a specialization and skills, and register successfully.

After registration, the app displays a success notification and shows all submitted details on a Registration Result screen.

🎯 Aim

To develop an Android application using basic Android Views and Kotlin for implementing a student registration form with validation, profile picture selection, notification, and a result screen.

✨ Features
Student registration form
Profile picture selection
Name and USN input
Email and phone number input
Gender selection
Specialization selection
General specialization option
Skills selection
Notification ON/OFF
Terms & Conditions
Input validation
Registration ID generation
Registration success notification
Registration result screen
Reset button
🛠️ Technologies Used
Technology	Purpose
Kotlin	Programming
Android Studio	Development
XML	UI Design
Android Views	User Interface
Intent	Passing data between Activities
Activity Result API	Profile image selection
NotificationCompat	Notifications
🔄 Application Flow
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
📂 Project Structure
EXP-6-Student-Registration/
│
├── app/
│   └── src/main/
│       ├── java/com/example/exp_6/
│       │   ├── MainActivity.kt
│       │   └── ResultActivity.kt
│       │
│       ├── res/
│       │   ├── drawable/
│       │   ├── layout/
│       │   │   ├── activity_main.xml
│       │   │   └── activity_result.xml
│       │   └── values/
│       │
│       └── AndroidManifest.xml
│
├── screenshots/
└── README.md

🖥️ Screenshots
<img width="1370" height="729" alt="Screenshot 2026-08-28 211627" src="https://github.com/user-attachments/assets/9748762d-6e9e-4bfc-b388-58107bc0b8c0" />
<img width="1373" height="731" alt="Screenshot 2026-08-28 211557" src="https://github.com/user-attachments/assets/85108be8-74d0-4c2c-98cc-901491a8b538" />
<img width="720" height="1600" alt="WhatsApp Image 2026-08-28 at 9 17 34 PM" src="https://github.com/user-attachments/assets/b005ec7a-e300-4a8d-830c-3ca7610a9cfa" />


https://github.com/user-attachments/assets/6c9d4111-936c-4bc3-b860-4070327f26c5




🧪 Test Cases
Test Case 1 – Successful Registration

Input: Valid student details with all required fields completed.

Expected Result: Registration is successful, notification is displayed, and the Result screen opens.

Status: PASS

Test Case 2 – Empty Name Validation

Input: Name field left empty.

Expected Result: An error message is displayed and registration does not continue.

Status: PASS

Test Case 3 – Name and USN Verification

Input:

Name: VISHWAJEET SINGH
USN: 25MCAR0219

Expected Result: The Name and USN are correctly displayed on the Registration Result screen.

Status: PASS

🔔 Notification

After successful registration, the application displays:

Registration Successful

You have been registered successfully.
📚 Concepts Used
Basic Android Views
EditText
TextView
Button
ImageButton
ImageView
RadioButton
RadioGroup
CheckBox
ToggleButton
ScrollView
Input Validation
Explicit Intent
putExtra()
getStringExtra()
Activity Result API
Android Notifications
Notification Channel
🎓 Learning Outcome

After completing this experiment, we learned how to:

Create an Android UI using basic Views.
Handle user input.
Validate form data.
Select and display an image.
Pass data between Activities.
Generate notifications.
Create a registration result screen.
Design a simple and authentic Android application.
✅ Result

The Student Registration Application was successfully developed using Kotlin and basic Android Views. The application successfully performs student registration, profile picture selection, input validation, notification display, and result screen navigation.

👨‍💻 Author

Name: VISHWAJEET SINGH
USN: 25MCAR0219
Course: MCA
Subject: Mobile Application Development
