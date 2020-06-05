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

package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;

/**
 * <p>
 * Information about a parameter used to provision a product.
 * </p>
 */
public class ProvisioningArtifactParameter implements Serializable {
    /**
     * <p>
     * The parameter key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     */
    private String parameterKey;

    /**
     * <p>
     * The default value.
     * </p>
     */
    private String defaultValue;

    /**
     * <p>
     * The parameter type.
     * </p>
     */
    private String parameterType;

    /**
     * <p>
     * If this value is true, the value for this parameter is obfuscated from
     * view when the parameter is retrieved. This parameter is used to hide
     * sensitive information.
     * </p>
     */
    private Boolean isNoEcho;

    /**
     * <p>
     * The description of the parameter.
     * </p>
     */
    private String description;

    /**
     * <p>
     * Constraints that the administrator has put on a parameter.
     * </p>
     */
    private ParameterConstraints parameterConstraints;

    /**
     * <p>
     * The parameter key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @return <p>
     *         The parameter key.
     *         </p>
     */
    public String getParameterKey() {
        return parameterKey;
    }

    /**
     * <p>
     * The parameter key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @param parameterKey <p>
     *            The parameter key.
     *            </p>
     */
    public void setParameterKey(String parameterKey) {
        this.parameterKey = parameterKey;
    }

    /**
     * <p>
     * The parameter key.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @param parameterKey <p>
     *            The parameter key.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProvisioningArtifactParameter withParameterKey(String parameterKey) {
        this.parameterKey = parameterKey;
        return this;
    }

    /**
     * <p>
     * The default value.
     * </p>
     *
     * @return <p>
     *         The default value.
     *         </p>
     */
    public String getDefaultValue() {
        return defaultValue;
    }

    /**
     * <p>
     * The default value.
     * </p>
     *
     * @param defaultValue <p>
     *            The default value.
     *            </p>
     */
    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    /**
     * <p>
     * The default value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param defaultValue <p>
     *            The default value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProvisioningArtifactParameter withDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }

    /**
     * <p>
     * The parameter type.
     * </p>
     *
     * @return <p>
     *         The parameter type.
     *         </p>
     */
    public String getParameterType() {
        return parameterType;
    }

    /**
     * <p>
     * The parameter type.
     * </p>
     *
     * @param parameterType <p>
     *            The parameter type.
     *            </p>
     */
    public void setParameterType(String parameterType) {
        this.parameterType = parameterType;
    }

    /**
     * <p>
     * The parameter type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parameterType <p>
     *            The parameter type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProvisioningArtifactParameter withParameterType(String parameterType) {
        this.parameterType = parameterType;
        return this;
    }

    /**
     * <p>
     * If this value is true, the value for this parameter is obfuscated from
     * view when the parameter is retrieved. This parameter is used to hide
     * sensitive information.
     * </p>
     *
     * @return <p>
     *         If this value is true, the value for this parameter is obfuscated
     *         from view when the parameter is retrieved. This parameter is used
     *         to hide sensitive information.
     *         </p>
     */
    public Boolean isIsNoEcho() {
        return isNoEcho;
    }

    /**
     * <p>
     * If this value is true, the value for this parameter is obfuscated from
     * view when the parameter is retrieved. This parameter is used to hide
     * sensitive information.
     * </p>
     *
     * @return <p>
     *         If this value is true, the value for this parameter is obfuscated
     *         from view when the parameter is retrieved. This parameter is used
     *         to hide sensitive information.
     *         </p>
     */
    public Boolean getIsNoEcho() {
        return isNoEcho;
    }

    /**
     * <p>
     * If this value is true, the value for this parameter is obfuscated from
     * view when the parameter is retrieved. This parameter is used to hide
     * sensitive information.
     * </p>
     *
     * @param isNoEcho <p>
     *            If this value is true, the value for this parameter is
     *            obfuscated from view when the parameter is retrieved. This
     *            parameter is used to hide sensitive information.
     *            </p>
     */
    public void setIsNoEcho(Boolean isNoEcho) {
        this.isNoEcho = isNoEcho;
    }

    /**
     * <p>
     * If this value is true, the value for this parameter is obfuscated from
     * view when the parameter is retrieved. This parameter is used to hide
     * sensitive information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param isNoEcho <p>
     *            If this value is true, the value for this parameter is
     *            obfuscated from view when the parameter is retrieved. This
     *            parameter is used to hide sensitive information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProvisioningArtifactParameter withIsNoEcho(Boolean isNoEcho) {
        this.isNoEcho = isNoEcho;
        return this;
    }

    /**
     * <p>
     * The description of the parameter.
     * </p>
     *
     * @return <p>
     *         The description of the parameter.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description of the parameter.
     * </p>
     *
     * @param description <p>
     *            The description of the parameter.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            The description of the parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProvisioningArtifactParameter withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * Constraints that the administrator has put on a parameter.
     * </p>
     *
     * @return <p>
     *         Constraints that the administrator has put on a parameter.
     *         </p>
     */
    public ParameterConstraints getParameterConstraints() {
        return parameterConstraints;
    }

    /**
     * <p>
     * Constraints that the administrator has put on a parameter.
     * </p>
     *
     * @param parameterConstraints <p>
     *            Constraints that the administrator has put on a parameter.
     *            </p>
     */
    public void setParameterConstraints(ParameterConstraints parameterConstraints) {
        this.parameterConstraints = parameterConstraints;
    }

    /**
     * <p>
     * Constraints that the administrator has put on a parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parameterConstraints <p>
     *            Constraints that the administrator has put on a parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProvisioningArtifactParameter withParameterConstraints(
            ParameterConstraints parameterConstraints) {
        this.parameterConstraints = parameterConstraints;
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
        if (getParameterKey() != null)
            sb.append("ParameterKey: " + getParameterKey() + ",");
        if (getDefaultValue() != null)
            sb.append("DefaultValue: " + getDefaultValue() + ",");
        if (getParameterType() != null)
            sb.append("ParameterType: " + getParameterType() + ",");
        if (getIsNoEcho() != null)
            sb.append("IsNoEcho: " + getIsNoEcho() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getParameterConstraints() != null)
            sb.append("ParameterConstraints: " + getParameterConstraints());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getParameterKey() == null) ? 0 : getParameterKey().hashCode());
        hashCode = prime * hashCode
                + ((getDefaultValue() == null) ? 0 : getDefaultValue().hashCode());
        hashCode = prime * hashCode
                + ((getParameterType() == null) ? 0 : getParameterType().hashCode());
        hashCode = prime * hashCode + ((getIsNoEcho() == null) ? 0 : getIsNoEcho().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getParameterConstraints() == null) ? 0 : getParameterConstraints().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProvisioningArtifactParameter == false)
            return false;
        ProvisioningArtifactParameter other = (ProvisioningArtifactParameter) obj;

        if (other.getParameterKey() == null ^ this.getParameterKey() == null)
            return false;
        if (other.getParameterKey() != null
                && other.getParameterKey().equals(this.getParameterKey()) == false)
            return false;
        if (other.getDefaultValue() == null ^ this.getDefaultValue() == null)
            return false;
        if (other.getDefaultValue() != null
                && other.getDefaultValue().equals(this.getDefaultValue()) == false)
            return false;
        if (other.getParameterType() == null ^ this.getParameterType() == null)
            return false;
        if (other.getParameterType() != null
                && other.getParameterType().equals(this.getParameterType()) == false)
            return false;
        if (other.getIsNoEcho() == null ^ this.getIsNoEcho() == null)
            return false;
        if (other.getIsNoEcho() != null && other.getIsNoEcho().equals(this.getIsNoEcho()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getParameterConstraints() == null ^ this.getParameterConstraints() == null)
            return false;
        if (other.getParameterConstraints() != null
                && other.getParameterConstraints().equals(this.getParameterConstraints()) == false)
            return false;
        return true;
    }
}
