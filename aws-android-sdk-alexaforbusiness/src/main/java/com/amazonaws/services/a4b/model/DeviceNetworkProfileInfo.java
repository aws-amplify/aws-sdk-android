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

/**
 * <p>
 * Detailed information about a device's network profile.
 * </p>
 */
public class DeviceNetworkProfileInfo implements Serializable {
    /**
     * <p>
     * The ARN of the network profile associated with a device.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     */
    private String networkProfileArn;

    /**
     * <p>
     * The ARN of the certificate associated with a device.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     */
    private String certificateArn;

    /**
     * <p>
     * The time (in epoch) when the certificate expires.
     * </p>
     */
    private java.util.Date certificateExpirationTime;

    /**
     * <p>
     * The ARN of the network profile associated with a device.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @return <p>
     *         The ARN of the network profile associated with a device.
     *         </p>
     */
    public String getNetworkProfileArn() {
        return networkProfileArn;
    }

    /**
     * <p>
     * The ARN of the network profile associated with a device.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param networkProfileArn <p>
     *            The ARN of the network profile associated with a device.
     *            </p>
     */
    public void setNetworkProfileArn(String networkProfileArn) {
        this.networkProfileArn = networkProfileArn;
    }

    /**
     * <p>
     * The ARN of the network profile associated with a device.
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
     * @param networkProfileArn <p>
     *            The ARN of the network profile associated with a device.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeviceNetworkProfileInfo withNetworkProfileArn(String networkProfileArn) {
        this.networkProfileArn = networkProfileArn;
        return this;
    }

    /**
     * <p>
     * The ARN of the certificate associated with a device.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @return <p>
     *         The ARN of the certificate associated with a device.
     *         </p>
     */
    public String getCertificateArn() {
        return certificateArn;
    }

    /**
     * <p>
     * The ARN of the certificate associated with a device.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param certificateArn <p>
     *            The ARN of the certificate associated with a device.
     *            </p>
     */
    public void setCertificateArn(String certificateArn) {
        this.certificateArn = certificateArn;
    }

    /**
     * <p>
     * The ARN of the certificate associated with a device.
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
     * @param certificateArn <p>
     *            The ARN of the certificate associated with a device.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeviceNetworkProfileInfo withCertificateArn(String certificateArn) {
        this.certificateArn = certificateArn;
        return this;
    }

    /**
     * <p>
     * The time (in epoch) when the certificate expires.
     * </p>
     *
     * @return <p>
     *         The time (in epoch) when the certificate expires.
     *         </p>
     */
    public java.util.Date getCertificateExpirationTime() {
        return certificateExpirationTime;
    }

    /**
     * <p>
     * The time (in epoch) when the certificate expires.
     * </p>
     *
     * @param certificateExpirationTime <p>
     *            The time (in epoch) when the certificate expires.
     *            </p>
     */
    public void setCertificateExpirationTime(java.util.Date certificateExpirationTime) {
        this.certificateExpirationTime = certificateExpirationTime;
    }

    /**
     * <p>
     * The time (in epoch) when the certificate expires.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param certificateExpirationTime <p>
     *            The time (in epoch) when the certificate expires.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeviceNetworkProfileInfo withCertificateExpirationTime(
            java.util.Date certificateExpirationTime) {
        this.certificateExpirationTime = certificateExpirationTime;
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
        if (getNetworkProfileArn() != null)
            sb.append("NetworkProfileArn: " + getNetworkProfileArn() + ",");
        if (getCertificateArn() != null)
            sb.append("CertificateArn: " + getCertificateArn() + ",");
        if (getCertificateExpirationTime() != null)
            sb.append("CertificateExpirationTime: " + getCertificateExpirationTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getNetworkProfileArn() == null) ? 0 : getNetworkProfileArn().hashCode());
        hashCode = prime * hashCode
                + ((getCertificateArn() == null) ? 0 : getCertificateArn().hashCode());
        hashCode = prime
                * hashCode
                + ((getCertificateExpirationTime() == null) ? 0 : getCertificateExpirationTime()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeviceNetworkProfileInfo == false)
            return false;
        DeviceNetworkProfileInfo other = (DeviceNetworkProfileInfo) obj;

        if (other.getNetworkProfileArn() == null ^ this.getNetworkProfileArn() == null)
            return false;
        if (other.getNetworkProfileArn() != null
                && other.getNetworkProfileArn().equals(this.getNetworkProfileArn()) == false)
            return false;
        if (other.getCertificateArn() == null ^ this.getCertificateArn() == null)
            return false;
        if (other.getCertificateArn() != null
                && other.getCertificateArn().equals(this.getCertificateArn()) == false)
            return false;
        if (other.getCertificateExpirationTime() == null
                ^ this.getCertificateExpirationTime() == null)
            return false;
        if (other.getCertificateExpirationTime() != null
                && other.getCertificateExpirationTime().equals(this.getCertificateExpirationTime()) == false)
            return false;
        return true;
    }
}
