package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.widget.Button;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.widget.TextView;

import java.util.ArrayList;

public class CalculatorScreen extends AppCompatActivity {

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
        setContentView(R.layout.activity_calculator);

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

        TextView buffText = findViewById(R.id.charms_text);

        // Blade button listeners
        p20.setOnClickListener(v -> {
            charms.add(20.0);
            buffText.setText(buffToString(charms));
        });

        p25.setOnClickListener(v -> {
            charms.add(25.0);
            buffText.setText(buffToString(charms));
        });

        p30.setOnClickListener(v -> {
            charms.add(30.0);
            buffText.setText(buffToString(charms));
        });

        p35.setOnClickListener(v -> {
            charms.add(35.0);
            buffText.setText(buffToString(charms));
        });

        p40.setOnClickListener(v -> {
            charms.add(40.0);
            buffText.setText(buffToString(charms));
        });

        p45.setOnClickListener(v -> {
            charms.add(45.0);
            buffText.setText(buffToString(charms));
        });

        p50.setOnClickListener(v -> {
            charms.add(50.0);
            buffText.setText(buffToString(charms));
        });

        pOther.setOnClickListener(v -> {
            final EditText edittext = new EditText(this);
            edittext.setInputType(InputType.TYPE_CLASS_NUMBER);

            final AlertDialog.Builder builder = new AlertDialog.Builder(this);

            builder.setTitle("Enter Blade Percent");
            builder.setView(edittext);

            builder.setPositiveButton("Ok", (dialogInterface, i) -> {
                String value = edittext.getText().toString();
                charms.add(Double.valueOf(value));
                buffText.setText(buffToString(charms));
            });
            builder.setNegativeButton("Cancel", (dialogInterface, i) -> dialogInterface.cancel());

            AlertDialog alert = builder.create();
            alert.show();
        });

        // Weakness button listeners
        m10.setOnClickListener(v -> {
            charms.add(-10.0);
            buffText.setText(buffToString(charms));
        });

        m15.setOnClickListener(v -> {
            charms.add(-15.0);
            buffText.setText(buffToString(charms));
        });

        m20.setOnClickListener(v -> {
            charms.add(-20.0);
            buffText.setText(buffToString(charms));
        });

        m25.setOnClickListener(v -> {
            charms.add(-25.0);
            buffText.setText(buffToString(charms));
        });

        m30.setOnClickListener(v -> {
            charms.add(-30.0);
            buffText.setText(buffToString(charms));
        });

        m35.setOnClickListener(v -> {
            charms.add(-35.0);
            buffText.setText(buffToString(charms));
        });

        m40.setOnClickListener(v -> {
            charms.add(-40.0);
            buffText.setText(buffToString(charms));
        });

        m45.setOnClickListener(v -> {
            charms.add(-45.0);
            buffText.setText(buffToString(charms));
        });

        m50.setOnClickListener(v -> {
            charms.add(-50.0);
            buffText.setText(buffToString(charms));
        });

        m55.setOnClickListener(v -> {
            charms.add(-55.0);
            buffText.setText(buffToString(charms));
        });

        m90.setOnClickListener(v -> {
            charms.add(-90.0);
            buffText.setText(buffToString(charms));
        });

        mOther.setOnClickListener(v -> {
            final EditText edittext = new EditText(this);
            edittext.setInputType(InputType.TYPE_CLASS_NUMBER);

            final AlertDialog.Builder builder = new AlertDialog.Builder(this);

            builder.setTitle("Enter Weakness Percent");
            builder.setView(edittext);

            builder.setPositiveButton("Ok", (dialogInterface, i) -> {
                String value = edittext.getText().toString();
                charms.add((-1) * Double.parseDouble(value));
                buffText.setText(buffToString(charms));
            });
            builder.setNegativeButton("Cancel", (dialogInterface, i) -> dialogInterface.cancel());

            AlertDialog alert = builder.create();
            alert.show();
        });

        TextView wardText = findViewById(R.id.wards_text);

        // Trap button listeners
        t30.setOnClickListener(v -> {
            wards.add(30.0);
            wardText.setText(buffToString(wards));
        });

        t35.setOnClickListener(v -> {
            wards.add(35.0);
            wardText.setText(buffToString(wards));
        });

        t40.setOnClickListener(v -> {
            wards.add(40.0);
            wardText.setText(buffToString(wards));
        });

        t45.setOnClickListener(v -> {
            wards.add(45.0);
            wardText.setText(buffToString(wards));
        });

        t70.setOnClickListener(v -> {
            wards.add(70.0);
            wardText.setText(buffToString(wards));
        });

        t75.setOnClickListener(v -> {
            wards.add(75.0);
            wardText.setText(buffToString(wards));
        });

        t80.setOnClickListener(v -> {
            wards.add(80.0);
            wardText.setText(buffToString(wards));
        });

        tOther.setOnClickListener(v -> {
            final EditText edittext = new EditText(this);
            edittext.setInputType(InputType.TYPE_CLASS_NUMBER);

            final AlertDialog.Builder builder = new AlertDialog.Builder(this);

            builder.setTitle("Enter Trap Percent");
            builder.setView(edittext);

            builder.setPositiveButton("Ok", (dialogInterface, i) -> {
                String value = edittext.getText().toString();
                wards.add(Double.valueOf(value));
                wardText.setText(buffToString(wards));
            });
            builder.setNegativeButton("Cancel", (dialogInterface, i) -> dialogInterface.cancel());

            AlertDialog alert = builder.create();
            alert.show();
        });

        // Shield button listeners
        s45.setOnClickListener(v -> {
            wards.add(-45.0);
            wardText.setText(buffToString(wards));
        });

        s50.setOnClickListener(v -> {
            wards.add(-50.0);
            wardText.setText(buffToString(wards));
        });

        s55.setOnClickListener(v -> {
            wards.add(-55.0);
            wardText.setText(buffToString(wards));
        });

        s70.setOnClickListener(v -> {
            wards.add(-70.0);
            wardText.setText(buffToString(wards));
        });

        s75.setOnClickListener(v -> {
            wards.add(-75.0);
            wardText.setText(buffToString(wards));
        });

        s80.setOnClickListener(v -> {
            wards.add(-80.0);
            wardText.setText(buffToString(wards));
        });

        s85.setOnClickListener(v -> {
            wards.add(-85.0);
            wardText.setText(buffToString(wards));
        });

        sOther.setOnClickListener(v -> {
            final EditText edittext = new EditText(this);
            edittext.setInputType(InputType.TYPE_CLASS_NUMBER);

            final AlertDialog.Builder builder = new AlertDialog.Builder(this);

            builder.setTitle("Enter Shield Percent");
            builder.setView(edittext);

            builder.setPositiveButton("Ok", (dialogInterface, i) -> {
                String value = edittext.getText().toString();
                wards.add((-1) * Double.parseDouble(value));
                wardText.setText(buffToString(wards));
            });
            builder.setNegativeButton("Cancel", (dialogInterface, i) -> dialogInterface.cancel());

            AlertDialog alert = builder.create();
            alert.show();
        });

        Button clear = findViewById(R.id.clear);

        clear.setOnClickListener(v -> {
            charms.clear();
            wards.clear();
            buffText.setText(buffToString(charms));
            wardText.setText(buffToString(wards));

        });

        TextView help = findViewById(R.id.help);

        help.setOnClickListener(v -> goToTutorial());

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

    public String buffToString(ArrayList<Double> buffs) {
        StringBuilder total_buffs = null;
        int count = 0;
        for (double i : buffs) {
            if (count % 5 == 0 && count != 0) {
                total_buffs.append("\n");
            }
            if (count == 0) {
                if (i > 0) {
                    total_buffs = new StringBuilder(" + " + i);
                } else {
                    total_buffs = new StringBuilder(" - " + (-1 * i));
                }
            } else {
                if (i > 0) {
                    total_buffs.append(" + ").append(i);
                } else {
                    total_buffs.append(" - " ).append((-1) * i);
                }
            }
             count = count + 1;
        }
        if (total_buffs != null) {
            return total_buffs.toString();
        } else {
            return "";
        }
    }

    public void goToTutorial() {
        Intent intent = new Intent(this, TutorialScreen.class);
        startActivity(intent);
    }
}