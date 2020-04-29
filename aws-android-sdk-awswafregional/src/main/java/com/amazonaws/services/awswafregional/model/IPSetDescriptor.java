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

package com.amazonaws.services.awswafregional.model;

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
 * Specifies the IP address type (<code>IPV4</code> or <code>IPV6</code>) and
 * the IP address range (in CIDR format) that web requests originate from.
 * </p>
 */
public class IPSetDescriptor implements Serializable {
    /**
     * <p>
     * Specify <code>IPV4</code> or <code>IPV6</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IPV4, IPV6
     */
    private String type;

    /**
     * <p>
     * Specify an IPv4 address by using CIDR notation. For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To configure AWS WAF to allow, block, or count requests that originated
     * from the IP address 192.0.2.44, specify <code>192.0.2.44/32</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To configure AWS WAF to allow, block, or count requests that originated
     * from IP addresses from 192.0.2.0 to 192.0.2.255, specify
     * <code>192.0.2.0/24</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about CIDR notation, see the Wikipedia entry <a
     * href=
     * "https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing">Classless
     * Inter-Domain Routing</a>.
     * </p>
     * <p>
     * Specify an IPv6 address by using CIDR notation. For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To configure AWS WAF to allow, block, or count requests that originated
     * from the IP address 1111:0000:0000:0000:0000:0000:0000:0111, specify
     * <code>1111:0000:0000:0000:0000:0000:0000:0111/128</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To configure AWS WAF to allow, block, or count requests that originated
     * from IP addresses 1111:0000:0000:0000:0000:0000:0000:0000 to
     * 1111:0000:0000:0000:ffff:ffff:ffff:ffff, specify
     * <code>1111:0000:0000:0000:0000:0000:0000:0000/64</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String value;

    /**
     * <p>
     * Specify <code>IPV4</code> or <code>IPV6</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IPV4, IPV6
     *
     * @return <p>
     *         Specify <code>IPV4</code> or <code>IPV6</code>.
     *         </p>
     * @see IPSetDescriptorType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * Specify <code>IPV4</code> or <code>IPV6</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IPV4, IPV6
     *
     * @param type <p>
     *            Specify <code>IPV4</code> or <code>IPV6</code>.
     *            </p>
     * @see IPSetDescriptorType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Specify <code>IPV4</code> or <code>IPV6</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IPV4, IPV6
     *
     * @param type <p>
     *            Specify <code>IPV4</code> or <code>IPV6</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see IPSetDescriptorType
     */
    public IPSetDescriptor withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * Specify <code>IPV4</code> or <code>IPV6</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IPV4, IPV6
     *
     * @param type <p>
     *            Specify <code>IPV4</code> or <code>IPV6</code>.
     *            </p>
     * @see IPSetDescriptorType
     */
    public void setType(IPSetDescriptorType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * Specify <code>IPV4</code> or <code>IPV6</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IPV4, IPV6
     *
     * @param type <p>
     *            Specify <code>IPV4</code> or <code>IPV6</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see IPSetDescriptorType
     */
    public IPSetDescriptor withType(IPSetDescriptorType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * Specify an IPv4 address by using CIDR notation. For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To configure AWS WAF to allow, block, or count requests that originated
     * from the IP address 192.0.2.44, specify <code>192.0.2.44/32</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To configure AWS WAF to allow, block, or count requests that originated
     * from IP addresses from 192.0.2.0 to 192.0.2.255, specify
     * <code>192.0.2.0/24</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about CIDR notation, see the Wikipedia entry <a
     * href=
     * "https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing">Classless
     * Inter-Domain Routing</a>.
     * </p>
     * <p>
     * Specify an IPv6 address by using CIDR notation. For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To configure AWS WAF to allow, block, or count requests that originated
     * from the IP address 1111:0000:0000:0000:0000:0000:0000:0111, specify
     * <code>1111:0000:0000:0000:0000:0000:0000:0111/128</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To configure AWS WAF to allow, block, or count requests that originated
     * from IP addresses 1111:0000:0000:0000:0000:0000:0000:0000 to
     * 1111:0000:0000:0000:ffff:ffff:ffff:ffff, specify
     * <code>1111:0000:0000:0000:0000:0000:0000:0000/64</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         Specify an IPv4 address by using CIDR notation. For example:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         To configure AWS WAF to allow, block, or count requests that
     *         originated from the IP address 192.0.2.44, specify
     *         <code>192.0.2.44/32</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         To configure AWS WAF to allow, block, or count requests that
     *         originated from IP addresses from 192.0.2.0 to 192.0.2.255,
     *         specify <code>192.0.2.0/24</code>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information about CIDR notation, see the Wikipedia entry
     *         <a href=
     *         "https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing"
     *         >Classless Inter-Domain Routing</a>.
     *         </p>
     *         <p>
     *         Specify an IPv6 address by using CIDR notation. For example:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         To configure AWS WAF to allow, block, or count requests that
     *         originated from the IP address
     *         1111:0000:0000:0000:0000:0000:0000:0111, specify
     *         <code>1111:0000:0000:0000:0000:0000:0000:0111/128</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         To configure AWS WAF to allow, block, or count requests that
     *         originated from IP addresses
     *         1111:0000:0000:0000:0000:0000:0000:0000 to
     *         1111:0000:0000:0000:ffff:ffff:ffff:ffff, specify
     *         <code>1111:0000:0000:0000:0000:0000:0000:0000/64</code>.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getValue() {
        return value;
    }

    /**
     * <p>
     * Specify an IPv4 address by using CIDR notation. For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To configure AWS WAF to allow, block, or count requests that originated
     * from the IP address 192.0.2.44, specify <code>192.0.2.44/32</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To configure AWS WAF to allow, block, or count requests that originated
     * from IP addresses from 192.0.2.0 to 192.0.2.255, specify
     * <code>192.0.2.0/24</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about CIDR notation, see the Wikipedia entry <a
     * href=
     * "https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing">Classless
     * Inter-Domain Routing</a>.
     * </p>
     * <p>
     * Specify an IPv6 address by using CIDR notation. For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To configure AWS WAF to allow, block, or count requests that originated
     * from the IP address 1111:0000:0000:0000:0000:0000:0000:0111, specify
     * <code>1111:0000:0000:0000:0000:0000:0000:0111/128</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To configure AWS WAF to allow, block, or count requests that originated
     * from IP addresses 1111:0000:0000:0000:0000:0000:0000:0000 to
     * 1111:0000:0000:0000:ffff:ffff:ffff:ffff, specify
     * <code>1111:0000:0000:0000:0000:0000:0000:0000/64</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param value <p>
     *            Specify an IPv4 address by using CIDR notation. For example:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            To configure AWS WAF to allow, block, or count requests that
     *            originated from the IP address 192.0.2.44, specify
     *            <code>192.0.2.44/32</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            To configure AWS WAF to allow, block, or count requests that
     *            originated from IP addresses from 192.0.2.0 to 192.0.2.255,
     *            specify <code>192.0.2.0/24</code>.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For more information about CIDR notation, see the Wikipedia
     *            entry <a href=
     *            "https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing"
     *            >Classless Inter-Domain Routing</a>.
     *            </p>
     *            <p>
     *            Specify an IPv6 address by using CIDR notation. For example:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            To configure AWS WAF to allow, block, or count requests that
     *            originated from the IP address
     *            1111:0000:0000:0000:0000:0000:0000:0111, specify
     *            <code>1111:0000:0000:0000:0000:0000:0000:0111/128</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            To configure AWS WAF to allow, block, or count requests that
     *            originated from IP addresses
     *            1111:0000:0000:0000:0000:0000:0000:0000 to
     *            1111:0000:0000:0000:ffff:ffff:ffff:ffff, specify
     *            <code>1111:0000:0000:0000:0000:0000:0000:0000/64</code>.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * Specify an IPv4 address by using CIDR notation. For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To configure AWS WAF to allow, block, or count requests that originated
     * from the IP address 192.0.2.44, specify <code>192.0.2.44/32</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To configure AWS WAF to allow, block, or count requests that originated
     * from IP addresses from 192.0.2.0 to 192.0.2.255, specify
     * <code>192.0.2.0/24</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about CIDR notation, see the Wikipedia entry <a
     * href=
     * "https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing">Classless
     * Inter-Domain Routing</a>.
     * </p>
     * <p>
     * Specify an IPv6 address by using CIDR notation. For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To configure AWS WAF to allow, block, or count requests that originated
     * from the IP address 1111:0000:0000:0000:0000:0000:0000:0111, specify
     * <code>1111:0000:0000:0000:0000:0000:0000:0111/128</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To configure AWS WAF to allow, block, or count requests that originated
     * from IP addresses 1111:0000:0000:0000:0000:0000:0000:0000 to
     * 1111:0000:0000:0000:ffff:ffff:ffff:ffff, specify
     * <code>1111:0000:0000:0000:0000:0000:0000:0000/64</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param value <p>
     *            Specify an IPv4 address by using CIDR notation. For example:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            To configure AWS WAF to allow, block, or count requests that
     *            originated from the IP address 192.0.2.44, specify
     *            <code>192.0.2.44/32</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            To configure AWS WAF to allow, block, or count requests that
     *            originated from IP addresses from 192.0.2.0 to 192.0.2.255,
     *            specify <code>192.0.2.0/24</code>.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For more information about CIDR notation, see the Wikipedia
     *            entry <a href=
     *            "https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing"
     *            >Classless Inter-Domain Routing</a>.
     *            </p>
     *            <p>
     *            Specify an IPv6 address by using CIDR notation. For example:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            To configure AWS WAF to allow, block, or count requests that
     *            originated from the IP address
     *            1111:0000:0000:0000:0000:0000:0000:0111, specify
     *            <code>1111:0000:0000:0000:0000:0000:0000:0111/128</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            To configure AWS WAF to allow, block, or count requests that
     *            originated from IP addresses
     *            1111:0000:0000:0000:0000:0000:0000:0000 to
     *            1111:0000:0000:0000:ffff:ffff:ffff:ffff, specify
     *            <code>1111:0000:0000:0000:0000:0000:0000:0000/64</code>.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IPSetDescriptor withValue(String value) {
        this.value = value;
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
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getValue() != null)
            sb.append("Value: " + getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IPSetDescriptor == false)
            return false;
        IPSetDescriptor other = (IPSetDescriptor) obj;

        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }
}
