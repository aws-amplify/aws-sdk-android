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
 * Sets one or more parameters of the specified parameter group to their default
 * values and sets the source values of the parameters to "engine-default". To
 * reset the entire parameter group specify the <i>ResetAllParameters</i>
 * parameter. For parameter changes to take effect you must reboot any
 * associated clusters.
 * </p>
 */
public class ResetClusterParameterGroupRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the cluster parameter group to be reset.
     * </p>
     */
    private String parameterGroupName;

    /**
     * <p>
     * If <code>true</code>, all parameters in the specified parameter group
     * will be reset to their default values.
     * </p>
     * <p>
     * Default: <code>true</code>
     * </p>
     */
    private Boolean resetAllParameters;

    /**
     * <p>
     * An array of names of parameters to be reset. If <i>ResetAllParameters</i>
     * option is not used, then at least one parameter name must be supplied.
     * </p>
     * <p>
     * Constraints: A maximum of 20 parameters can be reset in a single request.
     * </p>
     */
    private java.util.List<Parameter> parameters;

    /**
     * <p>
     * The name of the cluster parameter group to be reset.
     * </p>
     *
     * @return <p>
     *         The name of the cluster parameter group to be reset.
     *         </p>
     */
    public String getParameterGroupName() {
        return parameterGroupName;
    }

    /**
     * <p>
     * The name of the cluster parameter group to be reset.
     * </p>
     *
     * @param parameterGroupName <p>
     *            The name of the cluster parameter group to be reset.
     *            </p>
     */
    public void setParameterGroupName(String parameterGroupName) {
        this.parameterGroupName = parameterGroupName;
    }

    /**
     * <p>
     * The name of the cluster parameter group to be reset.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parameterGroupName <p>
     *            The name of the cluster parameter group to be reset.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResetClusterParameterGroupRequest withParameterGroupName(String parameterGroupName) {
        this.parameterGroupName = parameterGroupName;
        return this;
    }

    /**
     * <p>
     * If <code>true</code>, all parameters in the specified parameter group
     * will be reset to their default values.
     * </p>
     * <p>
     * Default: <code>true</code>
     * </p>
     *
     * @return <p>
     *         If <code>true</code>, all parameters in the specified parameter
     *         group will be reset to their default values.
     *         </p>
     *         <p>
     *         Default: <code>true</code>
     *         </p>
     */
    public Boolean isResetAllParameters() {
        return resetAllParameters;
    }

    /**
     * <p>
     * If <code>true</code>, all parameters in the specified parameter group
     * will be reset to their default values.
     * </p>
     * <p>
     * Default: <code>true</code>
     * </p>
     *
     * @return <p>
     *         If <code>true</code>, all parameters in the specified parameter
     *         group will be reset to their default values.
     *         </p>
     *         <p>
     *         Default: <code>true</code>
     *         </p>
     */
    public Boolean getResetAllParameters() {
        return resetAllParameters;
    }

    /**
     * <p>
     * If <code>true</code>, all parameters in the specified parameter group
     * will be reset to their default values.
     * </p>
     * <p>
     * Default: <code>true</code>
     * </p>
     *
     * @param resetAllParameters <p>
     *            If <code>true</code>, all parameters in the specified
     *            parameter group will be reset to their default values.
     *            </p>
     *            <p>
     *            Default: <code>true</code>
     *            </p>
     */
    public void setResetAllParameters(Boolean resetAllParameters) {
        this.resetAllParameters = resetAllParameters;
    }

    /**
     * <p>
     * If <code>true</code>, all parameters in the specified parameter group
     * will be reset to their default values.
     * </p>
     * <p>
     * Default: <code>true</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resetAllParameters <p>
     *            If <code>true</code>, all parameters in the specified
     *            parameter group will be reset to their default values.
     *            </p>
     *            <p>
     *            Default: <code>true</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResetClusterParameterGroupRequest withResetAllParameters(Boolean resetAllParameters) {
        this.resetAllParameters = resetAllParameters;
        return this;
    }

    /**
     * <p>
     * An array of names of parameters to be reset. If <i>ResetAllParameters</i>
     * option is not used, then at least one parameter name must be supplied.
     * </p>
     * <p>
     * Constraints: A maximum of 20 parameters can be reset in a single request.
     * </p>
     *
     * @return <p>
     *         An array of names of parameters to be reset. If
     *         <i>ResetAllParameters</i> option is not used, then at least one
     *         parameter name must be supplied.
     *         </p>
     *         <p>
     *         Constraints: A maximum of 20 parameters can be reset in a single
     *         request.
     *         </p>
     */
    public java.util.List<Parameter> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * An array of names of parameters to be reset. If <i>ResetAllParameters</i>
     * option is not used, then at least one parameter name must be supplied.
     * </p>
     * <p>
     * Constraints: A maximum of 20 parameters can be reset in a single request.
     * </p>
     *
     * @param parameters <p>
     *            An array of names of parameters to be reset. If
     *            <i>ResetAllParameters</i> option is not used, then at least
     *            one parameter name must be supplied.
     *            </p>
     *            <p>
     *            Constraints: A maximum of 20 parameters can be reset in a
     *            single request.
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
     * An array of names of parameters to be reset. If <i>ResetAllParameters</i>
     * option is not used, then at least one parameter name must be supplied.
     * </p>
     * <p>
     * Constraints: A maximum of 20 parameters can be reset in a single request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parameters <p>
     *            An array of names of parameters to be reset. If
     *            <i>ResetAllParameters</i> option is not used, then at least
     *            one parameter name must be supplied.
     *            </p>
     *            <p>
     *            Constraints: A maximum of 20 parameters can be reset in a
     *            single request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResetClusterParameterGroupRequest withParameters(Parameter... parameters) {
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
     * An array of names of parameters to be reset. If <i>ResetAllParameters</i>
     * option is not used, then at least one parameter name must be supplied.
     * </p>
     * <p>
     * Constraints: A maximum of 20 parameters can be reset in a single request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parameters <p>
     *            An array of names of parameters to be reset. If
     *            <i>ResetAllParameters</i> option is not used, then at least
     *            one parameter name must be supplied.
     *            </p>
     *            <p>
     *            Constraints: A maximum of 20 parameters can be reset in a
     *            single request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResetClusterParameterGroupRequest withParameters(
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
        if (getParameterGroupName() != null)
            sb.append("ParameterGroupName: " + getParameterGroupName() + ",");
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

        hashCode = prime * hashCode
                + ((getParameterGroupName() == null) ? 0 : getParameterGroupName().hashCode());
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

        if (obj instanceof ResetClusterParameterGroupRequest == false)
            return false;
        ResetClusterParameterGroupRequest other = (ResetClusterParameterGroupRequest) obj;

        if (other.getParameterGroupName() == null ^ this.getParameterGroupName() == null)
            return false;
        if (other.getParameterGroupName() != null
                && other.getParameterGroupName().equals(this.getParameterGroupName()) == false)
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
