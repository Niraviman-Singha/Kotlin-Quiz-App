package com.example.kotlinquiz


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.kotlinquiz.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.rgroup.setOnCheckedChangeListener { group, checkedID ->
            when(checkedID){
                R.id.option1 ->{
                    Toast.makeText(this,"Correct Answer", Toast.LENGTH_SHORT).show()
                }

                R.id.option2 ->{
                    Toast.makeText(this,"Wrong Answer", Toast.LENGTH_SHORT).show()
                }

                R.id.option3 ->{
                    Toast.makeText(this,"Wrong Answer", Toast.LENGTH_SHORT).show()
                }

                R.id.option4 ->{
                    Toast.makeText(this,"Wrong Answer", Toast.LENGTH_SHORT).show()
                }
            }
        }

        binding.rgroup2.setOnCheckedChangeListener { group, checkedID ->
            when(checkedID){
                R.id.option5 ->{
                    Toast.makeText(this,"Wrong Answer", Toast.LENGTH_SHORT).show()
                }

                R.id.option6 ->{
                    Toast.makeText(this,"Wrong Answer", Toast.LENGTH_SHORT).show()
                }

                R.id.option7 ->{
                    Toast.makeText(this,"Wrong Answer", Toast.LENGTH_SHORT).show()
                }

                R.id.option8 ->{
                    Toast.makeText(this,"Correct Answer", Toast.LENGTH_SHORT).show()
                }
            }
        }

        binding.rgroup3.setOnCheckedChangeListener { group, checkedID ->
            when(checkedID){
                R.id.option9 ->{
                    Toast.makeText(this,"Wrong Answer", Toast.LENGTH_SHORT).show()
                }

                R.id.option10 ->{
                    Toast.makeText(this,"Wrong Answer", Toast.LENGTH_SHORT).show()
                }

                R.id.option11 ->{
                    Toast.makeText(this,"Correct Answer", Toast.LENGTH_SHORT).show()
                }

                R.id.option12 ->{
                    Toast.makeText(this,"Wrong Answer", Toast.LENGTH_SHORT).show()
                }
            }
        }

        binding.rgroup4.setOnCheckedChangeListener { group, checkedID ->
            when(checkedID){
                R.id.option13 ->{
                    Toast.makeText(this,"Wrong Answer", Toast.LENGTH_SHORT).show()
                }

                R.id.option14 ->{
                    Toast.makeText(this,"Wrong Answer", Toast.LENGTH_SHORT).show()
                }

                R.id.option15 ->{
                    Toast.makeText(this,"Correct Answer", Toast.LENGTH_SHORT).show()
                }

                R.id.option16 ->{
                    Toast.makeText(this,"Wrong Answer", Toast.LENGTH_SHORT).show()
                }
            }
        }

        binding.rgroup5.setOnCheckedChangeListener { group, checkedID ->
            when(checkedID){
                R.id.option17 ->{
                    Toast.makeText(this,"Correct Answer", Toast.LENGTH_SHORT).show()
                }

                R.id.option18 ->{
                    Toast.makeText(this,"Wrong Answer", Toast.LENGTH_SHORT).show()
                }

                R.id.option19 ->{
                    Toast.makeText(this,"Wrong Answer", Toast.LENGTH_SHORT).show()
                }

                R.id.option20 ->{
                    Toast.makeText(this,"Wrong Answer", Toast.LENGTH_SHORT).show()
                }
            }
        }

        binding.rgroup6.setOnCheckedChangeListener { group, checkedID ->
            when(checkedID){
                R.id.option21 ->{
                    Toast.makeText(this,"Correct Answer", Toast.LENGTH_SHORT).show()
                }

                R.id.option22 ->{
                    Toast.makeText(this,"Wrong Answer", Toast.LENGTH_SHORT).show()
                }

                R.id.option23 ->{
                    Toast.makeText(this,"Wrong Answer", Toast.LENGTH_SHORT).show()
                }

                R.id.option24 ->{
                    Toast.makeText(this,"Wrong Answer", Toast.LENGTH_SHORT).show()
                }
            }
        }

        binding.rgroup7.setOnCheckedChangeListener { group, checkedID ->
            when(checkedID){
                R.id.option25 ->{
                    Toast.makeText(this,"Correct Answer", Toast.LENGTH_SHORT).show()
                }

                R.id.option26 ->{
                    Toast.makeText(this,"Wrong Answer", Toast.LENGTH_SHORT).show()
                }

                R.id.option27 ->{
                    Toast.makeText(this,"Wrong Answer", Toast.LENGTH_SHORT).show()
                }

                R.id.option28 ->{
                    Toast.makeText(this,"Wrong Answer", Toast.LENGTH_SHORT).show()
                }
            }
        }

        binding.rgroup8.setOnCheckedChangeListener { group, checkedID ->
            when(checkedID){
                R.id.option29 ->{
                    Toast.makeText(this,"Wrong Answer", Toast.LENGTH_SHORT).show()
                }

                R.id.option30 ->{
                    Toast.makeText(this,"Wrong Answer", Toast.LENGTH_SHORT).show()
                }

                R.id.option31 ->{
                    Toast.makeText(this,"Wrong Answer", Toast.LENGTH_SHORT).show()
                }

                R.id.option32 ->{
                    Toast.makeText(this,"Correct Answer", Toast.LENGTH_SHORT).show()
                }
            }
        }

        binding.rgroup9.setOnCheckedChangeListener { group, checkedID ->
            when(checkedID){
                R.id.option33 ->{
                    Toast.makeText(this,"Wrong Answer", Toast.LENGTH_SHORT).show()
                }

                R.id.option34 ->{
                    Toast.makeText(this,"Correct Answer", Toast.LENGTH_SHORT).show()
                }

                R.id.option35 ->{
                    Toast.makeText(this,"Wrong Answer", Toast.LENGTH_SHORT).show()
                }

                R.id.option36 ->{
                    Toast.makeText(this,"Wrong Answer", Toast.LENGTH_SHORT).show()
                }
            }
        }

        binding.rgroup10.setOnCheckedChangeListener { group, checkedID ->
            when(checkedID){
                R.id.option37 ->{
                    Toast.makeText(this,"Wrong Answer", Toast.LENGTH_SHORT).show()
                }

                R.id.option38 ->{
                    Toast.makeText(this,"Wrong Answer", Toast.LENGTH_SHORT).show()
                }

                R.id.option39 ->{
                    Toast.makeText(this,"Correct Answer", Toast.LENGTH_SHORT).show()
                }

                R.id.option40 ->{
                    Toast.makeText(this,"Wrong Answer", Toast.LENGTH_SHORT).show()
                }
            }
        }

        binding.rgroup11.setOnCheckedChangeListener { group, checkedID ->
            when(checkedID){
                R.id.option41 ->{
                    Toast.makeText(this,"Wrong Answer", Toast.LENGTH_SHORT).show()
                }

                R.id.option42 ->{
                    Toast.makeText(this,"Correct Answer", Toast.LENGTH_SHORT).show()
                }

                R.id.option43 ->{
                    Toast.makeText(this,"Wrong Answer", Toast.LENGTH_SHORT).show()
                }

                R.id.option44 ->{
                    Toast.makeText(this,"Wrong Answer", Toast.LENGTH_SHORT).show()
                }
            }
        }

        binding.rgroup12.setOnCheckedChangeListener { group, checkedID ->
            when(checkedID){
                R.id.option45 ->{
                    Toast.makeText(this,"Wrong Answer", Toast.LENGTH_SHORT).show()
                }

                R.id.option46 ->{
                    Toast.makeText(this,"Correct Answer", Toast.LENGTH_SHORT).show()
                }

                R.id.option47 ->{
                    Toast.makeText(this,"Wrong Answer", Toast.LENGTH_SHORT).show()
                }

                R.id.option48 ->{
                    Toast.makeText(this,"Wrong Answer", Toast.LENGTH_SHORT).show()
                }
            }
        }

        binding.rgroup13.setOnCheckedChangeListener { group, checkedID ->
            when(checkedID){
                R.id.option49 ->{
                    Toast.makeText(this,"Wrong Answer", Toast.LENGTH_SHORT).show()
                }

                R.id.option50 ->{
                    Toast.makeText(this,"Wrong Answer", Toast.LENGTH_SHORT).show()
                }

                R.id.option51 ->{
                    Toast.makeText(this,"Correct Answe", Toast.LENGTH_SHORT).show()
                }

                R.id.option52 ->{
                    Toast.makeText(this,"Wrong Answer", Toast.LENGTH_SHORT).show()
                }
            }
        }

        binding.rgroup14.setOnCheckedChangeListener { group, checkedID ->
            when(checkedID){
                R.id.option53 ->{
                    Toast.makeText(this,"Wrong Answer", Toast.LENGTH_SHORT).show()
                }

                R.id.option54 ->{
                    Toast.makeText(this,"Wrong Answer", Toast.LENGTH_SHORT).show()
                }

                R.id.option55 ->{
                    Toast.makeText(this,"Correct Answe", Toast.LENGTH_SHORT).show()
                }

                R.id.option56 ->{
                    Toast.makeText(this,"Wrong Answer", Toast.LENGTH_SHORT).show()
                }
            }
        }



    }
}