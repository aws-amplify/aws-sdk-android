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

package com.amazonaws.mobile.auth.ui;

import com.amazonaws.mobile.auth.core.signin.ui.buttons.SignInButton;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

/**
 * Stores Configuration information related to the SignIn UI screen.
 */
public final class AuthUIConfiguration implements Serializable {

    /**
     * Key for Background Color.
     */
    static final String CONFIG_KEY_SIGN_IN_BACKGROUND_COLOR = "signInBackgroundColor";

    /**
     * Key for Resource Identifier of the Logo Image.
     */
    static final String CONFIG_KEY_SIGN_IN_IMAGE_RESOURCE_ID = "signInImageResId";

    /**
     * Key for UserPools.
     */
    static final String CONFIG_KEY_ENABLE_USER_POOLS = "signInUserPoolsEnabled";

    /**
     * Key for SignInButtons.
     */
    static final String CONFIG_KEY_SIGN_IN_BUTTONS = "signInButtons";

    /**
     * Key for global Font across all the SignIn views and its subviews.
     */
    static final String CONFIG_KEY_FONT_FAMILY = "fontFamily";

    /**
     * Key for Enabling background color full screen.
     */
    static final String CONFIG_KEY_FULL_SCREEN_BACKGROUND = "fullScreenBackgroundColor";

    /**
     * Key for ability to cancel the sign-in.
     */
    static final String CONFIG_KEY_CAN_CANCEL = "canCancel";

    /**
     * Map to store the key and the corresponding objects.
     */
    private final Map<String, Object> config;

    /**
     * Constructor.
     *
     * @param config The Configuration Map
     */
    private AuthUIConfiguration(final Map<String, Object> config) {
      this.config = config;
    }

    /**
     * Returns the resource identifier of the logo image if set by the user.
     * Else, returns the resource identifier of the default logo image
     * passed in.
     *
     * @param defaultResourceId The Resource identifier for the default logo image
     * @return The resource identifier set in config or the default passed in
     */
    public int getSignInImageResourceId(final int defaultResourceId) {
      final Integer resId = (Integer) config.get(CONFIG_KEY_SIGN_IN_IMAGE_RESOURCE_ID);
      if (resId == null) {
        return defaultResourceId;
      }
      return resId;
    }

    /**
     * Returns the background color chosen by the user.
     * Else, returns the default background color passed in.
     *
     * @param defaultBackgroundColor The Default Background color
     * @return The background color set in config or the default passed in
     */
    public int getSignInBackgroundColor(final int defaultBackgroundColor) {
      final Integer backgroundColor = (Integer) config.get(CONFIG_KEY_SIGN_IN_BACKGROUND_COLOR);
      if (backgroundColor == null) {
        return defaultBackgroundColor;
      }
      return backgroundColor;
    }

    /**
     * Checks if userpools is enabled by the user.
     * @return True if UserPools is enabled
     */
    public boolean getSignInUserPoolsEnabled() {
      Object userPoolsEnabled = config.get(CONFIG_KEY_ENABLE_USER_POOLS);
      if (userPoolsEnabled != null) {
          return (Boolean) userPoolsEnabled;
      } else {
          return false;
      }
    }

    /**
     * Gets the list of the SignInButton classes configured.
     * @return The list of SignInButton classes
     */
    public ArrayList<Class<? extends SignInButton>> getSignInButtons() {
        return (ArrayList) config.get(CONFIG_KEY_SIGN_IN_BUTTONS);
    }

    /**
     * Gets the font family.
     * @return The font family.
     */
    public String getFontFamily() {
        return (String) config.get(CONFIG_KEY_FONT_FAMILY);
    }

    /**
     * Gets the Full screen background enabled or not.
     * @return True if full screen background is enabled.
     */
    public boolean isBackgroundColorFullScreen() {
        Object fullScreenBackgroundColorEnabled = config.get(CONFIG_KEY_FULL_SCREEN_BACKGROUND);
        if (fullScreenBackgroundColorEnabled != null) {
            return (Boolean) fullScreenBackgroundColorEnabled;
        } else {
            return false;
        }
    }

    public boolean getCanCancel() {
        Object canCancel = config.get(CONFIG_KEY_CAN_CANCEL);
        if (canCancel != null) {
            return (Boolean) canCancel;
        } else {
            return false;
        }
    }

    /**
     * Class for building the AuthUIConfiguration object
     *
     * For example, create the config object with specific attributes.
     *
     *  AuthUIConfiguration config =
     *           new AuthUIConfiguration.Builder()
     *               .userPools(true)
     *               .logoResId(logoResourceIdentifier)
     *               .signInButton(CustomSignInButton.class)
     *               .build();
     */
    public static class Builder {

        /** Local object for storing the configuration. */
        private final Map<String, Object> configuration = new HashMap<String, Object>();

        /** Constructor. */
        public Builder() { }

        /**
         * The Resource Identifier for the logo image passed by the user
         * is stored in the config map.
         *
         * @param logoResId The Resource identifier for the logo image
         * @return builder
         */
        public Builder logoResId(final int logoResId) {
            configuration.put(CONFIG_KEY_SIGN_IN_IMAGE_RESOURCE_ID, logoResId);
            return this;
        }

        /**
         * The Background color that is dislayed on the first half
         * of the SignIn Screen.
         *
         * @param color The Background color
         * @return builder
         */
        public Builder backgroundColor(final int color) {
            configuration.put(CONFIG_KEY_SIGN_IN_BACKGROUND_COLOR, color);
            return this;
        }

        /**
         * Invoke this method in order to enable userpools.
         *
         * @param enabledUserPools Flag that indicates if the userpools is enabled or not
         * @return builder
         */
        public Builder userPools(final boolean enabledUserPools) {
            configuration.put(CONFIG_KEY_ENABLE_USER_POOLS, enabledUserPools);
            return this;
        }

        /**
         * Add a SignInButton to the SignIn Screen by passing in the Class
         * of the button that inherits from the SignInButton.
         *
         * @param signInButton Button Class that inherits from the SignInButton
         * @return builder
         */
        public Builder signInButton(final Class<? extends SignInButton> signInButton) {
            ArrayList<Class<? extends SignInButton>> signInButtonList;
            if (configuration.get(CONFIG_KEY_SIGN_IN_BUTTONS) == null) {
                signInButtonList = new ArrayList<Class<? extends SignInButton>>();
                signInButtonList.add(signInButton);
                configuration.put(CONFIG_KEY_SIGN_IN_BUTTONS, signInButtonList);
            } else {
                signInButtonList = (ArrayList) configuration.get(CONFIG_KEY_SIGN_IN_BUTTONS);
                signInButtonList.add(signInButton);
            }
            return this;
        }

        /**
         * Invoke this method in order to pass in a custom font family.
         *
         * @param fontFamily The custom font family.
         * @return builder
         */
        public Builder fontFamily(final String fontFamily) {
            configuration.put(CONFIG_KEY_FONT_FAMILY, fontFamily);
            return this;
        }

        /**
         * Invoke this method in order to draw the background color full screen.
         *
         * @param isFullScreenBackgroundEnabled
         * @return builder
         */
        public Builder isBackgroundColorFullScreen(final boolean isFullScreenBackgroundEnabled) {
            configuration.put(CONFIG_KEY_FULL_SCREEN_BACKGROUND, isFullScreenBackgroundEnabled);
            return this;
        }

        /**
         * Ability to cancel the signin flow.
         * 
         * @param canCancelSignIn
         * @return builder
         */
        public Builder canCancel(final boolean canCancelSignIn) {
            configuration.put(CONFIG_KEY_CAN_CANCEL, canCancelSignIn);
            return this;
        }

        /**
         * Builds the AuthUIConfiguration object.
         * @return the AuthUIConfiguration created by the parts provided
         */
        public AuthUIConfiguration build() {
            return new AuthUIConfiguration(configuration);
        }
    }
}
