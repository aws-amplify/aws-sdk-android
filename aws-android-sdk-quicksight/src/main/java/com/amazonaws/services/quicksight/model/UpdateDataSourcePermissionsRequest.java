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
 * Updates the permissions to a data source.
 * </p>
 */
public class UpdateDataSourcePermissionsRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The AWS account ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>^[0-9]{12}$<br/>
     */
    private String awsAccountId;

    /**
     * <p>
     * The ID of the data source. This ID is unique per AWS Region for each AWS
     * account.
     * </p>
     */
    private String dataSourceId;

    /**
     * <p>
     * A list of resource permissions that you want to grant on the data source.
     * </p>
     */
    private java.util.List<ResourcePermission> grantPermissions;

    /**
     * <p>
     * A list of resource permissions that you want to revoke on the data
     * source.
     * </p>
     */
    private java.util.List<ResourcePermission> revokePermissions;

    /**
     * <p>
     * The AWS account ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>^[0-9]{12}$<br/>
     *
     * @return <p>
     *         The AWS account ID.
     *         </p>
     */
    public String getAwsAccountId() {
        return awsAccountId;
    }

    /**
     * <p>
     * The AWS account ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>^[0-9]{12}$<br/>
     *
     * @param awsAccountId <p>
     *            The AWS account ID.
     *            </p>
     */
    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * The AWS account ID.
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
     *            The AWS account ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDataSourcePermissionsRequest withAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
        return this;
    }

    /**
     * <p>
     * The ID of the data source. This ID is unique per AWS Region for each AWS
     * account.
     * </p>
     *
     * @return <p>
     *         The ID of the data source. This ID is unique per AWS Region for
     *         each AWS account.
     *         </p>
     */
    public String getDataSourceId() {
        return dataSourceId;
    }

    /**
     * <p>
     * The ID of the data source. This ID is unique per AWS Region for each AWS
     * account.
     * </p>
     *
     * @param dataSourceId <p>
     *            The ID of the data source. This ID is unique per AWS Region
     *            for each AWS account.
     *            </p>
     */
    public void setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
    }

    /**
     * <p>
     * The ID of the data source. This ID is unique per AWS Region for each AWS
     * account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dataSourceId <p>
     *            The ID of the data source. This ID is unique per AWS Region
     *            for each AWS account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDataSourcePermissionsRequest withDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }

    /**
     * <p>
     * A list of resource permissions that you want to grant on the data source.
     * </p>
     *
     * @return <p>
     *         A list of resource permissions that you want to grant on the data
     *         source.
     *         </p>
     */
    public java.util.List<ResourcePermission> getGrantPermissions() {
        return grantPermissions;
    }

    /**
     * <p>
     * A list of resource permissions that you want to grant on the data source.
     * </p>
     *
     * @param grantPermissions <p>
     *            A list of resource permissions that you want to grant on the
     *            data source.
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
     * A list of resource permissions that you want to grant on the data source.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param grantPermissions <p>
     *            A list of resource permissions that you want to grant on the
     *            data source.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDataSourcePermissionsRequest withGrantPermissions(
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
     * A list of resource permissions that you want to grant on the data source.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param grantPermissions <p>
     *            A list of resource permissions that you want to grant on the
     *            data source.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDataSourcePermissionsRequest withGrantPermissions(
            java.util.Collection<ResourcePermission> grantPermissions) {
        setGrantPermissions(grantPermissions);
        return this;
    }

    /**
     * <p>
     * A list of resource permissions that you want to revoke on the data
     * source.
     * </p>
     *
     * @return <p>
     *         A list of resource permissions that you want to revoke on the
     *         data source.
     *         </p>
     */
    public java.util.List<ResourcePermission> getRevokePermissions() {
        return revokePermissions;
    }

    /**
     * <p>
     * A list of resource permissions that you want to revoke on the data
     * source.
     * </p>
     *
     * @param revokePermissions <p>
     *            A list of resource permissions that you want to revoke on the
     *            data source.
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
     * A list of resource permissions that you want to revoke on the data
     * source.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param revokePermissions <p>
     *            A list of resource permissions that you want to revoke on the
     *            data source.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDataSourcePermissionsRequest withRevokePermissions(
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
     * A list of resource permissions that you want to revoke on the data
     * source.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param revokePermissions <p>
     *            A list of resource permissions that you want to revoke on the
     *            data source.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDataSourcePermissionsRequest withRevokePermissions(
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
        if (getDataSourceId() != null)
            sb.append("DataSourceId: " + getDataSourceId() + ",");
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
                + ((getDataSourceId() == null) ? 0 : getDataSourceId().hashCode());
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

        if (obj instanceof UpdateDataSourcePermissionsRequest == false)
            return false;
        UpdateDataSourcePermissionsRequest other = (UpdateDataSourcePermissionsRequest) obj;

        if (other.getAwsAccountId() == null ^ this.getAwsAccountId() == null)
            return false;
        if (other.getAwsAccountId() != null
                && other.getAwsAccountId().equals(this.getAwsAccountId()) == false)
            return false;
        if (other.getDataSourceId() == null ^ this.getDataSourceId() == null)
            return false;
        if (other.getDataSourceId() != null
                && other.getDataSourceId().equals(this.getDataSourceId()) == false)
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
