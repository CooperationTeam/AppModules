package com.base.module.app;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.core.content.ContextCompat;

import com.base.library.font.FontsType;
import com.base.library.font.FontsUtil;

public class ViewItemUtil {

    private static final LinearLayout.LayoutParams layoutParams =
            new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);

    public static View generateItemView(Context context, String content, int viewId, View.OnClickListener onClickListener) {
        TextView textView = new TextView(context);
        textView.setText(content);
        textView.setId(viewId);
        textView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20);
        textView.setOnClickListener(onClickListener);
        textView.setSingleLine(true);
        layoutParams.setMarginStart((int) context.getResources().getDimension(R.dimen.dp_10));
        textView.setLayoutParams(layoutParams);
        textView.setPadding(28, 10, 28, 10);
        textView.setTypeface(FontsUtil.getTypeFace(context, FontsType.ROBOTO_REGULAR));
        textView.setTextColor(ContextCompat.getColor(context, R.color.appRed));
        textView.setBackgroundColor(ContextCompat.getColor(context, R.color.appGray));
        return textView;
    }
}
