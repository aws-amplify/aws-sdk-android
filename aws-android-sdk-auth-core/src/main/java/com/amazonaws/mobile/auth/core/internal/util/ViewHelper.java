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

package com.amazonaws.mobile.auth.core.internal.util;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.widget.EditText;

/**
 * Utilities for Views.
 *
 */
public final class ViewHelper {
    /**
     * Displays a modal dialog with an OK button.
     *
     * @param activity invoking activity
     * @param title title to display for the dialog
     * @param body content of the dialog
     */
    public static void showDialog(final Activity activity, final String title, final String body) {
        if (null == activity) {
            return;
        }

        final AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setTitle(title);
        builder.setMessage(body);
        builder.setNeutralButton(android.R.string.ok, null);
        builder.show();
    }

    /**
     * Displays a modal dialog.
     *
     * @param activity invoking activity
     * @param title title to display for the dialog
     * @param body content of the dialog
     * @param positiveButton String for positive button
     * @param negativeButton String for negative button
     * @param negativeButtonListener  the listener which should be invoked when a negative button is pressed
     * @param positiveButtonListener  the listener which should be invoked when a positive button is pressed
     */
    public static void showDialog(final Activity activity,
                                  final String title,
                                  final String body,
                                  final String positiveButton, 
                                  final DialogInterface.OnClickListener positiveButtonListener,
                                  final String negativeButton,
                                  final DialogInterface.OnClickListener negativeButtonListener) {
        if (null == activity) {
            return;
        }

        final AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setTitle(title);
        builder.setMessage(body);
        builder.setPositiveButton(positiveButton,positiveButtonListener);
        builder.setNegativeButton(negativeButton, negativeButtonListener);
        builder.show();
    }
}
