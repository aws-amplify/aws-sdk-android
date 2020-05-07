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

public class DescribeImportSnapshotTasksResult implements Serializable {
    /**
     * <p>
     * A list of zero or more import snapshot tasks that are currently active or
     * were completed or canceled in the previous 7 days.
     * </p>
     */
    private java.util.List<ImportSnapshotTask> importSnapshotTasks;

    /**
     * <p>
     * The token to use to get the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of zero or more import snapshot tasks that are currently active or
     * were completed or canceled in the previous 7 days.
     * </p>
     *
     * @return <p>
     *         A list of zero or more import snapshot tasks that are currently
     *         active or were completed or canceled in the previous 7 days.
     *         </p>
     */
    public java.util.List<ImportSnapshotTask> getImportSnapshotTasks() {
        return importSnapshotTasks;
    }

    /**
     * <p>
     * A list of zero or more import snapshot tasks that are currently active or
     * were completed or canceled in the previous 7 days.
     * </p>
     *
     * @param importSnapshotTasks <p>
     *            A list of zero or more import snapshot tasks that are
     *            currently active or were completed or canceled in the previous
     *            7 days.
     *            </p>
     */
    public void setImportSnapshotTasks(java.util.Collection<ImportSnapshotTask> importSnapshotTasks) {
        if (importSnapshotTasks == null) {
            this.importSnapshotTasks = null;
            return;
        }

        this.importSnapshotTasks = new java.util.ArrayList<ImportSnapshotTask>(importSnapshotTasks);
    }

    /**
     * <p>
     * A list of zero or more import snapshot tasks that are currently active or
     * were completed or canceled in the previous 7 days.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param importSnapshotTasks <p>
     *            A list of zero or more import snapshot tasks that are
     *            currently active or were completed or canceled in the previous
     *            7 days.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeImportSnapshotTasksResult withImportSnapshotTasks(
            ImportSnapshotTask... importSnapshotTasks) {
        if (getImportSnapshotTasks() == null) {
            this.importSnapshotTasks = new java.util.ArrayList<ImportSnapshotTask>(
                    importSnapshotTasks.length);
        }
        for (ImportSnapshotTask value : importSnapshotTasks) {
            this.importSnapshotTasks.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of zero or more import snapshot tasks that are currently active or
     * were completed or canceled in the previous 7 days.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param importSnapshotTasks <p>
     *            A list of zero or more import snapshot tasks that are
     *            currently active or were completed or canceled in the previous
     *            7 days.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeImportSnapshotTasksResult withImportSnapshotTasks(
            java.util.Collection<ImportSnapshotTask> importSnapshotTasks) {
        setImportSnapshotTasks(importSnapshotTasks);
        return this;
    }

    /**
     * <p>
     * The token to use to get the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     *
     * @return <p>
     *         The token to use to get the next page of results. This value is
     *         <code>null</code> when there are no more results to return.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token to use to get the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     *
     * @param nextToken <p>
     *            The token to use to get the next page of results. This value
     *            is <code>null</code> when there are no more results to return.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to get the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The token to use to get the next page of results. This value
     *            is <code>null</code> when there are no more results to return.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeImportSnapshotTasksResult withNextToken(String nextToken) {
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
        if (getImportSnapshotTasks() != null)
            sb.append("ImportSnapshotTasks: " + getImportSnapshotTasks() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getImportSnapshotTasks() == null) ? 0 : getImportSnapshotTasks().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeImportSnapshotTasksResult == false)
            return false;
        DescribeImportSnapshotTasksResult other = (DescribeImportSnapshotTasksResult) obj;

        if (other.getImportSnapshotTasks() == null ^ this.getImportSnapshotTasks() == null)
            return false;
        if (other.getImportSnapshotTasks() != null
                && other.getImportSnapshotTasks().equals(this.getImportSnapshotTasks()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
