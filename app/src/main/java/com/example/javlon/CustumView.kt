package com.example.javlon

import android.content.Context
import android.util.AttributeSet
import android.widget.RelativeLayout

class CustumView @JvmOverloads constructor(context: Context, attrs: AttributeSet? = null): RelativeLayout(context, attrs ) {

    init {
        inflate(context, R.layout.custum_view, this)
    }

}


