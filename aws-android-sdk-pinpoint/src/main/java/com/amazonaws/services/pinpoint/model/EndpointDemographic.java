/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

public class EndpointDemographic implements Serializable {
    /**
     * The version of the application associated with the endpoint.
     */
    private String appVersion;

    /**
     * The endpoint locale in the following format: The ISO 639-1 alpha-2 code,
     * followed by an underscore, followed by an ISO 3166-1 alpha-2 value.
     */
    private String locale;

    /**
     * The endpoint make, such as such as Apple or Samsung.
     */
    private String make;

    /**
     * The endpoint model, such as iPhone.
     */
    private String model;

    /**
     * The endpoint model version.
     */
    private String modelVersion;

    /**
     * The endpoint platform, such as ios or android.
     */
    private String platform;

    /**
     * The endpoint platform version.
     */
    private String platformVersion;

    /**
     * The timezone of the endpoint. Specified as a tz database value, such as
     * Americas/Los_Angeles.
     */
    private String timezone;

    /**
     * The version of the application associated with the endpoint.
     *
     * @return The version of the application associated with the endpoint.
     */
    public String getAppVersion() {
        return appVersion;
    }

    /**
     * The version of the application associated with the endpoint.
     *
     * @param appVersion The version of the application associated with the
     *            endpoint.
     */
    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    /**
     * The version of the application associated with the endpoint.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param appVersion The version of the application associated with the
     *            endpoint.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EndpointDemographic withAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }

    /**
     * The endpoint locale in the following format: The ISO 639-1 alpha-2 code,
     * followed by an underscore, followed by an ISO 3166-1 alpha-2 value.
     * 
     * @return The endpoint locale in the following format: The ISO 639-1 alpha-2
     *         code, followed by an underscore, followed by an ISO 3166-1
     *         alpha-2 value.
     */
    public String getLocale() {
        return locale;
    }

    /**
     * The endpoint locale in the following format: The ISO 639-1 alpha-2 code,
     * followed by an underscore, followed by an ISO 3166-1 alpha-2 value.
     * 
     * @param locale The endpoint locale in the following format: The ISO 639-1
     *            alpha-2 code, followed by an underscore, followed by an ISO
     *            3166-1 alpha-2 value.
     */
    public void setLocale(String locale) {
        this.locale = locale;
    }

    /**
     * The endpoint locale in the following format: The ISO 639-1 alpha-2 code,
     * followed by an underscore, followed by an ISO 3166-1 alpha-2 value. <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param locale The endpoint locale in the following format: The ISO 639-1
     *            alpha-2 code, followed by an underscore, followed by an ISO
     *            3166-1 alpha-2 value. @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EndpointDemographic withLocale(String locale) {
        this.locale = locale;
        return this;
    }

    /**
     * The endpoint make, such as such as Apple or Samsung.
     *
     * @return The endpoint make, such as such as Apple or Samsung.
     */
    public String getMake() {
        return make;
    }

    /**
     * The endpoint make, such as such as Apple or Samsung.
     *
     * @param make The endpoint make, such as such as Apple or Samsung.
     */
    public void setMake(String make) {
        this.make = make;
    }

    /**
     * The endpoint make, such as such as Apple or Samsung.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param make The endpoint make, such as such as Apple or Samsung.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EndpointDemographic withMake(String make) {
        this.make = make;
        return this;
    }

    /**
     * The endpoint model, such as iPhone.
     *
     * @return The endpoint model, such as iPhone.
     */
    public String getModel() {
        return model;
    }

    /**
     * The endpoint model, such as iPhone.
     *
     * @param model The endpoint model, such as iPhone.
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * The endpoint model, such as iPhone.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param model The endpoint model, such as iPhone.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EndpointDemographic withModel(String model) {
        this.model = model;
        return this;
    }

    /**
     * The endpoint model version.
     *
     * @return The endpoint model version.
     */
    public String getModelVersion() {
        return modelVersion;
    }

    /**
     * The endpoint model version.
     *
     * @param modelVersion The endpoint model version.
     */
    public void setModelVersion(String modelVersion) {
        this.modelVersion = modelVersion;
    }

    /**
     * The endpoint model version.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param modelVersion The endpoint model version.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EndpointDemographic withModelVersion(String modelVersion) {
        this.modelVersion = modelVersion;
        return this;
    }

    /**
     * The endpoint platform, such as ios or android.
     *
     * @return The endpoint platform, such as ios or android.
     */
    public String getPlatform() {
        return platform;
    }

    /**
     * The endpoint platform, such as ios or android.
     *
     * @param platform The endpoint platform, such as ios or android.
     */
    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * The endpoint platform, such as ios or android.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param platform The endpoint platform, such as ios or android.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EndpointDemographic withPlatform(String platform) {
        this.platform = platform;
        return this;
    }

    /**
     * The endpoint platform version.
     *
     * @return The endpoint platform version.
     */
    public String getPlatformVersion() {
        return platformVersion;
    }

    /**
     * The endpoint platform version.
     *
     * @param platformVersion The endpoint platform version.
     */
    public void setPlatformVersion(String platformVersion) {
        this.platformVersion = platformVersion;
    }

    /**
     * The endpoint platform version.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param platformVersion The endpoint platform version.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EndpointDemographic withPlatformVersion(String platformVersion) {
        this.platformVersion = platformVersion;
        return this;
    }

    /**
     * The timezone of the endpoint. Specified as a tz database value, such as
     * Americas/Los_Angeles.
     *
     * @return The timezone of the endpoint. Specified as a tz database value,
     *         such as Americas/Los_Angeles.
     */
    public String getTimezone() {
        return timezone;
    }

    /**
     * The timezone of the endpoint. Specified as a tz database value, such as
     * Americas/Los_Angeles.
     *
     * @param timezone The timezone of the endpoint. Specified as a tz database
     *            value, such as Americas/Los_Angeles.
     */
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    /**
     * The timezone of the endpoint. Specified as a tz database value, such as
     * Americas/Los_Angeles.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timezone The timezone of the endpoint. Specified as a tz database
     *            value, such as Americas/Los_Angeles.
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
