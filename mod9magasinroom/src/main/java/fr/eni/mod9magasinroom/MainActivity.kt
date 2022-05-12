package fr.eni.mod9magasinroom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import fr.eni.mod9magasinroom.databinding.ActivityMainBinding
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity() {
    lateinit var vm: ArticleViewModel
    lateinit var amb: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        amb = DataBindingUtil.setContentView(this, R.layout.activity_main)
        vm = ViewModelProvider(this, ViewModelFactory(application))[ArticleViewModel::class.java]

        vm.article.observe(this) {
            amb.article = it
        }

        vm.articleRandomArticle()

        // thread {
        //     val dao = MagasinDb.getInstance(this).articleDao()
        //     dao.insert(Article(nom = "Projecteur", marque = "Dell", quantity = 1, prix = 1500f))
        //     dao.insert(Article(nom = "Ecran PC", marque = "Dell", quantity = 1, prix = 250f))
        // }
    }
}