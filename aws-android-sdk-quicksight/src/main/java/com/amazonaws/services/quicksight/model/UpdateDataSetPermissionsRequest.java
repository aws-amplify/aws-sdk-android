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
 * Updates the permissions on a dataset.
 * </p>
 * <p>
 * The permissions resource is
 * <code>arn:aws:quicksight:region:aws-account-id:dataset/data-set-id</code>.
 * </p>
 */
public class UpdateDataSetPermissionsRequest extends AmazonWebServiceRequest implements
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
     * The ID for the dataset whose permissions you want to update. This ID is
     * unique per AWS Region for each AWS account.
     * </p>
     */
    private String dataSetId;

    /**
     * <p>
     * The resource permissions that you want to grant to the dataset.
     * </p>
     */
    private java.util.List<ResourcePermission> grantPermissions;

    /**
     * <p>
     * The resource permissions that you want to revoke from the dataset.
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
    public UpdateDataSetPermissionsRequest withAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
        return this;
    }

    /**
     * <p>
     * The ID for the dataset whose permissions you want to update. This ID is
     * unique per AWS Region for each AWS account.
     * </p>
     *
     * @return <p>
     *         The ID for the dataset whose permissions you want to update. This
     *         ID is unique per AWS Region for each AWS account.
     *         </p>
     */
    public String getDataSetId() {
        return dataSetId;
    }

    /**
     * <p>
     * The ID for the dataset whose permissions you want to update. This ID is
     * unique per AWS Region for each AWS account.
     * </p>
     *
     * @param dataSetId <p>
     *            The ID for the dataset whose permissions you want to update.
     *            This ID is unique per AWS Region for each AWS account.
     *            </p>
     */
    public void setDataSetId(String dataSetId) {
        this.dataSetId = dataSetId;
    }

    /**
     * <p>
     * The ID for the dataset whose permissions you want to update. This ID is
     * unique per AWS Region for each AWS account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dataSetId <p>
     *            The ID for the dataset whose permissions you want to update.
     *            This ID is unique per AWS Region for each AWS account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDataSetPermissionsRequest withDataSetId(String dataSetId) {
        this.dataSetId = dataSetId;
        return this;
    }

    /**
     * <p>
     * The resource permissions that you want to grant to the dataset.
     * </p>
     *
     * @return <p>
     *         The resource permissions that you want to grant to the dataset.
     *         </p>
     */
    public java.util.List<ResourcePermission> getGrantPermissions() {
        return grantPermissions;
    }

    /**
     * <p>
     * The resource permissions that you want to grant to the dataset.
     * </p>
     *
     * @param grantPermissions <p>
     *            The resource permissions that you want to grant to the
     *            dataset.
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
     * The resource permissions that you want to grant to the dataset.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param grantPermissions <p>
     *            The resource permissions that you want to grant to the
     *            dataset.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDataSetPermissionsRequest withGrantPermissions(
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
     * The resource permissions that you want to grant to the dataset.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param grantPermissions <p>
     *            The resource permissions that you want to grant to the
     *            dataset.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDataSetPermissionsRequest withGrantPermissions(
            java.util.Collection<ResourcePermission> grantPermissions) {
        setGrantPermissions(grantPermissions);
        return this;
    }

    /**
     * <p>
     * The resource permissions that you want to revoke from the dataset.
     * </p>
     *
     * @return <p>
     *         The resource permissions that you want to revoke from the
     *         dataset.
     *         </p>
     */
    public java.util.List<ResourcePermission> getRevokePermissions() {
        return revokePermissions;
    }

    /**
     * <p>
     * The resource permissions that you want to revoke from the dataset.
     * </p>
     *
     * @param revokePermissions <p>
     *            The resource permissions that you want to revoke from the
     *            dataset.
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
     * The resource permissions that you want to revoke from the dataset.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param revokePermissions <p>
     *            The resource permissions that you want to revoke from the
     *            dataset.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDataSetPermissionsRequest withRevokePermissions(
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
     * The resource permissions that you want to revoke from the dataset.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param revokePermissions <p>
     *            The resource permissions that you want to revoke from the
     *            dataset.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDataSetPermissionsRequest withRevokePermissions(
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
        if (getDataSetId() != null)
            sb.append("DataSetId: " + getDataSetId() + ",");
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
        hashCode = prime * hashCode + ((getDataSetId() == null) ? 0 : getDataSetId().hashCode());
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

        if (obj instanceof UpdateDataSetPermissionsRequest == false)
            return false;
        UpdateDataSetPermissionsRequest other = (UpdateDataSetPermissionsRequest) obj;

        if (other.getAwsAccountId() == null ^ this.getAwsAccountId() == null)
            return false;
        if (other.getAwsAccountId() != null
                && other.getAwsAccountId().equals(this.getAwsAccountId()) == false)
            return false;
        if (other.getDataSetId() == null ^ this.getDataSetId() == null)
            return false;
        if (other.getDataSetId() != null
                && other.getDataSetId().equals(this.getDataSetId()) == false)
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
