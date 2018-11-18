package fr.nebulord.pokemonstudio

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.*

class MainFragment : Fragment() {
    companion object {
        fun newInstance() = MainFragment()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?
    {
        return inflater.inflate(R.layout.content_main, container, false)
    }
}
