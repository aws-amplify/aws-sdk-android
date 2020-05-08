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

package com.amazonaws.services.tagging.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns a table that shows counts of resources that are noncompliant with
 * their tag policies.
 * </p>
 * <p>
 * For more information on tag policies, see <a href=
 * "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_tag-policies.html"
 * >Tag Policies</a> in the <i>AWS Organizations User Guide.</i>
 * </p>
 * <p>
 * You can call this operation only from the organization's master account and
 * from the us-east-1 Region.
 * </p>
 */
public class GetComplianceSummaryRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The target identifiers (usually, specific account IDs) to limit the
     * output by. If you use this parameter, the count of returned noncompliant
     * resources includes only resources with the specified target IDs.
     * </p>
     */
    private java.util.List<String> targetIdFilters;

    /**
     * <p>
     * A list of Regions to limit the output by. If you use this parameter, the
     * count of returned noncompliant resources includes only resources in the
     * specified Regions.
     * </p>
     */
    private java.util.List<String> regionFilters;

    /**
     * <p>
     * The constraints on the resources that you want returned. The format of
     * each resource type is <code>service[:resourceType]</code>. For example,
     * specifying a resource type of <code>ec2</code> returns all Amazon EC2
     * resources (which includes EC2 instances). Specifying a resource type of
     * <code>ec2:instance</code> returns only EC2 instances.
     * </p>
     * <p>
     * The string for each service name and resource type is the same as that
     * embedded in a resource's Amazon Resource Name (ARN). Consult the <i>AWS
     * General Reference</i> for the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For a list of service name strings, see <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     * >AWS Service Namespaces</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For resource type strings, see <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arns-syntax"
     * >Example ARNs</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For more information about ARNs, see <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Names (ARNs) and AWS Service Namespaces</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can specify multiple resource types by using an array. The array can
     * include up to 100 items. Note that the length constraint requirement
     * applies to each resource type filter.
     * </p>
     */
    private java.util.List<String> resourceTypeFilters;

    /**
     * <p>
     * A list of tag keys to limit the output by. If you use this parameter, the
     * count of returned noncompliant resources includes only resources that
     * have the specified tag keys.
     * </p>
     */
    private java.util.List<String> tagKeyFilters;

    /**
     * <p>
     * A list of attributes to group the counts of noncompliant resources by. If
     * supplied, the counts are sorted by those attributes.
     * </p>
     */
    private java.util.List<String> groupBy;

    /**
     * <p>
     * A limit that restricts the number of results that are returned per page.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * A string that indicates that additional data is available. Leave this
     * value empty for your initial request. If the response includes a
     * <code>PaginationToken</code>, use that string for this value to request
     * an additional page of data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     */
    private String paginationToken;

    /**
     * <p>
     * The target identifiers (usually, specific account IDs) to limit the
     * output by. If you use this parameter, the count of returned noncompliant
     * resources includes only resources with the specified target IDs.
     * </p>
     *
     * @return <p>
     *         The target identifiers (usually, specific account IDs) to limit
     *         the output by. If you use this parameter, the count of returned
     *         noncompliant resources includes only resources with the specified
     *         target IDs.
     *         </p>
     */
    public java.util.List<String> getTargetIdFilters() {
        return targetIdFilters;
    }

    /**
     * <p>
     * The target identifiers (usually, specific account IDs) to limit the
     * output by. If you use this parameter, the count of returned noncompliant
     * resources includes only resources with the specified target IDs.
     * </p>
     *
     * @param targetIdFilters <p>
     *            The target identifiers (usually, specific account IDs) to
     *            limit the output by. If you use this parameter, the count of
     *            returned noncompliant resources includes only resources with
     *            the specified target IDs.
     *            </p>
     */
    public void setTargetIdFilters(java.util.Collection<String> targetIdFilters) {
        if (targetIdFilters == null) {
            this.targetIdFilters = null;
            return;
        }

        this.targetIdFilters = new java.util.ArrayList<String>(targetIdFilters);
    }

    /**
     * <p>
     * The target identifiers (usually, specific account IDs) to limit the
     * output by. If you use this parameter, the count of returned noncompliant
     * resources includes only resources with the specified target IDs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetIdFilters <p>
     *            The target identifiers (usually, specific account IDs) to
     *            limit the output by. If you use this parameter, the count of
     *            returned noncompliant resources includes only resources with
     *            the specified target IDs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetComplianceSummaryRequest withTargetIdFilters(String... targetIdFilters) {
        if (getTargetIdFilters() == null) {
            this.targetIdFilters = new java.util.ArrayList<String>(targetIdFilters.length);
        }
        for (String value : targetIdFilters) {
            this.targetIdFilters.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The target identifiers (usually, specific account IDs) to limit the
     * output by. If you use this parameter, the count of returned noncompliant
     * resources includes only resources with the specified target IDs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetIdFilters <p>
     *            The target identifiers (usually, specific account IDs) to
     *            limit the output by. If you use this parameter, the count of
     *            returned noncompliant resources includes only resources with
     *            the specified target IDs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetComplianceSummaryRequest withTargetIdFilters(
            java.util.Collection<String> targetIdFilters) {
        setTargetIdFilters(targetIdFilters);
        return this;
    }

    /**
     * <p>
     * A list of Regions to limit the output by. If you use this parameter, the
     * count of returned noncompliant resources includes only resources in the
     * specified Regions.
     * </p>
     *
     * @return <p>
     *         A list of Regions to limit the output by. If you use this
     *         parameter, the count of returned noncompliant resources includes
     *         only resources in the specified Regions.
     *         </p>
     */
    public java.util.List<String> getRegionFilters() {
        return regionFilters;
    }

    /**
     * <p>
     * A list of Regions to limit the output by. If you use this parameter, the
     * count of returned noncompliant resources includes only resources in the
     * specified Regions.
     * </p>
     *
     * @param regionFilters <p>
     *            A list of Regions to limit the output by. If you use this
     *            parameter, the count of returned noncompliant resources
     *            includes only resources in the specified Regions.
     *            </p>
     */
    public void setRegionFilters(java.util.Collection<String> regionFilters) {
        if (regionFilters == null) {
            this.regionFilters = null;
            return;
        }

        this.regionFilters = new java.util.ArrayList<String>(regionFilters);
    }

    /**
     * <p>
     * A list of Regions to limit the output by. If you use this parameter, the
     * count of returned noncompliant resources includes only resources in the
     * specified Regions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param regionFilters <p>
     *            A list of Regions to limit the output by. If you use this
     *            parameter, the count of returned noncompliant resources
     *            includes only resources in the specified Regions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetComplianceSummaryRequest withRegionFilters(String... regionFilters) {
        if (getRegionFilters() == null) {
            this.regionFilters = new java.util.ArrayList<String>(regionFilters.length);
        }
        for (String value : regionFilters) {
            this.regionFilters.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of Regions to limit the output by. If you use this parameter, the
     * count of returned noncompliant resources includes only resources in the
     * specified Regions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param regionFilters <p>
     *            A list of Regions to limit the output by. If you use this
     *            parameter, the count of returned noncompliant resources
     *            includes only resources in the specified Regions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetComplianceSummaryRequest withRegionFilters(java.util.Collection<String> regionFilters) {
        setRegionFilters(regionFilters);
        return this;
    }

    /**
     * <p>
     * The constraints on the resources that you want returned. The format of
     * each resource type is <code>service[:resourceType]</code>. For example,
     * specifying a resource type of <code>ec2</code> returns all Amazon EC2
     * resources (which includes EC2 instances). Specifying a resource type of
     * <code>ec2:instance</code> returns only EC2 instances.
     * </p>
     * <p>
     * The string for each service name and resource type is the same as that
     * embedded in a resource's Amazon Resource Name (ARN). Consult the <i>AWS
     * General Reference</i> for the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For a list of service name strings, see <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     * >AWS Service Namespaces</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For resource type strings, see <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arns-syntax"
     * >Example ARNs</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For more information about ARNs, see <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Names (ARNs) and AWS Service Namespaces</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can specify multiple resource types by using an array. The array can
     * include up to 100 items. Note that the length constraint requirement
     * applies to each resource type filter.
     * </p>
     *
     * @return <p>
     *         The constraints on the resources that you want returned. The
     *         format of each resource type is
     *         <code>service[:resourceType]</code>. For example, specifying a
     *         resource type of <code>ec2</code> returns all Amazon EC2
     *         resources (which includes EC2 instances). Specifying a resource
     *         type of <code>ec2:instance</code> returns only EC2 instances.
     *         </p>
     *         <p>
     *         The string for each service name and resource type is the same as
     *         that embedded in a resource's Amazon Resource Name (ARN). Consult
     *         the <i>AWS General Reference</i> for the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For a list of service name strings, see <a href=
     *         "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     *         >AWS Service Namespaces</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For resource type strings, see <a href=
     *         "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arns-syntax"
     *         >Example ARNs</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For more information about ARNs, see <a href=
     *         "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *         >Amazon Resource Names (ARNs) and AWS Service Namespaces</a>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         You can specify multiple resource types by using an array. The
     *         array can include up to 100 items. Note that the length
     *         constraint requirement applies to each resource type filter.
     *         </p>
     */
    public java.util.List<String> getResourceTypeFilters() {
        return resourceTypeFilters;
    }

    /**
     * <p>
     * The constraints on the resources that you want returned. The format of
     * each resource type is <code>service[:resourceType]</code>. For example,
     * specifying a resource type of <code>ec2</code> returns all Amazon EC2
     * resources (which includes EC2 instances). Specifying a resource type of
     * <code>ec2:instance</code> returns only EC2 instances.
     * </p>
     * <p>
     * The string for each service name and resource type is the same as that
     * embedded in a resource's Amazon Resource Name (ARN). Consult the <i>AWS
     * General Reference</i> for the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For a list of service name strings, see <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     * >AWS Service Namespaces</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For resource type strings, see <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arns-syntax"
     * >Example ARNs</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For more information about ARNs, see <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Names (ARNs) and AWS Service Namespaces</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can specify multiple resource types by using an array. The array can
     * include up to 100 items. Note that the length constraint requirement
     * applies to each resource type filter.
     * </p>
     *
     * @param resourceTypeFilters <p>
     *            The constraints on the resources that you want returned. The
     *            format of each resource type is
     *            <code>service[:resourceType]</code>. For example, specifying a
     *            resource type of <code>ec2</code> returns all Amazon EC2
     *            resources (which includes EC2 instances). Specifying a
     *            resource type of <code>ec2:instance</code> returns only EC2
     *            instances.
     *            </p>
     *            <p>
     *            The string for each service name and resource type is the same
     *            as that embedded in a resource's Amazon Resource Name (ARN).
     *            Consult the <i>AWS General Reference</i> for the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            For a list of service name strings, see <a href=
     *            "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     *            >AWS Service Namespaces</a>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For resource type strings, see <a href=
     *            "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arns-syntax"
     *            >Example ARNs</a>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For more information about ARNs, see <a href=
     *            "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *            >Amazon Resource Names (ARNs) and AWS Service Namespaces</a>.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            You can specify multiple resource types by using an array. The
     *            array can include up to 100 items. Note that the length
     *            constraint requirement applies to each resource type filter.
     *            </p>
     */
    public void setResourceTypeFilters(java.util.Collection<String> resourceTypeFilters) {
        if (resourceTypeFilters == null) {
            this.resourceTypeFilters = null;
            return;
        }

        this.resourceTypeFilters = new java.util.ArrayList<String>(resourceTypeFilters);
    }

    /**
     * <p>
     * The constraints on the resources that you want returned. The format of
     * each resource type is <code>service[:resourceType]</code>. For example,
     * specifying a resource type of <code>ec2</code> returns all Amazon EC2
     * resources (which includes EC2 instances). Specifying a resource type of
     * <code>ec2:instance</code> returns only EC2 instances.
     * </p>
     * <p>
     * The string for each service name and resource type is the same as that
     * embedded in a resource's Amazon Resource Name (ARN). Consult the <i>AWS
     * General Reference</i> for the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For a list of service name strings, see <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     * >AWS Service Namespaces</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For resource type strings, see <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arns-syntax"
     * >Example ARNs</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For more information about ARNs, see <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Names (ARNs) and AWS Service Namespaces</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can specify multiple resource types by using an array. The array can
     * include up to 100 items. Note that the length constraint requirement
     * applies to each resource type filter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceTypeFilters <p>
     *            The constraints on the resources that you want returned. The
     *            format of each resource type is
     *            <code>service[:resourceType]</code>. For example, specifying a
     *            resource type of <code>ec2</code> returns all Amazon EC2
     *            resources (which includes EC2 instances). Specifying a
     *            resource type of <code>ec2:instance</code> returns only EC2
     *            instances.
     *            </p>
     *            <p>
     *            The string for each service name and resource type is the same
     *            as that embedded in a resource's Amazon Resource Name (ARN).
     *            Consult the <i>AWS General Reference</i> for the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            For a list of service name strings, see <a href=
     *            "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     *            >AWS Service Namespaces</a>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For resource type strings, see <a href=
     *            "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arns-syntax"
     *            >Example ARNs</a>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For more information about ARNs, see <a href=
     *            "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *            >Amazon Resource Names (ARNs) and AWS Service Namespaces</a>.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            You can specify multiple resource types by using an array. The
     *            array can include up to 100 items. Note that the length
     *            constraint requirement applies to each resource type filter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetComplianceSummaryRequest withResourceTypeFilters(String... resourceTypeFilters) {
        if (getResourceTypeFilters() == null) {
            this.resourceTypeFilters = new java.util.ArrayList<String>(resourceTypeFilters.length);
        }
        for (String value : resourceTypeFilters) {
            this.resourceTypeFilters.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The constraints on the resources that you want returned. The format of
     * each resource type is <code>service[:resourceType]</code>. For example,
     * specifying a resource type of <code>ec2</code> returns all Amazon EC2
     * resources (which includes EC2 instances). Specifying a resource type of
     * <code>ec2:instance</code> returns only EC2 instances.
     * </p>
     * <p>
     * The string for each service name and resource type is the same as that
     * embedded in a resource's Amazon Resource Name (ARN). Consult the <i>AWS
     * General Reference</i> for the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For a list of service name strings, see <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     * >AWS Service Namespaces</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For resource type strings, see <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arns-syntax"
     * >Example ARNs</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For more information about ARNs, see <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Names (ARNs) and AWS Service Namespaces</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can specify multiple resource types by using an array. The array can
     * include up to 100 items. Note that the length constraint requirement
     * applies to each resource type filter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceTypeFilters <p>
     *            The constraints on the resources that you want returned. The
     *            format of each resource type is
     *            <code>service[:resourceType]</code>. For example, specifying a
     *            resource type of <code>ec2</code> returns all Amazon EC2
     *            resources (which includes EC2 instances). Specifying a
     *            resource type of <code>ec2:instance</code> returns only EC2
     *            instances.
     *            </p>
     *            <p>
     *            The string for each service name and resource type is the same
     *            as that embedded in a resource's Amazon Resource Name (ARN).
     *            Consult the <i>AWS General Reference</i> for the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            For a list of service name strings, see <a href=
     *            "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     *            >AWS Service Namespaces</a>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For resource type strings, see <a href=
     *            "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arns-syntax"
     *            >Example ARNs</a>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For more information about ARNs, see <a href=
     *            "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *            >Amazon Resource Names (ARNs) and AWS Service Namespaces</a>.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            You can specify multiple resource types by using an array. The
     *            array can include up to 100 items. Note that the length
     *            constraint requirement applies to each resource type filter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetComplianceSummaryRequest withResourceTypeFilters(
            java.util.Collection<String> resourceTypeFilters) {
        setResourceTypeFilters(resourceTypeFilters);
        return this;
    }

    /**
     * <p>
     * A list of tag keys to limit the output by. If you use this parameter, the
     * count of returned noncompliant resources includes only resources that
     * have the specified tag keys.
     * </p>
     *
     * @return <p>
     *         A list of tag keys to limit the output by. If you use this
     *         parameter, the count of returned noncompliant resources includes
     *         only resources that have the specified tag keys.
     *         </p>
     */
    public java.util.List<String> getTagKeyFilters() {
        return tagKeyFilters;
    }

    /**
     * <p>
     * A list of tag keys to limit the output by. If you use this parameter, the
     * count of returned noncompliant resources includes only resources that
     * have the specified tag keys.
     * </p>
     *
     * @param tagKeyFilters <p>
     *            A list of tag keys to limit the output by. If you use this
     *            parameter, the count of returned noncompliant resources
     *            includes only resources that have the specified tag keys.
     *            </p>
     */
    public void setTagKeyFilters(java.util.Collection<String> tagKeyFilters) {
        if (tagKeyFilters == null) {
            this.tagKeyFilters = null;
            return;
        }

        this.tagKeyFilters = new java.util.ArrayList<String>(tagKeyFilters);
    }

    /**
     * <p>
     * A list of tag keys to limit the output by. If you use this parameter, the
     * count of returned noncompliant resources includes only resources that
     * have the specified tag keys.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagKeyFilters <p>
     *            A list of tag keys to limit the output by. If you use this
     *            parameter, the count of returned noncompliant resources
     *            includes only resources that have the specified tag keys.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetComplianceSummaryRequest withTagKeyFilters(String... tagKeyFilters) {
        if (getTagKeyFilters() == null) {
            this.tagKeyFilters = new java.util.ArrayList<String>(tagKeyFilters.length);
        }
        for (String value : tagKeyFilters) {
            this.tagKeyFilters.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of tag keys to limit the output by. If you use this parameter, the
     * count of returned noncompliant resources includes only resources that
     * have the specified tag keys.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagKeyFilters <p>
     *            A list of tag keys to limit the output by. If you use this
     *            parameter, the count of returned noncompliant resources
     *            includes only resources that have the specified tag keys.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetComplianceSummaryRequest withTagKeyFilters(java.util.Collection<String> tagKeyFilters) {
        setTagKeyFilters(tagKeyFilters);
        return this;
    }

    /**
     * <p>
     * A list of attributes to group the counts of noncompliant resources by. If
     * supplied, the counts are sorted by those attributes.
     * </p>
     *
     * @return <p>
     *         A list of attributes to group the counts of noncompliant
     *         resources by. If supplied, the counts are sorted by those
     *         attributes.
     *         </p>
     */
    public java.util.List<String> getGroupBy() {
        return groupBy;
    }

    /**
     * <p>
     * A list of attributes to group the counts of noncompliant resources by. If
     * supplied, the counts are sorted by those attributes.
     * </p>
     *
     * @param groupBy <p>
     *            A list of attributes to group the counts of noncompliant
     *            resources by. If supplied, the counts are sorted by those
     *            attributes.
     *            </p>
     */
    public void setGroupBy(java.util.Collection<String> groupBy) {
        if (groupBy == null) {
            this.groupBy = null;
            return;
        }

        this.groupBy = new java.util.ArrayList<String>(groupBy);
    }

    /**
     * <p>
     * A list of attributes to group the counts of noncompliant resources by. If
     * supplied, the counts are sorted by those attributes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param groupBy <p>
     *            A list of attributes to group the counts of noncompliant
     *            resources by. If supplied, the counts are sorted by those
     *            attributes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetComplianceSummaryRequest withGroupBy(String... groupBy) {
        if (getGroupBy() == null) {
            this.groupBy = new java.util.ArrayList<String>(groupBy.length);
        }
        for (String value : groupBy) {
            this.groupBy.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of attributes to group the counts of noncompliant resources by. If
     * supplied, the counts are sorted by those attributes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param groupBy <p>
     *            A list of attributes to group the counts of noncompliant
     *            resources by. If supplied, the counts are sorted by those
     *            attributes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetComplianceSummaryRequest withGroupBy(java.util.Collection<String> groupBy) {
        setGroupBy(groupBy);
        return this;
    }

    /**
     * <p>
     * A limit that restricts the number of results that are returned per page.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @return <p>
     *         A limit that restricts the number of results that are returned
     *         per page.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * A limit that restricts the number of results that are returned per page.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param maxResults <p>
     *            A limit that restricts the number of results that are returned
     *            per page.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * A limit that restricts the number of results that are returned per page.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param maxResults <p>
     *            A limit that restricts the number of results that are returned
     *            per page.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetComplianceSummaryRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * A string that indicates that additional data is available. Leave this
     * value empty for your initial request. If the response includes a
     * <code>PaginationToken</code>, use that string for this value to request
     * an additional page of data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     *
     * @return <p>
     *         A string that indicates that additional data is available. Leave
     *         this value empty for your initial request. If the response
     *         includes a <code>PaginationToken</code>, use that string for this
     *         value to request an additional page of data.
     *         </p>
     */
    public String getPaginationToken() {
        return paginationToken;
    }

    /**
     * <p>
     * A string that indicates that additional data is available. Leave this
     * value empty for your initial request. If the response includes a
     * <code>PaginationToken</code>, use that string for this value to request
     * an additional page of data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     *
     * @param paginationToken <p>
     *            A string that indicates that additional data is available.
     *            Leave this value empty for your initial request. If the
     *            response includes a <code>PaginationToken</code>, use that
     *            string for this value to request an additional page of data.
     *            </p>
     */
    public void setPaginationToken(String paginationToken) {
        this.paginationToken = paginationToken;
    }

    /**
     * <p>
     * A string that indicates that additional data is available. Leave this
     * value empty for your initial request. If the response includes a
     * <code>PaginationToken</code>, use that string for this value to request
     * an additional page of data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     *
     * @param paginationToken <p>
     *            A string that indicates that additional data is available.
     *            Leave this value empty for your initial request. If the
     *            response includes a <code>PaginationToken</code>, use that
     *            string for this value to request an additional page of data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetComplianceSummaryRequest withPaginationToken(String paginationToken) {
        this.paginationToken = paginationToken;
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
        if (getTargetIdFilters() != null)
            sb.append("TargetIdFilters: " + getTargetIdFilters() + ",");
        if (getRegionFilters() != null)
            sb.append("RegionFilters: " + getRegionFilters() + ",");
        if (getResourceTypeFilters() != null)
            sb.append("ResourceTypeFilters: " + getResourceTypeFilters() + ",");
        if (getTagKeyFilters() != null)
            sb.append("TagKeyFilters: " + getTagKeyFilters() + ",");
        if (getGroupBy() != null)
            sb.append("GroupBy: " + getGroupBy() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults() + ",");
        if (getPaginationToken() != null)
            sb.append("PaginationToken: " + getPaginationToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTargetIdFilters() == null) ? 0 : getTargetIdFilters().hashCode());
        hashCode = prime * hashCode
                + ((getRegionFilters() == null) ? 0 : getRegionFilters().hashCode());
        hashCode = prime * hashCode
                + ((getResourceTypeFilters() == null) ? 0 : getResourceTypeFilters().hashCode());
        hashCode = prime * hashCode
                + ((getTagKeyFilters() == null) ? 0 : getTagKeyFilters().hashCode());
        hashCode = prime * hashCode + ((getGroupBy() == null) ? 0 : getGroupBy().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode
                + ((getPaginationToken() == null) ? 0 : getPaginationToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetComplianceSummaryRequest == false)
            return false;
        GetComplianceSummaryRequest other = (GetComplianceSummaryRequest) obj;

        if (other.getTargetIdFilters() == null ^ this.getTargetIdFilters() == null)
            return false;
        if (other.getTargetIdFilters() != null
                && other.getTargetIdFilters().equals(this.getTargetIdFilters()) == false)
            return false;
        if (other.getRegionFilters() == null ^ this.getRegionFilters() == null)
            return false;
        if (other.getRegionFilters() != null
                && other.getRegionFilters().equals(this.getRegionFilters()) == false)
            return false;
        if (other.getResourceTypeFilters() == null ^ this.getResourceTypeFilters() == null)
            return false;
        if (other.getResourceTypeFilters() != null
                && other.getResourceTypeFilters().equals(this.getResourceTypeFilters()) == false)
            return false;
        if (other.getTagKeyFilters() == null ^ this.getTagKeyFilters() == null)
            return false;
        if (other.getTagKeyFilters() != null
                && other.getTagKeyFilters().equals(this.getTagKeyFilters()) == false)
            return false;
        if (other.getGroupBy() == null ^ this.getGroupBy() == null)
            return false;
        if (other.getGroupBy() != null && other.getGroupBy().equals(this.getGroupBy()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null
                && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getPaginationToken() == null ^ this.getPaginationToken() == null)
            return false;
        if (other.getPaginationToken() != null
                && other.getPaginationToken().equals(this.getPaginationToken()) == false)
            return false;
        return true;
    }
}
