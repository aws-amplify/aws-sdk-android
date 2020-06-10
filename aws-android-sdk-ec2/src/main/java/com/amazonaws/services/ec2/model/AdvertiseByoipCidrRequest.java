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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Advertises an IPv4 or IPv6 address range that is provisioned for use with
 * your AWS resources through bring your own IP addresses (BYOIP).
 * </p>
 * <p>
 * You can perform this operation at most once every 10 seconds, even if you
 * specify different address ranges each time.
 * </p>
 * <p>
 * We recommend that you stop advertising the BYOIP CIDR from other locations
 * when you advertise it from AWS. To minimize down time, you can configure your
 * AWS resources to use an address from a BYOIP CIDR before it is advertised,
 * and then simultaneously stop advertising it from the current location and
 * start advertising it through AWS.
 * </p>
 * <p>
 * It can take a few minutes before traffic to the specified addresses starts
 * routing to AWS because of BGP propagation delays.
 * </p>
 * <p>
 * To stop advertising the BYOIP CIDR, use <a>WithdrawByoipCidr</a>.
 * </p>
 */
public class AdvertiseByoipCidrRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The address range, in CIDR notation. This must be the exact range that
     * you provisioned. You can't advertise only a portion of the provisioned
     * range.
     * </p>
     */
    private String cidr;

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     */
    private Boolean dryRun;

    /**
     * <p>
     * The address range, in CIDR notation. This must be the exact range that
     * you provisioned. You can't advertise only a portion of the provisioned
     * range.
     * </p>
     *
     * @return <p>
     *         The address range, in CIDR notation. This must be the exact range
     *         that you provisioned. You can't advertise only a portion of the
     *         provisioned range.
     *         </p>
     */
    public String getCidr() {
        return cidr;
    }

    /**
     * <p>
     * The address range, in CIDR notation. This must be the exact range that
     * you provisioned. You can't advertise only a portion of the provisioned
     * range.
     * </p>
     *
     * @param cidr <p>
     *            The address range, in CIDR notation. This must be the exact
     *            range that you provisioned. You can't advertise only a portion
     *            of the provisioned range.
     *            </p>
     */
    public void setCidr(String cidr) {
        this.cidr = cidr;
    }

    /**
     * <p>
     * The address range, in CIDR notation. This must be the exact range that
     * you provisioned. You can't advertise only a portion of the provisioned
     * range.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cidr <p>
     *            The address range, in CIDR notation. This must be the exact
     *            range that you provisioned. You can't advertise only a portion
     *            of the provisioned range.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AdvertiseByoipCidrRequest withCidr(String cidr) {
        this.cidr = cidr;
        return this;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @return <p>
     *         Checks whether you have the required permissions for the action,
     *         without actually making the request, and provides an error
     *         response. If you have the required permissions, the error
     *         response is <code>DryRunOperation</code>. Otherwise, it is
     *         <code>UnauthorizedOperation</code>.
     *         </p>
     */
    public Boolean isDryRun() {
        return dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @return <p>
     *         Checks whether you have the required permissions for the action,
     *         without actually making the request, and provides an error
     *         response. If you have the required permissions, the error
     *         response is <code>DryRunOperation</code>. Otherwise, it is
     *         <code>UnauthorizedOperation</code>.
     *         </p>
     */
    public Boolean getDryRun() {
        return dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @param dryRun <p>
     *            Checks whether you have the required permissions for the
     *            action, without actually making the request, and provides an
     *            error response. If you have the required permissions, the
     *            error response is <code>DryRunOperation</code>. Otherwise, it
     *            is <code>UnauthorizedOperation</code>.
     *            </p>
     */
    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dryRun <p>
     *            Checks whether you have the required permissions for the
     *            action, without actually making the request, and provides an
     *            error response. If you have the required permissions, the
     *            error response is <code>DryRunOperation</code>. Otherwise, it
     *            is <code>UnauthorizedOperation</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AdvertiseByoipCidrRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
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
        if (getCidr() != null)
            sb.append("Cidr: " + getCidr() + ",");
        if (getDryRun() != null)
            sb.append("DryRun: " + getDryRun());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCidr() == null) ? 0 : getCidr().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AdvertiseByoipCidrRequest == false)
            return false;
        AdvertiseByoipCidrRequest other = (AdvertiseByoipCidrRequest) obj;

        if (other.getCidr() == null ^ this.getCidr() == null)
            return false;
        if (other.getCidr() != null && other.getCidr().equals(this.getCidr()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        return true;
    }
}
