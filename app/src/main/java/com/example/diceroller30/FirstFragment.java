package com.example.diceroller30;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Random;
import android.widget.Toast;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import com.example.diceroller30.databinding.FragmentFirstBinding;

public class FirstFragment extends Fragment {

    private FragmentFirstBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentFirstBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.roll4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random pic = new Random();
                int dice = pic.nextInt(5);
                switch (dice) {
                    case 1:
                        binding.imageView.setImageResource(R.drawable.d4_1);

                        break;
                    case 2:
                        binding.imageView.setImageResource(R.drawable.d4_2);

                        break;
                    case 3:
                        binding.imageView.setImageResource(R.drawable.d4_3);

                        break;
                    case 4:
                        binding.imageView.setImageResource(R.drawable.d4_4);

                        break;
                }

            }
        });


        binding.roll6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random pic = new Random();
                int dice = pic.nextInt(7);
                switch (dice) {
                    case 1:
                        binding.imageView.setImageResource(R.drawable.dice_1);

                        break;
                    case 2:
                        binding.imageView.setImageResource(R.drawable.dice_2);

                        break;
                    case 3:
                        binding.imageView.setImageResource(R.drawable.dice_3);

                        break;
                    case 4:
                        binding.imageView.setImageResource(R.drawable.dice_4);

                        break;
                    case 5:
                        binding.imageView.setImageResource(R.drawable.dice_5);

                        break;
                    case 6:
                        binding.imageView.setImageResource(R.drawable.dice_6);

                        break;

                }

            }
        });


        binding.roll8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random pic = new Random();
                int dice = pic.nextInt(9);
                switch (dice) {
                    case 1:
                        binding.imageView.setImageResource(R.drawable.d8_1);

                        break;
                    case 2:
                        binding.imageView.setImageResource(R.drawable.d8_2);

                        break;
                    case 3:
                        binding.imageView.setImageResource(R.drawable.d8_3);

                        break;
                    case 4:
                        binding.imageView.setImageResource(R.drawable.d8_4);

                        break;
                    case 5:
                        binding.imageView.setImageResource(R.drawable.d8_5);

                        break;
                    case 6:
                        binding.imageView.setImageResource(R.drawable.d8_6);

                        break;
                    case 7:
                        binding.imageView.setImageResource(R.drawable.d8_7);

                        break;
                    case 8:
                        binding.imageView.setImageResource(R.drawable.d8_8);

                        break;
                }

            }
        });
        binding.roll10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random pic = new Random();
                int dice = pic.nextInt(11);
                switch (dice) {
                    case 1:
                        binding.imageView.setImageResource(R.drawable.d10_1);

                        break;
                    case 2:
                        binding.imageView.setImageResource(R.drawable.d10_2);

                        break;
                    case 3:
                        binding.imageView.setImageResource(R.drawable.d10_3);

                        break;
                    case 4:
                        binding.imageView.setImageResource(R.drawable.d10_4);

                            break;
                    case 5:
                        binding.imageView.setImageResource(R.drawable.d10_5);

                        break;
                    case 6:
                        binding.imageView.setImageResource(R.drawable.d10_6);

                        break;
                    case 7:
                        binding.imageView.setImageResource(R.drawable.d10_7);

                        break;

                    case 8:
                        binding.imageView.setImageResource(R.drawable.d10_8);

                        break;
                    case 9:
                        binding.imageView.setImageResource(R.drawable.d10_9);

                        break;
                    case 10:
                        binding.imageView.setImageResource(R.drawable.d10_10);

                        break;
                }


            }
        });
        binding.roll12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random pic = new Random();
                int dice = pic.nextInt(5);
                switch (dice) {
                    case 1:
                        binding.imageView.setImageResource(R.drawable.d12_1);

                        break;
                    case 2:
                        binding.imageView.setImageResource(R.drawable.d12_2);

                        break;
                    case 3:
                        binding.imageView.setImageResource(R.drawable.d12_3);
                        break;
                    case 4:
                        binding.imageView.setImageResource(R.drawable.d12_4);
                        break;
                    case 5:
                        binding.imageView.setImageResource(R.drawable.d12_5);
                        break;
                    case 6:
                        binding.imageView.setImageResource(R.drawable.d12_6);
                        break;
                    case 7:
                        binding.imageView.setImageResource(R.drawable.d12_7);
                        break;

                    case 8:
                        binding.imageView.setImageResource(R.drawable.d12_8);
                        break;
                    case 9:
                        binding.imageView.setImageResource(R.drawable.d12_9);
                        break;
                    case 10:
                        binding.imageView.setImageResource(R.drawable.d12_10);
                        break;
                    case 11:
                        binding.imageView.setImageResource(R.drawable.d12_11);
                        break;
                    case 12:
                        binding.imageView.setImageResource(R.drawable.d12_12);
                        break;
                }


            }
        });
        binding.roll20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random pic = new Random();
                int dice = pic.nextInt(21);
                switch (dice) {
                    case 1:
                        binding.imageView.setImageResource(R.drawable.d20_1);
                        break;
                    case 2:
                        binding.imageView.setImageResource(R.drawable.d20_2);
                        break;
                    case 3:
                        binding.imageView.setImageResource(R.drawable.d20_3);
                        break;
                    case 4:
                        binding.imageView.setImageResource(R.drawable.d20_4);
                        break;
                    case 5:
                        binding.imageView.setImageResource(R.drawable.d20_5);
                        break;
                    case 6:
                        binding.imageView.setImageResource(R.drawable.d20_6);
                        break;
                    case 7:
                        binding.imageView.setImageResource(R.drawable.d20_7);
                        break;

                    case 8:
                        binding.imageView.setImageResource(R.drawable.d20_8);
                        break;
                    case 9:
                        binding.imageView.setImageResource(R.drawable.d20_9);
                        break;
                    case 10:
                        binding.imageView.setImageResource(R.drawable.d20_10);
                        break;
                    case 11:
                        binding.imageView.setImageResource(R.drawable.d20_11);
                        break;
                    case 12:
                        binding.imageView.setImageResource(R.drawable.d20_12);
                        break;
                    case 13:
                        binding.imageView.setImageResource(R.drawable.d20_13);
                        break;
                    case 14:
                        binding.imageView.setImageResource(R.drawable.d20_14);
                        break;
                    case 15:
                        binding.imageView.setImageResource(R.drawable.d20_15);
                        break;
                    case 16:
                        binding.imageView.setImageResource(R.drawable.d20_16);
                        break;
                    case 17:
                        binding.imageView.setImageResource(R.drawable.d20_17);
                        break;
                    case 18:
                        binding.imageView.setImageResource(R.drawable.d20_18);
                        break;
                    case 19:
                        binding.imageView.setImageResource(R.drawable.d20_19);
                        break;
                    case 20:
                        binding.imageView.setImageResource(R.drawable.d20_20);
                        break;
                }

            }
        });

    }
        @Override
        public void onDestroyView () {
            super.onDestroyView();
            binding = null;
        }

    }
