package tj.contact.ActivityAboutContact

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import tj.contact.R

class ContactViewHolderAdapter(private val itemCallBack: OnContactItemClick) :
    RecyclerView.Adapter<ContactViewHolderAdapter.MyViewHolder>() {

    private val data = arrayListOf(
        UserInfo(
            1, "Shokirov Shahriyor", R.drawable.hulk, "(992) 988123456", "ShahriyorHulk.@mail.ru"
        ),
        UserInfo(
            2, "Natasha Romanoff", R.drawable.nat, "(992) 988456789", "NatRomanoff@mail.ru"
        ),
        UserInfo(
            3, "Thor", R.drawable.thjr, "(992) 988111222", "Azgarg@gmail.com"
        ),
        UserInfo(
            4, "Thanos", R.drawable.tanus, "(992) 988333444", "NoMercyEmail.ru"
        ),
        UserInfo(
            5, "Steve Rogers", R.drawable.cap, "(992) 988555666", "capAmerica@gmail.com"
        ),
        UserInfo(
            6, "Spider Man", R.drawable.pauk, "(992) 988777888", "Pauchek.@gmailcom"
        ),
        UserInfo(
            7, "Doctor Strange", R.drawable.doc, "(992) 988888999", "Doc_@mail.ri"
        ), UserInfo(
            8, "Shokirov Shahriyor", R.drawable.hulk, "(992) 988123456", "ShahriyorHulk.@mail.ru"
        ),
        UserInfo(
            9, "Natasha Romanoff", R.drawable.nat, "(992) 988456789", "NatRomanoff@mail.ru"
        ),
        UserInfo(
            10, "Thor", R.drawable.thjr, "(992) 988111222", "Azgarg@gmail.com"
        ),
        UserInfo(
            11, "Thanos", R.drawable.tanus, "(992) 988333444", "NoMercyEmail.ru"
        ),
        UserInfo(
            12, "Steve Rogers", R.drawable.cap, "(992) 988555666", "capAmerica@gmail.com"
        ),
        UserInfo(
            13, "Spider Man", R.drawable.pauk, "(992) 988777888", "Pauchek.@gmailcom"
        ),
        UserInfo(
            14, "Doctor Strange", R.drawable.doc, "(992) 988888999", "Doc_@mail.ri"
        ), UserInfo(
            15, "Shokirov Shahriyor", R.drawable.hulk, "(992) 988123456", "ShahriyorHulk.@mail.ru"
        ),
        UserInfo(
            16, "Natasha Romanoff", R.drawable.nat, "(992) 988456789", "NatRomanoff@mail.ru"
        ),
        UserInfo(
            17, "Thor", R.drawable.thjr, "(992) 988111222", "Azgarg@gmail.com"
        ),
        UserInfo(
            18, "Thanos", R.drawable.tanus, "(992) 988333444", "NoMercyEmail.ru"
        ),
        UserInfo(
            19, "Steve Rogers", R.drawable.cap, "(992) 988555666", "capAmerica@gmail.com"
        ),
        UserInfo(
            20, "Spider Man", R.drawable.pauk, "(992) 988777888", "Pauchek.@gmailcom"
        ),
        UserInfo(
            21, "Doctor Strange", R.drawable.doc, "(992) 988888999", "Doc_@mail.ri"
        )
    )
    private val mOnClickListener: View.OnClickListener

    init {
        mOnClickListener = View.OnClickListener { v ->
            val item = v.tag as UserInfo
            itemCallBack.onEmployeeClick(item)
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_view, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        val contact = data[position]
        holder.contactName.text = contact.userName
        holder.profileImage.setImageResource(contact.avatarImage)

        with(holder.cView) {
            tag = contact
            setOnClickListener(mOnClickListener)
        }
    }

    override fun getItemCount(): Int {
        return data.size
    }

    inner class MyViewHolder(val cView: View) : RecyclerView.ViewHolder(cView) {

        val contactName: TextView = cView.findViewById(R.id.salom)
        val profileImage: ImageView = cView.findViewById(R.id.profileImage)

    }


    interface OnContactItemClick {
        fun onEmployeeClick(itemContact: UserInfo)
    }
}


data class UserInfo(
    val id: Int,
    val userName: String,
    val avatarImage: Int,
    val phoneNumber: String,
    val emailContact: String

)
