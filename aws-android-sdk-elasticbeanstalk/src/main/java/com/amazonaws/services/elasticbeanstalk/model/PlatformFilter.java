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

package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;

/**
 * <p>
 * Describes criteria to restrict the results when listing platform versions.
 * </p>
 * <p>
 * The filter is evaluated as follows: <code>Type Operator Values[1]</code>
 * </p>
 */
public class PlatformFilter implements Serializable {
    /**
     * <p>
     * The platform version attribute to which the filter values are applied.
     * </p>
     * <p>
     * Valid values: <code>PlatformName</code> | <code>PlatformVersion</code> |
     * <code>PlatformStatus</code> | <code>PlatformBranchName</code> |
     * <code>PlatformLifecycleState</code> | <code>PlatformOwner</code> |
     * <code>SupportedTier</code> | <code>SupportedAddon</code> |
     * <code>ProgrammingLanguageName</code> | <code>OperatingSystemName</code>
     * </p>
     */
    private String type;

    /**
     * <p>
     * The operator to apply to the <code>Type</code> with each of the
     * <code>Values</code>.
     * </p>
     * <p>
     * Valid values: <code>=</code> | <code>!=</code> | <code>&lt;</code> |
     * <code>&lt;=</code> | <code>&gt;</code> | <code>&gt;=</code> |
     * <code>contains</code> | <code>begins_with</code> | <code>ends_with</code>
     * </p>
     */
    private String operator;

    /**
     * <p>
     * The list of values applied to the filtering platform version attribute.
     * Only one value is supported for all current operators.
     * </p>
     * <p>
     * The following list shows valid filter values for some filter attributes.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PlatformStatus</code>: <code>Creating</code> | <code>Failed</code>
     * | <code>Ready</code> | <code>Deleting</code> | <code>Deleted</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PlatformLifecycleState</code>: <code>recommended</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SupportedTier</code>: <code>WebServer/Standard</code> |
     * <code>Worker/SQS/HTTP</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SupportedAddon</code>: <code>Log/S3</code> |
     * <code>Monitoring/Healthd</code> | <code>WorkerDaemon/SQSD</code>
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<String> values;

    /**
     * <p>
     * The platform version attribute to which the filter values are applied.
     * </p>
     * <p>
     * Valid values: <code>PlatformName</code> | <code>PlatformVersion</code> |
     * <code>PlatformStatus</code> | <code>PlatformBranchName</code> |
     * <code>PlatformLifecycleState</code> | <code>PlatformOwner</code> |
     * <code>SupportedTier</code> | <code>SupportedAddon</code> |
     * <code>ProgrammingLanguageName</code> | <code>OperatingSystemName</code>
     * </p>
     *
     * @return <p>
     *         The platform version attribute to which the filter values are
     *         applied.
     *         </p>
     *         <p>
     *         Valid values: <code>PlatformName</code> |
     *         <code>PlatformVersion</code> | <code>PlatformStatus</code> |
     *         <code>PlatformBranchName</code> |
     *         <code>PlatformLifecycleState</code> | <code>PlatformOwner</code>
     *         | <code>SupportedTier</code> | <code>SupportedAddon</code> |
     *         <code>ProgrammingLanguageName</code> |
     *         <code>OperatingSystemName</code>
     *         </p>
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The platform version attribute to which the filter values are applied.
     * </p>
     * <p>
     * Valid values: <code>PlatformName</code> | <code>PlatformVersion</code> |
     * <code>PlatformStatus</code> | <code>PlatformBranchName</code> |
     * <code>PlatformLifecycleState</code> | <code>PlatformOwner</code> |
     * <code>SupportedTier</code> | <code>SupportedAddon</code> |
     * <code>ProgrammingLanguageName</code> | <code>OperatingSystemName</code>
     * </p>
     *
     * @param type <p>
     *            The platform version attribute to which the filter values are
     *            applied.
     *            </p>
     *            <p>
     *            Valid values: <code>PlatformName</code> |
     *            <code>PlatformVersion</code> | <code>PlatformStatus</code> |
     *            <code>PlatformBranchName</code> |
     *            <code>PlatformLifecycleState</code> |
     *            <code>PlatformOwner</code> | <code>SupportedTier</code> |
     *            <code>SupportedAddon</code> |
     *            <code>ProgrammingLanguageName</code> |
     *            <code>OperatingSystemName</code>
     *            </p>
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The platform version attribute to which the filter values are applied.
     * </p>
     * <p>
     * Valid values: <code>PlatformName</code> | <code>PlatformVersion</code> |
     * <code>PlatformStatus</code> | <code>PlatformBranchName</code> |
     * <code>PlatformLifecycleState</code> | <code>PlatformOwner</code> |
     * <code>SupportedTier</code> | <code>SupportedAddon</code> |
     * <code>ProgrammingLanguageName</code> | <code>OperatingSystemName</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param type <p>
     *            The platform version attribute to which the filter values are
     *            applied.
     *            </p>
     *            <p>
     *            Valid values: <code>PlatformName</code> |
     *            <code>PlatformVersion</code> | <code>PlatformStatus</code> |
     *            <code>PlatformBranchName</code> |
     *            <code>PlatformLifecycleState</code> |
     *            <code>PlatformOwner</code> | <code>SupportedTier</code> |
     *            <code>SupportedAddon</code> |
     *            <code>ProgrammingLanguageName</code> |
     *            <code>OperatingSystemName</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PlatformFilter withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The operator to apply to the <code>Type</code> with each of the
     * <code>Values</code>.
     * </p>
     * <p>
     * Valid values: <code>=</code> | <code>!=</code> | <code>&lt;</code> |
     * <code>&lt;=</code> | <code>&gt;</code> | <code>&gt;=</code> |
     * <code>contains</code> | <code>begins_with</code> | <code>ends_with</code>
     * </p>
     *
     * @return <p>
     *         The operator to apply to the <code>Type</code> with each of the
     *         <code>Values</code>.
     *         </p>
     *         <p>
     *         Valid values: <code>=</code> | <code>!=</code> |
     *         <code>&lt;</code> | <code>&lt;=</code> | <code>&gt;</code> |
     *         <code>&gt;=</code> | <code>contains</code> |
     *         <code>begins_with</code> | <code>ends_with</code>
     *         </p>
     */
    public String getOperator() {
        return operator;
    }

    /**
     * <p>
     * The operator to apply to the <code>Type</code> with each of the
     * <code>Values</code>.
     * </p>
     * <p>
     * Valid values: <code>=</code> | <code>!=</code> | <code>&lt;</code> |
     * <code>&lt;=</code> | <code>&gt;</code> | <code>&gt;=</code> |
     * <code>contains</code> | <code>begins_with</code> | <code>ends_with</code>
     * </p>
     *
     * @param operator <p>
     *            The operator to apply to the <code>Type</code> with each of
     *            the <code>Values</code>.
     *            </p>
     *            <p>
     *            Valid values: <code>=</code> | <code>!=</code> |
     *            <code>&lt;</code> | <code>&lt;=</code> | <code>&gt;</code> |
     *            <code>&gt;=</code> | <code>contains</code> |
     *            <code>begins_with</code> | <code>ends_with</code>
     *            </p>
     */
    public void setOperator(String operator) {
        this.operator = operator;
    }

    /**
     * <p>
     * The operator to apply to the <code>Type</code> with each of the
     * <code>Values</code>.
     * </p>
     * <p>
     * Valid values: <code>=</code> | <code>!=</code> | <code>&lt;</code> |
     * <code>&lt;=</code> | <code>&gt;</code> | <code>&gt;=</code> |
     * <code>contains</code> | <code>begins_with</code> | <code>ends_with</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param operator <p>
     *            The operator to apply to the <code>Type</code> with each of
     *            the <code>Values</code>.
     *            </p>
     *            <p>
     *            Valid values: <code>=</code> | <code>!=</code> |
     *            <code>&lt;</code> | <code>&lt;=</code> | <code>&gt;</code> |
     *            <code>&gt;=</code> | <code>contains</code> |
     *            <code>begins_with</code> | <code>ends_with</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PlatformFilter withOperator(String operator) {
        this.operator = operator;
        return this;
    }

    /**
     * <p>
     * The list of values applied to the filtering platform version attribute.
     * Only one value is supported for all current operators.
     * </p>
     * <p>
     * The following list shows valid filter values for some filter attributes.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PlatformStatus</code>: <code>Creating</code> | <code>Failed</code>
     * | <code>Ready</code> | <code>Deleting</code> | <code>Deleted</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PlatformLifecycleState</code>: <code>recommended</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SupportedTier</code>: <code>WebServer/Standard</code> |
     * <code>Worker/SQS/HTTP</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SupportedAddon</code>: <code>Log/S3</code> |
     * <code>Monitoring/Healthd</code> | <code>WorkerDaemon/SQSD</code>
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The list of values applied to the filtering platform version
     *         attribute. Only one value is supported for all current operators.
     *         </p>
     *         <p>
     *         The following list shows valid filter values for some filter
     *         attributes.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>PlatformStatus</code>: <code>Creating</code> |
     *         <code>Failed</code> | <code>Ready</code> | <code>Deleting</code>
     *         | <code>Deleted</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PlatformLifecycleState</code>: <code>recommended</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SupportedTier</code>: <code>WebServer/Standard</code> |
     *         <code>Worker/SQS/HTTP</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SupportedAddon</code>: <code>Log/S3</code> |
     *         <code>Monitoring/Healthd</code> | <code>WorkerDaemon/SQSD</code>
     *         </p>
     *         </li>
     *         </ul>
     */
    public java.util.List<String> getValues() {
        return values;
    }

    /**
     * <p>
     * The list of values applied to the filtering platform version attribute.
     * Only one value is supported for all current operators.
     * </p>
     * <p>
     * The following list shows valid filter values for some filter attributes.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PlatformStatus</code>: <code>Creating</code> | <code>Failed</code>
     * | <code>Ready</code> | <code>Deleting</code> | <code>Deleted</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PlatformLifecycleState</code>: <code>recommended</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SupportedTier</code>: <code>WebServer/Standard</code> |
     * <code>Worker/SQS/HTTP</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SupportedAddon</code>: <code>Log/S3</code> |
     * <code>Monitoring/Healthd</code> | <code>WorkerDaemon/SQSD</code>
     * </p>
     * </li>
     * </ul>
     *
     * @param values <p>
     *            The list of values applied to the filtering platform version
     *            attribute. Only one value is supported for all current
     *            operators.
     *            </p>
     *            <p>
     *            The following list shows valid filter values for some filter
     *            attributes.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>PlatformStatus</code>: <code>Creating</code> |
     *            <code>Failed</code> | <code>Ready</code> |
     *            <code>Deleting</code> | <code>Deleted</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>PlatformLifecycleState</code>: <code>recommended</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SupportedTier</code>: <code>WebServer/Standard</code> |
     *            <code>Worker/SQS/HTTP</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SupportedAddon</code>: <code>Log/S3</code> |
     *            <code>Monitoring/Healthd</code> |
     *            <code>WorkerDaemon/SQSD</code>
     *            </p>
     *            </li>
     *            </ul>
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
     * The list of values applied to the filtering platform version attribute.
     * Only one value is supported for all current operators.
     * </p>
     * <p>
     * The following list shows valid filter values for some filter attributes.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PlatformStatus</code>: <code>Creating</code> | <code>Failed</code>
     * | <code>Ready</code> | <code>Deleting</code> | <code>Deleted</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PlatformLifecycleState</code>: <code>recommended</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SupportedTier</code>: <code>WebServer/Standard</code> |
     * <code>Worker/SQS/HTTP</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SupportedAddon</code>: <code>Log/S3</code> |
     * <code>Monitoring/Healthd</code> | <code>WorkerDaemon/SQSD</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param values <p>
     *            The list of values applied to the filtering platform version
     *            attribute. Only one value is supported for all current
     *            operators.
     *            </p>
     *            <p>
     *            The following list shows valid filter values for some filter
     *            attributes.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>PlatformStatus</code>: <code>Creating</code> |
     *            <code>Failed</code> | <code>Ready</code> |
     *            <code>Deleting</code> | <code>Deleted</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>PlatformLifecycleState</code>: <code>recommended</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SupportedTier</code>: <code>WebServer/Standard</code> |
     *            <code>Worker/SQS/HTTP</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SupportedAddon</code>: <code>Log/S3</code> |
     *            <code>Monitoring/Healthd</code> |
     *            <code>WorkerDaemon/SQSD</code>
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PlatformFilter withValues(String... values) {
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
     * The list of values applied to the filtering platform version attribute.
     * Only one value is supported for all current operators.
     * </p>
     * <p>
     * The following list shows valid filter values for some filter attributes.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PlatformStatus</code>: <code>Creating</code> | <code>Failed</code>
     * | <code>Ready</code> | <code>Deleting</code> | <code>Deleted</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PlatformLifecycleState</code>: <code>recommended</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SupportedTier</code>: <code>WebServer/Standard</code> |
     * <code>Worker/SQS/HTTP</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SupportedAddon</code>: <code>Log/S3</code> |
     * <code>Monitoring/Healthd</code> | <code>WorkerDaemon/SQSD</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param values <p>
     *            The list of values applied to the filtering platform version
     *            attribute. Only one value is supported for all current
     *            operators.
     *            </p>
     *            <p>
     *            The following list shows valid filter values for some filter
     *            attributes.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>PlatformStatus</code>: <code>Creating</code> |
     *            <code>Failed</code> | <code>Ready</code> |
     *            <code>Deleting</code> | <code>Deleted</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>PlatformLifecycleState</code>: <code>recommended</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SupportedTier</code>: <code>WebServer/Standard</code> |
     *            <code>Worker/SQS/HTTP</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SupportedAddon</code>: <code>Log/S3</code> |
     *            <code>Monitoring/Healthd</code> |
     *            <code>WorkerDaemon/SQSD</code>
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PlatformFilter withValues(java.util.Collection<String> values) {
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
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getOperator() != null)
            sb.append("Operator: " + getOperator() + ",");
        if (getValues() != null)
            sb.append("Values: " + getValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getOperator() == null) ? 0 : getOperator().hashCode());
        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PlatformFilter == false)
            return false;
        PlatformFilter other = (PlatformFilter) obj;

        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getOperator() == null ^ this.getOperator() == null)
            return false;
        if (other.getOperator() != null && other.getOperator().equals(this.getOperator()) == false)
            return false;
        if (other.getValues() == null ^ this.getValues() == null)
            return false;
        if (other.getValues() != null && other.getValues().equals(this.getValues()) == false)
            return false;
        return true;
    }
}
