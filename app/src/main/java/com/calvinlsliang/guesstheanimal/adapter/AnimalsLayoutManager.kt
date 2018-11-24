package com.calvinlsliang.guesstheanimal.adapter

import android.content.Context
import androidx.recyclerview.widget.GridLayoutManager

class AnimalsLayoutManager(context: Context, spanCount: Int ) : GridLayoutManager(context, spanCount) {
    override fun canScrollVertically(): Boolean {
        return false
    }
}
