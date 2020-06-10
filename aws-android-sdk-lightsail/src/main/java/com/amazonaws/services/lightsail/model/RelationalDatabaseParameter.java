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

package com.amazonaws.services.lightsail.model;

import java.io.Serializable;

/**
 * <p>
 * Describes the parameters of a database.
 * </p>
 */
public class RelationalDatabaseParameter implements Serializable {
    /**
     * <p>
     * Specifies the valid range of values for the parameter.
     * </p>
     */
    private String allowedValues;

    /**
     * <p>
     * Indicates when parameter updates are applied.
     * </p>
     * <p>
     * Can be <code>immediate</code> or <code>pending-reboot</code>.
     * </p>
     */
    private String applyMethod;

    /**
     * <p>
     * Specifies the engine-specific parameter type.
     * </p>
     */
    private String applyType;

    /**
     * <p>
     * Specifies the valid data type for the parameter.
     * </p>
     */
    private String dataType;

    /**
     * <p>
     * Provides a description of the parameter.
     * </p>
     */
    private String description;

    /**
     * <p>
     * A Boolean value indicating whether the parameter can be modified.
     * </p>
     */
    private Boolean isModifiable;

    /**
     * <p>
     * Specifies the name of the parameter.
     * </p>
     */
    private String parameterName;

    /**
     * <p>
     * Specifies the value of the parameter.
     * </p>
     */
    private String parameterValue;

    /**
     * <p>
     * Specifies the valid range of values for the parameter.
     * </p>
     *
     * @return <p>
     *         Specifies the valid range of values for the parameter.
     *         </p>
     */
    public String getAllowedValues() {
        return allowedValues;
    }

    /**
     * <p>
     * Specifies the valid range of values for the parameter.
     * </p>
     *
     * @param allowedValues <p>
     *            Specifies the valid range of values for the parameter.
     *            </p>
     */
    public void setAllowedValues(String allowedValues) {
        this.allowedValues = allowedValues;
    }

    /**
     * <p>
     * Specifies the valid range of values for the parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param allowedValues <p>
     *            Specifies the valid range of values for the parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RelationalDatabaseParameter withAllowedValues(String allowedValues) {
        this.allowedValues = allowedValues;
        return this;
    }

    /**
     * <p>
     * Indicates when parameter updates are applied.
     * </p>
     * <p>
     * Can be <code>immediate</code> or <code>pending-reboot</code>.
     * </p>
     *
     * @return <p>
     *         Indicates when parameter updates are applied.
     *         </p>
     *         <p>
     *         Can be <code>immediate</code> or <code>pending-reboot</code>.
     *         </p>
     */
    public String getApplyMethod() {
        return applyMethod;
    }

    /**
     * <p>
     * Indicates when parameter updates are applied.
     * </p>
     * <p>
     * Can be <code>immediate</code> or <code>pending-reboot</code>.
     * </p>
     *
     * @param applyMethod <p>
     *            Indicates when parameter updates are applied.
     *            </p>
     *            <p>
     *            Can be <code>immediate</code> or <code>pending-reboot</code>.
     *            </p>
     */
    public void setApplyMethod(String applyMethod) {
        this.applyMethod = applyMethod;
    }

    /**
     * <p>
     * Indicates when parameter updates are applied.
     * </p>
     * <p>
     * Can be <code>immediate</code> or <code>pending-reboot</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param applyMethod <p>
     *            Indicates when parameter updates are applied.
     *            </p>
     *            <p>
     *            Can be <code>immediate</code> or <code>pending-reboot</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RelationalDatabaseParameter withApplyMethod(String applyMethod) {
        this.applyMethod = applyMethod;
        return this;
    }

    /**
     * <p>
     * Specifies the engine-specific parameter type.
     * </p>
     *
     * @return <p>
     *         Specifies the engine-specific parameter type.
     *         </p>
     */
    public String getApplyType() {
        return applyType;
    }

    /**
     * <p>
     * Specifies the engine-specific parameter type.
     * </p>
     *
     * @param applyType <p>
     *            Specifies the engine-specific parameter type.
     *            </p>
     */
    public void setApplyType(String applyType) {
        this.applyType = applyType;
    }

    /**
     * <p>
     * Specifies the engine-specific parameter type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param applyType <p>
     *            Specifies the engine-specific parameter type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RelationalDatabaseParameter withApplyType(String applyType) {
        this.applyType = applyType;
        return this;
    }

    /**
     * <p>
     * Specifies the valid data type for the parameter.
     * </p>
     *
     * @return <p>
     *         Specifies the valid data type for the parameter.
     *         </p>
     */
    public String getDataType() {
        return dataType;
    }

    /**
     * <p>
     * Specifies the valid data type for the parameter.
     * </p>
     *
     * @param dataType <p>
     *            Specifies the valid data type for the parameter.
     *            </p>
     */
    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    /**
     * <p>
     * Specifies the valid data type for the parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dataType <p>
     *            Specifies the valid data type for the parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RelationalDatabaseParameter withDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }

    /**
     * <p>
     * Provides a description of the parameter.
     * </p>
     *
     * @return <p>
     *         Provides a description of the parameter.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * Provides a description of the parameter.
     * </p>
     *
     * @param description <p>
     *            Provides a description of the parameter.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Provides a description of the parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            Provides a description of the parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RelationalDatabaseParameter withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * A Boolean value indicating whether the parameter can be modified.
     * </p>
     *
     * @return <p>
     *         A Boolean value indicating whether the parameter can be modified.
     *         </p>
     */
    public Boolean isIsModifiable() {
        return isModifiable;
    }

    /**
     * <p>
     * A Boolean value indicating whether the parameter can be modified.
     * </p>
     *
     * @return <p>
     *         A Boolean value indicating whether the parameter can be modified.
     *         </p>
     */
    public Boolean getIsModifiable() {
        return isModifiable;
    }

    /**
     * <p>
     * A Boolean value indicating whether the parameter can be modified.
     * </p>
     *
     * @param isModifiable <p>
     *            A Boolean value indicating whether the parameter can be
     *            modified.
     *            </p>
     */
    public void setIsModifiable(Boolean isModifiable) {
        this.isModifiable = isModifiable;
    }

    /**
     * <p>
     * A Boolean value indicating whether the parameter can be modified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param isModifiable <p>
     *            A Boolean value indicating whether the parameter can be
     *            modified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RelationalDatabaseParameter withIsModifiable(Boolean isModifiable) {
        this.isModifiable = isModifiable;
        return this;
    }

    /**
     * <p>
     * Specifies the name of the parameter.
     * </p>
     *
     * @return <p>
     *         Specifies the name of the parameter.
     *         </p>
     */
    public String getParameterName() {
        return parameterName;
    }

    /**
     * <p>
     * Specifies the name of the parameter.
     * </p>
     *
     * @param parameterName <p>
     *            Specifies the name of the parameter.
     *            </p>
     */
    public void setParameterName(String parameterName) {
        this.parameterName = parameterName;
    }

    /**
     * <p>
     * Specifies the name of the parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parameterName <p>
     *            Specifies the name of the parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RelationalDatabaseParameter withParameterName(String parameterName) {
        this.parameterName = parameterName;
        return this;
    }

    /**
     * <p>
     * Specifies the value of the parameter.
     * </p>
     *
     * @return <p>
     *         Specifies the value of the parameter.
     *         </p>
     */
    public String getParameterValue() {
        return parameterValue;
    }

    /**
     * <p>
     * Specifies the value of the parameter.
     * </p>
     *
     * @param parameterValue <p>
     *            Specifies the value of the parameter.
     *            </p>
     */
    public void setParameterValue(String parameterValue) {
        this.parameterValue = parameterValue;
    }

    /**
     * <p>
     * Specifies the value of the parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parameterValue <p>
     *            Specifies the value of the parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RelationalDatabaseParameter withParameterValue(String parameterValue) {
        this.parameterValue = parameterValue;
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
        if (getAllowedValues() != null)
            sb.append("allowedValues: " + getAllowedValues() + ",");
        if (getApplyMethod() != null)
            sb.append("applyMethod: " + getApplyMethod() + ",");
        if (getApplyType() != null)
            sb.append("applyType: " + getApplyType() + ",");
        if (getDataType() != null)
            sb.append("dataType: " + getDataType() + ",");
        if (getDescription() != null)
            sb.append("description: " + getDescription() + ",");
        if (getIsModifiable() != null)
            sb.append("isModifiable: " + getIsModifiable() + ",");
        if (getParameterName() != null)
            sb.append("parameterName: " + getParameterName() + ",");
        if (getParameterValue() != null)
            sb.append("parameterValue: " + getParameterValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAllowedValues() == null) ? 0 : getAllowedValues().hashCode());
        hashCode = prime * hashCode
                + ((getApplyMethod() == null) ? 0 : getApplyMethod().hashCode());
        hashCode = prime * hashCode + ((getApplyType() == null) ? 0 : getApplyType().hashCode());
        hashCode = prime * hashCode + ((getDataType() == null) ? 0 : getDataType().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getIsModifiable() == null) ? 0 : getIsModifiable().hashCode());
        hashCode = prime * hashCode
                + ((getParameterName() == null) ? 0 : getParameterName().hashCode());
        hashCode = prime * hashCode
                + ((getParameterValue() == null) ? 0 : getParameterValue().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RelationalDatabaseParameter == false)
            return false;
        RelationalDatabaseParameter other = (RelationalDatabaseParameter) obj;

        if (other.getAllowedValues() == null ^ this.getAllowedValues() == null)
            return false;
        if (other.getAllowedValues() != null
                && other.getAllowedValues().equals(this.getAllowedValues()) == false)
            return false;
        if (other.getApplyMethod() == null ^ this.getApplyMethod() == null)
            return false;
        if (other.getApplyMethod() != null
                && other.getApplyMethod().equals(this.getApplyMethod()) == false)
            return false;
        if (other.getApplyType() == null ^ this.getApplyType() == null)
            return false;
        if (other.getApplyType() != null
                && other.getApplyType().equals(this.getApplyType()) == false)
            return false;
        if (other.getDataType() == null ^ this.getDataType() == null)
            return false;
        if (other.getDataType() != null && other.getDataType().equals(this.getDataType()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getIsModifiable() == null ^ this.getIsModifiable() == null)
            return false;
        if (other.getIsModifiable() != null
                && other.getIsModifiable().equals(this.getIsModifiable()) == false)
            return false;
        if (other.getParameterName() == null ^ this.getParameterName() == null)
            return false;
        if (other.getParameterName() != null
                && other.getParameterName().equals(this.getParameterName()) == false)
            return false;
        if (other.getParameterValue() == null ^ this.getParameterValue() == null)
            return false;
        if (other.getParameterValue() != null
                && other.getParameterValue().equals(this.getParameterValue()) == false)
            return false;
        return true;
    }
}
