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
 * Modifies the parameters of a parameter group.
 * </p>
 * <p>
 * For more information about parameters and parameter groups, go to <a href=
 * "https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html"
 * >Amazon Redshift Parameter Groups</a> in the <i>Amazon Redshift Cluster
 * Management Guide</i>.
 * </p>
 */
public class ModifyClusterParameterGroupRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the parameter group to be modified.
     * </p>
     */
    private String parameterGroupName;

    /**
     * <p>
     * An array of parameters to be modified. A maximum of 20 parameters can be
     * modified in a single request.
     * </p>
     * <p>
     * For each parameter to be modified, you must supply at least the parameter
     * name and parameter value; other name-value pairs of the parameter are
     * optional.
     * </p>
     * <p>
     * For the workload management (WLM) configuration, you must supply all the
     * name-value pairs in the wlm_json_configuration parameter.
     * </p>
     */
    private java.util.List<Parameter> parameters;

    /**
     * <p>
     * The name of the parameter group to be modified.
     * </p>
     *
     * @return <p>
     *         The name of the parameter group to be modified.
     *         </p>
     */
    public String getParameterGroupName() {
        return parameterGroupName;
    }

    /**
     * <p>
     * The name of the parameter group to be modified.
     * </p>
     *
     * @param parameterGroupName <p>
     *            The name of the parameter group to be modified.
     *            </p>
     */
    public void setParameterGroupName(String parameterGroupName) {
        this.parameterGroupName = parameterGroupName;
    }

    /**
     * <p>
     * The name of the parameter group to be modified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parameterGroupName <p>
     *            The name of the parameter group to be modified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyClusterParameterGroupRequest withParameterGroupName(String parameterGroupName) {
        this.parameterGroupName = parameterGroupName;
        return this;
    }

    /**
     * <p>
     * An array of parameters to be modified. A maximum of 20 parameters can be
     * modified in a single request.
     * </p>
     * <p>
     * For each parameter to be modified, you must supply at least the parameter
     * name and parameter value; other name-value pairs of the parameter are
     * optional.
     * </p>
     * <p>
     * For the workload management (WLM) configuration, you must supply all the
     * name-value pairs in the wlm_json_configuration parameter.
     * </p>
     *
     * @return <p>
     *         An array of parameters to be modified. A maximum of 20 parameters
     *         can be modified in a single request.
     *         </p>
     *         <p>
     *         For each parameter to be modified, you must supply at least the
     *         parameter name and parameter value; other name-value pairs of the
     *         parameter are optional.
     *         </p>
     *         <p>
     *         For the workload management (WLM) configuration, you must supply
     *         all the name-value pairs in the wlm_json_configuration parameter.
     *         </p>
     */
    public java.util.List<Parameter> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * An array of parameters to be modified. A maximum of 20 parameters can be
     * modified in a single request.
     * </p>
     * <p>
     * For each parameter to be modified, you must supply at least the parameter
     * name and parameter value; other name-value pairs of the parameter are
     * optional.
     * </p>
     * <p>
     * For the workload management (WLM) configuration, you must supply all the
     * name-value pairs in the wlm_json_configuration parameter.
     * </p>
     *
     * @param parameters <p>
     *            An array of parameters to be modified. A maximum of 20
     *            parameters can be modified in a single request.
     *            </p>
     *            <p>
     *            For each parameter to be modified, you must supply at least
     *            the parameter name and parameter value; other name-value pairs
     *            of the parameter are optional.
     *            </p>
     *            <p>
     *            For the workload management (WLM) configuration, you must
     *            supply all the name-value pairs in the wlm_json_configuration
     *            parameter.
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
     * An array of parameters to be modified. A maximum of 20 parameters can be
     * modified in a single request.
     * </p>
     * <p>
     * For each parameter to be modified, you must supply at least the parameter
     * name and parameter value; other name-value pairs of the parameter are
     * optional.
     * </p>
     * <p>
     * For the workload management (WLM) configuration, you must supply all the
     * name-value pairs in the wlm_json_configuration parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parameters <p>
     *            An array of parameters to be modified. A maximum of 20
     *            parameters can be modified in a single request.
     *            </p>
     *            <p>
     *            For each parameter to be modified, you must supply at least
     *            the parameter name and parameter value; other name-value pairs
     *            of the parameter are optional.
     *            </p>
     *            <p>
     *            For the workload management (WLM) configuration, you must
     *            supply all the name-value pairs in the wlm_json_configuration
     *            parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyClusterParameterGroupRequest withParameters(Parameter... parameters) {
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
     * An array of parameters to be modified. A maximum of 20 parameters can be
     * modified in a single request.
     * </p>
     * <p>
     * For each parameter to be modified, you must supply at least the parameter
     * name and parameter value; other name-value pairs of the parameter are
     * optional.
     * </p>
     * <p>
     * For the workload management (WLM) configuration, you must supply all the
     * name-value pairs in the wlm_json_configuration parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parameters <p>
     *            An array of parameters to be modified. A maximum of 20
     *            parameters can be modified in a single request.
     *            </p>
     *            <p>
     *            For each parameter to be modified, you must supply at least
     *            the parameter name and parameter value; other name-value pairs
     *            of the parameter are optional.
     *            </p>
     *            <p>
     *            For the workload management (WLM) configuration, you must
     *            supply all the name-value pairs in the wlm_json_configuration
     *            parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyClusterParameterGroupRequest withParameters(
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
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyClusterParameterGroupRequest == false)
            return false;
        ModifyClusterParameterGroupRequest other = (ModifyClusterParameterGroupRequest) obj;

        if (other.getParameterGroupName() == null ^ this.getParameterGroupName() == null)
            return false;
        if (other.getParameterGroupName() != null
                && other.getParameterGroupName().equals(this.getParameterGroupName()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null
                && other.getParameters().equals(this.getParameters()) == false)
            return false;
        return true;
    }
}
