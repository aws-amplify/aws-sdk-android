/*
 * Copyright 2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 * http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.testutils.util;

import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.content.Intent;
import android.provider.Settings;
import androidx.test.uiautomator.By;
import androidx.test.uiautomator.BySelector;
import androidx.test.uiautomator.UiDevice;
import androidx.test.uiautomator.Until;

import static androidx.test.platform.app.InstrumentationRegistry.getInstrumentation;

public final class AirplaneMode {
    private static final int TIMEOUT_MS = 500;

    private AirplaneMode() {}

    public static void enable() {
        setAirplaneMode(true);
    }

    public static void disable() {
        setAirplaneMode(false);
    }

    public static boolean isEnabled() {
        ContentResolver contentResolver = getInstrumentation().getContext().getContentResolver();
        int status = Settings.System.getInt(contentResolver, Settings.Global.AIRPLANE_MODE_ON, 0);
        return status == 1;
    }

    @SuppressLint("MissingPermission")
    private static void setAirplaneMode(boolean shouldEnable) {
        if (shouldEnable == isEnabled()) return;

        UiDevice device = UiDevice.getInstance(getInstrumentation());
        device.openQuickSettings();

        BySelector description = By.desc("Airplane mode");
        device.wait(Until.hasObject(description), TIMEOUT_MS);
        device.findObject(description).click();

        getInstrumentation().getContext()
            .sendBroadcast(new Intent(Intent.ACTION_CLOSE_SYSTEM_DIALOGS));
    }
}
