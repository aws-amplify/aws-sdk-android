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
 * Option settings are the actual settings being applied or configured for that
 * option. It is used when you modify an option group or describe option groups.
 * For example, the NATIVE_NETWORK_ENCRYPTION option has a setting called
 * SQLNET.ENCRYPTION_SERVER that can have several different values.
 * </p>
 */
public class OptionSetting implements Serializable {
    /**
     * <p>
     * The name of the option that has settings that you can set.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The current value of the option setting.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The default value of the option setting.
     * </p>
     */
    private String defaultValue;

    /**
     * <p>
     * The description of the option setting.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The DB engine specific parameter type.
     * </p>
     */
    private String applyType;

    /**
     * <p>
     * The data type of the option setting.
     * </p>
     */
    private String dataType;

    /**
     * <p>
     * The allowed values of the option setting.
     * </p>
     */
    private String allowedValues;

    /**
     * <p>
     * A Boolean value that, when true, indicates the option setting can be
     * modified from the default.
     * </p>
     */
    private Boolean isModifiable;

    /**
     * <p>
     * Indicates if the option setting is part of a collection.
     * </p>
     */
    private Boolean isCollection;

    /**
     * <p>
     * The name of the option that has settings that you can set.
     * </p>
     *
     * @return <p>
     *         The name of the option that has settings that you can set.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the option that has settings that you can set.
     * </p>
     *
     * @param name <p>
     *            The name of the option that has settings that you can set.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the option that has settings that you can set.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            The name of the option that has settings that you can set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OptionSetting withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The current value of the option setting.
     * </p>
     *
     * @return <p>
     *         The current value of the option setting.
     *         </p>
     */
    public String getValue() {
        return value;
    }

    /**
     * <p>
     * The current value of the option setting.
     * </p>
     *
     * @param value <p>
     *            The current value of the option setting.
     *            </p>
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The current value of the option setting.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param value <p>
     *            The current value of the option setting.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OptionSetting withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * <p>
     * The default value of the option setting.
     * </p>
     *
     * @return <p>
     *         The default value of the option setting.
     *         </p>
     */
    public String getDefaultValue() {
        return defaultValue;
    }

    /**
     * <p>
     * The default value of the option setting.
     * </p>
     *
     * @param defaultValue <p>
     *            The default value of the option setting.
     *            </p>
     */
    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    /**
     * <p>
     * The default value of the option setting.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param defaultValue <p>
     *            The default value of the option setting.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OptionSetting withDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }

    /**
     * <p>
     * The description of the option setting.
     * </p>
     *
     * @return <p>
     *         The description of the option setting.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description of the option setting.
     * </p>
     *
     * @param description <p>
     *            The description of the option setting.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the option setting.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            The description of the option setting.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OptionSetting withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The DB engine specific parameter type.
     * </p>
     *
     * @return <p>
     *         The DB engine specific parameter type.
     *         </p>
     */
    public String getApplyType() {
        return applyType;
    }

    /**
     * <p>
     * The DB engine specific parameter type.
     * </p>
     *
     * @param applyType <p>
     *            The DB engine specific parameter type.
     *            </p>
     */
    public void setApplyType(String applyType) {
        this.applyType = applyType;
    }

    /**
     * <p>
     * The DB engine specific parameter type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param applyType <p>
     *            The DB engine specific parameter type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OptionSetting withApplyType(String applyType) {
        this.applyType = applyType;
        return this;
    }

    /**
     * <p>
     * The data type of the option setting.
     * </p>
     *
     * @return <p>
     *         The data type of the option setting.
     *         </p>
     */
    public String getDataType() {
        return dataType;
    }

    /**
     * <p>
     * The data type of the option setting.
     * </p>
     *
     * @param dataType <p>
     *            The data type of the option setting.
     *            </p>
     */
    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    /**
     * <p>
     * The data type of the option setting.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dataType <p>
     *            The data type of the option setting.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OptionSetting withDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }

    /**
     * <p>
     * The allowed values of the option setting.
     * </p>
     *
     * @return <p>
     *         The allowed values of the option setting.
     *         </p>
     */
    public String getAllowedValues() {
        return allowedValues;
    }

    /**
     * <p>
     * The allowed values of the option setting.
     * </p>
     *
     * @param allowedValues <p>
     *            The allowed values of the option setting.
     *            </p>
     */
    public void setAllowedValues(String allowedValues) {
        this.allowedValues = allowedValues;
    }

    /**
     * <p>
     * The allowed values of the option setting.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param allowedValues <p>
     *            The allowed values of the option setting.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OptionSetting withAllowedValues(String allowedValues) {
        this.allowedValues = allowedValues;
        return this;
    }

    /**
     * <p>
     * A Boolean value that, when true, indicates the option setting can be
     * modified from the default.
     * </p>
     *
     * @return <p>
     *         A Boolean value that, when true, indicates the option setting can
     *         be modified from the default.
     *         </p>
     */
    public Boolean isIsModifiable() {
        return isModifiable;
    }

    /**
     * <p>
     * A Boolean value that, when true, indicates the option setting can be
     * modified from the default.
     * </p>
     *
     * @return <p>
     *         A Boolean value that, when true, indicates the option setting can
     *         be modified from the default.
     *         </p>
     */
    public Boolean getIsModifiable() {
        return isModifiable;
    }

    /**
     * <p>
     * A Boolean value that, when true, indicates the option setting can be
     * modified from the default.
     * </p>
     *
     * @param isModifiable <p>
     *            A Boolean value that, when true, indicates the option setting
     *            can be modified from the default.
     *            </p>
     */
    public void setIsModifiable(Boolean isModifiable) {
        this.isModifiable = isModifiable;
    }

    /**
     * <p>
     * A Boolean value that, when true, indicates the option setting can be
     * modified from the default.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param isModifiable <p>
     *            A Boolean value that, when true, indicates the option setting
     *            can be modified from the default.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OptionSetting withIsModifiable(Boolean isModifiable) {
        this.isModifiable = isModifiable;
        return this;
    }

    /**
     * <p>
     * Indicates if the option setting is part of a collection.
     * </p>
     *
     * @return <p>
     *         Indicates if the option setting is part of a collection.
     *         </p>
     */
    public Boolean isIsCollection() {
        return isCollection;
    }

    /**
     * <p>
     * Indicates if the option setting is part of a collection.
     * </p>
     *
     * @return <p>
     *         Indicates if the option setting is part of a collection.
     *         </p>
     */
    public Boolean getIsCollection() {
        return isCollection;
    }

    /**
     * <p>
     * Indicates if the option setting is part of a collection.
     * </p>
     *
     * @param isCollection <p>
     *            Indicates if the option setting is part of a collection.
     *            </p>
     */
    public void setIsCollection(Boolean isCollection) {
        this.isCollection = isCollection;
    }

    /**
     * <p>
     * Indicates if the option setting is part of a collection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param isCollection <p>
     *            Indicates if the option setting is part of a collection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OptionSetting withIsCollection(Boolean isCollection) {
        this.isCollection = isCollection;
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
            sb.append("Name: " + getName() + ",");
        if (getValue() != null)
            sb.append("Value: " + getValue() + ",");
        if (getDefaultValue() != null)
            sb.append("DefaultValue: " + getDefaultValue() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getApplyType() != null)
            sb.append("ApplyType: " + getApplyType() + ",");
        if (getDataType() != null)
            sb.append("DataType: " + getDataType() + ",");
        if (getAllowedValues() != null)
            sb.append("AllowedValues: " + getAllowedValues() + ",");
        if (getIsModifiable() != null)
            sb.append("IsModifiable: " + getIsModifiable() + ",");
        if (getIsCollection() != null)
            sb.append("IsCollection: " + getIsCollection());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode
                + ((getDefaultValue() == null) ? 0 : getDefaultValue().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getApplyType() == null) ? 0 : getApplyType().hashCode());
        hashCode = prime * hashCode + ((getDataType() == null) ? 0 : getDataType().hashCode());
        hashCode = prime * hashCode
                + ((getAllowedValues() == null) ? 0 : getAllowedValues().hashCode());
        hashCode = prime * hashCode
                + ((getIsModifiable() == null) ? 0 : getIsModifiable().hashCode());
        hashCode = prime * hashCode
                + ((getIsCollection() == null) ? 0 : getIsCollection().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OptionSetting == false)
            return false;
        OptionSetting other = (OptionSetting) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
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
        if (other.getIsCollection() == null ^ this.getIsCollection() == null)
            return false;
        if (other.getIsCollection() != null
                && other.getIsCollection().equals(this.getIsCollection()) == false)
            return false;
        return true;
    }
}
