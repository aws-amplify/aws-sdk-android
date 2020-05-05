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

package com.amazonaws.services.ssm.model;

import java.io.Serializable;

public class DescribeMaintenanceWindowExecutionTaskInvocationsResult implements Serializable {
    /**
     * <p>
     * Information about the task invocation results per invocation.
     * </p>
     */
    private java.util.List<MaintenanceWindowExecutionTaskInvocationIdentity> windowExecutionTaskInvocationIdentities;

    /**
     * <p>
     * The token to use when requesting the next set of items. If there are no
     * additional items to return, the string is empty.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about the task invocation results per invocation.
     * </p>
     *
     * @return <p>
     *         Information about the task invocation results per invocation.
     *         </p>
     */
    public java.util.List<MaintenanceWindowExecutionTaskInvocationIdentity> getWindowExecutionTaskInvocationIdentities() {
        return windowExecutionTaskInvocationIdentities;
    }

    /**
     * <p>
     * Information about the task invocation results per invocation.
     * </p>
     *
     * @param windowExecutionTaskInvocationIdentities <p>
     *            Information about the task invocation results per invocation.
     *            </p>
     */
    public void setWindowExecutionTaskInvocationIdentities(
            java.util.Collection<MaintenanceWindowExecutionTaskInvocationIdentity> windowExecutionTaskInvocationIdentities) {
        if (windowExecutionTaskInvocationIdentities == null) {
            this.windowExecutionTaskInvocationIdentities = null;
            return;
        }

        this.windowExecutionTaskInvocationIdentities = new java.util.ArrayList<MaintenanceWindowExecutionTaskInvocationIdentity>(
                windowExecutionTaskInvocationIdentities);
    }

    /**
     * <p>
     * Information about the task invocation results per invocation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param windowExecutionTaskInvocationIdentities <p>
     *            Information about the task invocation results per invocation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeMaintenanceWindowExecutionTaskInvocationsResult withWindowExecutionTaskInvocationIdentities(
            MaintenanceWindowExecutionTaskInvocationIdentity... windowExecutionTaskInvocationIdentities) {
        if (getWindowExecutionTaskInvocationIdentities() == null) {
            this.windowExecutionTaskInvocationIdentities = new java.util.ArrayList<MaintenanceWindowExecutionTaskInvocationIdentity>(
                    windowExecutionTaskInvocationIdentities.length);
        }
        for (MaintenanceWindowExecutionTaskInvocationIdentity value : windowExecutionTaskInvocationIdentities) {
            this.windowExecutionTaskInvocationIdentities.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the task invocation results per invocation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param windowExecutionTaskInvocationIdentities <p>
     *            Information about the task invocation results per invocation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeMaintenanceWindowExecutionTaskInvocationsResult withWindowExecutionTaskInvocationIdentities(
            java.util.Collection<MaintenanceWindowExecutionTaskInvocationIdentity> windowExecutionTaskInvocationIdentities) {
        setWindowExecutionTaskInvocationIdentities(windowExecutionTaskInvocationIdentities);
        return this;
    }

    /**
     * <p>
     * The token to use when requesting the next set of items. If there are no
     * additional items to return, the string is empty.
     * </p>
     *
     * @return <p>
     *         The token to use when requesting the next set of items. If there
     *         are no additional items to return, the string is empty.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token to use when requesting the next set of items. If there are no
     * additional items to return, the string is empty.
     * </p>
     *
     * @param nextToken <p>
     *            The token to use when requesting the next set of items. If
     *            there are no additional items to return, the string is empty.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use when requesting the next set of items. If there are no
     * additional items to return, the string is empty.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The token to use when requesting the next set of items. If
     *            there are no additional items to return, the string is empty.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeMaintenanceWindowExecutionTaskInvocationsResult withNextToken(String nextToken) {
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
        if (getWindowExecutionTaskInvocationIdentities() != null)
            sb.append("WindowExecutionTaskInvocationIdentities: "
                    + getWindowExecutionTaskInvocationIdentities() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getWindowExecutionTaskInvocationIdentities() == null) ? 0
                        : getWindowExecutionTaskInvocationIdentities().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeMaintenanceWindowExecutionTaskInvocationsResult == false)
            return false;
        DescribeMaintenanceWindowExecutionTaskInvocationsResult other = (DescribeMaintenanceWindowExecutionTaskInvocationsResult) obj;

        if (other.getWindowExecutionTaskInvocationIdentities() == null
                ^ this.getWindowExecutionTaskInvocationIdentities() == null)
            return false;
        if (other.getWindowExecutionTaskInvocationIdentities() != null
                && other.getWindowExecutionTaskInvocationIdentities().equals(
                        this.getWindowExecutionTaskInvocationIdentities()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
