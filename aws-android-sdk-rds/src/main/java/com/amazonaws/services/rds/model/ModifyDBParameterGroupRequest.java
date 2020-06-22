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
 * Modifies the parameters of a DB parameter group. To modify more than one
 * parameter, submit a list of the following: <code>ParameterName</code>,
 * <code>ParameterValue</code>, and <code>ApplyMethod</code>. A maximum of 20
 * parameters can be modified in a single request.
 * </p>
 * <note>
 * <p>
 * Changes to dynamic parameters are applied immediately. Changes to static
 * parameters require a reboot without failover to the DB instance associated
 * with the parameter group before the change can take effect.
 * </p>
 * </note> <important>
 * <p>
 * After you modify a DB parameter group, you should wait at least 5 minutes
 * before creating your first DB instance that uses that DB parameter group as
 * the default parameter group. This allows Amazon RDS to fully complete the
 * modify action before the parameter group is used as the default for a new DB
 * instance. This is especially important for parameters that are critical when
 * creating the default database for a DB instance, such as the character set
 * for the default database defined by the <code>character_set_database</code>
 * parameter. You can use the <i>Parameter Groups</i> option of the <a
 * href="https://console.aws.amazon.com/rds/">Amazon RDS console</a> or the
 * <i>DescribeDBParameters</i> command to verify that your DB parameter group
 * has been created or modified.
 * </p>
 * </important>
 */
public class ModifyDBParameterGroupRequest extends AmazonWebServiceRequest implements Serializable {
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
     * If supplied, must match the name of an existing
     * <code>DBParameterGroup</code>.
     * </p>
     * </li>
     * </ul>
     */
    private String dBParameterGroupName;

    /**
     * <p>
     * An array of parameter names, values, and the apply method for the
     * parameter update. At least one parameter name, value, and apply method
     * must be supplied; later arguments are optional. A maximum of 20
     * parameters can be modified in a single request.
     * </p>
     * <p>
     * Valid Values (for the application method):
     * <code>immediate | pending-reboot</code>
     * </p>
     * <note>
     * <p>
     * You can use the immediate value with dynamic parameters only. You can use
     * the pending-reboot value for both dynamic and static parameters, and
     * changes are applied when you reboot the DB instance without failover.
     * </p>
     * </note>
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
     * If supplied, must match the name of an existing
     * <code>DBParameterGroup</code>.
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
     *         If supplied, must match the name of an existing
     *         <code>DBParameterGroup</code>.
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
     * If supplied, must match the name of an existing
     * <code>DBParameterGroup</code>.
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
     *            If supplied, must match the name of an existing
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
     * If supplied, must match the name of an existing
     * <code>DBParameterGroup</code>.
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
     *            If supplied, must match the name of an existing
     *            <code>DBParameterGroup</code>.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyDBParameterGroupRequest withDBParameterGroupName(String dBParameterGroupName) {
        this.dBParameterGroupName = dBParameterGroupName;
        return this;
    }

    /**
     * <p>
     * An array of parameter names, values, and the apply method for the
     * parameter update. At least one parameter name, value, and apply method
     * must be supplied; later arguments are optional. A maximum of 20
     * parameters can be modified in a single request.
     * </p>
     * <p>
     * Valid Values (for the application method):
     * <code>immediate | pending-reboot</code>
     * </p>
     * <note>
     * <p>
     * You can use the immediate value with dynamic parameters only. You can use
     * the pending-reboot value for both dynamic and static parameters, and
     * changes are applied when you reboot the DB instance without failover.
     * </p>
     * </note>
     *
     * @return <p>
     *         An array of parameter names, values, and the apply method for the
     *         parameter update. At least one parameter name, value, and apply
     *         method must be supplied; later arguments are optional. A maximum
     *         of 20 parameters can be modified in a single request.
     *         </p>
     *         <p>
     *         Valid Values (for the application method):
     *         <code>immediate | pending-reboot</code>
     *         </p>
     *         <note>
     *         <p>
     *         You can use the immediate value with dynamic parameters only. You
     *         can use the pending-reboot value for both dynamic and static
     *         parameters, and changes are applied when you reboot the DB
     *         instance without failover.
     *         </p>
     *         </note>
     */
    public java.util.List<Parameter> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * An array of parameter names, values, and the apply method for the
     * parameter update. At least one parameter name, value, and apply method
     * must be supplied; later arguments are optional. A maximum of 20
     * parameters can be modified in a single request.
     * </p>
     * <p>
     * Valid Values (for the application method):
     * <code>immediate | pending-reboot</code>
     * </p>
     * <note>
     * <p>
     * You can use the immediate value with dynamic parameters only. You can use
     * the pending-reboot value for both dynamic and static parameters, and
     * changes are applied when you reboot the DB instance without failover.
     * </p>
     * </note>
     *
     * @param parameters <p>
     *            An array of parameter names, values, and the apply method for
     *            the parameter update. At least one parameter name, value, and
     *            apply method must be supplied; later arguments are optional. A
     *            maximum of 20 parameters can be modified in a single request.
     *            </p>
     *            <p>
     *            Valid Values (for the application method):
     *            <code>immediate | pending-reboot</code>
     *            </p>
     *            <note>
     *            <p>
     *            You can use the immediate value with dynamic parameters only.
     *            You can use the pending-reboot value for both dynamic and
     *            static parameters, and changes are applied when you reboot the
     *            DB instance without failover.
     *            </p>
     *            </note>
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
     * An array of parameter names, values, and the apply method for the
     * parameter update. At least one parameter name, value, and apply method
     * must be supplied; later arguments are optional. A maximum of 20
     * parameters can be modified in a single request.
     * </p>
     * <p>
     * Valid Values (for the application method):
     * <code>immediate | pending-reboot</code>
     * </p>
     * <note>
     * <p>
     * You can use the immediate value with dynamic parameters only. You can use
     * the pending-reboot value for both dynamic and static parameters, and
     * changes are applied when you reboot the DB instance without failover.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parameters <p>
     *            An array of parameter names, values, and the apply method for
     *            the parameter update. At least one parameter name, value, and
     *            apply method must be supplied; later arguments are optional. A
     *            maximum of 20 parameters can be modified in a single request.
     *            </p>
     *            <p>
     *            Valid Values (for the application method):
     *            <code>immediate | pending-reboot</code>
     *            </p>
     *            <note>
     *            <p>
     *            You can use the immediate value with dynamic parameters only.
     *            You can use the pending-reboot value for both dynamic and
     *            static parameters, and changes are applied when you reboot the
     *            DB instance without failover.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyDBParameterGroupRequest withParameters(Parameter... parameters) {
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
     * An array of parameter names, values, and the apply method for the
     * parameter update. At least one parameter name, value, and apply method
     * must be supplied; later arguments are optional. A maximum of 20
     * parameters can be modified in a single request.
     * </p>
     * <p>
     * Valid Values (for the application method):
     * <code>immediate | pending-reboot</code>
     * </p>
     * <note>
     * <p>
     * You can use the immediate value with dynamic parameters only. You can use
     * the pending-reboot value for both dynamic and static parameters, and
     * changes are applied when you reboot the DB instance without failover.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parameters <p>
     *            An array of parameter names, values, and the apply method for
     *            the parameter update. At least one parameter name, value, and
     *            apply method must be supplied; later arguments are optional. A
     *            maximum of 20 parameters can be modified in a single request.
     *            </p>
     *            <p>
     *            Valid Values (for the application method):
     *            <code>immediate | pending-reboot</code>
     *            </p>
     *            <note>
     *            <p>
     *            You can use the immediate value with dynamic parameters only.
     *            You can use the pending-reboot value for both dynamic and
     *            static parameters, and changes are applied when you reboot the
     *            DB instance without failover.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyDBParameterGroupRequest withParameters(java.util.Collection<Parameter> parameters) {
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
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyDBParameterGroupRequest == false)
            return false;
        ModifyDBParameterGroupRequest other = (ModifyDBParameterGroupRequest) obj;

        if (other.getDBParameterGroupName() == null ^ this.getDBParameterGroupName() == null)
            return false;
        if (other.getDBParameterGroupName() != null
                && other.getDBParameterGroupName().equals(this.getDBParameterGroupName()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null
                && other.getParameters().equals(this.getParameters()) == false)
            return false;
        return true;
    }
}
