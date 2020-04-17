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
 * Updates a variable.
 * </p>
 */
public class UpdateVariableRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the variable.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The new default value of the variable.
     * </p>
     */
    private String defaultValue;

    /**
     * <p>
     * The new description.
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
    public UpdateVariableRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The new default value of the variable.
     * </p>
     *
     * @return <p>
     *         The new default value of the variable.
     *         </p>
     */
    public String getDefaultValue() {
        return defaultValue;
    }

    /**
     * <p>
     * The new default value of the variable.
     * </p>
     *
     * @param defaultValue <p>
     *            The new default value of the variable.
     *            </p>
     */
    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    /**
     * <p>
     * The new default value of the variable.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param defaultValue <p>
     *            The new default value of the variable.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateVariableRequest withDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }

    /**
     * <p>
     * The new description.
     * </p>
     *
     * @return <p>
     *         The new description.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The new description.
     * </p>
     *
     * @param description <p>
     *            The new description.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The new description.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            The new description.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateVariableRequest withDescription(String description) {
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
    public UpdateVariableRequest withVariableType(String variableType) {
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

        if (obj instanceof UpdateVariableRequest == false)
            return false;
        UpdateVariableRequest other = (UpdateVariableRequest) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
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
