package com.taz.hangman.activity

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.firebase.firestore.DocumentChange
import com.google.firebase.firestore.ListenerRegistration
import com.taz.hangman.R
import com.taz.hangman.chat.ChatFragment
import com.taz.hangman.dialogfragment.InfoDialogFragment
import com.taz.hangman.fragment.LeaderBoardFragment
import com.taz.hangman.fragment.LobbyFragment
import com.taz.hangman.local.DataHolder
import com.taz.hangman.utils.NetworkHelper
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    private lateinit var chatListener: ListenerRegistration
    lateinit var actionBarDrawerToggle: ActionBarDrawerToggle
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        actionBarDrawerToggle = object : ActionBarDrawerToggle(
            this,
            drawerLayout,
            R.string.nav_app_bar_open_drawer_description,
            R.string.nav_app_bar_navigate_up_description
        ) {
        }.also { it.syncState(); drawerLayout.addDrawerListener(it) }

        supportFragmentManager.beginTransaction()
            .replace(
                R.id.primaryNavigationView,
                LeaderBoardFragment()
            ).commit()
        supportFragmentManager.beginTransaction()
            .replace(R.id.secondaryNavigationView, ChatFragment()).commit()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (actionBarDrawerToggle.onOptionsItemSelected(item)) return true
        else if (item.itemId == R.id.chat) {
            if (drawerLayout.isDrawerOpen(GravityCompat.END))
                drawerLayout.closeDrawer(GravityCompat.END)
            else {
                drawerLayout.openDrawer(GravityCompat.END)
                item.icon = ContextCompat.getDrawable(this, R.drawable.ic_chat)
            }
            return true
        } else if (item.itemId == R.id.music) {
            val musicIcon = ContextCompat.getDrawable(this, R.drawable.ic_music)
            val noMusicIcon = ContextCompat.getDrawable(this, R.drawable.ic_no_music)
            if (!DataHolder.isSilent) {
                item.icon = noMusicIcon
                DataHolder.isSilent = true
                supportFragmentManager.findFragmentById(R.id.fragmentHostMain)
                    ?.childFragmentManager?.fragments?.get(0)
                    ?.let { if (it is LobbyFragment) it.stopMusic() }
            } else {
                item.icon = musicIcon
                DataHolder.isSilent = false
                supportFragmentManager.findFragmentById(R.id.fragmentHostMain)
                    ?.childFragmentManager?.fragments?.get(0)
                    ?.let { if (it is LobbyFragment) it.playMusic() }
            }
            return true
        } else if (item.itemId == R.id.info) {
            val infoDialogFragment = InfoDialogFragment()
            infoDialogFragment.show(supportFragmentManager, InfoDialogFragment.TAG)
            return true
        }
        return super.onOptionsItemSelected(item)
    }
    private lateinit var _menu:Menu
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        menu?.let{_menu=it}
        return true
    }


    override fun onBackPressed() {
    }

    override fun onStart() {
        super.onStart()
        chatListener = ChatFragment.chatCollectionReference.addSnapshotListener({ v,e ->
            (v?.documentChanges?.filter { it.type== DocumentChange.Type.ADDED}?.size?:0>=1).let{
                if(this::_menu.isInitialized && !drawerLayout.isDrawerOpen(GravityCompat.END)) {
                    _menu.findItem(R.id.chat).icon = ContextCompat.getDrawable(this, R.drawable.ic_chat_info)
                }
            }
        })
    }

    override fun onStop() {
        super.onStop()
        chatListener.remove()
    }

}
