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

package com.amazonaws.services.amazonredshift.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Removes the ability of the specified AWS customer account to restore the
 * specified snapshot. If the account is currently restoring the snapshot, the
 * restore will run to completion.
 * </p>
 * <p>
 * For more information about working with snapshots, go to <a href=
 * "https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-snapshots.html"
 * >Amazon Redshift Snapshots</a> in the <i>Amazon Redshift Cluster Management
 * Guide</i>.
 * </p>
 */
public class RevokeSnapshotAccessRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The identifier of the snapshot that the account can no longer access.
     * </p>
     */
    private String snapshotIdentifier;

    /**
     * <p>
     * The identifier of the cluster the snapshot was created from. This
     * parameter is required if your IAM user has a policy containing a snapshot
     * resource element that specifies anything other than * for the cluster
     * name.
     * </p>
     */
    private String snapshotClusterIdentifier;

    /**
     * <p>
     * The identifier of the AWS customer account that can no longer restore the
     * specified snapshot.
     * </p>
     */
    private String accountWithRestoreAccess;

    /**
     * <p>
     * The identifier of the snapshot that the account can no longer access.
     * </p>
     *
     * @return <p>
     *         The identifier of the snapshot that the account can no longer
     *         access.
     *         </p>
     */
    public String getSnapshotIdentifier() {
        return snapshotIdentifier;
    }

    /**
     * <p>
     * The identifier of the snapshot that the account can no longer access.
     * </p>
     *
     * @param snapshotIdentifier <p>
     *            The identifier of the snapshot that the account can no longer
     *            access.
     *            </p>
     */
    public void setSnapshotIdentifier(String snapshotIdentifier) {
        this.snapshotIdentifier = snapshotIdentifier;
    }

    /**
     * <p>
     * The identifier of the snapshot that the account can no longer access.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param snapshotIdentifier <p>
     *            The identifier of the snapshot that the account can no longer
     *            access.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RevokeSnapshotAccessRequest withSnapshotIdentifier(String snapshotIdentifier) {
        this.snapshotIdentifier = snapshotIdentifier;
        return this;
    }

    /**
     * <p>
     * The identifier of the cluster the snapshot was created from. This
     * parameter is required if your IAM user has a policy containing a snapshot
     * resource element that specifies anything other than * for the cluster
     * name.
     * </p>
     *
     * @return <p>
     *         The identifier of the cluster the snapshot was created from. This
     *         parameter is required if your IAM user has a policy containing a
     *         snapshot resource element that specifies anything other than *
     *         for the cluster name.
     *         </p>
     */
    public String getSnapshotClusterIdentifier() {
        return snapshotClusterIdentifier;
    }

    /**
     * <p>
     * The identifier of the cluster the snapshot was created from. This
     * parameter is required if your IAM user has a policy containing a snapshot
     * resource element that specifies anything other than * for the cluster
     * name.
     * </p>
     *
     * @param snapshotClusterIdentifier <p>
     *            The identifier of the cluster the snapshot was created from.
     *            This parameter is required if your IAM user has a policy
     *            containing a snapshot resource element that specifies anything
     *            other than * for the cluster name.
     *            </p>
     */
    public void setSnapshotClusterIdentifier(String snapshotClusterIdentifier) {
        this.snapshotClusterIdentifier = snapshotClusterIdentifier;
    }

    /**
     * <p>
     * The identifier of the cluster the snapshot was created from. This
     * parameter is required if your IAM user has a policy containing a snapshot
     * resource element that specifies anything other than * for the cluster
     * name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param snapshotClusterIdentifier <p>
     *            The identifier of the cluster the snapshot was created from.
     *            This parameter is required if your IAM user has a policy
     *            containing a snapshot resource element that specifies anything
     *            other than * for the cluster name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RevokeSnapshotAccessRequest withSnapshotClusterIdentifier(
            String snapshotClusterIdentifier) {
        this.snapshotClusterIdentifier = snapshotClusterIdentifier;
        return this;
    }

    /**
     * <p>
     * The identifier of the AWS customer account that can no longer restore the
     * specified snapshot.
     * </p>
     *
     * @return <p>
     *         The identifier of the AWS customer account that can no longer
     *         restore the specified snapshot.
     *         </p>
     */
    public String getAccountWithRestoreAccess() {
        return accountWithRestoreAccess;
    }

    /**
     * <p>
     * The identifier of the AWS customer account that can no longer restore the
     * specified snapshot.
     * </p>
     *
     * @param accountWithRestoreAccess <p>
     *            The identifier of the AWS customer account that can no longer
     *            restore the specified snapshot.
     *            </p>
     */
    public void setAccountWithRestoreAccess(String accountWithRestoreAccess) {
        this.accountWithRestoreAccess = accountWithRestoreAccess;
    }

    /**
     * <p>
     * The identifier of the AWS customer account that can no longer restore the
     * specified snapshot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accountWithRestoreAccess <p>
     *            The identifier of the AWS customer account that can no longer
     *            restore the specified snapshot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RevokeSnapshotAccessRequest withAccountWithRestoreAccess(String accountWithRestoreAccess) {
        this.accountWithRestoreAccess = accountWithRestoreAccess;
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
        if (getSnapshotIdentifier() != null)
            sb.append("SnapshotIdentifier: " + getSnapshotIdentifier() + ",");
        if (getSnapshotClusterIdentifier() != null)
            sb.append("SnapshotClusterIdentifier: " + getSnapshotClusterIdentifier() + ",");
        if (getAccountWithRestoreAccess() != null)
            sb.append("AccountWithRestoreAccess: " + getAccountWithRestoreAccess());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSnapshotIdentifier() == null) ? 0 : getSnapshotIdentifier().hashCode());
        hashCode = prime
                * hashCode
                + ((getSnapshotClusterIdentifier() == null) ? 0 : getSnapshotClusterIdentifier()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getAccountWithRestoreAccess() == null) ? 0 : getAccountWithRestoreAccess()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RevokeSnapshotAccessRequest == false)
            return false;
        RevokeSnapshotAccessRequest other = (RevokeSnapshotAccessRequest) obj;

        if (other.getSnapshotIdentifier() == null ^ this.getSnapshotIdentifier() == null)
            return false;
        if (other.getSnapshotIdentifier() != null
                && other.getSnapshotIdentifier().equals(this.getSnapshotIdentifier()) == false)
            return false;
        if (other.getSnapshotClusterIdentifier() == null
                ^ this.getSnapshotClusterIdentifier() == null)
            return false;
        if (other.getSnapshotClusterIdentifier() != null
                && other.getSnapshotClusterIdentifier().equals(this.getSnapshotClusterIdentifier()) == false)
            return false;
        if (other.getAccountWithRestoreAccess() == null
                ^ this.getAccountWithRestoreAccess() == null)
            return false;
        if (other.getAccountWithRestoreAccess() != null
                && other.getAccountWithRestoreAccess().equals(this.getAccountWithRestoreAccess()) == false)
            return false;
        return true;
    }
}
