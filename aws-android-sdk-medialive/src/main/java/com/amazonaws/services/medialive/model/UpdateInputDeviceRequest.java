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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Updates the parameters for the input device.
 */
public class UpdateInputDeviceRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * The settings that you want to apply to the input device.
     */
    private InputDeviceConfigurableSettings hdDeviceSettings;

    /**
     * The unique ID of the input device. For example, hd-123456789abcdef.
     */
    private String inputDeviceId;

    /**
     * The name that you assigned to this input device (not the unique ID).
     */
    private String name;

    /**
     * The settings that you want to apply to the input device.
     *
     * @return The settings that you want to apply to the input device.
     */
    public InputDeviceConfigurableSettings getHdDeviceSettings() {
        return hdDeviceSettings;
    }

    /**
     * The settings that you want to apply to the input device.
     *
     * @param hdDeviceSettings The settings that you want to apply to the input
     *            device.
     */
    public void setHdDeviceSettings(InputDeviceConfigurableSettings hdDeviceSettings) {
        this.hdDeviceSettings = hdDeviceSettings;
    }

    /**
     * The settings that you want to apply to the input device.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hdDeviceSettings The settings that you want to apply to the input
     *            device.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateInputDeviceRequest withHdDeviceSettings(
            InputDeviceConfigurableSettings hdDeviceSettings) {
        this.hdDeviceSettings = hdDeviceSettings;
        return this;
    }

    /**
     * The unique ID of the input device. For example, hd-123456789abcdef.
     *
     * @return The unique ID of the input device. For example,
     *         hd-123456789abcdef.
     */
    public String getInputDeviceId() {
        return inputDeviceId;
    }

    /**
     * The unique ID of the input device. For example, hd-123456789abcdef.
     *
     * @param inputDeviceId The unique ID of the input device. For example,
     *            hd-123456789abcdef.
     */
    public void setInputDeviceId(String inputDeviceId) {
        this.inputDeviceId = inputDeviceId;
    }

    /**
     * The unique ID of the input device. For example, hd-123456789abcdef.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inputDeviceId The unique ID of the input device. For example,
     *            hd-123456789abcdef.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateInputDeviceRequest withInputDeviceId(String inputDeviceId) {
        this.inputDeviceId = inputDeviceId;
        return this;
    }

    /**
     * The name that you assigned to this input device (not the unique ID).
     *
     * @return The name that you assigned to this input device (not the unique
     *         ID).
     */
    public String getName() {
        return name;
    }

    /**
     * The name that you assigned to this input device (not the unique ID).
     *
     * @param name The name that you assigned to this input device (not the
     *            unique ID).
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * The name that you assigned to this input device (not the unique ID).
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name The name that you assigned to this input device (not the
     *            unique ID).
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateInputDeviceRequest withName(String name) {
        this.name = name;
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
        if (getHdDeviceSettings() != null)
            sb.append("HdDeviceSettings: " + getHdDeviceSettings() + ",");
        if (getInputDeviceId() != null)
            sb.append("InputDeviceId: " + getInputDeviceId() + ",");
        if (getName() != null)
            sb.append("Name: " + getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getHdDeviceSettings() == null) ? 0 : getHdDeviceSettings().hashCode());
        hashCode = prime * hashCode
                + ((getInputDeviceId() == null) ? 0 : getInputDeviceId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateInputDeviceRequest == false)
            return false;
        UpdateInputDeviceRequest other = (UpdateInputDeviceRequest) obj;

        if (other.getHdDeviceSettings() == null ^ this.getHdDeviceSettings() == null)
            return false;
        if (other.getHdDeviceSettings() != null
                && other.getHdDeviceSettings().equals(this.getHdDeviceSettings()) == false)
            return false;
        if (other.getInputDeviceId() == null ^ this.getInputDeviceId() == null)
            return false;
        if (other.getInputDeviceId() != null
                && other.getInputDeviceId().equals(this.getInputDeviceId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }
}
