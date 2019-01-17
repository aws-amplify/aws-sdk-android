/**
 * Copyright 2016-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.mobileconnectors.pinpoint.internal.core.system;

import java.util.Locale;
import android.os.Build;

public class AndroidDeviceDetails {

    private final String carrier;

    public AndroidDeviceDetails() {
        this.carrier = null;
    }

    public AndroidDeviceDetails(String carrier) {
        this.carrier = carrier;
    }

    public String carrier() {
        return carrier;
    }

    public String platformVersion() {
        return Build.VERSION.RELEASE;
    }

    public String platform() {
        return "ANDROID";
    }

    public String manufacturer() {
        return Build.MANUFACTURER;
    }

    public String model() {
        return Build.MODEL;
    }

    public Locale locale() {
        return Locale.getDefault();
    }

}
