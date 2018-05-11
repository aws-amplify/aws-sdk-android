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

package com.amazonaws.mobile.auth.core.signin.ui;

import android.content.res.Resources;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.util.DisplayMetrics;

/**
 * A class containing UI Utility methods.
 */
public class DisplayUtils {
    private static final DisplayMetrics metrics = Resources.getSystem().getDisplayMetrics();
    private static int dpMultiplier = (metrics.densityDpi / DisplayMetrics.DENSITY_DEFAULT);

    /**
     * @param dp number of design pixels.
     * @return number of pixels corresponding to the desired design pixels.
     */
    public static int dp(final int dp) {
        return dp * dpMultiplier;
    }

    /**
     * Create a rounded rectangle with a specified corner radius.
     *
     * @param cornerRadius the corner radius in pixels
     * @return the shape drawable.
     */
    public static Shape getRoundedRectangleShape(int cornerRadius) {

        // Background color for Button.
        return new RoundRectShape(
            new float[]{
                cornerRadius, cornerRadius, cornerRadius, cornerRadius,
                cornerRadius, cornerRadius, cornerRadius, cornerRadius},
            null, null);
    }

    public static ShapeDrawable getRoundedRectangleBackground(int cornerRadius, int backgroundColor) {
        final ShapeDrawable drawable = new ShapeDrawable(
            getRoundedRectangleShape(cornerRadius));
        drawable.getPaint().setColor(backgroundColor);
        return drawable;
    }
}
