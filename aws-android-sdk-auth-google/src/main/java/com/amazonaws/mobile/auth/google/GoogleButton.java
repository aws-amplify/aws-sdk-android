/*
  * Copyright 2013-2017 Amazon.com, Inc. or its affiliates.
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

package com.amazonaws.mobile.auth.google;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;

import com.amazonaws.mobile.auth.core.signin.SignInManager;
import com.amazonaws.mobile.auth.core.signin.ui.buttons.SignInButton;
import com.amazonaws.mobile.auth.core.signin.ui.buttons.SignInButtonAttributes;

import static com.amazonaws.mobile.auth.core.signin.ui.DisplayUtils.dp;

/**
 * Represents the Google SignInButton.
 */
public class GoogleButton extends SignInButton {

    /** Log tag. */
    private static final String LOG_TAG = GoogleButton.class.getSimpleName();

    /** Button corner radius. */
    private static final int CORNER_RADIUS = 4;

    /** Button background color. */
    private static final int GOOGLE_BACKGROUND_COLOR = Color.WHITE;

    /** Button background color when pressed. */
    private static final int GOOGLE_BACKGROUND_COLOR_PRESSED = Color.LTGRAY;

    /** Text Color. */
    private static final int TEXT_COLOR = Color.DKGRAY;

    /** Button top shadow color. */
    private static final int BUTTON_TOP_SHADOW_COLOR = 0xFFCCCCCC;

    /** Button top shadow thickness in pixels. */
    private static final int BUTTON_TOP_SHADOW_THICKNESS = (int) dp(1);

    /** Button bottom shadow thickness in pixels. */
    private static final int BUTTON_BOTTOM_SHADOW_THICKNESS = (int) dp(2);

    /**
     * Constructor.
     * @param context The activity context
     */
    public GoogleButton(@NonNull final Context context) {
        this(context, null);
    }

    /**
     * Constructor.
     * @param context The activity context
     * @param attrs The AttributeSet passed in by the application
     */
    public GoogleButton(@NonNull final Context context,
                        @Nullable final AttributeSet attrs) {
        this(context, attrs, 0);
    }

    /**
     * Constructor.
     * @param context The activity context
     * @param attrs The AttributeSet passed in by the application
     * @param defStyleAttr The default style attribute
     */
    public GoogleButton(@NonNull final Context context,
                        @Nullable final AttributeSet attrs,
                        final int defStyleAttr) {
        super(context, attrs, defStyleAttr,
                new SignInButtonAttributes()
                        .withCornerRadius(CORNER_RADIUS)
                        .withBackgroundColor(GOOGLE_BACKGROUND_COLOR)
                        .withBackgroundColorPressed(GOOGLE_BACKGROUND_COLOR_PRESSED)
                        .withTextColor(TEXT_COLOR)
                        .withDefaultTextResourceId(R.string.default_google_button_text)
                        .withImageIconResourceId(R.drawable.google_icon)
                        .withTopShadowColor(BUTTON_TOP_SHADOW_COLOR)
                        .withTopShadowThickness(BUTTON_TOP_SHADOW_THICKNESS)
                        .withBottomShadowThickness(BUTTON_BOTTOM_SHADOW_THICKNESS)
        );

        if (isInEditMode()) {
            return;
        }

        try {
            final SignInManager signInManager = SignInManager.getInstance();
            signInManager.initializeSignInButton(GoogleSignInProvider.class, this);
        } catch (Exception exception) {
            exception.printStackTrace();
            Log.e(LOG_TAG, "Cannot initialize the SignInButton. Please check if IdentityManager :"
                    + " startUpAuth and setUpToAuthenticate are invoked");
        }
    }

}

