package fr.nebulord.pokemonstudio

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.support.annotation.RequiresApi
import android.support.v4.app.Fragment
import android.util.AttributeSet
import android.view.ViewGroup
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View

class AnkoFragment : Fragment()
{
    companion object
    {
        fun newInstance() = AnkoFragment()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View?
    {
        return inflater.inflate(R.layout.fragment_anko, container, false)
    }
}
