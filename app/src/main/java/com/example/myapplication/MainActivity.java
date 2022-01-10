package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Double> charms = new ArrayList<>();
    ArrayList<Double> wards = new ArrayList<>();

    EditText spellDamage;
    EditText percentBoost;
    EditText flatBoost;
    EditText auraBoost;
    EditText globalBoost;
    EditText targetsAura;
    EditText flatResist;
    EditText resistPercent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spellDamage = findViewById(R.id.spellDamage);
        percentBoost = findViewById(R.id.percentBoost);
        flatBoost = findViewById(R.id.flatBoost);
        auraBoost = findViewById(R.id.auraBoost);
        globalBoost = findViewById(R.id.globalBoost);
        targetsAura = findViewById(R.id.targetsAura);
        flatResist = findViewById(R.id.flatResist);
        resistPercent = findViewById(R.id.percentResist);

        // NumberPicker crit = findViewById(R.id.crit_percent);
        // crit.setMaxValue(20);
        // crit.setMaxValue(10);
        // crit.setDisplayedValues( new String[] { "1.0", "1.1", "1.2", "1.3", "1.4", "1.5", "1.6", "1.7", "1.8", "1.9", "2.0" } );

        Button p20 = findViewById(R.id.b20);
        Button p25 = findViewById(R.id.b25);
        Button p30 = findViewById(R.id.b30);
        Button p35 = findViewById(R.id.b35);
        Button p40 = findViewById(R.id.b40);
        Button p45 = findViewById(R.id.b45);
        Button p50 = findViewById(R.id.b50);
        Button pOther = findViewById(R.id.bOther);

        Button m20 = findViewById(R.id.w20);
        Button m25 = findViewById(R.id.w25);
        Button m30 = findViewById(R.id.w30);
        Button m35 = findViewById(R.id.w35);
        Button m40 = findViewById(R.id.w40);
        Button m45 = findViewById(R.id.w45);
        Button m50 = findViewById(R.id.w50);
        Button mOther = findViewById(R.id.wOther);

        Button calculate = findViewById(R.id.calculate);

        // Blade button listeners
        p20.setOnClickListener(v -> charms.add(20.0));

        p25.setOnClickListener(v -> charms.add(25.0));

        p30.setOnClickListener(v -> charms.add(30.0));

        p35.setOnClickListener(v -> charms.add(35.0));

        p40.setOnClickListener(v -> charms.add(40.0));

        p45.setOnClickListener(v -> charms.add(45.0));

        p50.setOnClickListener(v -> charms.add(50.0));

        pOther.setOnClickListener(v -> charms.add(0.0));

        // Weakness button listeners
        m20.setOnClickListener(v -> charms.add(-20.0));

        m25.setOnClickListener(v -> charms.add(-25.0));

        m30.setOnClickListener(v -> charms.add(-30.0));

        m35.setOnClickListener(v -> charms.add(-35.0));

        m40.setOnClickListener(v -> charms.add(-40.0));

        m45.setOnClickListener(v -> charms.add(-45.0));

        m50.setOnClickListener(v -> charms.add(-50.0));

        mOther.setOnClickListener(v -> charms.add(0.0));

        calculate.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                double spell_damage = 0;
                double percent_boost = 0;
                double flat_boost = 0;
                double aura_boost = 0;
                double global_boost = 0;
                double target_aura = 0;
                double flat_resist = 0;
                double percent_resist = 0;

                try {
                    spell_damage = Integer.parseInt(spellDamage.getText().toString());
                } catch (NumberFormatException e) {

                }
                percent_boost = (Integer.parseInt(percentBoost.getText().toString()));
                flat_boost = Integer.parseInt(flatBoost.getText().toString());
                aura_boost = Integer.parseInt(auraBoost.getText().toString());
                global_boost = Integer.parseInt(globalBoost.getText().toString());
                target_aura = Integer.parseInt(targetsAura.getText().toString());
                flat_resist = Integer.parseInt(flatResist.getText().toString());
                percent_resist = Integer.parseInt(resistPercent.getText().toString());

                double total_damage = spell_damage * (1 + (percent_boost / 100));

                total_damage = total_damage + flat_boost;

                total_damage = total_damage * ((aura_boost / 100) + 1);

                for (double i : charms) {
                    total_damage = total_damage * ((i / 100) + 1);
                }

                total_damage = total_damage * (1 + (global_boost / 100));

                total_damage = total_damage * (1 + (target_aura / 100));

                total_damage = total_damage - flat_resist;

                // total_damage = total_damage * (1 - (ward_resist / 100));

                TextView damage = findViewById(R.id.totalDamage);

                damage.setText(String.valueOf(total_damage));
            }
        });

    }

    // Crit damage = Crit / (Crit * (3 * Block))

}