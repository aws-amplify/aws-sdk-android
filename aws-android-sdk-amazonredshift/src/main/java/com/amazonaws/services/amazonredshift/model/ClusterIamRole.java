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

/**
 * <p>
 * An AWS Identity and Access Management (IAM) role that can be used by the
 * associated Amazon Redshift cluster to access other AWS services.
 * </p>
 */
public class ClusterIamRole implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role, for example,
     * <code>arn:aws:iam::123456789012:role/RedshiftCopyUnload</code>.
     * </p>
     */
    private String iamRoleArn;

    /**
     * <p>
     * A value that describes the status of the IAM role's association with an
     * Amazon Redshift cluster.
     * </p>
     * <p>
     * The following are possible statuses and descriptions.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>in-sync</code>: The role is available for use by the cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>adding</code>: The role is in the process of being associated with
     * the cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>removing</code>: The role is in the process of being disassociated
     * with the cluster.
     * </p>
     * </li>
     * </ul>
     */
    private String applyStatus;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role, for example,
     * <code>arn:aws:iam::123456789012:role/RedshiftCopyUnload</code>.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the IAM role, for example,
     *         <code>arn:aws:iam::123456789012:role/RedshiftCopyUnload</code>.
     *         </p>
     */
    public String getIamRoleArn() {
        return iamRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role, for example,
     * <code>arn:aws:iam::123456789012:role/RedshiftCopyUnload</code>.
     * </p>
     *
     * @param iamRoleArn <p>
     *            The Amazon Resource Name (ARN) of the IAM role, for example,
     *            <code>arn:aws:iam::123456789012:role/RedshiftCopyUnload</code>
     *            .
     *            </p>
     */
    public void setIamRoleArn(String iamRoleArn) {
        this.iamRoleArn = iamRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role, for example,
     * <code>arn:aws:iam::123456789012:role/RedshiftCopyUnload</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param iamRoleArn <p>
     *            The Amazon Resource Name (ARN) of the IAM role, for example,
     *            <code>arn:aws:iam::123456789012:role/RedshiftCopyUnload</code>
     *            .
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClusterIamRole withIamRoleArn(String iamRoleArn) {
        this.iamRoleArn = iamRoleArn;
        return this;
    }

    /**
     * <p>
     * A value that describes the status of the IAM role's association with an
     * Amazon Redshift cluster.
     * </p>
     * <p>
     * The following are possible statuses and descriptions.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>in-sync</code>: The role is available for use by the cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>adding</code>: The role is in the process of being associated with
     * the cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>removing</code>: The role is in the process of being disassociated
     * with the cluster.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         A value that describes the status of the IAM role's association
     *         with an Amazon Redshift cluster.
     *         </p>
     *         <p>
     *         The following are possible statuses and descriptions.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>in-sync</code>: The role is available for use by the
     *         cluster.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>adding</code>: The role is in the process of being
     *         associated with the cluster.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>removing</code>: The role is in the process of being
     *         disassociated with the cluster.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getApplyStatus() {
        return applyStatus;
    }

    /**
     * <p>
     * A value that describes the status of the IAM role's association with an
     * Amazon Redshift cluster.
     * </p>
     * <p>
     * The following are possible statuses and descriptions.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>in-sync</code>: The role is available for use by the cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>adding</code>: The role is in the process of being associated with
     * the cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>removing</code>: The role is in the process of being disassociated
     * with the cluster.
     * </p>
     * </li>
     * </ul>
     *
     * @param applyStatus <p>
     *            A value that describes the status of the IAM role's
     *            association with an Amazon Redshift cluster.
     *            </p>
     *            <p>
     *            The following are possible statuses and descriptions.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>in-sync</code>: The role is available for use by the
     *            cluster.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>adding</code>: The role is in the process of being
     *            associated with the cluster.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>removing</code>: The role is in the process of being
     *            disassociated with the cluster.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setApplyStatus(String applyStatus) {
        this.applyStatus = applyStatus;
    }

    /**
     * <p>
     * A value that describes the status of the IAM role's association with an
     * Amazon Redshift cluster.
     * </p>
     * <p>
     * The following are possible statuses and descriptions.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>in-sync</code>: The role is available for use by the cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>adding</code>: The role is in the process of being associated with
     * the cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>removing</code>: The role is in the process of being disassociated
     * with the cluster.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param applyStatus <p>
     *            A value that describes the status of the IAM role's
     *            association with an Amazon Redshift cluster.
     *            </p>
     *            <p>
     *            The following are possible statuses and descriptions.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>in-sync</code>: The role is available for use by the
     *            cluster.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>adding</code>: The role is in the process of being
     *            associated with the cluster.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>removing</code>: The role is in the process of being
     *            disassociated with the cluster.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClusterIamRole withApplyStatus(String applyStatus) {
        this.applyStatus = applyStatus;
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
        if (getIamRoleArn() != null)
            sb.append("IamRoleArn: " + getIamRoleArn() + ",");
        if (getApplyStatus() != null)
            sb.append("ApplyStatus: " + getApplyStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIamRoleArn() == null) ? 0 : getIamRoleArn().hashCode());
        hashCode = prime * hashCode
                + ((getApplyStatus() == null) ? 0 : getApplyStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ClusterIamRole == false)
            return false;
        ClusterIamRole other = (ClusterIamRole) obj;

        if (other.getIamRoleArn() == null ^ this.getIamRoleArn() == null)
            return false;
        if (other.getIamRoleArn() != null
                && other.getIamRoleArn().equals(this.getIamRoleArn()) == false)
            return false;
        if (other.getApplyStatus() == null ^ this.getApplyStatus() == null)
            return false;
        if (other.getApplyStatus() != null
                && other.getApplyStatus().equals(this.getApplyStatus()) == false)
            return false;
        return true;
    }
}
