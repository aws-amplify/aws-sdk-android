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

import com.amazonaws.AmazonWebServiceRequest;

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
 * Inserts or deletes <a>IPSetDescriptor</a> objects in an <code>IPSet</code>.
 * For each <code>IPSetDescriptor</code> object, you specify the following
 * values:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Whether to insert or delete the object from the array. If you want to change
 * an <code>IPSetDescriptor</code> object, you delete the existing object and
 * add a new one.
 * </p>
 * </li>
 * <li>
 * <p>
 * The IP address version, <code>IPv4</code> or <code>IPv6</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * The IP address in CIDR notation, for example, <code>192.0.2.0/24</code> (for
 * the range of IP addresses from <code>192.0.2.0</code> to
 * <code>192.0.2.255</code>) or <code>192.0.2.44/32</code> (for the individual
 * IP address <code>192.0.2.44</code>).
 * </p>
 * </li>
 * </ul>
 * <p>
 * AWS WAF supports IPv4 address ranges: /8 and any range between /16 through
 * /32. AWS WAF supports IPv6 address ranges: /24, /32, /48, /56, /64, and /128.
 * For more information about CIDR notation, see the Wikipedia entry <a
 * href="https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing">Classless
 * Inter-Domain Routing</a>.
 * </p>
 * <p>
 * IPv6 addresses can be represented using any of the following formats:
 * </p>
 * <ul>
 * <li>
 * <p>
 * 1111:0000:0000:0000:0000:0000:0000:0111/128
 * </p>
 * </li>
 * <li>
 * <p>
 * 1111:0:0:0:0:0:0:0111/128
 * </p>
 * </li>
 * <li>
 * <p>
 * 1111::0111/128
 * </p>
 * </li>
 * <li>
 * <p>
 * 1111::111/128
 * </p>
 * </li>
 * </ul>
 * <p>
 * You use an <code>IPSet</code> to specify which web requests you want to allow
 * or block based on the IP addresses that the requests originated from. For
 * example, if you're receiving a lot of requests from one or a small number of
 * IP addresses and you want to block the requests, you can create an
 * <code>IPSet</code> that specifies those IP addresses, and then configure AWS
 * WAF to block the requests.
 * </p>
 * <p>
 * To create and configure an <code>IPSet</code>, perform the following steps:
 * </p>
 * <ol>
 * <li>
 * <p>
 * Submit a <a>CreateIPSet</a> request.
 * </p>
 * </li>
 * <li>
 * <p>
 * Use <a>GetChangeToken</a> to get the change token that you provide in the
 * <code>ChangeToken</code> parameter of an <a>UpdateIPSet</a> request.
 * </p>
 * </li>
 * <li>
 * <p>
 * Submit an <code>UpdateIPSet</code> request to specify the IP addresses that
 * you want AWS WAF to watch for.
 * </p>
 * </li>
 * </ol>
 * <p>
 * When you update an <code>IPSet</code>, you specify the IP addresses that you
 * want to add and/or the IP addresses that you want to delete. If you want to
 * change an IP address, you delete the existing IP address and add the new one.
 * </p>
 * <p>
 * You can insert a maximum of 1000 addresses in a single request.
 * </p>
 * <p>
 * For more information about how to use the AWS WAF API to allow or block HTTP
 * requests, see the <a
 * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF
 * Developer Guide</a>.
 * </p>
 */
public class UpdateIPSetRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The <code>IPSetId</code> of the <a>IPSet</a> that you want to update.
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
     * The value returned by the most recent call to <a>GetChangeToken</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String changeToken;

    /**
     * <p>
     * An array of <code>IPSetUpdate</code> objects that you want to insert into
     * or delete from an <a>IPSet</a>. For more information, see the applicable
     * data types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>IPSetUpdate</a>: Contains <code>Action</code> and
     * <code>IPSetDescriptor</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>IPSetDescriptor</a>: Contains <code>Type</code> and <code>Value</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can insert a maximum of 1000 addresses in a single request.
     * </p>
     */
    private java.util.List<IPSetUpdate> updates;

    /**
     * <p>
     * The <code>IPSetId</code> of the <a>IPSet</a> that you want to update.
     * <code>IPSetId</code> is returned by <a>CreateIPSet</a> and by
     * <a>ListIPSets</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The <code>IPSetId</code> of the <a>IPSet</a> that you want to
     *         update. <code>IPSetId</code> is returned by <a>CreateIPSet</a>
     *         and by <a>ListIPSets</a>.
     *         </p>
     */
    public String getIPSetId() {
        return iPSetId;
    }

    /**
     * <p>
     * The <code>IPSetId</code> of the <a>IPSet</a> that you want to update.
     * <code>IPSetId</code> is returned by <a>CreateIPSet</a> and by
     * <a>ListIPSets</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param iPSetId <p>
     *            The <code>IPSetId</code> of the <a>IPSet</a> that you want to
     *            update. <code>IPSetId</code> is returned by <a>CreateIPSet</a>
     *            and by <a>ListIPSets</a>.
     *            </p>
     */
    public void setIPSetId(String iPSetId) {
        this.iPSetId = iPSetId;
    }

    /**
     * <p>
     * The <code>IPSetId</code> of the <a>IPSet</a> that you want to update.
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
     *            The <code>IPSetId</code> of the <a>IPSet</a> that you want to
     *            update. <code>IPSetId</code> is returned by <a>CreateIPSet</a>
     *            and by <a>ListIPSets</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateIPSetRequest withIPSetId(String iPSetId) {
        this.iPSetId = iPSetId;
        return this;
    }

    /**
     * <p>
     * The value returned by the most recent call to <a>GetChangeToken</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The value returned by the most recent call to
     *         <a>GetChangeToken</a>.
     *         </p>
     */
    public String getChangeToken() {
        return changeToken;
    }

    /**
     * <p>
     * The value returned by the most recent call to <a>GetChangeToken</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param changeToken <p>
     *            The value returned by the most recent call to
     *            <a>GetChangeToken</a>.
     *            </p>
     */
    public void setChangeToken(String changeToken) {
        this.changeToken = changeToken;
    }

    /**
     * <p>
     * The value returned by the most recent call to <a>GetChangeToken</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param changeToken <p>
     *            The value returned by the most recent call to
     *            <a>GetChangeToken</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateIPSetRequest withChangeToken(String changeToken) {
        this.changeToken = changeToken;
        return this;
    }

    /**
     * <p>
     * An array of <code>IPSetUpdate</code> objects that you want to insert into
     * or delete from an <a>IPSet</a>. For more information, see the applicable
     * data types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>IPSetUpdate</a>: Contains <code>Action</code> and
     * <code>IPSetDescriptor</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>IPSetDescriptor</a>: Contains <code>Type</code> and <code>Value</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can insert a maximum of 1000 addresses in a single request.
     * </p>
     *
     * @return <p>
     *         An array of <code>IPSetUpdate</code> objects that you want to
     *         insert into or delete from an <a>IPSet</a>. For more information,
     *         see the applicable data types:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <a>IPSetUpdate</a>: Contains <code>Action</code> and
     *         <code>IPSetDescriptor</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <a>IPSetDescriptor</a>: Contains <code>Type</code> and
     *         <code>Value</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         You can insert a maximum of 1000 addresses in a single request.
     *         </p>
     */
    public java.util.List<IPSetUpdate> getUpdates() {
        return updates;
    }

    /**
     * <p>
     * An array of <code>IPSetUpdate</code> objects that you want to insert into
     * or delete from an <a>IPSet</a>. For more information, see the applicable
     * data types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>IPSetUpdate</a>: Contains <code>Action</code> and
     * <code>IPSetDescriptor</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>IPSetDescriptor</a>: Contains <code>Type</code> and <code>Value</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can insert a maximum of 1000 addresses in a single request.
     * </p>
     *
     * @param updates <p>
     *            An array of <code>IPSetUpdate</code> objects that you want to
     *            insert into or delete from an <a>IPSet</a>. For more
     *            information, see the applicable data types:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <a>IPSetUpdate</a>: Contains <code>Action</code> and
     *            <code>IPSetDescriptor</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>IPSetDescriptor</a>: Contains <code>Type</code> and
     *            <code>Value</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            You can insert a maximum of 1000 addresses in a single
     *            request.
     *            </p>
     */
    public void setUpdates(java.util.Collection<IPSetUpdate> updates) {
        if (updates == null) {
            this.updates = null;
            return;
        }

        this.updates = new java.util.ArrayList<IPSetUpdate>(updates);
    }

    /**
     * <p>
     * An array of <code>IPSetUpdate</code> objects that you want to insert into
     * or delete from an <a>IPSet</a>. For more information, see the applicable
     * data types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>IPSetUpdate</a>: Contains <code>Action</code> and
     * <code>IPSetDescriptor</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>IPSetDescriptor</a>: Contains <code>Type</code> and <code>Value</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can insert a maximum of 1000 addresses in a single request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param updates <p>
     *            An array of <code>IPSetUpdate</code> objects that you want to
     *            insert into or delete from an <a>IPSet</a>. For more
     *            information, see the applicable data types:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <a>IPSetUpdate</a>: Contains <code>Action</code> and
     *            <code>IPSetDescriptor</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>IPSetDescriptor</a>: Contains <code>Type</code> and
     *            <code>Value</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            You can insert a maximum of 1000 addresses in a single
     *            request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateIPSetRequest withUpdates(IPSetUpdate... updates) {
        if (getUpdates() == null) {
            this.updates = new java.util.ArrayList<IPSetUpdate>(updates.length);
        }
        for (IPSetUpdate value : updates) {
            this.updates.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>IPSetUpdate</code> objects that you want to insert into
     * or delete from an <a>IPSet</a>. For more information, see the applicable
     * data types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>IPSetUpdate</a>: Contains <code>Action</code> and
     * <code>IPSetDescriptor</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>IPSetDescriptor</a>: Contains <code>Type</code> and <code>Value</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can insert a maximum of 1000 addresses in a single request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param updates <p>
     *            An array of <code>IPSetUpdate</code> objects that you want to
     *            insert into or delete from an <a>IPSet</a>. For more
     *            information, see the applicable data types:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <a>IPSetUpdate</a>: Contains <code>Action</code> and
     *            <code>IPSetDescriptor</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>IPSetDescriptor</a>: Contains <code>Type</code> and
     *            <code>Value</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            You can insert a maximum of 1000 addresses in a single
     *            request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateIPSetRequest withUpdates(java.util.Collection<IPSetUpdate> updates) {
        setUpdates(updates);
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
        if (getChangeToken() != null)
            sb.append("ChangeToken: " + getChangeToken() + ",");
        if (getUpdates() != null)
            sb.append("Updates: " + getUpdates());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIPSetId() == null) ? 0 : getIPSetId().hashCode());
        hashCode = prime * hashCode
                + ((getChangeToken() == null) ? 0 : getChangeToken().hashCode());
        hashCode = prime * hashCode + ((getUpdates() == null) ? 0 : getUpdates().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateIPSetRequest == false)
            return false;
        UpdateIPSetRequest other = (UpdateIPSetRequest) obj;

        if (other.getIPSetId() == null ^ this.getIPSetId() == null)
            return false;
        if (other.getIPSetId() != null && other.getIPSetId().equals(this.getIPSetId()) == false)
            return false;
        if (other.getChangeToken() == null ^ this.getChangeToken() == null)
            return false;
        if (other.getChangeToken() != null
                && other.getChangeToken().equals(this.getChangeToken()) == false)
            return false;
        if (other.getUpdates() == null ^ this.getUpdates() == null)
            return false;
        if (other.getUpdates() != null && other.getUpdates().equals(this.getUpdates()) == false)
            return false;
        return true;
    }
}
