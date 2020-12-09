package tj.contact

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import tj.contact.ActivityAboutContact.AboutContactActivity
import tj.contact.ActivityAboutContact.ContactViewHolderAdapter
import tj.contact.ActivityAboutContact.UserInfo

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    lateinit var adapter: ContactViewHolderAdapter
    private lateinit var viewManager: LinearLayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        recyclerView = findViewById(R.id.recyclerView)
        viewManager = LinearLayoutManager(this)
        adapter = ContactViewHolderAdapter(object : ContactViewHolderAdapter.OnContactItemClick {
            override fun onEmployeeClick(itemContact: UserInfo) {
                val intent = Intent(baseContext, AboutContactActivity::class.java)
                intent.putExtra("key", itemContact.avatarImage)
                intent.putExtra("name", itemContact.userName)
                intent.putExtra("phone", itemContact.phoneNumber)
                intent.putExtra("email", itemContact.emailContact)
                startActivity(intent)

            }
        })
        recyclerView.layoutManager = viewManager
        recyclerView.adapter = adapter
        recyclerView.addItemDecoration(
            DividerItemDecoration(
                this,
                DividerItemDecoration.VERTICAL
            )
        )

    }
}