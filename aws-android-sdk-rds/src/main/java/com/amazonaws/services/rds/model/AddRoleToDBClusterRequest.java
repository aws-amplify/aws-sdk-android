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

package com.amazonaws.services.rds.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Associates an Identity and Access Management (IAM) role from an Amazon Aurora
 * DB cluster. For more information, see <a href=
 * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/AuroraMySQL.Integrating.Authorizing.html"
 * >Authorizing Amazon Aurora MySQL to Access Other AWS Services on Your
 * Behalf</a> in the <i>Amazon Aurora User Guide</i>.
 * </p>
 * <note>
 * <p>
 * This action only applies to Aurora DB clusters.
 * </p>
 * </note>
 */
public class AddRoleToDBClusterRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the DB cluster to associate the IAM role with.
     * </p>
     */
    private String dBClusterIdentifier;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role to associate with the
     * Aurora DB cluster, for example
     * <code>arn:aws:iam::123456789012:role/AuroraAccessRole</code>.
     * </p>
     */
    private String roleArn;

    /**
     * <p>
     * The name of the feature for the DB cluster that the IAM role is to be
     * associated with. For the list of supported feature names, see
     * <a>DBEngineVersion</a>.
     * </p>
     */
    private String featureName;

    /**
     * <p>
     * The name of the DB cluster to associate the IAM role with.
     * </p>
     *
     * @return <p>
     *         The name of the DB cluster to associate the IAM role with.
     *         </p>
     */
    public String getDBClusterIdentifier() {
        return dBClusterIdentifier;
    }

    /**
     * <p>
     * The name of the DB cluster to associate the IAM role with.
     * </p>
     *
     * @param dBClusterIdentifier <p>
     *            The name of the DB cluster to associate the IAM role with.
     *            </p>
     */
    public void setDBClusterIdentifier(String dBClusterIdentifier) {
        this.dBClusterIdentifier = dBClusterIdentifier;
    }

    /**
     * <p>
     * The name of the DB cluster to associate the IAM role with.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBClusterIdentifier <p>
     *            The name of the DB cluster to associate the IAM role with.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AddRoleToDBClusterRequest withDBClusterIdentifier(String dBClusterIdentifier) {
        this.dBClusterIdentifier = dBClusterIdentifier;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role to associate with the
     * Aurora DB cluster, for example
     * <code>arn:aws:iam::123456789012:role/AuroraAccessRole</code>.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the IAM role to associate with
     *         the Aurora DB cluster, for example
     *         <code>arn:aws:iam::123456789012:role/AuroraAccessRole</code>.
     *         </p>
     */
    public String getRoleArn() {
        return roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role to associate with the
     * Aurora DB cluster, for example
     * <code>arn:aws:iam::123456789012:role/AuroraAccessRole</code>.
     * </p>
     *
     * @param roleArn <p>
     *            The Amazon Resource Name (ARN) of the IAM role to associate
     *            with the Aurora DB cluster, for example
     *            <code>arn:aws:iam::123456789012:role/AuroraAccessRole</code>.
     *            </p>
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role to associate with the
     * Aurora DB cluster, for example
     * <code>arn:aws:iam::123456789012:role/AuroraAccessRole</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param roleArn <p>
     *            The Amazon Resource Name (ARN) of the IAM role to associate
     *            with the Aurora DB cluster, for example
     *            <code>arn:aws:iam::123456789012:role/AuroraAccessRole</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AddRoleToDBClusterRequest withRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * <p>
     * The name of the feature for the DB cluster that the IAM role is to be
     * associated with. For the list of supported feature names, see
     * <a>DBEngineVersion</a>.
     * </p>
     *
     * @return <p>
     *         The name of the feature for the DB cluster that the IAM role is
     *         to be associated with. For the list of supported feature names,
     *         see <a>DBEngineVersion</a>.
     *         </p>
     */
    public String getFeatureName() {
        return featureName;
    }

    /**
     * <p>
     * The name of the feature for the DB cluster that the IAM role is to be
     * associated with. For the list of supported feature names, see
     * <a>DBEngineVersion</a>.
     * </p>
     *
     * @param featureName <p>
     *            The name of the feature for the DB cluster that the IAM role
     *            is to be associated with. For the list of supported feature
     *            names, see <a>DBEngineVersion</a>.
     *            </p>
     */
    public void setFeatureName(String featureName) {
        this.featureName = featureName;
    }

    /**
     * <p>
     * The name of the feature for the DB cluster that the IAM role is to be
     * associated with. For the list of supported feature names, see
     * <a>DBEngineVersion</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param featureName <p>
     *            The name of the feature for the DB cluster that the IAM role
     *            is to be associated with. For the list of supported feature
     *            names, see <a>DBEngineVersion</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AddRoleToDBClusterRequest withFeatureName(String featureName) {
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
        if (getDBClusterIdentifier() != null)
            sb.append("DBClusterIdentifier: " + getDBClusterIdentifier() + ",");
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
                + ((getDBClusterIdentifier() == null) ? 0 : getDBClusterIdentifier().hashCode());
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

        if (obj instanceof AddRoleToDBClusterRequest == false)
            return false;
        AddRoleToDBClusterRequest other = (AddRoleToDBClusterRequest) obj;

        if (other.getDBClusterIdentifier() == null ^ this.getDBClusterIdentifier() == null)
            return false;
        if (other.getDBClusterIdentifier() != null
                && other.getDBClusterIdentifier().equals(this.getDBClusterIdentifier()) == false)
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
