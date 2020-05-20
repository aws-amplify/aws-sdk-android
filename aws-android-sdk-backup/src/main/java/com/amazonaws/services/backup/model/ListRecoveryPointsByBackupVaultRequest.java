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
 * Returns detailed information about the recovery points stored in a backup
 * vault.
 * </p>
 */
public class ListRecoveryPointsByBackupVaultRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of a logical container where backups are stored. Backup vaults
     * are identified by names that are unique to the account used to create
     * them and the AWS Region where they are created. They consist of lowercase
     * letters, numbers, and hyphens.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9\-\_\.]{1,50}$<br/>
     */
    private String backupVaultName;

    /**
     * <p>
     * The next item following a partial list of returned items. For example, if
     * a request is made to return <code>maxResults</code> number of items,
     * <code>NextToken</code> allows you to return more items in your list
     * starting at the location pointed to by the next token.
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
     * Returns only recovery points that match the specified resource Amazon
     * Resource Name (ARN).
     * </p>
     */
    private String byResourceArn;

    /**
     * <p>
     * Returns only recovery points that match the specified resource type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9\-\_\.]{1,50}$<br/>
     */
    private String byResourceType;

    /**
     * <p>
     * Returns only recovery points that match the specified backup plan ID.
     * </p>
     */
    private String byBackupPlanId;

    /**
     * <p>
     * Returns only recovery points that were created before the specified
     * timestamp.
     * </p>
     */
    private java.util.Date byCreatedBefore;

    /**
     * <p>
     * Returns only recovery points that were created after the specified
     * timestamp.
     * </p>
     */
    private java.util.Date byCreatedAfter;

    /**
     * <p>
     * The name of a logical container where backups are stored. Backup vaults
     * are identified by names that are unique to the account used to create
     * them and the AWS Region where they are created. They consist of lowercase
     * letters, numbers, and hyphens.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9\-\_\.]{1,50}$<br/>
     *
     * @return <p>
     *         The name of a logical container where backups are stored. Backup
     *         vaults are identified by names that are unique to the account
     *         used to create them and the AWS Region where they are created.
     *         They consist of lowercase letters, numbers, and hyphens.
     *         </p>
     */
    public String getBackupVaultName() {
        return backupVaultName;
    }

    /**
     * <p>
     * The name of a logical container where backups are stored. Backup vaults
     * are identified by names that are unique to the account used to create
     * them and the AWS Region where they are created. They consist of lowercase
     * letters, numbers, and hyphens.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9\-\_\.]{1,50}$<br/>
     *
     * @param backupVaultName <p>
     *            The name of a logical container where backups are stored.
     *            Backup vaults are identified by names that are unique to the
     *            account used to create them and the AWS Region where they are
     *            created. They consist of lowercase letters, numbers, and
     *            hyphens.
     *            </p>
     */
    public void setBackupVaultName(String backupVaultName) {
        this.backupVaultName = backupVaultName;
    }

    /**
     * <p>
     * The name of a logical container where backups are stored. Backup vaults
     * are identified by names that are unique to the account used to create
     * them and the AWS Region where they are created. They consist of lowercase
     * letters, numbers, and hyphens.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9\-\_\.]{1,50}$<br/>
     *
     * @param backupVaultName <p>
     *            The name of a logical container where backups are stored.
     *            Backup vaults are identified by names that are unique to the
     *            account used to create them and the AWS Region where they are
     *            created. They consist of lowercase letters, numbers, and
     *            hyphens.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListRecoveryPointsByBackupVaultRequest withBackupVaultName(String backupVaultName) {
        this.backupVaultName = backupVaultName;
        return this;
    }

    /**
     * <p>
     * The next item following a partial list of returned items. For example, if
     * a request is made to return <code>maxResults</code> number of items,
     * <code>NextToken</code> allows you to return more items in your list
     * starting at the location pointed to by the next token.
     * </p>
     *
     * @return <p>
     *         The next item following a partial list of returned items. For
     *         example, if a request is made to return <code>maxResults</code>
     *         number of items, <code>NextToken</code> allows you to return more
     *         items in your list starting at the location pointed to by the
     *         next token.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The next item following a partial list of returned items. For example, if
     * a request is made to return <code>maxResults</code> number of items,
     * <code>NextToken</code> allows you to return more items in your list
     * starting at the location pointed to by the next token.
     * </p>
     *
     * @param nextToken <p>
     *            The next item following a partial list of returned items. For
     *            example, if a request is made to return
     *            <code>maxResults</code> number of items,
     *            <code>NextToken</code> allows you to return more items in your
     *            list starting at the location pointed to by the next token.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The next item following a partial list of returned items. For example, if
     * a request is made to return <code>maxResults</code> number of items,
     * <code>NextToken</code> allows you to return more items in your list
     * starting at the location pointed to by the next token.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The next item following a partial list of returned items. For
     *            example, if a request is made to return
     *            <code>maxResults</code> number of items,
     *            <code>NextToken</code> allows you to return more items in your
     *            list starting at the location pointed to by the next token.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListRecoveryPointsByBackupVaultRequest withNextToken(String nextToken) {
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
    public ListRecoveryPointsByBackupVaultRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * Returns only recovery points that match the specified resource Amazon
     * Resource Name (ARN).
     * </p>
     *
     * @return <p>
     *         Returns only recovery points that match the specified resource
     *         Amazon Resource Name (ARN).
     *         </p>
     */
    public String getByResourceArn() {
        return byResourceArn;
    }

    /**
     * <p>
     * Returns only recovery points that match the specified resource Amazon
     * Resource Name (ARN).
     * </p>
     *
     * @param byResourceArn <p>
     *            Returns only recovery points that match the specified resource
     *            Amazon Resource Name (ARN).
     *            </p>
     */
    public void setByResourceArn(String byResourceArn) {
        this.byResourceArn = byResourceArn;
    }

    /**
     * <p>
     * Returns only recovery points that match the specified resource Amazon
     * Resource Name (ARN).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param byResourceArn <p>
     *            Returns only recovery points that match the specified resource
     *            Amazon Resource Name (ARN).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListRecoveryPointsByBackupVaultRequest withByResourceArn(String byResourceArn) {
        this.byResourceArn = byResourceArn;
        return this;
    }

    /**
     * <p>
     * Returns only recovery points that match the specified resource type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9\-\_\.]{1,50}$<br/>
     *
     * @return <p>
     *         Returns only recovery points that match the specified resource
     *         type.
     *         </p>
     */
    public String getByResourceType() {
        return byResourceType;
    }

    /**
     * <p>
     * Returns only recovery points that match the specified resource type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9\-\_\.]{1,50}$<br/>
     *
     * @param byResourceType <p>
     *            Returns only recovery points that match the specified resource
     *            type.
     *            </p>
     */
    public void setByResourceType(String byResourceType) {
        this.byResourceType = byResourceType;
    }

    /**
     * <p>
     * Returns only recovery points that match the specified resource type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9\-\_\.]{1,50}$<br/>
     *
     * @param byResourceType <p>
     *            Returns only recovery points that match the specified resource
     *            type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListRecoveryPointsByBackupVaultRequest withByResourceType(String byResourceType) {
        this.byResourceType = byResourceType;
        return this;
    }

    /**
     * <p>
     * Returns only recovery points that match the specified backup plan ID.
     * </p>
     *
     * @return <p>
     *         Returns only recovery points that match the specified backup plan
     *         ID.
     *         </p>
     */
    public String getByBackupPlanId() {
        return byBackupPlanId;
    }

    /**
     * <p>
     * Returns only recovery points that match the specified backup plan ID.
     * </p>
     *
     * @param byBackupPlanId <p>
     *            Returns only recovery points that match the specified backup
     *            plan ID.
     *            </p>
     */
    public void setByBackupPlanId(String byBackupPlanId) {
        this.byBackupPlanId = byBackupPlanId;
    }

    /**
     * <p>
     * Returns only recovery points that match the specified backup plan ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param byBackupPlanId <p>
     *            Returns only recovery points that match the specified backup
     *            plan ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListRecoveryPointsByBackupVaultRequest withByBackupPlanId(String byBackupPlanId) {
        this.byBackupPlanId = byBackupPlanId;
        return this;
    }

    /**
     * <p>
     * Returns only recovery points that were created before the specified
     * timestamp.
     * </p>
     *
     * @return <p>
     *         Returns only recovery points that were created before the
     *         specified timestamp.
     *         </p>
     */
    public java.util.Date getByCreatedBefore() {
        return byCreatedBefore;
    }

    /**
     * <p>
     * Returns only recovery points that were created before the specified
     * timestamp.
     * </p>
     *
     * @param byCreatedBefore <p>
     *            Returns only recovery points that were created before the
     *            specified timestamp.
     *            </p>
     */
    public void setByCreatedBefore(java.util.Date byCreatedBefore) {
        this.byCreatedBefore = byCreatedBefore;
    }

    /**
     * <p>
     * Returns only recovery points that were created before the specified
     * timestamp.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param byCreatedBefore <p>
     *            Returns only recovery points that were created before the
     *            specified timestamp.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListRecoveryPointsByBackupVaultRequest withByCreatedBefore(java.util.Date byCreatedBefore) {
        this.byCreatedBefore = byCreatedBefore;
        return this;
    }

    /**
     * <p>
     * Returns only recovery points that were created after the specified
     * timestamp.
     * </p>
     *
     * @return <p>
     *         Returns only recovery points that were created after the
     *         specified timestamp.
     *         </p>
     */
    public java.util.Date getByCreatedAfter() {
        return byCreatedAfter;
    }

    /**
     * <p>
     * Returns only recovery points that were created after the specified
     * timestamp.
     * </p>
     *
     * @param byCreatedAfter <p>
     *            Returns only recovery points that were created after the
     *            specified timestamp.
     *            </p>
     */
    public void setByCreatedAfter(java.util.Date byCreatedAfter) {
        this.byCreatedAfter = byCreatedAfter;
    }

    /**
     * <p>
     * Returns only recovery points that were created after the specified
     * timestamp.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param byCreatedAfter <p>
     *            Returns only recovery points that were created after the
     *            specified timestamp.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListRecoveryPointsByBackupVaultRequest withByCreatedAfter(java.util.Date byCreatedAfter) {
        this.byCreatedAfter = byCreatedAfter;
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
        if (getBackupVaultName() != null)
            sb.append("BackupVaultName: " + getBackupVaultName() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults() + ",");
        if (getByResourceArn() != null)
            sb.append("ByResourceArn: " + getByResourceArn() + ",");
        if (getByResourceType() != null)
            sb.append("ByResourceType: " + getByResourceType() + ",");
        if (getByBackupPlanId() != null)
            sb.append("ByBackupPlanId: " + getByBackupPlanId() + ",");
        if (getByCreatedBefore() != null)
            sb.append("ByCreatedBefore: " + getByCreatedBefore() + ",");
        if (getByCreatedAfter() != null)
            sb.append("ByCreatedAfter: " + getByCreatedAfter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getBackupVaultName() == null) ? 0 : getBackupVaultName().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode
                + ((getByResourceArn() == null) ? 0 : getByResourceArn().hashCode());
        hashCode = prime * hashCode
                + ((getByResourceType() == null) ? 0 : getByResourceType().hashCode());
        hashCode = prime * hashCode
                + ((getByBackupPlanId() == null) ? 0 : getByBackupPlanId().hashCode());
        hashCode = prime * hashCode
                + ((getByCreatedBefore() == null) ? 0 : getByCreatedBefore().hashCode());
        hashCode = prime * hashCode
                + ((getByCreatedAfter() == null) ? 0 : getByCreatedAfter().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListRecoveryPointsByBackupVaultRequest == false)
            return false;
        ListRecoveryPointsByBackupVaultRequest other = (ListRecoveryPointsByBackupVaultRequest) obj;

        if (other.getBackupVaultName() == null ^ this.getBackupVaultName() == null)
            return false;
        if (other.getBackupVaultName() != null
                && other.getBackupVaultName().equals(this.getBackupVaultName()) == false)
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
        if (other.getByResourceArn() == null ^ this.getByResourceArn() == null)
            return false;
        if (other.getByResourceArn() != null
                && other.getByResourceArn().equals(this.getByResourceArn()) == false)
            return false;
        if (other.getByResourceType() == null ^ this.getByResourceType() == null)
            return false;
        if (other.getByResourceType() != null
                && other.getByResourceType().equals(this.getByResourceType()) == false)
            return false;
        if (other.getByBackupPlanId() == null ^ this.getByBackupPlanId() == null)
            return false;
        if (other.getByBackupPlanId() != null
                && other.getByBackupPlanId().equals(this.getByBackupPlanId()) == false)
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
        return true;
    }
}
