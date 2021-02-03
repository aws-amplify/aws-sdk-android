/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

/**
 * <p>
 * An object that contains information about a server certificate.
 * </p>
 */
public class ServerCertificateSummary implements Serializable {
    /**
     * <p>
     * The ARN of the server certificate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern:
     * </b>arn:aws(-cn|-us-gov|-iso-b|-iso)?:acm:[a-z]{2}-(gov-|iso-|
     * isob-)?[a-z]{4,9}-\d{1}:\d{12}:certificate/[a-zA-Z0-9/-]+<br/>
     */
    private String serverCertificateArn;

    /**
     * <p>
     * The status of the server certificate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INVALID, VALID
     */
    private String serverCertificateStatus;

    /**
     * <p>
     * Details that explain the status of the server certificate.
     * </p>
     */
    private String serverCertificateStatusDetail;

    /**
     * <p>
     * The ARN of the server certificate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern:
     * </b>arn:aws(-cn|-us-gov|-iso-b|-iso)?:acm:[a-z]{2}-(gov-|iso-|
     * isob-)?[a-z]{4,9}-\d{1}:\d{12}:certificate/[a-zA-Z0-9/-]+<br/>
     *
     * @return <p>
     *         The ARN of the server certificate.
     *         </p>
     */
    public String getServerCertificateArn() {
        return serverCertificateArn;
    }

    /**
     * <p>
     * The ARN of the server certificate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern:
     * </b>arn:aws(-cn|-us-gov|-iso-b|-iso)?:acm:[a-z]{2}-(gov-|iso-|
     * isob-)?[a-z]{4,9}-\d{1}:\d{12}:certificate/[a-zA-Z0-9/-]+<br/>
     *
     * @param serverCertificateArn <p>
     *            The ARN of the server certificate.
     *            </p>
     */
    public void setServerCertificateArn(String serverCertificateArn) {
        this.serverCertificateArn = serverCertificateArn;
    }

    /**
     * <p>
     * The ARN of the server certificate.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern:
     * </b>arn:aws(-cn|-us-gov|-iso-b|-iso)?:acm:[a-z]{2}-(gov-|iso-|
     * isob-)?[a-z]{4,9}-\d{1}:\d{12}:certificate/[a-zA-Z0-9/-]+<br/>
     *
     * @param serverCertificateArn <p>
     *            The ARN of the server certificate.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ServerCertificateSummary withServerCertificateArn(String serverCertificateArn) {
        this.serverCertificateArn = serverCertificateArn;
        return this;
    }

    /**
     * <p>
     * The status of the server certificate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INVALID, VALID
     *
     * @return <p>
     *         The status of the server certificate.
     *         </p>
     * @see ServerCertificateStatus
     */
    public String getServerCertificateStatus() {
        return serverCertificateStatus;
    }

    /**
     * <p>
     * The status of the server certificate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INVALID, VALID
     *
     * @param serverCertificateStatus <p>
     *            The status of the server certificate.
     *            </p>
     * @see ServerCertificateStatus
     */
    public void setServerCertificateStatus(String serverCertificateStatus) {
        this.serverCertificateStatus = serverCertificateStatus;
    }

    /**
     * <p>
     * The status of the server certificate.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INVALID, VALID
     *
     * @param serverCertificateStatus <p>
     *            The status of the server certificate.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ServerCertificateStatus
     */
    public ServerCertificateSummary withServerCertificateStatus(String serverCertificateStatus) {
        this.serverCertificateStatus = serverCertificateStatus;
        return this;
    }

    /**
     * <p>
     * The status of the server certificate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INVALID, VALID
     *
     * @param serverCertificateStatus <p>
     *            The status of the server certificate.
     *            </p>
     * @see ServerCertificateStatus
     */
    public void setServerCertificateStatus(ServerCertificateStatus serverCertificateStatus) {
        this.serverCertificateStatus = serverCertificateStatus.toString();
    }

    /**
     * <p>
     * The status of the server certificate.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INVALID, VALID
     *
     * @param serverCertificateStatus <p>
     *            The status of the server certificate.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ServerCertificateStatus
     */
    public ServerCertificateSummary withServerCertificateStatus(
            ServerCertificateStatus serverCertificateStatus) {
        this.serverCertificateStatus = serverCertificateStatus.toString();
        return this;
    }

    /**
     * <p>
     * Details that explain the status of the server certificate.
     * </p>
     *
     * @return <p>
     *         Details that explain the status of the server certificate.
     *         </p>
     */
    public String getServerCertificateStatusDetail() {
        return serverCertificateStatusDetail;
    }

    /**
     * <p>
     * Details that explain the status of the server certificate.
     * </p>
     *
     * @param serverCertificateStatusDetail <p>
     *            Details that explain the status of the server certificate.
     *            </p>
     */
    public void setServerCertificateStatusDetail(String serverCertificateStatusDetail) {
        this.serverCertificateStatusDetail = serverCertificateStatusDetail;
    }

    /**
     * <p>
     * Details that explain the status of the server certificate.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serverCertificateStatusDetail <p>
     *            Details that explain the status of the server certificate.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ServerCertificateSummary withServerCertificateStatusDetail(
            String serverCertificateStatusDetail) {
        this.serverCertificateStatusDetail = serverCertificateStatusDetail;
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
        if (getServerCertificateArn() != null)
            sb.append("serverCertificateArn: " + getServerCertificateArn() + ",");
        if (getServerCertificateStatus() != null)
            sb.append("serverCertificateStatus: " + getServerCertificateStatus() + ",");
        if (getServerCertificateStatusDetail() != null)
            sb.append("serverCertificateStatusDetail: " + getServerCertificateStatusDetail());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getServerCertificateArn() == null) ? 0 : getServerCertificateArn().hashCode());
        hashCode = prime
                * hashCode
                + ((getServerCertificateStatus() == null) ? 0 : getServerCertificateStatus()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getServerCertificateStatusDetail() == null) ? 0
                        : getServerCertificateStatusDetail().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ServerCertificateSummary == false)
            return false;
        ServerCertificateSummary other = (ServerCertificateSummary) obj;

        if (other.getServerCertificateArn() == null ^ this.getServerCertificateArn() == null)
            return false;
        if (other.getServerCertificateArn() != null
                && other.getServerCertificateArn().equals(this.getServerCertificateArn()) == false)
            return false;
        if (other.getServerCertificateStatus() == null ^ this.getServerCertificateStatus() == null)
            return false;
        if (other.getServerCertificateStatus() != null
                && other.getServerCertificateStatus().equals(this.getServerCertificateStatus()) == false)
            return false;
        if (other.getServerCertificateStatusDetail() == null
                ^ this.getServerCertificateStatusDetail() == null)
            return false;
        if (other.getServerCertificateStatusDetail() != null
                && other.getServerCertificateStatusDetail().equals(
                        this.getServerCertificateStatusDetail()) == false)
            return false;
        return true;
    }
}
