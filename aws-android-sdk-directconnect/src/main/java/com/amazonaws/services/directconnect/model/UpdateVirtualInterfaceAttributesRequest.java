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

package com.amazonaws.services.directconnect.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates the specified attributes of the specified virtual private interface.
 * </p>
 * <p>
 * Setting the MTU of a virtual interface to 9001 (jumbo frames) can cause an
 * update to the underlying physical connection if it wasn't updated to support
 * jumbo frames. Updating the connection disrupts network connectivity for all
 * virtual interfaces associated with the connection for up to 30 seconds. To
 * check whether your connection supports jumbo frames, call
 * <a>DescribeConnections</a>. To check whether your virtual q interface
 * supports jumbo frames, call <a>DescribeVirtualInterfaces</a>.
 * </p>
 */
public class UpdateVirtualInterfaceAttributesRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The ID of the virtual private interface.
     * </p>
     */
    private String virtualInterfaceId;

    /**
     * <p>
     * The maximum transmission unit (MTU), in bytes. The supported values are
     * 1500 and 9001. The default value is 1500.
     * </p>
     */
    private Integer mtu;

    /**
     * <p>
     * The ID of the virtual private interface.
     * </p>
     *
     * @return <p>
     *         The ID of the virtual private interface.
     *         </p>
     */
    public String getVirtualInterfaceId() {
        return virtualInterfaceId;
    }

    /**
     * <p>
     * The ID of the virtual private interface.
     * </p>
     *
     * @param virtualInterfaceId <p>
     *            The ID of the virtual private interface.
     *            </p>
     */
    public void setVirtualInterfaceId(String virtualInterfaceId) {
        this.virtualInterfaceId = virtualInterfaceId;
    }

    /**
     * <p>
     * The ID of the virtual private interface.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param virtualInterfaceId <p>
     *            The ID of the virtual private interface.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateVirtualInterfaceAttributesRequest withVirtualInterfaceId(String virtualInterfaceId) {
        this.virtualInterfaceId = virtualInterfaceId;
        return this;
    }

    /**
     * <p>
     * The maximum transmission unit (MTU), in bytes. The supported values are
     * 1500 and 9001. The default value is 1500.
     * </p>
     *
     * @return <p>
     *         The maximum transmission unit (MTU), in bytes. The supported
     *         values are 1500 and 9001. The default value is 1500.
     *         </p>
     */
    public Integer getMtu() {
        return mtu;
    }

    /**
     * <p>
     * The maximum transmission unit (MTU), in bytes. The supported values are
     * 1500 and 9001. The default value is 1500.
     * </p>
     *
     * @param mtu <p>
     *            The maximum transmission unit (MTU), in bytes. The supported
     *            values are 1500 and 9001. The default value is 1500.
     *            </p>
     */
    public void setMtu(Integer mtu) {
        this.mtu = mtu;
    }

    /**
     * <p>
     * The maximum transmission unit (MTU), in bytes. The supported values are
     * 1500 and 9001. The default value is 1500.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param mtu <p>
     *            The maximum transmission unit (MTU), in bytes. The supported
     *            values are 1500 and 9001. The default value is 1500.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateVirtualInterfaceAttributesRequest withMtu(Integer mtu) {
        this.mtu = mtu;
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
        if (getVirtualInterfaceId() != null)
            sb.append("virtualInterfaceId: " + getVirtualInterfaceId() + ",");
        if (getMtu() != null)
            sb.append("mtu: " + getMtu());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getVirtualInterfaceId() == null) ? 0 : getVirtualInterfaceId().hashCode());
        hashCode = prime * hashCode + ((getMtu() == null) ? 0 : getMtu().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateVirtualInterfaceAttributesRequest == false)
            return false;
        UpdateVirtualInterfaceAttributesRequest other = (UpdateVirtualInterfaceAttributesRequest) obj;

        if (other.getVirtualInterfaceId() == null ^ this.getVirtualInterfaceId() == null)
            return false;
        if (other.getVirtualInterfaceId() != null
                && other.getVirtualInterfaceId().equals(this.getVirtualInterfaceId()) == false)
            return false;
        if (other.getMtu() == null ^ this.getMtu() == null)
            return false;
        if (other.getMtu() != null && other.getMtu().equals(this.getMtu()) == false)
            return false;
        return true;
    }
}
