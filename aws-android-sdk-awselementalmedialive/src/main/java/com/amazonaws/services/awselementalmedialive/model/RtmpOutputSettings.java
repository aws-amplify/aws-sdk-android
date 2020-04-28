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

package com.amazonaws.services.awselementalmedialive.model;

import java.io.Serializable;

/**
 * Rtmp Output Settings
 */
public class RtmpOutputSettings implements Serializable {
    /**
     * If set to verifyAuthenticity, verify the tls certificate chain to a
     * trusted Certificate Authority (CA). This will cause rtmps outputs with
     * self-signed certificates to fail.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SELF_SIGNED, VERIFY_AUTHENTICITY
     */
    private String certificateMode;

    /**
     * Number of seconds to wait before retrying a connection to the Flash Media
     * server if the connection is lost.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Integer connectionRetryInterval;

    /**
     * The RTMP endpoint excluding the stream name (eg. rtmp://host/appname).
     * For connection to Akamai, a username and password must be supplied. URI
     * fields accept format identifiers.
     */
    private OutputLocationRef destination;

    /**
     * Number of retry attempts.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer numRetries;

    /**
     * If set to verifyAuthenticity, verify the tls certificate chain to a
     * trusted Certificate Authority (CA). This will cause rtmps outputs with
     * self-signed certificates to fail.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SELF_SIGNED, VERIFY_AUTHENTICITY
     *
     * @return If set to verifyAuthenticity, verify the tls certificate chain to
     *         a trusted Certificate Authority (CA). This will cause rtmps
     *         outputs with self-signed certificates to fail.
     * @see RtmpOutputCertificateMode
     */
    public String getCertificateMode() {
        return certificateMode;
    }

    /**
     * If set to verifyAuthenticity, verify the tls certificate chain to a
     * trusted Certificate Authority (CA). This will cause rtmps outputs with
     * self-signed certificates to fail.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SELF_SIGNED, VERIFY_AUTHENTICITY
     *
     * @param certificateMode If set to verifyAuthenticity, verify the tls
     *            certificate chain to a trusted Certificate Authority (CA).
     *            This will cause rtmps outputs with self-signed certificates to
     *            fail.
     * @see RtmpOutputCertificateMode
     */
    public void setCertificateMode(String certificateMode) {
        this.certificateMode = certificateMode;
    }

    /**
     * If set to verifyAuthenticity, verify the tls certificate chain to a
     * trusted Certificate Authority (CA). This will cause rtmps outputs with
     * self-signed certificates to fail.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SELF_SIGNED, VERIFY_AUTHENTICITY
     *
     * @param certificateMode If set to verifyAuthenticity, verify the tls
     *            certificate chain to a trusted Certificate Authority (CA).
     *            This will cause rtmps outputs with self-signed certificates to
     *            fail.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RtmpOutputCertificateMode
     */
    public RtmpOutputSettings withCertificateMode(String certificateMode) {
        this.certificateMode = certificateMode;
        return this;
    }

    /**
     * If set to verifyAuthenticity, verify the tls certificate chain to a
     * trusted Certificate Authority (CA). This will cause rtmps outputs with
     * self-signed certificates to fail.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SELF_SIGNED, VERIFY_AUTHENTICITY
     *
     * @param certificateMode If set to verifyAuthenticity, verify the tls
     *            certificate chain to a trusted Certificate Authority (CA).
     *            This will cause rtmps outputs with self-signed certificates to
     *            fail.
     * @see RtmpOutputCertificateMode
     */
    public void setCertificateMode(RtmpOutputCertificateMode certificateMode) {
        this.certificateMode = certificateMode.toString();
    }

    /**
     * If set to verifyAuthenticity, verify the tls certificate chain to a
     * trusted Certificate Authority (CA). This will cause rtmps outputs with
     * self-signed certificates to fail.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SELF_SIGNED, VERIFY_AUTHENTICITY
     *
     * @param certificateMode If set to verifyAuthenticity, verify the tls
     *            certificate chain to a trusted Certificate Authority (CA).
     *            This will cause rtmps outputs with self-signed certificates to
     *            fail.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RtmpOutputCertificateMode
     */
    public RtmpOutputSettings withCertificateMode(RtmpOutputCertificateMode certificateMode) {
        this.certificateMode = certificateMode.toString();
        return this;
    }

    /**
     * Number of seconds to wait before retrying a connection to the Flash Media
     * server if the connection is lost.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return Number of seconds to wait before retrying a connection to the
     *         Flash Media server if the connection is lost.
     */
    public Integer getConnectionRetryInterval() {
        return connectionRetryInterval;
    }

    /**
     * Number of seconds to wait before retrying a connection to the Flash Media
     * server if the connection is lost.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param connectionRetryInterval Number of seconds to wait before retrying
     *            a connection to the Flash Media server if the connection is
     *            lost.
     */
    public void setConnectionRetryInterval(Integer connectionRetryInterval) {
        this.connectionRetryInterval = connectionRetryInterval;
    }

    /**
     * Number of seconds to wait before retrying a connection to the Flash Media
     * server if the connection is lost.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param connectionRetryInterval Number of seconds to wait before retrying
     *            a connection to the Flash Media server if the connection is
     *            lost.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RtmpOutputSettings withConnectionRetryInterval(Integer connectionRetryInterval) {
        this.connectionRetryInterval = connectionRetryInterval;
        return this;
    }

    /**
     * The RTMP endpoint excluding the stream name (eg. rtmp://host/appname).
     * For connection to Akamai, a username and password must be supplied. URI
     * fields accept format identifiers.
     *
     * @return The RTMP endpoint excluding the stream name (eg.
     *         rtmp://host/appname). For connection to Akamai, a username and
     *         password must be supplied. URI fields accept format identifiers.
     */
    public OutputLocationRef getDestination() {
        return destination;
    }

    /**
     * The RTMP endpoint excluding the stream name (eg. rtmp://host/appname).
     * For connection to Akamai, a username and password must be supplied. URI
     * fields accept format identifiers.
     *
     * @param destination The RTMP endpoint excluding the stream name (eg.
     *            rtmp://host/appname). For connection to Akamai, a username and
     *            password must be supplied. URI fields accept format
     *            identifiers.
     */
    public void setDestination(OutputLocationRef destination) {
        this.destination = destination;
    }

    /**
     * The RTMP endpoint excluding the stream name (eg. rtmp://host/appname).
     * For connection to Akamai, a username and password must be supplied. URI
     * fields accept format identifiers.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param destination The RTMP endpoint excluding the stream name (eg.
     *            rtmp://host/appname). For connection to Akamai, a username and
     *            password must be supplied. URI fields accept format
     *            identifiers.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RtmpOutputSettings withDestination(OutputLocationRef destination) {
        this.destination = destination;
        return this;
    }

    /**
     * Number of retry attempts.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return Number of retry attempts.
     */
    public Integer getNumRetries() {
        return numRetries;
    }

    /**
     * Number of retry attempts.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param numRetries Number of retry attempts.
     */
    public void setNumRetries(Integer numRetries) {
        this.numRetries = numRetries;
    }

    /**
     * Number of retry attempts.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param numRetries Number of retry attempts.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RtmpOutputSettings withNumRetries(Integer numRetries) {
        this.numRetries = numRetries;
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
        if (getCertificateMode() != null)
            sb.append("CertificateMode: " + getCertificateMode() + ",");
        if (getConnectionRetryInterval() != null)
            sb.append("ConnectionRetryInterval: " + getConnectionRetryInterval() + ",");
        if (getDestination() != null)
            sb.append("Destination: " + getDestination() + ",");
        if (getNumRetries() != null)
            sb.append("NumRetries: " + getNumRetries());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCertificateMode() == null) ? 0 : getCertificateMode().hashCode());
        hashCode = prime
                * hashCode
                + ((getConnectionRetryInterval() == null) ? 0 : getConnectionRetryInterval()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getDestination() == null) ? 0 : getDestination().hashCode());
        hashCode = prime * hashCode + ((getNumRetries() == null) ? 0 : getNumRetries().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RtmpOutputSettings == false)
            return false;
        RtmpOutputSettings other = (RtmpOutputSettings) obj;

        if (other.getCertificateMode() == null ^ this.getCertificateMode() == null)
            return false;
        if (other.getCertificateMode() != null
                && other.getCertificateMode().equals(this.getCertificateMode()) == false)
            return false;
        if (other.getConnectionRetryInterval() == null ^ this.getConnectionRetryInterval() == null)
            return false;
        if (other.getConnectionRetryInterval() != null
                && other.getConnectionRetryInterval().equals(this.getConnectionRetryInterval()) == false)
            return false;
        if (other.getDestination() == null ^ this.getDestination() == null)
            return false;
        if (other.getDestination() != null
                && other.getDestination().equals(this.getDestination()) == false)
            return false;
        if (other.getNumRetries() == null ^ this.getNumRetries() == null)
            return false;
        if (other.getNumRetries() != null
                && other.getNumRetries().equals(this.getNumRetries()) == false)
            return false;
        return true;
    }
}
