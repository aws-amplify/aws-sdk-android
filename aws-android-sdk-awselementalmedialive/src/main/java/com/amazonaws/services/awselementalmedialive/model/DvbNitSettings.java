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
 * DVB Network Information Table (NIT)
 */
public class DvbNitSettings implements Serializable {
    /**
     * The numeric value placed in the Network Information Table (NIT).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 65536<br/>
     */
    private Integer networkId;

    /**
     * The network name text placed in the networkNameDescriptor inside the
     * Network Information Table. Maximum length is 256 characters.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String networkName;

    /**
     * The number of milliseconds between instances of this table in the output
     * transport stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>25 - 10000<br/>
     */
    private Integer repInterval;

    /**
     * The numeric value placed in the Network Information Table (NIT).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 65536<br/>
     *
     * @return The numeric value placed in the Network Information Table (NIT).
     */
    public Integer getNetworkId() {
        return networkId;
    }

    /**
     * The numeric value placed in the Network Information Table (NIT).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 65536<br/>
     *
     * @param networkId The numeric value placed in the Network Information
     *            Table (NIT).
     */
    public void setNetworkId(Integer networkId) {
        this.networkId = networkId;
    }

    /**
     * The numeric value placed in the Network Information Table (NIT).
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 65536<br/>
     *
     * @param networkId The numeric value placed in the Network Information
     *            Table (NIT).
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DvbNitSettings withNetworkId(Integer networkId) {
        this.networkId = networkId;
        return this;
    }

    /**
     * The network name text placed in the networkNameDescriptor inside the
     * Network Information Table. Maximum length is 256 characters.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return The network name text placed in the networkNameDescriptor inside
     *         the Network Information Table. Maximum length is 256 characters.
     */
    public String getNetworkName() {
        return networkName;
    }

    /**
     * The network name text placed in the networkNameDescriptor inside the
     * Network Information Table. Maximum length is 256 characters.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param networkName The network name text placed in the
     *            networkNameDescriptor inside the Network Information Table.
     *            Maximum length is 256 characters.
     */
    public void setNetworkName(String networkName) {
        this.networkName = networkName;
    }

    /**
     * The network name text placed in the networkNameDescriptor inside the
     * Network Information Table. Maximum length is 256 characters.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param networkName The network name text placed in the
     *            networkNameDescriptor inside the Network Information Table.
     *            Maximum length is 256 characters.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DvbNitSettings withNetworkName(String networkName) {
        this.networkName = networkName;
        return this;
    }

    /**
     * The number of milliseconds between instances of this table in the output
     * transport stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>25 - 10000<br/>
     *
     * @return The number of milliseconds between instances of this table in the
     *         output transport stream.
     */
    public Integer getRepInterval() {
        return repInterval;
    }

    /**
     * The number of milliseconds between instances of this table in the output
     * transport stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>25 - 10000<br/>
     *
     * @param repInterval The number of milliseconds between instances of this
     *            table in the output transport stream.
     */
    public void setRepInterval(Integer repInterval) {
        this.repInterval = repInterval;
    }

    /**
     * The number of milliseconds between instances of this table in the output
     * transport stream.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>25 - 10000<br/>
     *
     * @param repInterval The number of milliseconds between instances of this
     *            table in the output transport stream.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DvbNitSettings withRepInterval(Integer repInterval) {
        this.repInterval = repInterval;
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
        if (getNetworkId() != null)
            sb.append("NetworkId: " + getNetworkId() + ",");
        if (getNetworkName() != null)
            sb.append("NetworkName: " + getNetworkName() + ",");
        if (getRepInterval() != null)
            sb.append("RepInterval: " + getRepInterval());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNetworkId() == null) ? 0 : getNetworkId().hashCode());
        hashCode = prime * hashCode
                + ((getNetworkName() == null) ? 0 : getNetworkName().hashCode());
        hashCode = prime * hashCode
                + ((getRepInterval() == null) ? 0 : getRepInterval().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DvbNitSettings == false)
            return false;
        DvbNitSettings other = (DvbNitSettings) obj;

        if (other.getNetworkId() == null ^ this.getNetworkId() == null)
            return false;
        if (other.getNetworkId() != null
                && other.getNetworkId().equals(this.getNetworkId()) == false)
            return false;
        if (other.getNetworkName() == null ^ this.getNetworkName() == null)
            return false;
        if (other.getNetworkName() != null
                && other.getNetworkName().equals(this.getNetworkName()) == false)
            return false;
        if (other.getRepInterval() == null ^ this.getRepInterval() == null)
            return false;
        if (other.getRepInterval() != null
                && other.getRepInterval().equals(this.getRepInterval()) == false)
            return false;
        return true;
    }
}
