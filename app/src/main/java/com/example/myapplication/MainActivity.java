package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.widget.TextView;

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
    EditText pierce;

    NumberPicker crit;

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
        pierce = findViewById(R.id.pierce);

        crit = findViewById(R.id.crit_percent);
        crit.setMaxValue(20);
        crit.setMaxValue(10);
        crit.setDisplayedValues( new String[] { "1.0", "1.1", "1.2", "1.3", "1.4", "1.5", "1.6", "1.7", "1.8", "1.9", "2.0" } );

        // Blade buttons
        Button p20 = findViewById(R.id.b20);
        Button p25 = findViewById(R.id.b25);
        Button p30 = findViewById(R.id.b30);
        Button p35 = findViewById(R.id.b35);
        Button p40 = findViewById(R.id.b40);
        Button p45 = findViewById(R.id.b45);
        Button p50 = findViewById(R.id.b50);
        Button pOther = findViewById(R.id.bOther);

        // Weakness buttons
        Button m10 = findViewById(R.id.w10);
        Button m15 = findViewById(R.id.w15);
        Button m20 = findViewById(R.id.w20);
        Button m25 = findViewById(R.id.w25);
        Button m30 = findViewById(R.id.w30);
        Button m35 = findViewById(R.id.w35);
        Button m40 = findViewById(R.id.w40);
        Button m45 = findViewById(R.id.w45);
        Button m50 = findViewById(R.id.w50);
        Button m55 = findViewById(R.id.w55);
        Button m90 = findViewById(R.id.w90);
        Button mOther = findViewById(R.id.wOther);

        // Trap Buttons
        Button t30 = findViewById(R.id.t30);
        Button t35 = findViewById(R.id.t35);
        Button t40 = findViewById(R.id.t40);
        Button t45 = findViewById(R.id.t45);
        Button t70 = findViewById(R.id.t70);
        Button t75 = findViewById(R.id.t75);
        Button t80 = findViewById(R.id.t80);
        Button tOther = findViewById(R.id.tOther);

        // Shield Buttons
        Button s45 = findViewById(R.id.s45);
        Button s50 = findViewById(R.id.s50);
        Button s55 = findViewById(R.id.s55);
        Button s70 = findViewById(R.id.s70);
        Button s75 = findViewById(R.id.s75);
        Button s80 = findViewById(R.id.s80);
        Button s85 = findViewById(R.id.s85);
        Button sOther = findViewById(R.id.sOther);

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
        m10.setOnClickListener(v -> charms.add(-10.0));

        m15.setOnClickListener(v -> charms.add(-15.0));

        m20.setOnClickListener(v -> charms.add(-20.0));

        m25.setOnClickListener(v -> charms.add(-25.0));

        m30.setOnClickListener(v -> charms.add(-30.0));

        m35.setOnClickListener(v -> charms.add(-35.0));

        m40.setOnClickListener(v -> charms.add(-40.0));

        m45.setOnClickListener(v -> charms.add(-45.0));

        m50.setOnClickListener(v -> charms.add(-50.0));

        m55.setOnClickListener(v -> charms.add(-55.0));

        m90.setOnClickListener(v -> charms.add(-90.0));

        mOther.setOnClickListener(v -> charms.add(0.0));

        // Trap button listeners
        t30.setOnClickListener(v -> wards.add(30.0));

        t35.setOnClickListener(v -> wards.add(35.0));

        t40.setOnClickListener(v -> wards.add(40.0));

        t45.setOnClickListener(v -> wards.add(45.0));

        t70.setOnClickListener(v -> wards.add(70.0));

        t75.setOnClickListener(v -> wards.add(75.0));

        t80.setOnClickListener(v -> wards.add(80.0));

        tOther.setOnClickListener(v -> wards.add(0.0));

        // Shield button listeners
        s45.setOnClickListener(v -> charms.add(-45.0));

        s50.setOnClickListener(v -> charms.add(-50.0));

        s55.setOnClickListener(v -> charms.add(-55.0));

        s70.setOnClickListener(v -> charms.add(-70.0));

        s75.setOnClickListener(v -> charms.add(-75.0));

        s80.setOnClickListener(v -> charms.add(-80.0));

        s85.setOnClickListener(v -> charms.add(-85.0));

        sOther.setOnClickListener(v -> charms.add(0.0));

        Button clear = findViewById(R.id.clear);

        clear.setOnClickListener(v -> {
            charms.clear();
            wards.clear();
        });

        TextView help = findViewById(R.id.help);

        help.setOnClickListener((v -> setContentView(R.layout.activity_main2)));

        // Calculate sequence
        Button calculate = findViewById(R.id.calculate);

        calculate.setOnClickListener(v -> {
            double spell_damage;
            double percent_boost;
            double flat_boost;
            double aura_boost;
            double global_boost;
            double target_aura;
            double flat_resist ;
            double percent_resist;
            double total_pierce;

            try {
                spell_damage = Integer.parseInt(spellDamage.getText().toString());
            } catch (NumberFormatException e) {
                spell_damage = 0;
            }
            try {
                percent_boost = Integer.parseInt(percentBoost.getText().toString());
            } catch (NumberFormatException e) {
                percent_boost = 0;
            }
            try {
                flat_boost = Integer.parseInt(flatBoost.getText().toString());
            } catch (NumberFormatException e) {
                flat_boost = 0;
            }
            try {
                aura_boost = Integer.parseInt(auraBoost.getText().toString());
            } catch (NumberFormatException e) {
                aura_boost = 0;
            }
            try {
                global_boost = Integer.parseInt(globalBoost.getText().toString());
            } catch (NumberFormatException e) {
                global_boost = 0;
            }
            try {
                target_aura = Integer.parseInt(targetsAura.getText().toString());
            } catch (NumberFormatException e) {
                target_aura = 0;
            }
            try {
                flat_resist = Integer.parseInt(flatResist.getText().toString());
            } catch (NumberFormatException e) {
                flat_resist = 0;
            }
            try {
                percent_resist = Integer.parseInt(resistPercent.getText().toString());
            } catch (NumberFormatException e) {
                percent_resist = 0;
            }
            try {
                total_pierce = Integer.parseInt(pierce.getText().toString());
            } catch (NumberFormatException e) {
                total_pierce = 0;
            }

            double total_damage = spell_damage * (1 + (percent_boost / 100));

            total_damage = total_damage + flat_boost;

            total_damage = total_damage * ((aura_boost / 100) + 1);

            for (double i : charms) {
                total_damage = total_damage * ((i / 100) + 1);
            }

            total_damage = total_damage * (1 + (global_boost / 100));

            // Target aura = -25

            if (target_aura < 0) {
                if (total_pierce >= (target_aura * -1)) {
                    total_pierce = total_pierce + target_aura;
                    target_aura = 0;
                } else {
                    target_aura = target_aura + total_pierce;
                    total_pierce = 0;
                }

            }
            total_damage = total_damage * (1 + (target_aura / 100));

            for (double i : wards) {
                if (i < 0) {
                    if (total_pierce >= (i * -1)) {
                        total_pierce = total_pierce + i;
                        i = 0;
                    } else {
                        i = i + total_pierce;
                        total_pierce = 0;
                    }
                }

                total_damage = total_damage * (1 + (i / 100));
            }

            total_damage = total_damage - flat_resist;

            if (percent_resist < 0) {
                if (total_pierce >= (percent_resist * -1)) {
                    percent_resist = 0;
                } else {
                    percent_resist = percent_resist + total_pierce;
                }

            }
            total_damage = total_damage * (1 + (percent_resist / 100));

            if (total_damage < 0) {
                total_damage = 0;
            }

            double crit_damage = total_damage * (1 + ((double) crit.getValue() / 10));

            TextView damage = findViewById(R.id.totalDamage);
            TextView damage_with_crit = findViewById(R.id.totalCritDamage);

            damage.setText(String.valueOf(Math.round(total_damage)));
            damage_with_crit.setText(String.valueOf(Math.round(crit_damage)));
        });

    }

    // Crit damage = Crit / (Crit + (3 * Block))

}