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

package com.amazonaws.services.a4b.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * When this action is called for a specified shared device, it allows
 * authorized users to delete the device's entire previous history of voice
 * input data and associated response data. This action can be called once every
 * 24 hours for a specific shared device.
 * </p>
 */
public class DeleteDeviceUsageDataRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ARN of the device.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     */
    private String deviceArn;

    /**
     * <p>
     * The type of usage data to delete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VOICE
     */
    private String deviceUsageType;

    /**
     * <p>
     * The ARN of the device.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @return <p>
     *         The ARN of the device.
     *         </p>
     */
    public String getDeviceArn() {
        return deviceArn;
    }

    /**
     * <p>
     * The ARN of the device.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param deviceArn <p>
     *            The ARN of the device.
     *            </p>
     */
    public void setDeviceArn(String deviceArn) {
        this.deviceArn = deviceArn;
    }

    /**
     * <p>
     * The ARN of the device.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param deviceArn <p>
     *            The ARN of the device.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteDeviceUsageDataRequest withDeviceArn(String deviceArn) {
        this.deviceArn = deviceArn;
        return this;
    }

    /**
     * <p>
     * The type of usage data to delete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VOICE
     *
     * @return <p>
     *         The type of usage data to delete.
     *         </p>
     * @see DeviceUsageType
     */
    public String getDeviceUsageType() {
        return deviceUsageType;
    }

    /**
     * <p>
     * The type of usage data to delete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VOICE
     *
     * @param deviceUsageType <p>
     *            The type of usage data to delete.
     *            </p>
     * @see DeviceUsageType
     */
    public void setDeviceUsageType(String deviceUsageType) {
        this.deviceUsageType = deviceUsageType;
    }

    /**
     * <p>
     * The type of usage data to delete.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VOICE
     *
     * @param deviceUsageType <p>
     *            The type of usage data to delete.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DeviceUsageType
     */
    public DeleteDeviceUsageDataRequest withDeviceUsageType(String deviceUsageType) {
        this.deviceUsageType = deviceUsageType;
        return this;
    }

    /**
     * <p>
     * The type of usage data to delete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VOICE
     *
     * @param deviceUsageType <p>
     *            The type of usage data to delete.
     *            </p>
     * @see DeviceUsageType
     */
    public void setDeviceUsageType(DeviceUsageType deviceUsageType) {
        this.deviceUsageType = deviceUsageType.toString();
    }

    /**
     * <p>
     * The type of usage data to delete.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VOICE
     *
     * @param deviceUsageType <p>
     *            The type of usage data to delete.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DeviceUsageType
     */
    public DeleteDeviceUsageDataRequest withDeviceUsageType(DeviceUsageType deviceUsageType) {
        this.deviceUsageType = deviceUsageType.toString();
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
        if (getDeviceArn() != null)
            sb.append("DeviceArn: " + getDeviceArn() + ",");
        if (getDeviceUsageType() != null)
            sb.append("DeviceUsageType: " + getDeviceUsageType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeviceArn() == null) ? 0 : getDeviceArn().hashCode());
        hashCode = prime * hashCode
                + ((getDeviceUsageType() == null) ? 0 : getDeviceUsageType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteDeviceUsageDataRequest == false)
            return false;
        DeleteDeviceUsageDataRequest other = (DeleteDeviceUsageDataRequest) obj;

        if (other.getDeviceArn() == null ^ this.getDeviceArn() == null)
            return false;
        if (other.getDeviceArn() != null
                && other.getDeviceArn().equals(this.getDeviceArn()) == false)
            return false;
        if (other.getDeviceUsageType() == null ^ this.getDeviceUsageType() == null)
            return false;
        if (other.getDeviceUsageType() != null
                && other.getDeviceUsageType().equals(this.getDeviceUsageType()) == false)
            return false;
        return true;
    }
}
