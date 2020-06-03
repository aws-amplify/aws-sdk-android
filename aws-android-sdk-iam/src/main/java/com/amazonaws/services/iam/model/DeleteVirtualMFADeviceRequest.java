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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Deletes a virtual MFA device.
 * </p>
 * <note>
 * <p>
 * You must deactivate a user's virtual MFA device before you can delete it. For
 * information about deactivating MFA devices, see <a>DeactivateMFADevice</a>.
 * </p>
 * </note>
 */
public class DeleteVirtualMFADeviceRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The serial number that uniquely identifies the MFA device. For virtual
     * MFA devices, the serial number is the same as the ARN.
     * </p>
     * <p>
     * This parameter allows (through its <a
     * href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of upper and lowercase alphanumeric characters with
     * no spaces. You can also include any of the following characters: =,.@:/-
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>9 - 256<br/>
     * <b>Pattern: </b>[\w+=/:,.@-]+<br/>
     */
    private String serialNumber;

    /**
     * <p>
     * The serial number that uniquely identifies the MFA device. For virtual
     * MFA devices, the serial number is the same as the ARN.
     * </p>
     * <p>
     * This parameter allows (through its <a
     * href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of upper and lowercase alphanumeric characters with
     * no spaces. You can also include any of the following characters: =,.@:/-
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>9 - 256<br/>
     * <b>Pattern: </b>[\w+=/:,.@-]+<br/>
     *
     * @return <p>
     *         The serial number that uniquely identifies the MFA device. For
     *         virtual MFA devices, the serial number is the same as the ARN.
     *         </p>
     *         <p>
     *         This parameter allows (through its <a
     *         href="http://wikipedia.org/wiki/regex">regex pattern</a>) a
     *         string of characters consisting of upper and lowercase
     *         alphanumeric characters with no spaces. You can also include any
     *         of the following characters: =,.@:/-
     *         </p>
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * <p>
     * The serial number that uniquely identifies the MFA device. For virtual
     * MFA devices, the serial number is the same as the ARN.
     * </p>
     * <p>
     * This parameter allows (through its <a
     * href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of upper and lowercase alphanumeric characters with
     * no spaces. You can also include any of the following characters: =,.@:/-
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>9 - 256<br/>
     * <b>Pattern: </b>[\w+=/:,.@-]+<br/>
     *
     * @param serialNumber <p>
     *            The serial number that uniquely identifies the MFA device. For
     *            virtual MFA devices, the serial number is the same as the ARN.
     *            </p>
     *            <p>
     *            This parameter allows (through its <a
     *            href="http://wikipedia.org/wiki/regex">regex pattern</a>) a
     *            string of characters consisting of upper and lowercase
     *            alphanumeric characters with no spaces. You can also include
     *            any of the following characters: =,.@:/-
     *            </p>
     */
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    /**
     * <p>
     * The serial number that uniquely identifies the MFA device. For virtual
     * MFA devices, the serial number is the same as the ARN.
     * </p>
     * <p>
     * This parameter allows (through its <a
     * href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of upper and lowercase alphanumeric characters with
     * no spaces. You can also include any of the following characters: =,.@:/-
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
     *            virtual MFA devices, the serial number is the same as the ARN.
     *            </p>
     *            <p>
     *            This parameter allows (through its <a
     *            href="http://wikipedia.org/wiki/regex">regex pattern</a>) a
     *            string of characters consisting of upper and lowercase
     *            alphanumeric characters with no spaces. You can also include
     *            any of the following characters: =,.@:/-
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteVirtualMFADeviceRequest withSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
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
        if (getSerialNumber() != null)
            sb.append("SerialNumber: " + getSerialNumber());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSerialNumber() == null) ? 0 : getSerialNumber().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteVirtualMFADeviceRequest == false)
            return false;
        DeleteVirtualMFADeviceRequest other = (DeleteVirtualMFADeviceRequest) obj;

        if (other.getSerialNumber() == null ^ this.getSerialNumber() == null)
            return false;
        if (other.getSerialNumber() != null
                && other.getSerialNumber().equals(this.getSerialNumber()) == false)
            return false;
        return true;
    }
}
