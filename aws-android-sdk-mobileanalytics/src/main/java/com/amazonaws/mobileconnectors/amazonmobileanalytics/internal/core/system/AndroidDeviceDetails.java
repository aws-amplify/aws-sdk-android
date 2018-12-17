/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.system;

import android.os.Build;

import java.util.Locale;

/**
 * @deprecated The Amazon Mobile Analytics SDK for Android is deprecated as of release 2.9.0. Please use the Amazon Pinpoint SDK for Android along with Amazon Pinpoint service instead.
 */
@Deprecated
public class AndroidDeviceDetails implements DeviceDetails {

    private final String carrier;

    public AndroidDeviceDetails(String carrier) {
        this.carrier = carrier;
    }

    @Override
    public String carrier() {
        return carrier;
    }

    @Override
    public String platformVersion() {
        return Build.VERSION.RELEASE;
    }

    @Override
    public String platform() {
        return "ANDROID";
    }

    @Override
    public String manufacturer() {
        return Build.MANUFACTURER;
    }

    @Override
    public String model() {
        return Build.MODEL;
    }

    @Override
    public Locale locale() {
        return Locale.getDefault();
    }

}
