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

public class DescribeMaintenanceWindowsResult implements Serializable {
    /**
     * <p>
     * Information about the maintenance windows.
     * </p>
     */
    private java.util.List<MaintenanceWindowIdentity> windowIdentities;

    /**
     * <p>
     * The token to use when requesting the next set of items. If there are no
     * additional items to return, the string is empty.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about the maintenance windows.
     * </p>
     *
     * @return <p>
     *         Information about the maintenance windows.
     *         </p>
     */
    public java.util.List<MaintenanceWindowIdentity> getWindowIdentities() {
        return windowIdentities;
    }

    /**
     * <p>
     * Information about the maintenance windows.
     * </p>
     *
     * @param windowIdentities <p>
     *            Information about the maintenance windows.
     *            </p>
     */
    public void setWindowIdentities(java.util.Collection<MaintenanceWindowIdentity> windowIdentities) {
        if (windowIdentities == null) {
            this.windowIdentities = null;
            return;
        }

        this.windowIdentities = new java.util.ArrayList<MaintenanceWindowIdentity>(windowIdentities);
    }

    /**
     * <p>
     * Information about the maintenance windows.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param windowIdentities <p>
     *            Information about the maintenance windows.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeMaintenanceWindowsResult withWindowIdentities(
            MaintenanceWindowIdentity... windowIdentities) {
        if (getWindowIdentities() == null) {
            this.windowIdentities = new java.util.ArrayList<MaintenanceWindowIdentity>(
                    windowIdentities.length);
        }
        for (MaintenanceWindowIdentity value : windowIdentities) {
            this.windowIdentities.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the maintenance windows.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param windowIdentities <p>
     *            Information about the maintenance windows.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeMaintenanceWindowsResult withWindowIdentities(
            java.util.Collection<MaintenanceWindowIdentity> windowIdentities) {
        setWindowIdentities(windowIdentities);
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
    public DescribeMaintenanceWindowsResult withNextToken(String nextToken) {
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
        if (getWindowIdentities() != null)
            sb.append("WindowIdentities: " + getWindowIdentities() + ",");
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
                + ((getWindowIdentities() == null) ? 0 : getWindowIdentities().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeMaintenanceWindowsResult == false)
            return false;
        DescribeMaintenanceWindowsResult other = (DescribeMaintenanceWindowsResult) obj;

        if (other.getWindowIdentities() == null ^ this.getWindowIdentities() == null)
            return false;
        if (other.getWindowIdentities() != null
                && other.getWindowIdentities().equals(this.getWindowIdentities()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
