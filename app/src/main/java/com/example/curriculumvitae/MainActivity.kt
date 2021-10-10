package com.example.curriculumvitae

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.example.curriculumvitae.classes.Person
//import sun.jvm.hotspot.utilities.IntArray
import java.text.SimpleDateFormat
import java.util.*


class MainActivity : AppCompatActivity() {

    lateinit var fmanager : FragmentManager
    lateinit var txn: FragmentTransaction

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fmanager = supportFragmentManager
        txn = fmanager.beginTransaction()
        txn.add(R.id.frMain, HomeFragment())
        txn.commit()

        init()
    }

    fun init(){
        val dateformat: SimpleDateFormat = SimpleDateFormat("MM/dd/yyyy", Locale.US)

        var date ="05/05/2017"
        //SimpleDateFormat output = new SimpleDateFormat("MMMM dd,yyyy @hh:mm:ss aa");
        var oneWayTripDate = dateformat.parse(date);  // parse input

        //listItems.add(dateformat.format(Date()))
        var p1 = Person(1, "Baibing", "Song", "", dateformat.parse(date), "973-752-9339", "bsong@miu.edu", "baibing", "baibing", "lool - ")

    }

    fun onBtnHome(view: View){
        txn = fmanager.beginTransaction()
        txn.replace(R.id.frMain, HomeFragment())
        txn.commit()
    }
    fun onBtnAbout(view: View){
        txn = fmanager.beginTransaction()
        txn.replace(R.id.frMain, AboutFragment())
        txn.commit()
    }

    fun onBtnWork(view: View){
        txn = fmanager.beginTransaction()
        txn.replace(R.id.frMain, WorkFragment())
        txn.commit()
    }

    fun onBtnContact(view: View){
        txn = fmanager.beginTransaction()
        txn.replace(R.id.frMain, ContactFragment())
        txn.commit()
    }

}
