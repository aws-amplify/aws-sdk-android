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

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.amazonaws.mobile.auth.core.signin.ui.BackgroundDrawable;
import com.amazonaws.mobile.auth.core.signin.ui.SplitBackgroundDrawable;
import com.amazonaws.mobile.auth.core.signin.ui.buttons.SignInButton;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;

import static com.amazonaws.mobile.auth.core.signin.ui.DisplayUtils.dp;

/**
 * View for displaying sign-in components.
 */
public class SignInView extends LinearLayout {

    /** Log Tag. */
    private static final String LOG_TAG = SignInView.class.getSimpleName();

    /** Height of the logo image. */
    private static final int MAX_IMAGE_HEIGHT = dp(250);

    /** Margins of the logo image. */
    private static final int IMAGE_MARGINS = dp(20);

    /** Margins for the Image Layout that holds the logo image. */
    private static final int IMAGE_LAYOUT_MARGINS = dp(10);

    /** String that represents the SDK Version. */
    private static final String SDK_VERSION = "2.7.6";

    /** Common Prefix of the namespaces of different SignIn providers. */
    private static final String NAMESPACE_COMMON_PREFIX = "com.amazonaws.mobile.auth";

    /** Group name. */
    private static final String AWS_MOBILE_AUTH_GROUP_NAME = "com.amazonaws";

    /** Dependency name for UserPool SignIn View class. */
    private static final String USER_POOL_SIGN_IN_VIEW = NAMESPACE_COMMON_PREFIX + ".userpools.UserPoolSignInView";

    /** Dependency name for FormView of UserPool SignIn. */
    private static final String FORM_VIEW = NAMESPACE_COMMON_PREFIX + ".userpools.FormView";

    /** Dependency name for UserPool SignIn package. */
    private static final String USER_POOL_SIGN_IN_IMPORT = AWS_MOBILE_AUTH_GROUP_NAME
            + ":aws-android-sdk-auth-userpools:"
            + SDK_VERSION;

    /** Dependency name for Facebook Button class. */
    private static final String FACEBOOK_BUTTON = NAMESPACE_COMMON_PREFIX + ".facebook.FacebookButton";

    /** Dependency name for Facebook SignIn package. */
    private static final String FACEBOOK_SIGN_IN_IMPORT = AWS_MOBILE_AUTH_GROUP_NAME
            + ":aws-android-sdk-auth-facebook:"
            + SDK_VERSION;

    /** Dependency name for Google Button class. */
    private static final String GOOGLE_BUTTON = NAMESPACE_COMMON_PREFIX + ".google.GoogleButton";

    /** Dependency name for Google SignIn package. */
    private static final String GOOGLE_SIGN_IN_IMPORT =  AWS_MOBILE_AUTH_GROUP_NAME
            + ":aws-android-sdk-auth-google:"
            +  SDK_VERSION;

    /** Package Name for AuthUI. */
    private static final String PACKAGE_NAME = "com.amazonaws.mobile.auth.ui";

    /** Configuration Key to store AuthUIConfiguration objects. */
    public static final String CONFIGURATION_KEY = "com.amazonaws.mobile.auth.ui.configurationkey";

    /** Default Background Color. */
    public static final int DEFAULT_BACKGROUND_COLOR = Color.DKGRAY;

    /** Resource Identitifer for default Logo Image. */
    public static final int DEFAULT_LOGO_IMAGE_RES_ID = R.drawable.default_sign_in_logo;

    /** Image View. */
    private ImageView imageView;

    /** Divider in the SignIn screen. */
    private View divider;

    /** Margins for the SignIn Button. */
    private int signInButtonMargin;

    /** Width for the SignIn Button. */
    private int signInButtonWidth;

    /** Height for the SignIn Button. */
    private int signInButtonHeight;

    /** Reference to the AuthUIConfiguration. */
    private AuthUIConfiguration config = null;

    /** Reference to the UserPoolsSignInView. */
    private Object userPoolsSignInView = null;

    /** Stores the list of SignInButtons. */
    private ArrayList<SignInButton> buttonStore = null;

    /** Resource Identifier for the logo image. */
    private int logoResId;

    /** Background Color. */
    private int backgroundColor;

    /** Draw background color the whole screen. */
    private BackgroundDrawable backgroundDrawable;

    /** Draw background color from the top position to the middle. */
    private SplitBackgroundDrawable splitBackgroundDrawable;

    /**
     * Consructor.
     * @param context Activity Context
     */
    public SignInView(final Context context) {
        this(context, null);
    }

    /**
     * Constructor.
     * @param context Activity Context
     * @param attrs Attribute Set
     */
    public SignInView(final Context context,
                      final AttributeSet attrs) {
        this(context, attrs, 0);
    }

    /**
     * Sets up the logo image and the background color.
     */
    private void setUpLogoAndBackgroundColor() {
        /**
         * Get default background color and image resource ids.
         */
        this.logoResId = DEFAULT_LOGO_IMAGE_RES_ID;
        this.backgroundColor = DEFAULT_BACKGROUND_COLOR;

        Log.d(LOG_TAG, "Using defaults: backgroundColor = "
            + backgroundColor + "; logoResId = " + logoResId);

        /**
         * Read in the image resource id and background color
         * from the configuration if present.
         */
        if (!isInEditMode()) {
            if (this.config != null) {
                this.logoResId = this.config.getSignInImageResourceId(logoResId);
                this.backgroundColor = this.config.getSignInBackgroundColor(backgroundColor);
            }
        }

        Log.d(LOG_TAG, "Background Color : " + this.backgroundColor);
        Log.d(LOG_TAG, "Logo : " + this.logoResId);
    }

    /**
     * Sets up the Splitter and background drawable.
     */
    private void setUpBackgroundDrawable() {
        backgroundDrawable = new BackgroundDrawable(backgroundColor);
        if (this.config != null && this.config.getSignInUserPoolsEnabled()) {
            splitBackgroundDrawable = new SplitBackgroundDrawable(0, backgroundColor);
        } else {
            splitBackgroundDrawable = new SplitBackgroundDrawable(0);
        }

        if (this.config != null && this.config.isBackgroundColorFullScreen()) {
            setBackgroundDrawable(backgroundDrawable);
        } else {
            setBackgroundDrawable(splitBackgroundDrawable);
        }
    }

    /**
     * Sets up the image view that displays the logo image.
     * @param context The activity context.
     */
    private void setUpImageView(final Context context) {
        /**
         * ImageView that holds the logo image.
         */
        imageView = new ImageView(context);
        imageView.setImageResource(logoResId);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setAdjustViewBounds(true);

        /**
         * Layout for the image view.
         */
        final LinearLayout.LayoutParams imageLayoutParams
                = new LinearLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
        imageLayoutParams.setMargins(IMAGE_LAYOUT_MARGINS, 0, IMAGE_LAYOUT_MARGINS, 0);
        addView(imageView, imageLayoutParams);
    }

    /**
     * Sets up the UserPools UI with the Email and Password FormView.
     * @param context The activity context.
     */
    private void setUpUserPools(final Context context) {
        /**
         * Use Reflection for UserPoolSignIn dependency.
         */
        if (this.config != null && this.config.getSignInUserPoolsEnabled()) {
            Log.d(LOG_TAG, "Trying to create an instance of UserPoolSignInView");

            userPoolsSignInView = createDependencyObject(USER_POOL_SIGN_IN_VIEW, context, USER_POOL_SIGN_IN_IMPORT);
            if (userPoolsSignInView != null) {
                final LinearLayout.LayoutParams userPoolLayoutParams
                    = new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                addView((View) userPoolsSignInView, userPoolLayoutParams);
            }
        }
    }

    /**
     * Sets up the divider that divides the UserPools UI and the SignInButtons.
     * @param context The activity context.
     */
    private void setUpDivider(final Context context) {
        /**
         * Create "--or sign in with--" divider if userpools is configured.
         * Else create "--sign in with--" divider.
         */
        if (this.config != null && this.config.getSignInUserPoolsEnabled()) {
            divider = inflate(context, R.layout.horizontal_or_sign_in_divider, null);
        } else {
            divider = inflate(context, R.layout.horizontal_sign_in_divider, null);
        }
        addView(divider);
    }

    /**
     * Sets up the SignIn Buttons.
     * @param context The activity context.
     */
    private void setUpSignInButtons(final Context context) {
        /**
         * Get the height, width and margins for the sign in buttons.
         */
        signInButtonMargin = getResources().getDimensionPixelSize(R.dimen.sign_in_button_margin);
        signInButtonWidth  = getResources().getDimensionPixelSize(R.dimen.sign_in_button_width);
        signInButtonHeight = getResources().getDimensionPixelSize(R.dimen.sign_in_button_height);

        /**
         * Add the signInButtons configured to the view.
         */
        this.addSignInButtonsToView(context);

        /**
         * There are two conditions on which the divider is set.
         *
         * 1. If UserPools is configured and one or more buttons are added.
         * 2. If One of more buttons are added.
         */
        divider.setVisibility(GONE);
        if (this.buttonStore.size() > 0) {
            divider.setVisibility(VISIBLE);
        }
    }

    /**
     * Constructor.
     * @param context Activity Context
     * @param attrs Attribute Set
     * @param defStyleAttr Default Style Attribute
     */
    public SignInView(final Context context,
                      final AttributeSet attrs,
                      final int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        this.setOrientation(VERTICAL);
        this.setGravity(Gravity.CENTER_HORIZONTAL);
        this.buttonStore = new ArrayList<SignInButton>();
        this.config = getConfiguration(context);

        this.setUpLogoAndBackgroundColor();
        this.setUpBackgroundDrawable();
        this.setUpImageView(context);
        this.setUpUserPools(context);
        this.setUpDivider(context);
        this.setUpSignInButtons(context);
    }

    /** {@inheritDoc} */
    @Override
    protected void onMeasure(final int widthMeasureSpec,
                             final int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        resizeImageView();
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    /** {@inheritDoc} */
    @Override
    protected void onLayout(final boolean changed,
                            final int l,
                            final int t,
                            final int r,
                            final int b) {
        super.onLayout(changed, l, t, r, b);

        /** Find the split point for the background image, so each half gets a different color. */
        if (this.config != null && this.config.getSignInUserPoolsEnabled()) {
            if (userPoolsSignInView != null) {
                View view = (View) userPoolsSignInView;
                Object formViewObject = invokeGetCredentialsFormView(USER_POOL_SIGN_IN_VIEW,
                        userPoolsSignInView,
                        USER_POOL_SIGN_IN_IMPORT);
                final int measuredHeight = ((View) formViewObject).getMeasuredHeight();
                final int splitPoint = view.getTop() + (measuredHeight / 2);
                splitBackgroundDrawable.setSplitPointDistanceFromTop(splitPoint);
            }
        } else {
            final int splitPoint = imageView.getTop() + imageView.getMeasuredHeight();
            splitBackgroundDrawable.setSplitPointDistanceFromTop(splitPoint);
        }
    }

    /** 
     * Resizes the image view based on the UI Configuration.
     */
    private void resizeImageView() {
        int availableHeight = getAvailableHeight();
        int availableWidth = getMeasuredWidth();

        int dimension = Math.min(availableHeight, availableWidth);
        imageView.getLayoutParams().height = dimension;
        imageView.getLayoutParams().width = dimension;

        ((LayoutParams) imageView.getLayoutParams()).setMargins(
                IMAGE_MARGINS, IMAGE_MARGINS, IMAGE_MARGINS, IMAGE_MARGINS);
        imageView.setLayoutParams(imageView.getLayoutParams());
    }

    /** 
     * Gets the available height based on the UserPools UI and SignIn Buttons. 
     * @return The available height in the view
     */
    private int getAvailableHeight() {
        int availableHeight = getMeasuredHeight();

        if (this.config != null && this.config.getSignInUserPoolsEnabled()) {
            if (userPoolsSignInView != null) {
                availableHeight -= ((View) userPoolsSignInView).getMeasuredHeight();
            }
        }

        availableHeight -= divider.getMeasuredHeight();

        final int count = this.buttonStore.size();
        if (count > 0) {
            for (SignInButton button : this.buttonStore) {
                final int buttonHeight = ((View) button).getMeasuredHeight();
                availableHeight -= buttonHeight;
                availableHeight -= (2 * signInButtonMargin);
            }
        }

        /** Subtract the top and bottom image margins. */
        availableHeight -= (2 * IMAGE_MARGINS);

        /** Leave a space at least equal to the size of the sign-in button margin on the bottom of the view. */
        availableHeight -= signInButtonMargin;

        if (availableHeight > MAX_IMAGE_HEIGHT) {
            availableHeight = MAX_IMAGE_HEIGHT;
        }

        return availableHeight;
    }

    /** 
     * Creates the object for the dependency class specified. 
     * @param className The class name
     * @param methodName The method name
     * @param dependency The string that represents the dependency containing the className
     * @return The object returned by invoking a method on the class passed in.
     */
    private Object createDependencyObject(final String className,
                                          final Context context,
                                          final String dependency) {
        try {
            Class<?> classObject = Class.forName(className);
            Constructor<?> constructor = classObject.getConstructor(Context.class);
            Object object = constructor.newInstance(new Object[] { context });
            return object;
        } catch (RuntimeException runtimeException) {
            throw runtimeException;
        } catch (Exception exception) {
            Log.e(LOG_TAG, "Couldn't construct the object. Class " + className + " is not found. " +
                "Please import the appropriate dependencies: " + dependency, exception);
            return null;
        }
    }

    /** 
     * Invoke FormView.getCredentialsFormView() function through reflection.
     * @param className The class name
     * @param viewObject The object passed as parameter
     * @param dependencyImport The string that represents the dependency containing the className
     * @return The object returned by invoking a method on the class passed in.
     * @return The object returned by invoking FormView.getCredentialsFormView()
     */
    private Object invokeGetCredentialsFormView(final String className,
                                                final Object viewObject,
                                                final String dependency) {
        return invokeReflectedMethod(className,
                "getCredentialsFormView",
                viewObject,
                dependency);
    }

    /**
     * Invoke a method of a class through reflection.
     * @param className The class name
     * @param methodName The method name
     * @param viewObject The object passed as parameter
     * @param dependencyImport The string that represents the dependency containing the className
     * @return The object returned by invoking a method on the class passed in.
     */
    private Object invokeReflectedMethod(final String className,
                                         final String methodName,
                                         final Object viewObject,
                                         final String dependencyImport) {

        try {
            Class<?> formViewClass = Class.forName(className);
            Method method = formViewClass.getMethod(methodName, new Class[] {});
            return method.invoke(viewObject);
        } catch (Exception exception) {
            Log.e(LOG_TAG, "Class " + className + " is not found. Method " + methodName + " is not found." +
                    "Please import the appropriate dependencies: " + dependencyImport, exception);
            return null;
        }
    }

    /** 
     * Gets the AuthUIConfiguration from the intent passed in by the activity. 
     * @param context The activity context.
     * @return AuthUIConfiguration The configuration object passed in by the application.
     */
    private AuthUIConfiguration getConfiguration(final Context context) {
        try {
            Intent intent = ((Activity) context).getIntent();
            return (AuthUIConfiguration)(intent.getSerializableExtra(CONFIGURATION_KEY));
        } catch (Exception exception) {
            Log.e(LOG_TAG, "Intent is null. Cannot read the configuration from the intent.", exception);
            return null;
        }
    }

    /** 
     * Add SignInButtons to the view.
     * @param context The activity context.
     */
    private void addSignInButtonsToView(final Context context) {
        try {
            if (this.config != null) {
                ArrayList<Class<? extends SignInButton>> signInButtons = this.config.getSignInButtons();
                if (signInButtons == null) {
                    Log.d(LOG_TAG, "Skipping creating the SignInButtons. No SignInbuttons were added to the view.");
                    return;
                }

                for (Class<? extends SignInButton> signInButton : signInButtons) {
                    SignInButton buttonObject = (SignInButton) createDependencyObject(signInButton.getName(),
                            context, signInButton.getCanonicalName());
                      if (buttonObject != null) {
                        final LinearLayout.LayoutParams signInButtonLayoutParams
                                = new LinearLayout.LayoutParams(this.signInButtonWidth, this.signInButtonHeight);
                        signInButtonLayoutParams.setMargins(0, this.signInButtonMargin, 0, this.signInButtonMargin);
                        this.buttonStore.add(buttonObject);
                        addView((View) buttonObject, signInButtonLayoutParams);
                      } else {
                        Log.e(LOG_TAG, "Cannot construct an object of SignInButton "
                                        + signInButton.getCanonicalName());
                      }
                }
            } else {
                Log.d(LOG_TAG, "AuthUIConfiguration is not configured with any SignInButtons. "
                                + "There are no buttons to add to the view");
            }
        } catch (Exception exception) {
            Log.e(LOG_TAG, "Cannot access the configuration or error in adding the signin button to the view", exception);
            return;
        }
    }
}
