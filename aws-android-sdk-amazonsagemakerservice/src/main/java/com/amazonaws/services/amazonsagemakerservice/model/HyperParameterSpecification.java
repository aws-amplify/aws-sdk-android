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

package com.amazonaws.services.amazonsagemakerservice.model;

import java.io.Serializable;

/**
 * <p>
 * Defines a hyperparameter to be used by an algorithm.
 * </p>
 */
public class HyperParameterSpecification implements Serializable {
    /**
     * <p>
     * The name of this hyperparameter. The name must be unique.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{Z}\p{S}\p{N}\p{P}]*<br/>
     */
    private String name;

    /**
     * <p>
     * A brief description of the hyperparameter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{Z}\p{S}\p{N}\p{P}]*<br/>
     */
    private String description;

    /**
     * <p>
     * The type of this hyperparameter. The valid types are <code>Integer</code>, <code>Continuous</code>, <code>Categorical</code>, and
     * <code>FreeText</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Integer, Continuous, Categorical, FreeText
     */
    private String type;

    /**
     * <p>
     * The allowed range for this hyperparameter.
     * </p>
     */
    private ParameterRange range;

    /**
     * <p>
     * Indicates whether this hyperparameter is tunable in a hyperparameter
     * tuning job.
     * </p>
     */
    private Boolean isTunable;

    /**
     * <p>
     * Indicates whether this hyperparameter is required.
     * </p>
     */
    private Boolean isRequired;

    /**
     * <p>
     * The default value for this hyperparameter. If a default value is
     * specified, a hyperparameter cannot be required.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>.*<br/>
     */
    private String defaultValue;

    /**
     * <p>
     * The name of this hyperparameter. The name must be unique.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{Z}\p{S}\p{N}\p{P}]*<br/>
     *
     * @return <p>
     *         The name of this hyperparameter. The name must be unique.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of this hyperparameter. The name must be unique.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{Z}\p{S}\p{N}\p{P}]*<br/>
     *
     * @param name <p>
     *            The name of this hyperparameter. The name must be unique.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of this hyperparameter. The name must be unique.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{Z}\p{S}\p{N}\p{P}]*<br/>
     *
     * @param name <p>
     *            The name of this hyperparameter. The name must be unique.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HyperParameterSpecification withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * A brief description of the hyperparameter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{Z}\p{S}\p{N}\p{P}]*<br/>
     *
     * @return <p>
     *         A brief description of the hyperparameter.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A brief description of the hyperparameter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{Z}\p{S}\p{N}\p{P}]*<br/>
     *
     * @param description <p>
     *            A brief description of the hyperparameter.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A brief description of the hyperparameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{Z}\p{S}\p{N}\p{P}]*<br/>
     *
     * @param description <p>
     *            A brief description of the hyperparameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HyperParameterSpecification withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The type of this hyperparameter. The valid types are <code>Integer</code>, <code>Continuous</code>, <code>Categorical</code>, and
     * <code>FreeText</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Integer, Continuous, Categorical, FreeText
     *
     * @return <p>
     *         The type of this hyperparameter. The valid types are
     *         <code>Integer</code>, <code>Continuous</code>,
     *         <code>Categorical</code>, and <code>FreeText</code>.
     *         </p>
     * @see ParameterType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of this hyperparameter. The valid types are <code>Integer</code>, <code>Continuous</code>, <code>Categorical</code>, and
     * <code>FreeText</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Integer, Continuous, Categorical, FreeText
     *
     * @param type <p>
     *            The type of this hyperparameter. The valid types are
     *            <code>Integer</code>, <code>Continuous</code>,
     *            <code>Categorical</code>, and <code>FreeText</code>.
     *            </p>
     * @see ParameterType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of this hyperparameter. The valid types are <code>Integer</code>, <code>Continuous</code>, <code>Categorical</code>, and
     * <code>FreeText</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Integer, Continuous, Categorical, FreeText
     *
     * @param type <p>
     *            The type of this hyperparameter. The valid types are
     *            <code>Integer</code>, <code>Continuous</code>,
     *            <code>Categorical</code>, and <code>FreeText</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ParameterType
     */
    public HyperParameterSpecification withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The type of this hyperparameter. The valid types are <code>Integer</code>, <code>Continuous</code>, <code>Categorical</code>, and
     * <code>FreeText</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Integer, Continuous, Categorical, FreeText
     *
     * @param type <p>
     *            The type of this hyperparameter. The valid types are
     *            <code>Integer</code>, <code>Continuous</code>,
     *            <code>Categorical</code>, and <code>FreeText</code>.
     *            </p>
     * @see ParameterType
     */
    public void setType(ParameterType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of this hyperparameter. The valid types are <code>Integer</code>, <code>Continuous</code>, <code>Categorical</code>, and
     * <code>FreeText</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Integer, Continuous, Categorical, FreeText
     *
     * @param type <p>
     *            The type of this hyperparameter. The valid types are
     *            <code>Integer</code>, <code>Continuous</code>,
     *            <code>Categorical</code>, and <code>FreeText</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ParameterType
     */
    public HyperParameterSpecification withType(ParameterType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The allowed range for this hyperparameter.
     * </p>
     *
     * @return <p>
     *         The allowed range for this hyperparameter.
     *         </p>
     */
    public ParameterRange getRange() {
        return range;
    }

    /**
     * <p>
     * The allowed range for this hyperparameter.
     * </p>
     *
     * @param range <p>
     *            The allowed range for this hyperparameter.
     *            </p>
     */
    public void setRange(ParameterRange range) {
        this.range = range;
    }

    /**
     * <p>
     * The allowed range for this hyperparameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param range <p>
     *            The allowed range for this hyperparameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HyperParameterSpecification withRange(ParameterRange range) {
        this.range = range;
        return this;
    }

    /**
     * <p>
     * Indicates whether this hyperparameter is tunable in a hyperparameter
     * tuning job.
     * </p>
     *
     * @return <p>
     *         Indicates whether this hyperparameter is tunable in a
     *         hyperparameter tuning job.
     *         </p>
     */
    public Boolean isIsTunable() {
        return isTunable;
    }

    /**
     * <p>
     * Indicates whether this hyperparameter is tunable in a hyperparameter
     * tuning job.
     * </p>
     *
     * @return <p>
     *         Indicates whether this hyperparameter is tunable in a
     *         hyperparameter tuning job.
     *         </p>
     */
    public Boolean getIsTunable() {
        return isTunable;
    }

    /**
     * <p>
     * Indicates whether this hyperparameter is tunable in a hyperparameter
     * tuning job.
     * </p>
     *
     * @param isTunable <p>
     *            Indicates whether this hyperparameter is tunable in a
     *            hyperparameter tuning job.
     *            </p>
     */
    public void setIsTunable(Boolean isTunable) {
        this.isTunable = isTunable;
    }

    /**
     * <p>
     * Indicates whether this hyperparameter is tunable in a hyperparameter
     * tuning job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param isTunable <p>
     *            Indicates whether this hyperparameter is tunable in a
     *            hyperparameter tuning job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HyperParameterSpecification withIsTunable(Boolean isTunable) {
        this.isTunable = isTunable;
        return this;
    }

    /**
     * <p>
     * Indicates whether this hyperparameter is required.
     * </p>
     *
     * @return <p>
     *         Indicates whether this hyperparameter is required.
     *         </p>
     */
    public Boolean isIsRequired() {
        return isRequired;
    }

    /**
     * <p>
     * Indicates whether this hyperparameter is required.
     * </p>
     *
     * @return <p>
     *         Indicates whether this hyperparameter is required.
     *         </p>
     */
    public Boolean getIsRequired() {
        return isRequired;
    }

    /**
     * <p>
     * Indicates whether this hyperparameter is required.
     * </p>
     *
     * @param isRequired <p>
     *            Indicates whether this hyperparameter is required.
     *            </p>
     */
    public void setIsRequired(Boolean isRequired) {
        this.isRequired = isRequired;
    }

    /**
     * <p>
     * Indicates whether this hyperparameter is required.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param isRequired <p>
     *            Indicates whether this hyperparameter is required.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HyperParameterSpecification withIsRequired(Boolean isRequired) {
        this.isRequired = isRequired;
        return this;
    }

    /**
     * <p>
     * The default value for this hyperparameter. If a default value is
     * specified, a hyperparameter cannot be required.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @return <p>
     *         The default value for this hyperparameter. If a default value is
     *         specified, a hyperparameter cannot be required.
     *         </p>
     */
    public String getDefaultValue() {
        return defaultValue;
    }

    /**
     * <p>
     * The default value for this hyperparameter. If a default value is
     * specified, a hyperparameter cannot be required.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param defaultValue <p>
     *            The default value for this hyperparameter. If a default value
     *            is specified, a hyperparameter cannot be required.
     *            </p>
     */
    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    /**
     * <p>
     * The default value for this hyperparameter. If a default value is
     * specified, a hyperparameter cannot be required.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param defaultValue <p>
     *            The default value for this hyperparameter. If a default value
     *            is specified, a hyperparameter cannot be required.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HyperParameterSpecification withDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
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
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getRange() != null)
            sb.append("Range: " + getRange() + ",");
        if (getIsTunable() != null)
            sb.append("IsTunable: " + getIsTunable() + ",");
        if (getIsRequired() != null)
            sb.append("IsRequired: " + getIsRequired() + ",");
        if (getDefaultValue() != null)
            sb.append("DefaultValue: " + getDefaultValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getRange() == null) ? 0 : getRange().hashCode());
        hashCode = prime * hashCode + ((getIsTunable() == null) ? 0 : getIsTunable().hashCode());
        hashCode = prime * hashCode + ((getIsRequired() == null) ? 0 : getIsRequired().hashCode());
        hashCode = prime * hashCode
                + ((getDefaultValue() == null) ? 0 : getDefaultValue().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HyperParameterSpecification == false)
            return false;
        HyperParameterSpecification other = (HyperParameterSpecification) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getRange() == null ^ this.getRange() == null)
            return false;
        if (other.getRange() != null && other.getRange().equals(this.getRange()) == false)
            return false;
        if (other.getIsTunable() == null ^ this.getIsTunable() == null)
            return false;
        if (other.getIsTunable() != null
                && other.getIsTunable().equals(this.getIsTunable()) == false)
            return false;
        if (other.getIsRequired() == null ^ this.getIsRequired() == null)
            return false;
        if (other.getIsRequired() != null
                && other.getIsRequired().equals(this.getIsRequired()) == false)
            return false;
        if (other.getDefaultValue() == null ^ this.getDefaultValue() == null)
            return false;
        if (other.getDefaultValue() != null
                && other.getDefaultValue().equals(this.getDefaultValue()) == false)
            return false;
        return true;
    }
}
