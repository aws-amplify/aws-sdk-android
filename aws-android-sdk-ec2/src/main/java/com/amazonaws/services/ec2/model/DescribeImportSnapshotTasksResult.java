/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Contains the output for DescribeImportSnapshotTasks.
 * </p>
 */
public class DescribeImportSnapshotTasksResult implements Serializable {

    /**
     * A list of zero or more import snapshot tasks that are currently active
     * or were completed or canceled in the previous 7 days.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<ImportSnapshotTask> importSnapshotTasks;

    /**
     * The token to use to get the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     */
    private String nextToken;

    /**
     * A list of zero or more import snapshot tasks that are currently active
     * or were completed or canceled in the previous 7 days.
     *
     * @return A list of zero or more import snapshot tasks that are currently active
     *         or were completed or canceled in the previous 7 days.
     */
    public java.util.List<ImportSnapshotTask> getImportSnapshotTasks() {
        if (importSnapshotTasks == null) {
              importSnapshotTasks = new com.amazonaws.internal.ListWithAutoConstructFlag<ImportSnapshotTask>();
              importSnapshotTasks.setAutoConstruct(true);
        }
        return importSnapshotTasks;
    }
    
    /**
     * A list of zero or more import snapshot tasks that are currently active
     * or were completed or canceled in the previous 7 days.
     *
     * @param importSnapshotTasks A list of zero or more import snapshot tasks that are currently active
     *         or were completed or canceled in the previous 7 days.
     */
    public void setImportSnapshotTasks(java.util.Collection<ImportSnapshotTask> importSnapshotTasks) {
        if (importSnapshotTasks == null) {
            this.importSnapshotTasks = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<ImportSnapshotTask> importSnapshotTasksCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ImportSnapshotTask>(importSnapshotTasks.size());
        importSnapshotTasksCopy.addAll(importSnapshotTasks);
        this.importSnapshotTasks = importSnapshotTasksCopy;
    }
    
    /**
     * A list of zero or more import snapshot tasks that are currently active
     * or were completed or canceled in the previous 7 days.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param importSnapshotTasks A list of zero or more import snapshot tasks that are currently active
     *         or were completed or canceled in the previous 7 days.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeImportSnapshotTasksResult withImportSnapshotTasks(ImportSnapshotTask... importSnapshotTasks) {
        if (getImportSnapshotTasks() == null) setImportSnapshotTasks(new java.util.ArrayList<ImportSnapshotTask>(importSnapshotTasks.length));
        for (ImportSnapshotTask value : importSnapshotTasks) {
            getImportSnapshotTasks().add(value);
        }
        return this;
    }
    
    /**
     * A list of zero or more import snapshot tasks that are currently active
     * or were completed or canceled in the previous 7 days.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param importSnapshotTasks A list of zero or more import snapshot tasks that are currently active
     *         or were completed or canceled in the previous 7 days.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeImportSnapshotTasksResult withImportSnapshotTasks(java.util.Collection<ImportSnapshotTask> importSnapshotTasks) {
        if (importSnapshotTasks == null) {
            this.importSnapshotTasks = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<ImportSnapshotTask> importSnapshotTasksCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ImportSnapshotTask>(importSnapshotTasks.size());
            importSnapshotTasksCopy.addAll(importSnapshotTasks);
            this.importSnapshotTasks = importSnapshotTasksCopy;
        }

        return this;
    }

    /**
     * The token to use to get the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     *
     * @return The token to use to get the next page of results. This value is
     *         <code>null</code> when there are no more results to return.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * The token to use to get the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     *
     * @param nextToken The token to use to get the next page of results. This value is
     *         <code>null</code> when there are no more results to return.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * The token to use to get the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken The token to use to get the next page of results. This value is
     *         <code>null</code> when there are no more results to return.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
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
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getImportSnapshotTasks() != null) sb.append("ImportSnapshotTasks: " + getImportSnapshotTasks() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getImportSnapshotTasks() == null) ? 0 : getImportSnapshotTasks().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeImportSnapshotTasksResult == false) return false;
        DescribeImportSnapshotTasksResult other = (DescribeImportSnapshotTasksResult)obj;
        
        if (other.getImportSnapshotTasks() == null ^ this.getImportSnapshotTasks() == null) return false;
        if (other.getImportSnapshotTasks() != null && other.getImportSnapshotTasks().equals(this.getImportSnapshotTasks()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        return true;
    }
    
}
    