package it.sephiroth.android.library.bottomnavigation

import android.content.Context
import android.graphics.drawable.Drawable
import android.view.ViewGroup

/**
 * Created by alessandro on 4/4/16 at 11:13 PM.
 * Project: Material-BottomNavigation
 */
abstract class ItemsLayoutContainer(context: Context) : ViewGroup(context) {

    abstract fun getSelectedIndex(): Int

    abstract fun setSelectedIndex(index: Int, animate: Boolean)

    abstract fun populate(menu: MenuParser.Menu)

    abstract fun setIcon(index: Int,newIcon : Drawable)

    abstract fun setTitle(index: Int,newTitle : String)

    var itemClickListener: OnItemClickListener? = null

    abstract fun removeAll()

    abstract fun setItemEnabled(index: Int, enabled: Boolean)
}
