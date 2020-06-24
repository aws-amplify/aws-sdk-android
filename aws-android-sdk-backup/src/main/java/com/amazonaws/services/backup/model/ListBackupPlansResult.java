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

public class ListBackupPlansResult implements Serializable {
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
     * An array of backup plan list items containing metadata about your saved
     * backup plans.
     * </p>
     */
    private java.util.List<BackupPlansListMember> backupPlansList;

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
    public ListBackupPlansResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * An array of backup plan list items containing metadata about your saved
     * backup plans.
     * </p>
     *
     * @return <p>
     *         An array of backup plan list items containing metadata about your
     *         saved backup plans.
     *         </p>
     */
    public java.util.List<BackupPlansListMember> getBackupPlansList() {
        return backupPlansList;
    }

    /**
     * <p>
     * An array of backup plan list items containing metadata about your saved
     * backup plans.
     * </p>
     *
     * @param backupPlansList <p>
     *            An array of backup plan list items containing metadata about
     *            your saved backup plans.
     *            </p>
     */
    public void setBackupPlansList(java.util.Collection<BackupPlansListMember> backupPlansList) {
        if (backupPlansList == null) {
            this.backupPlansList = null;
            return;
        }

        this.backupPlansList = new java.util.ArrayList<BackupPlansListMember>(backupPlansList);
    }

    /**
     * <p>
     * An array of backup plan list items containing metadata about your saved
     * backup plans.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param backupPlansList <p>
     *            An array of backup plan list items containing metadata about
     *            your saved backup plans.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListBackupPlansResult withBackupPlansList(BackupPlansListMember... backupPlansList) {
        if (getBackupPlansList() == null) {
            this.backupPlansList = new java.util.ArrayList<BackupPlansListMember>(
                    backupPlansList.length);
        }
        for (BackupPlansListMember value : backupPlansList) {
            this.backupPlansList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of backup plan list items containing metadata about your saved
     * backup plans.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param backupPlansList <p>
     *            An array of backup plan list items containing metadata about
     *            your saved backup plans.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListBackupPlansResult withBackupPlansList(
            java.util.Collection<BackupPlansListMember> backupPlansList) {
        setBackupPlansList(backupPlansList);
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
        if (getBackupPlansList() != null)
            sb.append("BackupPlansList: " + getBackupPlansList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode
                + ((getBackupPlansList() == null) ? 0 : getBackupPlansList().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListBackupPlansResult == false)
            return false;
        ListBackupPlansResult other = (ListBackupPlansResult) obj;

        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getBackupPlansList() == null ^ this.getBackupPlansList() == null)
            return false;
        if (other.getBackupPlansList() != null
                && other.getBackupPlansList().equals(this.getBackupPlansList()) == false)
            return false;
        return true;
    }
}
