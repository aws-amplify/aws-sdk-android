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

package com.amazonaws.services.amazonrelationaldatabaseservice.model;

import java.io.Serializable;

/**
 * <p>
 * This data type is used as a request parameter in the
 * <code>ModifyDBParameterGroup</code> and <code>ResetDBParameterGroup</code>
 * actions.
 * </p>
 * <p>
 * This data type is used as a response element in the
 * <code>DescribeEngineDefaultParameters</code> and
 * <code>DescribeDBParameters</code> actions.
 * </p>
 */
public class Parameter implements Serializable {
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
     * Provides a description of the parameter.
     * </p>
     */
    private String description;

    /**
     * <p>
     * Indicates the source of the parameter value.
     * </p>
     */
    private String source;

    /**
     * <p>
     * Specifies the engine specific parameters type.
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
     * Specifies the valid range of values for the parameter.
     * </p>
     */
    private String allowedValues;

    /**
     * <p>
     * Indicates whether (<code>true</code>) or not (<code>false</code>) the
     * parameter can be modified. Some parameters have security or operational
     * implications that prevent them from being changed.
     * </p>
     */
    private Boolean isModifiable;

    /**
     * <p>
     * The earliest engine version to which the parameter can apply.
     * </p>
     */
    private String minimumEngineVersion;

    /**
     * <p>
     * Indicates when to apply parameter updates.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>immediate, pending-reboot
     */
    private String applyMethod;

    /**
     * <p>
     * The valid DB engine modes.
     * </p>
     */
    private java.util.List<String> supportedEngineModes;

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
    public Parameter withParameterName(String parameterName) {
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
    public Parameter withParameterValue(String parameterValue) {
        this.parameterValue = parameterValue;
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
    public Parameter withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * Indicates the source of the parameter value.
     * </p>
     *
     * @return <p>
     *         Indicates the source of the parameter value.
     *         </p>
     */
    public String getSource() {
        return source;
    }

    /**
     * <p>
     * Indicates the source of the parameter value.
     * </p>
     *
     * @param source <p>
     *            Indicates the source of the parameter value.
     *            </p>
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * <p>
     * Indicates the source of the parameter value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param source <p>
     *            Indicates the source of the parameter value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Parameter withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * <p>
     * Specifies the engine specific parameters type.
     * </p>
     *
     * @return <p>
     *         Specifies the engine specific parameters type.
     *         </p>
     */
    public String getApplyType() {
        return applyType;
    }

    /**
     * <p>
     * Specifies the engine specific parameters type.
     * </p>
     *
     * @param applyType <p>
     *            Specifies the engine specific parameters type.
     *            </p>
     */
    public void setApplyType(String applyType) {
        this.applyType = applyType;
    }

    /**
     * <p>
     * Specifies the engine specific parameters type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param applyType <p>
     *            Specifies the engine specific parameters type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Parameter withApplyType(String applyType) {
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
    public Parameter withDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }

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
    public Parameter withAllowedValues(String allowedValues) {
        this.allowedValues = allowedValues;
        return this;
    }

    /**
     * <p>
     * Indicates whether (<code>true</code>) or not (<code>false</code>) the
     * parameter can be modified. Some parameters have security or operational
     * implications that prevent them from being changed.
     * </p>
     *
     * @return <p>
     *         Indicates whether (<code>true</code>) or not (<code>false</code>)
     *         the parameter can be modified. Some parameters have security or
     *         operational implications that prevent them from being changed.
     *         </p>
     */
    public Boolean isIsModifiable() {
        return isModifiable;
    }

    /**
     * <p>
     * Indicates whether (<code>true</code>) or not (<code>false</code>) the
     * parameter can be modified. Some parameters have security or operational
     * implications that prevent them from being changed.
     * </p>
     *
     * @return <p>
     *         Indicates whether (<code>true</code>) or not (<code>false</code>)
     *         the parameter can be modified. Some parameters have security or
     *         operational implications that prevent them from being changed.
     *         </p>
     */
    public Boolean getIsModifiable() {
        return isModifiable;
    }

    /**
     * <p>
     * Indicates whether (<code>true</code>) or not (<code>false</code>) the
     * parameter can be modified. Some parameters have security or operational
     * implications that prevent them from being changed.
     * </p>
     *
     * @param isModifiable <p>
     *            Indicates whether (<code>true</code>) or not (
     *            <code>false</code>) the parameter can be modified. Some
     *            parameters have security or operational implications that
     *            prevent them from being changed.
     *            </p>
     */
    public void setIsModifiable(Boolean isModifiable) {
        this.isModifiable = isModifiable;
    }

    /**
     * <p>
     * Indicates whether (<code>true</code>) or not (<code>false</code>) the
     * parameter can be modified. Some parameters have security or operational
     * implications that prevent them from being changed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param isModifiable <p>
     *            Indicates whether (<code>true</code>) or not (
     *            <code>false</code>) the parameter can be modified. Some
     *            parameters have security or operational implications that
     *            prevent them from being changed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Parameter withIsModifiable(Boolean isModifiable) {
        this.isModifiable = isModifiable;
        return this;
    }

    /**
     * <p>
     * The earliest engine version to which the parameter can apply.
     * </p>
     *
     * @return <p>
     *         The earliest engine version to which the parameter can apply.
     *         </p>
     */
    public String getMinimumEngineVersion() {
        return minimumEngineVersion;
    }

    /**
     * <p>
     * The earliest engine version to which the parameter can apply.
     * </p>
     *
     * @param minimumEngineVersion <p>
     *            The earliest engine version to which the parameter can apply.
     *            </p>
     */
    public void setMinimumEngineVersion(String minimumEngineVersion) {
        this.minimumEngineVersion = minimumEngineVersion;
    }

    /**
     * <p>
     * The earliest engine version to which the parameter can apply.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param minimumEngineVersion <p>
     *            The earliest engine version to which the parameter can apply.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Parameter withMinimumEngineVersion(String minimumEngineVersion) {
        this.minimumEngineVersion = minimumEngineVersion;
        return this;
    }

    /**
     * <p>
     * Indicates when to apply parameter updates.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>immediate, pending-reboot
     *
     * @return <p>
     *         Indicates when to apply parameter updates.
     *         </p>
     * @see ApplyMethod
     */
    public String getApplyMethod() {
        return applyMethod;
    }

    /**
     * <p>
     * Indicates when to apply parameter updates.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>immediate, pending-reboot
     *
     * @param applyMethod <p>
     *            Indicates when to apply parameter updates.
     *            </p>
     * @see ApplyMethod
     */
    public void setApplyMethod(String applyMethod) {
        this.applyMethod = applyMethod;
    }

    /**
     * <p>
     * Indicates when to apply parameter updates.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>immediate, pending-reboot
     *
     * @param applyMethod <p>
     *            Indicates when to apply parameter updates.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ApplyMethod
     */
    public Parameter withApplyMethod(String applyMethod) {
        this.applyMethod = applyMethod;
        return this;
    }

    /**
     * <p>
     * Indicates when to apply parameter updates.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>immediate, pending-reboot
     *
     * @param applyMethod <p>
     *            Indicates when to apply parameter updates.
     *            </p>
     * @see ApplyMethod
     */
    public void setApplyMethod(ApplyMethod applyMethod) {
        this.applyMethod = applyMethod.toString();
    }

    /**
     * <p>
     * Indicates when to apply parameter updates.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>immediate, pending-reboot
     *
     * @param applyMethod <p>
     *            Indicates when to apply parameter updates.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ApplyMethod
     */
    public Parameter withApplyMethod(ApplyMethod applyMethod) {
        this.applyMethod = applyMethod.toString();
        return this;
    }

    /**
     * <p>
     * The valid DB engine modes.
     * </p>
     *
     * @return <p>
     *         The valid DB engine modes.
     *         </p>
     */
    public java.util.List<String> getSupportedEngineModes() {
        return supportedEngineModes;
    }

    /**
     * <p>
     * The valid DB engine modes.
     * </p>
     *
     * @param supportedEngineModes <p>
     *            The valid DB engine modes.
     *            </p>
     */
    public void setSupportedEngineModes(java.util.Collection<String> supportedEngineModes) {
        if (supportedEngineModes == null) {
            this.supportedEngineModes = null;
            return;
        }

        this.supportedEngineModes = new java.util.ArrayList<String>(supportedEngineModes);
    }

    /**
     * <p>
     * The valid DB engine modes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param supportedEngineModes <p>
     *            The valid DB engine modes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Parameter withSupportedEngineModes(String... supportedEngineModes) {
        if (getSupportedEngineModes() == null) {
            this.supportedEngineModes = new java.util.ArrayList<String>(supportedEngineModes.length);
        }
        for (String value : supportedEngineModes) {
            this.supportedEngineModes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The valid DB engine modes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param supportedEngineModes <p>
     *            The valid DB engine modes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Parameter withSupportedEngineModes(java.util.Collection<String> supportedEngineModes) {
        setSupportedEngineModes(supportedEngineModes);
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
        if (getParameterName() != null)
            sb.append("ParameterName: " + getParameterName() + ",");
        if (getParameterValue() != null)
            sb.append("ParameterValue: " + getParameterValue() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getSource() != null)
            sb.append("Source: " + getSource() + ",");
        if (getApplyType() != null)
            sb.append("ApplyType: " + getApplyType() + ",");
        if (getDataType() != null)
            sb.append("DataType: " + getDataType() + ",");
        if (getAllowedValues() != null)
            sb.append("AllowedValues: " + getAllowedValues() + ",");
        if (getIsModifiable() != null)
            sb.append("IsModifiable: " + getIsModifiable() + ",");
        if (getMinimumEngineVersion() != null)
            sb.append("MinimumEngineVersion: " + getMinimumEngineVersion() + ",");
        if (getApplyMethod() != null)
            sb.append("ApplyMethod: " + getApplyMethod() + ",");
        if (getSupportedEngineModes() != null)
            sb.append("SupportedEngineModes: " + getSupportedEngineModes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getParameterName() == null) ? 0 : getParameterName().hashCode());
        hashCode = prime * hashCode
                + ((getParameterValue() == null) ? 0 : getParameterValue().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode + ((getApplyType() == null) ? 0 : getApplyType().hashCode());
        hashCode = prime * hashCode + ((getDataType() == null) ? 0 : getDataType().hashCode());
        hashCode = prime * hashCode
                + ((getAllowedValues() == null) ? 0 : getAllowedValues().hashCode());
        hashCode = prime * hashCode
                + ((getIsModifiable() == null) ? 0 : getIsModifiable().hashCode());
        hashCode = prime * hashCode
                + ((getMinimumEngineVersion() == null) ? 0 : getMinimumEngineVersion().hashCode());
        hashCode = prime * hashCode
                + ((getApplyMethod() == null) ? 0 : getApplyMethod().hashCode());
        hashCode = prime * hashCode
                + ((getSupportedEngineModes() == null) ? 0 : getSupportedEngineModes().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Parameter == false)
            return false;
        Parameter other = (Parameter) obj;

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
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
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
        if (other.getAllowedValues() == null ^ this.getAllowedValues() == null)
            return false;
        if (other.getAllowedValues() != null
                && other.getAllowedValues().equals(this.getAllowedValues()) == false)
            return false;
        if (other.getIsModifiable() == null ^ this.getIsModifiable() == null)
            return false;
        if (other.getIsModifiable() != null
                && other.getIsModifiable().equals(this.getIsModifiable()) == false)
            return false;
        if (other.getMinimumEngineVersion() == null ^ this.getMinimumEngineVersion() == null)
            return false;
        if (other.getMinimumEngineVersion() != null
                && other.getMinimumEngineVersion().equals(this.getMinimumEngineVersion()) == false)
            return false;
        if (other.getApplyMethod() == null ^ this.getApplyMethod() == null)
            return false;
        if (other.getApplyMethod() != null
                && other.getApplyMethod().equals(this.getApplyMethod()) == false)
            return false;
        if (other.getSupportedEngineModes() == null ^ this.getSupportedEngineModes() == null)
            return false;
        if (other.getSupportedEngineModes() != null
                && other.getSupportedEngineModes().equals(this.getSupportedEngineModes()) == false)
            return false;
        return true;
    }
}
