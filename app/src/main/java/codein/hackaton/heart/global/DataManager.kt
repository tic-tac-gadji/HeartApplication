package codein.hackaton.heart.global

import android.util.Log
import codein.hackaton.heart.models.Make
import com.google.firebase.database.*

class DataManager {

    fun getMakesManager(onSuccess: ((ArrayList<Make>)-> Unit), onFailure: (() -> Unit)) {
        val makesArray = ArrayList<Make> ()

        val reference: DatabaseReference = FirebaseDatabase.getInstance().getReference("Makes")
        reference.addValueEventListener(object : ValueEventListener {
            override fun onCancelled(p0: DatabaseError) {
                Log.e("DATA", "error")
                onFailure.invoke()
            }

            override fun onDataChange(p0: DataSnapshot) {

                val makeArray = arrayListOf<Make>()

                for (snapshot in p0.children) {
                    val makes = snapshot.getValue(Make::class.java)
                    makes?.let { makesArray.add(it) }
                }
                onSuccess.invoke(makesArray)
            }
        })



    }
}