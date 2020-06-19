/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.medialive.model;

import java.io.Serializable;

/**
 * Settings that describe the active source from the input device, and the video
 * characteristics of that source.
 */
public class InputDeviceHdSettings implements Serializable {
    /**
     * If you specified Auto as the configured input, specifies which of the
     * sources is currently active (SDI or HDMI).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HDMI, SDI
     */
    private String activeInput;

    /**
     * The source at the input device that is currently active. You can specify
     * this source.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AUTO, HDMI, SDI
     */
    private String configuredInput;

    /**
     * The state of the input device.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IDLE, STREAMING
     */
    private String deviceState;

    /**
     * The frame rate of the video source.
     */
    private Double framerate;

    /**
     * The height of the video source, in pixels.
     */
    private Integer height;

    /**
     * The current maximum bitrate for ingesting this source, in bits per
     * second. You can specify this maximum.
     */
    private Integer maxBitrate;

    /**
     * The scan type of the video source.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INTERLACED, PROGRESSIVE
     */
    private String scanType;

    /**
     * The width of the video source, in pixels.
     */
    private Integer width;

    /**
     * If you specified Auto as the configured input, specifies which of the
     * sources is currently active (SDI or HDMI).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HDMI, SDI
     *
     * @return If you specified Auto as the configured input, specifies which of
     *         the sources is currently active (SDI or HDMI).
     * @see InputDeviceActiveInput
     */
    public String getActiveInput() {
        return activeInput;
    }

    /**
     * If you specified Auto as the configured input, specifies which of the
     * sources is currently active (SDI or HDMI).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HDMI, SDI
     *
     * @param activeInput If you specified Auto as the configured input,
     *            specifies which of the sources is currently active (SDI or
     *            HDMI).
     * @see InputDeviceActiveInput
     */
    public void setActiveInput(String activeInput) {
        this.activeInput = activeInput;
    }

    /**
     * If you specified Auto as the configured input, specifies which of the
     * sources is currently active (SDI or HDMI).
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HDMI, SDI
     *
     * @param activeInput If you specified Auto as the configured input,
     *            specifies which of the sources is currently active (SDI or
     *            HDMI).
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InputDeviceActiveInput
     */
    public InputDeviceHdSettings withActiveInput(String activeInput) {
        this.activeInput = activeInput;
        return this;
    }

    /**
     * If you specified Auto as the configured input, specifies which of the
     * sources is currently active (SDI or HDMI).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HDMI, SDI
     *
     * @param activeInput If you specified Auto as the configured input,
     *            specifies which of the sources is currently active (SDI or
     *            HDMI).
     * @see InputDeviceActiveInput
     */
    public void setActiveInput(InputDeviceActiveInput activeInput) {
        this.activeInput = activeInput.toString();
    }

    /**
     * If you specified Auto as the configured input, specifies which of the
     * sources is currently active (SDI or HDMI).
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HDMI, SDI
     *
     * @param activeInput If you specified Auto as the configured input,
     *            specifies which of the sources is currently active (SDI or
     *            HDMI).
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InputDeviceActiveInput
     */
    public InputDeviceHdSettings withActiveInput(InputDeviceActiveInput activeInput) {
        this.activeInput = activeInput.toString();
        return this;
    }

    /**
     * The source at the input device that is currently active. You can specify
     * this source.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AUTO, HDMI, SDI
     *
     * @return The source at the input device that is currently active. You can
     *         specify this source.
     * @see InputDeviceConfiguredInput
     */
    public String getConfiguredInput() {
        return configuredInput;
    }

    /**
     * The source at the input device that is currently active. You can specify
     * this source.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AUTO, HDMI, SDI
     *
     * @param configuredInput The source at the input device that is currently
     *            active. You can specify this source.
     * @see InputDeviceConfiguredInput
     */
    public void setConfiguredInput(String configuredInput) {
        this.configuredInput = configuredInput;
    }

    /**
     * The source at the input device that is currently active. You can specify
     * this source.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AUTO, HDMI, SDI
     *
     * @param configuredInput The source at the input device that is currently
     *            active. You can specify this source.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InputDeviceConfiguredInput
     */
    public InputDeviceHdSettings withConfiguredInput(String configuredInput) {
        this.configuredInput = configuredInput;
        return this;
    }

    /**
     * The source at the input device that is currently active. You can specify
     * this source.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AUTO, HDMI, SDI
     *
     * @param configuredInput The source at the input device that is currently
     *            active. You can specify this source.
     * @see InputDeviceConfiguredInput
     */
    public void setConfiguredInput(InputDeviceConfiguredInput configuredInput) {
        this.configuredInput = configuredInput.toString();
    }

    /**
     * The source at the input device that is currently active. You can specify
     * this source.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AUTO, HDMI, SDI
     *
     * @param configuredInput The source at the input device that is currently
     *            active. You can specify this source.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InputDeviceConfiguredInput
     */
    public InputDeviceHdSettings withConfiguredInput(InputDeviceConfiguredInput configuredInput) {
        this.configuredInput = configuredInput.toString();
        return this;
    }

    /**
     * The state of the input device.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IDLE, STREAMING
     *
     * @return The state of the input device.
     * @see InputDeviceState
     */
    public String getDeviceState() {
        return deviceState;
    }

    /**
     * The state of the input device.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IDLE, STREAMING
     *
     * @param deviceState The state of the input device.
     * @see InputDeviceState
     */
    public void setDeviceState(String deviceState) {
        this.deviceState = deviceState;
    }

    /**
     * The state of the input device.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IDLE, STREAMING
     *
     * @param deviceState The state of the input device.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InputDeviceState
     */
    public InputDeviceHdSettings withDeviceState(String deviceState) {
        this.deviceState = deviceState;
        return this;
    }

    /**
     * The state of the input device.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IDLE, STREAMING
     *
     * @param deviceState The state of the input device.
     * @see InputDeviceState
     */
    public void setDeviceState(InputDeviceState deviceState) {
        this.deviceState = deviceState.toString();
    }

    /**
     * The state of the input device.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IDLE, STREAMING
     *
     * @param deviceState The state of the input device.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InputDeviceState
     */
    public InputDeviceHdSettings withDeviceState(InputDeviceState deviceState) {
        this.deviceState = deviceState.toString();
        return this;
    }

    /**
     * The frame rate of the video source.
     *
     * @return The frame rate of the video source.
     */
    public Double getFramerate() {
        return framerate;
    }

    /**
     * The frame rate of the video source.
     *
     * @param framerate The frame rate of the video source.
     */
    public void setFramerate(Double framerate) {
        this.framerate = framerate;
    }

    /**
     * The frame rate of the video source.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param framerate The frame rate of the video source.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InputDeviceHdSettings withFramerate(Double framerate) {
        this.framerate = framerate;
        return this;
    }

    /**
     * The height of the video source, in pixels.
     *
     * @return The height of the video source, in pixels.
     */
    public Integer getHeight() {
        return height;
    }

    /**
     * The height of the video source, in pixels.
     *
     * @param height The height of the video source, in pixels.
     */
    public void setHeight(Integer height) {
        this.height = height;
    }

    /**
     * The height of the video source, in pixels.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param height The height of the video source, in pixels.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InputDeviceHdSettings withHeight(Integer height) {
        this.height = height;
        return this;
    }

    /**
     * The current maximum bitrate for ingesting this source, in bits per
     * second. You can specify this maximum.
     *
     * @return The current maximum bitrate for ingesting this source, in bits
     *         per second. You can specify this maximum.
     */
    public Integer getMaxBitrate() {
        return maxBitrate;
    }

    /**
     * The current maximum bitrate for ingesting this source, in bits per
     * second. You can specify this maximum.
     *
     * @param maxBitrate The current maximum bitrate for ingesting this source,
     *            in bits per second. You can specify this maximum.
     */
    public void setMaxBitrate(Integer maxBitrate) {
        this.maxBitrate = maxBitrate;
    }

    /**
     * The current maximum bitrate for ingesting this source, in bits per
     * second. You can specify this maximum.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxBitrate The current maximum bitrate for ingesting this source,
     *            in bits per second. You can specify this maximum.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InputDeviceHdSettings withMaxBitrate(Integer maxBitrate) {
        this.maxBitrate = maxBitrate;
        return this;
    }

    /**
     * The scan type of the video source.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INTERLACED, PROGRESSIVE
     *
     * @return The scan type of the video source.
     * @see InputDeviceScanType
     */
    public String getScanType() {
        return scanType;
    }

    /**
     * The scan type of the video source.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INTERLACED, PROGRESSIVE
     *
     * @param scanType The scan type of the video source.
     * @see InputDeviceScanType
     */
    public void setScanType(String scanType) {
        this.scanType = scanType;
    }

    /**
     * The scan type of the video source.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INTERLACED, PROGRESSIVE
     *
     * @param scanType The scan type of the video source.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InputDeviceScanType
     */
    public InputDeviceHdSettings withScanType(String scanType) {
        this.scanType = scanType;
        return this;
    }

    /**
     * The scan type of the video source.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INTERLACED, PROGRESSIVE
     *
     * @param scanType The scan type of the video source.
     * @see InputDeviceScanType
     */
    public void setScanType(InputDeviceScanType scanType) {
        this.scanType = scanType.toString();
    }

    /**
     * The scan type of the video source.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INTERLACED, PROGRESSIVE
     *
     * @param scanType The scan type of the video source.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InputDeviceScanType
     */
    public InputDeviceHdSettings withScanType(InputDeviceScanType scanType) {
        this.scanType = scanType.toString();
        return this;
    }

    /**
     * The width of the video source, in pixels.
     *
     * @return The width of the video source, in pixels.
     */
    public Integer getWidth() {
        return width;
    }

    /**
     * The width of the video source, in pixels.
     *
     * @param width The width of the video source, in pixels.
     */
    public void setWidth(Integer width) {
        this.width = width;
    }

    /**
     * The width of the video source, in pixels.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param width The width of the video source, in pixels.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InputDeviceHdSettings withWidth(Integer width) {
        this.width = width;
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
        if (getActiveInput() != null)
            sb.append("ActiveInput: " + getActiveInput() + ",");
        if (getConfiguredInput() != null)
            sb.append("ConfiguredInput: " + getConfiguredInput() + ",");
        if (getDeviceState() != null)
            sb.append("DeviceState: " + getDeviceState() + ",");
        if (getFramerate() != null)
            sb.append("Framerate: " + getFramerate() + ",");
        if (getHeight() != null)
            sb.append("Height: " + getHeight() + ",");
        if (getMaxBitrate() != null)
            sb.append("MaxBitrate: " + getMaxBitrate() + ",");
        if (getScanType() != null)
            sb.append("ScanType: " + getScanType() + ",");
        if (getWidth() != null)
            sb.append("Width: " + getWidth());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getActiveInput() == null) ? 0 : getActiveInput().hashCode());
        hashCode = prime * hashCode
                + ((getConfiguredInput() == null) ? 0 : getConfiguredInput().hashCode());
        hashCode = prime * hashCode
                + ((getDeviceState() == null) ? 0 : getDeviceState().hashCode());
        hashCode = prime * hashCode + ((getFramerate() == null) ? 0 : getFramerate().hashCode());
        hashCode = prime * hashCode + ((getHeight() == null) ? 0 : getHeight().hashCode());
        hashCode = prime * hashCode + ((getMaxBitrate() == null) ? 0 : getMaxBitrate().hashCode());
        hashCode = prime * hashCode + ((getScanType() == null) ? 0 : getScanType().hashCode());
        hashCode = prime * hashCode + ((getWidth() == null) ? 0 : getWidth().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InputDeviceHdSettings == false)
            return false;
        InputDeviceHdSettings other = (InputDeviceHdSettings) obj;

        if (other.getActiveInput() == null ^ this.getActiveInput() == null)
            return false;
        if (other.getActiveInput() != null
                && other.getActiveInput().equals(this.getActiveInput()) == false)
            return false;
        if (other.getConfiguredInput() == null ^ this.getConfiguredInput() == null)
            return false;
        if (other.getConfiguredInput() != null
                && other.getConfiguredInput().equals(this.getConfiguredInput()) == false)
            return false;
        if (other.getDeviceState() == null ^ this.getDeviceState() == null)
            return false;
        if (other.getDeviceState() != null
                && other.getDeviceState().equals(this.getDeviceState()) == false)
            return false;
        if (other.getFramerate() == null ^ this.getFramerate() == null)
            return false;
        if (other.getFramerate() != null
                && other.getFramerate().equals(this.getFramerate()) == false)
            return false;
        if (other.getHeight() == null ^ this.getHeight() == null)
            return false;
        if (other.getHeight() != null && other.getHeight().equals(this.getHeight()) == false)
            return false;
        if (other.getMaxBitrate() == null ^ this.getMaxBitrate() == null)
            return false;
        if (other.getMaxBitrate() != null
                && other.getMaxBitrate().equals(this.getMaxBitrate()) == false)
            return false;
        if (other.getScanType() == null ^ this.getScanType() == null)
            return false;
        if (other.getScanType() != null && other.getScanType().equals(this.getScanType()) == false)
            return false;
        if (other.getWidth() == null ^ this.getWidth() == null)
            return false;
        if (other.getWidth() != null && other.getWidth().equals(this.getWidth()) == false)
            return false;
        return true;
    }
}
