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

package com.amazonaws.services.amazonroute53.model;

import java.io.Serializable;

/**
 * <p>
 * A complex type containing the response information for the hosted zone.
 * </p>
 */
public class CreateHostedZoneResult implements Serializable {
    /**
     * <p>
     * A complex type that contains general information about the hosted zone.
     * </p>
     */
    private HostedZone hostedZone;

    /**
     * <p>
     * A complex type that contains information about the
     * <code>CreateHostedZone</code> request.
     * </p>
     */
    private ChangeInfo changeInfo;

    /**
     * <p>
     * A complex type that describes the name servers for this hosted zone.
     * </p>
     */
    private DelegationSet delegationSet;

    /**
     * <p>
     * A complex type that contains information about an Amazon VPC that you
     * associated with this hosted zone.
     * </p>
     */
    private VPC vPC;

    /**
     * <p>
     * The unique URL representing the new hosted zone.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     */
    private String location;

    /**
     * <p>
     * A complex type that contains general information about the hosted zone.
     * </p>
     *
     * @return <p>
     *         A complex type that contains general information about the hosted
     *         zone.
     *         </p>
     */
    public HostedZone getHostedZone() {
        return hostedZone;
    }

    /**
     * <p>
     * A complex type that contains general information about the hosted zone.
     * </p>
     *
     * @param hostedZone <p>
     *            A complex type that contains general information about the
     *            hosted zone.
     *            </p>
     */
    public void setHostedZone(HostedZone hostedZone) {
        this.hostedZone = hostedZone;
    }

    /**
     * <p>
     * A complex type that contains general information about the hosted zone.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hostedZone <p>
     *            A complex type that contains general information about the
     *            hosted zone.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateHostedZoneResult withHostedZone(HostedZone hostedZone) {
        this.hostedZone = hostedZone;
        return this;
    }

    /**
     * <p>
     * A complex type that contains information about the
     * <code>CreateHostedZone</code> request.
     * </p>
     *
     * @return <p>
     *         A complex type that contains information about the
     *         <code>CreateHostedZone</code> request.
     *         </p>
     */
    public ChangeInfo getChangeInfo() {
        return changeInfo;
    }

    /**
     * <p>
     * A complex type that contains information about the
     * <code>CreateHostedZone</code> request.
     * </p>
     *
     * @param changeInfo <p>
     *            A complex type that contains information about the
     *            <code>CreateHostedZone</code> request.
     *            </p>
     */
    public void setChangeInfo(ChangeInfo changeInfo) {
        this.changeInfo = changeInfo;
    }

    /**
     * <p>
     * A complex type that contains information about the
     * <code>CreateHostedZone</code> request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param changeInfo <p>
     *            A complex type that contains information about the
     *            <code>CreateHostedZone</code> request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateHostedZoneResult withChangeInfo(ChangeInfo changeInfo) {
        this.changeInfo = changeInfo;
        return this;
    }

    /**
     * <p>
     * A complex type that describes the name servers for this hosted zone.
     * </p>
     *
     * @return <p>
     *         A complex type that describes the name servers for this hosted
     *         zone.
     *         </p>
     */
    public DelegationSet getDelegationSet() {
        return delegationSet;
    }

    /**
     * <p>
     * A complex type that describes the name servers for this hosted zone.
     * </p>
     *
     * @param delegationSet <p>
     *            A complex type that describes the name servers for this hosted
     *            zone.
     *            </p>
     */
    public void setDelegationSet(DelegationSet delegationSet) {
        this.delegationSet = delegationSet;
    }

    /**
     * <p>
     * A complex type that describes the name servers for this hosted zone.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param delegationSet <p>
     *            A complex type that describes the name servers for this hosted
     *            zone.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateHostedZoneResult withDelegationSet(DelegationSet delegationSet) {
        this.delegationSet = delegationSet;
        return this;
    }

    /**
     * <p>
     * A complex type that contains information about an Amazon VPC that you
     * associated with this hosted zone.
     * </p>
     *
     * @return <p>
     *         A complex type that contains information about an Amazon VPC that
     *         you associated with this hosted zone.
     *         </p>
     */
    public VPC getVPC() {
        return vPC;
    }

    /**
     * <p>
     * A complex type that contains information about an Amazon VPC that you
     * associated with this hosted zone.
     * </p>
     *
     * @param vPC <p>
     *            A complex type that contains information about an Amazon VPC
     *            that you associated with this hosted zone.
     *            </p>
     */
    public void setVPC(VPC vPC) {
        this.vPC = vPC;
    }

    /**
     * <p>
     * A complex type that contains information about an Amazon VPC that you
     * associated with this hosted zone.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vPC <p>
     *            A complex type that contains information about an Amazon VPC
     *            that you associated with this hosted zone.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateHostedZoneResult withVPC(VPC vPC) {
        this.vPC = vPC;
        return this;
    }

    /**
     * <p>
     * The unique URL representing the new hosted zone.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @return <p>
     *         The unique URL representing the new hosted zone.
     *         </p>
     */
    public String getLocation() {
        return location;
    }

    /**
     * <p>
     * The unique URL representing the new hosted zone.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param location <p>
     *            The unique URL representing the new hosted zone.
     *            </p>
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * <p>
     * The unique URL representing the new hosted zone.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param location <p>
     *            The unique URL representing the new hosted zone.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateHostedZoneResult withLocation(String location) {
        this.location = location;
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
        if (getChangeInfo() != null)
            sb.append("ChangeInfo: " + getChangeInfo() + ",");
        if (getDelegationSet() != null)
            sb.append("DelegationSet: " + getDelegationSet() + ",");
        if (getVPC() != null)
            sb.append("VPC: " + getVPC() + ",");
        if (getLocation() != null)
            sb.append("Location: " + getLocation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHostedZone() == null) ? 0 : getHostedZone().hashCode());
        hashCode = prime * hashCode + ((getChangeInfo() == null) ? 0 : getChangeInfo().hashCode());
        hashCode = prime * hashCode
                + ((getDelegationSet() == null) ? 0 : getDelegationSet().hashCode());
        hashCode = prime * hashCode + ((getVPC() == null) ? 0 : getVPC().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateHostedZoneResult == false)
            return false;
        CreateHostedZoneResult other = (CreateHostedZoneResult) obj;

        if (other.getHostedZone() == null ^ this.getHostedZone() == null)
            return false;
        if (other.getHostedZone() != null
                && other.getHostedZone().equals(this.getHostedZone()) == false)
            return false;
        if (other.getChangeInfo() == null ^ this.getChangeInfo() == null)
            return false;
        if (other.getChangeInfo() != null
                && other.getChangeInfo().equals(this.getChangeInfo()) == false)
            return false;
        if (other.getDelegationSet() == null ^ this.getDelegationSet() == null)
            return false;
        if (other.getDelegationSet() != null
                && other.getDelegationSet().equals(this.getDelegationSet()) == false)
            return false;
        if (other.getVPC() == null ^ this.getVPC() == null)
            return false;
        if (other.getVPC() != null && other.getVPC().equals(this.getVPC()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        return true;
    }
}
