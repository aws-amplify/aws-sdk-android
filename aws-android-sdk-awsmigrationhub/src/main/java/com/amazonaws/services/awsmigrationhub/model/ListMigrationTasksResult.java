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

package com.amazonaws.services.awsmigrationhub.model;

import java.io.Serializable;

public class ListMigrationTasksResult implements Serializable {
    /**
     * <p>
     * If there are more migration tasks than the max result, return the next
     * token to be passed to the next call as a bookmark of where to start from.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9\/\+\=]{0,2048}$<br/>
     */
    private String nextToken;

    /**
     * <p>
     * Lists the migration task's summary which includes:
     * <code>MigrationTaskName</code>, <code>ProgressPercent</code>,
     * <code>ProgressUpdateStream</code>, <code>Status</code>, and the
     * <code>UpdateDateTime</code> for each task.
     * </p>
     */
    private java.util.List<MigrationTaskSummary> migrationTaskSummaryList;

    /**
     * <p>
     * If there are more migration tasks than the max result, return the next
     * token to be passed to the next call as a bookmark of where to start from.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9\/\+\=]{0,2048}$<br/>
     *
     * @return <p>
     *         If there are more migration tasks than the max result, return the
     *         next token to be passed to the next call as a bookmark of where
     *         to start from.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If there are more migration tasks than the max result, return the next
     * token to be passed to the next call as a bookmark of where to start from.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9\/\+\=]{0,2048}$<br/>
     *
     * @param nextToken <p>
     *            If there are more migration tasks than the max result, return
     *            the next token to be passed to the next call as a bookmark of
     *            where to start from.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If there are more migration tasks than the max result, return the next
     * token to be passed to the next call as a bookmark of where to start from.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9\/\+\=]{0,2048}$<br/>
     *
     * @param nextToken <p>
     *            If there are more migration tasks than the max result, return
     *            the next token to be passed to the next call as a bookmark of
     *            where to start from.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListMigrationTasksResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * Lists the migration task's summary which includes:
     * <code>MigrationTaskName</code>, <code>ProgressPercent</code>,
     * <code>ProgressUpdateStream</code>, <code>Status</code>, and the
     * <code>UpdateDateTime</code> for each task.
     * </p>
     *
     * @return <p>
     *         Lists the migration task's summary which includes:
     *         <code>MigrationTaskName</code>, <code>ProgressPercent</code>,
     *         <code>ProgressUpdateStream</code>, <code>Status</code>, and the
     *         <code>UpdateDateTime</code> for each task.
     *         </p>
     */
    public java.util.List<MigrationTaskSummary> getMigrationTaskSummaryList() {
        return migrationTaskSummaryList;
    }

    /**
     * <p>
     * Lists the migration task's summary which includes:
     * <code>MigrationTaskName</code>, <code>ProgressPercent</code>,
     * <code>ProgressUpdateStream</code>, <code>Status</code>, and the
     * <code>UpdateDateTime</code> for each task.
     * </p>
     *
     * @param migrationTaskSummaryList <p>
     *            Lists the migration task's summary which includes:
     *            <code>MigrationTaskName</code>, <code>ProgressPercent</code>,
     *            <code>ProgressUpdateStream</code>, <code>Status</code>, and
     *            the <code>UpdateDateTime</code> for each task.
     *            </p>
     */
    public void setMigrationTaskSummaryList(
            java.util.Collection<MigrationTaskSummary> migrationTaskSummaryList) {
        if (migrationTaskSummaryList == null) {
            this.migrationTaskSummaryList = null;
            return;
        }

        this.migrationTaskSummaryList = new java.util.ArrayList<MigrationTaskSummary>(
                migrationTaskSummaryList);
    }

    /**
     * <p>
     * Lists the migration task's summary which includes:
     * <code>MigrationTaskName</code>, <code>ProgressPercent</code>,
     * <code>ProgressUpdateStream</code>, <code>Status</code>, and the
     * <code>UpdateDateTime</code> for each task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param migrationTaskSummaryList <p>
     *            Lists the migration task's summary which includes:
     *            <code>MigrationTaskName</code>, <code>ProgressPercent</code>,
     *            <code>ProgressUpdateStream</code>, <code>Status</code>, and
     *            the <code>UpdateDateTime</code> for each task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListMigrationTasksResult withMigrationTaskSummaryList(
            MigrationTaskSummary... migrationTaskSummaryList) {
        if (getMigrationTaskSummaryList() == null) {
            this.migrationTaskSummaryList = new java.util.ArrayList<MigrationTaskSummary>(
                    migrationTaskSummaryList.length);
        }
        for (MigrationTaskSummary value : migrationTaskSummaryList) {
            this.migrationTaskSummaryList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Lists the migration task's summary which includes:
     * <code>MigrationTaskName</code>, <code>ProgressPercent</code>,
     * <code>ProgressUpdateStream</code>, <code>Status</code>, and the
     * <code>UpdateDateTime</code> for each task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param migrationTaskSummaryList <p>
     *            Lists the migration task's summary which includes:
     *            <code>MigrationTaskName</code>, <code>ProgressPercent</code>,
     *            <code>ProgressUpdateStream</code>, <code>Status</code>, and
     *            the <code>UpdateDateTime</code> for each task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListMigrationTasksResult withMigrationTaskSummaryList(
            java.util.Collection<MigrationTaskSummary> migrationTaskSummaryList) {
        setMigrationTaskSummaryList(migrationTaskSummaryList);
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
        if (getMigrationTaskSummaryList() != null)
            sb.append("MigrationTaskSummaryList: " + getMigrationTaskSummaryList());
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
                + ((getMigrationTaskSummaryList() == null) ? 0 : getMigrationTaskSummaryList()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListMigrationTasksResult == false)
            return false;
        ListMigrationTasksResult other = (ListMigrationTasksResult) obj;

        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMigrationTaskSummaryList() == null
                ^ this.getMigrationTaskSummaryList() == null)
            return false;
        if (other.getMigrationTaskSummaryList() != null
                && other.getMigrationTaskSummaryList().equals(this.getMigrationTaskSummaryList()) == false)
            return false;
        return true;
    }
}
