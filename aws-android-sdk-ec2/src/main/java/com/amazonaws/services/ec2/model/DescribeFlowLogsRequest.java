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
 * Describes one or more flow logs. To view the information in your flow logs
 * (the log streams for the network interfaces), you must use the CloudWatch
 * Logs console or the CloudWatch Logs API.
 * </p>
 */
public class DescribeFlowLogsRequest extends AmazonWebServiceRequest implements Serializable {
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
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>deliver-log-status</code> - The status of the logs delivery (
     * <code>SUCCESS</code> | <code>FAILED</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>log-destination-type</code> - The type of destination to which the
     * flow log publishes data. Possible destination types include
     * <code>cloud-watch-logs</code> and <code>S3</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>flow-log-id</code> - The ID of the flow log.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>log-group-name</code> - The name of the log group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>resource-id</code> - The ID of the VPC, subnet, or network
     * interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>traffic-type</code> - The type of traffic (<code>ACCEPT</code> |
     * <code>REJECT</code> | <code>ALL</code>).
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
     * this filter to find all resources assigned a tag with a specific key,
     * regardless of the tag value.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<Filter> filter;

    /**
     * <p>
     * One or more flow log IDs.
     * </p>
     * <p>
     * Constraint: Maximum of 1000 flow log IDs.
     * </p>
     */
    private java.util.List<String> flowLogIds;

    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve
     * the remaining results, make another call with the returned
     * <code>nextToken</code> value.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     */
    private String nextToken;

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
    public DescribeFlowLogsRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>deliver-log-status</code> - The status of the logs delivery (
     * <code>SUCCESS</code> | <code>FAILED</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>log-destination-type</code> - The type of destination to which the
     * flow log publishes data. Possible destination types include
     * <code>cloud-watch-logs</code> and <code>S3</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>flow-log-id</code> - The ID of the flow log.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>log-group-name</code> - The name of the log group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>resource-id</code> - The ID of the VPC, subnet, or network
     * interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>traffic-type</code> - The type of traffic (<code>ACCEPT</code> |
     * <code>REJECT</code> | <code>ALL</code>).
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
     * this filter to find all resources assigned a tag with a specific key,
     * regardless of the tag value.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         One or more filters.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>deliver-log-status</code> - The status of the logs delivery
     *         (<code>SUCCESS</code> | <code>FAILED</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>log-destination-type</code> - The type of destination to
     *         which the flow log publishes data. Possible destination types
     *         include <code>cloud-watch-logs</code> and <code>S3</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>flow-log-id</code> - The ID of the flow log.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>log-group-name</code> - The name of the log group.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>resource-id</code> - The ID of the VPC, subnet, or network
     *         interface.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>traffic-type</code> - The type of traffic (
     *         <code>ACCEPT</code> | <code>REJECT</code> | <code>ALL</code>).
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
     *         Use this filter to find all resources assigned a tag with a
     *         specific key, regardless of the tag value.
     *         </p>
     *         </li>
     *         </ul>
     */
    public java.util.List<Filter> getFilter() {
        return filter;
    }

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>deliver-log-status</code> - The status of the logs delivery (
     * <code>SUCCESS</code> | <code>FAILED</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>log-destination-type</code> - The type of destination to which the
     * flow log publishes data. Possible destination types include
     * <code>cloud-watch-logs</code> and <code>S3</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>flow-log-id</code> - The ID of the flow log.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>log-group-name</code> - The name of the log group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>resource-id</code> - The ID of the VPC, subnet, or network
     * interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>traffic-type</code> - The type of traffic (<code>ACCEPT</code> |
     * <code>REJECT</code> | <code>ALL</code>).
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
     * this filter to find all resources assigned a tag with a specific key,
     * regardless of the tag value.
     * </p>
     * </li>
     * </ul>
     *
     * @param filter <p>
     *            One or more filters.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>deliver-log-status</code> - The status of the logs
     *            delivery (<code>SUCCESS</code> | <code>FAILED</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>log-destination-type</code> - The type of destination to
     *            which the flow log publishes data. Possible destination types
     *            include <code>cloud-watch-logs</code> and <code>S3</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>flow-log-id</code> - The ID of the flow log.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>log-group-name</code> - The name of the log group.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>resource-id</code> - The ID of the VPC, subnet, or
     *            network interface.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>traffic-type</code> - The type of traffic (
     *            <code>ACCEPT</code> | <code>REJECT</code> | <code>ALL</code>).
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
     *            resource. Use this filter to find all resources assigned a tag
     *            with a specific key, regardless of the tag value.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setFilter(java.util.Collection<Filter> filter) {
        if (filter == null) {
            this.filter = null;
            return;
        }

        this.filter = new java.util.ArrayList<Filter>(filter);
    }

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>deliver-log-status</code> - The status of the logs delivery (
     * <code>SUCCESS</code> | <code>FAILED</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>log-destination-type</code> - The type of destination to which the
     * flow log publishes data. Possible destination types include
     * <code>cloud-watch-logs</code> and <code>S3</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>flow-log-id</code> - The ID of the flow log.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>log-group-name</code> - The name of the log group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>resource-id</code> - The ID of the VPC, subnet, or network
     * interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>traffic-type</code> - The type of traffic (<code>ACCEPT</code> |
     * <code>REJECT</code> | <code>ALL</code>).
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
     * this filter to find all resources assigned a tag with a specific key,
     * regardless of the tag value.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filter <p>
     *            One or more filters.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>deliver-log-status</code> - The status of the logs
     *            delivery (<code>SUCCESS</code> | <code>FAILED</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>log-destination-type</code> - The type of destination to
     *            which the flow log publishes data. Possible destination types
     *            include <code>cloud-watch-logs</code> and <code>S3</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>flow-log-id</code> - The ID of the flow log.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>log-group-name</code> - The name of the log group.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>resource-id</code> - The ID of the VPC, subnet, or
     *            network interface.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>traffic-type</code> - The type of traffic (
     *            <code>ACCEPT</code> | <code>REJECT</code> | <code>ALL</code>).
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
     *            resource. Use this filter to find all resources assigned a tag
     *            with a specific key, regardless of the tag value.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeFlowLogsRequest withFilter(Filter... filter) {
        if (getFilter() == null) {
            this.filter = new java.util.ArrayList<Filter>(filter.length);
        }
        for (Filter value : filter) {
            this.filter.add(value);
        }
        return this;
    }

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>deliver-log-status</code> - The status of the logs delivery (
     * <code>SUCCESS</code> | <code>FAILED</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>log-destination-type</code> - The type of destination to which the
     * flow log publishes data. Possible destination types include
     * <code>cloud-watch-logs</code> and <code>S3</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>flow-log-id</code> - The ID of the flow log.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>log-group-name</code> - The name of the log group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>resource-id</code> - The ID of the VPC, subnet, or network
     * interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>traffic-type</code> - The type of traffic (<code>ACCEPT</code> |
     * <code>REJECT</code> | <code>ALL</code>).
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
     * this filter to find all resources assigned a tag with a specific key,
     * regardless of the tag value.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filter <p>
     *            One or more filters.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>deliver-log-status</code> - The status of the logs
     *            delivery (<code>SUCCESS</code> | <code>FAILED</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>log-destination-type</code> - The type of destination to
     *            which the flow log publishes data. Possible destination types
     *            include <code>cloud-watch-logs</code> and <code>S3</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>flow-log-id</code> - The ID of the flow log.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>log-group-name</code> - The name of the log group.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>resource-id</code> - The ID of the VPC, subnet, or
     *            network interface.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>traffic-type</code> - The type of traffic (
     *            <code>ACCEPT</code> | <code>REJECT</code> | <code>ALL</code>).
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
     *            resource. Use this filter to find all resources assigned a tag
     *            with a specific key, regardless of the tag value.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeFlowLogsRequest withFilter(java.util.Collection<Filter> filter) {
        setFilter(filter);
        return this;
    }

    /**
     * <p>
     * One or more flow log IDs.
     * </p>
     * <p>
     * Constraint: Maximum of 1000 flow log IDs.
     * </p>
     *
     * @return <p>
     *         One or more flow log IDs.
     *         </p>
     *         <p>
     *         Constraint: Maximum of 1000 flow log IDs.
     *         </p>
     */
    public java.util.List<String> getFlowLogIds() {
        return flowLogIds;
    }

    /**
     * <p>
     * One or more flow log IDs.
     * </p>
     * <p>
     * Constraint: Maximum of 1000 flow log IDs.
     * </p>
     *
     * @param flowLogIds <p>
     *            One or more flow log IDs.
     *            </p>
     *            <p>
     *            Constraint: Maximum of 1000 flow log IDs.
     *            </p>
     */
    public void setFlowLogIds(java.util.Collection<String> flowLogIds) {
        if (flowLogIds == null) {
            this.flowLogIds = null;
            return;
        }

        this.flowLogIds = new java.util.ArrayList<String>(flowLogIds);
    }

    /**
     * <p>
     * One or more flow log IDs.
     * </p>
     * <p>
     * Constraint: Maximum of 1000 flow log IDs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param flowLogIds <p>
     *            One or more flow log IDs.
     *            </p>
     *            <p>
     *            Constraint: Maximum of 1000 flow log IDs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeFlowLogsRequest withFlowLogIds(String... flowLogIds) {
        if (getFlowLogIds() == null) {
            this.flowLogIds = new java.util.ArrayList<String>(flowLogIds.length);
        }
        for (String value : flowLogIds) {
            this.flowLogIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * One or more flow log IDs.
     * </p>
     * <p>
     * Constraint: Maximum of 1000 flow log IDs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param flowLogIds <p>
     *            One or more flow log IDs.
     *            </p>
     *            <p>
     *            Constraint: Maximum of 1000 flow log IDs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeFlowLogsRequest withFlowLogIds(java.util.Collection<String> flowLogIds) {
        setFlowLogIds(flowLogIds);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve
     * the remaining results, make another call with the returned
     * <code>nextToken</code> value.
     * </p>
     *
     * @return <p>
     *         The maximum number of results to return with a single call. To
     *         retrieve the remaining results, make another call with the
     *         returned <code>nextToken</code> value.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve
     * the remaining results, make another call with the returned
     * <code>nextToken</code> value.
     * </p>
     *
     * @param maxResults <p>
     *            The maximum number of results to return with a single call. To
     *            retrieve the remaining results, make another call with the
     *            returned <code>nextToken</code> value.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve
     * the remaining results, make another call with the returned
     * <code>nextToken</code> value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxResults <p>
     *            The maximum number of results to return with a single call. To
     *            retrieve the remaining results, make another call with the
     *            returned <code>nextToken</code> value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeFlowLogsRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     *
     * @return <p>
     *         The token for the next page of results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     *
     * @param nextToken <p>
     *            The token for the next page of results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The token for the next page of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeFlowLogsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getDryRun() != null)
            sb.append("DryRun: " + getDryRun() + ",");
        if (getFilter() != null)
            sb.append("Filter: " + getFilter() + ",");
        if (getFlowLogIds() != null)
            sb.append("FlowLogIds: " + getFlowLogIds() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        hashCode = prime * hashCode + ((getFilter() == null) ? 0 : getFilter().hashCode());
        hashCode = prime * hashCode + ((getFlowLogIds() == null) ? 0 : getFlowLogIds().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeFlowLogsRequest == false)
            return false;
        DescribeFlowLogsRequest other = (DescribeFlowLogsRequest) obj;

        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        if (other.getFilter() == null ^ this.getFilter() == null)
            return false;
        if (other.getFilter() != null && other.getFilter().equals(this.getFilter()) == false)
            return false;
        if (other.getFlowLogIds() == null ^ this.getFlowLogIds() == null)
            return false;
        if (other.getFlowLogIds() != null
                && other.getFlowLogIds().equals(this.getFlowLogIds()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null
                && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
