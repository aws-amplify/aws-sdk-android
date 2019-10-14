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
 * Specifies information about an event that reports data to Amazon Pinpoint.
 * </p>
 */
public class Event implements Serializable {
    /**
     * <p>
     * The package name of the app that's recording the event.
     * </p>
     */
    private String appPackageName;

    /**
     * <p>
     * The title of the app that's recording the event.
     * </p>
     */
    private String appTitle;

    /**
     * <p>
     * The version number of the app that's recording the event.
     * </p>
     */
    private String appVersionCode;

    /**
     * <p>
     * One or more custom attributes that are associated with the event.
     * </p>
     */
    private java.util.Map<String, String> attributes;

    /**
     * <p>
     * The version of the SDK that's running on the client device.
     * </p>
     */
    private String clientSdkVersion;

    /**
     * <p>
     * The name of the event.
     * </p>
     */
    private String eventType;

    /**
     * <p>
     * One or more custom metrics that are associated with the event.
     * </p>
     */
    private java.util.Map<String, Double> metrics;

    /**
     * <p>
     * The name of the SDK that's being used to record the event.
     * </p>
     */
    private String sdkName;

    /**
     * <p>
     * Information about the session in which the event occurred.
     * </p>
     */
    private Session session;

    /**
     * <p>
     * The date and time, in ISO 8601 format, when the event occurred.
     * </p>
     */
    private String timestamp;

    /**
     * <p>
     * The package name of the app that's recording the event.
     * </p>
     *
     * @return <p>
     *         The package name of the app that's recording the event.
     *         </p>
     */
    public String getAppPackageName() {
        return appPackageName;
    }

    /**
     * <p>
     * The package name of the app that's recording the event.
     * </p>
     *
     * @param appPackageName <p>
     *            The package name of the app that's recording the event.
     *            </p>
     */
    public void setAppPackageName(String appPackageName) {
        this.appPackageName = appPackageName;
    }

    /**
     * <p>
     * The package name of the app that's recording the event.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param appPackageName <p>
     *            The package name of the app that's recording the event.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Event withAppPackageName(String appPackageName) {
        this.appPackageName = appPackageName;
        return this;
    }

    /**
     * <p>
     * The title of the app that's recording the event.
     * </p>
     *
     * @return <p>
     *         The title of the app that's recording the event.
     *         </p>
     */
    public String getAppTitle() {
        return appTitle;
    }

    /**
     * <p>
     * The title of the app that's recording the event.
     * </p>
     *
     * @param appTitle <p>
     *            The title of the app that's recording the event.
     *            </p>
     */
    public void setAppTitle(String appTitle) {
        this.appTitle = appTitle;
    }

    /**
     * <p>
     * The title of the app that's recording the event.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param appTitle <p>
     *            The title of the app that's recording the event.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Event withAppTitle(String appTitle) {
        this.appTitle = appTitle;
        return this;
    }

    /**
     * <p>
     * The version number of the app that's recording the event.
     * </p>
     *
     * @return <p>
     *         The version number of the app that's recording the event.
     *         </p>
     */
    public String getAppVersionCode() {
        return appVersionCode;
    }

    /**
     * <p>
     * The version number of the app that's recording the event.
     * </p>
     *
     * @param appVersionCode <p>
     *            The version number of the app that's recording the event.
     *            </p>
     */
    public void setAppVersionCode(String appVersionCode) {
        this.appVersionCode = appVersionCode;
    }

    /**
     * <p>
     * The version number of the app that's recording the event.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param appVersionCode <p>
     *            The version number of the app that's recording the event.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Event withAppVersionCode(String appVersionCode) {
        this.appVersionCode = appVersionCode;
        return this;
    }

    /**
     * <p>
     * One or more custom attributes that are associated with the event.
     * </p>
     *
     * @return <p>
     *         One or more custom attributes that are associated with the event.
     *         </p>
     */
    public java.util.Map<String, String> getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * One or more custom attributes that are associated with the event.
     * </p>
     *
     * @param attributes <p>
     *            One or more custom attributes that are associated with the
     *            event.
     *            </p>
     */
    public void setAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes;
    }

    /**
     * <p>
     * One or more custom attributes that are associated with the event.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attributes <p>
     *            One or more custom attributes that are associated with the
     *            event.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Event withAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     * <p>
     * One or more custom attributes that are associated with the event.
     * </p>
     * <p>
     * The method adds a new key-value pair into Attributes parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into Attributes.
     * @param value The corresponding value of the entry to be added into
     *            Attributes.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Event addAttributesEntry(String key, String value) {
        if (null == this.attributes) {
            this.attributes = new java.util.HashMap<String, String>();
        }
        if (this.attributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.attributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Attributes.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public Event clearAttributesEntries() {
        this.attributes = null;
        return this;
    }

    /**
     * <p>
     * The version of the SDK that's running on the client device.
     * </p>
     *
     * @return <p>
     *         The version of the SDK that's running on the client device.
     *         </p>
     */
    public String getClientSdkVersion() {
        return clientSdkVersion;
    }

    /**
     * <p>
     * The version of the SDK that's running on the client device.
     * </p>
     *
     * @param clientSdkVersion <p>
     *            The version of the SDK that's running on the client device.
     *            </p>
     */
    public void setClientSdkVersion(String clientSdkVersion) {
        this.clientSdkVersion = clientSdkVersion;
    }

    /**
     * <p>
     * The version of the SDK that's running on the client device.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clientSdkVersion <p>
     *            The version of the SDK that's running on the client device.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Event withClientSdkVersion(String clientSdkVersion) {
        this.clientSdkVersion = clientSdkVersion;
        return this;
    }

    /**
     * <p>
     * The name of the event.
     * </p>
     *
     * @return <p>
     *         The name of the event.
     *         </p>
     */
    public String getEventType() {
        return eventType;
    }

    /**
     * <p>
     * The name of the event.
     * </p>
     *
     * @param eventType <p>
     *            The name of the event.
     *            </p>
     */
    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    /**
     * <p>
     * The name of the event.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eventType <p>
     *            The name of the event.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Event withEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }

    /**
     * <p>
     * One or more custom metrics that are associated with the event.
     * </p>
     *
     * @return <p>
     *         One or more custom metrics that are associated with the event.
     *         </p>
     */
    public java.util.Map<String, Double> getMetrics() {
        return metrics;
    }

    /**
     * <p>
     * One or more custom metrics that are associated with the event.
     * </p>
     *
     * @param metrics <p>
     *            One or more custom metrics that are associated with the event.
     *            </p>
     */
    public void setMetrics(java.util.Map<String, Double> metrics) {
        this.metrics = metrics;
    }

    /**
     * <p>
     * One or more custom metrics that are associated with the event.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param metrics <p>
     *            One or more custom metrics that are associated with the event.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Event withMetrics(java.util.Map<String, Double> metrics) {
        this.metrics = metrics;
        return this;
    }

    /**
     * <p>
     * One or more custom metrics that are associated with the event.
     * </p>
     * <p>
     * The method adds a new key-value pair into Metrics parameter, and returns
     * a reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into Metrics.
     * @param value The corresponding value of the entry to be added into
     *            Metrics.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Event addMetricsEntry(String key, Double value) {
        if (null == this.metrics) {
            this.metrics = new java.util.HashMap<String, Double>();
        }
        if (this.metrics.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.metrics.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Metrics.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public Event clearMetricsEntries() {
        this.metrics = null;
        return this;
    }

    /**
     * <p>
     * The name of the SDK that's being used to record the event.
     * </p>
     *
     * @return <p>
     *         The name of the SDK that's being used to record the event.
     *         </p>
     */
    public String getSdkName() {
        return sdkName;
    }

    /**
     * <p>
     * The name of the SDK that's being used to record the event.
     * </p>
     *
     * @param sdkName <p>
     *            The name of the SDK that's being used to record the event.
     *            </p>
     */
    public void setSdkName(String sdkName) {
        this.sdkName = sdkName;
    }

    /**
     * <p>
     * The name of the SDK that's being used to record the event.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sdkName <p>
     *            The name of the SDK that's being used to record the event.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Event withSdkName(String sdkName) {
        this.sdkName = sdkName;
        return this;
    }

    /**
     * <p>
     * Information about the session in which the event occurred.
     * </p>
     *
     * @return <p>
     *         Information about the session in which the event occurred.
     *         </p>
     */
    public Session getSession() {
        return session;
    }

    /**
     * <p>
     * Information about the session in which the event occurred.
     * </p>
     *
     * @param session <p>
     *            Information about the session in which the event occurred.
     *            </p>
     */
    public void setSession(Session session) {
        this.session = session;
    }

    /**
     * <p>
     * Information about the session in which the event occurred.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param session <p>
     *            Information about the session in which the event occurred.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Event withSession(Session session) {
        this.session = session;
        return this;
    }

    /**
     * <p>
     * The date and time, in ISO 8601 format, when the event occurred.
     * </p>
     *
     * @return <p>
     *         The date and time, in ISO 8601 format, when the event occurred.
     *         </p>
     */
    public String getTimestamp() {
        return timestamp;
    }

    /**
     * <p>
     * The date and time, in ISO 8601 format, when the event occurred.
     * </p>
     *
     * @param timestamp <p>
     *            The date and time, in ISO 8601 format, when the event
     *            occurred.
     *            </p>
     */
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * <p>
     * The date and time, in ISO 8601 format, when the event occurred.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timestamp <p>
     *            The date and time, in ISO 8601 format, when the event
     *            occurred.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Event withTimestamp(String timestamp) {
        this.timestamp = timestamp;
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
        if (getAppPackageName() != null)
            sb.append("AppPackageName: " + getAppPackageName() + ",");
        if (getAppTitle() != null)
            sb.append("AppTitle: " + getAppTitle() + ",");
        if (getAppVersionCode() != null)
            sb.append("AppVersionCode: " + getAppVersionCode() + ",");
        if (getAttributes() != null)
            sb.append("Attributes: " + getAttributes() + ",");
        if (getClientSdkVersion() != null)
            sb.append("ClientSdkVersion: " + getClientSdkVersion() + ",");
        if (getEventType() != null)
            sb.append("EventType: " + getEventType() + ",");
        if (getMetrics() != null)
            sb.append("Metrics: " + getMetrics() + ",");
        if (getSdkName() != null)
            sb.append("SdkName: " + getSdkName() + ",");
        if (getSession() != null)
            sb.append("Session: " + getSession() + ",");
        if (getTimestamp() != null)
            sb.append("Timestamp: " + getTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAppPackageName() == null) ? 0 : getAppPackageName().hashCode());
        hashCode = prime * hashCode + ((getAppTitle() == null) ? 0 : getAppTitle().hashCode());
        hashCode = prime * hashCode
                + ((getAppVersionCode() == null) ? 0 : getAppVersionCode().hashCode());
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        hashCode = prime * hashCode
                + ((getClientSdkVersion() == null) ? 0 : getClientSdkVersion().hashCode());
        hashCode = prime * hashCode + ((getEventType() == null) ? 0 : getEventType().hashCode());
        hashCode = prime * hashCode + ((getMetrics() == null) ? 0 : getMetrics().hashCode());
        hashCode = prime * hashCode + ((getSdkName() == null) ? 0 : getSdkName().hashCode());
        hashCode = prime * hashCode + ((getSession() == null) ? 0 : getSession().hashCode());
        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Event == false)
            return false;
        Event other = (Event) obj;

        if (other.getAppPackageName() == null ^ this.getAppPackageName() == null)
            return false;
        if (other.getAppPackageName() != null
                && other.getAppPackageName().equals(this.getAppPackageName()) == false)
            return false;
        if (other.getAppTitle() == null ^ this.getAppTitle() == null)
            return false;
        if (other.getAppTitle() != null && other.getAppTitle().equals(this.getAppTitle()) == false)
            return false;
        if (other.getAppVersionCode() == null ^ this.getAppVersionCode() == null)
            return false;
        if (other.getAppVersionCode() != null
                && other.getAppVersionCode().equals(this.getAppVersionCode()) == false)
            return false;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null
                && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        if (other.getClientSdkVersion() == null ^ this.getClientSdkVersion() == null)
            return false;
        if (other.getClientSdkVersion() != null
                && other.getClientSdkVersion().equals(this.getClientSdkVersion()) == false)
            return false;
        if (other.getEventType() == null ^ this.getEventType() == null)
            return false;
        if (other.getEventType() != null
                && other.getEventType().equals(this.getEventType()) == false)
            return false;
        if (other.getMetrics() == null ^ this.getMetrics() == null)
            return false;
        if (other.getMetrics() != null && other.getMetrics().equals(this.getMetrics()) == false)
            return false;
        if (other.getSdkName() == null ^ this.getSdkName() == null)
            return false;
        if (other.getSdkName() != null && other.getSdkName().equals(this.getSdkName()) == false)
            return false;
        if (other.getSession() == null ^ this.getSession() == null)
            return false;
        if (other.getSession() != null && other.getSession().equals(this.getSession()) == false)
            return false;
        if (other.getTimestamp() == null ^ this.getTimestamp() == null)
            return false;
        if (other.getTimestamp() != null
                && other.getTimestamp().equals(this.getTimestamp()) == false)
            return false;
        return true;
    }
}
