package com.upeksha.waterwiseapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;
import androidx.appcompat.app.AppCompatActivity;

public class WaterTipsActivity extends AppCompatActivity {

    private TextView tipTextView;
    private Button nextTipButton;
    private Random random = new Random();

    // Array of water-saving tips
    private String[] waterSavingTips = {
            "Turn off the tap while brushing your teeth to save up to 8 gallons of water per day.",
            "Fix leaky faucets promptly - a dripping faucet can waste up to 3,000 gallons per year.",
            "Install water-efficient showerheads to reduce water consumption by up to 40%.",
            "Collect rainwater for watering plants and gardens.",
            "Run dishwashers and washing machines only when they're full.",
            "Use a broom instead of a hose to clean driveways and sidewalks.",
            "Take shorter showers - try to keep them under 5 minutes.",
            "Install a dual-flush toilet or place a water displacement device in your toilet tank.",
            "Water your garden during the early morning or late evening to reduce evaporation.",
            "Use a water bottle filled with sand in your toilet tank to reduce water usage.",
            "Use a cup of water when brushing teeth instead of letting the tap run.",
            "Check for toilet leaks by adding food coloring to the tank.",
            "Insulate hot water pipes to get hot water faster without wasting water.",
            "Adjust sprinklers to avoid watering sidewalks and driveways.",
            "Wash fruits and vegetables in a bowl of water instead of under running water."
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_water_tips);

        // Initialize UI elements
        tipTextView = findViewById(R.id.tipTextView);
        nextTipButton = findViewById(R.id.nextTipButton);

        // Display initial random tip
        displayRandomTip();

        // Set up button click listener for next tip
        nextTipButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayRandomTip();
            }
        });
    }

    /**
     * Displays a random water-saving tip on the screen
     */
    private void displayRandomTip() {
        // Generate random index
        int randomIndex = random.nextInt(waterSavingTips.length);

        // Display the random tip
        tipTextView.setText(waterSavingTips[randomIndex]);
    }
}