/*
  * Copyright 2013-2018 Amazon.com, Inc. or its affiliates.
  * All Rights Reserved.
  *
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
  * You may obtain a copy of the License at
  *
  *     http://www.apache.org/licenses/LICENSE-2.0
  *
  * Unless required by applicable law or agreed to in writing, software
  * distributed under the License is distributed on an "AS IS" BASIS,
  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  * See the License for the specific language governing permissions and
  * limitations under the License.
  */

package com.amazonaws.mobile.auth.userpools;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import androidx.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;

import static com.amazonaws.mobile.auth.core.signin.ui.DisplayUtils.dp;
import static com.amazonaws.mobile.auth.core.signin.ui.DisplayUtils.getRoundedRectangleBackground;

/**
 * A view for displaying text and passwords.
 */
public class FormView extends LinearLayout {
    /** Corner radius. */
    private static final int FORM_CORNER_RADIUS = dp(8);
    private static final int FIELD_LEFT_RIGHT_MARGIN = dp(20);

    /** Background Drawables for the form. */
    private final Drawable[] backgroundDrawables;

    public FormView(final Context context) {
        this(context, null);
    }

    public FormView(final Context context, @Nullable final AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public FormView(final Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        boolean isDarkModeOn = (context.getResources().getConfiguration().uiMode &
                Configuration.UI_MODE_NIGHT_MASK) == Configuration.UI_MODE_NIGHT_YES;

        backgroundDrawables = new Drawable[] {
                // Border Shadow
                createRoundedRectShape(FORM_CORNER_RADIUS, Color.DKGRAY, 10),
                createRoundedRectShape(FORM_CORNER_RADIUS, Color.DKGRAY, 20),
                createRoundedRectShape(FORM_CORNER_RADIUS, Color.DKGRAY, 30),
                createRoundedRectShape(FORM_CORNER_RADIUS, Color.DKGRAY, 50),
                createRoundedRectShape(FORM_CORNER_RADIUS, Color.DKGRAY, 80),
                // Background color
                createRoundedRectShape(FORM_CORNER_RADIUS,
                        isDarkModeOn
                                ? Color.BLACK
                                : Color.WHITE
                        , 100)};

        this.setOrientation(VERTICAL);
        this.setBackgroundDrawable(getFormBackground());
    }

    private ShapeDrawable createRoundedRectShape(final int cornerRadius, final int color, final int alpha) {
        final ShapeDrawable insetBorderDrawable =
            getRoundedRectangleBackground(cornerRadius, color);
        if (alpha < 100) {
            insetBorderDrawable.setAlpha(alpha);
        }
        insetBorderDrawable.getPaint().setColor(color);
        return insetBorderDrawable;
    }

    /**
     * Create the form background.
     * @return the background drawable.
     */
    private Drawable getFormBackground() {
        final LayerDrawable layerDrawable = new LayerDrawable(backgroundDrawables);

        for (int i = 0; i < backgroundDrawables.length; i++) {
            layerDrawable.setLayerInset(i, dp(i), dp(i), dp(i), dp(i));
        }

        return layerDrawable;
    }

    private static class Divider extends View {
        final Paint paint;
        public Divider(Context context) {
            super(context);
            paint = new Paint();
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            paint.setColor(Color.LTGRAY);
            canvas.drawRect(getMeasuredWidth() * 0.1f, 0, getMeasuredWidth() * 0.9f, getMeasuredHeight(), paint);
        }
    }

    private EditText addField(final Context context, int inputType, final String fieldName) {
        final int additionalTopMarginForFirstElement;

        if (getChildCount() == 0) {
            additionalTopMarginForFirstElement = getFormShadowMargin();
        } else {
            additionalTopMarginForFirstElement = 0;

            // Get previous ites layout params.
            final LinearLayout.LayoutParams prevFormEditTextLayoutParams
                = (LayoutParams)getChildAt(getChildCount() - 1).getLayoutParams();

            // Clear previous item's bottom margin.
            prevFormEditTextLayoutParams.setMargins(
                prevFormEditTextLayoutParams.leftMargin,
                prevFormEditTextLayoutParams.topMargin,
                prevFormEditTextLayoutParams.rightMargin,
                0);

            // Add a divider before the next item.
            addView(new Divider(context), LayoutParams.MATCH_PARENT, dp(1));
        }

        final FormEditText formEditText = new FormEditText(context, inputType, fieldName);
        final LinearLayout.LayoutParams formEditTextLayoutParams
            = new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT);

        formEditTextLayoutParams.setMargins(FIELD_LEFT_RIGHT_MARGIN, additionalTopMarginForFirstElement, FIELD_LEFT_RIGHT_MARGIN, getFormShadowMargin());
        this.addView(formEditText, formEditTextLayoutParams);

        return formEditText.getEditTextView();
    }


    /**
     * Add a field to the form.
     * @param context the context.
     * @param inputType the desired EditText input type.
     * @param fieldName the field name.
     * @return the EditText object created within the form.
     */
    public EditText addFormField(final Context context, int inputType, final String fieldName) {
        return addField(context, inputType, fieldName);
    }

    /**
     * @return the number of margin pixels drawn on each side of the form.
     */
    public int getFormShadowMargin() {
        return dp(backgroundDrawables.length - 1);
    }
}
