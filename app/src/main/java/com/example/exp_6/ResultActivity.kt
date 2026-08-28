package com.example.exp_6

import androidx.core.net.toUri
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ResultActivity : AppCompatActivity() {

    // ------------------------------------------------
    // Profile Image
    // ------------------------------------------------

    private lateinit var ivProfile: ImageView

    // ------------------------------------------------
    // Student Details
    // ------------------------------------------------

    private lateinit var tvName: TextView
    private lateinit var tvUSN: TextView
    private lateinit var tvEmail: TextView
    private lateinit var tvPhone: TextView
    private lateinit var tvGender: TextView
    private lateinit var tvSpecialization: TextView
    private lateinit var tvSkills: TextView
    private lateinit var tvNotifications: TextView
    private lateinit var tvRegistrationId: TextView

    private lateinit var btnBack: Button


    // ------------------------------------------------
    // onCreate
    // ------------------------------------------------

    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)

        setContentView(
            R.layout.activity_result
        )

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        initializeViews()

        displayStudentDetails()

        btnBack.setOnClickListener {

            finish()
        }
    }


    // ------------------------------------------------
    // Initialize Views
    // ------------------------------------------------

    private fun initializeViews() {

        ivProfile =
            findViewById(R.id.ivProfile)

        tvName =
            findViewById(R.id.tvName)

        tvUSN =
            findViewById(R.id.tvUSN)

        tvEmail =
            findViewById(R.id.tvEmail)

        tvPhone =
            findViewById(R.id.tvPhone)

        tvGender =
            findViewById(R.id.tvGender)

        tvSpecialization =
            findViewById(
                R.id.tvSpecialization
            )

        tvSkills =
            findViewById(R.id.tvSkills)

        tvNotifications =
            findViewById(
                R.id.tvNotifications
            )

        tvRegistrationId =
            findViewById(
                R.id.tvRegistrationId
            )

        btnBack =
            findViewById(R.id.btnBack)
    }


    // ------------------------------------------------
    // Display Details
    // ------------------------------------------------

    private fun displayStudentDetails() {

        // Receive details

        val name =
            intent.getStringExtra("NAME")
                ?: ""

        val usn =
            intent.getStringExtra("USN")
                ?: ""

        val email =
            intent.getStringExtra("EMAIL")
                ?: ""

        val phone =
            intent.getStringExtra("PHONE")
                ?: ""

        val gender =
            intent.getStringExtra("GENDER")
                ?: ""

        val specialization =
            intent.getStringExtra(
                "SPECIALIZATION"
            ) ?: ""

        val skills =
            intent.getStringExtra("SKILLS")
                ?: ""

        val notifications =
            intent.getStringExtra(
                "NOTIFICATIONS"
            ) ?: ""

        val registrationId =
            intent.getStringExtra(
                "REGISTRATION_ID"
            ) ?: ""


        // ------------------------------------------------
        // Profile Image
        // ------------------------------------------------

        val profileImage =
            intent.getStringExtra(
                "PROFILE_IMAGE"
            )


        if (!profileImage.isNullOrEmpty()) {

            try {

                ivProfile.setImageURI(
                    profileImage.toUri()
                )

                ivProfile.scaleType =
                    ImageView.ScaleType.CENTER_CROP

                ivProfile.setPadding(
                    0,
                    0,
                    0,
                    0
                )

            } catch (_: Exception) {

                // Keep default image
            }
        }


        // ------------------------------------------------
        // Display Student Details
        // ------------------------------------------------

        tvName.text =
            name

        tvUSN.text =
            usn

        tvEmail.text =
            email

        tvPhone.text =
            phone

        tvGender.text =
            gender

        tvSpecialization.text =
            specialization

        tvSkills.text =
            skills

        tvNotifications.text =
            notifications


        // ------------------------------------------------
        // Registration ID
        // ------------------------------------------------

        tvRegistrationId.text =
            getString(
                R.string.label_registration_id_format,
                registrationId
            )
    }
}