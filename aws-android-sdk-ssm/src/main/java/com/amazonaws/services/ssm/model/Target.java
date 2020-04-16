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

package com.amazonaws.services.ssm.model;

import java.io.Serializable;

/**
 * <p>
 * An array of search criteria that targets instances using a Key,Value
 * combination that you specify.
 * </p>
 * <p>
 * Supported formats include the following.
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>Key=InstanceIds,Values=<i>instance-id-1</i>,<i>instance-id-2</i>,<i>instance-id-3</i> </code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>Key=tag:<i>my-tag-key</i>,Values=<i>my-tag-value-1</i>,<i>my-tag-value-2</i> </code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>Key=tag-key,Values=<i>my-tag-key-1</i>,<i>my-tag-key-2</i> </code>
 * </p>
 * </li>
 * <li>
 * <p>
 * (Maintenance window targets only)
 * <code>Key=resource-groups:Name,Values=<i>resource-group-name</i> </code>
 * </p>
 * </li>
 * <li>
 * <p>
 * (Maintenance window targets only)
 * <code>Key=resource-groups:ResourceTypeFilters,Values=<i>resource-type-1</i>,<i>resource-type-2</i> </code>
 * </p>
 * </li>
 * </ul>
 * <p>
 * For example:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>Key=InstanceIds,Values=i-02573cafcfEXAMPLE,i-0471e04240EXAMPLE,i-07782c72faEXAMPLE</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>Key=tag:CostCenter,Values=CostCenter1,CostCenter2,CostCenter3</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>Key=tag-key,Values=Name,Instance-Type,CostCenter</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * (Maintenance window targets only)
 * <code>Key=resource-groups:Name,Values=ProductionResourceGroup</code>
 * </p>
 * <p>
 * This example demonstrates how to target all resources in the resource group
 * <b>ProductionResourceGroup</b> in your maintenance window.
 * </p>
 * </li>
 * <li>
 * <p>
 * (Maintenance window targets only)
 * <code>Key=resource-groups:ResourceTypeFilters,Values=<i>AWS::EC2::INSTANCE</i>,<i>AWS::EC2::VPC</i> </code>
 * </p>
 * <p>
 * This example demonstrates how to target only Amazon EC2 instances and VPCs in
 * your maintenance window.
 * </p>
 * </li>
 * <li>
 * <p>
 * (State Manager association targets only)
 * <code>Key=InstanceIds,Values=<i>*</i> </code>
 * </p>
 * <p>
 * This example demonstrates how to target all managed instances in the AWS
 * Region where the association was created.
 * </p>
 * </li>
 * </ul>
 * <p>
 * For information about how to send commands that target instances using
 * <code>Key,Value</code> parameters, see <a href=
 * "https://docs.aws.amazon.com/systems-manager/latest/userguide/send-commands-multiple.html#send-commands-targeting"
 * >Using Targets and Rate Controls to Send Commands to a Fleet</a> in the
 * <i>AWS Systems Manager User Guide</i>.
 * </p>
 */
public class Target implements Serializable {
    /**
     * <p>
     * User-defined criteria for sending commands that target instances that
     * meet the criteria.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 163<br/>
     * <b>Pattern:
     * </b>^[\p{L}\p{Z}\p{N}_.:/=\-@]*$|resource-groups:ResourceTypeFilters
     * |resource-groups:Name<br/>
     */
    private String key;

    /**
     * <p>
     * User-defined criteria that maps to <code>Key</code>. For example, if you
     * specified <code>tag:ServerRole</code>, you could specify
     * <code>value:WebServer</code> to run a command on instances that include
     * Amazon EC2 tags of <code>ServerRole,WebServer</code>.
     * </p>
     */
    private java.util.List<String> values;

    /**
     * <p>
     * User-defined criteria for sending commands that target instances that
     * meet the criteria.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 163<br/>
     * <b>Pattern:
     * </b>^[\p{L}\p{Z}\p{N}_.:/=\-@]*$|resource-groups:ResourceTypeFilters
     * |resource-groups:Name<br/>
     *
     * @return <p>
     *         User-defined criteria for sending commands that target instances
     *         that meet the criteria.
     *         </p>
     */
    public String getKey() {
        return key;
    }

    /**
     * <p>
     * User-defined criteria for sending commands that target instances that
     * meet the criteria.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 163<br/>
     * <b>Pattern:
     * </b>^[\p{L}\p{Z}\p{N}_.:/=\-@]*$|resource-groups:ResourceTypeFilters
     * |resource-groups:Name<br/>
     *
     * @param key <p>
     *            User-defined criteria for sending commands that target
     *            instances that meet the criteria.
     *            </p>
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * User-defined criteria for sending commands that target instances that
     * meet the criteria.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 163<br/>
     * <b>Pattern:
     * </b>^[\p{L}\p{Z}\p{N}_.:/=\-@]*$|resource-groups:ResourceTypeFilters
     * |resource-groups:Name<br/>
     *
     * @param key <p>
     *            User-defined criteria for sending commands that target
     *            instances that meet the criteria.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Target withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * <p>
     * User-defined criteria that maps to <code>Key</code>. For example, if you
     * specified <code>tag:ServerRole</code>, you could specify
     * <code>value:WebServer</code> to run a command on instances that include
     * Amazon EC2 tags of <code>ServerRole,WebServer</code>.
     * </p>
     *
     * @return <p>
     *         User-defined criteria that maps to <code>Key</code>. For example,
     *         if you specified <code>tag:ServerRole</code>, you could specify
     *         <code>value:WebServer</code> to run a command on instances that
     *         include Amazon EC2 tags of <code>ServerRole,WebServer</code>.
     *         </p>
     */
    public java.util.List<String> getValues() {
        return values;
    }

    /**
     * <p>
     * User-defined criteria that maps to <code>Key</code>. For example, if you
     * specified <code>tag:ServerRole</code>, you could specify
     * <code>value:WebServer</code> to run a command on instances that include
     * Amazon EC2 tags of <code>ServerRole,WebServer</code>.
     * </p>
     *
     * @param values <p>
     *            User-defined criteria that maps to <code>Key</code>. For
     *            example, if you specified <code>tag:ServerRole</code>, you
     *            could specify <code>value:WebServer</code> to run a command on
     *            instances that include Amazon EC2 tags of
     *            <code>ServerRole,WebServer</code>.
     *            </p>
     */
    public void setValues(java.util.Collection<String> values) {
        if (values == null) {
            this.values = null;
            return;
        }

        this.values = new java.util.ArrayList<String>(values);
    }

    /**
     * <p>
     * User-defined criteria that maps to <code>Key</code>. For example, if you
     * specified <code>tag:ServerRole</code>, you could specify
     * <code>value:WebServer</code> to run a command on instances that include
     * Amazon EC2 tags of <code>ServerRole,WebServer</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param values <p>
     *            User-defined criteria that maps to <code>Key</code>. For
     *            example, if you specified <code>tag:ServerRole</code>, you
     *            could specify <code>value:WebServer</code> to run a command on
     *            instances that include Amazon EC2 tags of
     *            <code>ServerRole,WebServer</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Target withValues(String... values) {
        if (getValues() == null) {
            this.values = new java.util.ArrayList<String>(values.length);
        }
        for (String value : values) {
            this.values.add(value);
        }
        return this;
    }

    /**
     * <p>
     * User-defined criteria that maps to <code>Key</code>. For example, if you
     * specified <code>tag:ServerRole</code>, you could specify
     * <code>value:WebServer</code> to run a command on instances that include
     * Amazon EC2 tags of <code>ServerRole,WebServer</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param values <p>
     *            User-defined criteria that maps to <code>Key</code>. For
     *            example, if you specified <code>tag:ServerRole</code>, you
     *            could specify <code>value:WebServer</code> to run a command on
     *            instances that include Amazon EC2 tags of
     *            <code>ServerRole,WebServer</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Target withValues(java.util.Collection<String> values) {
        setValues(values);
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
        if (getKey() != null)
            sb.append("Key: " + getKey() + ",");
        if (getValues() != null)
            sb.append("Values: " + getValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Target == false)
            return false;
        Target other = (Target) obj;

        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getValues() == null ^ this.getValues() == null)
            return false;
        if (other.getValues() != null && other.getValues().equals(this.getValues()) == false)
            return false;
        return true;
    }
}
