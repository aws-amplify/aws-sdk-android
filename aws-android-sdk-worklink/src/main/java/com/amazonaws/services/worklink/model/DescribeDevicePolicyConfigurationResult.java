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

package com.amazonaws.services.worklink.model;

import java.io.Serializable;

public class DescribeDevicePolicyConfigurationResult implements Serializable {
    /**
     * <p>
     * The certificate chain, including intermediate certificates and the root
     * certificate authority certificate used to issue device certificates.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 8192<br/>
     * <b>Pattern: </b>-{5}BEGIN CERTIFICATE-{5} ? ([A-Za-z0-9/+]{64} ?
     * )*[A-Za-z0-9/+]{1,64}={0,2} ? -{5}END CERTIFICATE-{5}( ? )?<br/>
     */
    private String deviceCaCertificate;

    /**
     * <p>
     * The certificate chain, including intermediate certificates and the root
     * certificate authority certificate used to issue device certificates.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 8192<br/>
     * <b>Pattern: </b>-{5}BEGIN CERTIFICATE-{5} ? ([A-Za-z0-9/+]{64} ?
     * )*[A-Za-z0-9/+]{1,64}={0,2} ? -{5}END CERTIFICATE-{5}( ? )?<br/>
     *
     * @return <p>
     *         The certificate chain, including intermediate certificates and
     *         the root certificate authority certificate used to issue device
     *         certificates.
     *         </p>
     */
    public String getDeviceCaCertificate() {
        return deviceCaCertificate;
    }

    /**
     * <p>
     * The certificate chain, including intermediate certificates and the root
     * certificate authority certificate used to issue device certificates.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 8192<br/>
     * <b>Pattern: </b>-{5}BEGIN CERTIFICATE-{5} ? ([A-Za-z0-9/+]{64} ?
     * )*[A-Za-z0-9/+]{1,64}={0,2} ? -{5}END CERTIFICATE-{5}( ? )?<br/>
     *
     * @param deviceCaCertificate <p>
     *            The certificate chain, including intermediate certificates and
     *            the root certificate authority certificate used to issue
     *            device certificates.
     *            </p>
     */
    public void setDeviceCaCertificate(String deviceCaCertificate) {
        this.deviceCaCertificate = deviceCaCertificate;
    }

    /**
     * <p>
     * The certificate chain, including intermediate certificates and the root
     * certificate authority certificate used to issue device certificates.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 8192<br/>
     * <b>Pattern: </b>-{5}BEGIN CERTIFICATE-{5} ? ([A-Za-z0-9/+]{64} ?
     * )*[A-Za-z0-9/+]{1,64}={0,2} ? -{5}END CERTIFICATE-{5}( ? )?<br/>
     *
     * @param deviceCaCertificate <p>
     *            The certificate chain, including intermediate certificates and
     *            the root certificate authority certificate used to issue
     *            device certificates.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDevicePolicyConfigurationResult withDeviceCaCertificate(
            String deviceCaCertificate) {
        this.deviceCaCertificate = deviceCaCertificate;
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
        if (getDeviceCaCertificate() != null)
            sb.append("DeviceCaCertificate: " + getDeviceCaCertificate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDeviceCaCertificate() == null) ? 0 : getDeviceCaCertificate().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDevicePolicyConfigurationResult == false)
            return false;
        DescribeDevicePolicyConfigurationResult other = (DescribeDevicePolicyConfigurationResult) obj;

        if (other.getDeviceCaCertificate() == null ^ this.getDeviceCaCertificate() == null)
            return false;
        if (other.getDeviceCaCertificate() != null
                && other.getDeviceCaCertificate().equals(this.getDeviceCaCertificate()) == false)
            return false;
        return true;
    }
}
