package com.upeksha.waterwiseapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Home extends AppCompatActivity {

    private TextView tvWaterUsage;
    private Button btnSmartTracker, btnWaterTips, btnChallenges, btnCommunity, btnLogout;

    private int waterUsage = 50; // Example starting value

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // Initialize UI elements
        tvWaterUsage = findViewById(R.id.tvWaterUsage);
        btnSmartTracker = findViewById(R.id.btnSmartTracker);
        btnWaterTips = findViewById(R.id.btnWaterTips);
        btnChallenges = findViewById(R.id.btnChallenges);
        btnCommunity = findViewById(R.id.btnCommunity);
        btnLogout = findViewById(R.id.btnLogout);

        // Set water usage value (this could come from a database in the future)
        updateWaterUsage();

        // Button click listeners
        btnSmartTracker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, SmartTrackerActivity.class);
                startActivity(intent);
            }
        });

        btnWaterTips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, WaterTipsActivity.class);
                startActivity(intent);
            }
        });

        btnChallenges.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, ChallengesActivity.class);
                startActivity(intent);
            }
        });

        btnCommunity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, CommunityActivity.class);
                startActivity(intent);
            }
        });

        // Logout button click listener
        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Clear user session data (preferences, tokens, etc.)
                clearUserSession();

                // Display logout message
                Toast.makeText(Home.this, "Logged out successfully", Toast.LENGTH_SHORT).show();

                // Navigate back to login screen
                Intent intent = new Intent(Home.this, Login.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
                finish();
            }
        });
    }

    // Method to update water usage dynamically
    private void updateWaterUsage() {
        tvWaterUsage.setText(waterUsage + " Liters");
    }

    // Method to clear user session data
    private void clearUserSession() {
        // Implement code to clear user preferences, tokens, or other session data
        // For example:
        // SharedPreferences preferences = getSharedPreferences("WaterWisePrefs", MODE_PRIVATE);
        // SharedPreferences.Editor editor = preferences.edit();
        // editor.clear();
        // editor.apply();
    }
}