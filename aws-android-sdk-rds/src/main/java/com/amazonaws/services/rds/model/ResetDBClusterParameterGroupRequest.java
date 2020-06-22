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
 * Modifies the parameters of a DB cluster parameter group to the default value.
 * To reset specific parameters submit a list of the following:
 * <code>ParameterName</code> and <code>ApplyMethod</code>. To reset the entire
 * DB cluster parameter group, specify the
 * <code>DBClusterParameterGroupName</code> and <code>ResetAllParameters</code>
 * parameters.
 * </p>
 * <p>
 * When resetting the entire group, dynamic parameters are updated immediately
 * and static parameters are set to <code>pending-reboot</code> to take effect
 * on the next DB instance restart or <code>RebootDBInstance</code> request. You
 * must call <code>RebootDBInstance</code> for every DB instance in your DB
 * cluster that you want the updated static parameter to apply to.
 * </p>
 * <p>
 * For more information on Amazon Aurora, see <a href=
 * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"
 * > What Is Amazon Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
 * </p>
 * <note>
 * <p>
 * This action only applies to Aurora DB clusters.
 * </p>
 * </note>
 */
public class ResetDBClusterParameterGroupRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the DB cluster parameter group to reset.
     * </p>
     */
    private String dBClusterParameterGroupName;

    /**
     * <p>
     * A value that indicates whether to reset all parameters in the DB cluster
     * parameter group to their default values. You can't use this parameter if
     * there is a list of parameter names specified for the
     * <code>Parameters</code> parameter.
     * </p>
     */
    private Boolean resetAllParameters;

    /**
     * <p>
     * A list of parameter names in the DB cluster parameter group to reset to
     * the default values. You can't use this parameter if the
     * <code>ResetAllParameters</code> parameter is enabled.
     * </p>
     */
    private java.util.List<Parameter> parameters;

    /**
     * <p>
     * The name of the DB cluster parameter group to reset.
     * </p>
     *
     * @return <p>
     *         The name of the DB cluster parameter group to reset.
     *         </p>
     */
    public String getDBClusterParameterGroupName() {
        return dBClusterParameterGroupName;
    }

    /**
     * <p>
     * The name of the DB cluster parameter group to reset.
     * </p>
     *
     * @param dBClusterParameterGroupName <p>
     *            The name of the DB cluster parameter group to reset.
     *            </p>
     */
    public void setDBClusterParameterGroupName(String dBClusterParameterGroupName) {
        this.dBClusterParameterGroupName = dBClusterParameterGroupName;
    }

    /**
     * <p>
     * The name of the DB cluster parameter group to reset.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBClusterParameterGroupName <p>
     *            The name of the DB cluster parameter group to reset.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResetDBClusterParameterGroupRequest withDBClusterParameterGroupName(
            String dBClusterParameterGroupName) {
        this.dBClusterParameterGroupName = dBClusterParameterGroupName;
        return this;
    }

    /**
     * <p>
     * A value that indicates whether to reset all parameters in the DB cluster
     * parameter group to their default values. You can't use this parameter if
     * there is a list of parameter names specified for the
     * <code>Parameters</code> parameter.
     * </p>
     *
     * @return <p>
     *         A value that indicates whether to reset all parameters in the DB
     *         cluster parameter group to their default values. You can't use
     *         this parameter if there is a list of parameter names specified
     *         for the <code>Parameters</code> parameter.
     *         </p>
     */
    public Boolean isResetAllParameters() {
        return resetAllParameters;
    }

    /**
     * <p>
     * A value that indicates whether to reset all parameters in the DB cluster
     * parameter group to their default values. You can't use this parameter if
     * there is a list of parameter names specified for the
     * <code>Parameters</code> parameter.
     * </p>
     *
     * @return <p>
     *         A value that indicates whether to reset all parameters in the DB
     *         cluster parameter group to their default values. You can't use
     *         this parameter if there is a list of parameter names specified
     *         for the <code>Parameters</code> parameter.
     *         </p>
     */
    public Boolean getResetAllParameters() {
        return resetAllParameters;
    }

    /**
     * <p>
     * A value that indicates whether to reset all parameters in the DB cluster
     * parameter group to their default values. You can't use this parameter if
     * there is a list of parameter names specified for the
     * <code>Parameters</code> parameter.
     * </p>
     *
     * @param resetAllParameters <p>
     *            A value that indicates whether to reset all parameters in the
     *            DB cluster parameter group to their default values. You can't
     *            use this parameter if there is a list of parameter names
     *            specified for the <code>Parameters</code> parameter.
     *            </p>
     */
    public void setResetAllParameters(Boolean resetAllParameters) {
        this.resetAllParameters = resetAllParameters;
    }

    /**
     * <p>
     * A value that indicates whether to reset all parameters in the DB cluster
     * parameter group to their default values. You can't use this parameter if
     * there is a list of parameter names specified for the
     * <code>Parameters</code> parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resetAllParameters <p>
     *            A value that indicates whether to reset all parameters in the
     *            DB cluster parameter group to their default values. You can't
     *            use this parameter if there is a list of parameter names
     *            specified for the <code>Parameters</code> parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResetDBClusterParameterGroupRequest withResetAllParameters(Boolean resetAllParameters) {
        this.resetAllParameters = resetAllParameters;
        return this;
    }

    /**
     * <p>
     * A list of parameter names in the DB cluster parameter group to reset to
     * the default values. You can't use this parameter if the
     * <code>ResetAllParameters</code> parameter is enabled.
     * </p>
     *
     * @return <p>
     *         A list of parameter names in the DB cluster parameter group to
     *         reset to the default values. You can't use this parameter if the
     *         <code>ResetAllParameters</code> parameter is enabled.
     *         </p>
     */
    public java.util.List<Parameter> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * A list of parameter names in the DB cluster parameter group to reset to
     * the default values. You can't use this parameter if the
     * <code>ResetAllParameters</code> parameter is enabled.
     * </p>
     *
     * @param parameters <p>
     *            A list of parameter names in the DB cluster parameter group to
     *            reset to the default values. You can't use this parameter if
     *            the <code>ResetAllParameters</code> parameter is enabled.
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
     * A list of parameter names in the DB cluster parameter group to reset to
     * the default values. You can't use this parameter if the
     * <code>ResetAllParameters</code> parameter is enabled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parameters <p>
     *            A list of parameter names in the DB cluster parameter group to
     *            reset to the default values. You can't use this parameter if
     *            the <code>ResetAllParameters</code> parameter is enabled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResetDBClusterParameterGroupRequest withParameters(Parameter... parameters) {
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
     * A list of parameter names in the DB cluster parameter group to reset to
     * the default values. You can't use this parameter if the
     * <code>ResetAllParameters</code> parameter is enabled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parameters <p>
     *            A list of parameter names in the DB cluster parameter group to
     *            reset to the default values. You can't use this parameter if
     *            the <code>ResetAllParameters</code> parameter is enabled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResetDBClusterParameterGroupRequest withParameters(
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
        if (getResetAllParameters() != null)
            sb.append("ResetAllParameters: " + getResetAllParameters() + ",");
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
        hashCode = prime * hashCode
                + ((getResetAllParameters() == null) ? 0 : getResetAllParameters().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResetDBClusterParameterGroupRequest == false)
            return false;
        ResetDBClusterParameterGroupRequest other = (ResetDBClusterParameterGroupRequest) obj;

        if (other.getDBClusterParameterGroupName() == null
                ^ this.getDBClusterParameterGroupName() == null)
            return false;
        if (other.getDBClusterParameterGroupName() != null
                && other.getDBClusterParameterGroupName().equals(
                        this.getDBClusterParameterGroupName()) == false)
            return false;
        if (other.getResetAllParameters() == null ^ this.getResetAllParameters() == null)
            return false;
        if (other.getResetAllParameters() != null
                && other.getResetAllParameters().equals(this.getResetAllParameters()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null
                && other.getParameters().equals(this.getParameters()) == false)
            return false;
        return true;
    }
}
