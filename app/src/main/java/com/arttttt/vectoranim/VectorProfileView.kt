package com.arttttt.vectoranim

import android.content.Context
import android.util.AttributeSet
import android.widget.ImageView

class VectorProfileView(context: Context, attrs: AttributeSet?, defStyleAttr: Int, defStyleRes: Int)
    : ImageView(context, attrs, defStyleAttr, defStyleRes) {

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int): this(context, attrs, defStyleAttr, 0)
    constructor(context: Context, attrs: AttributeSet?): this(context, attrs, 0)
    constructor(context: Context): this(context, null)

    private var mCurrentProfileIndex = 0

    private val mProfileAttrs = intArrayOf(
            R.attr.profile_save,
            R.attr.profile_bias_save,
            R.attr.profile_balanced,
            R.attr.profile_high)

    fun switchProfile() {

        mCurrentProfileIndex++

        if (mCurrentProfileIndex == 4)
            mCurrentProfileIndex = 0

        val state = mutableListOf<Int>()

        for (index in 0 until mProfileAttrs.size) {
            if (mCurrentProfileIndex == index)
                state.add(mProfileAttrs[index])
            else
                state.add(-mProfileAttrs[index])
        }

        setImageState(state.toIntArray(), true)
    }

    fun getProfile(): String {
        return ""
    }

}