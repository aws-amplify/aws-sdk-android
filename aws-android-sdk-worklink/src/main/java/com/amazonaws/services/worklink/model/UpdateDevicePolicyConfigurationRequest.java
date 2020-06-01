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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates the device policy configuration for the fleet.
 * </p>
 */
public class UpdateDevicePolicyConfigurationRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The ARN of the fleet.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     */
    private String fleetArn;

    /**
     * <p>
     * The certificate chain, including intermediate certificates and the root
     * certificate authority certificate used to issue device certificates.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32768<br/>
     * <b>Pattern: </b>(-{5}BEGIN CERTIFICATE-{5} ? ([A-Za-z0-9/+]{64} ?
     * )*[A-Za-z0-9/+]{1,64}={0,2} ? -{5}END CERTIFICATE-{5} ? )*-{5}BEGIN
     * CERTIFICATE-{5} ? ([A-Za-z0-9/+]{64} ? )*[A-Za-z0-9/+]{1,64}={0,2} ?
     * -{5}END CERTIFICATE-{5}( ? )?<br/>
     */
    private String deviceCaCertificate;

    /**
     * <p>
     * The ARN of the fleet.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @return <p>
     *         The ARN of the fleet.
     *         </p>
     */
    public String getFleetArn() {
        return fleetArn;
    }

    /**
     * <p>
     * The ARN of the fleet.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param fleetArn <p>
     *            The ARN of the fleet.
     *            </p>
     */
    public void setFleetArn(String fleetArn) {
        this.fleetArn = fleetArn;
    }

    /**
     * <p>
     * The ARN of the fleet.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param fleetArn <p>
     *            The ARN of the fleet.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDevicePolicyConfigurationRequest withFleetArn(String fleetArn) {
        this.fleetArn = fleetArn;
        return this;
    }

    /**
     * <p>
     * The certificate chain, including intermediate certificates and the root
     * certificate authority certificate used to issue device certificates.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32768<br/>
     * <b>Pattern: </b>(-{5}BEGIN CERTIFICATE-{5} ? ([A-Za-z0-9/+]{64} ?
     * )*[A-Za-z0-9/+]{1,64}={0,2} ? -{5}END CERTIFICATE-{5} ? )*-{5}BEGIN
     * CERTIFICATE-{5} ? ([A-Za-z0-9/+]{64} ? )*[A-Za-z0-9/+]{1,64}={0,2} ?
     * -{5}END CERTIFICATE-{5}( ? )?<br/>
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
     * <b>Length: </b>1 - 32768<br/>
     * <b>Pattern: </b>(-{5}BEGIN CERTIFICATE-{5} ? ([A-Za-z0-9/+]{64} ?
     * )*[A-Za-z0-9/+]{1,64}={0,2} ? -{5}END CERTIFICATE-{5} ? )*-{5}BEGIN
     * CERTIFICATE-{5} ? ([A-Za-z0-9/+]{64} ? )*[A-Za-z0-9/+]{1,64}={0,2} ?
     * -{5}END CERTIFICATE-{5}( ? )?<br/>
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
     * <b>Length: </b>1 - 32768<br/>
     * <b>Pattern: </b>(-{5}BEGIN CERTIFICATE-{5} ? ([A-Za-z0-9/+]{64} ?
     * )*[A-Za-z0-9/+]{1,64}={0,2} ? -{5}END CERTIFICATE-{5} ? )*-{5}BEGIN
     * CERTIFICATE-{5} ? ([A-Za-z0-9/+]{64} ? )*[A-Za-z0-9/+]{1,64}={0,2} ?
     * -{5}END CERTIFICATE-{5}( ? )?<br/>
     *
     * @param deviceCaCertificate <p>
     *            The certificate chain, including intermediate certificates and
     *            the root certificate authority certificate used to issue
     *            device certificates.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDevicePolicyConfigurationRequest withDeviceCaCertificate(String deviceCaCertificate) {
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
        if (getFleetArn() != null)
            sb.append("FleetArn: " + getFleetArn() + ",");
        if (getDeviceCaCertificate() != null)
            sb.append("DeviceCaCertificate: " + getDeviceCaCertificate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFleetArn() == null) ? 0 : getFleetArn().hashCode());
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

        if (obj instanceof UpdateDevicePolicyConfigurationRequest == false)
            return false;
        UpdateDevicePolicyConfigurationRequest other = (UpdateDevicePolicyConfigurationRequest) obj;

        if (other.getFleetArn() == null ^ this.getFleetArn() == null)
            return false;
        if (other.getFleetArn() != null && other.getFleetArn().equals(this.getFleetArn()) == false)
            return false;
        if (other.getDeviceCaCertificate() == null ^ this.getDeviceCaCertificate() == null)
            return false;
        if (other.getDeviceCaCertificate() != null
                && other.getDeviceCaCertificate().equals(this.getDeviceCaCertificate()) == false)
            return false;
        return true;
    }
}
