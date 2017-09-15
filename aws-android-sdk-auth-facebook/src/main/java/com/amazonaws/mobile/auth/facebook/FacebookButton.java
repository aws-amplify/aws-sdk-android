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

package com.amazonaws.mobile.auth.facebook;

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
 * A Facebook button that will render appropriately for different sizes. By default, the button
 * will display showing an icon and text.  The button can be set to small style to show only
 * the icon.
 */
public class FacebookButton extends SignInButton {

    /** Log tag. */
    private static final String LOG_TAG = FacebookButton.class.getSimpleName();

    /** Button corner radius. */
    private static final int CORNER_RADIUS = dp(4);

    /** Button background color. */
    private static final int FB_BACKGROUND_COLOR = 0xFF3C5C95;

    /** Button background color when pressed. */
    private static final int FB_BACKGROUND_COLOR_PRESSED = 0xFF2D4570;

    /** Button top shadow color. */
    private static final int BUTTON_TOP_SHADOW_COLOR = 0xFFCCCCCC;

    /** Button top shadow thickness in pixels. */
    private static final int BUTTON_TOP_SHADOW_THICKNESS = (int) dp(1);

    /** Button bottom shadow thickness in pixels. */
    private static final int BUTTON_BOTTOM_SHADOW_THICKNESS = (int) dp(2);

    /**
     * Constructor.
     * @param context context.
     */
    public FacebookButton(@NonNull final Context context) {
        this(context, null);
    }

    /**
     * Constructor.
     * @param context context.
     * @param attrs attribute set.
     */
    public FacebookButton(@NonNull final Context context,
                          @Nullable final AttributeSet attrs) {
        this(context, attrs, 0);
    }

    /**
     * Constructor.
     * @param context context.
     * @param attrs attribute set.
     * @param defStyleAttr default style attribute.
     */
    public FacebookButton(@NonNull final Context context,
                          @Nullable final AttributeSet attrs,
                          final int defStyleAttr) {
        super(context, attrs, defStyleAttr,
                new SignInButtonAttributes()
                        .withCornerRadius(CORNER_RADIUS)
                        .withBackgroundColor(FB_BACKGROUND_COLOR)
                        .withBackgroundColorPressed(FB_BACKGROUND_COLOR_PRESSED)
                        .withTextColor(Color.WHITE)
                        .withDefaultTextResourceId(R.string.default_facebook_button_text)
                        .withImageIconResourceId(R.drawable.facebook_icon)
                        .withTopShadowColor(BUTTON_TOP_SHADOW_COLOR)
                        .withTopShadowThickness(BUTTON_TOP_SHADOW_THICKNESS)
                        .withBottomShadowThickness(BUTTON_BOTTOM_SHADOW_THICKNESS)
        );


        if (isInEditMode()) {
            return;
        }

        try {
            final SignInManager signInManager = SignInManager.getInstance();
            signInManager.initializeSignInButton(FacebookSignInProvider.class, this);
        } catch (Exception exception) {
            exception.printStackTrace();
            Log.e(LOG_TAG, "Cannot initialize the SignInButton. Please check if IdentityManager : "
                    + " startUpAuth and setUpToAuthenticate are invoked");
        }
    }
}
