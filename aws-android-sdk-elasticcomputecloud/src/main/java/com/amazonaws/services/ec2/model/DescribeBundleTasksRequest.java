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
 * Describes the specified bundle tasks or all of your bundle tasks.
 * </p>
 * <note>
 * <p>
 * Completed bundle tasks are listed for only a limited time. If your bundle
 * task is no longer in the list, you can still register an AMI from it. Just
 * use <code>RegisterImage</code> with the Amazon S3 bucket name and image
 * manifest name you provided to the bundle task.
 * </p>
 * </note>
 */
public class DescribeBundleTasksRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The bundle task IDs.
     * </p>
     * <p>
     * Default: Describes all your bundle tasks.
     * </p>
     */
    private java.util.List<String> bundleIds;

    /**
     * <p>
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>bundle-id</code> - The ID of the bundle task.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>error-code</code> - If the task failed, the error code returned.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>error-message</code> - If the task failed, the error message
     * returned.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-id</code> - The ID of the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>progress</code> - The level of task completion, as a percentage
     * (for example, 20%).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3-bucket</code> - The Amazon S3 bucket to store the AMI.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3-prefix</code> - The beginning of the AMI name.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>start-time</code> - The time the task started (for example,
     * 2013-09-15T17:15:20.000Z).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the task (<code>pending</code> |
     * <code>waiting-for-shutdown</code> | <code>bundling</code> |
     * <code>storing</code> | <code>cancelling</code> | <code>complete</code> |
     * <code>failed</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>update-time</code> - The time of the most recent update for the
     * task.
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
     * The bundle task IDs.
     * </p>
     * <p>
     * Default: Describes all your bundle tasks.
     * </p>
     *
     * @return <p>
     *         The bundle task IDs.
     *         </p>
     *         <p>
     *         Default: Describes all your bundle tasks.
     *         </p>
     */
    public java.util.List<String> getBundleIds() {
        return bundleIds;
    }

    /**
     * <p>
     * The bundle task IDs.
     * </p>
     * <p>
     * Default: Describes all your bundle tasks.
     * </p>
     *
     * @param bundleIds <p>
     *            The bundle task IDs.
     *            </p>
     *            <p>
     *            Default: Describes all your bundle tasks.
     *            </p>
     */
    public void setBundleIds(java.util.Collection<String> bundleIds) {
        if (bundleIds == null) {
            this.bundleIds = null;
            return;
        }

        this.bundleIds = new java.util.ArrayList<String>(bundleIds);
    }

    /**
     * <p>
     * The bundle task IDs.
     * </p>
     * <p>
     * Default: Describes all your bundle tasks.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bundleIds <p>
     *            The bundle task IDs.
     *            </p>
     *            <p>
     *            Default: Describes all your bundle tasks.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeBundleTasksRequest withBundleIds(String... bundleIds) {
        if (getBundleIds() == null) {
            this.bundleIds = new java.util.ArrayList<String>(bundleIds.length);
        }
        for (String value : bundleIds) {
            this.bundleIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The bundle task IDs.
     * </p>
     * <p>
     * Default: Describes all your bundle tasks.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bundleIds <p>
     *            The bundle task IDs.
     *            </p>
     *            <p>
     *            Default: Describes all your bundle tasks.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeBundleTasksRequest withBundleIds(java.util.Collection<String> bundleIds) {
        setBundleIds(bundleIds);
        return this;
    }

    /**
     * <p>
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>bundle-id</code> - The ID of the bundle task.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>error-code</code> - If the task failed, the error code returned.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>error-message</code> - If the task failed, the error message
     * returned.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-id</code> - The ID of the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>progress</code> - The level of task completion, as a percentage
     * (for example, 20%).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3-bucket</code> - The Amazon S3 bucket to store the AMI.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3-prefix</code> - The beginning of the AMI name.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>start-time</code> - The time the task started (for example,
     * 2013-09-15T17:15:20.000Z).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the task (<code>pending</code> |
     * <code>waiting-for-shutdown</code> | <code>bundling</code> |
     * <code>storing</code> | <code>cancelling</code> | <code>complete</code> |
     * <code>failed</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>update-time</code> - The time of the most recent update for the
     * task.
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
     *         <code>bundle-id</code> - The ID of the bundle task.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>error-code</code> - If the task failed, the error code
     *         returned.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>error-message</code> - If the task failed, the error
     *         message returned.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>instance-id</code> - The ID of the instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>progress</code> - The level of task completion, as a
     *         percentage (for example, 20%).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>s3-bucket</code> - The Amazon S3 bucket to store the AMI.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>s3-prefix</code> - The beginning of the AMI name.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>start-time</code> - The time the task started (for example,
     *         2013-09-15T17:15:20.000Z).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>state</code> - The state of the task (<code>pending</code>
     *         | <code>waiting-for-shutdown</code> | <code>bundling</code> |
     *         <code>storing</code> | <code>cancelling</code> |
     *         <code>complete</code> | <code>failed</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>update-time</code> - The time of the most recent update for
     *         the task.
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
     * <code>bundle-id</code> - The ID of the bundle task.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>error-code</code> - If the task failed, the error code returned.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>error-message</code> - If the task failed, the error message
     * returned.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-id</code> - The ID of the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>progress</code> - The level of task completion, as a percentage
     * (for example, 20%).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3-bucket</code> - The Amazon S3 bucket to store the AMI.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3-prefix</code> - The beginning of the AMI name.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>start-time</code> - The time the task started (for example,
     * 2013-09-15T17:15:20.000Z).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the task (<code>pending</code> |
     * <code>waiting-for-shutdown</code> | <code>bundling</code> |
     * <code>storing</code> | <code>cancelling</code> | <code>complete</code> |
     * <code>failed</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>update-time</code> - The time of the most recent update for the
     * task.
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
     *            <code>bundle-id</code> - The ID of the bundle task.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>error-code</code> - If the task failed, the error code
     *            returned.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>error-message</code> - If the task failed, the error
     *            message returned.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>instance-id</code> - The ID of the instance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>progress</code> - The level of task completion, as a
     *            percentage (for example, 20%).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>s3-bucket</code> - The Amazon S3 bucket to store the
     *            AMI.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>s3-prefix</code> - The beginning of the AMI name.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>start-time</code> - The time the task started (for
     *            example, 2013-09-15T17:15:20.000Z).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>state</code> - The state of the task (
     *            <code>pending</code> | <code>waiting-for-shutdown</code> |
     *            <code>bundling</code> | <code>storing</code> |
     *            <code>cancelling</code> | <code>complete</code> |
     *            <code>failed</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>update-time</code> - The time of the most recent update
     *            for the task.
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
     * <code>bundle-id</code> - The ID of the bundle task.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>error-code</code> - If the task failed, the error code returned.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>error-message</code> - If the task failed, the error message
     * returned.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-id</code> - The ID of the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>progress</code> - The level of task completion, as a percentage
     * (for example, 20%).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3-bucket</code> - The Amazon S3 bucket to store the AMI.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3-prefix</code> - The beginning of the AMI name.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>start-time</code> - The time the task started (for example,
     * 2013-09-15T17:15:20.000Z).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the task (<code>pending</code> |
     * <code>waiting-for-shutdown</code> | <code>bundling</code> |
     * <code>storing</code> | <code>cancelling</code> | <code>complete</code> |
     * <code>failed</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>update-time</code> - The time of the most recent update for the
     * task.
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
     *            <code>bundle-id</code> - The ID of the bundle task.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>error-code</code> - If the task failed, the error code
     *            returned.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>error-message</code> - If the task failed, the error
     *            message returned.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>instance-id</code> - The ID of the instance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>progress</code> - The level of task completion, as a
     *            percentage (for example, 20%).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>s3-bucket</code> - The Amazon S3 bucket to store the
     *            AMI.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>s3-prefix</code> - The beginning of the AMI name.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>start-time</code> - The time the task started (for
     *            example, 2013-09-15T17:15:20.000Z).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>state</code> - The state of the task (
     *            <code>pending</code> | <code>waiting-for-shutdown</code> |
     *            <code>bundling</code> | <code>storing</code> |
     *            <code>cancelling</code> | <code>complete</code> |
     *            <code>failed</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>update-time</code> - The time of the most recent update
     *            for the task.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeBundleTasksRequest withFilters(Filter... filters) {
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
     * <code>bundle-id</code> - The ID of the bundle task.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>error-code</code> - If the task failed, the error code returned.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>error-message</code> - If the task failed, the error message
     * returned.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-id</code> - The ID of the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>progress</code> - The level of task completion, as a percentage
     * (for example, 20%).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3-bucket</code> - The Amazon S3 bucket to store the AMI.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3-prefix</code> - The beginning of the AMI name.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>start-time</code> - The time the task started (for example,
     * 2013-09-15T17:15:20.000Z).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the task (<code>pending</code> |
     * <code>waiting-for-shutdown</code> | <code>bundling</code> |
     * <code>storing</code> | <code>cancelling</code> | <code>complete</code> |
     * <code>failed</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>update-time</code> - The time of the most recent update for the
     * task.
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
     *            <code>bundle-id</code> - The ID of the bundle task.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>error-code</code> - If the task failed, the error code
     *            returned.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>error-message</code> - If the task failed, the error
     *            message returned.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>instance-id</code> - The ID of the instance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>progress</code> - The level of task completion, as a
     *            percentage (for example, 20%).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>s3-bucket</code> - The Amazon S3 bucket to store the
     *            AMI.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>s3-prefix</code> - The beginning of the AMI name.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>start-time</code> - The time the task started (for
     *            example, 2013-09-15T17:15:20.000Z).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>state</code> - The state of the task (
     *            <code>pending</code> | <code>waiting-for-shutdown</code> |
     *            <code>bundling</code> | <code>storing</code> |
     *            <code>cancelling</code> | <code>complete</code> |
     *            <code>failed</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>update-time</code> - The time of the most recent update
     *            for the task.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeBundleTasksRequest withFilters(java.util.Collection<Filter> filters) {
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
    public DescribeBundleTasksRequest withDryRun(Boolean dryRun) {
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
        if (getBundleIds() != null)
            sb.append("BundleIds: " + getBundleIds() + ",");
        if (getFilters() != null)
            sb.append("Filters: " + getFilters() + ",");
        if (getDryRun() != null)
            sb.append("DryRun: " + getDryRun());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBundleIds() == null) ? 0 : getBundleIds().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeBundleTasksRequest == false)
            return false;
        DescribeBundleTasksRequest other = (DescribeBundleTasksRequest) obj;

        if (other.getBundleIds() == null ^ this.getBundleIds() == null)
            return false;
        if (other.getBundleIds() != null
                && other.getBundleIds().equals(this.getBundleIds()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        return true;
    }
}
