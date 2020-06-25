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
 * Describes the specified placement groups or all of your placement groups. For
 * more information, see <a href=
 * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/placement-groups.html"
 * >Placement groups</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
 * </p>
 */
public class DescribePlacementGroupsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>group-name</code> - The name of the placement group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the placement group (
     * <code>pending</code> | <code>available</code> | <code>deleting</code> |
     * <code>deleted</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>strategy</code> - The strategy of the placement group (
     * <code>cluster</code> | <code>spread</code> | <code>partition</code>).
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
     * <li>
     * <p>
     * <code>tag-key</code> - The key of a tag assigned to the resource. Use
     * this filter to find all resources that have a tag with a specific key,
     * regardless of the tag value.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<Filter> filters;

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
     * The names of the placement groups.
     * </p>
     * <p>
     * Default: Describes all your placement groups, or only those otherwise
     * specified.
     * </p>
     */
    private java.util.List<String> groupNames;

    /**
     * <p>
     * The IDs of the placement groups.
     * </p>
     */
    private java.util.List<String> groupIds;

    /**
     * <p>
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>group-name</code> - The name of the placement group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the placement group (
     * <code>pending</code> | <code>available</code> | <code>deleting</code> |
     * <code>deleted</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>strategy</code> - The strategy of the placement group (
     * <code>cluster</code> | <code>spread</code> | <code>partition</code>).
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
     * <li>
     * <p>
     * <code>tag-key</code> - The key of a tag assigned to the resource. Use
     * this filter to find all resources that have a tag with a specific key,
     * regardless of the tag value.
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
     *         <code>group-name</code> - The name of the placement group.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>state</code> - The state of the placement group (
     *         <code>pending</code> | <code>available</code> |
     *         <code>deleting</code> | <code>deleted</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>strategy</code> - The strategy of the placement group (
     *         <code>cluster</code> | <code>spread</code> |
     *         <code>partition</code>).
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
     *         <li>
     *         <p>
     *         <code>tag-key</code> - The key of a tag assigned to the resource.
     *         Use this filter to find all resources that have a tag with a
     *         specific key, regardless of the tag value.
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
     * <code>group-name</code> - The name of the placement group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the placement group (
     * <code>pending</code> | <code>available</code> | <code>deleting</code> |
     * <code>deleted</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>strategy</code> - The strategy of the placement group (
     * <code>cluster</code> | <code>spread</code> | <code>partition</code>).
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
     * <li>
     * <p>
     * <code>tag-key</code> - The key of a tag assigned to the resource. Use
     * this filter to find all resources that have a tag with a specific key,
     * regardless of the tag value.
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
     *            <code>group-name</code> - The name of the placement group.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>state</code> - The state of the placement group (
     *            <code>pending</code> | <code>available</code> |
     *            <code>deleting</code> | <code>deleted</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>strategy</code> - The strategy of the placement group (
     *            <code>cluster</code> | <code>spread</code> |
     *            <code>partition</code>).
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
     *            <li>
     *            <p>
     *            <code>tag-key</code> - The key of a tag assigned to the
     *            resource. Use this filter to find all resources that have a
     *            tag with a specific key, regardless of the tag value.
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
     * <code>group-name</code> - The name of the placement group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the placement group (
     * <code>pending</code> | <code>available</code> | <code>deleting</code> |
     * <code>deleted</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>strategy</code> - The strategy of the placement group (
     * <code>cluster</code> | <code>spread</code> | <code>partition</code>).
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
     * <li>
     * <p>
     * <code>tag-key</code> - The key of a tag assigned to the resource. Use
     * this filter to find all resources that have a tag with a specific key,
     * regardless of the tag value.
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
     *            <code>group-name</code> - The name of the placement group.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>state</code> - The state of the placement group (
     *            <code>pending</code> | <code>available</code> |
     *            <code>deleting</code> | <code>deleted</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>strategy</code> - The strategy of the placement group (
     *            <code>cluster</code> | <code>spread</code> |
     *            <code>partition</code>).
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
     *            <li>
     *            <p>
     *            <code>tag-key</code> - The key of a tag assigned to the
     *            resource. Use this filter to find all resources that have a
     *            tag with a specific key, regardless of the tag value.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribePlacementGroupsRequest withFilters(Filter... filters) {
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
     * <code>group-name</code> - The name of the placement group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the placement group (
     * <code>pending</code> | <code>available</code> | <code>deleting</code> |
     * <code>deleted</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>strategy</code> - The strategy of the placement group (
     * <code>cluster</code> | <code>spread</code> | <code>partition</code>).
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
     * <li>
     * <p>
     * <code>tag-key</code> - The key of a tag assigned to the resource. Use
     * this filter to find all resources that have a tag with a specific key,
     * regardless of the tag value.
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
     *            <code>group-name</code> - The name of the placement group.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>state</code> - The state of the placement group (
     *            <code>pending</code> | <code>available</code> |
     *            <code>deleting</code> | <code>deleted</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>strategy</code> - The strategy of the placement group (
     *            <code>cluster</code> | <code>spread</code> |
     *            <code>partition</code>).
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
     *            <li>
     *            <p>
     *            <code>tag-key</code> - The key of a tag assigned to the
     *            resource. Use this filter to find all resources that have a
     *            tag with a specific key, regardless of the tag value.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribePlacementGroupsRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
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
    public DescribePlacementGroupsRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    /**
     * <p>
     * The names of the placement groups.
     * </p>
     * <p>
     * Default: Describes all your placement groups, or only those otherwise
     * specified.
     * </p>
     *
     * @return <p>
     *         The names of the placement groups.
     *         </p>
     *         <p>
     *         Default: Describes all your placement groups, or only those
     *         otherwise specified.
     *         </p>
     */
    public java.util.List<String> getGroupNames() {
        return groupNames;
    }

    /**
     * <p>
     * The names of the placement groups.
     * </p>
     * <p>
     * Default: Describes all your placement groups, or only those otherwise
     * specified.
     * </p>
     *
     * @param groupNames <p>
     *            The names of the placement groups.
     *            </p>
     *            <p>
     *            Default: Describes all your placement groups, or only those
     *            otherwise specified.
     *            </p>
     */
    public void setGroupNames(java.util.Collection<String> groupNames) {
        if (groupNames == null) {
            this.groupNames = null;
            return;
        }

        this.groupNames = new java.util.ArrayList<String>(groupNames);
    }

    /**
     * <p>
     * The names of the placement groups.
     * </p>
     * <p>
     * Default: Describes all your placement groups, or only those otherwise
     * specified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param groupNames <p>
     *            The names of the placement groups.
     *            </p>
     *            <p>
     *            Default: Describes all your placement groups, or only those
     *            otherwise specified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribePlacementGroupsRequest withGroupNames(String... groupNames) {
        if (getGroupNames() == null) {
            this.groupNames = new java.util.ArrayList<String>(groupNames.length);
        }
        for (String value : groupNames) {
            this.groupNames.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The names of the placement groups.
     * </p>
     * <p>
     * Default: Describes all your placement groups, or only those otherwise
     * specified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param groupNames <p>
     *            The names of the placement groups.
     *            </p>
     *            <p>
     *            Default: Describes all your placement groups, or only those
     *            otherwise specified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribePlacementGroupsRequest withGroupNames(java.util.Collection<String> groupNames) {
        setGroupNames(groupNames);
        return this;
    }

    /**
     * <p>
     * The IDs of the placement groups.
     * </p>
     *
     * @return <p>
     *         The IDs of the placement groups.
     *         </p>
     */
    public java.util.List<String> getGroupIds() {
        return groupIds;
    }

    /**
     * <p>
     * The IDs of the placement groups.
     * </p>
     *
     * @param groupIds <p>
     *            The IDs of the placement groups.
     *            </p>
     */
    public void setGroupIds(java.util.Collection<String> groupIds) {
        if (groupIds == null) {
            this.groupIds = null;
            return;
        }

        this.groupIds = new java.util.ArrayList<String>(groupIds);
    }

    /**
     * <p>
     * The IDs of the placement groups.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param groupIds <p>
     *            The IDs of the placement groups.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribePlacementGroupsRequest withGroupIds(String... groupIds) {
        if (getGroupIds() == null) {
            this.groupIds = new java.util.ArrayList<String>(groupIds.length);
        }
        for (String value : groupIds) {
            this.groupIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the placement groups.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param groupIds <p>
     *            The IDs of the placement groups.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribePlacementGroupsRequest withGroupIds(java.util.Collection<String> groupIds) {
        setGroupIds(groupIds);
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
        if (getDryRun() != null)
            sb.append("DryRun: " + getDryRun() + ",");
        if (getGroupNames() != null)
            sb.append("GroupNames: " + getGroupNames() + ",");
        if (getGroupIds() != null)
            sb.append("GroupIds: " + getGroupIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        hashCode = prime * hashCode + ((getGroupNames() == null) ? 0 : getGroupNames().hashCode());
        hashCode = prime * hashCode + ((getGroupIds() == null) ? 0 : getGroupIds().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribePlacementGroupsRequest == false)
            return false;
        DescribePlacementGroupsRequest other = (DescribePlacementGroupsRequest) obj;

        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        if (other.getGroupNames() == null ^ this.getGroupNames() == null)
            return false;
        if (other.getGroupNames() != null
                && other.getGroupNames().equals(this.getGroupNames()) == false)
            return false;
        if (other.getGroupIds() == null ^ this.getGroupIds() == null)
            return false;
        if (other.getGroupIds() != null && other.getGroupIds().equals(this.getGroupIds()) == false)
            return false;
        return true;
    }
}
