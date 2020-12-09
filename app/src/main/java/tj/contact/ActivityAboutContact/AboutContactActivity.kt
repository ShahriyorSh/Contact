package tj.contact.ActivityAboutContact

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import tj.contact.R

class AboutContactActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_contact)


        val image: ImageView = findViewById(R.id.salom1)
        val contactName: TextView = findViewById(R.id.textView2)
        val phoneNumber: TextView = findViewById(R.id.phoneNumberId)
        val emailAddress: TextView = findViewById(R.id.email_id)

        val extras = intent.extras
        if (extras != null) {
            val value = extras.getInt("key")
            val name = extras.getString("name")
            val number = extras.getString("phone")
            val email = extras.getString("email")
            image.setImageResource(value)
            contactName.text = name
            phoneNumber.text = number
            emailAddress.text = email
        } else {
            Toast.makeText(this, "Hello", Toast.LENGTH_LONG).show()

        }

        val toolbar: androidx.appcompat.widget.Toolbar = findViewById(R.id.toolbar)
        toolbar.title = "О контакте"

        setSupportActionBar(toolbar)
        supportActionBar!!.setDisplayShowHomeEnabled(true)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when (item.itemId) {
            R.id.exit -> {
                Toast.makeText(baseContext, "Выход", Toast.LENGTH_LONG).show()
            }
        }

        return super.onOptionsItemSelected(item)

    }

}

