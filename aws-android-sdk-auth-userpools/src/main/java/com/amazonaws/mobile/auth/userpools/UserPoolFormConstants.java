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

import static com.amazonaws.mobile.auth.core.signin.ui.DisplayUtils.dp;

/**
 * Common constants for user pool forms.
 */
public final class UserPoolFormConstants {
    /** Form Button Color. */
    public static final int FORM_BUTTON_COLOR = 0xff4599ff;

    /** Form button radius in pixels. */
    public  static final int FORM_BUTTON_CORNER_RADIUS = dp(5);

    /** Ratio for the form size relative to the parent view. */
    public static final double FORM_SIDE_MARGIN_RATIO = 0.85;

    /** Maximum width of the form in pixels. */
    public static final int MAX_FORM_WIDTH_IN_PIXELS = dp(300);
}