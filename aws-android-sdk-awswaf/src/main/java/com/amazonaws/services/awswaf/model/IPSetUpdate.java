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
 * Specifies the type of update to perform to an <a>IPSet</a> with
 * <a>UpdateIPSet</a>.
 * </p>
 */
public class IPSetUpdate implements Serializable {
    /**
     * <p>
     * Specifies whether to insert or delete an IP address with
     * <a>UpdateIPSet</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INSERT, DELETE
     */
    private String action;

    /**
     * <p>
     * The IP address type (<code>IPV4</code> or <code>IPV6</code>) and the IP
     * address range (in CIDR notation) that web requests originate from.
     * </p>
     */
    private IPSetDescriptor iPSetDescriptor;

    /**
     * <p>
     * Specifies whether to insert or delete an IP address with
     * <a>UpdateIPSet</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INSERT, DELETE
     *
     * @return <p>
     *         Specifies whether to insert or delete an IP address with
     *         <a>UpdateIPSet</a>.
     *         </p>
     * @see ChangeAction
     */
    public String getAction() {
        return action;
    }

    /**
     * <p>
     * Specifies whether to insert or delete an IP address with
     * <a>UpdateIPSet</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INSERT, DELETE
     *
     * @param action <p>
     *            Specifies whether to insert or delete an IP address with
     *            <a>UpdateIPSet</a>.
     *            </p>
     * @see ChangeAction
     */
    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * Specifies whether to insert or delete an IP address with
     * <a>UpdateIPSet</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INSERT, DELETE
     *
     * @param action <p>
     *            Specifies whether to insert or delete an IP address with
     *            <a>UpdateIPSet</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ChangeAction
     */
    public IPSetUpdate withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * <p>
     * Specifies whether to insert or delete an IP address with
     * <a>UpdateIPSet</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INSERT, DELETE
     *
     * @param action <p>
     *            Specifies whether to insert or delete an IP address with
     *            <a>UpdateIPSet</a>.
     *            </p>
     * @see ChangeAction
     */
    public void setAction(ChangeAction action) {
        this.action = action.toString();
    }

    /**
     * <p>
     * Specifies whether to insert or delete an IP address with
     * <a>UpdateIPSet</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INSERT, DELETE
     *
     * @param action <p>
     *            Specifies whether to insert or delete an IP address with
     *            <a>UpdateIPSet</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ChangeAction
     */
    public IPSetUpdate withAction(ChangeAction action) {
        this.action = action.toString();
        return this;
    }

    /**
     * <p>
     * The IP address type (<code>IPV4</code> or <code>IPV6</code>) and the IP
     * address range (in CIDR notation) that web requests originate from.
     * </p>
     *
     * @return <p>
     *         The IP address type (<code>IPV4</code> or <code>IPV6</code>) and
     *         the IP address range (in CIDR notation) that web requests
     *         originate from.
     *         </p>
     */
    public IPSetDescriptor getIPSetDescriptor() {
        return iPSetDescriptor;
    }

    /**
     * <p>
     * The IP address type (<code>IPV4</code> or <code>IPV6</code>) and the IP
     * address range (in CIDR notation) that web requests originate from.
     * </p>
     *
     * @param iPSetDescriptor <p>
     *            The IP address type (<code>IPV4</code> or <code>IPV6</code>)
     *            and the IP address range (in CIDR notation) that web requests
     *            originate from.
     *            </p>
     */
    public void setIPSetDescriptor(IPSetDescriptor iPSetDescriptor) {
        this.iPSetDescriptor = iPSetDescriptor;
    }

    /**
     * <p>
     * The IP address type (<code>IPV4</code> or <code>IPV6</code>) and the IP
     * address range (in CIDR notation) that web requests originate from.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param iPSetDescriptor <p>
     *            The IP address type (<code>IPV4</code> or <code>IPV6</code>)
     *            and the IP address range (in CIDR notation) that web requests
     *            originate from.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IPSetUpdate withIPSetDescriptor(IPSetDescriptor iPSetDescriptor) {
        this.iPSetDescriptor = iPSetDescriptor;
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
        if (getAction() != null)
            sb.append("Action: " + getAction() + ",");
        if (getIPSetDescriptor() != null)
            sb.append("IPSetDescriptor: " + getIPSetDescriptor());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode
                + ((getIPSetDescriptor() == null) ? 0 : getIPSetDescriptor().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IPSetUpdate == false)
            return false;
        IPSetUpdate other = (IPSetUpdate) obj;

        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getIPSetDescriptor() == null ^ this.getIPSetDescriptor() == null)
            return false;
        if (other.getIPSetDescriptor() != null
                && other.getIPSetDescriptor().equals(this.getIPSetDescriptor()) == false)
            return false;
        return true;
    }
}
