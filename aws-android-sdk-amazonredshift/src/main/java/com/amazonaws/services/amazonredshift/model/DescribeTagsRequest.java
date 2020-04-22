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

package com.amazonaws.services.amazonredshift.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns a list of tags. You can return tags from a specific resource by
 * specifying an ARN, or you can return all tags for a given type of resource,
 * such as clusters, snapshots, and so on.
 * </p>
 * <p>
 * The following are limitations for <code>DescribeTags</code>:
 * </p>
 * <ul>
 * <li>
 * <p>
 * You cannot specify an ARN and a resource-type value together in the same
 * request.
 * </p>
 * </li>
 * <li>
 * <p>
 * You cannot use the <code>MaxRecords</code> and <code>Marker</code> parameters
 * together with the ARN parameter.
 * </p>
 * </li>
 * <li>
 * <p>
 * The <code>MaxRecords</code> parameter can be a range from 10 to 50 results to
 * return in a request.
 * </p>
 * </li>
 * </ul>
 * <p>
 * If you specify both tag keys and tag values in the same request, Amazon
 * Redshift returns all resources that match any combination of the specified
 * keys and values. For example, if you have <code>owner</code> and
 * <code>environment</code> for tag keys, and <code>admin</code> and
 * <code>test</code> for tag values, all resources that have any combination of
 * those values are returned.
 * </p>
 * <p>
 * If both tag keys and values are omitted from the request, resources are
 * returned regardless of whether they have tag keys or values associated with
 * them.
 * </p>
 */
public class DescribeTagsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) for which you want to describe the tag or
     * tags. For example,
     * <code>arn:aws:redshift:us-east-2:123456789:cluster:t1</code>.
     * </p>
     */
    private String resourceName;

    /**
     * <p>
     * The type of resource with which you want to view tags. Valid resource
     * types are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Cluster
     * </p>
     * </li>
     * <li>
     * <p>
     * CIDR/IP
     * </p>
     * </li>
     * <li>
     * <p>
     * EC2 security group
     * </p>
     * </li>
     * <li>
     * <p>
     * Snapshot
     * </p>
     * </li>
     * <li>
     * <p>
     * Cluster security group
     * </p>
     * </li>
     * <li>
     * <p>
     * Subnet group
     * </p>
     * </li>
     * <li>
     * <p>
     * HSM connection
     * </p>
     * </li>
     * <li>
     * <p>
     * HSM certificate
     * </p>
     * </li>
     * <li>
     * <p>
     * Parameter group
     * </p>
     * </li>
     * <li>
     * <p>
     * Snapshot copy grant
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about Amazon Redshift resource types and
     * constructing ARNs, go to <a href=
     * "https://docs.aws.amazon.com/redshift/latest/mgmt/redshift-iam-access-control-overview.html#redshift-iam-access-control-specify-actions"
     * >Specifying Policy Elements: Actions, Effects, Resources, and
     * Principals</a> in the Amazon Redshift Cluster Management Guide.
     * </p>
     */
    private String resourceType;

    /**
     * <p>
     * The maximum number or response records to return in each call. If the
     * number of remaining response records exceeds the specified
     * <code>MaxRecords</code> value, a value is returned in a
     * <code>marker</code> field of the response. You can retrieve the next set
     * of records by retrying the command with the returned <code>marker</code>
     * value.
     * </p>
     */
    private Integer maxRecords;

    /**
     * <p>
     * A value that indicates the starting point for the next set of response
     * records in a subsequent request. If a value is returned in a response,
     * you can retrieve the next set of records by providing this returned
     * marker value in the <code>marker</code> parameter and retrying the
     * command. If the <code>marker</code> field is empty, all response records
     * have been retrieved for the request.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * A tag key or keys for which you want to return all matching resources
     * that are associated with the specified key or keys. For example, suppose
     * that you have resources tagged with keys called <code>owner</code> and
     * <code>environment</code>. If you specify both of these tag keys in the
     * request, Amazon Redshift returns a response with all resources that have
     * either or both of these tag keys associated with them.
     * </p>
     */
    private java.util.List<String> tagKeys;

    /**
     * <p>
     * A tag value or values for which you want to return all matching resources
     * that are associated with the specified value or values. For example,
     * suppose that you have resources tagged with values called
     * <code>admin</code> and <code>test</code>. If you specify both of these
     * tag values in the request, Amazon Redshift returns a response with all
     * resources that have either or both of these tag values associated with
     * them.
     * </p>
     */
    private java.util.List<String> tagValues;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for which you want to describe the tag or
     * tags. For example,
     * <code>arn:aws:redshift:us-east-2:123456789:cluster:t1</code>.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) for which you want to describe the
     *         tag or tags. For example,
     *         <code>arn:aws:redshift:us-east-2:123456789:cluster:t1</code>.
     *         </p>
     */
    public String getResourceName() {
        return resourceName;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for which you want to describe the tag or
     * tags. For example,
     * <code>arn:aws:redshift:us-east-2:123456789:cluster:t1</code>.
     * </p>
     *
     * @param resourceName <p>
     *            The Amazon Resource Name (ARN) for which you want to describe
     *            the tag or tags. For example,
     *            <code>arn:aws:redshift:us-east-2:123456789:cluster:t1</code>.
     *            </p>
     */
    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for which you want to describe the tag or
     * tags. For example,
     * <code>arn:aws:redshift:us-east-2:123456789:cluster:t1</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceName <p>
     *            The Amazon Resource Name (ARN) for which you want to describe
     *            the tag or tags. For example,
     *            <code>arn:aws:redshift:us-east-2:123456789:cluster:t1</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTagsRequest withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * <p>
     * The type of resource with which you want to view tags. Valid resource
     * types are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Cluster
     * </p>
     * </li>
     * <li>
     * <p>
     * CIDR/IP
     * </p>
     * </li>
     * <li>
     * <p>
     * EC2 security group
     * </p>
     * </li>
     * <li>
     * <p>
     * Snapshot
     * </p>
     * </li>
     * <li>
     * <p>
     * Cluster security group
     * </p>
     * </li>
     * <li>
     * <p>
     * Subnet group
     * </p>
     * </li>
     * <li>
     * <p>
     * HSM connection
     * </p>
     * </li>
     * <li>
     * <p>
     * HSM certificate
     * </p>
     * </li>
     * <li>
     * <p>
     * Parameter group
     * </p>
     * </li>
     * <li>
     * <p>
     * Snapshot copy grant
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about Amazon Redshift resource types and
     * constructing ARNs, go to <a href=
     * "https://docs.aws.amazon.com/redshift/latest/mgmt/redshift-iam-access-control-overview.html#redshift-iam-access-control-specify-actions"
     * >Specifying Policy Elements: Actions, Effects, Resources, and
     * Principals</a> in the Amazon Redshift Cluster Management Guide.
     * </p>
     *
     * @return <p>
     *         The type of resource with which you want to view tags. Valid
     *         resource types are:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Cluster
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         CIDR/IP
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         EC2 security group
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Snapshot
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Cluster security group
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Subnet group
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         HSM connection
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         HSM certificate
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Parameter group
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Snapshot copy grant
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information about Amazon Redshift resource types and
     *         constructing ARNs, go to <a href=
     *         "https://docs.aws.amazon.com/redshift/latest/mgmt/redshift-iam-access-control-overview.html#redshift-iam-access-control-specify-actions"
     *         >Specifying Policy Elements: Actions, Effects, Resources, and
     *         Principals</a> in the Amazon Redshift Cluster Management Guide.
     *         </p>
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * <p>
     * The type of resource with which you want to view tags. Valid resource
     * types are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Cluster
     * </p>
     * </li>
     * <li>
     * <p>
     * CIDR/IP
     * </p>
     * </li>
     * <li>
     * <p>
     * EC2 security group
     * </p>
     * </li>
     * <li>
     * <p>
     * Snapshot
     * </p>
     * </li>
     * <li>
     * <p>
     * Cluster security group
     * </p>
     * </li>
     * <li>
     * <p>
     * Subnet group
     * </p>
     * </li>
     * <li>
     * <p>
     * HSM connection
     * </p>
     * </li>
     * <li>
     * <p>
     * HSM certificate
     * </p>
     * </li>
     * <li>
     * <p>
     * Parameter group
     * </p>
     * </li>
     * <li>
     * <p>
     * Snapshot copy grant
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about Amazon Redshift resource types and
     * constructing ARNs, go to <a href=
     * "https://docs.aws.amazon.com/redshift/latest/mgmt/redshift-iam-access-control-overview.html#redshift-iam-access-control-specify-actions"
     * >Specifying Policy Elements: Actions, Effects, Resources, and
     * Principals</a> in the Amazon Redshift Cluster Management Guide.
     * </p>
     *
     * @param resourceType <p>
     *            The type of resource with which you want to view tags. Valid
     *            resource types are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Cluster
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            CIDR/IP
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            EC2 security group
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Snapshot
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Cluster security group
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Subnet group
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            HSM connection
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            HSM certificate
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Parameter group
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Snapshot copy grant
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For more information about Amazon Redshift resource types and
     *            constructing ARNs, go to <a href=
     *            "https://docs.aws.amazon.com/redshift/latest/mgmt/redshift-iam-access-control-overview.html#redshift-iam-access-control-specify-actions"
     *            >Specifying Policy Elements: Actions, Effects, Resources, and
     *            Principals</a> in the Amazon Redshift Cluster Management
     *            Guide.
     *            </p>
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of resource with which you want to view tags. Valid resource
     * types are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Cluster
     * </p>
     * </li>
     * <li>
     * <p>
     * CIDR/IP
     * </p>
     * </li>
     * <li>
     * <p>
     * EC2 security group
     * </p>
     * </li>
     * <li>
     * <p>
     * Snapshot
     * </p>
     * </li>
     * <li>
     * <p>
     * Cluster security group
     * </p>
     * </li>
     * <li>
     * <p>
     * Subnet group
     * </p>
     * </li>
     * <li>
     * <p>
     * HSM connection
     * </p>
     * </li>
     * <li>
     * <p>
     * HSM certificate
     * </p>
     * </li>
     * <li>
     * <p>
     * Parameter group
     * </p>
     * </li>
     * <li>
     * <p>
     * Snapshot copy grant
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about Amazon Redshift resource types and
     * constructing ARNs, go to <a href=
     * "https://docs.aws.amazon.com/redshift/latest/mgmt/redshift-iam-access-control-overview.html#redshift-iam-access-control-specify-actions"
     * >Specifying Policy Elements: Actions, Effects, Resources, and
     * Principals</a> in the Amazon Redshift Cluster Management Guide.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceType <p>
     *            The type of resource with which you want to view tags. Valid
     *            resource types are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Cluster
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            CIDR/IP
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            EC2 security group
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Snapshot
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Cluster security group
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Subnet group
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            HSM connection
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            HSM certificate
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Parameter group
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Snapshot copy grant
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For more information about Amazon Redshift resource types and
     *            constructing ARNs, go to <a href=
     *            "https://docs.aws.amazon.com/redshift/latest/mgmt/redshift-iam-access-control-overview.html#redshift-iam-access-control-specify-actions"
     *            >Specifying Policy Elements: Actions, Effects, Resources, and
     *            Principals</a> in the Amazon Redshift Cluster Management
     *            Guide.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTagsRequest withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * <p>
     * The maximum number or response records to return in each call. If the
     * number of remaining response records exceeds the specified
     * <code>MaxRecords</code> value, a value is returned in a
     * <code>marker</code> field of the response. You can retrieve the next set
     * of records by retrying the command with the returned <code>marker</code>
     * value.
     * </p>
     *
     * @return <p>
     *         The maximum number or response records to return in each call. If
     *         the number of remaining response records exceeds the specified
     *         <code>MaxRecords</code> value, a value is returned in a
     *         <code>marker</code> field of the response. You can retrieve the
     *         next set of records by retrying the command with the returned
     *         <code>marker</code> value.
     *         </p>
     */
    public Integer getMaxRecords() {
        return maxRecords;
    }

    /**
     * <p>
     * The maximum number or response records to return in each call. If the
     * number of remaining response records exceeds the specified
     * <code>MaxRecords</code> value, a value is returned in a
     * <code>marker</code> field of the response. You can retrieve the next set
     * of records by retrying the command with the returned <code>marker</code>
     * value.
     * </p>
     *
     * @param maxRecords <p>
     *            The maximum number or response records to return in each call.
     *            If the number of remaining response records exceeds the
     *            specified <code>MaxRecords</code> value, a value is returned
     *            in a <code>marker</code> field of the response. You can
     *            retrieve the next set of records by retrying the command with
     *            the returned <code>marker</code> value.
     *            </p>
     */
    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }

    /**
     * <p>
     * The maximum number or response records to return in each call. If the
     * number of remaining response records exceeds the specified
     * <code>MaxRecords</code> value, a value is returned in a
     * <code>marker</code> field of the response. You can retrieve the next set
     * of records by retrying the command with the returned <code>marker</code>
     * value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxRecords <p>
     *            The maximum number or response records to return in each call.
     *            If the number of remaining response records exceeds the
     *            specified <code>MaxRecords</code> value, a value is returned
     *            in a <code>marker</code> field of the response. You can
     *            retrieve the next set of records by retrying the command with
     *            the returned <code>marker</code> value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTagsRequest withMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
        return this;
    }

    /**
     * <p>
     * A value that indicates the starting point for the next set of response
     * records in a subsequent request. If a value is returned in a response,
     * you can retrieve the next set of records by providing this returned
     * marker value in the <code>marker</code> parameter and retrying the
     * command. If the <code>marker</code> field is empty, all response records
     * have been retrieved for the request.
     * </p>
     *
     * @return <p>
     *         A value that indicates the starting point for the next set of
     *         response records in a subsequent request. If a value is returned
     *         in a response, you can retrieve the next set of records by
     *         providing this returned marker value in the <code>marker</code>
     *         parameter and retrying the command. If the <code>marker</code>
     *         field is empty, all response records have been retrieved for the
     *         request.
     *         </p>
     */
    public String getMarker() {
        return marker;
    }

    /**
     * <p>
     * A value that indicates the starting point for the next set of response
     * records in a subsequent request. If a value is returned in a response,
     * you can retrieve the next set of records by providing this returned
     * marker value in the <code>marker</code> parameter and retrying the
     * command. If the <code>marker</code> field is empty, all response records
     * have been retrieved for the request.
     * </p>
     *
     * @param marker <p>
     *            A value that indicates the starting point for the next set of
     *            response records in a subsequent request. If a value is
     *            returned in a response, you can retrieve the next set of
     *            records by providing this returned marker value in the
     *            <code>marker</code> parameter and retrying the command. If the
     *            <code>marker</code> field is empty, all response records have
     *            been retrieved for the request.
     *            </p>
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * A value that indicates the starting point for the next set of response
     * records in a subsequent request. If a value is returned in a response,
     * you can retrieve the next set of records by providing this returned
     * marker value in the <code>marker</code> parameter and retrying the
     * command. If the <code>marker</code> field is empty, all response records
     * have been retrieved for the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param marker <p>
     *            A value that indicates the starting point for the next set of
     *            response records in a subsequent request. If a value is
     *            returned in a response, you can retrieve the next set of
     *            records by providing this returned marker value in the
     *            <code>marker</code> parameter and retrying the command. If the
     *            <code>marker</code> field is empty, all response records have
     *            been retrieved for the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTagsRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * <p>
     * A tag key or keys for which you want to return all matching resources
     * that are associated with the specified key or keys. For example, suppose
     * that you have resources tagged with keys called <code>owner</code> and
     * <code>environment</code>. If you specify both of these tag keys in the
     * request, Amazon Redshift returns a response with all resources that have
     * either or both of these tag keys associated with them.
     * </p>
     *
     * @return <p>
     *         A tag key or keys for which you want to return all matching
     *         resources that are associated with the specified key or keys. For
     *         example, suppose that you have resources tagged with keys called
     *         <code>owner</code> and <code>environment</code>. If you specify
     *         both of these tag keys in the request, Amazon Redshift returns a
     *         response with all resources that have either or both of these tag
     *         keys associated with them.
     *         </p>
     */
    public java.util.List<String> getTagKeys() {
        return tagKeys;
    }

    /**
     * <p>
     * A tag key or keys for which you want to return all matching resources
     * that are associated with the specified key or keys. For example, suppose
     * that you have resources tagged with keys called <code>owner</code> and
     * <code>environment</code>. If you specify both of these tag keys in the
     * request, Amazon Redshift returns a response with all resources that have
     * either or both of these tag keys associated with them.
     * </p>
     *
     * @param tagKeys <p>
     *            A tag key or keys for which you want to return all matching
     *            resources that are associated with the specified key or keys.
     *            For example, suppose that you have resources tagged with keys
     *            called <code>owner</code> and <code>environment</code>. If you
     *            specify both of these tag keys in the request, Amazon Redshift
     *            returns a response with all resources that have either or both
     *            of these tag keys associated with them.
     *            </p>
     */
    public void setTagKeys(java.util.Collection<String> tagKeys) {
        if (tagKeys == null) {
            this.tagKeys = null;
            return;
        }

        this.tagKeys = new java.util.ArrayList<String>(tagKeys);
    }

    /**
     * <p>
     * A tag key or keys for which you want to return all matching resources
     * that are associated with the specified key or keys. For example, suppose
     * that you have resources tagged with keys called <code>owner</code> and
     * <code>environment</code>. If you specify both of these tag keys in the
     * request, Amazon Redshift returns a response with all resources that have
     * either or both of these tag keys associated with them.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagKeys <p>
     *            A tag key or keys for which you want to return all matching
     *            resources that are associated with the specified key or keys.
     *            For example, suppose that you have resources tagged with keys
     *            called <code>owner</code> and <code>environment</code>. If you
     *            specify both of these tag keys in the request, Amazon Redshift
     *            returns a response with all resources that have either or both
     *            of these tag keys associated with them.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTagsRequest withTagKeys(String... tagKeys) {
        if (getTagKeys() == null) {
            this.tagKeys = new java.util.ArrayList<String>(tagKeys.length);
        }
        for (String value : tagKeys) {
            this.tagKeys.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A tag key or keys for which you want to return all matching resources
     * that are associated with the specified key or keys. For example, suppose
     * that you have resources tagged with keys called <code>owner</code> and
     * <code>environment</code>. If you specify both of these tag keys in the
     * request, Amazon Redshift returns a response with all resources that have
     * either or both of these tag keys associated with them.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagKeys <p>
     *            A tag key or keys for which you want to return all matching
     *            resources that are associated with the specified key or keys.
     *            For example, suppose that you have resources tagged with keys
     *            called <code>owner</code> and <code>environment</code>. If you
     *            specify both of these tag keys in the request, Amazon Redshift
     *            returns a response with all resources that have either or both
     *            of these tag keys associated with them.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTagsRequest withTagKeys(java.util.Collection<String> tagKeys) {
        setTagKeys(tagKeys);
        return this;
    }

    /**
     * <p>
     * A tag value or values for which you want to return all matching resources
     * that are associated with the specified value or values. For example,
     * suppose that you have resources tagged with values called
     * <code>admin</code> and <code>test</code>. If you specify both of these
     * tag values in the request, Amazon Redshift returns a response with all
     * resources that have either or both of these tag values associated with
     * them.
     * </p>
     *
     * @return <p>
     *         A tag value or values for which you want to return all matching
     *         resources that are associated with the specified value or values.
     *         For example, suppose that you have resources tagged with values
     *         called <code>admin</code> and <code>test</code>. If you specify
     *         both of these tag values in the request, Amazon Redshift returns
     *         a response with all resources that have either or both of these
     *         tag values associated with them.
     *         </p>
     */
    public java.util.List<String> getTagValues() {
        return tagValues;
    }

    /**
     * <p>
     * A tag value or values for which you want to return all matching resources
     * that are associated with the specified value or values. For example,
     * suppose that you have resources tagged with values called
     * <code>admin</code> and <code>test</code>. If you specify both of these
     * tag values in the request, Amazon Redshift returns a response with all
     * resources that have either or both of these tag values associated with
     * them.
     * </p>
     *
     * @param tagValues <p>
     *            A tag value or values for which you want to return all
     *            matching resources that are associated with the specified
     *            value or values. For example, suppose that you have resources
     *            tagged with values called <code>admin</code> and
     *            <code>test</code>. If you specify both of these tag values in
     *            the request, Amazon Redshift returns a response with all
     *            resources that have either or both of these tag values
     *            associated with them.
     *            </p>
     */
    public void setTagValues(java.util.Collection<String> tagValues) {
        if (tagValues == null) {
            this.tagValues = null;
            return;
        }

        this.tagValues = new java.util.ArrayList<String>(tagValues);
    }

    /**
     * <p>
     * A tag value or values for which you want to return all matching resources
     * that are associated with the specified value or values. For example,
     * suppose that you have resources tagged with values called
     * <code>admin</code> and <code>test</code>. If you specify both of these
     * tag values in the request, Amazon Redshift returns a response with all
     * resources that have either or both of these tag values associated with
     * them.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagValues <p>
     *            A tag value or values for which you want to return all
     *            matching resources that are associated with the specified
     *            value or values. For example, suppose that you have resources
     *            tagged with values called <code>admin</code> and
     *            <code>test</code>. If you specify both of these tag values in
     *            the request, Amazon Redshift returns a response with all
     *            resources that have either or both of these tag values
     *            associated with them.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTagsRequest withTagValues(String... tagValues) {
        if (getTagValues() == null) {
            this.tagValues = new java.util.ArrayList<String>(tagValues.length);
        }
        for (String value : tagValues) {
            this.tagValues.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A tag value or values for which you want to return all matching resources
     * that are associated with the specified value or values. For example,
     * suppose that you have resources tagged with values called
     * <code>admin</code> and <code>test</code>. If you specify both of these
     * tag values in the request, Amazon Redshift returns a response with all
     * resources that have either or both of these tag values associated with
     * them.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagValues <p>
     *            A tag value or values for which you want to return all
     *            matching resources that are associated with the specified
     *            value or values. For example, suppose that you have resources
     *            tagged with values called <code>admin</code> and
     *            <code>test</code>. If you specify both of these tag values in
     *            the request, Amazon Redshift returns a response with all
     *            resources that have either or both of these tag values
     *            associated with them.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTagsRequest withTagValues(java.util.Collection<String> tagValues) {
        setTagValues(tagValues);
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
        if (getResourceName() != null)
            sb.append("ResourceName: " + getResourceName() + ",");
        if (getResourceType() != null)
            sb.append("ResourceType: " + getResourceType() + ",");
        if (getMaxRecords() != null)
            sb.append("MaxRecords: " + getMaxRecords() + ",");
        if (getMarker() != null)
            sb.append("Marker: " + getMarker() + ",");
        if (getTagKeys() != null)
            sb.append("TagKeys: " + getTagKeys() + ",");
        if (getTagValues() != null)
            sb.append("TagValues: " + getTagValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getResourceName() == null) ? 0 : getResourceName().hashCode());
        hashCode = prime * hashCode
                + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getTagKeys() == null) ? 0 : getTagKeys().hashCode());
        hashCode = prime * hashCode + ((getTagValues() == null) ? 0 : getTagValues().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeTagsRequest == false)
            return false;
        DescribeTagsRequest other = (DescribeTagsRequest) obj;

        if (other.getResourceName() == null ^ this.getResourceName() == null)
            return false;
        if (other.getResourceName() != null
                && other.getResourceName().equals(this.getResourceName()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null
                && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getMaxRecords() == null ^ this.getMaxRecords() == null)
            return false;
        if (other.getMaxRecords() != null
                && other.getMaxRecords().equals(this.getMaxRecords()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getTagKeys() == null ^ this.getTagKeys() == null)
            return false;
        if (other.getTagKeys() != null && other.getTagKeys().equals(this.getTagKeys()) == false)
            return false;
        if (other.getTagValues() == null ^ this.getTagValues() == null)
            return false;
        if (other.getTagValues() != null
                && other.getTagValues().equals(this.getTagValues()) == false)
            return false;
        return true;
    }
}
