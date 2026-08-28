package com.example.exp_6

import android.Manifest
import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.ImageButton
import android.widget.RadioGroup
import android.widget.Toast
import android.widget.ToggleButton
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    // ------------------------------------------------
    // Form Views
    // ------------------------------------------------

    private lateinit var etName: EditText
    private lateinit var etUSN: EditText
    private lateinit var etEmail: EditText
    private lateinit var etPhone: EditText

    private lateinit var rgGender: RadioGroup
    private lateinit var rgSpecialization: RadioGroup

    private lateinit var cbProgramming: CheckBox
    private lateinit var cbIoT: CheckBox
    private lateinit var cbAI: CheckBox
    private lateinit var cbWeb: CheckBox
    private lateinit var cbTerms: CheckBox

    private lateinit var toggleNotifications: ToggleButton

    private lateinit var btnProfile: ImageButton
    private lateinit var btnRegister: Button
    private lateinit var btnClear: Button

    // ------------------------------------------------
    // Profile Image
    // ------------------------------------------------

    private var profileImageUri: Uri? = null

    // ------------------------------------------------
    // Notification
    // ------------------------------------------------

    companion object {

        private const val CHANNEL_ID =
            "student_registration_channel"

        private const val NOTIFICATION_ID = 1001

        private const val NOTIFICATION_PERMISSION_CODE = 101
    }

    // ------------------------------------------------
    // Gallery
    // ------------------------------------------------

    private val galleryLauncher =
        registerForActivityResult(
            ActivityResultContracts.GetContent()
        ) { uri: Uri? ->

            if (uri != null) {

                profileImageUri = uri

                btnProfile.setImageURI(uri)

                btnProfile.setPadding(
                    0,
                    0,
                    0,
                    0
                )

                Toast.makeText(
                    this,
                    getString(
                        R.string.msg_profile_photo_selected
                    ),
                    Toast.LENGTH_SHORT
                ).show()
            }
        }

    // ------------------------------------------------
    // onCreate
    // ------------------------------------------------

    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        initializeViews()

        createNotificationChannel()

        // Profile photo
        btnProfile.setOnClickListener {

            galleryLauncher.launch("image/*")
        }

        // Register
        btnRegister.setOnClickListener {

            registerStudent()
        }

        // Reset
        btnClear.setOnClickListener {

            clearForm()
        }
    }

    // ------------------------------------------------
    // Initialize Views
    // ------------------------------------------------

    private fun initializeViews() {

        etName = findViewById(R.id.etName)
        etUSN = findViewById(R.id.etUSN)
        etEmail = findViewById(R.id.etEmail)
        etPhone = findViewById(R.id.etPhone)

        rgGender = findViewById(R.id.rgGender)
        rgSpecialization =
            findViewById(R.id.rgSpecialization)

        cbProgramming =
            findViewById(R.id.cbProgramming)

        cbIoT =
            findViewById(R.id.cbIoT)

        cbAI =
            findViewById(R.id.cbAI)

        cbWeb =
            findViewById(R.id.cbWeb)

        cbTerms =
            findViewById(R.id.cbTerms)

        toggleNotifications =
            findViewById(R.id.toggleNotifications)

        btnProfile =
            findViewById(R.id.btnProfile)

        btnRegister =
            findViewById(R.id.btnRegister)

        btnClear =
            findViewById(R.id.btnClear)
    }

    // ------------------------------------------------
    // Register Student
    // ------------------------------------------------

    private fun registerStudent() {

        val name =
            etName.text.toString().trim()

        val usn =
            etUSN.text.toString().trim()

        val email =
            etEmail.text.toString().trim()

        val phone =
            etPhone.text.toString().trim()


        // Name
        if (name.isEmpty()) {

            etName.error =
                getString(
                    R.string.error_enter_name
                )

            etName.requestFocus()

            return
        }


        // USN
        if (usn.isEmpty()) {

            etUSN.error =
                getString(
                    R.string.error_enter_usn
                )

            etUSN.requestFocus()

            return
        }


        // Email
        if (email.isEmpty()) {

            etEmail.error =
                getString(
                    R.string.error_enter_email
                )

            etEmail.requestFocus()

            return
        }


        if (
            !android.util.Patterns
                .EMAIL_ADDRESS
                .matcher(email)
                .matches()
        ) {

            etEmail.error =
                getString(
                    R.string.error_valid_email
                )

            etEmail.requestFocus()

            return
        }


        // Phone
        if (phone.isEmpty()) {

            etPhone.error =
                getString(
                    R.string.error_enter_phone
                )

            etPhone.requestFocus()

            return
        }


        if (
            !phone.matches(
                Regex("^[0-9]{10}$")
            )
        ) {

            etPhone.error =
                getString(
                    R.string.error_valid_phone
                )

            etPhone.requestFocus()

            return
        }


        // ------------------------------------------------
        // Gender
        // ------------------------------------------------

        val genderId =
            rgGender.checkedRadioButtonId

        if (genderId == -1) {

            Toast.makeText(
                this,
                getString(
                    R.string.error_select_gender
                ),
                Toast.LENGTH_SHORT
            ).show()

            return
        }


        val genderButton =
            findViewById<android.widget.RadioButton>(
                genderId
            )

        val gender =
            genderButton.text.toString()


        // ------------------------------------------------
        // Specialization
        // ------------------------------------------------

        val specializationId =
            rgSpecialization.checkedRadioButtonId

        if (specializationId == -1) {

            Toast.makeText(
                this,
                getString(
                    R.string.error_select_specialization
                ),
                Toast.LENGTH_SHORT
            ).show()

            return
        }


        val specializationButton =
            findViewById<android.widget.RadioButton>(
                specializationId
            )

        val specialization =
            specializationButton.text.toString()


        // ------------------------------------------------
        // Skills
        // ------------------------------------------------

        val skills =
            mutableListOf<String>()

        if (cbProgramming.isChecked) {

            skills.add("Programming")
        }

        if (cbIoT.isChecked) {

            skills.add("IoT")
        }

        if (cbAI.isChecked) {

            skills.add("Artificial Intelligence")
        }

        if (cbWeb.isChecked) {

            skills.add("Web Development")
        }


        val skillsText =

            if (skills.isEmpty()) {

                getString(
                    R.string.no_skills_selected
                )

            } else {

                skills.joinToString(", ")
            }


        // ------------------------------------------------
        // Terms
        // ------------------------------------------------

        if (!cbTerms.isChecked) {

            Toast.makeText(
                this,
                getString(
                    R.string.error_accept_terms
                ),
                Toast.LENGTH_SHORT
            ).show()

            return
        }


        // ------------------------------------------------
        // Notification
        // ------------------------------------------------

        val notificationsEnabled =
            toggleNotifications.isChecked


        // ------------------------------------------------
        // Registration ID
        // ------------------------------------------------

        val registrationId =
            "STU" +
                    System.currentTimeMillis()
                        .toString()
                        .takeLast(6)


        // ------------------------------------------------
        // Create Result Intent
        // ------------------------------------------------

        val intent =
            Intent(
                this,
                ResultActivity::class.java
            )

        intent.putExtra(
            "NAME",
            name
        )

        intent.putExtra(
            "USN",
            usn
        )

        intent.putExtra(
            "EMAIL",
            email
        )

        intent.putExtra(
            "PHONE",
            phone
        )

        intent.putExtra(
            "GENDER",
            gender
        )

        intent.putExtra(
            "SPECIALIZATION",
            specialization
        )

        intent.putExtra(
            "SKILLS",
            skillsText
        )

        intent.putExtra(
            "NOTIFICATIONS",
            if (notificationsEnabled)
                "ON"
            else
                "OFF"
        )

        intent.putExtra(
            "REGISTRATION_ID",
            registrationId
        )

        // Send profile image
        intent.putExtra(
            "PROFILE_IMAGE",
            profileImageUri?.toString()
        )


        // ------------------------------------------------
        // Notification
        // ------------------------------------------------

        if (notificationsEnabled) {

            showRegistrationNotification()
        }


        // ------------------------------------------------
        // Open Result Screen
        // ------------------------------------------------

        startActivity(intent)
    }

    // ------------------------------------------------
    // Clear Form
    // ------------------------------------------------

    private fun clearForm() {

        etName.text.clear()

        etUSN.text.clear()

        etEmail.text.clear()

        etPhone.text.clear()


        rgGender.clearCheck()


        // General as default
        rgSpecialization.check(
            R.id.rbGeneral
        )


        cbProgramming.isChecked = false

        cbIoT.isChecked = false

        cbAI.isChecked = false

        cbWeb.isChecked = false

        cbTerms.isChecked = false


        toggleNotifications.isChecked = true


        // Clear image
        profileImageUri = null

        btnProfile.setImageResource(
            android.R.drawable.ic_menu_camera
        )

        btnProfile.setPadding(
            8,
            8,
            8,
            8
        )


        etName.requestFocus()


        Toast.makeText(
            this,
            getString(
                R.string.msg_form_cleared
            ),
            Toast.LENGTH_SHORT
        ).show()
    }

    // ------------------------------------------------
    // Notification Channel
    // ------------------------------------------------

    private fun createNotificationChannel() {

        if (
            Build.VERSION.SDK_INT >=
            Build.VERSION_CODES.O
        ) {

            val channel =
                NotificationChannel(
                    CHANNEL_ID,
                    getString(
                        R.string.channel_name
                    ),
                    NotificationManager
                        .IMPORTANCE_DEFAULT
                )

            channel.description =
                getString(
                    R.string.channel_desc
                )

            val manager =
                getSystemService(
                    NotificationManager::class.java
                )

            manager.createNotificationChannel(
                channel
            )
        }
    }

    // ------------------------------------------------
    // Registration Notification
    // ------------------------------------------------

    private fun showRegistrationNotification() {

        // Android 13+
        if (
            Build.VERSION.SDK_INT >=
            Build.VERSION_CODES.TIRAMISU
        ) {

            if (
                ActivityCompat.checkSelfPermission(
                    this,
                    Manifest.permission.POST_NOTIFICATIONS
                ) !=
                PackageManager.PERMISSION_GRANTED
            ) {

                ActivityCompat.requestPermissions(
                    this,
                    arrayOf(
                        Manifest.permission.POST_NOTIFICATIONS
                    ),
                    NOTIFICATION_PERMISSION_CODE
                )

                return
            }
        }


        val notification =
            NotificationCompat.Builder(
                this,
                CHANNEL_ID
            )
                .setSmallIcon(
                    android.R.drawable.ic_dialog_info
                )
                .setContentTitle(
                    getString(
                        R.string.msg_registration_successful
                    )
                )
                .setContentText(
                    getString(
                        R.string.msg_success_desc
                    )
                )
                .setPriority(
                    NotificationCompat
                        .PRIORITY_DEFAULT
                )
                .setAutoCancel(true)
                .build()


        NotificationManagerCompat
            .from(this)
            .notify(
                NOTIFICATION_ID,
                notification
            )
    }
}