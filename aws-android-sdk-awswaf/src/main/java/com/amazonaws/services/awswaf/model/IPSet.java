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

package com.amazonaws.services.awswaf.model;

import java.io.Serializable;

/**
 * <note>
 * <p>
 * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
 * href=
 * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
 * >AWS WAF Classic</a> in the developer guide.
 * </p>
 * <p>
 * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the
 * <a href=
 * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS
 * WAF Developer Guide</a>. With the latest version, AWS WAF has a single set of
 * endpoints for regional and global use.
 * </p>
 * </note>
 * <p>
 * Contains one or more IP addresses or blocks of IP addresses specified in
 * Classless Inter-Domain Routing (CIDR) notation. AWS WAF supports IPv4 address
 * ranges: /8 and any range between /16 through /32. AWS WAF supports IPv6
 * address ranges: /24, /32, /48, /56, /64, and /128.
 * </p>
 * <p>
 * To specify an individual IP address, you specify the four-part IP address
 * followed by a <code>/32</code>, for example, 192.0.2.0/32. To block a range
 * of IP addresses, you can specify /8 or any range between /16 through /32 (for
 * IPv4) or /24, /32, /48, /56, /64, or /128 (for IPv6). For more information
 * about CIDR notation, see the Wikipedia entry <a
 * href="https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing">Classless
 * Inter-Domain Routing</a>.
 * </p>
 */
public class IPSet implements Serializable {
    /**
     * <p>
     * The <code>IPSetId</code> for an <code>IPSet</code>. You use
     * <code>IPSetId</code> to get information about an <code>IPSet</code> (see
     * <a>GetIPSet</a>), update an <code>IPSet</code> (see <a>UpdateIPSet</a>),
     * insert an <code>IPSet</code> into a <code>Rule</code> or delete one from
     * a <code>Rule</code> (see <a>UpdateRule</a>), and delete an
     * <code>IPSet</code> from AWS WAF (see <a>DeleteIPSet</a>).
     * </p>
     * <p>
     * <code>IPSetId</code> is returned by <a>CreateIPSet</a> and by
     * <a>ListIPSets</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String iPSetId;

    /**
     * <p>
     * A friendly name or description of the <a>IPSet</a>. You can't change the
     * name of an <code>IPSet</code> after you create it.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String name;

    /**
     * <p>
     * The IP address type (<code>IPV4</code> or <code>IPV6</code>) and the IP
     * address range (in CIDR notation) that web requests originate from. If the
     * <code>WebACL</code> is associated with a CloudFront distribution and the
     * viewer did not use an HTTP proxy or a load balancer to send the request,
     * this is the value of the c-ip field in the CloudFront access logs.
     * </p>
     */
    private java.util.List<IPSetDescriptor> iPSetDescriptors;

    /**
     * <p>
     * The <code>IPSetId</code> for an <code>IPSet</code>. You use
     * <code>IPSetId</code> to get information about an <code>IPSet</code> (see
     * <a>GetIPSet</a>), update an <code>IPSet</code> (see <a>UpdateIPSet</a>),
     * insert an <code>IPSet</code> into a <code>Rule</code> or delete one from
     * a <code>Rule</code> (see <a>UpdateRule</a>), and delete an
     * <code>IPSet</code> from AWS WAF (see <a>DeleteIPSet</a>).
     * </p>
     * <p>
     * <code>IPSetId</code> is returned by <a>CreateIPSet</a> and by
     * <a>ListIPSets</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The <code>IPSetId</code> for an <code>IPSet</code>. You use
     *         <code>IPSetId</code> to get information about an
     *         <code>IPSet</code> (see <a>GetIPSet</a>), update an
     *         <code>IPSet</code> (see <a>UpdateIPSet</a>), insert an
     *         <code>IPSet</code> into a <code>Rule</code> or delete one from a
     *         <code>Rule</code> (see <a>UpdateRule</a>), and delete an
     *         <code>IPSet</code> from AWS WAF (see <a>DeleteIPSet</a>).
     *         </p>
     *         <p>
     *         <code>IPSetId</code> is returned by <a>CreateIPSet</a> and by
     *         <a>ListIPSets</a>.
     *         </p>
     */
    public String getIPSetId() {
        return iPSetId;
    }

    /**
     * <p>
     * The <code>IPSetId</code> for an <code>IPSet</code>. You use
     * <code>IPSetId</code> to get information about an <code>IPSet</code> (see
     * <a>GetIPSet</a>), update an <code>IPSet</code> (see <a>UpdateIPSet</a>),
     * insert an <code>IPSet</code> into a <code>Rule</code> or delete one from
     * a <code>Rule</code> (see <a>UpdateRule</a>), and delete an
     * <code>IPSet</code> from AWS WAF (see <a>DeleteIPSet</a>).
     * </p>
     * <p>
     * <code>IPSetId</code> is returned by <a>CreateIPSet</a> and by
     * <a>ListIPSets</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param iPSetId <p>
     *            The <code>IPSetId</code> for an <code>IPSet</code>. You use
     *            <code>IPSetId</code> to get information about an
     *            <code>IPSet</code> (see <a>GetIPSet</a>), update an
     *            <code>IPSet</code> (see <a>UpdateIPSet</a>), insert an
     *            <code>IPSet</code> into a <code>Rule</code> or delete one from
     *            a <code>Rule</code> (see <a>UpdateRule</a>), and delete an
     *            <code>IPSet</code> from AWS WAF (see <a>DeleteIPSet</a>).
     *            </p>
     *            <p>
     *            <code>IPSetId</code> is returned by <a>CreateIPSet</a> and by
     *            <a>ListIPSets</a>.
     *            </p>
     */
    public void setIPSetId(String iPSetId) {
        this.iPSetId = iPSetId;
    }

    /**
     * <p>
     * The <code>IPSetId</code> for an <code>IPSet</code>. You use
     * <code>IPSetId</code> to get information about an <code>IPSet</code> (see
     * <a>GetIPSet</a>), update an <code>IPSet</code> (see <a>UpdateIPSet</a>),
     * insert an <code>IPSet</code> into a <code>Rule</code> or delete one from
     * a <code>Rule</code> (see <a>UpdateRule</a>), and delete an
     * <code>IPSet</code> from AWS WAF (see <a>DeleteIPSet</a>).
     * </p>
     * <p>
     * <code>IPSetId</code> is returned by <a>CreateIPSet</a> and by
     * <a>ListIPSets</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param iPSetId <p>
     *            The <code>IPSetId</code> for an <code>IPSet</code>. You use
     *            <code>IPSetId</code> to get information about an
     *            <code>IPSet</code> (see <a>GetIPSet</a>), update an
     *            <code>IPSet</code> (see <a>UpdateIPSet</a>), insert an
     *            <code>IPSet</code> into a <code>Rule</code> or delete one from
     *            a <code>Rule</code> (see <a>UpdateRule</a>), and delete an
     *            <code>IPSet</code> from AWS WAF (see <a>DeleteIPSet</a>).
     *            </p>
     *            <p>
     *            <code>IPSetId</code> is returned by <a>CreateIPSet</a> and by
     *            <a>ListIPSets</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IPSet withIPSetId(String iPSetId) {
        this.iPSetId = iPSetId;
        return this;
    }

    /**
     * <p>
     * A friendly name or description of the <a>IPSet</a>. You can't change the
     * name of an <code>IPSet</code> after you create it.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         A friendly name or description of the <a>IPSet</a>. You can't
     *         change the name of an <code>IPSet</code> after you create it.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * A friendly name or description of the <a>IPSet</a>. You can't change the
     * name of an <code>IPSet</code> after you create it.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param name <p>
     *            A friendly name or description of the <a>IPSet</a>. You can't
     *            change the name of an <code>IPSet</code> after you create it.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A friendly name or description of the <a>IPSet</a>. You can't change the
     * name of an <code>IPSet</code> after you create it.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param name <p>
     *            A friendly name or description of the <a>IPSet</a>. You can't
     *            change the name of an <code>IPSet</code> after you create it.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IPSet withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The IP address type (<code>IPV4</code> or <code>IPV6</code>) and the IP
     * address range (in CIDR notation) that web requests originate from. If the
     * <code>WebACL</code> is associated with a CloudFront distribution and the
     * viewer did not use an HTTP proxy or a load balancer to send the request,
     * this is the value of the c-ip field in the CloudFront access logs.
     * </p>
     *
     * @return <p>
     *         The IP address type (<code>IPV4</code> or <code>IPV6</code>) and
     *         the IP address range (in CIDR notation) that web requests
     *         originate from. If the <code>WebACL</code> is associated with a
     *         CloudFront distribution and the viewer did not use an HTTP proxy
     *         or a load balancer to send the request, this is the value of the
     *         c-ip field in the CloudFront access logs.
     *         </p>
     */
    public java.util.List<IPSetDescriptor> getIPSetDescriptors() {
        return iPSetDescriptors;
    }

    /**
     * <p>
     * The IP address type (<code>IPV4</code> or <code>IPV6</code>) and the IP
     * address range (in CIDR notation) that web requests originate from. If the
     * <code>WebACL</code> is associated with a CloudFront distribution and the
     * viewer did not use an HTTP proxy or a load balancer to send the request,
     * this is the value of the c-ip field in the CloudFront access logs.
     * </p>
     *
     * @param iPSetDescriptors <p>
     *            The IP address type (<code>IPV4</code> or <code>IPV6</code>)
     *            and the IP address range (in CIDR notation) that web requests
     *            originate from. If the <code>WebACL</code> is associated with
     *            a CloudFront distribution and the viewer did not use an HTTP
     *            proxy or a load balancer to send the request, this is the
     *            value of the c-ip field in the CloudFront access logs.
     *            </p>
     */
    public void setIPSetDescriptors(java.util.Collection<IPSetDescriptor> iPSetDescriptors) {
        if (iPSetDescriptors == null) {
            this.iPSetDescriptors = null;
            return;
        }

        this.iPSetDescriptors = new java.util.ArrayList<IPSetDescriptor>(iPSetDescriptors);
    }

    /**
     * <p>
     * The IP address type (<code>IPV4</code> or <code>IPV6</code>) and the IP
     * address range (in CIDR notation) that web requests originate from. If the
     * <code>WebACL</code> is associated with a CloudFront distribution and the
     * viewer did not use an HTTP proxy or a load balancer to send the request,
     * this is the value of the c-ip field in the CloudFront access logs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param iPSetDescriptors <p>
     *            The IP address type (<code>IPV4</code> or <code>IPV6</code>)
     *            and the IP address range (in CIDR notation) that web requests
     *            originate from. If the <code>WebACL</code> is associated with
     *            a CloudFront distribution and the viewer did not use an HTTP
     *            proxy or a load balancer to send the request, this is the
     *            value of the c-ip field in the CloudFront access logs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IPSet withIPSetDescriptors(IPSetDescriptor... iPSetDescriptors) {
        if (getIPSetDescriptors() == null) {
            this.iPSetDescriptors = new java.util.ArrayList<IPSetDescriptor>(
                    iPSetDescriptors.length);
        }
        for (IPSetDescriptor value : iPSetDescriptors) {
            this.iPSetDescriptors.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The IP address type (<code>IPV4</code> or <code>IPV6</code>) and the IP
     * address range (in CIDR notation) that web requests originate from. If the
     * <code>WebACL</code> is associated with a CloudFront distribution and the
     * viewer did not use an HTTP proxy or a load balancer to send the request,
     * this is the value of the c-ip field in the CloudFront access logs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param iPSetDescriptors <p>
     *            The IP address type (<code>IPV4</code> or <code>IPV6</code>)
     *            and the IP address range (in CIDR notation) that web requests
     *            originate from. If the <code>WebACL</code> is associated with
     *            a CloudFront distribution and the viewer did not use an HTTP
     *            proxy or a load balancer to send the request, this is the
     *            value of the c-ip field in the CloudFront access logs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IPSet withIPSetDescriptors(java.util.Collection<IPSetDescriptor> iPSetDescriptors) {
        setIPSetDescriptors(iPSetDescriptors);
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
        if (getIPSetId() != null)
            sb.append("IPSetId: " + getIPSetId() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getIPSetDescriptors() != null)
            sb.append("IPSetDescriptors: " + getIPSetDescriptors());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIPSetId() == null) ? 0 : getIPSetId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getIPSetDescriptors() == null) ? 0 : getIPSetDescriptors().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IPSet == false)
            return false;
        IPSet other = (IPSet) obj;

        if (other.getIPSetId() == null ^ this.getIPSetId() == null)
            return false;
        if (other.getIPSetId() != null && other.getIPSetId().equals(this.getIPSetId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getIPSetDescriptors() == null ^ this.getIPSetDescriptors() == null)
            return false;
        if (other.getIPSetDescriptors() != null
                && other.getIPSetDescriptors().equals(this.getIPSetDescriptors()) == false)
            return false;
        return true;
    }
}
