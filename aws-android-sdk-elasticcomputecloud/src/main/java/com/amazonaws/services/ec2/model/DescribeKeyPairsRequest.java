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
 * Describes the specified key pairs or all of your key pairs.
 * </p>
 * <p>
 * For more information about key pairs, see <a href=
 * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-key-pairs.html">Key
 * Pairs</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
 * </p>
 */
public class DescribeKeyPairsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>key-pair-id</code> - The ID of the key pair.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>fingerprint</code> - The fingerprint of the key pair.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>key-name</code> - The name of the key pair.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-key</code> - The key of a tag assigned to the resource. Use
     * this filter to find all resources assigned a tag with a specific key,
     * regardless of the tag value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag</code>:&lt;key&gt; - The key/value combination of a tag
     * assigned to the resource. Use the tag key in the filter name and the tag
     * value as the filter value. For example, to find all resources that have a
     * tag with the key <code>Owner</code> and the value <code>TeamA</code>,
     * specify <code>tag:Owner</code> for the filter name and <code>TeamA</code>
     * for the filter value.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<Filter> filters;

    /**
     * <p>
     * The key pair names.
     * </p>
     * <p>
     * Default: Describes all your key pairs.
     * </p>
     */
    private java.util.List<String> keyNames;

    /**
     * <p>
     * The IDs of the key pairs.
     * </p>
     */
    private java.util.List<String> keyPairIds;

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
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>key-pair-id</code> - The ID of the key pair.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>fingerprint</code> - The fingerprint of the key pair.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>key-name</code> - The name of the key pair.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-key</code> - The key of a tag assigned to the resource. Use
     * this filter to find all resources assigned a tag with a specific key,
     * regardless of the tag value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag</code>:&lt;key&gt; - The key/value combination of a tag
     * assigned to the resource. Use the tag key in the filter name and the tag
     * value as the filter value. For example, to find all resources that have a
     * tag with the key <code>Owner</code> and the value <code>TeamA</code>,
     * specify <code>tag:Owner</code> for the filter name and <code>TeamA</code>
     * for the filter value.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The filters.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>key-pair-id</code> - The ID of the key pair.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>fingerprint</code> - The fingerprint of the key pair.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>key-name</code> - The name of the key pair.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>tag-key</code> - The key of a tag assigned to the resource.
     *         Use this filter to find all resources assigned a tag with a
     *         specific key, regardless of the tag value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>tag</code>:&lt;key&gt; - The key/value combination of a tag
     *         assigned to the resource. Use the tag key in the filter name and
     *         the tag value as the filter value. For example, to find all
     *         resources that have a tag with the key <code>Owner</code> and the
     *         value <code>TeamA</code>, specify <code>tag:Owner</code> for the
     *         filter name and <code>TeamA</code> for the filter value.
     *         </p>
     *         </li>
     *         </ul>
     */
    public java.util.List<Filter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>key-pair-id</code> - The ID of the key pair.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>fingerprint</code> - The fingerprint of the key pair.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>key-name</code> - The name of the key pair.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-key</code> - The key of a tag assigned to the resource. Use
     * this filter to find all resources assigned a tag with a specific key,
     * regardless of the tag value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag</code>:&lt;key&gt; - The key/value combination of a tag
     * assigned to the resource. Use the tag key in the filter name and the tag
     * value as the filter value. For example, to find all resources that have a
     * tag with the key <code>Owner</code> and the value <code>TeamA</code>,
     * specify <code>tag:Owner</code> for the filter name and <code>TeamA</code>
     * for the filter value.
     * </p>
     * </li>
     * </ul>
     *
     * @param filters <p>
     *            The filters.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>key-pair-id</code> - The ID of the key pair.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>fingerprint</code> - The fingerprint of the key pair.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>key-name</code> - The name of the key pair.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>tag-key</code> - The key of a tag assigned to the
     *            resource. Use this filter to find all resources assigned a tag
     *            with a specific key, regardless of the tag value.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>tag</code>:&lt;key&gt; - The key/value combination of a
     *            tag assigned to the resource. Use the tag key in the filter
     *            name and the tag value as the filter value. For example, to
     *            find all resources that have a tag with the key
     *            <code>Owner</code> and the value <code>TeamA</code>, specify
     *            <code>tag:Owner</code> for the filter name and
     *            <code>TeamA</code> for the filter value.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<Filter>(filters);
    }

    /**
     * <p>
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>key-pair-id</code> - The ID of the key pair.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>fingerprint</code> - The fingerprint of the key pair.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>key-name</code> - The name of the key pair.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-key</code> - The key of a tag assigned to the resource. Use
     * this filter to find all resources assigned a tag with a specific key,
     * regardless of the tag value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag</code>:&lt;key&gt; - The key/value combination of a tag
     * assigned to the resource. Use the tag key in the filter name and the tag
     * value as the filter value. For example, to find all resources that have a
     * tag with the key <code>Owner</code> and the value <code>TeamA</code>,
     * specify <code>tag:Owner</code> for the filter name and <code>TeamA</code>
     * for the filter value.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filters <p>
     *            The filters.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>key-pair-id</code> - The ID of the key pair.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>fingerprint</code> - The fingerprint of the key pair.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>key-name</code> - The name of the key pair.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>tag-key</code> - The key of a tag assigned to the
     *            resource. Use this filter to find all resources assigned a tag
     *            with a specific key, regardless of the tag value.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>tag</code>:&lt;key&gt; - The key/value combination of a
     *            tag assigned to the resource. Use the tag key in the filter
     *            name and the tag value as the filter value. For example, to
     *            find all resources that have a tag with the key
     *            <code>Owner</code> and the value <code>TeamA</code>, specify
     *            <code>tag:Owner</code> for the filter name and
     *            <code>TeamA</code> for the filter value.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeKeyPairsRequest withFilters(Filter... filters) {
        if (getFilters() == null) {
            this.filters = new java.util.ArrayList<Filter>(filters.length);
        }
        for (Filter value : filters) {
            this.filters.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>key-pair-id</code> - The ID of the key pair.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>fingerprint</code> - The fingerprint of the key pair.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>key-name</code> - The name of the key pair.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-key</code> - The key of a tag assigned to the resource. Use
     * this filter to find all resources assigned a tag with a specific key,
     * regardless of the tag value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag</code>:&lt;key&gt; - The key/value combination of a tag
     * assigned to the resource. Use the tag key in the filter name and the tag
     * value as the filter value. For example, to find all resources that have a
     * tag with the key <code>Owner</code> and the value <code>TeamA</code>,
     * specify <code>tag:Owner</code> for the filter name and <code>TeamA</code>
     * for the filter value.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filters <p>
     *            The filters.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>key-pair-id</code> - The ID of the key pair.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>fingerprint</code> - The fingerprint of the key pair.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>key-name</code> - The name of the key pair.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>tag-key</code> - The key of a tag assigned to the
     *            resource. Use this filter to find all resources assigned a tag
     *            with a specific key, regardless of the tag value.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>tag</code>:&lt;key&gt; - The key/value combination of a
     *            tag assigned to the resource. Use the tag key in the filter
     *            name and the tag value as the filter value. For example, to
     *            find all resources that have a tag with the key
     *            <code>Owner</code> and the value <code>TeamA</code>, specify
     *            <code>tag:Owner</code> for the filter name and
     *            <code>TeamA</code> for the filter value.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeKeyPairsRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The key pair names.
     * </p>
     * <p>
     * Default: Describes all your key pairs.
     * </p>
     *
     * @return <p>
     *         The key pair names.
     *         </p>
     *         <p>
     *         Default: Describes all your key pairs.
     *         </p>
     */
    public java.util.List<String> getKeyNames() {
        return keyNames;
    }

    /**
     * <p>
     * The key pair names.
     * </p>
     * <p>
     * Default: Describes all your key pairs.
     * </p>
     *
     * @param keyNames <p>
     *            The key pair names.
     *            </p>
     *            <p>
     *            Default: Describes all your key pairs.
     *            </p>
     */
    public void setKeyNames(java.util.Collection<String> keyNames) {
        if (keyNames == null) {
            this.keyNames = null;
            return;
        }

        this.keyNames = new java.util.ArrayList<String>(keyNames);
    }

    /**
     * <p>
     * The key pair names.
     * </p>
     * <p>
     * Default: Describes all your key pairs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param keyNames <p>
     *            The key pair names.
     *            </p>
     *            <p>
     *            Default: Describes all your key pairs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeKeyPairsRequest withKeyNames(String... keyNames) {
        if (getKeyNames() == null) {
            this.keyNames = new java.util.ArrayList<String>(keyNames.length);
        }
        for (String value : keyNames) {
            this.keyNames.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The key pair names.
     * </p>
     * <p>
     * Default: Describes all your key pairs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param keyNames <p>
     *            The key pair names.
     *            </p>
     *            <p>
     *            Default: Describes all your key pairs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeKeyPairsRequest withKeyNames(java.util.Collection<String> keyNames) {
        setKeyNames(keyNames);
        return this;
    }

    /**
     * <p>
     * The IDs of the key pairs.
     * </p>
     *
     * @return <p>
     *         The IDs of the key pairs.
     *         </p>
     */
    public java.util.List<String> getKeyPairIds() {
        return keyPairIds;
    }

    /**
     * <p>
     * The IDs of the key pairs.
     * </p>
     *
     * @param keyPairIds <p>
     *            The IDs of the key pairs.
     *            </p>
     */
    public void setKeyPairIds(java.util.Collection<String> keyPairIds) {
        if (keyPairIds == null) {
            this.keyPairIds = null;
            return;
        }

        this.keyPairIds = new java.util.ArrayList<String>(keyPairIds);
    }

    /**
     * <p>
     * The IDs of the key pairs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param keyPairIds <p>
     *            The IDs of the key pairs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeKeyPairsRequest withKeyPairIds(String... keyPairIds) {
        if (getKeyPairIds() == null) {
            this.keyPairIds = new java.util.ArrayList<String>(keyPairIds.length);
        }
        for (String value : keyPairIds) {
            this.keyPairIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the key pairs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param keyPairIds <p>
     *            The IDs of the key pairs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeKeyPairsRequest withKeyPairIds(java.util.Collection<String> keyPairIds) {
        setKeyPairIds(keyPairIds);
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
    public DescribeKeyPairsRequest withDryRun(Boolean dryRun) {
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
        if (getFilters() != null)
            sb.append("Filters: " + getFilters() + ",");
        if (getKeyNames() != null)
            sb.append("KeyNames: " + getKeyNames() + ",");
        if (getKeyPairIds() != null)
            sb.append("KeyPairIds: " + getKeyPairIds() + ",");
        if (getDryRun() != null)
            sb.append("DryRun: " + getDryRun());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getKeyNames() == null) ? 0 : getKeyNames().hashCode());
        hashCode = prime * hashCode + ((getKeyPairIds() == null) ? 0 : getKeyPairIds().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeKeyPairsRequest == false)
            return false;
        DescribeKeyPairsRequest other = (DescribeKeyPairsRequest) obj;

        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getKeyNames() == null ^ this.getKeyNames() == null)
            return false;
        if (other.getKeyNames() != null && other.getKeyNames().equals(this.getKeyNames()) == false)
            return false;
        if (other.getKeyPairIds() == null ^ this.getKeyPairIds() == null)
            return false;
        if (other.getKeyPairIds() != null
                && other.getKeyPairIds().equals(this.getKeyPairIds()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        return true;
    }
}
