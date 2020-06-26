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

package com.amazonaws.services.quicksight.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates read and write permissions on a dashboard.
 * </p>
 */
public class UpdateDashboardPermissionsRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The ID of the AWS account that contains the dashboard whose permissions
     * you're updating.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>^[0-9]{12}$<br/>
     */
    private String awsAccountId;

    /**
     * <p>
     * The ID for the dashboard.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[\w\-]+<br/>
     */
    private String dashboardId;

    /**
     * <p>
     * The permissions that you want to grant on this resource.
     * </p>
     */
    private java.util.List<ResourcePermission> grantPermissions;

    /**
     * <p>
     * The permissions that you want to revoke from this resource.
     * </p>
     */
    private java.util.List<ResourcePermission> revokePermissions;

    /**
     * <p>
     * The ID of the AWS account that contains the dashboard whose permissions
     * you're updating.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>^[0-9]{12}$<br/>
     *
     * @return <p>
     *         The ID of the AWS account that contains the dashboard whose
     *         permissions you're updating.
     *         </p>
     */
    public String getAwsAccountId() {
        return awsAccountId;
    }

    /**
     * <p>
     * The ID of the AWS account that contains the dashboard whose permissions
     * you're updating.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>^[0-9]{12}$<br/>
     *
     * @param awsAccountId <p>
     *            The ID of the AWS account that contains the dashboard whose
     *            permissions you're updating.
     *            </p>
     */
    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * The ID of the AWS account that contains the dashboard whose permissions
     * you're updating.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>^[0-9]{12}$<br/>
     *
     * @param awsAccountId <p>
     *            The ID of the AWS account that contains the dashboard whose
     *            permissions you're updating.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDashboardPermissionsRequest withAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
        return this;
    }

    /**
     * <p>
     * The ID for the dashboard.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[\w\-]+<br/>
     *
     * @return <p>
     *         The ID for the dashboard.
     *         </p>
     */
    public String getDashboardId() {
        return dashboardId;
    }

    /**
     * <p>
     * The ID for the dashboard.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[\w\-]+<br/>
     *
     * @param dashboardId <p>
     *            The ID for the dashboard.
     *            </p>
     */
    public void setDashboardId(String dashboardId) {
        this.dashboardId = dashboardId;
    }

    /**
     * <p>
     * The ID for the dashboard.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[\w\-]+<br/>
     *
     * @param dashboardId <p>
     *            The ID for the dashboard.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDashboardPermissionsRequest withDashboardId(String dashboardId) {
        this.dashboardId = dashboardId;
        return this;
    }

    /**
     * <p>
     * The permissions that you want to grant on this resource.
     * </p>
     *
     * @return <p>
     *         The permissions that you want to grant on this resource.
     *         </p>
     */
    public java.util.List<ResourcePermission> getGrantPermissions() {
        return grantPermissions;
    }

    /**
     * <p>
     * The permissions that you want to grant on this resource.
     * </p>
     *
     * @param grantPermissions <p>
     *            The permissions that you want to grant on this resource.
     *            </p>
     */
    public void setGrantPermissions(java.util.Collection<ResourcePermission> grantPermissions) {
        if (grantPermissions == null) {
            this.grantPermissions = null;
            return;
        }

        this.grantPermissions = new java.util.ArrayList<ResourcePermission>(grantPermissions);
    }

    /**
     * <p>
     * The permissions that you want to grant on this resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param grantPermissions <p>
     *            The permissions that you want to grant on this resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDashboardPermissionsRequest withGrantPermissions(
            ResourcePermission... grantPermissions) {
        if (getGrantPermissions() == null) {
            this.grantPermissions = new java.util.ArrayList<ResourcePermission>(
                    grantPermissions.length);
        }
        for (ResourcePermission value : grantPermissions) {
            this.grantPermissions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The permissions that you want to grant on this resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param grantPermissions <p>
     *            The permissions that you want to grant on this resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDashboardPermissionsRequest withGrantPermissions(
            java.util.Collection<ResourcePermission> grantPermissions) {
        setGrantPermissions(grantPermissions);
        return this;
    }

    /**
     * <p>
     * The permissions that you want to revoke from this resource.
     * </p>
     *
     * @return <p>
     *         The permissions that you want to revoke from this resource.
     *         </p>
     */
    public java.util.List<ResourcePermission> getRevokePermissions() {
        return revokePermissions;
    }

    /**
     * <p>
     * The permissions that you want to revoke from this resource.
     * </p>
     *
     * @param revokePermissions <p>
     *            The permissions that you want to revoke from this resource.
     *            </p>
     */
    public void setRevokePermissions(java.util.Collection<ResourcePermission> revokePermissions) {
        if (revokePermissions == null) {
            this.revokePermissions = null;
            return;
        }

        this.revokePermissions = new java.util.ArrayList<ResourcePermission>(revokePermissions);
    }

    /**
     * <p>
     * The permissions that you want to revoke from this resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param revokePermissions <p>
     *            The permissions that you want to revoke from this resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDashboardPermissionsRequest withRevokePermissions(
            ResourcePermission... revokePermissions) {
        if (getRevokePermissions() == null) {
            this.revokePermissions = new java.util.ArrayList<ResourcePermission>(
                    revokePermissions.length);
        }
        for (ResourcePermission value : revokePermissions) {
            this.revokePermissions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The permissions that you want to revoke from this resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param revokePermissions <p>
     *            The permissions that you want to revoke from this resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDashboardPermissionsRequest withRevokePermissions(
            java.util.Collection<ResourcePermission> revokePermissions) {
        setRevokePermissions(revokePermissions);
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
        if (getAwsAccountId() != null)
            sb.append("AwsAccountId: " + getAwsAccountId() + ",");
        if (getDashboardId() != null)
            sb.append("DashboardId: " + getDashboardId() + ",");
        if (getGrantPermissions() != null)
            sb.append("GrantPermissions: " + getGrantPermissions() + ",");
        if (getRevokePermissions() != null)
            sb.append("RevokePermissions: " + getRevokePermissions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAwsAccountId() == null) ? 0 : getAwsAccountId().hashCode());
        hashCode = prime * hashCode
                + ((getDashboardId() == null) ? 0 : getDashboardId().hashCode());
        hashCode = prime * hashCode
                + ((getGrantPermissions() == null) ? 0 : getGrantPermissions().hashCode());
        hashCode = prime * hashCode
                + ((getRevokePermissions() == null) ? 0 : getRevokePermissions().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateDashboardPermissionsRequest == false)
            return false;
        UpdateDashboardPermissionsRequest other = (UpdateDashboardPermissionsRequest) obj;

        if (other.getAwsAccountId() == null ^ this.getAwsAccountId() == null)
            return false;
        if (other.getAwsAccountId() != null
                && other.getAwsAccountId().equals(this.getAwsAccountId()) == false)
            return false;
        if (other.getDashboardId() == null ^ this.getDashboardId() == null)
            return false;
        if (other.getDashboardId() != null
                && other.getDashboardId().equals(this.getDashboardId()) == false)
            return false;
        if (other.getGrantPermissions() == null ^ this.getGrantPermissions() == null)
            return false;
        if (other.getGrantPermissions() != null
                && other.getGrantPermissions().equals(this.getGrantPermissions()) == false)
            return false;
        if (other.getRevokePermissions() == null ^ this.getRevokePermissions() == null)
            return false;
        if (other.getRevokePermissions() != null
                && other.getRevokePermissions().equals(this.getRevokePermissions()) == false)
            return false;
        return true;
    }
}
