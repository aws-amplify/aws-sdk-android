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

package com.amazonaws.services.backup.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns metadata about your copy jobs.
 * </p>
 */
public class ListCopyJobsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The next item following a partial list of returned items. For example, if
     * a request is made to return maxResults number of items, NextToken allows
     * you to return more items in your list starting at the location pointed to
     * by the next token.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The maximum number of items to be returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * Returns only copy jobs that match the specified resource Amazon Resource
     * Name (ARN).
     * </p>
     */
    private String byResourceArn;

    /**
     * <p>
     * Returns only copy jobs that are in the specified state.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATED, RUNNING, COMPLETED, FAILED
     */
    private String byState;

    /**
     * <p>
     * Returns only copy jobs that were created before the specified date.
     * </p>
     */
    private java.util.Date byCreatedBefore;

    /**
     * <p>
     * Returns only copy jobs that were created after the specified date.
     * </p>
     */
    private java.util.Date byCreatedAfter;

    /**
     * <p>
     * Returns only backup jobs for the specified resources:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>EBS</code> for Amazon Elastic Block Store
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EFS</code> for Amazon Elastic File System
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RDS</code> for Amazon Relational Database Service
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Storage Gateway</code> for AWS Storage Gateway
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9\-\_\.]{1,50}$<br/>
     */
    private String byResourceType;

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a source backup
     * vault to copy from; for example,
     * <code>arn:aws:backup:us-east-1:123456789012:vault:aBackupVault</code>.
     * </p>
     */
    private String byDestinationVaultArn;

    /**
     * <p>
     * The next item following a partial list of returned items. For example, if
     * a request is made to return maxResults number of items, NextToken allows
     * you to return more items in your list starting at the location pointed to
     * by the next token.
     * </p>
     *
     * @return <p>
     *         The next item following a partial list of returned items. For
     *         example, if a request is made to return maxResults number of
     *         items, NextToken allows you to return more items in your list
     *         starting at the location pointed to by the next token.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The next item following a partial list of returned items. For example, if
     * a request is made to return maxResults number of items, NextToken allows
     * you to return more items in your list starting at the location pointed to
     * by the next token.
     * </p>
     *
     * @param nextToken <p>
     *            The next item following a partial list of returned items. For
     *            example, if a request is made to return maxResults number of
     *            items, NextToken allows you to return more items in your list
     *            starting at the location pointed to by the next token.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The next item following a partial list of returned items. For example, if
     * a request is made to return maxResults number of items, NextToken allows
     * you to return more items in your list starting at the location pointed to
     * by the next token.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The next item following a partial list of returned items. For
     *            example, if a request is made to return maxResults number of
     *            items, NextToken allows you to return more items in your list
     *            starting at the location pointed to by the next token.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListCopyJobsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The maximum number of items to be returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @return <p>
     *         The maximum number of items to be returned.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of items to be returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param maxResults <p>
     *            The maximum number of items to be returned.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of items to be returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param maxResults <p>
     *            The maximum number of items to be returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListCopyJobsRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * Returns only copy jobs that match the specified resource Amazon Resource
     * Name (ARN).
     * </p>
     *
     * @return <p>
     *         Returns only copy jobs that match the specified resource Amazon
     *         Resource Name (ARN).
     *         </p>
     */
    public String getByResourceArn() {
        return byResourceArn;
    }

    /**
     * <p>
     * Returns only copy jobs that match the specified resource Amazon Resource
     * Name (ARN).
     * </p>
     *
     * @param byResourceArn <p>
     *            Returns only copy jobs that match the specified resource
     *            Amazon Resource Name (ARN).
     *            </p>
     */
    public void setByResourceArn(String byResourceArn) {
        this.byResourceArn = byResourceArn;
    }

    /**
     * <p>
     * Returns only copy jobs that match the specified resource Amazon Resource
     * Name (ARN).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param byResourceArn <p>
     *            Returns only copy jobs that match the specified resource
     *            Amazon Resource Name (ARN).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListCopyJobsRequest withByResourceArn(String byResourceArn) {
        this.byResourceArn = byResourceArn;
        return this;
    }

    /**
     * <p>
     * Returns only copy jobs that are in the specified state.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATED, RUNNING, COMPLETED, FAILED
     *
     * @return <p>
     *         Returns only copy jobs that are in the specified state.
     *         </p>
     * @see CopyJobState
     */
    public String getByState() {
        return byState;
    }

    /**
     * <p>
     * Returns only copy jobs that are in the specified state.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATED, RUNNING, COMPLETED, FAILED
     *
     * @param byState <p>
     *            Returns only copy jobs that are in the specified state.
     *            </p>
     * @see CopyJobState
     */
    public void setByState(String byState) {
        this.byState = byState;
    }

    /**
     * <p>
     * Returns only copy jobs that are in the specified state.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATED, RUNNING, COMPLETED, FAILED
     *
     * @param byState <p>
     *            Returns only copy jobs that are in the specified state.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CopyJobState
     */
    public ListCopyJobsRequest withByState(String byState) {
        this.byState = byState;
        return this;
    }

    /**
     * <p>
     * Returns only copy jobs that are in the specified state.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATED, RUNNING, COMPLETED, FAILED
     *
     * @param byState <p>
     *            Returns only copy jobs that are in the specified state.
     *            </p>
     * @see CopyJobState
     */
    public void setByState(CopyJobState byState) {
        this.byState = byState.toString();
    }

    /**
     * <p>
     * Returns only copy jobs that are in the specified state.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATED, RUNNING, COMPLETED, FAILED
     *
     * @param byState <p>
     *            Returns only copy jobs that are in the specified state.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CopyJobState
     */
    public ListCopyJobsRequest withByState(CopyJobState byState) {
        this.byState = byState.toString();
        return this;
    }

    /**
     * <p>
     * Returns only copy jobs that were created before the specified date.
     * </p>
     *
     * @return <p>
     *         Returns only copy jobs that were created before the specified
     *         date.
     *         </p>
     */
    public java.util.Date getByCreatedBefore() {
        return byCreatedBefore;
    }

    /**
     * <p>
     * Returns only copy jobs that were created before the specified date.
     * </p>
     *
     * @param byCreatedBefore <p>
     *            Returns only copy jobs that were created before the specified
     *            date.
     *            </p>
     */
    public void setByCreatedBefore(java.util.Date byCreatedBefore) {
        this.byCreatedBefore = byCreatedBefore;
    }

    /**
     * <p>
     * Returns only copy jobs that were created before the specified date.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param byCreatedBefore <p>
     *            Returns only copy jobs that were created before the specified
     *            date.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListCopyJobsRequest withByCreatedBefore(java.util.Date byCreatedBefore) {
        this.byCreatedBefore = byCreatedBefore;
        return this;
    }

    /**
     * <p>
     * Returns only copy jobs that were created after the specified date.
     * </p>
     *
     * @return <p>
     *         Returns only copy jobs that were created after the specified
     *         date.
     *         </p>
     */
    public java.util.Date getByCreatedAfter() {
        return byCreatedAfter;
    }

    /**
     * <p>
     * Returns only copy jobs that were created after the specified date.
     * </p>
     *
     * @param byCreatedAfter <p>
     *            Returns only copy jobs that were created after the specified
     *            date.
     *            </p>
     */
    public void setByCreatedAfter(java.util.Date byCreatedAfter) {
        this.byCreatedAfter = byCreatedAfter;
    }

    /**
     * <p>
     * Returns only copy jobs that were created after the specified date.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param byCreatedAfter <p>
     *            Returns only copy jobs that were created after the specified
     *            date.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListCopyJobsRequest withByCreatedAfter(java.util.Date byCreatedAfter) {
        this.byCreatedAfter = byCreatedAfter;
        return this;
    }

    /**
     * <p>
     * Returns only backup jobs for the specified resources:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>EBS</code> for Amazon Elastic Block Store
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EFS</code> for Amazon Elastic File System
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RDS</code> for Amazon Relational Database Service
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Storage Gateway</code> for AWS Storage Gateway
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9\-\_\.]{1,50}$<br/>
     *
     * @return <p>
     *         Returns only backup jobs for the specified resources:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>EBS</code> for Amazon Elastic Block Store
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>EFS</code> for Amazon Elastic File System
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>RDS</code> for Amazon Relational Database Service
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Storage Gateway</code> for AWS Storage Gateway
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getByResourceType() {
        return byResourceType;
    }

    /**
     * <p>
     * Returns only backup jobs for the specified resources:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>EBS</code> for Amazon Elastic Block Store
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EFS</code> for Amazon Elastic File System
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RDS</code> for Amazon Relational Database Service
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Storage Gateway</code> for AWS Storage Gateway
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9\-\_\.]{1,50}$<br/>
     *
     * @param byResourceType <p>
     *            Returns only backup jobs for the specified resources:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>EBS</code> for Amazon Elastic Block Store
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>EFS</code> for Amazon Elastic File System
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>RDS</code> for Amazon Relational Database Service
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Storage Gateway</code> for AWS Storage Gateway
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setByResourceType(String byResourceType) {
        this.byResourceType = byResourceType;
    }

    /**
     * <p>
     * Returns only backup jobs for the specified resources:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>EBS</code> for Amazon Elastic Block Store
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EFS</code> for Amazon Elastic File System
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RDS</code> for Amazon Relational Database Service
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Storage Gateway</code> for AWS Storage Gateway
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9\-\_\.]{1,50}$<br/>
     *
     * @param byResourceType <p>
     *            Returns only backup jobs for the specified resources:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>EBS</code> for Amazon Elastic Block Store
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>EFS</code> for Amazon Elastic File System
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>RDS</code> for Amazon Relational Database Service
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Storage Gateway</code> for AWS Storage Gateway
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListCopyJobsRequest withByResourceType(String byResourceType) {
        this.byResourceType = byResourceType;
        return this;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a source backup
     * vault to copy from; for example,
     * <code>arn:aws:backup:us-east-1:123456789012:vault:aBackupVault</code>.
     * </p>
     *
     * @return <p>
     *         An Amazon Resource Name (ARN) that uniquely identifies a source
     *         backup vault to copy from; for example,
     *         <code>arn:aws:backup:us-east-1:123456789012:vault:aBackupVault</code>
     *         .
     *         </p>
     */
    public String getByDestinationVaultArn() {
        return byDestinationVaultArn;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a source backup
     * vault to copy from; for example,
     * <code>arn:aws:backup:us-east-1:123456789012:vault:aBackupVault</code>.
     * </p>
     *
     * @param byDestinationVaultArn <p>
     *            An Amazon Resource Name (ARN) that uniquely identifies a
     *            source backup vault to copy from; for example,
     *            <code>arn:aws:backup:us-east-1:123456789012:vault:aBackupVault</code>
     *            .
     *            </p>
     */
    public void setByDestinationVaultArn(String byDestinationVaultArn) {
        this.byDestinationVaultArn = byDestinationVaultArn;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a source backup
     * vault to copy from; for example,
     * <code>arn:aws:backup:us-east-1:123456789012:vault:aBackupVault</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param byDestinationVaultArn <p>
     *            An Amazon Resource Name (ARN) that uniquely identifies a
     *            source backup vault to copy from; for example,
     *            <code>arn:aws:backup:us-east-1:123456789012:vault:aBackupVault</code>
     *            .
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListCopyJobsRequest withByDestinationVaultArn(String byDestinationVaultArn) {
        this.byDestinationVaultArn = byDestinationVaultArn;
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
        if (getByResourceArn() != null)
            sb.append("ByResourceArn: " + getByResourceArn() + ",");
        if (getByState() != null)
            sb.append("ByState: " + getByState() + ",");
        if (getByCreatedBefore() != null)
            sb.append("ByCreatedBefore: " + getByCreatedBefore() + ",");
        if (getByCreatedAfter() != null)
            sb.append("ByCreatedAfter: " + getByCreatedAfter() + ",");
        if (getByResourceType() != null)
            sb.append("ByResourceType: " + getByResourceType() + ",");
        if (getByDestinationVaultArn() != null)
            sb.append("ByDestinationVaultArn: " + getByDestinationVaultArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode
                + ((getByResourceArn() == null) ? 0 : getByResourceArn().hashCode());
        hashCode = prime * hashCode + ((getByState() == null) ? 0 : getByState().hashCode());
        hashCode = prime * hashCode
                + ((getByCreatedBefore() == null) ? 0 : getByCreatedBefore().hashCode());
        hashCode = prime * hashCode
                + ((getByCreatedAfter() == null) ? 0 : getByCreatedAfter().hashCode());
        hashCode = prime * hashCode
                + ((getByResourceType() == null) ? 0 : getByResourceType().hashCode());
        hashCode = prime
                * hashCode
                + ((getByDestinationVaultArn() == null) ? 0 : getByDestinationVaultArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListCopyJobsRequest == false)
            return false;
        ListCopyJobsRequest other = (ListCopyJobsRequest) obj;

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
        if (other.getByResourceArn() == null ^ this.getByResourceArn() == null)
            return false;
        if (other.getByResourceArn() != null
                && other.getByResourceArn().equals(this.getByResourceArn()) == false)
            return false;
        if (other.getByState() == null ^ this.getByState() == null)
            return false;
        if (other.getByState() != null && other.getByState().equals(this.getByState()) == false)
            return false;
        if (other.getByCreatedBefore() == null ^ this.getByCreatedBefore() == null)
            return false;
        if (other.getByCreatedBefore() != null
                && other.getByCreatedBefore().equals(this.getByCreatedBefore()) == false)
            return false;
        if (other.getByCreatedAfter() == null ^ this.getByCreatedAfter() == null)
            return false;
        if (other.getByCreatedAfter() != null
                && other.getByCreatedAfter().equals(this.getByCreatedAfter()) == false)
            return false;
        if (other.getByResourceType() == null ^ this.getByResourceType() == null)
            return false;
        if (other.getByResourceType() != null
                && other.getByResourceType().equals(this.getByResourceType()) == false)
            return false;
        if (other.getByDestinationVaultArn() == null ^ this.getByDestinationVaultArn() == null)
            return false;
        if (other.getByDestinationVaultArn() != null
                && other.getByDestinationVaultArn().equals(this.getByDestinationVaultArn()) == false)
            return false;
        return true;
    }
}
