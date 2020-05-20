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

package com.amazonaws.services.medialive.model;

import java.io.Serializable;

/**
 * Multiplex MediaConnect output destination settings.
 */
public class MultiplexMediaConnectOutputDestinationSettings implements Serializable {
    /**
     * The MediaConnect entitlement ARN available as a Flow source.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String entitlementArn;

    /**
     * The MediaConnect entitlement ARN available as a Flow source.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return The MediaConnect entitlement ARN available as a Flow source.
     */
    public String getEntitlementArn() {
        return entitlementArn;
    }

    /**
     * The MediaConnect entitlement ARN available as a Flow source.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param entitlementArn The MediaConnect entitlement ARN available as a
     *            Flow source.
     */
    public void setEntitlementArn(String entitlementArn) {
        this.entitlementArn = entitlementArn;
    }

    /**
     * The MediaConnect entitlement ARN available as a Flow source.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param entitlementArn The MediaConnect entitlement ARN available as a
     *            Flow source.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MultiplexMediaConnectOutputDestinationSettings withEntitlementArn(String entitlementArn) {
        this.entitlementArn = entitlementArn;
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
        if (getEntitlementArn() != null)
            sb.append("EntitlementArn: " + getEntitlementArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getEntitlementArn() == null) ? 0 : getEntitlementArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MultiplexMediaConnectOutputDestinationSettings == false)
            return false;
        MultiplexMediaConnectOutputDestinationSettings other = (MultiplexMediaConnectOutputDestinationSettings) obj;

        if (other.getEntitlementArn() == null ^ this.getEntitlementArn() == null)
            return false;
        if (other.getEntitlementArn() != null
                && other.getEntitlementArn().equals(this.getEntitlementArn()) == false)
            return false;
        return true;
    }
}
