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

public class ListBackupPlanVersionsResult implements Serializable {
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
     * An array of version list items containing metadata about your backup
     * plans.
     * </p>
     */
    private java.util.List<BackupPlansListMember> backupPlanVersionsList;

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
    public ListBackupPlanVersionsResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * An array of version list items containing metadata about your backup
     * plans.
     * </p>
     *
     * @return <p>
     *         An array of version list items containing metadata about your
     *         backup plans.
     *         </p>
     */
    public java.util.List<BackupPlansListMember> getBackupPlanVersionsList() {
        return backupPlanVersionsList;
    }

    /**
     * <p>
     * An array of version list items containing metadata about your backup
     * plans.
     * </p>
     *
     * @param backupPlanVersionsList <p>
     *            An array of version list items containing metadata about your
     *            backup plans.
     *            </p>
     */
    public void setBackupPlanVersionsList(
            java.util.Collection<BackupPlansListMember> backupPlanVersionsList) {
        if (backupPlanVersionsList == null) {
            this.backupPlanVersionsList = null;
            return;
        }

        this.backupPlanVersionsList = new java.util.ArrayList<BackupPlansListMember>(
                backupPlanVersionsList);
    }

    /**
     * <p>
     * An array of version list items containing metadata about your backup
     * plans.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param backupPlanVersionsList <p>
     *            An array of version list items containing metadata about your
     *            backup plans.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListBackupPlanVersionsResult withBackupPlanVersionsList(
            BackupPlansListMember... backupPlanVersionsList) {
        if (getBackupPlanVersionsList() == null) {
            this.backupPlanVersionsList = new java.util.ArrayList<BackupPlansListMember>(
                    backupPlanVersionsList.length);
        }
        for (BackupPlansListMember value : backupPlanVersionsList) {
            this.backupPlanVersionsList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of version list items containing metadata about your backup
     * plans.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param backupPlanVersionsList <p>
     *            An array of version list items containing metadata about your
     *            backup plans.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListBackupPlanVersionsResult withBackupPlanVersionsList(
            java.util.Collection<BackupPlansListMember> backupPlanVersionsList) {
        setBackupPlanVersionsList(backupPlanVersionsList);
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
        if (getBackupPlanVersionsList() != null)
            sb.append("BackupPlanVersionsList: " + getBackupPlanVersionsList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime
                * hashCode
                + ((getBackupPlanVersionsList() == null) ? 0 : getBackupPlanVersionsList()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListBackupPlanVersionsResult == false)
            return false;
        ListBackupPlanVersionsResult other = (ListBackupPlanVersionsResult) obj;

        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getBackupPlanVersionsList() == null ^ this.getBackupPlanVersionsList() == null)
            return false;
        if (other.getBackupPlanVersionsList() != null
                && other.getBackupPlanVersionsList().equals(this.getBackupPlanVersionsList()) == false)
            return false;
        return true;
    }
}
