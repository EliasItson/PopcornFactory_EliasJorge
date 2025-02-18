package elias.jorge.popcornfactory_eliasjorge

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MovieDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_movie_details)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val imageViewMovie = findViewById<ImageView>(R.id.imageViewMovie)
        val textViewMovieName = findViewById<TextView>(R.id.textViewMovieName)
        val textViewMovieDesc = findViewById<TextView>(R.id.textViewMovieDesc)

        val bundle = intent.extras

        if(bundle != null){
            imageViewMovie.setImageResource(bundle.getInt("header"))
            textViewMovieName.setText(bundle.getInt("name"))
            textViewMovieDesc.setText(bundle.getInt("synopsis"))
        }
    }
}