/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

public class DescribeRoutingProfileResult implements Serializable {
    /**
     * <p>
     * The routing profile.
     * </p>
     */
    private RoutingProfile routingProfile;

    /**
     * <p>
     * The routing profile.
     * </p>
     *
     * @return <p>
     *         The routing profile.
     *         </p>
     */
    public RoutingProfile getRoutingProfile() {
        return routingProfile;
    }

    /**
     * <p>
     * The routing profile.
     * </p>
     *
     * @param routingProfile <p>
     *            The routing profile.
     *            </p>
     */
    public void setRoutingProfile(RoutingProfile routingProfile) {
        this.routingProfile = routingProfile;
    }

    /**
     * <p>
     * The routing profile.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param routingProfile <p>
     *            The routing profile.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeRoutingProfileResult withRoutingProfile(RoutingProfile routingProfile) {
        this.routingProfile = routingProfile;
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
        if (getRoutingProfile() != null)
            sb.append("RoutingProfile: " + getRoutingProfile());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getRoutingProfile() == null) ? 0 : getRoutingProfile().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeRoutingProfileResult == false)
            return false;
        DescribeRoutingProfileResult other = (DescribeRoutingProfileResult) obj;

        if (other.getRoutingProfile() == null ^ this.getRoutingProfile() == null)
            return false;
        if (other.getRoutingProfile() != null
                && other.getRoutingProfile().equals(this.getRoutingProfile()) == false)
            return false;
        return true;
    }
}
