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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

public class ModifyVpcPeeringConnectionOptionsResult implements Serializable {
    /**
     * <p>
     * Information about the VPC peering connection options for the accepter
     * VPC.
     * </p>
     */
    private PeeringConnectionOptions accepterPeeringConnectionOptions;

    /**
     * <p>
     * Information about the VPC peering connection options for the requester
     * VPC.
     * </p>
     */
    private PeeringConnectionOptions requesterPeeringConnectionOptions;

    /**
     * <p>
     * Information about the VPC peering connection options for the accepter
     * VPC.
     * </p>
     *
     * @return <p>
     *         Information about the VPC peering connection options for the
     *         accepter VPC.
     *         </p>
     */
    public PeeringConnectionOptions getAccepterPeeringConnectionOptions() {
        return accepterPeeringConnectionOptions;
    }

    /**
     * <p>
     * Information about the VPC peering connection options for the accepter
     * VPC.
     * </p>
     *
     * @param accepterPeeringConnectionOptions <p>
     *            Information about the VPC peering connection options for the
     *            accepter VPC.
     *            </p>
     */
    public void setAccepterPeeringConnectionOptions(
            PeeringConnectionOptions accepterPeeringConnectionOptions) {
        this.accepterPeeringConnectionOptions = accepterPeeringConnectionOptions;
    }

    /**
     * <p>
     * Information about the VPC peering connection options for the accepter
     * VPC.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accepterPeeringConnectionOptions <p>
     *            Information about the VPC peering connection options for the
     *            accepter VPC.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyVpcPeeringConnectionOptionsResult withAccepterPeeringConnectionOptions(
            PeeringConnectionOptions accepterPeeringConnectionOptions) {
        this.accepterPeeringConnectionOptions = accepterPeeringConnectionOptions;
        return this;
    }

    /**
     * <p>
     * Information about the VPC peering connection options for the requester
     * VPC.
     * </p>
     *
     * @return <p>
     *         Information about the VPC peering connection options for the
     *         requester VPC.
     *         </p>
     */
    public PeeringConnectionOptions getRequesterPeeringConnectionOptions() {
        return requesterPeeringConnectionOptions;
    }

    /**
     * <p>
     * Information about the VPC peering connection options for the requester
     * VPC.
     * </p>
     *
     * @param requesterPeeringConnectionOptions <p>
     *            Information about the VPC peering connection options for the
     *            requester VPC.
     *            </p>
     */
    public void setRequesterPeeringConnectionOptions(
            PeeringConnectionOptions requesterPeeringConnectionOptions) {
        this.requesterPeeringConnectionOptions = requesterPeeringConnectionOptions;
    }

    /**
     * <p>
     * Information about the VPC peering connection options for the requester
     * VPC.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param requesterPeeringConnectionOptions <p>
     *            Information about the VPC peering connection options for the
     *            requester VPC.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyVpcPeeringConnectionOptionsResult withRequesterPeeringConnectionOptions(
            PeeringConnectionOptions requesterPeeringConnectionOptions) {
        this.requesterPeeringConnectionOptions = requesterPeeringConnectionOptions;
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
        if (getAccepterPeeringConnectionOptions() != null)
            sb.append("AccepterPeeringConnectionOptions: " + getAccepterPeeringConnectionOptions()
                    + ",");
        if (getRequesterPeeringConnectionOptions() != null)
            sb.append("RequesterPeeringConnectionOptions: "
                    + getRequesterPeeringConnectionOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getAccepterPeeringConnectionOptions() == null) ? 0
                        : getAccepterPeeringConnectionOptions().hashCode());
        hashCode = prime
                * hashCode
                + ((getRequesterPeeringConnectionOptions() == null) ? 0
                        : getRequesterPeeringConnectionOptions().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyVpcPeeringConnectionOptionsResult == false)
            return false;
        ModifyVpcPeeringConnectionOptionsResult other = (ModifyVpcPeeringConnectionOptionsResult) obj;

        if (other.getAccepterPeeringConnectionOptions() == null
                ^ this.getAccepterPeeringConnectionOptions() == null)
            return false;
        if (other.getAccepterPeeringConnectionOptions() != null
                && other.getAccepterPeeringConnectionOptions().equals(
                        this.getAccepterPeeringConnectionOptions()) == false)
            return false;
        if (other.getRequesterPeeringConnectionOptions() == null
                ^ this.getRequesterPeeringConnectionOptions() == null)
            return false;
        if (other.getRequesterPeeringConnectionOptions() != null
                && other.getRequesterPeeringConnectionOptions().equals(
                        this.getRequesterPeeringConnectionOptions()) == false)
            return false;
        return true;
    }
}
