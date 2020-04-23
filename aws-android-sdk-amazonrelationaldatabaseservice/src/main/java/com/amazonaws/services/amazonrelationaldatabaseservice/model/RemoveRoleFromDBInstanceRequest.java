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

package com.amazonaws.services.amazonrelationaldatabaseservice.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Disassociates an AWS Identity and Access Management (IAM) role from a DB
 * instance.
 * </p>
 */
public class RemoveRoleFromDBInstanceRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the DB instance to disassociate the IAM role from.
     * </p>
     */
    private String dBInstanceIdentifier;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role to disassociate from the
     * DB instance, for example
     * <code>arn:aws:iam::123456789012:role/AccessRole</code>.
     * </p>
     */
    private String roleArn;

    /**
     * <p>
     * The name of the feature for the DB instance that the IAM role is to be
     * disassociated from. For the list of supported feature names, see
     * <code>DBEngineVersion</code>.
     * </p>
     */
    private String featureName;

    /**
     * <p>
     * The name of the DB instance to disassociate the IAM role from.
     * </p>
     *
     * @return <p>
     *         The name of the DB instance to disassociate the IAM role from.
     *         </p>
     */
    public String getDBInstanceIdentifier() {
        return dBInstanceIdentifier;
    }

    /**
     * <p>
     * The name of the DB instance to disassociate the IAM role from.
     * </p>
     *
     * @param dBInstanceIdentifier <p>
     *            The name of the DB instance to disassociate the IAM role from.
     *            </p>
     */
    public void setDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
    }

    /**
     * <p>
     * The name of the DB instance to disassociate the IAM role from.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBInstanceIdentifier <p>
     *            The name of the DB instance to disassociate the IAM role from.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RemoveRoleFromDBInstanceRequest withDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role to disassociate from the
     * DB instance, for example
     * <code>arn:aws:iam::123456789012:role/AccessRole</code>.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the IAM role to disassociate
     *         from the DB instance, for example
     *         <code>arn:aws:iam::123456789012:role/AccessRole</code>.
     *         </p>
     */
    public String getRoleArn() {
        return roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role to disassociate from the
     * DB instance, for example
     * <code>arn:aws:iam::123456789012:role/AccessRole</code>.
     * </p>
     *
     * @param roleArn <p>
     *            The Amazon Resource Name (ARN) of the IAM role to disassociate
     *            from the DB instance, for example
     *            <code>arn:aws:iam::123456789012:role/AccessRole</code>.
     *            </p>
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role to disassociate from the
     * DB instance, for example
     * <code>arn:aws:iam::123456789012:role/AccessRole</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param roleArn <p>
     *            The Amazon Resource Name (ARN) of the IAM role to disassociate
     *            from the DB instance, for example
     *            <code>arn:aws:iam::123456789012:role/AccessRole</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RemoveRoleFromDBInstanceRequest withRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * <p>
     * The name of the feature for the DB instance that the IAM role is to be
     * disassociated from. For the list of supported feature names, see
     * <code>DBEngineVersion</code>.
     * </p>
     *
     * @return <p>
     *         The name of the feature for the DB instance that the IAM role is
     *         to be disassociated from. For the list of supported feature
     *         names, see <code>DBEngineVersion</code>.
     *         </p>
     */
    public String getFeatureName() {
        return featureName;
    }

    /**
     * <p>
     * The name of the feature for the DB instance that the IAM role is to be
     * disassociated from. For the list of supported feature names, see
     * <code>DBEngineVersion</code>.
     * </p>
     *
     * @param featureName <p>
     *            The name of the feature for the DB instance that the IAM role
     *            is to be disassociated from. For the list of supported feature
     *            names, see <code>DBEngineVersion</code>.
     *            </p>
     */
    public void setFeatureName(String featureName) {
        this.featureName = featureName;
    }

    /**
     * <p>
     * The name of the feature for the DB instance that the IAM role is to be
     * disassociated from. For the list of supported feature names, see
     * <code>DBEngineVersion</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param featureName <p>
     *            The name of the feature for the DB instance that the IAM role
     *            is to be disassociated from. For the list of supported feature
     *            names, see <code>DBEngineVersion</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RemoveRoleFromDBInstanceRequest withFeatureName(String featureName) {
        this.featureName = featureName;
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
        if (getDBInstanceIdentifier() != null)
            sb.append("DBInstanceIdentifier: " + getDBInstanceIdentifier() + ",");
        if (getRoleArn() != null)
            sb.append("RoleArn: " + getRoleArn() + ",");
        if (getFeatureName() != null)
            sb.append("FeatureName: " + getFeatureName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDBInstanceIdentifier() == null) ? 0 : getDBInstanceIdentifier().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode
                + ((getFeatureName() == null) ? 0 : getFeatureName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RemoveRoleFromDBInstanceRequest == false)
            return false;
        RemoveRoleFromDBInstanceRequest other = (RemoveRoleFromDBInstanceRequest) obj;

        if (other.getDBInstanceIdentifier() == null ^ this.getDBInstanceIdentifier() == null)
            return false;
        if (other.getDBInstanceIdentifier() != null
                && other.getDBInstanceIdentifier().equals(this.getDBInstanceIdentifier()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getFeatureName() == null ^ this.getFeatureName() == null)
            return false;
        if (other.getFeatureName() != null
                && other.getFeatureName().equals(this.getFeatureName()) == false)
            return false;
        return true;
    }
}
