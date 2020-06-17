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

package com.amazonaws.services.route53.model;

import java.io.Serializable;

/**
 * <p>
 * A complex type that contain the response to a <code>GetHostedZone</code>
 * request.
 * </p>
 */
public class GetHostedZoneResult implements Serializable {
    /**
     * <p>
     * A complex type that contains general information about the specified
     * hosted zone.
     * </p>
     */
    private HostedZone hostedZone;

    /**
     * <p>
     * A complex type that lists the Amazon Route 53 name servers for the
     * specified hosted zone.
     * </p>
     */
    private DelegationSet delegationSet;

    /**
     * <p>
     * A complex type that contains information about the VPCs that are
     * associated with the specified hosted zone.
     * </p>
     */
    private java.util.List<VPC> vPCs;

    /**
     * <p>
     * A complex type that contains general information about the specified
     * hosted zone.
     * </p>
     *
     * @return <p>
     *         A complex type that contains general information about the
     *         specified hosted zone.
     *         </p>
     */
    public HostedZone getHostedZone() {
        return hostedZone;
    }

    /**
     * <p>
     * A complex type that contains general information about the specified
     * hosted zone.
     * </p>
     *
     * @param hostedZone <p>
     *            A complex type that contains general information about the
     *            specified hosted zone.
     *            </p>
     */
    public void setHostedZone(HostedZone hostedZone) {
        this.hostedZone = hostedZone;
    }

    /**
     * <p>
     * A complex type that contains general information about the specified
     * hosted zone.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hostedZone <p>
     *            A complex type that contains general information about the
     *            specified hosted zone.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetHostedZoneResult withHostedZone(HostedZone hostedZone) {
        this.hostedZone = hostedZone;
        return this;
    }

    /**
     * <p>
     * A complex type that lists the Amazon Route 53 name servers for the
     * specified hosted zone.
     * </p>
     *
     * @return <p>
     *         A complex type that lists the Amazon Route 53 name servers for
     *         the specified hosted zone.
     *         </p>
     */
    public DelegationSet getDelegationSet() {
        return delegationSet;
    }

    /**
     * <p>
     * A complex type that lists the Amazon Route 53 name servers for the
     * specified hosted zone.
     * </p>
     *
     * @param delegationSet <p>
     *            A complex type that lists the Amazon Route 53 name servers for
     *            the specified hosted zone.
     *            </p>
     */
    public void setDelegationSet(DelegationSet delegationSet) {
        this.delegationSet = delegationSet;
    }

    /**
     * <p>
     * A complex type that lists the Amazon Route 53 name servers for the
     * specified hosted zone.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param delegationSet <p>
     *            A complex type that lists the Amazon Route 53 name servers for
     *            the specified hosted zone.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetHostedZoneResult withDelegationSet(DelegationSet delegationSet) {
        this.delegationSet = delegationSet;
        return this;
    }

    /**
     * <p>
     * A complex type that contains information about the VPCs that are
     * associated with the specified hosted zone.
     * </p>
     *
     * @return <p>
     *         A complex type that contains information about the VPCs that are
     *         associated with the specified hosted zone.
     *         </p>
     */
    public java.util.List<VPC> getVPCs() {
        return vPCs;
    }

    /**
     * <p>
     * A complex type that contains information about the VPCs that are
     * associated with the specified hosted zone.
     * </p>
     *
     * @param vPCs <p>
     *            A complex type that contains information about the VPCs that
     *            are associated with the specified hosted zone.
     *            </p>
     */
    public void setVPCs(java.util.Collection<VPC> vPCs) {
        if (vPCs == null) {
            this.vPCs = null;
            return;
        }

        this.vPCs = new java.util.ArrayList<VPC>(vPCs);
    }

    /**
     * <p>
     * A complex type that contains information about the VPCs that are
     * associated with the specified hosted zone.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vPCs <p>
     *            A complex type that contains information about the VPCs that
     *            are associated with the specified hosted zone.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetHostedZoneResult withVPCs(VPC... vPCs) {
        if (getVPCs() == null) {
            this.vPCs = new java.util.ArrayList<VPC>(vPCs.length);
        }
        for (VPC value : vPCs) {
            this.vPCs.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A complex type that contains information about the VPCs that are
     * associated with the specified hosted zone.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vPCs <p>
     *            A complex type that contains information about the VPCs that
     *            are associated with the specified hosted zone.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetHostedZoneResult withVPCs(java.util.Collection<VPC> vPCs) {
        setVPCs(vPCs);
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
        if (getHostedZone() != null)
            sb.append("HostedZone: " + getHostedZone() + ",");
        if (getDelegationSet() != null)
            sb.append("DelegationSet: " + getDelegationSet() + ",");
        if (getVPCs() != null)
            sb.append("VPCs: " + getVPCs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHostedZone() == null) ? 0 : getHostedZone().hashCode());
        hashCode = prime * hashCode
                + ((getDelegationSet() == null) ? 0 : getDelegationSet().hashCode());
        hashCode = prime * hashCode + ((getVPCs() == null) ? 0 : getVPCs().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetHostedZoneResult == false)
            return false;
        GetHostedZoneResult other = (GetHostedZoneResult) obj;

        if (other.getHostedZone() == null ^ this.getHostedZone() == null)
            return false;
        if (other.getHostedZone() != null
                && other.getHostedZone().equals(this.getHostedZone()) == false)
            return false;
        if (other.getDelegationSet() == null ^ this.getDelegationSet() == null)
            return false;
        if (other.getDelegationSet() != null
                && other.getDelegationSet().equals(this.getDelegationSet()) == false)
            return false;
        if (other.getVPCs() == null ^ this.getVPCs() == null)
            return false;
        if (other.getVPCs() != null && other.getVPCs().equals(this.getVPCs()) == false)
            return false;
        return true;
    }
}
