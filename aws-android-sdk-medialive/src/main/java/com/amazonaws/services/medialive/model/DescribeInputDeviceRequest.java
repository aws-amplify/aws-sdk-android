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
 * Gets the details for the input device
 */
public class DescribeInputDeviceRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * The unique ID of this input device. For example, hd-123456789abcdef.
     */
    private String inputDeviceId;

    /**
     * The unique ID of this input device. For example, hd-123456789abcdef.
     *
     * @return The unique ID of this input device. For example,
     *         hd-123456789abcdef.
     */
    public String getInputDeviceId() {
        return inputDeviceId;
    }

    /**
     * The unique ID of this input device. For example, hd-123456789abcdef.
     *
     * @param inputDeviceId The unique ID of this input device. For example,
     *            hd-123456789abcdef.
     */
    public void setInputDeviceId(String inputDeviceId) {
        this.inputDeviceId = inputDeviceId;
    }

    /**
     * The unique ID of this input device. For example, hd-123456789abcdef.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inputDeviceId The unique ID of this input device. For example,
     *            hd-123456789abcdef.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeInputDeviceRequest withInputDeviceId(String inputDeviceId) {
        this.inputDeviceId = inputDeviceId;
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
        if (getInputDeviceId() != null)
            sb.append("InputDeviceId: " + getInputDeviceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getInputDeviceId() == null) ? 0 : getInputDeviceId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeInputDeviceRequest == false)
            return false;
        DescribeInputDeviceRequest other = (DescribeInputDeviceRequest) obj;

        if (other.getInputDeviceId() == null ^ this.getInputDeviceId() == null)
            return false;
        if (other.getInputDeviceId() != null
                && other.getInputDeviceId().equals(this.getInputDeviceId()) == false)
            return false;
        return true;
    }
}
