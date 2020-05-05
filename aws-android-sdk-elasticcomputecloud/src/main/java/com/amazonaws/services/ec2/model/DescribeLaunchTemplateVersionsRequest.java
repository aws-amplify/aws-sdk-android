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
 * Describes one or more versions of a specified launch template. You can
 * describe all versions, individual versions, or a range of versions.
 * </p>
 */
public class DescribeLaunchTemplateVersionsRequest extends AmazonWebServiceRequest implements
        Serializable {
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
     * The ID of the launch template. You must specify either the launch
     * template ID or launch template name in the request.
     * </p>
     */
    private String launchTemplateId;

    /**
     * <p>
     * The name of the launch template. You must specify either the launch
     * template ID or launch template name in the request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\(\)\.\-/_]+<br/>
     */
    private String launchTemplateName;

    /**
     * <p>
     * One or more versions of the launch template.
     * </p>
     */
    private java.util.List<String> versions;

    /**
     * <p>
     * The version number after which to describe launch template versions.
     * </p>
     */
    private String minVersion;

    /**
     * <p>
     * The version number up to which to describe launch template versions.
     * </p>
     */
    private String maxVersion;

    /**
     * <p>
     * The token to request the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The maximum number of results to return in a single call. To retrieve the
     * remaining results, make another call with the returned
     * <code>NextToken</code> value. This value can be between 1 and 200.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>create-time</code> - The time the launch template version was
     * created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ebs-optimized</code> - A boolean that indicates whether the
     * instance is optimized for Amazon EBS I/O.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>iam-instance-profile</code> - The ARN of the IAM instance profile.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>image-id</code> - The ID of the AMI.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-type</code> - The instance type.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>is-default-version</code> - A boolean that indicates whether the
     * launch template version is the default version.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>kernel-id</code> - The kernel ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ram-disk-id</code> - The RAM disk ID.
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
    public DescribeLaunchTemplateVersionsRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    /**
     * <p>
     * The ID of the launch template. You must specify either the launch
     * template ID or launch template name in the request.
     * </p>
     *
     * @return <p>
     *         The ID of the launch template. You must specify either the launch
     *         template ID or launch template name in the request.
     *         </p>
     */
    public String getLaunchTemplateId() {
        return launchTemplateId;
    }

    /**
     * <p>
     * The ID of the launch template. You must specify either the launch
     * template ID or launch template name in the request.
     * </p>
     *
     * @param launchTemplateId <p>
     *            The ID of the launch template. You must specify either the
     *            launch template ID or launch template name in the request.
     *            </p>
     */
    public void setLaunchTemplateId(String launchTemplateId) {
        this.launchTemplateId = launchTemplateId;
    }

    /**
     * <p>
     * The ID of the launch template. You must specify either the launch
     * template ID or launch template name in the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param launchTemplateId <p>
     *            The ID of the launch template. You must specify either the
     *            launch template ID or launch template name in the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeLaunchTemplateVersionsRequest withLaunchTemplateId(String launchTemplateId) {
        this.launchTemplateId = launchTemplateId;
        return this;
    }

    /**
     * <p>
     * The name of the launch template. You must specify either the launch
     * template ID or launch template name in the request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\(\)\.\-/_]+<br/>
     *
     * @return <p>
     *         The name of the launch template. You must specify either the
     *         launch template ID or launch template name in the request.
     *         </p>
     */
    public String getLaunchTemplateName() {
        return launchTemplateName;
    }

    /**
     * <p>
     * The name of the launch template. You must specify either the launch
     * template ID or launch template name in the request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\(\)\.\-/_]+<br/>
     *
     * @param launchTemplateName <p>
     *            The name of the launch template. You must specify either the
     *            launch template ID or launch template name in the request.
     *            </p>
     */
    public void setLaunchTemplateName(String launchTemplateName) {
        this.launchTemplateName = launchTemplateName;
    }

    /**
     * <p>
     * The name of the launch template. You must specify either the launch
     * template ID or launch template name in the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\(\)\.\-/_]+<br/>
     *
     * @param launchTemplateName <p>
     *            The name of the launch template. You must specify either the
     *            launch template ID or launch template name in the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeLaunchTemplateVersionsRequest withLaunchTemplateName(String launchTemplateName) {
        this.launchTemplateName = launchTemplateName;
        return this;
    }

    /**
     * <p>
     * One or more versions of the launch template.
     * </p>
     *
     * @return <p>
     *         One or more versions of the launch template.
     *         </p>
     */
    public java.util.List<String> getVersions() {
        return versions;
    }

    /**
     * <p>
     * One or more versions of the launch template.
     * </p>
     *
     * @param versions <p>
     *            One or more versions of the launch template.
     *            </p>
     */
    public void setVersions(java.util.Collection<String> versions) {
        if (versions == null) {
            this.versions = null;
            return;
        }

        this.versions = new java.util.ArrayList<String>(versions);
    }

    /**
     * <p>
     * One or more versions of the launch template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param versions <p>
     *            One or more versions of the launch template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeLaunchTemplateVersionsRequest withVersions(String... versions) {
        if (getVersions() == null) {
            this.versions = new java.util.ArrayList<String>(versions.length);
        }
        for (String value : versions) {
            this.versions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * One or more versions of the launch template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param versions <p>
     *            One or more versions of the launch template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeLaunchTemplateVersionsRequest withVersions(java.util.Collection<String> versions) {
        setVersions(versions);
        return this;
    }

    /**
     * <p>
     * The version number after which to describe launch template versions.
     * </p>
     *
     * @return <p>
     *         The version number after which to describe launch template
     *         versions.
     *         </p>
     */
    public String getMinVersion() {
        return minVersion;
    }

    /**
     * <p>
     * The version number after which to describe launch template versions.
     * </p>
     *
     * @param minVersion <p>
     *            The version number after which to describe launch template
     *            versions.
     *            </p>
     */
    public void setMinVersion(String minVersion) {
        this.minVersion = minVersion;
    }

    /**
     * <p>
     * The version number after which to describe launch template versions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param minVersion <p>
     *            The version number after which to describe launch template
     *            versions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeLaunchTemplateVersionsRequest withMinVersion(String minVersion) {
        this.minVersion = minVersion;
        return this;
    }

    /**
     * <p>
     * The version number up to which to describe launch template versions.
     * </p>
     *
     * @return <p>
     *         The version number up to which to describe launch template
     *         versions.
     *         </p>
     */
    public String getMaxVersion() {
        return maxVersion;
    }

    /**
     * <p>
     * The version number up to which to describe launch template versions.
     * </p>
     *
     * @param maxVersion <p>
     *            The version number up to which to describe launch template
     *            versions.
     *            </p>
     */
    public void setMaxVersion(String maxVersion) {
        this.maxVersion = maxVersion;
    }

    /**
     * <p>
     * The version number up to which to describe launch template versions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxVersion <p>
     *            The version number up to which to describe launch template
     *            versions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeLaunchTemplateVersionsRequest withMaxVersion(String maxVersion) {
        this.maxVersion = maxVersion;
        return this;
    }

    /**
     * <p>
     * The token to request the next page of results.
     * </p>
     *
     * @return <p>
     *         The token to request the next page of results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token to request the next page of results.
     * </p>
     *
     * @param nextToken <p>
     *            The token to request the next page of results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to request the next page of results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The token to request the next page of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeLaunchTemplateVersionsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call. To retrieve the
     * remaining results, make another call with the returned
     * <code>NextToken</code> value. This value can be between 1 and 200.
     * </p>
     *
     * @return <p>
     *         The maximum number of results to return in a single call. To
     *         retrieve the remaining results, make another call with the
     *         returned <code>NextToken</code> value. This value can be between
     *         1 and 200.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call. To retrieve the
     * remaining results, make another call with the returned
     * <code>NextToken</code> value. This value can be between 1 and 200.
     * </p>
     *
     * @param maxResults <p>
     *            The maximum number of results to return in a single call. To
     *            retrieve the remaining results, make another call with the
     *            returned <code>NextToken</code> value. This value can be
     *            between 1 and 200.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call. To retrieve the
     * remaining results, make another call with the returned
     * <code>NextToken</code> value. This value can be between 1 and 200.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxResults <p>
     *            The maximum number of results to return in a single call. To
     *            retrieve the remaining results, make another call with the
     *            returned <code>NextToken</code> value. This value can be
     *            between 1 and 200.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeLaunchTemplateVersionsRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>create-time</code> - The time the launch template version was
     * created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ebs-optimized</code> - A boolean that indicates whether the
     * instance is optimized for Amazon EBS I/O.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>iam-instance-profile</code> - The ARN of the IAM instance profile.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>image-id</code> - The ID of the AMI.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-type</code> - The instance type.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>is-default-version</code> - A boolean that indicates whether the
     * launch template version is the default version.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>kernel-id</code> - The kernel ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ram-disk-id</code> - The RAM disk ID.
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
     *         <code>create-time</code> - The time the launch template version
     *         was created.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ebs-optimized</code> - A boolean that indicates whether the
     *         instance is optimized for Amazon EBS I/O.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>iam-instance-profile</code> - The ARN of the IAM instance
     *         profile.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>image-id</code> - The ID of the AMI.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>instance-type</code> - The instance type.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>is-default-version</code> - A boolean that indicates
     *         whether the launch template version is the default version.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>kernel-id</code> - The kernel ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ram-disk-id</code> - The RAM disk ID.
     *         </p>
     *         </li>
     *         </ul>
     */
    public java.util.List<Filter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>create-time</code> - The time the launch template version was
     * created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ebs-optimized</code> - A boolean that indicates whether the
     * instance is optimized for Amazon EBS I/O.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>iam-instance-profile</code> - The ARN of the IAM instance profile.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>image-id</code> - The ID of the AMI.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-type</code> - The instance type.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>is-default-version</code> - A boolean that indicates whether the
     * launch template version is the default version.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>kernel-id</code> - The kernel ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ram-disk-id</code> - The RAM disk ID.
     * </p>
     * </li>
     * </ul>
     *
     * @param filters <p>
     *            One or more filters.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>create-time</code> - The time the launch template
     *            version was created.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ebs-optimized</code> - A boolean that indicates whether
     *            the instance is optimized for Amazon EBS I/O.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>iam-instance-profile</code> - The ARN of the IAM
     *            instance profile.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>image-id</code> - The ID of the AMI.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>instance-type</code> - The instance type.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>is-default-version</code> - A boolean that indicates
     *            whether the launch template version is the default version.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>kernel-id</code> - The kernel ID.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ram-disk-id</code> - The RAM disk ID.
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
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>create-time</code> - The time the launch template version was
     * created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ebs-optimized</code> - A boolean that indicates whether the
     * instance is optimized for Amazon EBS I/O.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>iam-instance-profile</code> - The ARN of the IAM instance profile.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>image-id</code> - The ID of the AMI.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-type</code> - The instance type.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>is-default-version</code> - A boolean that indicates whether the
     * launch template version is the default version.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>kernel-id</code> - The kernel ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ram-disk-id</code> - The RAM disk ID.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filters <p>
     *            One or more filters.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>create-time</code> - The time the launch template
     *            version was created.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ebs-optimized</code> - A boolean that indicates whether
     *            the instance is optimized for Amazon EBS I/O.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>iam-instance-profile</code> - The ARN of the IAM
     *            instance profile.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>image-id</code> - The ID of the AMI.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>instance-type</code> - The instance type.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>is-default-version</code> - A boolean that indicates
     *            whether the launch template version is the default version.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>kernel-id</code> - The kernel ID.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ram-disk-id</code> - The RAM disk ID.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeLaunchTemplateVersionsRequest withFilters(Filter... filters) {
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
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>create-time</code> - The time the launch template version was
     * created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ebs-optimized</code> - A boolean that indicates whether the
     * instance is optimized for Amazon EBS I/O.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>iam-instance-profile</code> - The ARN of the IAM instance profile.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>image-id</code> - The ID of the AMI.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-type</code> - The instance type.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>is-default-version</code> - A boolean that indicates whether the
     * launch template version is the default version.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>kernel-id</code> - The kernel ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ram-disk-id</code> - The RAM disk ID.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filters <p>
     *            One or more filters.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>create-time</code> - The time the launch template
     *            version was created.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ebs-optimized</code> - A boolean that indicates whether
     *            the instance is optimized for Amazon EBS I/O.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>iam-instance-profile</code> - The ARN of the IAM
     *            instance profile.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>image-id</code> - The ID of the AMI.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>instance-type</code> - The instance type.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>is-default-version</code> - A boolean that indicates
     *            whether the launch template version is the default version.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>kernel-id</code> - The kernel ID.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ram-disk-id</code> - The RAM disk ID.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeLaunchTemplateVersionsRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
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
        if (getLaunchTemplateId() != null)
            sb.append("LaunchTemplateId: " + getLaunchTemplateId() + ",");
        if (getLaunchTemplateName() != null)
            sb.append("LaunchTemplateName: " + getLaunchTemplateName() + ",");
        if (getVersions() != null)
            sb.append("Versions: " + getVersions() + ",");
        if (getMinVersion() != null)
            sb.append("MinVersion: " + getMinVersion() + ",");
        if (getMaxVersion() != null)
            sb.append("MaxVersion: " + getMaxVersion() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults() + ",");
        if (getFilters() != null)
            sb.append("Filters: " + getFilters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        hashCode = prime * hashCode
                + ((getLaunchTemplateId() == null) ? 0 : getLaunchTemplateId().hashCode());
        hashCode = prime * hashCode
                + ((getLaunchTemplateName() == null) ? 0 : getLaunchTemplateName().hashCode());
        hashCode = prime * hashCode + ((getVersions() == null) ? 0 : getVersions().hashCode());
        hashCode = prime * hashCode + ((getMinVersion() == null) ? 0 : getMinVersion().hashCode());
        hashCode = prime * hashCode + ((getMaxVersion() == null) ? 0 : getMaxVersion().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeLaunchTemplateVersionsRequest == false)
            return false;
        DescribeLaunchTemplateVersionsRequest other = (DescribeLaunchTemplateVersionsRequest) obj;

        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        if (other.getLaunchTemplateId() == null ^ this.getLaunchTemplateId() == null)
            return false;
        if (other.getLaunchTemplateId() != null
                && other.getLaunchTemplateId().equals(this.getLaunchTemplateId()) == false)
            return false;
        if (other.getLaunchTemplateName() == null ^ this.getLaunchTemplateName() == null)
            return false;
        if (other.getLaunchTemplateName() != null
                && other.getLaunchTemplateName().equals(this.getLaunchTemplateName()) == false)
            return false;
        if (other.getVersions() == null ^ this.getVersions() == null)
            return false;
        if (other.getVersions() != null && other.getVersions().equals(this.getVersions()) == false)
            return false;
        if (other.getMinVersion() == null ^ this.getMinVersion() == null)
            return false;
        if (other.getMinVersion() != null
                && other.getMinVersion().equals(this.getMinVersion()) == false)
            return false;
        if (other.getMaxVersion() == null ^ this.getMaxVersion() == null)
            return false;
        if (other.getMaxVersion() != null
                && other.getMaxVersion().equals(this.getMaxVersion()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null
                && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        return true;
    }
}
