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
 * Describes default values for fields on a template.
 * </p>
 */
public class TaskTemplateDefaults implements Serializable {
    /**
     * <p>
     * Default value for the field.
     * </p>
     */
    private java.util.List<TaskTemplateDefaultFieldValue> defaultFieldValues;

    /**
     * <p>
     * Default value for the field.
     * </p>
     *
     * @return <p>
     *         Default value for the field.
     *         </p>
     */
    public java.util.List<TaskTemplateDefaultFieldValue> getDefaultFieldValues() {
        return defaultFieldValues;
    }

    /**
     * <p>
     * Default value for the field.
     * </p>
     *
     * @param defaultFieldValues <p>
     *            Default value for the field.
     *            </p>
     */
    public void setDefaultFieldValues(
            java.util.Collection<TaskTemplateDefaultFieldValue> defaultFieldValues) {
        if (defaultFieldValues == null) {
            this.defaultFieldValues = null;
            return;
        }

        this.defaultFieldValues = new java.util.ArrayList<TaskTemplateDefaultFieldValue>(
                defaultFieldValues);
    }

    /**
     * <p>
     * Default value for the field.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param defaultFieldValues <p>
     *            Default value for the field.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TaskTemplateDefaults withDefaultFieldValues(
            TaskTemplateDefaultFieldValue... defaultFieldValues) {
        if (getDefaultFieldValues() == null) {
            this.defaultFieldValues = new java.util.ArrayList<TaskTemplateDefaultFieldValue>(
                    defaultFieldValues.length);
        }
        for (TaskTemplateDefaultFieldValue value : defaultFieldValues) {
            this.defaultFieldValues.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Default value for the field.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param defaultFieldValues <p>
     *            Default value for the field.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TaskTemplateDefaults withDefaultFieldValues(
            java.util.Collection<TaskTemplateDefaultFieldValue> defaultFieldValues) {
        setDefaultFieldValues(defaultFieldValues);
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
        if (getDefaultFieldValues() != null)
            sb.append("DefaultFieldValues: " + getDefaultFieldValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDefaultFieldValues() == null) ? 0 : getDefaultFieldValues().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TaskTemplateDefaults == false)
            return false;
        TaskTemplateDefaults other = (TaskTemplateDefaults) obj;

        if (other.getDefaultFieldValues() == null ^ this.getDefaultFieldValues() == null)
            return false;
        if (other.getDefaultFieldValues() != null
                && other.getDefaultFieldValues().equals(this.getDefaultFieldValues()) == false)
            return false;
        return true;
    }
}
