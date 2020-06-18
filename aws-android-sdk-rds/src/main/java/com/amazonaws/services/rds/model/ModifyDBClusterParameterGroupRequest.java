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
 * Modifies the parameters of a DB cluster parameter group. To modify more than
 * one parameter, submit a list of the following: <code>ParameterName</code>,
 * <code>ParameterValue</code>, and <code>ApplyMethod</code>. A maximum of 20
 * parameters can be modified in a single request.
 * </p>
 * <p>
 * For more information on Amazon Aurora, see <a href=
 * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"
 * > What Is Amazon Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
 * </p>
 * <note>
 * <p>
 * Changes to dynamic parameters are applied immediately. Changes to static
 * parameters require a reboot without failover to the DB cluster associated
 * with the parameter group before the change can take effect.
 * </p>
 * </note> <important>
 * <p>
 * After you create a DB cluster parameter group, you should wait at least 5
 * minutes before creating your first DB cluster that uses that DB cluster
 * parameter group as the default parameter group. This allows Amazon RDS to
 * fully complete the create action before the parameter group is used as the
 * default for a new DB cluster. This is especially important for parameters
 * that are critical when creating the default database for a DB cluster, such
 * as the character set for the default database defined by the
 * <code>character_set_database</code> parameter. You can use the <i>Parameter
 * Groups</i> option of the <a href="https://console.aws.amazon.com/rds/">Amazon
 * RDS console</a> or the <code>DescribeDBClusterParameters</code> action to
 * verify that your DB cluster parameter group has been created or modified.
 * </p>
 * <p>
 * If the modified DB cluster parameter group is used by an Aurora Serverless
 * cluster, Aurora applies the update immediately. The cluster restart might
 * interrupt your workload. In that case, your application must reopen any
 * connections and retry any transactions that were active when the parameter
 * changes took effect.
 * </p>
 * </important> <note>
 * <p>
 * This action only applies to Aurora DB clusters.
 * </p>
 * </note>
 */
public class ModifyDBClusterParameterGroupRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the DB cluster parameter group to modify.
     * </p>
     */
    private String dBClusterParameterGroupName;

    /**
     * <p>
     * A list of parameters in the DB cluster parameter group to modify.
     * </p>
     */
    private java.util.List<Parameter> parameters;

    /**
     * <p>
     * The name of the DB cluster parameter group to modify.
     * </p>
     *
     * @return <p>
     *         The name of the DB cluster parameter group to modify.
     *         </p>
     */
    public String getDBClusterParameterGroupName() {
        return dBClusterParameterGroupName;
    }

    /**
     * <p>
     * The name of the DB cluster parameter group to modify.
     * </p>
     *
     * @param dBClusterParameterGroupName <p>
     *            The name of the DB cluster parameter group to modify.
     *            </p>
     */
    public void setDBClusterParameterGroupName(String dBClusterParameterGroupName) {
        this.dBClusterParameterGroupName = dBClusterParameterGroupName;
    }

    /**
     * <p>
     * The name of the DB cluster parameter group to modify.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBClusterParameterGroupName <p>
     *            The name of the DB cluster parameter group to modify.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyDBClusterParameterGroupRequest withDBClusterParameterGroupName(
            String dBClusterParameterGroupName) {
        this.dBClusterParameterGroupName = dBClusterParameterGroupName;
        return this;
    }

    /**
     * <p>
     * A list of parameters in the DB cluster parameter group to modify.
     * </p>
     *
     * @return <p>
     *         A list of parameters in the DB cluster parameter group to modify.
     *         </p>
     */
    public java.util.List<Parameter> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * A list of parameters in the DB cluster parameter group to modify.
     * </p>
     *
     * @param parameters <p>
     *            A list of parameters in the DB cluster parameter group to
     *            modify.
     *            </p>
     */
    public void setParameters(java.util.Collection<Parameter> parameters) {
        if (parameters == null) {
            this.parameters = null;
            return;
        }

        this.parameters = new java.util.ArrayList<Parameter>(parameters);
    }

    /**
     * <p>
     * A list of parameters in the DB cluster parameter group to modify.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parameters <p>
     *            A list of parameters in the DB cluster parameter group to
     *            modify.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyDBClusterParameterGroupRequest withParameters(Parameter... parameters) {
        if (getParameters() == null) {
            this.parameters = new java.util.ArrayList<Parameter>(parameters.length);
        }
        for (Parameter value : parameters) {
            this.parameters.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of parameters in the DB cluster parameter group to modify.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parameters <p>
     *            A list of parameters in the DB cluster parameter group to
     *            modify.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyDBClusterParameterGroupRequest withParameters(
            java.util.Collection<Parameter> parameters) {
        setParameters(parameters);
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
        if (getDBClusterParameterGroupName() != null)
            sb.append("DBClusterParameterGroupName: " + getDBClusterParameterGroupName() + ",");
        if (getParameters() != null)
            sb.append("Parameters: " + getParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getDBClusterParameterGroupName() == null) ? 0
                        : getDBClusterParameterGroupName().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyDBClusterParameterGroupRequest == false)
            return false;
        ModifyDBClusterParameterGroupRequest other = (ModifyDBClusterParameterGroupRequest) obj;

        if (other.getDBClusterParameterGroupName() == null
                ^ this.getDBClusterParameterGroupName() == null)
            return false;
        if (other.getDBClusterParameterGroupName() != null
                && other.getDBClusterParameterGroupName().equals(
                        this.getDBClusterParameterGroupName()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null
                && other.getParameters().equals(this.getParameters()) == false)
            return false;
        return true;
    }
}
