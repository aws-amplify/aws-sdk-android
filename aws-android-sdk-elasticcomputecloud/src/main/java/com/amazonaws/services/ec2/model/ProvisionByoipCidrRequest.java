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
 * Provisions an IPv4 or IPv6 address range for use with your AWS resources
 * through bring your own IP addresses (BYOIP) and creates a corresponding
 * address pool. After the address range is provisioned, it is ready to be
 * advertised using <a>AdvertiseByoipCidr</a>.
 * </p>
 * <p>
 * AWS verifies that you own the address range and are authorized to advertise
 * it. You must ensure that the address range is registered to you and that you
 * created an RPKI ROA to authorize Amazon ASNs 16509 and 14618 to advertise the
 * address range. For more information, see <a
 * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-byoip.html"
 * >Bring Your Own IP Addresses (BYOIP)</a> in the <i>Amazon Elastic Compute
 * Cloud User Guide</i>.
 * </p>
 * <p>
 * Provisioning an address range is an asynchronous operation, so the call
 * returns immediately, but the address range is not ready to use until its
 * status changes from <code>pending-provision</code> to
 * <code>provisioned</code>. To monitor the status of an address range, use
 * <a>DescribeByoipCidrs</a>. To allocate an Elastic IP address from your IPv4
 * address pool, use <a>AllocateAddress</a> with either the specific address
 * from the address pool or the ID of the address pool.
 * </p>
 */
public class ProvisionByoipCidrRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The public IPv4 or IPv6 address range, in CIDR notation. The most
     * specific IPv4 prefix that you can specify is /24. The most specific IPv6
     * prefix you can specify is /56. The address range cannot overlap with
     * another address range that you've brought to this or another Region.
     * </p>
     */
    private String cidr;

    /**
     * <p>
     * A signed document that proves that you are authorized to bring the
     * specified IP address range to Amazon using BYOIP.
     * </p>
     */
    private CidrAuthorizationContext cidrAuthorizationContext;

    /**
     * <p>
     * (IPv6 only) Indicate whether the address range will be publicly
     * advertised to the internet.
     * </p>
     * <p>
     * Default: true
     * </p>
     */
    private Boolean publiclyAdvertisable;

    /**
     * <p>
     * A description for the address range and the address pool.
     * </p>
     */
    private String description;

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
     * The public IPv4 or IPv6 address range, in CIDR notation. The most
     * specific IPv4 prefix that you can specify is /24. The most specific IPv6
     * prefix you can specify is /56. The address range cannot overlap with
     * another address range that you've brought to this or another Region.
     * </p>
     *
     * @return <p>
     *         The public IPv4 or IPv6 address range, in CIDR notation. The most
     *         specific IPv4 prefix that you can specify is /24. The most
     *         specific IPv6 prefix you can specify is /56. The address range
     *         cannot overlap with another address range that you've brought to
     *         this or another Region.
     *         </p>
     */
    public String getCidr() {
        return cidr;
    }

    /**
     * <p>
     * The public IPv4 or IPv6 address range, in CIDR notation. The most
     * specific IPv4 prefix that you can specify is /24. The most specific IPv6
     * prefix you can specify is /56. The address range cannot overlap with
     * another address range that you've brought to this or another Region.
     * </p>
     *
     * @param cidr <p>
     *            The public IPv4 or IPv6 address range, in CIDR notation. The
     *            most specific IPv4 prefix that you can specify is /24. The
     *            most specific IPv6 prefix you can specify is /56. The address
     *            range cannot overlap with another address range that you've
     *            brought to this or another Region.
     *            </p>
     */
    public void setCidr(String cidr) {
        this.cidr = cidr;
    }

    /**
     * <p>
     * The public IPv4 or IPv6 address range, in CIDR notation. The most
     * specific IPv4 prefix that you can specify is /24. The most specific IPv6
     * prefix you can specify is /56. The address range cannot overlap with
     * another address range that you've brought to this or another Region.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cidr <p>
     *            The public IPv4 or IPv6 address range, in CIDR notation. The
     *            most specific IPv4 prefix that you can specify is /24. The
     *            most specific IPv6 prefix you can specify is /56. The address
     *            range cannot overlap with another address range that you've
     *            brought to this or another Region.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProvisionByoipCidrRequest withCidr(String cidr) {
        this.cidr = cidr;
        return this;
    }

    /**
     * <p>
     * A signed document that proves that you are authorized to bring the
     * specified IP address range to Amazon using BYOIP.
     * </p>
     *
     * @return <p>
     *         A signed document that proves that you are authorized to bring
     *         the specified IP address range to Amazon using BYOIP.
     *         </p>
     */
    public CidrAuthorizationContext getCidrAuthorizationContext() {
        return cidrAuthorizationContext;
    }

    /**
     * <p>
     * A signed document that proves that you are authorized to bring the
     * specified IP address range to Amazon using BYOIP.
     * </p>
     *
     * @param cidrAuthorizationContext <p>
     *            A signed document that proves that you are authorized to bring
     *            the specified IP address range to Amazon using BYOIP.
     *            </p>
     */
    public void setCidrAuthorizationContext(CidrAuthorizationContext cidrAuthorizationContext) {
        this.cidrAuthorizationContext = cidrAuthorizationContext;
    }

    /**
     * <p>
     * A signed document that proves that you are authorized to bring the
     * specified IP address range to Amazon using BYOIP.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cidrAuthorizationContext <p>
     *            A signed document that proves that you are authorized to bring
     *            the specified IP address range to Amazon using BYOIP.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProvisionByoipCidrRequest withCidrAuthorizationContext(
            CidrAuthorizationContext cidrAuthorizationContext) {
        this.cidrAuthorizationContext = cidrAuthorizationContext;
        return this;
    }

    /**
     * <p>
     * (IPv6 only) Indicate whether the address range will be publicly
     * advertised to the internet.
     * </p>
     * <p>
     * Default: true
     * </p>
     *
     * @return <p>
     *         (IPv6 only) Indicate whether the address range will be publicly
     *         advertised to the internet.
     *         </p>
     *         <p>
     *         Default: true
     *         </p>
     */
    public Boolean isPubliclyAdvertisable() {
        return publiclyAdvertisable;
    }

    /**
     * <p>
     * (IPv6 only) Indicate whether the address range will be publicly
     * advertised to the internet.
     * </p>
     * <p>
     * Default: true
     * </p>
     *
     * @return <p>
     *         (IPv6 only) Indicate whether the address range will be publicly
     *         advertised to the internet.
     *         </p>
     *         <p>
     *         Default: true
     *         </p>
     */
    public Boolean getPubliclyAdvertisable() {
        return publiclyAdvertisable;
    }

    /**
     * <p>
     * (IPv6 only) Indicate whether the address range will be publicly
     * advertised to the internet.
     * </p>
     * <p>
     * Default: true
     * </p>
     *
     * @param publiclyAdvertisable <p>
     *            (IPv6 only) Indicate whether the address range will be
     *            publicly advertised to the internet.
     *            </p>
     *            <p>
     *            Default: true
     *            </p>
     */
    public void setPubliclyAdvertisable(Boolean publiclyAdvertisable) {
        this.publiclyAdvertisable = publiclyAdvertisable;
    }

    /**
     * <p>
     * (IPv6 only) Indicate whether the address range will be publicly
     * advertised to the internet.
     * </p>
     * <p>
     * Default: true
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param publiclyAdvertisable <p>
     *            (IPv6 only) Indicate whether the address range will be
     *            publicly advertised to the internet.
     *            </p>
     *            <p>
     *            Default: true
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProvisionByoipCidrRequest withPubliclyAdvertisable(Boolean publiclyAdvertisable) {
        this.publiclyAdvertisable = publiclyAdvertisable;
        return this;
    }

    /**
     * <p>
     * A description for the address range and the address pool.
     * </p>
     *
     * @return <p>
     *         A description for the address range and the address pool.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A description for the address range and the address pool.
     * </p>
     *
     * @param description <p>
     *            A description for the address range and the address pool.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description for the address range and the address pool.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            A description for the address range and the address pool.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProvisionByoipCidrRequest withDescription(String description) {
        this.description = description;
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
    public ProvisionByoipCidrRequest withDryRun(Boolean dryRun) {
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
        if (getCidrAuthorizationContext() != null)
            sb.append("CidrAuthorizationContext: " + getCidrAuthorizationContext() + ",");
        if (getPubliclyAdvertisable() != null)
            sb.append("PubliclyAdvertisable: " + getPubliclyAdvertisable() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
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
        hashCode = prime
                * hashCode
                + ((getCidrAuthorizationContext() == null) ? 0 : getCidrAuthorizationContext()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getPubliclyAdvertisable() == null) ? 0 : getPubliclyAdvertisable().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProvisionByoipCidrRequest == false)
            return false;
        ProvisionByoipCidrRequest other = (ProvisionByoipCidrRequest) obj;

        if (other.getCidr() == null ^ this.getCidr() == null)
            return false;
        if (other.getCidr() != null && other.getCidr().equals(this.getCidr()) == false)
            return false;
        if (other.getCidrAuthorizationContext() == null
                ^ this.getCidrAuthorizationContext() == null)
            return false;
        if (other.getCidrAuthorizationContext() != null
                && other.getCidrAuthorizationContext().equals(this.getCidrAuthorizationContext()) == false)
            return false;
        if (other.getPubliclyAdvertisable() == null ^ this.getPubliclyAdvertisable() == null)
            return false;
        if (other.getPubliclyAdvertisable() != null
                && other.getPubliclyAdvertisable().equals(this.getPubliclyAdvertisable()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        return true;
    }
}
