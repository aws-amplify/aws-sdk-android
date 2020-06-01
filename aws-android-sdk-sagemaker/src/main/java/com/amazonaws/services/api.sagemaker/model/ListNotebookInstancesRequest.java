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

package com.amazonaws.services.api.sagemaker.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns a list of the Amazon SageMaker notebook instances in the requester's
 * account in an AWS Region.
 * </p>
 */
public class ListNotebookInstancesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * If the previous call to the <code>ListNotebookInstances</code> is
     * truncated, the response includes a <code>NextToken</code>. You can use
     * this token in your subsequent <code>ListNotebookInstances</code> request
     * to fetch the next set of notebook instances.
     * </p>
     * <note>
     * <p>
     * You might specify a filter or a sort order in your request. When response
     * is truncated, you must use the same values for the filer and sort order
     * in the next request.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.*<br/>
     */
    private String nextToken;

    /**
     * <p>
     * The maximum number of notebook instances to return.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * The field to sort results by. The default is <code>Name</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Name, CreationTime, Status
     */
    private String sortBy;

    /**
     * <p>
     * The sort order for results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Ascending, Descending
     */
    private String sortOrder;

    /**
     * <p>
     * A string in the notebook instances' name. This filter returns only
     * notebook instances whose name contains the specified string.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>[a-zA-Z0-9-]+<br/>
     */
    private String nameContains;

    /**
     * <p>
     * A filter that returns only notebook instances that were created before
     * the specified time (timestamp).
     * </p>
     */
    private java.util.Date creationTimeBefore;

    /**
     * <p>
     * A filter that returns only notebook instances that were created after the
     * specified time (timestamp).
     * </p>
     */
    private java.util.Date creationTimeAfter;

    /**
     * <p>
     * A filter that returns only notebook instances that were modified before
     * the specified time (timestamp).
     * </p>
     */
    private java.util.Date lastModifiedTimeBefore;

    /**
     * <p>
     * A filter that returns only notebook instances that were modified after
     * the specified time (timestamp).
     * </p>
     */
    private java.util.Date lastModifiedTimeAfter;

    /**
     * <p>
     * A filter that returns only notebook instances with the specified status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InService, Stopping, Stopped, Failed,
     * Deleting, Updating
     */
    private String statusEquals;

    /**
     * <p>
     * A string in the name of a notebook instances lifecycle configuration
     * associated with this notebook instance. This filter returns only notebook
     * instances associated with a lifecycle configuration with a name that
     * contains the specified string.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     */
    private String notebookInstanceLifecycleConfigNameContains;

    /**
     * <p>
     * A string in the name or URL of a Git repository associated with this
     * notebook instance. This filter returns only notebook instances associated
     * with a git repository with a name that contains the specified string.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>[a-zA-Z0-9-]+<br/>
     */
    private String defaultCodeRepositoryContains;

    /**
     * <p>
     * A filter that returns only notebook instances with associated with the
     * specified git repository.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>^https://([^/]+)/?(.*)$|^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     */
    private String additionalCodeRepositoryEquals;

    /**
     * <p>
     * If the previous call to the <code>ListNotebookInstances</code> is
     * truncated, the response includes a <code>NextToken</code>. You can use
     * this token in your subsequent <code>ListNotebookInstances</code> request
     * to fetch the next set of notebook instances.
     * </p>
     * <note>
     * <p>
     * You might specify a filter or a sort order in your request. When response
     * is truncated, you must use the same values for the filer and sort order
     * in the next request.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @return <p>
     *         If the previous call to the <code>ListNotebookInstances</code> is
     *         truncated, the response includes a <code>NextToken</code>. You
     *         can use this token in your subsequent
     *         <code>ListNotebookInstances</code> request to fetch the next set
     *         of notebook instances.
     *         </p>
     *         <note>
     *         <p>
     *         You might specify a filter or a sort order in your request. When
     *         response is truncated, you must use the same values for the filer
     *         and sort order in the next request.
     *         </p>
     *         </note>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If the previous call to the <code>ListNotebookInstances</code> is
     * truncated, the response includes a <code>NextToken</code>. You can use
     * this token in your subsequent <code>ListNotebookInstances</code> request
     * to fetch the next set of notebook instances.
     * </p>
     * <note>
     * <p>
     * You might specify a filter or a sort order in your request. When response
     * is truncated, you must use the same values for the filer and sort order
     * in the next request.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param nextToken <p>
     *            If the previous call to the <code>ListNotebookInstances</code>
     *            is truncated, the response includes a <code>NextToken</code>.
     *            You can use this token in your subsequent
     *            <code>ListNotebookInstances</code> request to fetch the next
     *            set of notebook instances.
     *            </p>
     *            <note>
     *            <p>
     *            You might specify a filter or a sort order in your request.
     *            When response is truncated, you must use the same values for
     *            the filer and sort order in the next request.
     *            </p>
     *            </note>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the previous call to the <code>ListNotebookInstances</code> is
     * truncated, the response includes a <code>NextToken</code>. You can use
     * this token in your subsequent <code>ListNotebookInstances</code> request
     * to fetch the next set of notebook instances.
     * </p>
     * <note>
     * <p>
     * You might specify a filter or a sort order in your request. When response
     * is truncated, you must use the same values for the filer and sort order
     * in the next request.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param nextToken <p>
     *            If the previous call to the <code>ListNotebookInstances</code>
     *            is truncated, the response includes a <code>NextToken</code>.
     *            You can use this token in your subsequent
     *            <code>ListNotebookInstances</code> request to fetch the next
     *            set of notebook instances.
     *            </p>
     *            <note>
     *            <p>
     *            You might specify a filter or a sort order in your request.
     *            When response is truncated, you must use the same values for
     *            the filer and sort order in the next request.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListNotebookInstancesRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The maximum number of notebook instances to return.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @return <p>
     *         The maximum number of notebook instances to return.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of notebook instances to return.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param maxResults <p>
     *            The maximum number of notebook instances to return.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of notebook instances to return.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param maxResults <p>
     *            The maximum number of notebook instances to return.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListNotebookInstancesRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * The field to sort results by. The default is <code>Name</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Name, CreationTime, Status
     *
     * @return <p>
     *         The field to sort results by. The default is <code>Name</code>.
     *         </p>
     * @see NotebookInstanceSortKey
     */
    public String getSortBy() {
        return sortBy;
    }

    /**
     * <p>
     * The field to sort results by. The default is <code>Name</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Name, CreationTime, Status
     *
     * @param sortBy <p>
     *            The field to sort results by. The default is <code>Name</code>
     *            .
     *            </p>
     * @see NotebookInstanceSortKey
     */
    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    /**
     * <p>
     * The field to sort results by. The default is <code>Name</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Name, CreationTime, Status
     *
     * @param sortBy <p>
     *            The field to sort results by. The default is <code>Name</code>
     *            .
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see NotebookInstanceSortKey
     */
    public ListNotebookInstancesRequest withSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }

    /**
     * <p>
     * The field to sort results by. The default is <code>Name</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Name, CreationTime, Status
     *
     * @param sortBy <p>
     *            The field to sort results by. The default is <code>Name</code>
     *            .
     *            </p>
     * @see NotebookInstanceSortKey
     */
    public void setSortBy(NotebookInstanceSortKey sortBy) {
        this.sortBy = sortBy.toString();
    }

    /**
     * <p>
     * The field to sort results by. The default is <code>Name</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Name, CreationTime, Status
     *
     * @param sortBy <p>
     *            The field to sort results by. The default is <code>Name</code>
     *            .
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see NotebookInstanceSortKey
     */
    public ListNotebookInstancesRequest withSortBy(NotebookInstanceSortKey sortBy) {
        this.sortBy = sortBy.toString();
        return this;
    }

    /**
     * <p>
     * The sort order for results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Ascending, Descending
     *
     * @return <p>
     *         The sort order for results.
     *         </p>
     * @see NotebookInstanceSortOrder
     */
    public String getSortOrder() {
        return sortOrder;
    }

    /**
     * <p>
     * The sort order for results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Ascending, Descending
     *
     * @param sortOrder <p>
     *            The sort order for results.
     *            </p>
     * @see NotebookInstanceSortOrder
     */
    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * <p>
     * The sort order for results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Ascending, Descending
     *
     * @param sortOrder <p>
     *            The sort order for results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see NotebookInstanceSortOrder
     */
    public ListNotebookInstancesRequest withSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }

    /**
     * <p>
     * The sort order for results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Ascending, Descending
     *
     * @param sortOrder <p>
     *            The sort order for results.
     *            </p>
     * @see NotebookInstanceSortOrder
     */
    public void setSortOrder(NotebookInstanceSortOrder sortOrder) {
        this.sortOrder = sortOrder.toString();
    }

    /**
     * <p>
     * The sort order for results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Ascending, Descending
     *
     * @param sortOrder <p>
     *            The sort order for results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see NotebookInstanceSortOrder
     */
    public ListNotebookInstancesRequest withSortOrder(NotebookInstanceSortOrder sortOrder) {
        this.sortOrder = sortOrder.toString();
        return this;
    }

    /**
     * <p>
     * A string in the notebook instances' name. This filter returns only
     * notebook instances whose name contains the specified string.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>[a-zA-Z0-9-]+<br/>
     *
     * @return <p>
     *         A string in the notebook instances' name. This filter returns
     *         only notebook instances whose name contains the specified string.
     *         </p>
     */
    public String getNameContains() {
        return nameContains;
    }

    /**
     * <p>
     * A string in the notebook instances' name. This filter returns only
     * notebook instances whose name contains the specified string.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>[a-zA-Z0-9-]+<br/>
     *
     * @param nameContains <p>
     *            A string in the notebook instances' name. This filter returns
     *            only notebook instances whose name contains the specified
     *            string.
     *            </p>
     */
    public void setNameContains(String nameContains) {
        this.nameContains = nameContains;
    }

    /**
     * <p>
     * A string in the notebook instances' name. This filter returns only
     * notebook instances whose name contains the specified string.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>[a-zA-Z0-9-]+<br/>
     *
     * @param nameContains <p>
     *            A string in the notebook instances' name. This filter returns
     *            only notebook instances whose name contains the specified
     *            string.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListNotebookInstancesRequest withNameContains(String nameContains) {
        this.nameContains = nameContains;
        return this;
    }

    /**
     * <p>
     * A filter that returns only notebook instances that were created before
     * the specified time (timestamp).
     * </p>
     *
     * @return <p>
     *         A filter that returns only notebook instances that were created
     *         before the specified time (timestamp).
     *         </p>
     */
    public java.util.Date getCreationTimeBefore() {
        return creationTimeBefore;
    }

    /**
     * <p>
     * A filter that returns only notebook instances that were created before
     * the specified time (timestamp).
     * </p>
     *
     * @param creationTimeBefore <p>
     *            A filter that returns only notebook instances that were
     *            created before the specified time (timestamp).
     *            </p>
     */
    public void setCreationTimeBefore(java.util.Date creationTimeBefore) {
        this.creationTimeBefore = creationTimeBefore;
    }

    /**
     * <p>
     * A filter that returns only notebook instances that were created before
     * the specified time (timestamp).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTimeBefore <p>
     *            A filter that returns only notebook instances that were
     *            created before the specified time (timestamp).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListNotebookInstancesRequest withCreationTimeBefore(java.util.Date creationTimeBefore) {
        this.creationTimeBefore = creationTimeBefore;
        return this;
    }

    /**
     * <p>
     * A filter that returns only notebook instances that were created after the
     * specified time (timestamp).
     * </p>
     *
     * @return <p>
     *         A filter that returns only notebook instances that were created
     *         after the specified time (timestamp).
     *         </p>
     */
    public java.util.Date getCreationTimeAfter() {
        return creationTimeAfter;
    }

    /**
     * <p>
     * A filter that returns only notebook instances that were created after the
     * specified time (timestamp).
     * </p>
     *
     * @param creationTimeAfter <p>
     *            A filter that returns only notebook instances that were
     *            created after the specified time (timestamp).
     *            </p>
     */
    public void setCreationTimeAfter(java.util.Date creationTimeAfter) {
        this.creationTimeAfter = creationTimeAfter;
    }

    /**
     * <p>
     * A filter that returns only notebook instances that were created after the
     * specified time (timestamp).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTimeAfter <p>
     *            A filter that returns only notebook instances that were
     *            created after the specified time (timestamp).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListNotebookInstancesRequest withCreationTimeAfter(java.util.Date creationTimeAfter) {
        this.creationTimeAfter = creationTimeAfter;
        return this;
    }

    /**
     * <p>
     * A filter that returns only notebook instances that were modified before
     * the specified time (timestamp).
     * </p>
     *
     * @return <p>
     *         A filter that returns only notebook instances that were modified
     *         before the specified time (timestamp).
     *         </p>
     */
    public java.util.Date getLastModifiedTimeBefore() {
        return lastModifiedTimeBefore;
    }

    /**
     * <p>
     * A filter that returns only notebook instances that were modified before
     * the specified time (timestamp).
     * </p>
     *
     * @param lastModifiedTimeBefore <p>
     *            A filter that returns only notebook instances that were
     *            modified before the specified time (timestamp).
     *            </p>
     */
    public void setLastModifiedTimeBefore(java.util.Date lastModifiedTimeBefore) {
        this.lastModifiedTimeBefore = lastModifiedTimeBefore;
    }

    /**
     * <p>
     * A filter that returns only notebook instances that were modified before
     * the specified time (timestamp).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModifiedTimeBefore <p>
     *            A filter that returns only notebook instances that were
     *            modified before the specified time (timestamp).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListNotebookInstancesRequest withLastModifiedTimeBefore(
            java.util.Date lastModifiedTimeBefore) {
        this.lastModifiedTimeBefore = lastModifiedTimeBefore;
        return this;
    }

    /**
     * <p>
     * A filter that returns only notebook instances that were modified after
     * the specified time (timestamp).
     * </p>
     *
     * @return <p>
     *         A filter that returns only notebook instances that were modified
     *         after the specified time (timestamp).
     *         </p>
     */
    public java.util.Date getLastModifiedTimeAfter() {
        return lastModifiedTimeAfter;
    }

    /**
     * <p>
     * A filter that returns only notebook instances that were modified after
     * the specified time (timestamp).
     * </p>
     *
     * @param lastModifiedTimeAfter <p>
     *            A filter that returns only notebook instances that were
     *            modified after the specified time (timestamp).
     *            </p>
     */
    public void setLastModifiedTimeAfter(java.util.Date lastModifiedTimeAfter) {
        this.lastModifiedTimeAfter = lastModifiedTimeAfter;
    }

    /**
     * <p>
     * A filter that returns only notebook instances that were modified after
     * the specified time (timestamp).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModifiedTimeAfter <p>
     *            A filter that returns only notebook instances that were
     *            modified after the specified time (timestamp).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListNotebookInstancesRequest withLastModifiedTimeAfter(
            java.util.Date lastModifiedTimeAfter) {
        this.lastModifiedTimeAfter = lastModifiedTimeAfter;
        return this;
    }

    /**
     * <p>
     * A filter that returns only notebook instances with the specified status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InService, Stopping, Stopped, Failed,
     * Deleting, Updating
     *
     * @return <p>
     *         A filter that returns only notebook instances with the specified
     *         status.
     *         </p>
     * @see NotebookInstanceStatus
     */
    public String getStatusEquals() {
        return statusEquals;
    }

    /**
     * <p>
     * A filter that returns only notebook instances with the specified status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InService, Stopping, Stopped, Failed,
     * Deleting, Updating
     *
     * @param statusEquals <p>
     *            A filter that returns only notebook instances with the
     *            specified status.
     *            </p>
     * @see NotebookInstanceStatus
     */
    public void setStatusEquals(String statusEquals) {
        this.statusEquals = statusEquals;
    }

    /**
     * <p>
     * A filter that returns only notebook instances with the specified status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InService, Stopping, Stopped, Failed,
     * Deleting, Updating
     *
     * @param statusEquals <p>
     *            A filter that returns only notebook instances with the
     *            specified status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see NotebookInstanceStatus
     */
    public ListNotebookInstancesRequest withStatusEquals(String statusEquals) {
        this.statusEquals = statusEquals;
        return this;
    }

    /**
     * <p>
     * A filter that returns only notebook instances with the specified status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InService, Stopping, Stopped, Failed,
     * Deleting, Updating
     *
     * @param statusEquals <p>
     *            A filter that returns only notebook instances with the
     *            specified status.
     *            </p>
     * @see NotebookInstanceStatus
     */
    public void setStatusEquals(NotebookInstanceStatus statusEquals) {
        this.statusEquals = statusEquals.toString();
    }

    /**
     * <p>
     * A filter that returns only notebook instances with the specified status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, InService, Stopping, Stopped, Failed,
     * Deleting, Updating
     *
     * @param statusEquals <p>
     *            A filter that returns only notebook instances with the
     *            specified status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see NotebookInstanceStatus
     */
    public ListNotebookInstancesRequest withStatusEquals(NotebookInstanceStatus statusEquals) {
        this.statusEquals = statusEquals.toString();
        return this;
    }

    /**
     * <p>
     * A string in the name of a notebook instances lifecycle configuration
     * associated with this notebook instance. This filter returns only notebook
     * instances associated with a lifecycle configuration with a name that
     * contains the specified string.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @return <p>
     *         A string in the name of a notebook instances lifecycle
     *         configuration associated with this notebook instance. This filter
     *         returns only notebook instances associated with a lifecycle
     *         configuration with a name that contains the specified string.
     *         </p>
     */
    public String getNotebookInstanceLifecycleConfigNameContains() {
        return notebookInstanceLifecycleConfigNameContains;
    }

    /**
     * <p>
     * A string in the name of a notebook instances lifecycle configuration
     * associated with this notebook instance. This filter returns only notebook
     * instances associated with a lifecycle configuration with a name that
     * contains the specified string.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param notebookInstanceLifecycleConfigNameContains <p>
     *            A string in the name of a notebook instances lifecycle
     *            configuration associated with this notebook instance. This
     *            filter returns only notebook instances associated with a
     *            lifecycle configuration with a name that contains the
     *            specified string.
     *            </p>
     */
    public void setNotebookInstanceLifecycleConfigNameContains(
            String notebookInstanceLifecycleConfigNameContains) {
        this.notebookInstanceLifecycleConfigNameContains = notebookInstanceLifecycleConfigNameContains;
    }

    /**
     * <p>
     * A string in the name of a notebook instances lifecycle configuration
     * associated with this notebook instance. This filter returns only notebook
     * instances associated with a lifecycle configuration with a name that
     * contains the specified string.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param notebookInstanceLifecycleConfigNameContains <p>
     *            A string in the name of a notebook instances lifecycle
     *            configuration associated with this notebook instance. This
     *            filter returns only notebook instances associated with a
     *            lifecycle configuration with a name that contains the
     *            specified string.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListNotebookInstancesRequest withNotebookInstanceLifecycleConfigNameContains(
            String notebookInstanceLifecycleConfigNameContains) {
        this.notebookInstanceLifecycleConfigNameContains = notebookInstanceLifecycleConfigNameContains;
        return this;
    }

    /**
     * <p>
     * A string in the name or URL of a Git repository associated with this
     * notebook instance. This filter returns only notebook instances associated
     * with a git repository with a name that contains the specified string.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>[a-zA-Z0-9-]+<br/>
     *
     * @return <p>
     *         A string in the name or URL of a Git repository associated with
     *         this notebook instance. This filter returns only notebook
     *         instances associated with a git repository with a name that
     *         contains the specified string.
     *         </p>
     */
    public String getDefaultCodeRepositoryContains() {
        return defaultCodeRepositoryContains;
    }

    /**
     * <p>
     * A string in the name or URL of a Git repository associated with this
     * notebook instance. This filter returns only notebook instances associated
     * with a git repository with a name that contains the specified string.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>[a-zA-Z0-9-]+<br/>
     *
     * @param defaultCodeRepositoryContains <p>
     *            A string in the name or URL of a Git repository associated
     *            with this notebook instance. This filter returns only notebook
     *            instances associated with a git repository with a name that
     *            contains the specified string.
     *            </p>
     */
    public void setDefaultCodeRepositoryContains(String defaultCodeRepositoryContains) {
        this.defaultCodeRepositoryContains = defaultCodeRepositoryContains;
    }

    /**
     * <p>
     * A string in the name or URL of a Git repository associated with this
     * notebook instance. This filter returns only notebook instances associated
     * with a git repository with a name that contains the specified string.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>[a-zA-Z0-9-]+<br/>
     *
     * @param defaultCodeRepositoryContains <p>
     *            A string in the name or URL of a Git repository associated
     *            with this notebook instance. This filter returns only notebook
     *            instances associated with a git repository with a name that
     *            contains the specified string.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListNotebookInstancesRequest withDefaultCodeRepositoryContains(
            String defaultCodeRepositoryContains) {
        this.defaultCodeRepositoryContains = defaultCodeRepositoryContains;
        return this;
    }

    /**
     * <p>
     * A filter that returns only notebook instances with associated with the
     * specified git repository.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>^https://([^/]+)/?(.*)$|^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @return <p>
     *         A filter that returns only notebook instances with associated
     *         with the specified git repository.
     *         </p>
     */
    public String getAdditionalCodeRepositoryEquals() {
        return additionalCodeRepositoryEquals;
    }

    /**
     * <p>
     * A filter that returns only notebook instances with associated with the
     * specified git repository.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>^https://([^/]+)/?(.*)$|^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param additionalCodeRepositoryEquals <p>
     *            A filter that returns only notebook instances with associated
     *            with the specified git repository.
     *            </p>
     */
    public void setAdditionalCodeRepositoryEquals(String additionalCodeRepositoryEquals) {
        this.additionalCodeRepositoryEquals = additionalCodeRepositoryEquals;
    }

    /**
     * <p>
     * A filter that returns only notebook instances with associated with the
     * specified git repository.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>^https://([^/]+)/?(.*)$|^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param additionalCodeRepositoryEquals <p>
     *            A filter that returns only notebook instances with associated
     *            with the specified git repository.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListNotebookInstancesRequest withAdditionalCodeRepositoryEquals(
            String additionalCodeRepositoryEquals) {
        this.additionalCodeRepositoryEquals = additionalCodeRepositoryEquals;
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
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults() + ",");
        if (getSortBy() != null)
            sb.append("SortBy: " + getSortBy() + ",");
        if (getSortOrder() != null)
            sb.append("SortOrder: " + getSortOrder() + ",");
        if (getNameContains() != null)
            sb.append("NameContains: " + getNameContains() + ",");
        if (getCreationTimeBefore() != null)
            sb.append("CreationTimeBefore: " + getCreationTimeBefore() + ",");
        if (getCreationTimeAfter() != null)
            sb.append("CreationTimeAfter: " + getCreationTimeAfter() + ",");
        if (getLastModifiedTimeBefore() != null)
            sb.append("LastModifiedTimeBefore: " + getLastModifiedTimeBefore() + ",");
        if (getLastModifiedTimeAfter() != null)
            sb.append("LastModifiedTimeAfter: " + getLastModifiedTimeAfter() + ",");
        if (getStatusEquals() != null)
            sb.append("StatusEquals: " + getStatusEquals() + ",");
        if (getNotebookInstanceLifecycleConfigNameContains() != null)
            sb.append("NotebookInstanceLifecycleConfigNameContains: "
                    + getNotebookInstanceLifecycleConfigNameContains() + ",");
        if (getDefaultCodeRepositoryContains() != null)
            sb.append("DefaultCodeRepositoryContains: " + getDefaultCodeRepositoryContains() + ",");
        if (getAdditionalCodeRepositoryEquals() != null)
            sb.append("AdditionalCodeRepositoryEquals: " + getAdditionalCodeRepositoryEquals());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getSortBy() == null) ? 0 : getSortBy().hashCode());
        hashCode = prime * hashCode + ((getSortOrder() == null) ? 0 : getSortOrder().hashCode());
        hashCode = prime * hashCode
                + ((getNameContains() == null) ? 0 : getNameContains().hashCode());
        hashCode = prime * hashCode
                + ((getCreationTimeBefore() == null) ? 0 : getCreationTimeBefore().hashCode());
        hashCode = prime * hashCode
                + ((getCreationTimeAfter() == null) ? 0 : getCreationTimeAfter().hashCode());
        hashCode = prime
                * hashCode
                + ((getLastModifiedTimeBefore() == null) ? 0 : getLastModifiedTimeBefore()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getLastModifiedTimeAfter() == null) ? 0 : getLastModifiedTimeAfter().hashCode());
        hashCode = prime * hashCode
                + ((getStatusEquals() == null) ? 0 : getStatusEquals().hashCode());
        hashCode = prime
                * hashCode
                + ((getNotebookInstanceLifecycleConfigNameContains() == null) ? 0
                        : getNotebookInstanceLifecycleConfigNameContains().hashCode());
        hashCode = prime
                * hashCode
                + ((getDefaultCodeRepositoryContains() == null) ? 0
                        : getDefaultCodeRepositoryContains().hashCode());
        hashCode = prime
                * hashCode
                + ((getAdditionalCodeRepositoryEquals() == null) ? 0
                        : getAdditionalCodeRepositoryEquals().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListNotebookInstancesRequest == false)
            return false;
        ListNotebookInstancesRequest other = (ListNotebookInstancesRequest) obj;

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
        if (other.getSortBy() == null ^ this.getSortBy() == null)
            return false;
        if (other.getSortBy() != null && other.getSortBy().equals(this.getSortBy()) == false)
            return false;
        if (other.getSortOrder() == null ^ this.getSortOrder() == null)
            return false;
        if (other.getSortOrder() != null
                && other.getSortOrder().equals(this.getSortOrder()) == false)
            return false;
        if (other.getNameContains() == null ^ this.getNameContains() == null)
            return false;
        if (other.getNameContains() != null
                && other.getNameContains().equals(this.getNameContains()) == false)
            return false;
        if (other.getCreationTimeBefore() == null ^ this.getCreationTimeBefore() == null)
            return false;
        if (other.getCreationTimeBefore() != null
                && other.getCreationTimeBefore().equals(this.getCreationTimeBefore()) == false)
            return false;
        if (other.getCreationTimeAfter() == null ^ this.getCreationTimeAfter() == null)
            return false;
        if (other.getCreationTimeAfter() != null
                && other.getCreationTimeAfter().equals(this.getCreationTimeAfter()) == false)
            return false;
        if (other.getLastModifiedTimeBefore() == null ^ this.getLastModifiedTimeBefore() == null)
            return false;
        if (other.getLastModifiedTimeBefore() != null
                && other.getLastModifiedTimeBefore().equals(this.getLastModifiedTimeBefore()) == false)
            return false;
        if (other.getLastModifiedTimeAfter() == null ^ this.getLastModifiedTimeAfter() == null)
            return false;
        if (other.getLastModifiedTimeAfter() != null
                && other.getLastModifiedTimeAfter().equals(this.getLastModifiedTimeAfter()) == false)
            return false;
        if (other.getStatusEquals() == null ^ this.getStatusEquals() == null)
            return false;
        if (other.getStatusEquals() != null
                && other.getStatusEquals().equals(this.getStatusEquals()) == false)
            return false;
        if (other.getNotebookInstanceLifecycleConfigNameContains() == null
                ^ this.getNotebookInstanceLifecycleConfigNameContains() == null)
            return false;
        if (other.getNotebookInstanceLifecycleConfigNameContains() != null
                && other.getNotebookInstanceLifecycleConfigNameContains().equals(
                        this.getNotebookInstanceLifecycleConfigNameContains()) == false)
            return false;
        if (other.getDefaultCodeRepositoryContains() == null
                ^ this.getDefaultCodeRepositoryContains() == null)
            return false;
        if (other.getDefaultCodeRepositoryContains() != null
                && other.getDefaultCodeRepositoryContains().equals(
                        this.getDefaultCodeRepositoryContains()) == false)
            return false;
        if (other.getAdditionalCodeRepositoryEquals() == null
                ^ this.getAdditionalCodeRepositoryEquals() == null)
            return false;
        if (other.getAdditionalCodeRepositoryEquals() != null
                && other.getAdditionalCodeRepositoryEquals().equals(
                        this.getAdditionalCodeRepositoryEquals()) == false)
            return false;
        return true;
    }
}
