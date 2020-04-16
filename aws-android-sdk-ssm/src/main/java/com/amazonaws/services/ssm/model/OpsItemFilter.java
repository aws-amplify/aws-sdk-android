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
 * Describes an OpsItem filter.
 * </p>
 */
public class OpsItemFilter implements Serializable {
    /**
     * <p>
     * The name of the filter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Status, CreatedBy, Source, Priority, Title,
     * OpsItemId, CreatedTime, LastModifiedTime, OperationalData,
     * OperationalDataKey, OperationalDataValue, ResourceId, AutomationId,
     * Category, Severity
     */
    private String key;

    /**
     * <p>
     * The filter value.
     * </p>
     */
    private java.util.List<String> values;

    /**
     * <p>
     * The operator used by the filter call.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Equal, Contains, GreaterThan, LessThan
     */
    private String operator;

    /**
     * <p>
     * The name of the filter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Status, CreatedBy, Source, Priority, Title,
     * OpsItemId, CreatedTime, LastModifiedTime, OperationalData,
     * OperationalDataKey, OperationalDataValue, ResourceId, AutomationId,
     * Category, Severity
     *
     * @return <p>
     *         The name of the filter.
     *         </p>
     * @see OpsItemFilterKey
     */
    public String getKey() {
        return key;
    }

    /**
     * <p>
     * The name of the filter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Status, CreatedBy, Source, Priority, Title,
     * OpsItemId, CreatedTime, LastModifiedTime, OperationalData,
     * OperationalDataKey, OperationalDataValue, ResourceId, AutomationId,
     * Category, Severity
     *
     * @param key <p>
     *            The name of the filter.
     *            </p>
     * @see OpsItemFilterKey
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The name of the filter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Status, CreatedBy, Source, Priority, Title,
     * OpsItemId, CreatedTime, LastModifiedTime, OperationalData,
     * OperationalDataKey, OperationalDataValue, ResourceId, AutomationId,
     * Category, Severity
     *
     * @param key <p>
     *            The name of the filter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OpsItemFilterKey
     */
    public OpsItemFilter withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * <p>
     * The name of the filter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Status, CreatedBy, Source, Priority, Title,
     * OpsItemId, CreatedTime, LastModifiedTime, OperationalData,
     * OperationalDataKey, OperationalDataValue, ResourceId, AutomationId,
     * Category, Severity
     *
     * @param key <p>
     *            The name of the filter.
     *            </p>
     * @see OpsItemFilterKey
     */
    public void setKey(OpsItemFilterKey key) {
        this.key = key.toString();
    }

    /**
     * <p>
     * The name of the filter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Status, CreatedBy, Source, Priority, Title,
     * OpsItemId, CreatedTime, LastModifiedTime, OperationalData,
     * OperationalDataKey, OperationalDataValue, ResourceId, AutomationId,
     * Category, Severity
     *
     * @param key <p>
     *            The name of the filter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OpsItemFilterKey
     */
    public OpsItemFilter withKey(OpsItemFilterKey key) {
        this.key = key.toString();
        return this;
    }

    /**
     * <p>
     * The filter value.
     * </p>
     *
     * @return <p>
     *         The filter value.
     *         </p>
     */
    public java.util.List<String> getValues() {
        return values;
    }

    /**
     * <p>
     * The filter value.
     * </p>
     *
     * @param values <p>
     *            The filter value.
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
     * The filter value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param values <p>
     *            The filter value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OpsItemFilter withValues(String... values) {
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
     * The filter value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param values <p>
     *            The filter value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OpsItemFilter withValues(java.util.Collection<String> values) {
        setValues(values);
        return this;
    }

    /**
     * <p>
     * The operator used by the filter call.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Equal, Contains, GreaterThan, LessThan
     *
     * @return <p>
     *         The operator used by the filter call.
     *         </p>
     * @see OpsItemFilterOperator
     */
    public String getOperator() {
        return operator;
    }

    /**
     * <p>
     * The operator used by the filter call.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Equal, Contains, GreaterThan, LessThan
     *
     * @param operator <p>
     *            The operator used by the filter call.
     *            </p>
     * @see OpsItemFilterOperator
     */
    public void setOperator(String operator) {
        this.operator = operator;
    }

    /**
     * <p>
     * The operator used by the filter call.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Equal, Contains, GreaterThan, LessThan
     *
     * @param operator <p>
     *            The operator used by the filter call.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OpsItemFilterOperator
     */
    public OpsItemFilter withOperator(String operator) {
        this.operator = operator;
        return this;
    }

    /**
     * <p>
     * The operator used by the filter call.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Equal, Contains, GreaterThan, LessThan
     *
     * @param operator <p>
     *            The operator used by the filter call.
     *            </p>
     * @see OpsItemFilterOperator
     */
    public void setOperator(OpsItemFilterOperator operator) {
        this.operator = operator.toString();
    }

    /**
     * <p>
     * The operator used by the filter call.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Equal, Contains, GreaterThan, LessThan
     *
     * @param operator <p>
     *            The operator used by the filter call.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OpsItemFilterOperator
     */
    public OpsItemFilter withOperator(OpsItemFilterOperator operator) {
        this.operator = operator.toString();
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
            sb.append("Values: " + getValues() + ",");
        if (getOperator() != null)
            sb.append("Operator: " + getOperator());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        hashCode = prime * hashCode + ((getOperator() == null) ? 0 : getOperator().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OpsItemFilter == false)
            return false;
        OpsItemFilter other = (OpsItemFilter) obj;

        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getValues() == null ^ this.getValues() == null)
            return false;
        if (other.getValues() != null && other.getValues().equals(this.getValues()) == false)
            return false;
        if (other.getOperator() == null ^ this.getOperator() == null)
            return false;
        if (other.getOperator() != null && other.getOperator().equals(this.getOperator()) == false)
            return false;
        return true;
    }
}
