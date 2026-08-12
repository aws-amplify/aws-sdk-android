/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

/**
 * <p>
 * The <code>UpdateCase</code> action definition.
 * </p>
 */
public class UpdateCaseActionDefinition implements Serializable {
    /**
     * <p>
     * An array of objects with <code>Field ID</code> and Value data.
     * </p>
     */
    private java.util.List<FieldValue> fields;

    /**
     * <p>
     * An array of objects with <code>Field ID</code> and Value data.
     * </p>
     *
     * @return <p>
     *         An array of objects with <code>Field ID</code> and Value data.
     *         </p>
     */
    public java.util.List<FieldValue> getFields() {
        return fields;
    }

    /**
     * <p>
     * An array of objects with <code>Field ID</code> and Value data.
     * </p>
     *
     * @param fields <p>
     *            An array of objects with <code>Field ID</code> and Value data.
     *            </p>
     */
    public void setFields(java.util.Collection<FieldValue> fields) {
        if (fields == null) {
            this.fields = null;
            return;
        }

        this.fields = new java.util.ArrayList<FieldValue>(fields);
    }

    /**
     * <p>
     * An array of objects with <code>Field ID</code> and Value data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fields <p>
     *            An array of objects with <code>Field ID</code> and Value data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateCaseActionDefinition withFields(FieldValue... fields) {
        if (getFields() == null) {
            this.fields = new java.util.ArrayList<FieldValue>(fields.length);
        }
        for (FieldValue value : fields) {
            this.fields.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects with <code>Field ID</code> and Value data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fields <p>
     *            An array of objects with <code>Field ID</code> and Value data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateCaseActionDefinition withFields(java.util.Collection<FieldValue> fields) {
        setFields(fields);
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
        if (getFields() != null)
            sb.append("Fields: " + getFields());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFields() == null) ? 0 : getFields().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateCaseActionDefinition == false)
            return false;
        UpdateCaseActionDefinition other = (UpdateCaseActionDefinition) obj;

        if (other.getFields() == null ^ this.getFields() == null)
            return false;
        if (other.getFields() != null && other.getFields().equals(this.getFields()) == false)
            return false;
        return true;
    }
}
