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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Describes telemetry for a VPN tunnel.
 * </p>
 */
public class VgwTelemetry implements Serializable {
    /**
     * <p>
     * The number of accepted routes.
     * </p>
     */
    private Integer acceptedRouteCount;

    /**
     * <p>
     * The date and time of the last change in status.
     * </p>
     */
    private java.util.Date lastStatusChange;

    /**
     * <p>
     * The Internet-routable IP address of the virtual private gateway's outside
     * interface.
     * </p>
     */
    private String outsideIpAddress;

    /**
     * <p>
     * The status of the VPN tunnel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UP, DOWN
     */
    private String status;

    /**
     * <p>
     * If an error occurs, a description of the error.
     * </p>
     */
    private String statusMessage;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the VPN tunnel endpoint certificate.
     * </p>
     */
    private String certificateArn;

    /**
     * <p>
     * The number of accepted routes.
     * </p>
     *
     * @return <p>
     *         The number of accepted routes.
     *         </p>
     */
    public Integer getAcceptedRouteCount() {
        return acceptedRouteCount;
    }

    /**
     * <p>
     * The number of accepted routes.
     * </p>
     *
     * @param acceptedRouteCount <p>
     *            The number of accepted routes.
     *            </p>
     */
    public void setAcceptedRouteCount(Integer acceptedRouteCount) {
        this.acceptedRouteCount = acceptedRouteCount;
    }

    /**
     * <p>
     * The number of accepted routes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param acceptedRouteCount <p>
     *            The number of accepted routes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VgwTelemetry withAcceptedRouteCount(Integer acceptedRouteCount) {
        this.acceptedRouteCount = acceptedRouteCount;
        return this;
    }

    /**
     * <p>
     * The date and time of the last change in status.
     * </p>
     *
     * @return <p>
     *         The date and time of the last change in status.
     *         </p>
     */
    public java.util.Date getLastStatusChange() {
        return lastStatusChange;
    }

    /**
     * <p>
     * The date and time of the last change in status.
     * </p>
     *
     * @param lastStatusChange <p>
     *            The date and time of the last change in status.
     *            </p>
     */
    public void setLastStatusChange(java.util.Date lastStatusChange) {
        this.lastStatusChange = lastStatusChange;
    }

    /**
     * <p>
     * The date and time of the last change in status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastStatusChange <p>
     *            The date and time of the last change in status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VgwTelemetry withLastStatusChange(java.util.Date lastStatusChange) {
        this.lastStatusChange = lastStatusChange;
        return this;
    }

    /**
     * <p>
     * The Internet-routable IP address of the virtual private gateway's outside
     * interface.
     * </p>
     *
     * @return <p>
     *         The Internet-routable IP address of the virtual private gateway's
     *         outside interface.
     *         </p>
     */
    public String getOutsideIpAddress() {
        return outsideIpAddress;
    }

    /**
     * <p>
     * The Internet-routable IP address of the virtual private gateway's outside
     * interface.
     * </p>
     *
     * @param outsideIpAddress <p>
     *            The Internet-routable IP address of the virtual private
     *            gateway's outside interface.
     *            </p>
     */
    public void setOutsideIpAddress(String outsideIpAddress) {
        this.outsideIpAddress = outsideIpAddress;
    }

    /**
     * <p>
     * The Internet-routable IP address of the virtual private gateway's outside
     * interface.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param outsideIpAddress <p>
     *            The Internet-routable IP address of the virtual private
     *            gateway's outside interface.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VgwTelemetry withOutsideIpAddress(String outsideIpAddress) {
        this.outsideIpAddress = outsideIpAddress;
        return this;
    }

    /**
     * <p>
     * The status of the VPN tunnel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UP, DOWN
     *
     * @return <p>
     *         The status of the VPN tunnel.
     *         </p>
     * @see TelemetryStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the VPN tunnel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UP, DOWN
     *
     * @param status <p>
     *            The status of the VPN tunnel.
     *            </p>
     * @see TelemetryStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the VPN tunnel.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UP, DOWN
     *
     * @param status <p>
     *            The status of the VPN tunnel.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TelemetryStatus
     */
    public VgwTelemetry withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The status of the VPN tunnel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UP, DOWN
     *
     * @param status <p>
     *            The status of the VPN tunnel.
     *            </p>
     * @see TelemetryStatus
     */
    public void setStatus(TelemetryStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status of the VPN tunnel.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UP, DOWN
     *
     * @param status <p>
     *            The status of the VPN tunnel.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TelemetryStatus
     */
    public VgwTelemetry withStatus(TelemetryStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * If an error occurs, a description of the error.
     * </p>
     *
     * @return <p>
     *         If an error occurs, a description of the error.
     *         </p>
     */
    public String getStatusMessage() {
        return statusMessage;
    }

    /**
     * <p>
     * If an error occurs, a description of the error.
     * </p>
     *
     * @param statusMessage <p>
     *            If an error occurs, a description of the error.
     *            </p>
     */
    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * If an error occurs, a description of the error.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param statusMessage <p>
     *            If an error occurs, a description of the error.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VgwTelemetry withStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the VPN tunnel endpoint certificate.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the VPN tunnel endpoint
     *         certificate.
     *         </p>
     */
    public String getCertificateArn() {
        return certificateArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the VPN tunnel endpoint certificate.
     * </p>
     *
     * @param certificateArn <p>
     *            The Amazon Resource Name (ARN) of the VPN tunnel endpoint
     *            certificate.
     *            </p>
     */
    public void setCertificateArn(String certificateArn) {
        this.certificateArn = certificateArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the VPN tunnel endpoint certificate.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param certificateArn <p>
     *            The Amazon Resource Name (ARN) of the VPN tunnel endpoint
     *            certificate.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VgwTelemetry withCertificateArn(String certificateArn) {
        this.certificateArn = certificateArn;
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
        if (getAcceptedRouteCount() != null)
            sb.append("AcceptedRouteCount: " + getAcceptedRouteCount() + ",");
        if (getLastStatusChange() != null)
            sb.append("LastStatusChange: " + getLastStatusChange() + ",");
        if (getOutsideIpAddress() != null)
            sb.append("OutsideIpAddress: " + getOutsideIpAddress() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: " + getStatusMessage() + ",");
        if (getCertificateArn() != null)
            sb.append("CertificateArn: " + getCertificateArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAcceptedRouteCount() == null) ? 0 : getAcceptedRouteCount().hashCode());
        hashCode = prime * hashCode
                + ((getLastStatusChange() == null) ? 0 : getLastStatusChange().hashCode());
        hashCode = prime * hashCode
                + ((getOutsideIpAddress() == null) ? 0 : getOutsideIpAddress().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode
                + ((getCertificateArn() == null) ? 0 : getCertificateArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VgwTelemetry == false)
            return false;
        VgwTelemetry other = (VgwTelemetry) obj;

        if (other.getAcceptedRouteCount() == null ^ this.getAcceptedRouteCount() == null)
            return false;
        if (other.getAcceptedRouteCount() != null
                && other.getAcceptedRouteCount().equals(this.getAcceptedRouteCount()) == false)
            return false;
        if (other.getLastStatusChange() == null ^ this.getLastStatusChange() == null)
            return false;
        if (other.getLastStatusChange() != null
                && other.getLastStatusChange().equals(this.getLastStatusChange()) == false)
            return false;
        if (other.getOutsideIpAddress() == null ^ this.getOutsideIpAddress() == null)
            return false;
        if (other.getOutsideIpAddress() != null
                && other.getOutsideIpAddress().equals(this.getOutsideIpAddress()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null
                && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getCertificateArn() == null ^ this.getCertificateArn() == null)
            return false;
        if (other.getCertificateArn() != null
                && other.getCertificateArn().equals(this.getCertificateArn()) == false)
            return false;
        return true;
    }
}
