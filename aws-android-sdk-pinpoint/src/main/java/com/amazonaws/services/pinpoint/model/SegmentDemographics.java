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
 * Specifies demographic-based dimension settings for including or excluding
 * endpoints from a segment. These settings derive from characteristics of
 * endpoint devices, such as platform, make, and model.
 * </p>
 */
public class SegmentDemographics implements Serializable {
    /**
     * <p>
     * The app version criteria for the segment.
     * </p>
     */
    private SetDimension appVersion;

    /**
     * <p>
     * The channel criteria for the segment.
     * </p>
     */
    private SetDimension channel;

    /**
     * <p>
     * The device type criteria for the segment.
     * </p>
     */
    private SetDimension deviceType;

    /**
     * <p>
     * The device make criteria for the segment.
     * </p>
     */
    private SetDimension make;

    /**
     * <p>
     * The device model criteria for the segment.
     * </p>
     */
    private SetDimension model;

    /**
     * <p>
     * The device platform criteria for the segment.
     * </p>
     */
    private SetDimension platform;

    /**
     * <p>
     * The app version criteria for the segment.
     * </p>
     *
     * @return <p>
     *         The app version criteria for the segment.
     *         </p>
     */
    public SetDimension getAppVersion() {
        return appVersion;
    }

    /**
     * <p>
     * The app version criteria for the segment.
     * </p>
     *
     * @param appVersion <p>
     *            The app version criteria for the segment.
     *            </p>
     */
    public void setAppVersion(SetDimension appVersion) {
        this.appVersion = appVersion;
    }

    /**
     * <p>
     * The app version criteria for the segment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param appVersion <p>
     *            The app version criteria for the segment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SegmentDemographics withAppVersion(SetDimension appVersion) {
        this.appVersion = appVersion;
        return this;
    }

    /**
     * <p>
     * The channel criteria for the segment.
     * </p>
     *
     * @return <p>
     *         The channel criteria for the segment.
     *         </p>
     */
    public SetDimension getChannel() {
        return channel;
    }

    /**
     * <p>
     * The channel criteria for the segment.
     * </p>
     *
     * @param channel <p>
     *            The channel criteria for the segment.
     *            </p>
     */
    public void setChannel(SetDimension channel) {
        this.channel = channel;
    }

    /**
     * <p>
     * The channel criteria for the segment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param channel <p>
     *            The channel criteria for the segment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SegmentDemographics withChannel(SetDimension channel) {
        this.channel = channel;
        return this;
    }

    /**
     * <p>
     * The device type criteria for the segment.
     * </p>
     *
     * @return <p>
     *         The device type criteria for the segment.
     *         </p>
     */
    public SetDimension getDeviceType() {
        return deviceType;
    }

    /**
     * <p>
     * The device type criteria for the segment.
     * </p>
     *
     * @param deviceType <p>
     *            The device type criteria for the segment.
     *            </p>
     */
    public void setDeviceType(SetDimension deviceType) {
        this.deviceType = deviceType;
    }

    /**
     * <p>
     * The device type criteria for the segment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deviceType <p>
     *            The device type criteria for the segment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SegmentDemographics withDeviceType(SetDimension deviceType) {
        this.deviceType = deviceType;
        return this;
    }

    /**
     * <p>
     * The device make criteria for the segment.
     * </p>
     *
     * @return <p>
     *         The device make criteria for the segment.
     *         </p>
     */
    public SetDimension getMake() {
        return make;
    }

    /**
     * <p>
     * The device make criteria for the segment.
     * </p>
     *
     * @param make <p>
     *            The device make criteria for the segment.
     *            </p>
     */
    public void setMake(SetDimension make) {
        this.make = make;
    }

    /**
     * <p>
     * The device make criteria for the segment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param make <p>
     *            The device make criteria for the segment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SegmentDemographics withMake(SetDimension make) {
        this.make = make;
        return this;
    }

    /**
     * <p>
     * The device model criteria for the segment.
     * </p>
     *
     * @return <p>
     *         The device model criteria for the segment.
     *         </p>
     */
    public SetDimension getModel() {
        return model;
    }

    /**
     * <p>
     * The device model criteria for the segment.
     * </p>
     *
     * @param model <p>
     *            The device model criteria for the segment.
     *            </p>
     */
    public void setModel(SetDimension model) {
        this.model = model;
    }

    /**
     * <p>
     * The device model criteria for the segment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param model <p>
     *            The device model criteria for the segment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SegmentDemographics withModel(SetDimension model) {
        this.model = model;
        return this;
    }

    /**
     * <p>
     * The device platform criteria for the segment.
     * </p>
     *
     * @return <p>
     *         The device platform criteria for the segment.
     *         </p>
     */
    public SetDimension getPlatform() {
        return platform;
    }

    /**
     * <p>
     * The device platform criteria for the segment.
     * </p>
     *
     * @param platform <p>
     *            The device platform criteria for the segment.
     *            </p>
     */
    public void setPlatform(SetDimension platform) {
        this.platform = platform;
    }

    /**
     * <p>
     * The device platform criteria for the segment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param platform <p>
     *            The device platform criteria for the segment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SegmentDemographics withPlatform(SetDimension platform) {
        this.platform = platform;
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
        if (getChannel() != null)
            sb.append("Channel: " + getChannel() + ",");
        if (getDeviceType() != null)
            sb.append("DeviceType: " + getDeviceType() + ",");
        if (getMake() != null)
            sb.append("Make: " + getMake() + ",");
        if (getModel() != null)
            sb.append("Model: " + getModel() + ",");
        if (getPlatform() != null)
            sb.append("Platform: " + getPlatform());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppVersion() == null) ? 0 : getAppVersion().hashCode());
        hashCode = prime * hashCode + ((getChannel() == null) ? 0 : getChannel().hashCode());
        hashCode = prime * hashCode + ((getDeviceType() == null) ? 0 : getDeviceType().hashCode());
        hashCode = prime * hashCode + ((getMake() == null) ? 0 : getMake().hashCode());
        hashCode = prime * hashCode + ((getModel() == null) ? 0 : getModel().hashCode());
        hashCode = prime * hashCode + ((getPlatform() == null) ? 0 : getPlatform().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SegmentDemographics == false)
            return false;
        SegmentDemographics other = (SegmentDemographics) obj;

        if (other.getAppVersion() == null ^ this.getAppVersion() == null)
            return false;
        if (other.getAppVersion() != null
                && other.getAppVersion().equals(this.getAppVersion()) == false)
            return false;
        if (other.getChannel() == null ^ this.getChannel() == null)
            return false;
        if (other.getChannel() != null && other.getChannel().equals(this.getChannel()) == false)
            return false;
        if (other.getDeviceType() == null ^ this.getDeviceType() == null)
            return false;
        if (other.getDeviceType() != null
                && other.getDeviceType().equals(this.getDeviceType()) == false)
            return false;
        if (other.getMake() == null ^ this.getMake() == null)
            return false;
        if (other.getMake() != null && other.getMake().equals(this.getMake()) == false)
            return false;
        if (other.getModel() == null ^ this.getModel() == null)
            return false;
        if (other.getModel() != null && other.getModel().equals(this.getModel()) == false)
            return false;
        if (other.getPlatform() == null ^ this.getPlatform() == null)
            return false;
        if (other.getPlatform() != null && other.getPlatform().equals(this.getPlatform()) == false)
            return false;
        return true;
    }
}
