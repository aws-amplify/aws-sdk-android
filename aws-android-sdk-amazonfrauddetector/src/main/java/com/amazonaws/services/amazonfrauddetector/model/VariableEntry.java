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

package com.amazonaws.services.amazonfrauddetector.model;

import java.io.Serializable;

/**
 * <p>
 * The variable entry in a list.
 * </p>
 */
public class VariableEntry implements Serializable {
    /**
     * <p>
     * The name of the variable entry.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The data type of the variable entry.
     * </p>
     */
    private String dataType;

    /**
     * <p>
     * The data source of the variable entry.
     * </p>
     */
    private String dataSource;

    /**
     * <p>
     * The default value of the variable entry.
     * </p>
     */
    private String defaultValue;

    /**
     * <p>
     * The description of the variable entry.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The type of the variable entry.
     * </p>
     */
    private String variableType;

    /**
     * <p>
     * The name of the variable entry.
     * </p>
     *
     * @return <p>
     *         The name of the variable entry.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the variable entry.
     * </p>
     *
     * @param name <p>
     *            The name of the variable entry.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the variable entry.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            The name of the variable entry.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VariableEntry withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The data type of the variable entry.
     * </p>
     *
     * @return <p>
     *         The data type of the variable entry.
     *         </p>
     */
    public String getDataType() {
        return dataType;
    }

    /**
     * <p>
     * The data type of the variable entry.
     * </p>
     *
     * @param dataType <p>
     *            The data type of the variable entry.
     *            </p>
     */
    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    /**
     * <p>
     * The data type of the variable entry.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dataType <p>
     *            The data type of the variable entry.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VariableEntry withDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }

    /**
     * <p>
     * The data source of the variable entry.
     * </p>
     *
     * @return <p>
     *         The data source of the variable entry.
     *         </p>
     */
    public String getDataSource() {
        return dataSource;
    }

    /**
     * <p>
     * The data source of the variable entry.
     * </p>
     *
     * @param dataSource <p>
     *            The data source of the variable entry.
     *            </p>
     */
    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
    }

    /**
     * <p>
     * The data source of the variable entry.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dataSource <p>
     *            The data source of the variable entry.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VariableEntry withDataSource(String dataSource) {
        this.dataSource = dataSource;
        return this;
    }

    /**
     * <p>
     * The default value of the variable entry.
     * </p>
     *
     * @return <p>
     *         The default value of the variable entry.
     *         </p>
     */
    public String getDefaultValue() {
        return defaultValue;
    }

    /**
     * <p>
     * The default value of the variable entry.
     * </p>
     *
     * @param defaultValue <p>
     *            The default value of the variable entry.
     *            </p>
     */
    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    /**
     * <p>
     * The default value of the variable entry.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param defaultValue <p>
     *            The default value of the variable entry.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VariableEntry withDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }

    /**
     * <p>
     * The description of the variable entry.
     * </p>
     *
     * @return <p>
     *         The description of the variable entry.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description of the variable entry.
     * </p>
     *
     * @param description <p>
     *            The description of the variable entry.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the variable entry.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            The description of the variable entry.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VariableEntry withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The type of the variable entry.
     * </p>
     *
     * @return <p>
     *         The type of the variable entry.
     *         </p>
     */
    public String getVariableType() {
        return variableType;
    }

    /**
     * <p>
     * The type of the variable entry.
     * </p>
     *
     * @param variableType <p>
     *            The type of the variable entry.
     *            </p>
     */
    public void setVariableType(String variableType) {
        this.variableType = variableType;
    }

    /**
     * <p>
     * The type of the variable entry.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param variableType <p>
     *            The type of the variable entry.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VariableEntry withVariableType(String variableType) {
        this.variableType = variableType;
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
        if (getName() != null)
            sb.append("name: " + getName() + ",");
        if (getDataType() != null)
            sb.append("dataType: " + getDataType() + ",");
        if (getDataSource() != null)
            sb.append("dataSource: " + getDataSource() + ",");
        if (getDefaultValue() != null)
            sb.append("defaultValue: " + getDefaultValue() + ",");
        if (getDescription() != null)
            sb.append("description: " + getDescription() + ",");
        if (getVariableType() != null)
            sb.append("variableType: " + getVariableType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDataType() == null) ? 0 : getDataType().hashCode());
        hashCode = prime * hashCode + ((getDataSource() == null) ? 0 : getDataSource().hashCode());
        hashCode = prime * hashCode
                + ((getDefaultValue() == null) ? 0 : getDefaultValue().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getVariableType() == null) ? 0 : getVariableType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VariableEntry == false)
            return false;
        VariableEntry other = (VariableEntry) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDataType() == null ^ this.getDataType() == null)
            return false;
        if (other.getDataType() != null && other.getDataType().equals(this.getDataType()) == false)
            return false;
        if (other.getDataSource() == null ^ this.getDataSource() == null)
            return false;
        if (other.getDataSource() != null
                && other.getDataSource().equals(this.getDataSource()) == false)
            return false;
        if (other.getDefaultValue() == null ^ this.getDefaultValue() == null)
            return false;
        if (other.getDefaultValue() != null
                && other.getDefaultValue().equals(this.getDefaultValue()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getVariableType() == null ^ this.getVariableType() == null)
            return false;
        if (other.getVariableType() != null
                && other.getVariableType().equals(this.getVariableType()) == false)
            return false;
        return true;
    }
}
