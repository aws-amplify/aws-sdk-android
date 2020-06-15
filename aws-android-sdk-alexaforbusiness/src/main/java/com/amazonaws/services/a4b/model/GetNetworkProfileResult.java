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

public class GetNetworkProfileResult implements Serializable {
    /**
     * <p>
     * The network profile associated with a device.
     * </p>
     */
    private NetworkProfile networkProfile;

    /**
     * <p>
     * The network profile associated with a device.
     * </p>
     *
     * @return <p>
     *         The network profile associated with a device.
     *         </p>
     */
    public NetworkProfile getNetworkProfile() {
        return networkProfile;
    }

    /**
     * <p>
     * The network profile associated with a device.
     * </p>
     *
     * @param networkProfile <p>
     *            The network profile associated with a device.
     *            </p>
     */
    public void setNetworkProfile(NetworkProfile networkProfile) {
        this.networkProfile = networkProfile;
    }

    /**
     * <p>
     * The network profile associated with a device.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param networkProfile <p>
     *            The network profile associated with a device.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetNetworkProfileResult withNetworkProfile(NetworkProfile networkProfile) {
        this.networkProfile = networkProfile;
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
        if (getNetworkProfile() != null)
            sb.append("NetworkProfile: " + getNetworkProfile());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getNetworkProfile() == null) ? 0 : getNetworkProfile().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetNetworkProfileResult == false)
            return false;
        GetNetworkProfileResult other = (GetNetworkProfileResult) obj;

        if (other.getNetworkProfile() == null ^ this.getNetworkProfile() == null)
            return false;
        if (other.getNetworkProfile() != null
                && other.getNetworkProfile().equals(this.getNetworkProfile()) == false)
            return false;
        return true;
    }
}
