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

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

/**
 * Stores Configuration information related to the SignIn UI screen.
 */
public final class AuthUIConfiguration {

    /**
     * Key for Background Color.
     */
    private static final String CONFIG_KEY_SIGN_IN_BACKGROUND_COLOR = "signInBackgroundColor";

    /**
     * Key for Resource Identifier of the Logo Image.
     */
    private static final String CONFIG_KEY_SIGN_IN_IMAGE_RESOURCE_ID = "signInImageResId";

    /**
     * Key for UserPools.
     */
    private static final String CONFIG_KEY_ENABLE_USER_POOLS = "signInUserPoolsEnabled";

    /**
     * Key for SignInButtons.
     */
    private static final String CONFIG_KEY_SIGN_IN_BUTTONS = "signInButtons";

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
     * Class for building the AWSMobileAuthUIConfiguration object
     *
     * For example, create the config object with specific attributes.
     *
     *  AuthUIConfiguration config =
     *           new AuthUIConfiguration.Builder()
     *               .userPools(true)
     *               .logoResId(R.drawable.logo_image)
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
         * Builds the AuthUIConfiguration object.
         * @return the AuthUIConfiguration created by the parts provided
         */
        public AuthUIConfiguration build() {
            return new AuthUIConfiguration(configuration);
        }
    }
}
