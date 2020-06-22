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

/**
 * <p>
 * Describes the VPC peering connection options.
 * </p>
 */
public class VpcPeeringConnectionOptionsDescription implements Serializable {
    /**
     * <p>
     * Indicates whether a local VPC can resolve public DNS hostnames to private
     * IP addresses when queried from instances in a peer VPC.
     * </p>
     */
    private Boolean allowDnsResolutionFromRemoteVpc;

    /**
     * <p>
     * Indicates whether a local ClassicLink connection can communicate with the
     * peer VPC over the VPC peering connection.
     * </p>
     */
    private Boolean allowEgressFromLocalClassicLinkToRemoteVpc;

    /**
     * <p>
     * Indicates whether a local VPC can communicate with a ClassicLink
     * connection in the peer VPC over the VPC peering connection.
     * </p>
     */
    private Boolean allowEgressFromLocalVpcToRemoteClassicLink;

    /**
     * <p>
     * Indicates whether a local VPC can resolve public DNS hostnames to private
     * IP addresses when queried from instances in a peer VPC.
     * </p>
     *
     * @return <p>
     *         Indicates whether a local VPC can resolve public DNS hostnames to
     *         private IP addresses when queried from instances in a peer VPC.
     *         </p>
     */
    public Boolean isAllowDnsResolutionFromRemoteVpc() {
        return allowDnsResolutionFromRemoteVpc;
    }

    /**
     * <p>
     * Indicates whether a local VPC can resolve public DNS hostnames to private
     * IP addresses when queried from instances in a peer VPC.
     * </p>
     *
     * @return <p>
     *         Indicates whether a local VPC can resolve public DNS hostnames to
     *         private IP addresses when queried from instances in a peer VPC.
     *         </p>
     */
    public Boolean getAllowDnsResolutionFromRemoteVpc() {
        return allowDnsResolutionFromRemoteVpc;
    }

    /**
     * <p>
     * Indicates whether a local VPC can resolve public DNS hostnames to private
     * IP addresses when queried from instances in a peer VPC.
     * </p>
     *
     * @param allowDnsResolutionFromRemoteVpc <p>
     *            Indicates whether a local VPC can resolve public DNS hostnames
     *            to private IP addresses when queried from instances in a peer
     *            VPC.
     *            </p>
     */
    public void setAllowDnsResolutionFromRemoteVpc(Boolean allowDnsResolutionFromRemoteVpc) {
        this.allowDnsResolutionFromRemoteVpc = allowDnsResolutionFromRemoteVpc;
    }

    /**
     * <p>
     * Indicates whether a local VPC can resolve public DNS hostnames to private
     * IP addresses when queried from instances in a peer VPC.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param allowDnsResolutionFromRemoteVpc <p>
     *            Indicates whether a local VPC can resolve public DNS hostnames
     *            to private IP addresses when queried from instances in a peer
     *            VPC.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpcPeeringConnectionOptionsDescription withAllowDnsResolutionFromRemoteVpc(
            Boolean allowDnsResolutionFromRemoteVpc) {
        this.allowDnsResolutionFromRemoteVpc = allowDnsResolutionFromRemoteVpc;
        return this;
    }

    /**
     * <p>
     * Indicates whether a local ClassicLink connection can communicate with the
     * peer VPC over the VPC peering connection.
     * </p>
     *
     * @return <p>
     *         Indicates whether a local ClassicLink connection can communicate
     *         with the peer VPC over the VPC peering connection.
     *         </p>
     */
    public Boolean isAllowEgressFromLocalClassicLinkToRemoteVpc() {
        return allowEgressFromLocalClassicLinkToRemoteVpc;
    }

    /**
     * <p>
     * Indicates whether a local ClassicLink connection can communicate with the
     * peer VPC over the VPC peering connection.
     * </p>
     *
     * @return <p>
     *         Indicates whether a local ClassicLink connection can communicate
     *         with the peer VPC over the VPC peering connection.
     *         </p>
     */
    public Boolean getAllowEgressFromLocalClassicLinkToRemoteVpc() {
        return allowEgressFromLocalClassicLinkToRemoteVpc;
    }

    /**
     * <p>
     * Indicates whether a local ClassicLink connection can communicate with the
     * peer VPC over the VPC peering connection.
     * </p>
     *
     * @param allowEgressFromLocalClassicLinkToRemoteVpc <p>
     *            Indicates whether a local ClassicLink connection can
     *            communicate with the peer VPC over the VPC peering connection.
     *            </p>
     */
    public void setAllowEgressFromLocalClassicLinkToRemoteVpc(
            Boolean allowEgressFromLocalClassicLinkToRemoteVpc) {
        this.allowEgressFromLocalClassicLinkToRemoteVpc = allowEgressFromLocalClassicLinkToRemoteVpc;
    }

    /**
     * <p>
     * Indicates whether a local ClassicLink connection can communicate with the
     * peer VPC over the VPC peering connection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param allowEgressFromLocalClassicLinkToRemoteVpc <p>
     *            Indicates whether a local ClassicLink connection can
     *            communicate with the peer VPC over the VPC peering connection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpcPeeringConnectionOptionsDescription withAllowEgressFromLocalClassicLinkToRemoteVpc(
            Boolean allowEgressFromLocalClassicLinkToRemoteVpc) {
        this.allowEgressFromLocalClassicLinkToRemoteVpc = allowEgressFromLocalClassicLinkToRemoteVpc;
        return this;
    }

    /**
     * <p>
     * Indicates whether a local VPC can communicate with a ClassicLink
     * connection in the peer VPC over the VPC peering connection.
     * </p>
     *
     * @return <p>
     *         Indicates whether a local VPC can communicate with a ClassicLink
     *         connection in the peer VPC over the VPC peering connection.
     *         </p>
     */
    public Boolean isAllowEgressFromLocalVpcToRemoteClassicLink() {
        return allowEgressFromLocalVpcToRemoteClassicLink;
    }

    /**
     * <p>
     * Indicates whether a local VPC can communicate with a ClassicLink
     * connection in the peer VPC over the VPC peering connection.
     * </p>
     *
     * @return <p>
     *         Indicates whether a local VPC can communicate with a ClassicLink
     *         connection in the peer VPC over the VPC peering connection.
     *         </p>
     */
    public Boolean getAllowEgressFromLocalVpcToRemoteClassicLink() {
        return allowEgressFromLocalVpcToRemoteClassicLink;
    }

    /**
     * <p>
     * Indicates whether a local VPC can communicate with a ClassicLink
     * connection in the peer VPC over the VPC peering connection.
     * </p>
     *
     * @param allowEgressFromLocalVpcToRemoteClassicLink <p>
     *            Indicates whether a local VPC can communicate with a
     *            ClassicLink connection in the peer VPC over the VPC peering
     *            connection.
     *            </p>
     */
    public void setAllowEgressFromLocalVpcToRemoteClassicLink(
            Boolean allowEgressFromLocalVpcToRemoteClassicLink) {
        this.allowEgressFromLocalVpcToRemoteClassicLink = allowEgressFromLocalVpcToRemoteClassicLink;
    }

    /**
     * <p>
     * Indicates whether a local VPC can communicate with a ClassicLink
     * connection in the peer VPC over the VPC peering connection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param allowEgressFromLocalVpcToRemoteClassicLink <p>
     *            Indicates whether a local VPC can communicate with a
     *            ClassicLink connection in the peer VPC over the VPC peering
     *            connection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpcPeeringConnectionOptionsDescription withAllowEgressFromLocalVpcToRemoteClassicLink(
            Boolean allowEgressFromLocalVpcToRemoteClassicLink) {
        this.allowEgressFromLocalVpcToRemoteClassicLink = allowEgressFromLocalVpcToRemoteClassicLink;
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
        if (getAllowDnsResolutionFromRemoteVpc() != null)
            sb.append("AllowDnsResolutionFromRemoteVpc: " + getAllowDnsResolutionFromRemoteVpc()
                    + ",");
        if (getAllowEgressFromLocalClassicLinkToRemoteVpc() != null)
            sb.append("AllowEgressFromLocalClassicLinkToRemoteVpc: "
                    + getAllowEgressFromLocalClassicLinkToRemoteVpc() + ",");
        if (getAllowEgressFromLocalVpcToRemoteClassicLink() != null)
            sb.append("AllowEgressFromLocalVpcToRemoteClassicLink: "
                    + getAllowEgressFromLocalVpcToRemoteClassicLink());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getAllowDnsResolutionFromRemoteVpc() == null) ? 0
                        : getAllowDnsResolutionFromRemoteVpc().hashCode());
        hashCode = prime
                * hashCode
                + ((getAllowEgressFromLocalClassicLinkToRemoteVpc() == null) ? 0
                        : getAllowEgressFromLocalClassicLinkToRemoteVpc().hashCode());
        hashCode = prime
                * hashCode
                + ((getAllowEgressFromLocalVpcToRemoteClassicLink() == null) ? 0
                        : getAllowEgressFromLocalVpcToRemoteClassicLink().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VpcPeeringConnectionOptionsDescription == false)
            return false;
        VpcPeeringConnectionOptionsDescription other = (VpcPeeringConnectionOptionsDescription) obj;

        if (other.getAllowDnsResolutionFromRemoteVpc() == null
                ^ this.getAllowDnsResolutionFromRemoteVpc() == null)
            return false;
        if (other.getAllowDnsResolutionFromRemoteVpc() != null
                && other.getAllowDnsResolutionFromRemoteVpc().equals(
                        this.getAllowDnsResolutionFromRemoteVpc()) == false)
            return false;
        if (other.getAllowEgressFromLocalClassicLinkToRemoteVpc() == null
                ^ this.getAllowEgressFromLocalClassicLinkToRemoteVpc() == null)
            return false;
        if (other.getAllowEgressFromLocalClassicLinkToRemoteVpc() != null
                && other.getAllowEgressFromLocalClassicLinkToRemoteVpc().equals(
                        this.getAllowEgressFromLocalClassicLinkToRemoteVpc()) == false)
            return false;
        if (other.getAllowEgressFromLocalVpcToRemoteClassicLink() == null
                ^ this.getAllowEgressFromLocalVpcToRemoteClassicLink() == null)
            return false;
        if (other.getAllowEgressFromLocalVpcToRemoteClassicLink() != null
                && other.getAllowEgressFromLocalVpcToRemoteClassicLink().equals(
                        this.getAllowEgressFromLocalVpcToRemoteClassicLink()) == false)
            return false;
        return true;
    }
}
