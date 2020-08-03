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
package com.amazonaws.services.aws-android-sdk-ssm.model;

import java.io.Serializable;


public class DescribeMaintenanceWindowExecutionTasksResult implements Serializable {
    /**
     * <p>Information about the task executions.</p>
     */
    private java.util.List<MaintenanceWindowExecutionTaskIdentity> windowExecutionTaskIdentities;

    /**
     * <p>The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.</p>
     */
    private String nextToken;

    /**
     * <p>Information about the task executions.</p>
     *
     * @return <p>Information about the task executions.</p>
     */
    public java.util.List<MaintenanceWindowExecutionTaskIdentity> getWindowExecutionTaskIdentities() {
        return windowExecutionTaskIdentities;
    }

    /**
     * <p>Information about the task executions.</p>
     *
     * @param windowExecutionTaskIdentities <p>Information about the task executions.</p>
     */
    public void setWindowExecutionTaskIdentities(java.util.Collection<MaintenanceWindowExecutionTaskIdentity> windowExecutionTaskIdentities) {
        if (windowExecutionTaskIdentities == null) {
            this.windowExecutionTaskIdentities = null;
            return;
        }

        this.windowExecutionTaskIdentities = new java.util.ArrayList<MaintenanceWindowExecutionTaskIdentity>(windowExecutionTaskIdentities);
    }

    /**
     * <p>Information about the task executions.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param windowExecutionTaskIdentities <p>Information about the task executions.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribeMaintenanceWindowExecutionTasksResult withWindowExecutionTaskIdentities(MaintenanceWindowExecutionTaskIdentity... windowExecutionTaskIdentities) {
        if (getWindowExecutionTaskIdentities() == null) {
            this.windowExecutionTaskIdentities = new java.util.ArrayList<MaintenanceWindowExecutionTaskIdentity>(windowExecutionTaskIdentities.length);
        }
        for (MaintenanceWindowExecutionTaskIdentity value : windowExecutionTaskIdentities) {
            this.windowExecutionTaskIdentities.add(value);
        }
        return this;
    }

    /**
     * <p>Information about the task executions.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param windowExecutionTaskIdentities <p>Information about the task executions.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribeMaintenanceWindowExecutionTasksResult withWindowExecutionTaskIdentities(java.util.Collection<MaintenanceWindowExecutionTaskIdentity> windowExecutionTaskIdentities) {
        setWindowExecutionTaskIdentities(windowExecutionTaskIdentities);
        return this;
    }

    /**
     * <p>The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.</p>
     *
     * @return <p>The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.</p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.</p>
     *
     * @param nextToken <p>The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.</p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken <p>The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribeMaintenanceWindowExecutionTasksResult withNextToken(String nextToken) {
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
        if (getWindowExecutionTaskIdentities() != null) sb.append("WindowExecutionTaskIdentities: " + getWindowExecutionTaskIdentities() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWindowExecutionTaskIdentities() == null) ? 0 : getWindowExecutionTaskIdentities().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeMaintenanceWindowExecutionTasksResult == false) return false;
        DescribeMaintenanceWindowExecutionTasksResult other = (DescribeMaintenanceWindowExecutionTasksResult)obj;

        if (other.getWindowExecutionTaskIdentities() == null ^ this.getWindowExecutionTaskIdentities() == null) return false;
        if (other.getWindowExecutionTaskIdentities() != null && other.getWindowExecutionTaskIdentities().equals(this.getWindowExecutionTaskIdentities()) == false) return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false;
        return true;
    }
}
