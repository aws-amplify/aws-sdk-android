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

package com.amazonaws.services.amazonredshift.model;

import java.io.Serializable;

/**
 * <p>
 * Describes a parameter in a cluster parameter group.
 * </p>
 */
public class Parameter implements Serializable {
    /**
     * <p>
     * The name of the parameter.
     * </p>
     */
    private String parameterName;

    /**
     * <p>
     * The value of the parameter.
     * </p>
     */
    private String parameterValue;

    /**
     * <p>
     * A description of the parameter.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The source of the parameter value, such as "engine-default" or "user".
     * </p>
     */
    private String source;

    /**
     * <p>
     * The data type of the parameter.
     * </p>
     */
    private String dataType;

    /**
     * <p>
     * The valid range of values for the parameter.
     * </p>
     */
    private String allowedValues;

    /**
     * <p>
     * Specifies how to apply the WLM configuration parameter. Some properties
     * can be applied dynamically, while other properties require that any
     * associated clusters be rebooted for the configuration changes to be
     * applied. For more information about parameters and parameter groups, go
     * to <a href=
     * "https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html"
     * >Amazon Redshift Parameter Groups</a> in the <i>Amazon Redshift Cluster
     * Management Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>static, dynamic
     */
    private String applyType;

    /**
     * <p>
     * If <code>true</code>, the parameter can be modified. Some parameters have
     * security or operational implications that prevent them from being
     * changed.
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
     * The name of the parameter.
     * </p>
     *
     * @return <p>
     *         The name of the parameter.
     *         </p>
     */
    public String getParameterName() {
        return parameterName;
    }

    /**
     * <p>
     * The name of the parameter.
     * </p>
     *
     * @param parameterName <p>
     *            The name of the parameter.
     *            </p>
     */
    public void setParameterName(String parameterName) {
        this.parameterName = parameterName;
    }

    /**
     * <p>
     * The name of the parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parameterName <p>
     *            The name of the parameter.
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
     * The value of the parameter.
     * </p>
     *
     * @return <p>
     *         The value of the parameter.
     *         </p>
     */
    public String getParameterValue() {
        return parameterValue;
    }

    /**
     * <p>
     * The value of the parameter.
     * </p>
     *
     * @param parameterValue <p>
     *            The value of the parameter.
     *            </p>
     */
    public void setParameterValue(String parameterValue) {
        this.parameterValue = parameterValue;
    }

    /**
     * <p>
     * The value of the parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parameterValue <p>
     *            The value of the parameter.
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
     * A description of the parameter.
     * </p>
     *
     * @return <p>
     *         A description of the parameter.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A description of the parameter.
     * </p>
     *
     * @param description <p>
     *            A description of the parameter.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            A description of the parameter.
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
     * The source of the parameter value, such as "engine-default" or "user".
     * </p>
     *
     * @return <p>
     *         The source of the parameter value, such as "engine-default" or
     *         "user".
     *         </p>
     */
    public String getSource() {
        return source;
    }

    /**
     * <p>
     * The source of the parameter value, such as "engine-default" or "user".
     * </p>
     *
     * @param source <p>
     *            The source of the parameter value, such as "engine-default" or
     *            "user".
     *            </p>
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * <p>
     * The source of the parameter value, such as "engine-default" or "user".
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param source <p>
     *            The source of the parameter value, such as "engine-default" or
     *            "user".
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
     * The data type of the parameter.
     * </p>
     *
     * @return <p>
     *         The data type of the parameter.
     *         </p>
     */
    public String getDataType() {
        return dataType;
    }

    /**
     * <p>
     * The data type of the parameter.
     * </p>
     *
     * @param dataType <p>
     *            The data type of the parameter.
     *            </p>
     */
    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    /**
     * <p>
     * The data type of the parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dataType <p>
     *            The data type of the parameter.
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
     * The valid range of values for the parameter.
     * </p>
     *
     * @return <p>
     *         The valid range of values for the parameter.
     *         </p>
     */
    public String getAllowedValues() {
        return allowedValues;
    }

    /**
     * <p>
     * The valid range of values for the parameter.
     * </p>
     *
     * @param allowedValues <p>
     *            The valid range of values for the parameter.
     *            </p>
     */
    public void setAllowedValues(String allowedValues) {
        this.allowedValues = allowedValues;
    }

    /**
     * <p>
     * The valid range of values for the parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param allowedValues <p>
     *            The valid range of values for the parameter.
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
     * Specifies how to apply the WLM configuration parameter. Some properties
     * can be applied dynamically, while other properties require that any
     * associated clusters be rebooted for the configuration changes to be
     * applied. For more information about parameters and parameter groups, go
     * to <a href=
     * "https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html"
     * >Amazon Redshift Parameter Groups</a> in the <i>Amazon Redshift Cluster
     * Management Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>static, dynamic
     *
     * @return <p>
     *         Specifies how to apply the WLM configuration parameter. Some
     *         properties can be applied dynamically, while other properties
     *         require that any associated clusters be rebooted for the
     *         configuration changes to be applied. For more information about
     *         parameters and parameter groups, go to <a href=
     *         "https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html"
     *         >Amazon Redshift Parameter Groups</a> in the <i>Amazon Redshift
     *         Cluster Management Guide</i>.
     *         </p>
     * @see ParameterApplyType
     */
    public String getApplyType() {
        return applyType;
    }

    /**
     * <p>
     * Specifies how to apply the WLM configuration parameter. Some properties
     * can be applied dynamically, while other properties require that any
     * associated clusters be rebooted for the configuration changes to be
     * applied. For more information about parameters and parameter groups, go
     * to <a href=
     * "https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html"
     * >Amazon Redshift Parameter Groups</a> in the <i>Amazon Redshift Cluster
     * Management Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>static, dynamic
     *
     * @param applyType <p>
     *            Specifies how to apply the WLM configuration parameter. Some
     *            properties can be applied dynamically, while other properties
     *            require that any associated clusters be rebooted for the
     *            configuration changes to be applied. For more information
     *            about parameters and parameter groups, go to <a href=
     *            "https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html"
     *            >Amazon Redshift Parameter Groups</a> in the <i>Amazon
     *            Redshift Cluster Management Guide</i>.
     *            </p>
     * @see ParameterApplyType
     */
    public void setApplyType(String applyType) {
        this.applyType = applyType;
    }

    /**
     * <p>
     * Specifies how to apply the WLM configuration parameter. Some properties
     * can be applied dynamically, while other properties require that any
     * associated clusters be rebooted for the configuration changes to be
     * applied. For more information about parameters and parameter groups, go
     * to <a href=
     * "https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html"
     * >Amazon Redshift Parameter Groups</a> in the <i>Amazon Redshift Cluster
     * Management Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>static, dynamic
     *
     * @param applyType <p>
     *            Specifies how to apply the WLM configuration parameter. Some
     *            properties can be applied dynamically, while other properties
     *            require that any associated clusters be rebooted for the
     *            configuration changes to be applied. For more information
     *            about parameters and parameter groups, go to <a href=
     *            "https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html"
     *            >Amazon Redshift Parameter Groups</a> in the <i>Amazon
     *            Redshift Cluster Management Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ParameterApplyType
     */
    public Parameter withApplyType(String applyType) {
        this.applyType = applyType;
        return this;
    }

    /**
     * <p>
     * Specifies how to apply the WLM configuration parameter. Some properties
     * can be applied dynamically, while other properties require that any
     * associated clusters be rebooted for the configuration changes to be
     * applied. For more information about parameters and parameter groups, go
     * to <a href=
     * "https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html"
     * >Amazon Redshift Parameter Groups</a> in the <i>Amazon Redshift Cluster
     * Management Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>static, dynamic
     *
     * @param applyType <p>
     *            Specifies how to apply the WLM configuration parameter. Some
     *            properties can be applied dynamically, while other properties
     *            require that any associated clusters be rebooted for the
     *            configuration changes to be applied. For more information
     *            about parameters and parameter groups, go to <a href=
     *            "https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html"
     *            >Amazon Redshift Parameter Groups</a> in the <i>Amazon
     *            Redshift Cluster Management Guide</i>.
     *            </p>
     * @see ParameterApplyType
     */
    public void setApplyType(ParameterApplyType applyType) {
        this.applyType = applyType.toString();
    }

    /**
     * <p>
     * Specifies how to apply the WLM configuration parameter. Some properties
     * can be applied dynamically, while other properties require that any
     * associated clusters be rebooted for the configuration changes to be
     * applied. For more information about parameters and parameter groups, go
     * to <a href=
     * "https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html"
     * >Amazon Redshift Parameter Groups</a> in the <i>Amazon Redshift Cluster
     * Management Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>static, dynamic
     *
     * @param applyType <p>
     *            Specifies how to apply the WLM configuration parameter. Some
     *            properties can be applied dynamically, while other properties
     *            require that any associated clusters be rebooted for the
     *            configuration changes to be applied. For more information
     *            about parameters and parameter groups, go to <a href=
     *            "https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html"
     *            >Amazon Redshift Parameter Groups</a> in the <i>Amazon
     *            Redshift Cluster Management Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ParameterApplyType
     */
    public Parameter withApplyType(ParameterApplyType applyType) {
        this.applyType = applyType.toString();
        return this;
    }

    /**
     * <p>
     * If <code>true</code>, the parameter can be modified. Some parameters have
     * security or operational implications that prevent them from being
     * changed.
     * </p>
     *
     * @return <p>
     *         If <code>true</code>, the parameter can be modified. Some
     *         parameters have security or operational implications that prevent
     *         them from being changed.
     *         </p>
     */
    public Boolean isIsModifiable() {
        return isModifiable;
    }

    /**
     * <p>
     * If <code>true</code>, the parameter can be modified. Some parameters have
     * security or operational implications that prevent them from being
     * changed.
     * </p>
     *
     * @return <p>
     *         If <code>true</code>, the parameter can be modified. Some
     *         parameters have security or operational implications that prevent
     *         them from being changed.
     *         </p>
     */
    public Boolean getIsModifiable() {
        return isModifiable;
    }

    /**
     * <p>
     * If <code>true</code>, the parameter can be modified. Some parameters have
     * security or operational implications that prevent them from being
     * changed.
     * </p>
     *
     * @param isModifiable <p>
     *            If <code>true</code>, the parameter can be modified. Some
     *            parameters have security or operational implications that
     *            prevent them from being changed.
     *            </p>
     */
    public void setIsModifiable(Boolean isModifiable) {
        this.isModifiable = isModifiable;
    }

    /**
     * <p>
     * If <code>true</code>, the parameter can be modified. Some parameters have
     * security or operational implications that prevent them from being
     * changed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param isModifiable <p>
     *            If <code>true</code>, the parameter can be modified. Some
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
        if (getDataType() != null)
            sb.append("DataType: " + getDataType() + ",");
        if (getAllowedValues() != null)
            sb.append("AllowedValues: " + getAllowedValues() + ",");
        if (getApplyType() != null)
            sb.append("ApplyType: " + getApplyType() + ",");
        if (getIsModifiable() != null)
            sb.append("IsModifiable: " + getIsModifiable() + ",");
        if (getMinimumEngineVersion() != null)
            sb.append("MinimumEngineVersion: " + getMinimumEngineVersion());
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
        hashCode = prime * hashCode + ((getDataType() == null) ? 0 : getDataType().hashCode());
        hashCode = prime * hashCode
                + ((getAllowedValues() == null) ? 0 : getAllowedValues().hashCode());
        hashCode = prime * hashCode + ((getApplyType() == null) ? 0 : getApplyType().hashCode());
        hashCode = prime * hashCode
                + ((getIsModifiable() == null) ? 0 : getIsModifiable().hashCode());
        hashCode = prime * hashCode
                + ((getMinimumEngineVersion() == null) ? 0 : getMinimumEngineVersion().hashCode());
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
        if (other.getDataType() == null ^ this.getDataType() == null)
            return false;
        if (other.getDataType() != null && other.getDataType().equals(this.getDataType()) == false)
            return false;
        if (other.getAllowedValues() == null ^ this.getAllowedValues() == null)
            return false;
        if (other.getAllowedValues() != null
                && other.getAllowedValues().equals(this.getAllowedValues()) == false)
            return false;
        if (other.getApplyType() == null ^ this.getApplyType() == null)
            return false;
        if (other.getApplyType() != null
                && other.getApplyType().equals(this.getApplyType()) == false)
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
        return true;
    }
}
