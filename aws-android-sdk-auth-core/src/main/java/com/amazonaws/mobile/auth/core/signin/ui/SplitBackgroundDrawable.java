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

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PixelFormat;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/**
 * Provides drawable for a vertically split background.
 */
public class SplitBackgroundDrawable extends Drawable {
    private Paint paint;
    private int distanceFromTopToSplitPoint = -1;
    private int topBackgroundColor;
    private static final int DEFAULT_BACKGROUND_COLOR = Color.WHITE;

    public SplitBackgroundDrawable(int distanceFromTop) {
        paint = new Paint();
        this.topBackgroundColor = DEFAULT_BACKGROUND_COLOR;
        setSplitPointDistanceFromTop(distanceFromTop);
    }

    public SplitBackgroundDrawable(int distanceFromTop, int topBackgroundColor) {
        paint = new Paint();
        this.topBackgroundColor = topBackgroundColor;
        setSplitPointDistanceFromTop(distanceFromTop);
    }

    public void setSplitPointDistanceFromTop(int distanceFromTop) {
        distanceFromTopToSplitPoint = distanceFromTop;
        invalidateSelf();
    }

    @Override
    public void draw(final Canvas canvas) {
        final Rect b = getBounds();
        paint.setColor(this.topBackgroundColor);
        float y = distanceFromTopToSplitPoint < b.height() ? distanceFromTopToSplitPoint : b.height();

        canvas.drawRect(0, 0, b.width(), y, paint);
        paint.setColor(DEFAULT_BACKGROUND_COLOR);
        canvas.drawRect(0, y, b.width(), b.height(), paint);
    }

    @Override
    public void setAlpha(final int alpha) {
    }

    @Override
    public void setColorFilter(final ColorFilter colorFilter) {
    }

    @Override
    public int getOpacity() {
        return PixelFormat.TRANSLUCENT;
    }
}
