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

package com.amazonaws.mobile.auth.core.signin.ui.buttons;

/**
 * Sign-in Button Attributes
 */
public class SignInButtonAttributes {
    private int cornerRadius;
    private int backgroundColor;
    private int backgroundColorPressed;
    private int topShadowColor;
    private int bottomShadowColor;
    private int topShadowThickness;
    private int bottomShadowThickness;
    private int textColor;
    private int defaultTextResourceId;
    private int imageIconResourceId;

    public int getCornerRadius() {
        return cornerRadius;
    }

    public int getBackgroundColor() {
        return backgroundColor;
    }

    public int getBackgroundColorPressed() {
        return backgroundColorPressed;
    }

    public int getTopShadowColor() {
        return topShadowColor;
    }

    public int getBottomShadowColor() {
        return bottomShadowColor;
    }

    public int getTopShadowThickness() {
        return topShadowThickness;
    }

    public int getBottomShadowThickness() {
        return bottomShadowThickness;
    }

    public int getTextColor() {
        return textColor;
    }

    public int getDefaultTextResourceId() {
        return defaultTextResourceId;
    }

    public int getImageIconResourceId() {
        return imageIconResourceId;
    }

    public SignInButtonAttributes withCornerRadius(int cornerRadius) {
        this.cornerRadius = cornerRadius;
        return this;
    }

    public SignInButtonAttributes withBackgroundColor(int backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }

    public SignInButtonAttributes withBackgroundColorPressed(int backgroundColorPressed) {
        this.backgroundColorPressed = backgroundColorPressed;
        return this;
    }

    public SignInButtonAttributes withTopShadowColor(int topShadowColor) {
        this.topShadowColor = topShadowColor;
        return this;
    }

    public SignInButtonAttributes withBottomShadowColor(int bottomShadowColor) {
        this.bottomShadowColor = bottomShadowColor;
        return this;
    }

    public SignInButtonAttributes withTopShadowThickness(int topShadowThickness) {
        this.topShadowThickness = topShadowThickness;
        return this;
    }

    public SignInButtonAttributes withBottomShadowThickness(int bottomShadowThickness) {
        this.bottomShadowThickness = bottomShadowThickness;
        return this;
    }

    public SignInButtonAttributes withTextColor(int textColor) {
        this.textColor = textColor;
        return this;
    }

    public SignInButtonAttributes withDefaultTextResourceId(int defaultTextResourceId) {
        this.defaultTextResourceId = defaultTextResourceId;
        return this;
    }

    public SignInButtonAttributes withImageIconResourceId(int imageIconResourceId) {
        this.imageIconResourceId = imageIconResourceId;
        return this;
    }
}
