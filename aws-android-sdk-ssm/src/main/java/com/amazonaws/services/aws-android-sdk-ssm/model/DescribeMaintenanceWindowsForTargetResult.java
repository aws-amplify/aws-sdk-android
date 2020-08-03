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


public class DescribeMaintenanceWindowsForTargetResult implements Serializable {
    /**
     * <p>Information about the maintenance window targets and tasks an instance is associated with.</p>
     */
    private java.util.List<MaintenanceWindowIdentityForTarget> windowIdentities;

    /**
     * <p>The token for the next set of items to return. (You use this token in the next call.)</p>
     */
    private String nextToken;

    /**
     * <p>Information about the maintenance window targets and tasks an instance is associated with.</p>
     *
     * @return <p>Information about the maintenance window targets and tasks an instance is associated with.</p>
     */
    public java.util.List<MaintenanceWindowIdentityForTarget> getWindowIdentities() {
        return windowIdentities;
    }

    /**
     * <p>Information about the maintenance window targets and tasks an instance is associated with.</p>
     *
     * @param windowIdentities <p>Information about the maintenance window targets and tasks an instance is associated with.</p>
     */
    public void setWindowIdentities(java.util.Collection<MaintenanceWindowIdentityForTarget> windowIdentities) {
        if (windowIdentities == null) {
            this.windowIdentities = null;
            return;
        }

        this.windowIdentities = new java.util.ArrayList<MaintenanceWindowIdentityForTarget>(windowIdentities);
    }

    /**
     * <p>Information about the maintenance window targets and tasks an instance is associated with.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param windowIdentities <p>Information about the maintenance window targets and tasks an instance is associated with.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribeMaintenanceWindowsForTargetResult withWindowIdentities(MaintenanceWindowIdentityForTarget... windowIdentities) {
        if (getWindowIdentities() == null) {
            this.windowIdentities = new java.util.ArrayList<MaintenanceWindowIdentityForTarget>(windowIdentities.length);
        }
        for (MaintenanceWindowIdentityForTarget value : windowIdentities) {
            this.windowIdentities.add(value);
        }
        return this;
    }

    /**
     * <p>Information about the maintenance window targets and tasks an instance is associated with.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param windowIdentities <p>Information about the maintenance window targets and tasks an instance is associated with.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribeMaintenanceWindowsForTargetResult withWindowIdentities(java.util.Collection<MaintenanceWindowIdentityForTarget> windowIdentities) {
        setWindowIdentities(windowIdentities);
        return this;
    }

    /**
     * <p>The token for the next set of items to return. (You use this token in the next call.)</p>
     *
     * @return <p>The token for the next set of items to return. (You use this token in the next call.)</p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>The token for the next set of items to return. (You use this token in the next call.)</p>
     *
     * @param nextToken <p>The token for the next set of items to return. (You use this token in the next call.)</p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>The token for the next set of items to return. (You use this token in the next call.)</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken <p>The token for the next set of items to return. (You use this token in the next call.)</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribeMaintenanceWindowsForTargetResult withNextToken(String nextToken) {
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
        if (getWindowIdentities() != null) sb.append("WindowIdentities: " + getWindowIdentities() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWindowIdentities() == null) ? 0 : getWindowIdentities().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeMaintenanceWindowsForTargetResult == false) return false;
        DescribeMaintenanceWindowsForTargetResult other = (DescribeMaintenanceWindowsForTargetResult)obj;

        if (other.getWindowIdentities() == null ^ this.getWindowIdentities() == null) return false;
        if (other.getWindowIdentities() != null && other.getWindowIdentities().equals(this.getWindowIdentities()) == false) return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false;
        return true;
    }
}
