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

package com.amazonaws.services.guardduty.model;

import java.io.Serializable;

/**
 * <p>
 * Contains information about the port probe details.
 * </p>
 */
public class PortProbeDetail implements Serializable {
    /**
     * <p>
     * The local port information of the connection.
     * </p>
     */
    private LocalPortDetails localPortDetails;

    /**
     * <p>
     * The local IP information of the connection.
     * </p>
     */
    private LocalIpDetails localIpDetails;

    /**
     * <p>
     * The remote IP information of the connection.
     * </p>
     */
    private RemoteIpDetails remoteIpDetails;

    /**
     * <p>
     * The local port information of the connection.
     * </p>
     *
     * @return <p>
     *         The local port information of the connection.
     *         </p>
     */
    public LocalPortDetails getLocalPortDetails() {
        return localPortDetails;
    }

    /**
     * <p>
     * The local port information of the connection.
     * </p>
     *
     * @param localPortDetails <p>
     *            The local port information of the connection.
     *            </p>
     */
    public void setLocalPortDetails(LocalPortDetails localPortDetails) {
        this.localPortDetails = localPortDetails;
    }

    /**
     * <p>
     * The local port information of the connection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param localPortDetails <p>
     *            The local port information of the connection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PortProbeDetail withLocalPortDetails(LocalPortDetails localPortDetails) {
        this.localPortDetails = localPortDetails;
        return this;
    }

    /**
     * <p>
     * The local IP information of the connection.
     * </p>
     *
     * @return <p>
     *         The local IP information of the connection.
     *         </p>
     */
    public LocalIpDetails getLocalIpDetails() {
        return localIpDetails;
    }

    /**
     * <p>
     * The local IP information of the connection.
     * </p>
     *
     * @param localIpDetails <p>
     *            The local IP information of the connection.
     *            </p>
     */
    public void setLocalIpDetails(LocalIpDetails localIpDetails) {
        this.localIpDetails = localIpDetails;
    }

    /**
     * <p>
     * The local IP information of the connection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param localIpDetails <p>
     *            The local IP information of the connection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PortProbeDetail withLocalIpDetails(LocalIpDetails localIpDetails) {
        this.localIpDetails = localIpDetails;
        return this;
    }

    /**
     * <p>
     * The remote IP information of the connection.
     * </p>
     *
     * @return <p>
     *         The remote IP information of the connection.
     *         </p>
     */
    public RemoteIpDetails getRemoteIpDetails() {
        return remoteIpDetails;
    }

    /**
     * <p>
     * The remote IP information of the connection.
     * </p>
     *
     * @param remoteIpDetails <p>
     *            The remote IP information of the connection.
     *            </p>
     */
    public void setRemoteIpDetails(RemoteIpDetails remoteIpDetails) {
        this.remoteIpDetails = remoteIpDetails;
    }

    /**
     * <p>
     * The remote IP information of the connection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param remoteIpDetails <p>
     *            The remote IP information of the connection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PortProbeDetail withRemoteIpDetails(RemoteIpDetails remoteIpDetails) {
        this.remoteIpDetails = remoteIpDetails;
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
        if (getLocalPortDetails() != null)
            sb.append("LocalPortDetails: " + getLocalPortDetails() + ",");
        if (getLocalIpDetails() != null)
            sb.append("LocalIpDetails: " + getLocalIpDetails() + ",");
        if (getRemoteIpDetails() != null)
            sb.append("RemoteIpDetails: " + getRemoteIpDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getLocalPortDetails() == null) ? 0 : getLocalPortDetails().hashCode());
        hashCode = prime * hashCode
                + ((getLocalIpDetails() == null) ? 0 : getLocalIpDetails().hashCode());
        hashCode = prime * hashCode
                + ((getRemoteIpDetails() == null) ? 0 : getRemoteIpDetails().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PortProbeDetail == false)
            return false;
        PortProbeDetail other = (PortProbeDetail) obj;

        if (other.getLocalPortDetails() == null ^ this.getLocalPortDetails() == null)
            return false;
        if (other.getLocalPortDetails() != null
                && other.getLocalPortDetails().equals(this.getLocalPortDetails()) == false)
            return false;
        if (other.getLocalIpDetails() == null ^ this.getLocalIpDetails() == null)
            return false;
        if (other.getLocalIpDetails() != null
                && other.getLocalIpDetails().equals(this.getLocalIpDetails()) == false)
            return false;
        if (other.getRemoteIpDetails() == null ^ this.getRemoteIpDetails() == null)
            return false;
        if (other.getRemoteIpDetails() != null
                && other.getRemoteIpDetails().equals(this.getRemoteIpDetails()) == false)
            return false;
        return true;
    }
}
