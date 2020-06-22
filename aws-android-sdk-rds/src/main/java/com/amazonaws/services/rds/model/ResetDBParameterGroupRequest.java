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
 * Modifies the parameters of a DB parameter group to the engine/system default
 * value. To reset specific parameters, provide a list of the following:
 * <code>ParameterName</code> and <code>ApplyMethod</code>. To reset the entire
 * DB parameter group, specify the <code>DBParameterGroup</code> name and
 * <code>ResetAllParameters</code> parameters. When resetting the entire group,
 * dynamic parameters are updated immediately and static parameters are set to
 * <code>pending-reboot</code> to take effect on the next DB instance restart or
 * <code>RebootDBInstance</code> request.
 * </p>
 */
public class ResetDBParameterGroupRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the DB parameter group.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the name of an existing <code>DBParameterGroup</code>.
     * </p>
     * </li>
     * </ul>
     */
    private String dBParameterGroupName;

    /**
     * <p>
     * A value that indicates whether to reset all parameters in the DB
     * parameter group to default values. By default, all parameters in the DB
     * parameter group are reset to default values.
     * </p>
     */
    private Boolean resetAllParameters;

    /**
     * <p>
     * To reset the entire DB parameter group, specify the
     * <code>DBParameterGroup</code> name and <code>ResetAllParameters</code>
     * parameters. To reset specific parameters, provide a list of the
     * following: <code>ParameterName</code> and <code>ApplyMethod</code>. A
     * maximum of 20 parameters can be modified in a single request.
     * </p>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <p>
     * Valid Values (for Apply method): <code>immediate</code> |
     * <code>pending-reboot</code>
     * </p>
     * <p>
     * You can use the immediate value with dynamic parameters only. You can use
     * the <code>pending-reboot</code> value for both dynamic and static
     * parameters, and changes are applied when DB instance reboots.
     * </p>
     * <p>
     * <b>MariaDB</b>
     * </p>
     * <p>
     * Valid Values (for Apply method): <code>immediate</code> |
     * <code>pending-reboot</code>
     * </p>
     * <p>
     * You can use the immediate value with dynamic parameters only. You can use
     * the <code>pending-reboot</code> value for both dynamic and static
     * parameters, and changes are applied when DB instance reboots.
     * </p>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <p>
     * Valid Values (for Apply method): <code>pending-reboot</code>
     * </p>
     */
    private java.util.List<Parameter> parameters;

    /**
     * <p>
     * The name of the DB parameter group.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the name of an existing <code>DBParameterGroup</code>.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The name of the DB parameter group.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must match the name of an existing <code>DBParameterGroup</code>.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getDBParameterGroupName() {
        return dBParameterGroupName;
    }

    /**
     * <p>
     * The name of the DB parameter group.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the name of an existing <code>DBParameterGroup</code>.
     * </p>
     * </li>
     * </ul>
     *
     * @param dBParameterGroupName <p>
     *            The name of the DB parameter group.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must match the name of an existing
     *            <code>DBParameterGroup</code>.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setDBParameterGroupName(String dBParameterGroupName) {
        this.dBParameterGroupName = dBParameterGroupName;
    }

    /**
     * <p>
     * The name of the DB parameter group.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the name of an existing <code>DBParameterGroup</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBParameterGroupName <p>
     *            The name of the DB parameter group.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must match the name of an existing
     *            <code>DBParameterGroup</code>.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResetDBParameterGroupRequest withDBParameterGroupName(String dBParameterGroupName) {
        this.dBParameterGroupName = dBParameterGroupName;
        return this;
    }

    /**
     * <p>
     * A value that indicates whether to reset all parameters in the DB
     * parameter group to default values. By default, all parameters in the DB
     * parameter group are reset to default values.
     * </p>
     *
     * @return <p>
     *         A value that indicates whether to reset all parameters in the DB
     *         parameter group to default values. By default, all parameters in
     *         the DB parameter group are reset to default values.
     *         </p>
     */
    public Boolean isResetAllParameters() {
        return resetAllParameters;
    }

    /**
     * <p>
     * A value that indicates whether to reset all parameters in the DB
     * parameter group to default values. By default, all parameters in the DB
     * parameter group are reset to default values.
     * </p>
     *
     * @return <p>
     *         A value that indicates whether to reset all parameters in the DB
     *         parameter group to default values. By default, all parameters in
     *         the DB parameter group are reset to default values.
     *         </p>
     */
    public Boolean getResetAllParameters() {
        return resetAllParameters;
    }

    /**
     * <p>
     * A value that indicates whether to reset all parameters in the DB
     * parameter group to default values. By default, all parameters in the DB
     * parameter group are reset to default values.
     * </p>
     *
     * @param resetAllParameters <p>
     *            A value that indicates whether to reset all parameters in the
     *            DB parameter group to default values. By default, all
     *            parameters in the DB parameter group are reset to default
     *            values.
     *            </p>
     */
    public void setResetAllParameters(Boolean resetAllParameters) {
        this.resetAllParameters = resetAllParameters;
    }

    /**
     * <p>
     * A value that indicates whether to reset all parameters in the DB
     * parameter group to default values. By default, all parameters in the DB
     * parameter group are reset to default values.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resetAllParameters <p>
     *            A value that indicates whether to reset all parameters in the
     *            DB parameter group to default values. By default, all
     *            parameters in the DB parameter group are reset to default
     *            values.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResetDBParameterGroupRequest withResetAllParameters(Boolean resetAllParameters) {
        this.resetAllParameters = resetAllParameters;
        return this;
    }

    /**
     * <p>
     * To reset the entire DB parameter group, specify the
     * <code>DBParameterGroup</code> name and <code>ResetAllParameters</code>
     * parameters. To reset specific parameters, provide a list of the
     * following: <code>ParameterName</code> and <code>ApplyMethod</code>. A
     * maximum of 20 parameters can be modified in a single request.
     * </p>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <p>
     * Valid Values (for Apply method): <code>immediate</code> |
     * <code>pending-reboot</code>
     * </p>
     * <p>
     * You can use the immediate value with dynamic parameters only. You can use
     * the <code>pending-reboot</code> value for both dynamic and static
     * parameters, and changes are applied when DB instance reboots.
     * </p>
     * <p>
     * <b>MariaDB</b>
     * </p>
     * <p>
     * Valid Values (for Apply method): <code>immediate</code> |
     * <code>pending-reboot</code>
     * </p>
     * <p>
     * You can use the immediate value with dynamic parameters only. You can use
     * the <code>pending-reboot</code> value for both dynamic and static
     * parameters, and changes are applied when DB instance reboots.
     * </p>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <p>
     * Valid Values (for Apply method): <code>pending-reboot</code>
     * </p>
     *
     * @return <p>
     *         To reset the entire DB parameter group, specify the
     *         <code>DBParameterGroup</code> name and
     *         <code>ResetAllParameters</code> parameters. To reset specific
     *         parameters, provide a list of the following:
     *         <code>ParameterName</code> and <code>ApplyMethod</code>. A
     *         maximum of 20 parameters can be modified in a single request.
     *         </p>
     *         <p>
     *         <b>MySQL</b>
     *         </p>
     *         <p>
     *         Valid Values (for Apply method): <code>immediate</code> |
     *         <code>pending-reboot</code>
     *         </p>
     *         <p>
     *         You can use the immediate value with dynamic parameters only. You
     *         can use the <code>pending-reboot</code> value for both dynamic
     *         and static parameters, and changes are applied when DB instance
     *         reboots.
     *         </p>
     *         <p>
     *         <b>MariaDB</b>
     *         </p>
     *         <p>
     *         Valid Values (for Apply method): <code>immediate</code> |
     *         <code>pending-reboot</code>
     *         </p>
     *         <p>
     *         You can use the immediate value with dynamic parameters only. You
     *         can use the <code>pending-reboot</code> value for both dynamic
     *         and static parameters, and changes are applied when DB instance
     *         reboots.
     *         </p>
     *         <p>
     *         <b>Oracle</b>
     *         </p>
     *         <p>
     *         Valid Values (for Apply method): <code>pending-reboot</code>
     *         </p>
     */
    public java.util.List<Parameter> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * To reset the entire DB parameter group, specify the
     * <code>DBParameterGroup</code> name and <code>ResetAllParameters</code>
     * parameters. To reset specific parameters, provide a list of the
     * following: <code>ParameterName</code> and <code>ApplyMethod</code>. A
     * maximum of 20 parameters can be modified in a single request.
     * </p>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <p>
     * Valid Values (for Apply method): <code>immediate</code> |
     * <code>pending-reboot</code>
     * </p>
     * <p>
     * You can use the immediate value with dynamic parameters only. You can use
     * the <code>pending-reboot</code> value for both dynamic and static
     * parameters, and changes are applied when DB instance reboots.
     * </p>
     * <p>
     * <b>MariaDB</b>
     * </p>
     * <p>
     * Valid Values (for Apply method): <code>immediate</code> |
     * <code>pending-reboot</code>
     * </p>
     * <p>
     * You can use the immediate value with dynamic parameters only. You can use
     * the <code>pending-reboot</code> value for both dynamic and static
     * parameters, and changes are applied when DB instance reboots.
     * </p>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <p>
     * Valid Values (for Apply method): <code>pending-reboot</code>
     * </p>
     *
     * @param parameters <p>
     *            To reset the entire DB parameter group, specify the
     *            <code>DBParameterGroup</code> name and
     *            <code>ResetAllParameters</code> parameters. To reset specific
     *            parameters, provide a list of the following:
     *            <code>ParameterName</code> and <code>ApplyMethod</code>. A
     *            maximum of 20 parameters can be modified in a single request.
     *            </p>
     *            <p>
     *            <b>MySQL</b>
     *            </p>
     *            <p>
     *            Valid Values (for Apply method): <code>immediate</code> |
     *            <code>pending-reboot</code>
     *            </p>
     *            <p>
     *            You can use the immediate value with dynamic parameters only.
     *            You can use the <code>pending-reboot</code> value for both
     *            dynamic and static parameters, and changes are applied when DB
     *            instance reboots.
     *            </p>
     *            <p>
     *            <b>MariaDB</b>
     *            </p>
     *            <p>
     *            Valid Values (for Apply method): <code>immediate</code> |
     *            <code>pending-reboot</code>
     *            </p>
     *            <p>
     *            You can use the immediate value with dynamic parameters only.
     *            You can use the <code>pending-reboot</code> value for both
     *            dynamic and static parameters, and changes are applied when DB
     *            instance reboots.
     *            </p>
     *            <p>
     *            <b>Oracle</b>
     *            </p>
     *            <p>
     *            Valid Values (for Apply method): <code>pending-reboot</code>
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
     * To reset the entire DB parameter group, specify the
     * <code>DBParameterGroup</code> name and <code>ResetAllParameters</code>
     * parameters. To reset specific parameters, provide a list of the
     * following: <code>ParameterName</code> and <code>ApplyMethod</code>. A
     * maximum of 20 parameters can be modified in a single request.
     * </p>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <p>
     * Valid Values (for Apply method): <code>immediate</code> |
     * <code>pending-reboot</code>
     * </p>
     * <p>
     * You can use the immediate value with dynamic parameters only. You can use
     * the <code>pending-reboot</code> value for both dynamic and static
     * parameters, and changes are applied when DB instance reboots.
     * </p>
     * <p>
     * <b>MariaDB</b>
     * </p>
     * <p>
     * Valid Values (for Apply method): <code>immediate</code> |
     * <code>pending-reboot</code>
     * </p>
     * <p>
     * You can use the immediate value with dynamic parameters only. You can use
     * the <code>pending-reboot</code> value for both dynamic and static
     * parameters, and changes are applied when DB instance reboots.
     * </p>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <p>
     * Valid Values (for Apply method): <code>pending-reboot</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parameters <p>
     *            To reset the entire DB parameter group, specify the
     *            <code>DBParameterGroup</code> name and
     *            <code>ResetAllParameters</code> parameters. To reset specific
     *            parameters, provide a list of the following:
     *            <code>ParameterName</code> and <code>ApplyMethod</code>. A
     *            maximum of 20 parameters can be modified in a single request.
     *            </p>
     *            <p>
     *            <b>MySQL</b>
     *            </p>
     *            <p>
     *            Valid Values (for Apply method): <code>immediate</code> |
     *            <code>pending-reboot</code>
     *            </p>
     *            <p>
     *            You can use the immediate value with dynamic parameters only.
     *            You can use the <code>pending-reboot</code> value for both
     *            dynamic and static parameters, and changes are applied when DB
     *            instance reboots.
     *            </p>
     *            <p>
     *            <b>MariaDB</b>
     *            </p>
     *            <p>
     *            Valid Values (for Apply method): <code>immediate</code> |
     *            <code>pending-reboot</code>
     *            </p>
     *            <p>
     *            You can use the immediate value with dynamic parameters only.
     *            You can use the <code>pending-reboot</code> value for both
     *            dynamic and static parameters, and changes are applied when DB
     *            instance reboots.
     *            </p>
     *            <p>
     *            <b>Oracle</b>
     *            </p>
     *            <p>
     *            Valid Values (for Apply method): <code>pending-reboot</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResetDBParameterGroupRequest withParameters(Parameter... parameters) {
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
     * To reset the entire DB parameter group, specify the
     * <code>DBParameterGroup</code> name and <code>ResetAllParameters</code>
     * parameters. To reset specific parameters, provide a list of the
     * following: <code>ParameterName</code> and <code>ApplyMethod</code>. A
     * maximum of 20 parameters can be modified in a single request.
     * </p>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <p>
     * Valid Values (for Apply method): <code>immediate</code> |
     * <code>pending-reboot</code>
     * </p>
     * <p>
     * You can use the immediate value with dynamic parameters only. You can use
     * the <code>pending-reboot</code> value for both dynamic and static
     * parameters, and changes are applied when DB instance reboots.
     * </p>
     * <p>
     * <b>MariaDB</b>
     * </p>
     * <p>
     * Valid Values (for Apply method): <code>immediate</code> |
     * <code>pending-reboot</code>
     * </p>
     * <p>
     * You can use the immediate value with dynamic parameters only. You can use
     * the <code>pending-reboot</code> value for both dynamic and static
     * parameters, and changes are applied when DB instance reboots.
     * </p>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <p>
     * Valid Values (for Apply method): <code>pending-reboot</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parameters <p>
     *            To reset the entire DB parameter group, specify the
     *            <code>DBParameterGroup</code> name and
     *            <code>ResetAllParameters</code> parameters. To reset specific
     *            parameters, provide a list of the following:
     *            <code>ParameterName</code> and <code>ApplyMethod</code>. A
     *            maximum of 20 parameters can be modified in a single request.
     *            </p>
     *            <p>
     *            <b>MySQL</b>
     *            </p>
     *            <p>
     *            Valid Values (for Apply method): <code>immediate</code> |
     *            <code>pending-reboot</code>
     *            </p>
     *            <p>
     *            You can use the immediate value with dynamic parameters only.
     *            You can use the <code>pending-reboot</code> value for both
     *            dynamic and static parameters, and changes are applied when DB
     *            instance reboots.
     *            </p>
     *            <p>
     *            <b>MariaDB</b>
     *            </p>
     *            <p>
     *            Valid Values (for Apply method): <code>immediate</code> |
     *            <code>pending-reboot</code>
     *            </p>
     *            <p>
     *            You can use the immediate value with dynamic parameters only.
     *            You can use the <code>pending-reboot</code> value for both
     *            dynamic and static parameters, and changes are applied when DB
     *            instance reboots.
     *            </p>
     *            <p>
     *            <b>Oracle</b>
     *            </p>
     *            <p>
     *            Valid Values (for Apply method): <code>pending-reboot</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResetDBParameterGroupRequest withParameters(java.util.Collection<Parameter> parameters) {
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
        if (getDBParameterGroupName() != null)
            sb.append("DBParameterGroupName: " + getDBParameterGroupName() + ",");
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
                + ((getDBParameterGroupName() == null) ? 0 : getDBParameterGroupName().hashCode());
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

        if (obj instanceof ResetDBParameterGroupRequest == false)
            return false;
        ResetDBParameterGroupRequest other = (ResetDBParameterGroupRequest) obj;

        if (other.getDBParameterGroupName() == null ^ this.getDBParameterGroupName() == null)
            return false;
        if (other.getDBParameterGroupName() != null
                && other.getDBParameterGroupName().equals(this.getDBParameterGroupName()) == false)
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
