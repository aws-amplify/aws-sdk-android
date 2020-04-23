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
 * Option group option settings are used to display settings available for each
 * option with their default values and other information. These values are used
 * with the DescribeOptionGroupOptions action.
 * </p>
 */
public class OptionGroupOptionSetting implements Serializable {
    /**
     * <p>
     * The name of the option group option.
     * </p>
     */
    private String settingName;

    /**
     * <p>
     * The description of the option group option.
     * </p>
     */
    private String settingDescription;

    /**
     * <p>
     * The default value for the option group option.
     * </p>
     */
    private String defaultValue;

    /**
     * <p>
     * The DB engine specific parameter type for the option group option.
     * </p>
     */
    private String applyType;

    /**
     * <p>
     * Indicates the acceptable values for the option group option.
     * </p>
     */
    private String allowedValues;

    /**
     * <p>
     * Boolean value where true indicates that this option group option can be
     * changed from the default value.
     * </p>
     */
    private Boolean isModifiable;

    /**
     * <p>
     * Boolean value where true indicates that a value must be specified for
     * this option setting of the option group option.
     * </p>
     */
    private Boolean isRequired;

    /**
     * <p>
     * The minimum DB engine version required for the corresponding allowed
     * value for this option setting.
     * </p>
     */
    private java.util.List<MinimumEngineVersionPerAllowedValue> minimumEngineVersionPerAllowedValue;

    /**
     * <p>
     * The name of the option group option.
     * </p>
     *
     * @return <p>
     *         The name of the option group option.
     *         </p>
     */
    public String getSettingName() {
        return settingName;
    }

    /**
     * <p>
     * The name of the option group option.
     * </p>
     *
     * @param settingName <p>
     *            The name of the option group option.
     *            </p>
     */
    public void setSettingName(String settingName) {
        this.settingName = settingName;
    }

    /**
     * <p>
     * The name of the option group option.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param settingName <p>
     *            The name of the option group option.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OptionGroupOptionSetting withSettingName(String settingName) {
        this.settingName = settingName;
        return this;
    }

    /**
     * <p>
     * The description of the option group option.
     * </p>
     *
     * @return <p>
     *         The description of the option group option.
     *         </p>
     */
    public String getSettingDescription() {
        return settingDescription;
    }

    /**
     * <p>
     * The description of the option group option.
     * </p>
     *
     * @param settingDescription <p>
     *            The description of the option group option.
     *            </p>
     */
    public void setSettingDescription(String settingDescription) {
        this.settingDescription = settingDescription;
    }

    /**
     * <p>
     * The description of the option group option.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param settingDescription <p>
     *            The description of the option group option.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OptionGroupOptionSetting withSettingDescription(String settingDescription) {
        this.settingDescription = settingDescription;
        return this;
    }

    /**
     * <p>
     * The default value for the option group option.
     * </p>
     *
     * @return <p>
     *         The default value for the option group option.
     *         </p>
     */
    public String getDefaultValue() {
        return defaultValue;
    }

    /**
     * <p>
     * The default value for the option group option.
     * </p>
     *
     * @param defaultValue <p>
     *            The default value for the option group option.
     *            </p>
     */
    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    /**
     * <p>
     * The default value for the option group option.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param defaultValue <p>
     *            The default value for the option group option.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OptionGroupOptionSetting withDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }

    /**
     * <p>
     * The DB engine specific parameter type for the option group option.
     * </p>
     *
     * @return <p>
     *         The DB engine specific parameter type for the option group
     *         option.
     *         </p>
     */
    public String getApplyType() {
        return applyType;
    }

    /**
     * <p>
     * The DB engine specific parameter type for the option group option.
     * </p>
     *
     * @param applyType <p>
     *            The DB engine specific parameter type for the option group
     *            option.
     *            </p>
     */
    public void setApplyType(String applyType) {
        this.applyType = applyType;
    }

    /**
     * <p>
     * The DB engine specific parameter type for the option group option.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param applyType <p>
     *            The DB engine specific parameter type for the option group
     *            option.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OptionGroupOptionSetting withApplyType(String applyType) {
        this.applyType = applyType;
        return this;
    }

    /**
     * <p>
     * Indicates the acceptable values for the option group option.
     * </p>
     *
     * @return <p>
     *         Indicates the acceptable values for the option group option.
     *         </p>
     */
    public String getAllowedValues() {
        return allowedValues;
    }

    /**
     * <p>
     * Indicates the acceptable values for the option group option.
     * </p>
     *
     * @param allowedValues <p>
     *            Indicates the acceptable values for the option group option.
     *            </p>
     */
    public void setAllowedValues(String allowedValues) {
        this.allowedValues = allowedValues;
    }

    /**
     * <p>
     * Indicates the acceptable values for the option group option.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param allowedValues <p>
     *            Indicates the acceptable values for the option group option.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OptionGroupOptionSetting withAllowedValues(String allowedValues) {
        this.allowedValues = allowedValues;
        return this;
    }

    /**
     * <p>
     * Boolean value where true indicates that this option group option can be
     * changed from the default value.
     * </p>
     *
     * @return <p>
     *         Boolean value where true indicates that this option group option
     *         can be changed from the default value.
     *         </p>
     */
    public Boolean isIsModifiable() {
        return isModifiable;
    }

    /**
     * <p>
     * Boolean value where true indicates that this option group option can be
     * changed from the default value.
     * </p>
     *
     * @return <p>
     *         Boolean value where true indicates that this option group option
     *         can be changed from the default value.
     *         </p>
     */
    public Boolean getIsModifiable() {
        return isModifiable;
    }

    /**
     * <p>
     * Boolean value where true indicates that this option group option can be
     * changed from the default value.
     * </p>
     *
     * @param isModifiable <p>
     *            Boolean value where true indicates that this option group
     *            option can be changed from the default value.
     *            </p>
     */
    public void setIsModifiable(Boolean isModifiable) {
        this.isModifiable = isModifiable;
    }

    /**
     * <p>
     * Boolean value where true indicates that this option group option can be
     * changed from the default value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param isModifiable <p>
     *            Boolean value where true indicates that this option group
     *            option can be changed from the default value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OptionGroupOptionSetting withIsModifiable(Boolean isModifiable) {
        this.isModifiable = isModifiable;
        return this;
    }

    /**
     * <p>
     * Boolean value where true indicates that a value must be specified for
     * this option setting of the option group option.
     * </p>
     *
     * @return <p>
     *         Boolean value where true indicates that a value must be specified
     *         for this option setting of the option group option.
     *         </p>
     */
    public Boolean isIsRequired() {
        return isRequired;
    }

    /**
     * <p>
     * Boolean value where true indicates that a value must be specified for
     * this option setting of the option group option.
     * </p>
     *
     * @return <p>
     *         Boolean value where true indicates that a value must be specified
     *         for this option setting of the option group option.
     *         </p>
     */
    public Boolean getIsRequired() {
        return isRequired;
    }

    /**
     * <p>
     * Boolean value where true indicates that a value must be specified for
     * this option setting of the option group option.
     * </p>
     *
     * @param isRequired <p>
     *            Boolean value where true indicates that a value must be
     *            specified for this option setting of the option group option.
     *            </p>
     */
    public void setIsRequired(Boolean isRequired) {
        this.isRequired = isRequired;
    }

    /**
     * <p>
     * Boolean value where true indicates that a value must be specified for
     * this option setting of the option group option.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param isRequired <p>
     *            Boolean value where true indicates that a value must be
     *            specified for this option setting of the option group option.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OptionGroupOptionSetting withIsRequired(Boolean isRequired) {
        this.isRequired = isRequired;
        return this;
    }

    /**
     * <p>
     * The minimum DB engine version required for the corresponding allowed
     * value for this option setting.
     * </p>
     *
     * @return <p>
     *         The minimum DB engine version required for the corresponding
     *         allowed value for this option setting.
     *         </p>
     */
    public java.util.List<MinimumEngineVersionPerAllowedValue> getMinimumEngineVersionPerAllowedValue() {
        return minimumEngineVersionPerAllowedValue;
    }

    /**
     * <p>
     * The minimum DB engine version required for the corresponding allowed
     * value for this option setting.
     * </p>
     *
     * @param minimumEngineVersionPerAllowedValue <p>
     *            The minimum DB engine version required for the corresponding
     *            allowed value for this option setting.
     *            </p>
     */
    public void setMinimumEngineVersionPerAllowedValue(
            java.util.Collection<MinimumEngineVersionPerAllowedValue> minimumEngineVersionPerAllowedValue) {
        if (minimumEngineVersionPerAllowedValue == null) {
            this.minimumEngineVersionPerAllowedValue = null;
            return;
        }

        this.minimumEngineVersionPerAllowedValue = new java.util.ArrayList<MinimumEngineVersionPerAllowedValue>(
                minimumEngineVersionPerAllowedValue);
    }

    /**
     * <p>
     * The minimum DB engine version required for the corresponding allowed
     * value for this option setting.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param minimumEngineVersionPerAllowedValue <p>
     *            The minimum DB engine version required for the corresponding
     *            allowed value for this option setting.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OptionGroupOptionSetting withMinimumEngineVersionPerAllowedValue(
            MinimumEngineVersionPerAllowedValue... minimumEngineVersionPerAllowedValue) {
        if (getMinimumEngineVersionPerAllowedValue() == null) {
            this.minimumEngineVersionPerAllowedValue = new java.util.ArrayList<MinimumEngineVersionPerAllowedValue>(
                    minimumEngineVersionPerAllowedValue.length);
        }
        for (MinimumEngineVersionPerAllowedValue value : minimumEngineVersionPerAllowedValue) {
            this.minimumEngineVersionPerAllowedValue.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The minimum DB engine version required for the corresponding allowed
     * value for this option setting.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param minimumEngineVersionPerAllowedValue <p>
     *            The minimum DB engine version required for the corresponding
     *            allowed value for this option setting.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OptionGroupOptionSetting withMinimumEngineVersionPerAllowedValue(
            java.util.Collection<MinimumEngineVersionPerAllowedValue> minimumEngineVersionPerAllowedValue) {
        setMinimumEngineVersionPerAllowedValue(minimumEngineVersionPerAllowedValue);
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
        if (getSettingName() != null)
            sb.append("SettingName: " + getSettingName() + ",");
        if (getSettingDescription() != null)
            sb.append("SettingDescription: " + getSettingDescription() + ",");
        if (getDefaultValue() != null)
            sb.append("DefaultValue: " + getDefaultValue() + ",");
        if (getApplyType() != null)
            sb.append("ApplyType: " + getApplyType() + ",");
        if (getAllowedValues() != null)
            sb.append("AllowedValues: " + getAllowedValues() + ",");
        if (getIsModifiable() != null)
            sb.append("IsModifiable: " + getIsModifiable() + ",");
        if (getIsRequired() != null)
            sb.append("IsRequired: " + getIsRequired() + ",");
        if (getMinimumEngineVersionPerAllowedValue() != null)
            sb.append("MinimumEngineVersionPerAllowedValue: "
                    + getMinimumEngineVersionPerAllowedValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSettingName() == null) ? 0 : getSettingName().hashCode());
        hashCode = prime * hashCode
                + ((getSettingDescription() == null) ? 0 : getSettingDescription().hashCode());
        hashCode = prime * hashCode
                + ((getDefaultValue() == null) ? 0 : getDefaultValue().hashCode());
        hashCode = prime * hashCode + ((getApplyType() == null) ? 0 : getApplyType().hashCode());
        hashCode = prime * hashCode
                + ((getAllowedValues() == null) ? 0 : getAllowedValues().hashCode());
        hashCode = prime * hashCode
                + ((getIsModifiable() == null) ? 0 : getIsModifiable().hashCode());
        hashCode = prime * hashCode + ((getIsRequired() == null) ? 0 : getIsRequired().hashCode());
        hashCode = prime
                * hashCode
                + ((getMinimumEngineVersionPerAllowedValue() == null) ? 0
                        : getMinimumEngineVersionPerAllowedValue().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OptionGroupOptionSetting == false)
            return false;
        OptionGroupOptionSetting other = (OptionGroupOptionSetting) obj;

        if (other.getSettingName() == null ^ this.getSettingName() == null)
            return false;
        if (other.getSettingName() != null
                && other.getSettingName().equals(this.getSettingName()) == false)
            return false;
        if (other.getSettingDescription() == null ^ this.getSettingDescription() == null)
            return false;
        if (other.getSettingDescription() != null
                && other.getSettingDescription().equals(this.getSettingDescription()) == false)
            return false;
        if (other.getDefaultValue() == null ^ this.getDefaultValue() == null)
            return false;
        if (other.getDefaultValue() != null
                && other.getDefaultValue().equals(this.getDefaultValue()) == false)
            return false;
        if (other.getApplyType() == null ^ this.getApplyType() == null)
            return false;
        if (other.getApplyType() != null
                && other.getApplyType().equals(this.getApplyType()) == false)
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
        if (other.getIsRequired() == null ^ this.getIsRequired() == null)
            return false;
        if (other.getIsRequired() != null
                && other.getIsRequired().equals(this.getIsRequired()) == false)
            return false;
        if (other.getMinimumEngineVersionPerAllowedValue() == null
                ^ this.getMinimumEngineVersionPerAllowedValue() == null)
            return false;
        if (other.getMinimumEngineVersionPerAllowedValue() != null
                && other.getMinimumEngineVersionPerAllowedValue().equals(
                        this.getMinimumEngineVersionPerAllowedValue()) == false)
            return false;
        return true;
    }
}
