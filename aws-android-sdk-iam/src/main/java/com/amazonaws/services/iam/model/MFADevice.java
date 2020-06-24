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

package com.amazonaws.services.iam.model;

import java.io.Serializable;

/**
 * <p>
 * Contains information about an MFA device.
 * </p>
 * <p>
 * This data type is used as a response element in the <a>ListMFADevices</a>
 * operation.
 * </p>
 */
public class MFADevice implements Serializable {
    /**
     * <p>
     * The user with whom the MFA device is associated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     */
    private String userName;

    /**
     * <p>
     * The serial number that uniquely identifies the MFA device. For virtual
     * MFA devices, the serial number is the device ARN.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>9 - 256<br/>
     * <b>Pattern: </b>[\w+=/:,.@-]+<br/>
     */
    private String serialNumber;

    /**
     * <p>
     * The date when the MFA device was enabled for the user.
     * </p>
     */
    private java.util.Date enableDate;

    /**
     * <p>
     * The user with whom the MFA device is associated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @return <p>
     *         The user with whom the MFA device is associated.
     *         </p>
     */
    public String getUserName() {
        return userName;
    }

    /**
     * <p>
     * The user with whom the MFA device is associated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @param userName <p>
     *            The user with whom the MFA device is associated.
     *            </p>
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * <p>
     * The user with whom the MFA device is associated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @param userName <p>
     *            The user with whom the MFA device is associated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MFADevice withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * <p>
     * The serial number that uniquely identifies the MFA device. For virtual
     * MFA devices, the serial number is the device ARN.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>9 - 256<br/>
     * <b>Pattern: </b>[\w+=/:,.@-]+<br/>
     *
     * @return <p>
     *         The serial number that uniquely identifies the MFA device. For
     *         virtual MFA devices, the serial number is the device ARN.
     *         </p>
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * <p>
     * The serial number that uniquely identifies the MFA device. For virtual
     * MFA devices, the serial number is the device ARN.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>9 - 256<br/>
     * <b>Pattern: </b>[\w+=/:,.@-]+<br/>
     *
     * @param serialNumber <p>
     *            The serial number that uniquely identifies the MFA device. For
     *            virtual MFA devices, the serial number is the device ARN.
     *            </p>
     */
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    /**
     * <p>
     * The serial number that uniquely identifies the MFA device. For virtual
     * MFA devices, the serial number is the device ARN.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>9 - 256<br/>
     * <b>Pattern: </b>[\w+=/:,.@-]+<br/>
     *
     * @param serialNumber <p>
     *            The serial number that uniquely identifies the MFA device. For
     *            virtual MFA devices, the serial number is the device ARN.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MFADevice withSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }

    /**
     * <p>
     * The date when the MFA device was enabled for the user.
     * </p>
     *
     * @return <p>
     *         The date when the MFA device was enabled for the user.
     *         </p>
     */
    public java.util.Date getEnableDate() {
        return enableDate;
    }

    /**
     * <p>
     * The date when the MFA device was enabled for the user.
     * </p>
     *
     * @param enableDate <p>
     *            The date when the MFA device was enabled for the user.
     *            </p>
     */
    public void setEnableDate(java.util.Date enableDate) {
        this.enableDate = enableDate;
    }

    /**
     * <p>
     * The date when the MFA device was enabled for the user.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enableDate <p>
     *            The date when the MFA device was enabled for the user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MFADevice withEnableDate(java.util.Date enableDate) {
        this.enableDate = enableDate;
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
        if (getUserName() != null)
            sb.append("UserName: " + getUserName() + ",");
        if (getSerialNumber() != null)
            sb.append("SerialNumber: " + getSerialNumber() + ",");
        if (getEnableDate() != null)
            sb.append("EnableDate: " + getEnableDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserName() == null) ? 0 : getUserName().hashCode());
        hashCode = prime * hashCode
                + ((getSerialNumber() == null) ? 0 : getSerialNumber().hashCode());
        hashCode = prime * hashCode + ((getEnableDate() == null) ? 0 : getEnableDate().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MFADevice == false)
            return false;
        MFADevice other = (MFADevice) obj;

        if (other.getUserName() == null ^ this.getUserName() == null)
            return false;
        if (other.getUserName() != null && other.getUserName().equals(this.getUserName()) == false)
            return false;
        if (other.getSerialNumber() == null ^ this.getSerialNumber() == null)
            return false;
        if (other.getSerialNumber() != null
                && other.getSerialNumber().equals(this.getSerialNumber()) == false)
            return false;
        if (other.getEnableDate() == null ^ this.getEnableDate() == null)
            return false;
        if (other.getEnableDate() != null
                && other.getEnableDate().equals(this.getEnableDate()) == false)
            return false;
        return true;
    }
}
