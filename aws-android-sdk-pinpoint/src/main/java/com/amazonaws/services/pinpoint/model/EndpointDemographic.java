/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;

/**
 * <p>
 * Specifies demographic information about an endpoint, such as the applicable
 * time zone and platform.
 * </p>
 */
public class EndpointDemographic implements Serializable {
    /**
     * <p>
     * The version of the app that's associated with the endpoint.
     * </p>
     */
    private String appVersion;

    /**
     * <p>
     * The locale of the endpoint, in the following format: the ISO 639-1
     * alpha-2 code, followed by an underscore (_), followed by an ISO 3166-1
     * alpha-2 value.
     * </p>
     */
    private String locale;

    /**
     * <p>
     * The manufacturer of the endpoint device, such as Apple or Samsung.
     * </p>
     */
    private String make;

    /**
     * <p>
     * The model name or number of the endpoint device, such as iPhone.
     * </p>
     */
    private String model;

    /**
     * <p>
     * The model version of the endpoint device.
     * </p>
     */
    private String modelVersion;

    /**
     * <p>
     * The platform of the endpoint device, such as iOS or Android.
     * </p>
     */
    private String platform;

    /**
     * <p>
     * The platform version of the endpoint device.
     * </p>
     */
    private String platformVersion;

    /**
     * <p>
     * The time zone of the endpoint, specified as a tz database name value,
     * such as America/Los_Angeles.
     * </p>
     */
    private String timezone;

    /**
     * <p>
     * The version of the app that's associated with the endpoint.
     * </p>
     *
     * @return <p>
     *         The version of the app that's associated with the endpoint.
     *         </p>
     */
    public String getAppVersion() {
        return appVersion;
    }

    /**
     * <p>
     * The version of the app that's associated with the endpoint.
     * </p>
     *
     * @param appVersion <p>
     *            The version of the app that's associated with the endpoint.
     *            </p>
     */
    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    /**
     * <p>
     * The version of the app that's associated with the endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param appVersion <p>
     *            The version of the app that's associated with the endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EndpointDemographic withAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }

    /**
     * <p>
     * The locale of the endpoint, in the following format: the ISO 639-1
     * alpha-2 code, followed by an underscore (_), followed by an ISO 3166-1
     * alpha-2 value.
     * </p>
     *
     * @return <p>
     *         The locale of the endpoint, in the following format: the ISO
     *         639-1 alpha-2 code, followed by an underscore (_), followed by an
     *         ISO 3166-1 alpha-2 value.
     *         </p>
     */
    public String getLocale() {
        return locale;
    }

    /**
     * <p>
     * The locale of the endpoint, in the following format: the ISO 639-1
     * alpha-2 code, followed by an underscore (_), followed by an ISO 3166-1
     * alpha-2 value.
     * </p>
     *
     * @param locale <p>
     *            The locale of the endpoint, in the following format: the ISO
     *            639-1 alpha-2 code, followed by an underscore (_), followed by
     *            an ISO 3166-1 alpha-2 value.
     *            </p>
     */
    public void setLocale(String locale) {
        this.locale = locale;
    }

    /**
     * <p>
     * The locale of the endpoint, in the following format: the ISO 639-1
     * alpha-2 code, followed by an underscore (_), followed by an ISO 3166-1
     * alpha-2 value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param locale <p>
     *            The locale of the endpoint, in the following format: the ISO
     *            639-1 alpha-2 code, followed by an underscore (_), followed by
     *            an ISO 3166-1 alpha-2 value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EndpointDemographic withLocale(String locale) {
        this.locale = locale;
        return this;
    }

    /**
     * <p>
     * The manufacturer of the endpoint device, such as Apple or Samsung.
     * </p>
     *
     * @return <p>
     *         The manufacturer of the endpoint device, such as Apple or
     *         Samsung.
     *         </p>
     */
    public String getMake() {
        return make;
    }

    /**
     * <p>
     * The manufacturer of the endpoint device, such as Apple or Samsung.
     * </p>
     *
     * @param make <p>
     *            The manufacturer of the endpoint device, such as Apple or
     *            Samsung.
     *            </p>
     */
    public void setMake(String make) {
        this.make = make;
    }

    /**
     * <p>
     * The manufacturer of the endpoint device, such as Apple or Samsung.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param make <p>
     *            The manufacturer of the endpoint device, such as Apple or
     *            Samsung.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EndpointDemographic withMake(String make) {
        this.make = make;
        return this;
    }

    /**
     * <p>
     * The model name or number of the endpoint device, such as iPhone.
     * </p>
     *
     * @return <p>
     *         The model name or number of the endpoint device, such as iPhone.
     *         </p>
     */
    public String getModel() {
        return model;
    }

    /**
     * <p>
     * The model name or number of the endpoint device, such as iPhone.
     * </p>
     *
     * @param model <p>
     *            The model name or number of the endpoint device, such as
     *            iPhone.
     *            </p>
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * <p>
     * The model name or number of the endpoint device, such as iPhone.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param model <p>
     *            The model name or number of the endpoint device, such as
     *            iPhone.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EndpointDemographic withModel(String model) {
        this.model = model;
        return this;
    }

    /**
     * <p>
     * The model version of the endpoint device.
     * </p>
     *
     * @return <p>
     *         The model version of the endpoint device.
     *         </p>
     */
    public String getModelVersion() {
        return modelVersion;
    }

    /**
     * <p>
     * The model version of the endpoint device.
     * </p>
     *
     * @param modelVersion <p>
     *            The model version of the endpoint device.
     *            </p>
     */
    public void setModelVersion(String modelVersion) {
        this.modelVersion = modelVersion;
    }

    /**
     * <p>
     * The model version of the endpoint device.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param modelVersion <p>
     *            The model version of the endpoint device.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EndpointDemographic withModelVersion(String modelVersion) {
        this.modelVersion = modelVersion;
        return this;
    }

    /**
     * <p>
     * The platform of the endpoint device, such as iOS or Android.
     * </p>
     *
     * @return <p>
     *         The platform of the endpoint device, such as iOS or Android.
     *         </p>
     */
    public String getPlatform() {
        return platform;
    }

    /**
     * <p>
     * The platform of the endpoint device, such as iOS or Android.
     * </p>
     *
     * @param platform <p>
     *            The platform of the endpoint device, such as iOS or Android.
     *            </p>
     */
    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * <p>
     * The platform of the endpoint device, such as iOS or Android.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param platform <p>
     *            The platform of the endpoint device, such as iOS or Android.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EndpointDemographic withPlatform(String platform) {
        this.platform = platform;
        return this;
    }

    /**
     * <p>
     * The platform version of the endpoint device.
     * </p>
     *
     * @return <p>
     *         The platform version of the endpoint device.
     *         </p>
     */
    public String getPlatformVersion() {
        return platformVersion;
    }

    /**
     * <p>
     * The platform version of the endpoint device.
     * </p>
     *
     * @param platformVersion <p>
     *            The platform version of the endpoint device.
     *            </p>
     */
    public void setPlatformVersion(String platformVersion) {
        this.platformVersion = platformVersion;
    }

    /**
     * <p>
     * The platform version of the endpoint device.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param platformVersion <p>
     *            The platform version of the endpoint device.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EndpointDemographic withPlatformVersion(String platformVersion) {
        this.platformVersion = platformVersion;
        return this;
    }

    /**
     * <p>
     * The time zone of the endpoint, specified as a tz database name value,
     * such as America/Los_Angeles.
     * </p>
     *
     * @return <p>
     *         The time zone of the endpoint, specified as a tz database name
     *         value, such as America/Los_Angeles.
     *         </p>
     */
    public String getTimezone() {
        return timezone;
    }

    /**
     * <p>
     * The time zone of the endpoint, specified as a tz database name value,
     * such as America/Los_Angeles.
     * </p>
     *
     * @param timezone <p>
     *            The time zone of the endpoint, specified as a tz database name
     *            value, such as America/Los_Angeles.
     *            </p>
     */
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    /**
     * <p>
     * The time zone of the endpoint, specified as a tz database name value,
     * such as America/Los_Angeles.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timezone <p>
     *            The time zone of the endpoint, specified as a tz database name
     *            value, such as America/Los_Angeles.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EndpointDemographic withTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAppVersion() != null)
            sb.append("AppVersion: " + getAppVersion() + ",");
        if (getLocale() != null)
            sb.append("Locale: " + getLocale() + ",");
        if (getMake() != null)
            sb.append("Make: " + getMake() + ",");
        if (getModel() != null)
            sb.append("Model: " + getModel() + ",");
        if (getModelVersion() != null)
            sb.append("ModelVersion: " + getModelVersion() + ",");
        if (getPlatform() != null)
            sb.append("Platform: " + getPlatform() + ",");
        if (getPlatformVersion() != null)
            sb.append("PlatformVersion: " + getPlatformVersion() + ",");
        if (getTimezone() != null)
            sb.append("Timezone: " + getTimezone());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppVersion() == null) ? 0 : getAppVersion().hashCode());
        hashCode = prime * hashCode + ((getLocale() == null) ? 0 : getLocale().hashCode());
        hashCode = prime * hashCode + ((getMake() == null) ? 0 : getMake().hashCode());
        hashCode = prime * hashCode + ((getModel() == null) ? 0 : getModel().hashCode());
        hashCode = prime * hashCode
                + ((getModelVersion() == null) ? 0 : getModelVersion().hashCode());
        hashCode = prime * hashCode + ((getPlatform() == null) ? 0 : getPlatform().hashCode());
        hashCode = prime * hashCode
                + ((getPlatformVersion() == null) ? 0 : getPlatformVersion().hashCode());
        hashCode = prime * hashCode + ((getTimezone() == null) ? 0 : getTimezone().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EndpointDemographic == false)
            return false;
        EndpointDemographic other = (EndpointDemographic) obj;

        if (other.getAppVersion() == null ^ this.getAppVersion() == null)
            return false;
        if (other.getAppVersion() != null
                && other.getAppVersion().equals(this.getAppVersion()) == false)
            return false;
        if (other.getLocale() == null ^ this.getLocale() == null)
            return false;
        if (other.getLocale() != null && other.getLocale().equals(this.getLocale()) == false)
            return false;
        if (other.getMake() == null ^ this.getMake() == null)
            return false;
        if (other.getMake() != null && other.getMake().equals(this.getMake()) == false)
            return false;
        if (other.getModel() == null ^ this.getModel() == null)
            return false;
        if (other.getModel() != null && other.getModel().equals(this.getModel()) == false)
            return false;
        if (other.getModelVersion() == null ^ this.getModelVersion() == null)
            return false;
        if (other.getModelVersion() != null
                && other.getModelVersion().equals(this.getModelVersion()) == false)
            return false;
        if (other.getPlatform() == null ^ this.getPlatform() == null)
            return false;
        if (other.getPlatform() != null && other.getPlatform().equals(this.getPlatform()) == false)
            return false;
        if (other.getPlatformVersion() == null ^ this.getPlatformVersion() == null)
            return false;
        if (other.getPlatformVersion() != null
                && other.getPlatformVersion().equals(this.getPlatformVersion()) == false)
            return false;
        if (other.getTimezone() == null ^ this.getTimezone() == null)
            return false;
        if (other.getTimezone() != null && other.getTimezone().equals(this.getTimezone()) == false)
            return false;
        return true;
    }
}
