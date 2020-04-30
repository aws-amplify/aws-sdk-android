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

package com.amazonaws.services.awsstoragegateway.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates the type of medium changer in a tape gateway. When you activate a
 * tape gateway, you select a medium changer type for the tape gateway. This
 * operation enables you to select a different type of medium changer after a
 * tape gateway is activated. This operation is only supported in the tape
 * gateway type.
 * </p>
 */
public class UpdateVTLDeviceTypeRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the medium changer you want to select.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     */
    private String vTLDeviceARN;

    /**
     * <p>
     * The type of medium changer you want to select.
     * </p>
     * <p>
     * Valid Values: "STK-L700", "AWS-Gateway-VTL"
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 50<br/>
     */
    private String deviceType;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the medium changer you want to select.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the medium changer you want to
     *         select.
     *         </p>
     */
    public String getVTLDeviceARN() {
        return vTLDeviceARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the medium changer you want to select.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param vTLDeviceARN <p>
     *            The Amazon Resource Name (ARN) of the medium changer you want
     *            to select.
     *            </p>
     */
    public void setVTLDeviceARN(String vTLDeviceARN) {
        this.vTLDeviceARN = vTLDeviceARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the medium changer you want to select.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param vTLDeviceARN <p>
     *            The Amazon Resource Name (ARN) of the medium changer you want
     *            to select.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateVTLDeviceTypeRequest withVTLDeviceARN(String vTLDeviceARN) {
        this.vTLDeviceARN = vTLDeviceARN;
        return this;
    }

    /**
     * <p>
     * The type of medium changer you want to select.
     * </p>
     * <p>
     * Valid Values: "STK-L700", "AWS-Gateway-VTL"
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 50<br/>
     *
     * @return <p>
     *         The type of medium changer you want to select.
     *         </p>
     *         <p>
     *         Valid Values: "STK-L700", "AWS-Gateway-VTL"
     *         </p>
     */
    public String getDeviceType() {
        return deviceType;
    }

    /**
     * <p>
     * The type of medium changer you want to select.
     * </p>
     * <p>
     * Valid Values: "STK-L700", "AWS-Gateway-VTL"
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 50<br/>
     *
     * @param deviceType <p>
     *            The type of medium changer you want to select.
     *            </p>
     *            <p>
     *            Valid Values: "STK-L700", "AWS-Gateway-VTL"
     *            </p>
     */
    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    /**
     * <p>
     * The type of medium changer you want to select.
     * </p>
     * <p>
     * Valid Values: "STK-L700", "AWS-Gateway-VTL"
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 50<br/>
     *
     * @param deviceType <p>
     *            The type of medium changer you want to select.
     *            </p>
     *            <p>
     *            Valid Values: "STK-L700", "AWS-Gateway-VTL"
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateVTLDeviceTypeRequest withDeviceType(String deviceType) {
        this.deviceType = deviceType;
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
        if (getVTLDeviceARN() != null)
            sb.append("VTLDeviceARN: " + getVTLDeviceARN() + ",");
        if (getDeviceType() != null)
            sb.append("DeviceType: " + getDeviceType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getVTLDeviceARN() == null) ? 0 : getVTLDeviceARN().hashCode());
        hashCode = prime * hashCode + ((getDeviceType() == null) ? 0 : getDeviceType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateVTLDeviceTypeRequest == false)
            return false;
        UpdateVTLDeviceTypeRequest other = (UpdateVTLDeviceTypeRequest) obj;

        if (other.getVTLDeviceARN() == null ^ this.getVTLDeviceARN() == null)
            return false;
        if (other.getVTLDeviceARN() != null
                && other.getVTLDeviceARN().equals(this.getVTLDeviceARN()) == false)
            return false;
        if (other.getDeviceType() == null ^ this.getDeviceType() == null)
            return false;
        if (other.getDeviceType() != null
                && other.getDeviceType().equals(this.getDeviceType()) == false)
            return false;
        return true;
    }
}
