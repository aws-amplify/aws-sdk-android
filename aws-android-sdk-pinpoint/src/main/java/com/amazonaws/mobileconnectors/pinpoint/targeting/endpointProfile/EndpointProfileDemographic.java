/**
 * Copyright 2016-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.mobileconnectors.pinpoint.targeting.endpointProfile;

import android.os.Build;

import com.amazonaws.mobileconnectors.pinpoint.internal.core.PinpointContext;
import com.amazonaws.mobileconnectors.pinpoint.internal.core.util.JSONBuilder;
import com.amazonaws.mobileconnectors.pinpoint.internal.core.util.JSONSerializable;
import org.json.JSONObject;

import java.util.Locale;
import java.util.TimeZone;

import static com.amazonaws.mobileconnectors.pinpoint.internal.core.util.Preconditions.checkNotNull;

public class EndpointProfileDemographic implements JSONSerializable {

    public static final String ENDPOINT_PLATFORM = "ANDROID";

    private String make = "";
    private String model = Build.MODEL;
    private String timezone = TimeZone.getDefault().getID();
    private Locale locale = Locale.getDefault();
    private String appVersion = "";
    private String platform = ENDPOINT_PLATFORM;
    private String platformVersion = Build.VERSION.RELEASE;

    public EndpointProfileDemographic(final PinpointContext context) {
        checkNotNull(context, "A valid pinpointContext must be provided");
        make = context.getSystem().getDeviceDetails().manufacturer();
        appVersion = context.getSystem().getAppDetails().versionName();
    }

    public String getMake() {
        return this.make;
    }
    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return this.model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public String getTimezone() {
        return this.timezone;
    }
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public Locale getLocale() {
        return this.locale;
    }
    public void setLocale(Locale locale) {
        this.locale = locale;
    }

    public String getAppVersion() {
        return this.appVersion;
    }
    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    public String getPlatform() {
        return this.platform;
    }
    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getPlatformVersion() {
        return this.platformVersion;
    }
    public void setPlatformVersion(String platformVersion) {
        this.platformVersion = platformVersion;
    }

    @Override
    public JSONObject toJSONObject() {
        JSONBuilder builder = new JSONBuilder(null);
        builder.withAttribute("Make", getMake());
        builder.withAttribute("Model", getModel());
        builder.withAttribute("Timezone", getTimezone());
        builder.withAttribute("Locale", getLocale());
        builder.withAttribute("AppVersion", getAppVersion());
        builder.withAttribute("Platform", getPlatform());
        builder.withAttribute("PlatformVersion", getPlatformVersion());
        return builder.toJSONObject();
    }
}
