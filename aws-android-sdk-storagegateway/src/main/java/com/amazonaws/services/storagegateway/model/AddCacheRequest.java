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

package com.amazonaws.services.storagegateway.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Configures one or more gateway local disks as cache for a gateway. This
 * operation is only supported in the cached volume, tape, and file gateway type
 * (see <a href=
 * "https://docs.aws.amazon.com/storagegateway/latest/userguide/StorageGatewayConcepts.html"
 * >How AWS Storage Gateway works (architecture)</a>.
 * </p>
 * <p>
 * In the request, you specify the gateway Amazon Resource Name (ARN) to which
 * you want to add cache, and one or more disk IDs that you want to configure as
 * cache.
 * </p>
 */
public class AddCacheRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the gateway. Use the
     * <a>ListGateways</a> operation to return a list of gateways for your
     * account and AWS Region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     */
    private String gatewayARN;

    /**
     * <p>
     * An array of strings that identify disks that are to be configured as
     * working storage. Each string has a minimum length of 1 and maximum length
     * of 300. You can get the disk IDs from the <a>ListLocalDisks</a> API.
     * </p>
     */
    private java.util.List<String> diskIds;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the gateway. Use the
     * <a>ListGateways</a> operation to return a list of gateways for your
     * account and AWS Region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the gateway. Use the
     *         <a>ListGateways</a> operation to return a list of gateways for
     *         your account and AWS Region.
     *         </p>
     */
    public String getGatewayARN() {
        return gatewayARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the gateway. Use the
     * <a>ListGateways</a> operation to return a list of gateways for your
     * account and AWS Region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param gatewayARN <p>
     *            The Amazon Resource Name (ARN) of the gateway. Use the
     *            <a>ListGateways</a> operation to return a list of gateways for
     *            your account and AWS Region.
     *            </p>
     */
    public void setGatewayARN(String gatewayARN) {
        this.gatewayARN = gatewayARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the gateway. Use the
     * <a>ListGateways</a> operation to return a list of gateways for your
     * account and AWS Region.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param gatewayARN <p>
     *            The Amazon Resource Name (ARN) of the gateway. Use the
     *            <a>ListGateways</a> operation to return a list of gateways for
     *            your account and AWS Region.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AddCacheRequest withGatewayARN(String gatewayARN) {
        this.gatewayARN = gatewayARN;
        return this;
    }

    /**
     * <p>
     * An array of strings that identify disks that are to be configured as
     * working storage. Each string has a minimum length of 1 and maximum length
     * of 300. You can get the disk IDs from the <a>ListLocalDisks</a> API.
     * </p>
     *
     * @return <p>
     *         An array of strings that identify disks that are to be configured
     *         as working storage. Each string has a minimum length of 1 and
     *         maximum length of 300. You can get the disk IDs from the
     *         <a>ListLocalDisks</a> API.
     *         </p>
     */
    public java.util.List<String> getDiskIds() {
        return diskIds;
    }

    /**
     * <p>
     * An array of strings that identify disks that are to be configured as
     * working storage. Each string has a minimum length of 1 and maximum length
     * of 300. You can get the disk IDs from the <a>ListLocalDisks</a> API.
     * </p>
     *
     * @param diskIds <p>
     *            An array of strings that identify disks that are to be
     *            configured as working storage. Each string has a minimum
     *            length of 1 and maximum length of 300. You can get the disk
     *            IDs from the <a>ListLocalDisks</a> API.
     *            </p>
     */
    public void setDiskIds(java.util.Collection<String> diskIds) {
        if (diskIds == null) {
            this.diskIds = null;
            return;
        }

        this.diskIds = new java.util.ArrayList<String>(diskIds);
    }

    /**
     * <p>
     * An array of strings that identify disks that are to be configured as
     * working storage. Each string has a minimum length of 1 and maximum length
     * of 300. You can get the disk IDs from the <a>ListLocalDisks</a> API.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param diskIds <p>
     *            An array of strings that identify disks that are to be
     *            configured as working storage. Each string has a minimum
     *            length of 1 and maximum length of 300. You can get the disk
     *            IDs from the <a>ListLocalDisks</a> API.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AddCacheRequest withDiskIds(String... diskIds) {
        if (getDiskIds() == null) {
            this.diskIds = new java.util.ArrayList<String>(diskIds.length);
        }
        for (String value : diskIds) {
            this.diskIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of strings that identify disks that are to be configured as
     * working storage. Each string has a minimum length of 1 and maximum length
     * of 300. You can get the disk IDs from the <a>ListLocalDisks</a> API.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param diskIds <p>
     *            An array of strings that identify disks that are to be
     *            configured as working storage. Each string has a minimum
     *            length of 1 and maximum length of 300. You can get the disk
     *            IDs from the <a>ListLocalDisks</a> API.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AddCacheRequest withDiskIds(java.util.Collection<String> diskIds) {
        setDiskIds(diskIds);
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
        if (getGatewayARN() != null)
            sb.append("GatewayARN: " + getGatewayARN() + ",");
        if (getDiskIds() != null)
            sb.append("DiskIds: " + getDiskIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGatewayARN() == null) ? 0 : getGatewayARN().hashCode());
        hashCode = prime * hashCode + ((getDiskIds() == null) ? 0 : getDiskIds().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AddCacheRequest == false)
            return false;
        AddCacheRequest other = (AddCacheRequest) obj;

        if (other.getGatewayARN() == null ^ this.getGatewayARN() == null)
            return false;
        if (other.getGatewayARN() != null
                && other.getGatewayARN().equals(this.getGatewayARN()) == false)
            return false;
        if (other.getDiskIds() == null ^ this.getDiskIds() == null)
            return false;
        if (other.getDiskIds() != null && other.getDiskIds().equals(this.getDiskIds()) == false)
            return false;
        return true;
    }
}
