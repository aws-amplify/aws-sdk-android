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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a variable.
 * </p>
 */
public class CreateVariableRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the variable.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The data type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STRING, INTEGER, FLOAT, BOOLEAN
     */
    private String dataType;

    /**
     * <p>
     * The source of the data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EVENT, MODEL_SCORE, EXTERNAL_MODEL_SCORE
     */
    private String dataSource;

    /**
     * <p>
     * The default value for the variable when no value is received.
     * </p>
     */
    private String defaultValue;

    /**
     * <p>
     * The description.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The variable type.
     * </p>
     */
    private String variableType;

    /**
     * <p>
     * The name of the variable.
     * </p>
     *
     * @return <p>
     *         The name of the variable.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the variable.
     * </p>
     *
     * @param name <p>
     *            The name of the variable.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the variable.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            The name of the variable.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVariableRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The data type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STRING, INTEGER, FLOAT, BOOLEAN
     *
     * @return <p>
     *         The data type.
     *         </p>
     * @see DataType
     */
    public String getDataType() {
        return dataType;
    }

    /**
     * <p>
     * The data type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STRING, INTEGER, FLOAT, BOOLEAN
     *
     * @param dataType <p>
     *            The data type.
     *            </p>
     * @see DataType
     */
    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    /**
     * <p>
     * The data type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STRING, INTEGER, FLOAT, BOOLEAN
     *
     * @param dataType <p>
     *            The data type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DataType
     */
    public CreateVariableRequest withDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }

    /**
     * <p>
     * The data type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STRING, INTEGER, FLOAT, BOOLEAN
     *
     * @param dataType <p>
     *            The data type.
     *            </p>
     * @see DataType
     */
    public void setDataType(DataType dataType) {
        this.dataType = dataType.toString();
    }

    /**
     * <p>
     * The data type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STRING, INTEGER, FLOAT, BOOLEAN
     *
     * @param dataType <p>
     *            The data type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DataType
     */
    public CreateVariableRequest withDataType(DataType dataType) {
        this.dataType = dataType.toString();
        return this;
    }

    /**
     * <p>
     * The source of the data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EVENT, MODEL_SCORE, EXTERNAL_MODEL_SCORE
     *
     * @return <p>
     *         The source of the data.
     *         </p>
     * @see DataSource
     */
    public String getDataSource() {
        return dataSource;
    }

    /**
     * <p>
     * The source of the data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EVENT, MODEL_SCORE, EXTERNAL_MODEL_SCORE
     *
     * @param dataSource <p>
     *            The source of the data.
     *            </p>
     * @see DataSource
     */
    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
    }

    /**
     * <p>
     * The source of the data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EVENT, MODEL_SCORE, EXTERNAL_MODEL_SCORE
     *
     * @param dataSource <p>
     *            The source of the data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DataSource
     */
    public CreateVariableRequest withDataSource(String dataSource) {
        this.dataSource = dataSource;
        return this;
    }

    /**
     * <p>
     * The source of the data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EVENT, MODEL_SCORE, EXTERNAL_MODEL_SCORE
     *
     * @param dataSource <p>
     *            The source of the data.
     *            </p>
     * @see DataSource
     */
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource.toString();
    }

    /**
     * <p>
     * The source of the data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EVENT, MODEL_SCORE, EXTERNAL_MODEL_SCORE
     *
     * @param dataSource <p>
     *            The source of the data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DataSource
     */
    public CreateVariableRequest withDataSource(DataSource dataSource) {
        this.dataSource = dataSource.toString();
        return this;
    }

    /**
     * <p>
     * The default value for the variable when no value is received.
     * </p>
     *
     * @return <p>
     *         The default value for the variable when no value is received.
     *         </p>
     */
    public String getDefaultValue() {
        return defaultValue;
    }

    /**
     * <p>
     * The default value for the variable when no value is received.
     * </p>
     *
     * @param defaultValue <p>
     *            The default value for the variable when no value is received.
     *            </p>
     */
    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    /**
     * <p>
     * The default value for the variable when no value is received.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param defaultValue <p>
     *            The default value for the variable when no value is received.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVariableRequest withDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }

    /**
     * <p>
     * The description.
     * </p>
     *
     * @return <p>
     *         The description.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description.
     * </p>
     *
     * @param description <p>
     *            The description.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            The description.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVariableRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The variable type.
     * </p>
     *
     * @return <p>
     *         The variable type.
     *         </p>
     */
    public String getVariableType() {
        return variableType;
    }

    /**
     * <p>
     * The variable type.
     * </p>
     *
     * @param variableType <p>
     *            The variable type.
     *            </p>
     */
    public void setVariableType(String variableType) {
        this.variableType = variableType;
    }

    /**
     * <p>
     * The variable type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param variableType <p>
     *            The variable type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVariableRequest withVariableType(String variableType) {
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

        if (obj instanceof CreateVariableRequest == false)
            return false;
        CreateVariableRequest other = (CreateVariableRequest) obj;

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
