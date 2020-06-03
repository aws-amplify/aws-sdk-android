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
 * Contains information about a virtual MFA device.
 * </p>
 */
public class VirtualMFADevice implements Serializable {
    /**
     * <p>
     * The serial number associated with <code>VirtualMFADevice</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>9 - 256<br/>
     * <b>Pattern: </b>[\w+=/:,.@-]+<br/>
     */
    private String serialNumber;

    /**
     * <p>
     * The base32 seed defined as specified in <a
     * href="https://tools.ietf.org/html/rfc3548.txt">RFC3548</a>. The
     * <code>Base32StringSeed</code> is base64-encoded.
     * </p>
     */
    private java.nio.ByteBuffer base32StringSeed;

    /**
     * <p>
     * A QR code PNG image that encodes
     * <code>otpauth://totp/$virtualMFADeviceName@$AccountName?secret=$Base32String</code>
     * where <code>$virtualMFADeviceName</code> is one of the create call
     * arguments. <code>AccountName</code> is the user name if set (otherwise,
     * the account ID otherwise), and <code>Base32String</code> is the seed in
     * base32 format. The <code>Base32String</code> value is base64-encoded.
     * </p>
     */
    private java.nio.ByteBuffer qRCodePNG;

    /**
     * <p>
     * The IAM user associated with this virtual MFA device.
     * </p>
     */
    private User user;

    /**
     * <p>
     * The date and time on which the virtual MFA device was enabled.
     * </p>
     */
    private java.util.Date enableDate;

    /**
     * <p>
     * The serial number associated with <code>VirtualMFADevice</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>9 - 256<br/>
     * <b>Pattern: </b>[\w+=/:,.@-]+<br/>
     *
     * @return <p>
     *         The serial number associated with <code>VirtualMFADevice</code>.
     *         </p>
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * <p>
     * The serial number associated with <code>VirtualMFADevice</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>9 - 256<br/>
     * <b>Pattern: </b>[\w+=/:,.@-]+<br/>
     *
     * @param serialNumber <p>
     *            The serial number associated with
     *            <code>VirtualMFADevice</code>.
     *            </p>
     */
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    /**
     * <p>
     * The serial number associated with <code>VirtualMFADevice</code>.
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
     *            The serial number associated with
     *            <code>VirtualMFADevice</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VirtualMFADevice withSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }

    /**
     * <p>
     * The base32 seed defined as specified in <a
     * href="https://tools.ietf.org/html/rfc3548.txt">RFC3548</a>. The
     * <code>Base32StringSeed</code> is base64-encoded.
     * </p>
     *
     * @return <p>
     *         The base32 seed defined as specified in <a
     *         href="https://tools.ietf.org/html/rfc3548.txt">RFC3548</a>. The
     *         <code>Base32StringSeed</code> is base64-encoded.
     *         </p>
     */
    public java.nio.ByteBuffer getBase32StringSeed() {
        return base32StringSeed;
    }

    /**
     * <p>
     * The base32 seed defined as specified in <a
     * href="https://tools.ietf.org/html/rfc3548.txt">RFC3548</a>. The
     * <code>Base32StringSeed</code> is base64-encoded.
     * </p>
     *
     * @param base32StringSeed <p>
     *            The base32 seed defined as specified in <a
     *            href="https://tools.ietf.org/html/rfc3548.txt">RFC3548</a>.
     *            The <code>Base32StringSeed</code> is base64-encoded.
     *            </p>
     */
    public void setBase32StringSeed(java.nio.ByteBuffer base32StringSeed) {
        this.base32StringSeed = base32StringSeed;
    }

    /**
     * <p>
     * The base32 seed defined as specified in <a
     * href="https://tools.ietf.org/html/rfc3548.txt">RFC3548</a>. The
     * <code>Base32StringSeed</code> is base64-encoded.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param base32StringSeed <p>
     *            The base32 seed defined as specified in <a
     *            href="https://tools.ietf.org/html/rfc3548.txt">RFC3548</a>.
     *            The <code>Base32StringSeed</code> is base64-encoded.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VirtualMFADevice withBase32StringSeed(java.nio.ByteBuffer base32StringSeed) {
        this.base32StringSeed = base32StringSeed;
        return this;
    }

    /**
     * <p>
     * A QR code PNG image that encodes
     * <code>otpauth://totp/$virtualMFADeviceName@$AccountName?secret=$Base32String</code>
     * where <code>$virtualMFADeviceName</code> is one of the create call
     * arguments. <code>AccountName</code> is the user name if set (otherwise,
     * the account ID otherwise), and <code>Base32String</code> is the seed in
     * base32 format. The <code>Base32String</code> value is base64-encoded.
     * </p>
     *
     * @return <p>
     *         A QR code PNG image that encodes
     *         <code>otpauth://totp/$virtualMFADeviceName@$AccountName?secret=$Base32String</code>
     *         where <code>$virtualMFADeviceName</code> is one of the create
     *         call arguments. <code>AccountName</code> is the user name if set
     *         (otherwise, the account ID otherwise), and
     *         <code>Base32String</code> is the seed in base32 format. The
     *         <code>Base32String</code> value is base64-encoded.
     *         </p>
     */
    public java.nio.ByteBuffer getQRCodePNG() {
        return qRCodePNG;
    }

    /**
     * <p>
     * A QR code PNG image that encodes
     * <code>otpauth://totp/$virtualMFADeviceName@$AccountName?secret=$Base32String</code>
     * where <code>$virtualMFADeviceName</code> is one of the create call
     * arguments. <code>AccountName</code> is the user name if set (otherwise,
     * the account ID otherwise), and <code>Base32String</code> is the seed in
     * base32 format. The <code>Base32String</code> value is base64-encoded.
     * </p>
     *
     * @param qRCodePNG <p>
     *            A QR code PNG image that encodes
     *            <code>otpauth://totp/$virtualMFADeviceName@$AccountName?secret=$Base32String</code>
     *            where <code>$virtualMFADeviceName</code> is one of the create
     *            call arguments. <code>AccountName</code> is the user name if
     *            set (otherwise, the account ID otherwise), and
     *            <code>Base32String</code> is the seed in base32 format. The
     *            <code>Base32String</code> value is base64-encoded.
     *            </p>
     */
    public void setQRCodePNG(java.nio.ByteBuffer qRCodePNG) {
        this.qRCodePNG = qRCodePNG;
    }

    /**
     * <p>
     * A QR code PNG image that encodes
     * <code>otpauth://totp/$virtualMFADeviceName@$AccountName?secret=$Base32String</code>
     * where <code>$virtualMFADeviceName</code> is one of the create call
     * arguments. <code>AccountName</code> is the user name if set (otherwise,
     * the account ID otherwise), and <code>Base32String</code> is the seed in
     * base32 format. The <code>Base32String</code> value is base64-encoded.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param qRCodePNG <p>
     *            A QR code PNG image that encodes
     *            <code>otpauth://totp/$virtualMFADeviceName@$AccountName?secret=$Base32String</code>
     *            where <code>$virtualMFADeviceName</code> is one of the create
     *            call arguments. <code>AccountName</code> is the user name if
     *            set (otherwise, the account ID otherwise), and
     *            <code>Base32String</code> is the seed in base32 format. The
     *            <code>Base32String</code> value is base64-encoded.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VirtualMFADevice withQRCodePNG(java.nio.ByteBuffer qRCodePNG) {
        this.qRCodePNG = qRCodePNG;
        return this;
    }

    /**
     * <p>
     * The IAM user associated with this virtual MFA device.
     * </p>
     *
     * @return <p>
     *         The IAM user associated with this virtual MFA device.
     *         </p>
     */
    public User getUser() {
        return user;
    }

    /**
     * <p>
     * The IAM user associated with this virtual MFA device.
     * </p>
     *
     * @param user <p>
     *            The IAM user associated with this virtual MFA device.
     *            </p>
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * <p>
     * The IAM user associated with this virtual MFA device.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param user <p>
     *            The IAM user associated with this virtual MFA device.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VirtualMFADevice withUser(User user) {
        this.user = user;
        return this;
    }

    /**
     * <p>
     * The date and time on which the virtual MFA device was enabled.
     * </p>
     *
     * @return <p>
     *         The date and time on which the virtual MFA device was enabled.
     *         </p>
     */
    public java.util.Date getEnableDate() {
        return enableDate;
    }

    /**
     * <p>
     * The date and time on which the virtual MFA device was enabled.
     * </p>
     *
     * @param enableDate <p>
     *            The date and time on which the virtual MFA device was enabled.
     *            </p>
     */
    public void setEnableDate(java.util.Date enableDate) {
        this.enableDate = enableDate;
    }

    /**
     * <p>
     * The date and time on which the virtual MFA device was enabled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enableDate <p>
     *            The date and time on which the virtual MFA device was enabled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VirtualMFADevice withEnableDate(java.util.Date enableDate) {
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
        if (getSerialNumber() != null)
            sb.append("SerialNumber: " + getSerialNumber() + ",");
        if (getBase32StringSeed() != null)
            sb.append("Base32StringSeed: " + getBase32StringSeed() + ",");
        if (getQRCodePNG() != null)
            sb.append("QRCodePNG: " + getQRCodePNG() + ",");
        if (getUser() != null)
            sb.append("User: " + getUser() + ",");
        if (getEnableDate() != null)
            sb.append("EnableDate: " + getEnableDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSerialNumber() == null) ? 0 : getSerialNumber().hashCode());
        hashCode = prime * hashCode
                + ((getBase32StringSeed() == null) ? 0 : getBase32StringSeed().hashCode());
        hashCode = prime * hashCode + ((getQRCodePNG() == null) ? 0 : getQRCodePNG().hashCode());
        hashCode = prime * hashCode + ((getUser() == null) ? 0 : getUser().hashCode());
        hashCode = prime * hashCode + ((getEnableDate() == null) ? 0 : getEnableDate().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VirtualMFADevice == false)
            return false;
        VirtualMFADevice other = (VirtualMFADevice) obj;

        if (other.getSerialNumber() == null ^ this.getSerialNumber() == null)
            return false;
        if (other.getSerialNumber() != null
                && other.getSerialNumber().equals(this.getSerialNumber()) == false)
            return false;
        if (other.getBase32StringSeed() == null ^ this.getBase32StringSeed() == null)
            return false;
        if (other.getBase32StringSeed() != null
                && other.getBase32StringSeed().equals(this.getBase32StringSeed()) == false)
            return false;
        if (other.getQRCodePNG() == null ^ this.getQRCodePNG() == null)
            return false;
        if (other.getQRCodePNG() != null
                && other.getQRCodePNG().equals(this.getQRCodePNG()) == false)
            return false;
        if (other.getUser() == null ^ this.getUser() == null)
            return false;
        if (other.getUser() != null && other.getUser().equals(this.getUser()) == false)
            return false;
        if (other.getEnableDate() == null ^ this.getEnableDate() == null)
            return false;
        if (other.getEnableDate() != null
                && other.getEnableDate().equals(this.getEnableDate()) == false)
            return false;
        return true;
    }
}
