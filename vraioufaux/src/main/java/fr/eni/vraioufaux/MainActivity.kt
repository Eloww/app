package fr.eni.vraioufaux

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import fr.eni.vraioufaux.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    var score = 0
    var questions = mutableListOf<QuestionReponse>();
    var index = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val question1: QuestionReponse = QuestionReponse("Est-ce que cette application est chouette ?", true)
        val question2: QuestionReponse = QuestionReponse("Est-ce que le temps est le même pour tout le monde ?", false)
        val question3: QuestionReponse = QuestionReponse("Est-ce qu'il y a une différence entre une vache ?", true)


        questions.add(question1)
        questions.add(question2)
        questions.add(question3)

        binding.qr = questions.get(index)



        if (binding.qr?.reponse == true) {
            binding.button3.setOnClickListener {
                score += 1
                binding.textView.text = this.score.toString()
                index++

                if(questions.size -1 == index) {
                    binding.qr = questions.get(index)
                }

                if (questions.size == index) {
                    binding.button3.isEnabled = false
                    binding.button4.isEnabled = false
                }
            }

            binding.button4.setOnClickListener {
                score -= 1;
                binding.textView.text = this.score.toString()
                index++

                if(questions.size -1 == index) {
                    binding.qr = questions.get(index)
                }

                if (questions.size == index) {
                    binding.button3.isEnabled = false
                    binding.button4.isEnabled = false
                }
            }
        }

        if (binding.qr?.reponse == false) {
            binding.button3.setOnClickListener {
                score -= 1
                binding.textView.text = this.score.toString()
                index++

                if(questions.size -1 == index) {
                    binding.qr = questions.get(index)
                }

                if (questions.size == index) {
                    binding.button3.isEnabled = false
                    binding.button4.isEnabled = false
                }
            }

            binding.button4.setOnClickListener {
                score += 1;
                binding.textView.text = this.score.toString()
                index++

                if(questions.size -1 == index) {
                    binding.qr = questions.get(index)
                }

                if (questions.size == index) {
                    binding.button3.isEnabled = false
                    binding.button4.isEnabled = false
                }
            }
        }

        binding.textView.text = this.score.toString()

    }
}