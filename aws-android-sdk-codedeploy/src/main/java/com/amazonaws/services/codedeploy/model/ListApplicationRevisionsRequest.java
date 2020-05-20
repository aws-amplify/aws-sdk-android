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

package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Lists information about revisions for an application.
 * </p>
 */
public class ListApplicationRevisionsRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of an AWS CodeDeploy application associated with the IAM user or
     * AWS account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String applicationName;

    /**
     * <p>
     * The column name to use to sort the list results:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>registerTime</code>: Sort by the time the revisions were registered
     * with AWS CodeDeploy.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>firstUsedTime</code>: Sort by the time the revisions were first
     * used in a deployment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>lastUsedTime</code>: Sort by the time the revisions were last used
     * in a deployment.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If not specified or set to null, the results are returned in an arbitrary
     * order.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>registerTime, firstUsedTime, lastUsedTime
     */
    private String sortBy;

    /**
     * <p>
     * The order in which to sort the list results:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ascending</code>: ascending order.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>descending</code>: descending order.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If not specified, the results are sorted in ascending order.
     * </p>
     * <p>
     * If set to null, the results are sorted in an arbitrary order.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ascending, descending
     */
    private String sortOrder;

    /**
     * <p>
     * An Amazon S3 bucket name to limit the search for revisions.
     * </p>
     * <p>
     * If set to null, all of the user's buckets are searched.
     * </p>
     */
    private String s3Bucket;

    /**
     * <p>
     * A key prefix for the set of Amazon S3 objects to limit the search for
     * revisions.
     * </p>
     */
    private String s3KeyPrefix;

    /**
     * <p>
     * Whether to list revisions based on whether the revision is the target
     * revision of a deployment group:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>include</code>: List revisions that are target revisions of a
     * deployment group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>exclude</code>: Do not list revisions that are target revisions of
     * a deployment group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ignore</code>: List all revisions.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>include, exclude, ignore
     */
    private String deployed;

    /**
     * <p>
     * An identifier returned from the previous
     * <code>ListApplicationRevisions</code> call. It can be used to return the
     * next set of applications in the list.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The name of an AWS CodeDeploy application associated with the IAM user or
     * AWS account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The name of an AWS CodeDeploy application associated with the IAM
     *         user or AWS account.
     *         </p>
     */
    public String getApplicationName() {
        return applicationName;
    }

    /**
     * <p>
     * The name of an AWS CodeDeploy application associated with the IAM user or
     * AWS account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName <p>
     *            The name of an AWS CodeDeploy application associated with the
     *            IAM user or AWS account.
     *            </p>
     */
    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    /**
     * <p>
     * The name of an AWS CodeDeploy application associated with the IAM user or
     * AWS account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName <p>
     *            The name of an AWS CodeDeploy application associated with the
     *            IAM user or AWS account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListApplicationRevisionsRequest withApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }

    /**
     * <p>
     * The column name to use to sort the list results:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>registerTime</code>: Sort by the time the revisions were registered
     * with AWS CodeDeploy.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>firstUsedTime</code>: Sort by the time the revisions were first
     * used in a deployment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>lastUsedTime</code>: Sort by the time the revisions were last used
     * in a deployment.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If not specified or set to null, the results are returned in an arbitrary
     * order.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>registerTime, firstUsedTime, lastUsedTime
     *
     * @return <p>
     *         The column name to use to sort the list results:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>registerTime</code>: Sort by the time the revisions were
     *         registered with AWS CodeDeploy.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>firstUsedTime</code>: Sort by the time the revisions were
     *         first used in a deployment.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>lastUsedTime</code>: Sort by the time the revisions were
     *         last used in a deployment.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If not specified or set to null, the results are returned in an
     *         arbitrary order.
     *         </p>
     * @see ApplicationRevisionSortBy
     */
    public String getSortBy() {
        return sortBy;
    }

    /**
     * <p>
     * The column name to use to sort the list results:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>registerTime</code>: Sort by the time the revisions were registered
     * with AWS CodeDeploy.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>firstUsedTime</code>: Sort by the time the revisions were first
     * used in a deployment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>lastUsedTime</code>: Sort by the time the revisions were last used
     * in a deployment.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If not specified or set to null, the results are returned in an arbitrary
     * order.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>registerTime, firstUsedTime, lastUsedTime
     *
     * @param sortBy <p>
     *            The column name to use to sort the list results:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>registerTime</code>: Sort by the time the revisions were
     *            registered with AWS CodeDeploy.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>firstUsedTime</code>: Sort by the time the revisions
     *            were first used in a deployment.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>lastUsedTime</code>: Sort by the time the revisions were
     *            last used in a deployment.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If not specified or set to null, the results are returned in
     *            an arbitrary order.
     *            </p>
     * @see ApplicationRevisionSortBy
     */
    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    /**
     * <p>
     * The column name to use to sort the list results:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>registerTime</code>: Sort by the time the revisions were registered
     * with AWS CodeDeploy.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>firstUsedTime</code>: Sort by the time the revisions were first
     * used in a deployment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>lastUsedTime</code>: Sort by the time the revisions were last used
     * in a deployment.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If not specified or set to null, the results are returned in an arbitrary
     * order.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>registerTime, firstUsedTime, lastUsedTime
     *
     * @param sortBy <p>
     *            The column name to use to sort the list results:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>registerTime</code>: Sort by the time the revisions were
     *            registered with AWS CodeDeploy.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>firstUsedTime</code>: Sort by the time the revisions
     *            were first used in a deployment.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>lastUsedTime</code>: Sort by the time the revisions were
     *            last used in a deployment.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If not specified or set to null, the results are returned in
     *            an arbitrary order.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ApplicationRevisionSortBy
     */
    public ListApplicationRevisionsRequest withSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }

    /**
     * <p>
     * The column name to use to sort the list results:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>registerTime</code>: Sort by the time the revisions were registered
     * with AWS CodeDeploy.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>firstUsedTime</code>: Sort by the time the revisions were first
     * used in a deployment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>lastUsedTime</code>: Sort by the time the revisions were last used
     * in a deployment.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If not specified or set to null, the results are returned in an arbitrary
     * order.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>registerTime, firstUsedTime, lastUsedTime
     *
     * @param sortBy <p>
     *            The column name to use to sort the list results:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>registerTime</code>: Sort by the time the revisions were
     *            registered with AWS CodeDeploy.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>firstUsedTime</code>: Sort by the time the revisions
     *            were first used in a deployment.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>lastUsedTime</code>: Sort by the time the revisions were
     *            last used in a deployment.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If not specified or set to null, the results are returned in
     *            an arbitrary order.
     *            </p>
     * @see ApplicationRevisionSortBy
     */
    public void setSortBy(ApplicationRevisionSortBy sortBy) {
        this.sortBy = sortBy.toString();
    }

    /**
     * <p>
     * The column name to use to sort the list results:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>registerTime</code>: Sort by the time the revisions were registered
     * with AWS CodeDeploy.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>firstUsedTime</code>: Sort by the time the revisions were first
     * used in a deployment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>lastUsedTime</code>: Sort by the time the revisions were last used
     * in a deployment.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If not specified or set to null, the results are returned in an arbitrary
     * order.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>registerTime, firstUsedTime, lastUsedTime
     *
     * @param sortBy <p>
     *            The column name to use to sort the list results:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>registerTime</code>: Sort by the time the revisions were
     *            registered with AWS CodeDeploy.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>firstUsedTime</code>: Sort by the time the revisions
     *            were first used in a deployment.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>lastUsedTime</code>: Sort by the time the revisions were
     *            last used in a deployment.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If not specified or set to null, the results are returned in
     *            an arbitrary order.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ApplicationRevisionSortBy
     */
    public ListApplicationRevisionsRequest withSortBy(ApplicationRevisionSortBy sortBy) {
        this.sortBy = sortBy.toString();
        return this;
    }

    /**
     * <p>
     * The order in which to sort the list results:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ascending</code>: ascending order.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>descending</code>: descending order.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If not specified, the results are sorted in ascending order.
     * </p>
     * <p>
     * If set to null, the results are sorted in an arbitrary order.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ascending, descending
     *
     * @return <p>
     *         The order in which to sort the list results:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ascending</code>: ascending order.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>descending</code>: descending order.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If not specified, the results are sorted in ascending order.
     *         </p>
     *         <p>
     *         If set to null, the results are sorted in an arbitrary order.
     *         </p>
     * @see SortOrder
     */
    public String getSortOrder() {
        return sortOrder;
    }

    /**
     * <p>
     * The order in which to sort the list results:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ascending</code>: ascending order.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>descending</code>: descending order.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If not specified, the results are sorted in ascending order.
     * </p>
     * <p>
     * If set to null, the results are sorted in an arbitrary order.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ascending, descending
     *
     * @param sortOrder <p>
     *            The order in which to sort the list results:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ascending</code>: ascending order.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>descending</code>: descending order.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If not specified, the results are sorted in ascending order.
     *            </p>
     *            <p>
     *            If set to null, the results are sorted in an arbitrary order.
     *            </p>
     * @see SortOrder
     */
    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * <p>
     * The order in which to sort the list results:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ascending</code>: ascending order.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>descending</code>: descending order.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If not specified, the results are sorted in ascending order.
     * </p>
     * <p>
     * If set to null, the results are sorted in an arbitrary order.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ascending, descending
     *
     * @param sortOrder <p>
     *            The order in which to sort the list results:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ascending</code>: ascending order.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>descending</code>: descending order.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If not specified, the results are sorted in ascending order.
     *            </p>
     *            <p>
     *            If set to null, the results are sorted in an arbitrary order.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SortOrder
     */
    public ListApplicationRevisionsRequest withSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }

    /**
     * <p>
     * The order in which to sort the list results:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ascending</code>: ascending order.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>descending</code>: descending order.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If not specified, the results are sorted in ascending order.
     * </p>
     * <p>
     * If set to null, the results are sorted in an arbitrary order.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ascending, descending
     *
     * @param sortOrder <p>
     *            The order in which to sort the list results:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ascending</code>: ascending order.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>descending</code>: descending order.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If not specified, the results are sorted in ascending order.
     *            </p>
     *            <p>
     *            If set to null, the results are sorted in an arbitrary order.
     *            </p>
     * @see SortOrder
     */
    public void setSortOrder(SortOrder sortOrder) {
        this.sortOrder = sortOrder.toString();
    }

    /**
     * <p>
     * The order in which to sort the list results:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ascending</code>: ascending order.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>descending</code>: descending order.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If not specified, the results are sorted in ascending order.
     * </p>
     * <p>
     * If set to null, the results are sorted in an arbitrary order.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ascending, descending
     *
     * @param sortOrder <p>
     *            The order in which to sort the list results:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ascending</code>: ascending order.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>descending</code>: descending order.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If not specified, the results are sorted in ascending order.
     *            </p>
     *            <p>
     *            If set to null, the results are sorted in an arbitrary order.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SortOrder
     */
    public ListApplicationRevisionsRequest withSortOrder(SortOrder sortOrder) {
        this.sortOrder = sortOrder.toString();
        return this;
    }

    /**
     * <p>
     * An Amazon S3 bucket name to limit the search for revisions.
     * </p>
     * <p>
     * If set to null, all of the user's buckets are searched.
     * </p>
     *
     * @return <p>
     *         An Amazon S3 bucket name to limit the search for revisions.
     *         </p>
     *         <p>
     *         If set to null, all of the user's buckets are searched.
     *         </p>
     */
    public String getS3Bucket() {
        return s3Bucket;
    }

    /**
     * <p>
     * An Amazon S3 bucket name to limit the search for revisions.
     * </p>
     * <p>
     * If set to null, all of the user's buckets are searched.
     * </p>
     *
     * @param s3Bucket <p>
     *            An Amazon S3 bucket name to limit the search for revisions.
     *            </p>
     *            <p>
     *            If set to null, all of the user's buckets are searched.
     *            </p>
     */
    public void setS3Bucket(String s3Bucket) {
        this.s3Bucket = s3Bucket;
    }

    /**
     * <p>
     * An Amazon S3 bucket name to limit the search for revisions.
     * </p>
     * <p>
     * If set to null, all of the user's buckets are searched.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param s3Bucket <p>
     *            An Amazon S3 bucket name to limit the search for revisions.
     *            </p>
     *            <p>
     *            If set to null, all of the user's buckets are searched.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListApplicationRevisionsRequest withS3Bucket(String s3Bucket) {
        this.s3Bucket = s3Bucket;
        return this;
    }

    /**
     * <p>
     * A key prefix for the set of Amazon S3 objects to limit the search for
     * revisions.
     * </p>
     *
     * @return <p>
     *         A key prefix for the set of Amazon S3 objects to limit the search
     *         for revisions.
     *         </p>
     */
    public String getS3KeyPrefix() {
        return s3KeyPrefix;
    }

    /**
     * <p>
     * A key prefix for the set of Amazon S3 objects to limit the search for
     * revisions.
     * </p>
     *
     * @param s3KeyPrefix <p>
     *            A key prefix for the set of Amazon S3 objects to limit the
     *            search for revisions.
     *            </p>
     */
    public void setS3KeyPrefix(String s3KeyPrefix) {
        this.s3KeyPrefix = s3KeyPrefix;
    }

    /**
     * <p>
     * A key prefix for the set of Amazon S3 objects to limit the search for
     * revisions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param s3KeyPrefix <p>
     *            A key prefix for the set of Amazon S3 objects to limit the
     *            search for revisions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListApplicationRevisionsRequest withS3KeyPrefix(String s3KeyPrefix) {
        this.s3KeyPrefix = s3KeyPrefix;
        return this;
    }

    /**
     * <p>
     * Whether to list revisions based on whether the revision is the target
     * revision of a deployment group:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>include</code>: List revisions that are target revisions of a
     * deployment group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>exclude</code>: Do not list revisions that are target revisions of
     * a deployment group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ignore</code>: List all revisions.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>include, exclude, ignore
     *
     * @return <p>
     *         Whether to list revisions based on whether the revision is the
     *         target revision of a deployment group:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>include</code>: List revisions that are target revisions of
     *         a deployment group.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>exclude</code>: Do not list revisions that are target
     *         revisions of a deployment group.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ignore</code>: List all revisions.
     *         </p>
     *         </li>
     *         </ul>
     * @see ListStateFilterAction
     */
    public String getDeployed() {
        return deployed;
    }

    /**
     * <p>
     * Whether to list revisions based on whether the revision is the target
     * revision of a deployment group:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>include</code>: List revisions that are target revisions of a
     * deployment group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>exclude</code>: Do not list revisions that are target revisions of
     * a deployment group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ignore</code>: List all revisions.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>include, exclude, ignore
     *
     * @param deployed <p>
     *            Whether to list revisions based on whether the revision is the
     *            target revision of a deployment group:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>include</code>: List revisions that are target revisions
     *            of a deployment group.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>exclude</code>: Do not list revisions that are target
     *            revisions of a deployment group.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ignore</code>: List all revisions.
     *            </p>
     *            </li>
     *            </ul>
     * @see ListStateFilterAction
     */
    public void setDeployed(String deployed) {
        this.deployed = deployed;
    }

    /**
     * <p>
     * Whether to list revisions based on whether the revision is the target
     * revision of a deployment group:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>include</code>: List revisions that are target revisions of a
     * deployment group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>exclude</code>: Do not list revisions that are target revisions of
     * a deployment group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ignore</code>: List all revisions.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>include, exclude, ignore
     *
     * @param deployed <p>
     *            Whether to list revisions based on whether the revision is the
     *            target revision of a deployment group:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>include</code>: List revisions that are target revisions
     *            of a deployment group.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>exclude</code>: Do not list revisions that are target
     *            revisions of a deployment group.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ignore</code>: List all revisions.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ListStateFilterAction
     */
    public ListApplicationRevisionsRequest withDeployed(String deployed) {
        this.deployed = deployed;
        return this;
    }

    /**
     * <p>
     * Whether to list revisions based on whether the revision is the target
     * revision of a deployment group:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>include</code>: List revisions that are target revisions of a
     * deployment group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>exclude</code>: Do not list revisions that are target revisions of
     * a deployment group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ignore</code>: List all revisions.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>include, exclude, ignore
     *
     * @param deployed <p>
     *            Whether to list revisions based on whether the revision is the
     *            target revision of a deployment group:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>include</code>: List revisions that are target revisions
     *            of a deployment group.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>exclude</code>: Do not list revisions that are target
     *            revisions of a deployment group.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ignore</code>: List all revisions.
     *            </p>
     *            </li>
     *            </ul>
     * @see ListStateFilterAction
     */
    public void setDeployed(ListStateFilterAction deployed) {
        this.deployed = deployed.toString();
    }

    /**
     * <p>
     * Whether to list revisions based on whether the revision is the target
     * revision of a deployment group:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>include</code>: List revisions that are target revisions of a
     * deployment group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>exclude</code>: Do not list revisions that are target revisions of
     * a deployment group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ignore</code>: List all revisions.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>include, exclude, ignore
     *
     * @param deployed <p>
     *            Whether to list revisions based on whether the revision is the
     *            target revision of a deployment group:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>include</code>: List revisions that are target revisions
     *            of a deployment group.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>exclude</code>: Do not list revisions that are target
     *            revisions of a deployment group.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ignore</code>: List all revisions.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ListStateFilterAction
     */
    public ListApplicationRevisionsRequest withDeployed(ListStateFilterAction deployed) {
        this.deployed = deployed.toString();
        return this;
    }

    /**
     * <p>
     * An identifier returned from the previous
     * <code>ListApplicationRevisions</code> call. It can be used to return the
     * next set of applications in the list.
     * </p>
     *
     * @return <p>
     *         An identifier returned from the previous
     *         <code>ListApplicationRevisions</code> call. It can be used to
     *         return the next set of applications in the list.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * An identifier returned from the previous
     * <code>ListApplicationRevisions</code> call. It can be used to return the
     * next set of applications in the list.
     * </p>
     *
     * @param nextToken <p>
     *            An identifier returned from the previous
     *            <code>ListApplicationRevisions</code> call. It can be used to
     *            return the next set of applications in the list.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An identifier returned from the previous
     * <code>ListApplicationRevisions</code> call. It can be used to return the
     * next set of applications in the list.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            An identifier returned from the previous
     *            <code>ListApplicationRevisions</code> call. It can be used to
     *            return the next set of applications in the list.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListApplicationRevisionsRequest withNextToken(String nextToken) {
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
        if (getApplicationName() != null)
            sb.append("applicationName: " + getApplicationName() + ",");
        if (getSortBy() != null)
            sb.append("sortBy: " + getSortBy() + ",");
        if (getSortOrder() != null)
            sb.append("sortOrder: " + getSortOrder() + ",");
        if (getS3Bucket() != null)
            sb.append("s3Bucket: " + getS3Bucket() + ",");
        if (getS3KeyPrefix() != null)
            sb.append("s3KeyPrefix: " + getS3KeyPrefix() + ",");
        if (getDeployed() != null)
            sb.append("deployed: " + getDeployed() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getApplicationName() == null) ? 0 : getApplicationName().hashCode());
        hashCode = prime * hashCode + ((getSortBy() == null) ? 0 : getSortBy().hashCode());
        hashCode = prime * hashCode + ((getSortOrder() == null) ? 0 : getSortOrder().hashCode());
        hashCode = prime * hashCode + ((getS3Bucket() == null) ? 0 : getS3Bucket().hashCode());
        hashCode = prime * hashCode
                + ((getS3KeyPrefix() == null) ? 0 : getS3KeyPrefix().hashCode());
        hashCode = prime * hashCode + ((getDeployed() == null) ? 0 : getDeployed().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListApplicationRevisionsRequest == false)
            return false;
        ListApplicationRevisionsRequest other = (ListApplicationRevisionsRequest) obj;

        if (other.getApplicationName() == null ^ this.getApplicationName() == null)
            return false;
        if (other.getApplicationName() != null
                && other.getApplicationName().equals(this.getApplicationName()) == false)
            return false;
        if (other.getSortBy() == null ^ this.getSortBy() == null)
            return false;
        if (other.getSortBy() != null && other.getSortBy().equals(this.getSortBy()) == false)
            return false;
        if (other.getSortOrder() == null ^ this.getSortOrder() == null)
            return false;
        if (other.getSortOrder() != null
                && other.getSortOrder().equals(this.getSortOrder()) == false)
            return false;
        if (other.getS3Bucket() == null ^ this.getS3Bucket() == null)
            return false;
        if (other.getS3Bucket() != null && other.getS3Bucket().equals(this.getS3Bucket()) == false)
            return false;
        if (other.getS3KeyPrefix() == null ^ this.getS3KeyPrefix() == null)
            return false;
        if (other.getS3KeyPrefix() != null
                && other.getS3KeyPrefix().equals(this.getS3KeyPrefix()) == false)
            return false;
        if (other.getDeployed() == null ^ this.getDeployed() == null)
            return false;
        if (other.getDeployed() != null && other.getDeployed().equals(this.getDeployed()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
