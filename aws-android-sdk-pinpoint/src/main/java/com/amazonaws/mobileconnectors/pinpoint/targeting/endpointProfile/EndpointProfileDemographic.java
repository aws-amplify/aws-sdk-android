/**
 * Copyright 2016-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with the License. A copy of the License is
 * located at
 *
 * http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under the License.
 */

package com.amazonaws.mobileconnectors.pinpoint.targeting.endpointProfile;

import java.util.Locale;
import java.util.TimeZone;
import org.json.JSONObject;
import com.amazonaws.mobileconnectors.pinpoint.internal.core.PinpointContext;
import com.amazonaws.mobileconnectors.pinpoint.internal.core.util.JSONBuilder;
import com.amazonaws.mobileconnectors.pinpoint.internal.core.util.JSONSerializable;
import android.os.Build;

import static com.amazonaws.mobileconnectors.pinpoint.internal.core.util.Preconditions.checkNotNull;

/**
 * Amazon Pinpoint endpoint demographic, represented by application and device characteristics
 */
public class EndpointProfileDemographic implements JSONSerializable {

    /**
     * Android platform.
     */
    public static final String ENDPOINT_PLATFORM = "ANDROID";

    private String make = "";
    private String model = Build.MODEL;
    private String timezone = TimeZone.getDefault().getID();
    private Locale locale;
    private String appVersion = "";
    private String platform = ENDPOINT_PLATFORM;
    private String platformVersion = Build.VERSION.RELEASE;

    /**
     * Constructor.
     *
     * @param context the pinpoint context.
     */
    public EndpointProfileDemographic(final PinpointContext context) {
        checkNotNull(context, "A valid pinpointContext must be provided");
        make = context.getSystem().getDeviceDetails().manufacturer();
        appVersion = context.getSystem().getAppDetails().versionName();
        locale = context.getApplicationContext().getResources().getConfiguration().locale;
    }

    /**
     * Gets make.
     *
     * @return the make
     */
    public String getMake() {
        return this.make;
    }

    /**
     * Sets make.
     *
     * @param make the make
     */
    public void setMake(String make) {
        if (make == null) {
            return;
        }
        this.make = make;
    }

    /**
     * Gets model.
     *
     * @return the model
     */
    public String getModel() {
        return this.model;
    }

    /**
     * Sets model.
     *
     * @param model the model
     */
    public void setModel(String model) {
        if (model == null) {
            return;
        }
        this.model = model;
    }

    /**
     * Gets timezone.
     *
     * @return the timezone
     */
    public String getTimezone() {
        return this.timezone;
    }

    /**
     * Sets timezone.
     *
     * @param timezone the timezone
     */
    public void setTimezone(String timezone) {
        if (timezone == null) {
            return;
        }
        this.timezone = timezone;
    }

    /**
     * Gets locale.
     *
     * @return the locale
     */
    public Locale getLocale() {
        return this.locale;
    }

    /**
     * Sets locale.
     *
     * @param locale the locale
     */
    public void setLocale(Locale locale) {
        if (locale == null) {
            return;
        }
        this.locale = locale;
    }

    /**
     * Gets app version.
     *
     * @return the app version
     */
    public String getAppVersion() {
        return this.appVersion;
    }

    /**
     * Sets app version.
     *
     * @param appVersion the app version
     */
    public void setAppVersion(String appVersion) {
        if (appVersion == null) {
            return;
        }
        this.appVersion = appVersion;
    }

    /**
     * Gets platform.
     *
     * @return the platform
     */
    public String getPlatform() {
        return this.platform;
    }

    /**
     * Sets platform.
     *
     * @param platform the platform
     */
    public void setPlatform(String platform) {
        if (platform == null) {
            return;
        }
        this.platform = platform;
    }

    /**
     * Gets platform version.
     *
     * @return the platform version
     */
    public String getPlatformVersion() {
        return this.platformVersion;
    }

    /**
     * Sets platform version.
     *
     * @param platformVersion the platform version
     */
    public void setPlatformVersion(String platformVersion) {
        if (platformVersion == null) {
            return;
        }
        this.platformVersion = platformVersion;
    }

    @Override
    public JSONObject toJSONObject() {
        final JSONBuilder builder = new JSONBuilder(null);
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
