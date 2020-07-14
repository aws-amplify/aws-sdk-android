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
import android.graphics.Color;
import androidx.annotation.IdRes;
import android.text.Editable;
import android.text.InputType;
import android.text.TextWatcher;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import static com.amazonaws.mobile.auth.core.signin.ui.DisplayUtils.dp;

import java.util.Locale;

/**
 * An EditText that shows the hint as a floating label once text is entered in the view.
 */
public class FormEditText extends LinearLayout {
    private static final int TEXT_VIEW_ID = 0xF01;
    private static final int EDIT_TEXT_ID = 0xF02;
    private static final int BIT_FOR_SHOWING_PASSWORD = InputType.TYPE_TEXT_VARIATION_PASSWORD ^ InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD;
    private static final int TEXT_VIEW_TOP_MARGIN = dp(5);
    private static final int EDIT_VIEW_BOTTOM_PADDING = dp(5);
    private static final int SHOW_PASSWORD_LEFT_RIGHT_MARGIN = dp(5);
    private static final int SHOW_PASSWORD_TOP_MARGIN = dp(-5); // float the show box up.
    private TextView textView;
    private EditText editText;
    private LinearLayout editFieldLayout;
    private TextView showPasswordToggleTextView = null;
    private boolean hasSetMinimumSize = false;

    @IdRes
    private int toViewId(int id) {
        return id;
    }

    public FormEditText(Context context, int inputType, final String fieldName) {
        super(context);
        this.setOrientation(VERTICAL);
        this.setGravity(Gravity.CENTER_VERTICAL);

        textView = new TextView(context);
        textView.setText(fieldName.toUpperCase(Locale.getDefault()));
        textView.setId(toViewId(TEXT_VIEW_ID));
        final LinearLayout.LayoutParams textViewLayoutParams
            = new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT);
        textViewLayoutParams.setMargins(0, TEXT_VIEW_TOP_MARGIN, 0, 0);
        this.addView(textView, textViewLayoutParams);
        textView.setVisibility(INVISIBLE);

        editText = new EditText(context);
        editText.setSingleLine();
        editText.setInputType(inputType);
        editText.setBackgroundColor(Color.TRANSPARENT);
        editText.setPadding(0,dp(2), 0, dp(2) + EDIT_VIEW_BOTTOM_PADDING);
        editText.setId(toViewId(EDIT_TEXT_ID));
        editText.setHint(fieldName);

        final LinearLayout.LayoutParams editTextLayoutParams
            = new LinearLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
        editTextLayoutParams.setMargins(0, 0, 0, 0);

        if ((inputType & InputType.TYPE_TEXT_VARIATION_PASSWORD) > 0) {
            editFieldLayout = new LinearLayout(context);
            editFieldLayout.setOrientation(HORIZONTAL);
            editTextLayoutParams.gravity = Gravity.START;
            editTextLayoutParams.weight = 1;
            editFieldLayout.addView(editText, editTextLayoutParams);

            showPasswordToggleTextView = new TextView(context);
            setupShowHidePassword();
            this.addView(editFieldLayout);

        } else {
            this.addView(editText, editTextLayoutParams);
        }

        setupTextChangedListener();
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        if (!hasSetMinimumSize) {
            this.setMinimumHeight(textView.getMeasuredHeight() + TEXT_VIEW_TOP_MARGIN + editText.getMeasuredHeight());
            textView.setVisibility(GONE);
            hasSetMinimumSize = true;
        }
    }

    private void setupShowHidePassword() {
        final String showText = getResources().getString(R.string.sign_in_show_password);
        final String hideText = getResources().getString(R.string.sign_in_hide_password);

        showPasswordToggleTextView.setText(showText);
        final LinearLayout.LayoutParams showPassLayoutParams
            = new LinearLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
        showPassLayoutParams.setMargins(
            SHOW_PASSWORD_LEFT_RIGHT_MARGIN, SHOW_PASSWORD_TOP_MARGIN, SHOW_PASSWORD_LEFT_RIGHT_MARGIN, 0);
        showPassLayoutParams.gravity = Gravity.END | Gravity.CENTER_VERTICAL;

        editFieldLayout.addView(showPasswordToggleTextView, showPassLayoutParams);
        showPasswordToggleTextView.setVisibility(GONE);

        showPasswordToggleTextView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                final CharSequence oldText = showPasswordToggleTextView.getText();
                final CharSequence newText = oldText.equals(showText) ? hideText : showText;
                showPasswordToggleTextView.setText(newText);
                int selectionStart = editText.getSelectionStart();
                int selectionEnd = editText.getSelectionEnd();
                if (oldText.equals(showText)) {
                    editText.setInputType(editText.getInputType() | BIT_FOR_SHOWING_PASSWORD);
                } else {
                    editText.setInputType(editText.getInputType() & ~BIT_FOR_SHOWING_PASSWORD);
                }
                editText.setSelection(selectionStart, selectionEnd);
            }
        });
    }

    private void setupTextChangedListener() {
        editText.addTextChangedListener(new TextWatcher() {
            private void handleFloatingTextVisibility() {
                if (editText.getText().length() == 0) {
                    if (hasSetMinimumSize) {
                        textView.setVisibility(GONE);
                    }
                    editText.setPadding(0,dp(2), 0, dp(2) + EDIT_VIEW_BOTTOM_PADDING);
                    if (showPasswordToggleTextView != null) {
                        showPasswordToggleTextView.setVisibility(GONE);
                    }
                } else {
                    textView.setVisibility(VISIBLE);
                    editText.setPadding(0,dp(1), 0, dp(3) + EDIT_VIEW_BOTTOM_PADDING);
                    if (showPasswordToggleTextView != null) {
                        showPasswordToggleTextView.setVisibility(VISIBLE);
                    }
                }
            }

            @Override
            public void beforeTextChanged(final CharSequence text, final int start, final int count, final int after) {
            }

            @Override
            public void onTextChanged(final CharSequence text, final int start, final int before, final int count) {
            }

            @Override
            public void afterTextChanged(final Editable text) {
                handleFloatingTextVisibility();
            }
        });
    }

    public EditText getEditTextView() {
        return editText;
    }
}
