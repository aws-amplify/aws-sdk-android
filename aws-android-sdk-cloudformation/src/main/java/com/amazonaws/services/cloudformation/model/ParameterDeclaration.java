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

package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;

/**
 * <p>
 * The ParameterDeclaration data type.
 * </p>
 */
public class ParameterDeclaration implements Serializable {
    /**
     * <p>
     * The name that is associated with the parameter.
     * </p>
     */
    private String parameterKey;

    /**
     * <p>
     * The default value of the parameter.
     * </p>
     */
    private String defaultValue;

    /**
     * <p>
     * The type of parameter.
     * </p>
     */
    private String parameterType;

    /**
     * <p>
     * Flag that indicates whether the parameter value is shown as plain text in
     * logs and in the AWS Management Console.
     * </p>
     */
    private Boolean noEcho;

    /**
     * <p>
     * The description that is associate with the parameter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String description;

    /**
     * <p>
     * The criteria that AWS CloudFormation uses to validate parameter values.
     * </p>
     */
    private ParameterConstraints parameterConstraints;

    /**
     * <p>
     * The name that is associated with the parameter.
     * </p>
     *
     * @return <p>
     *         The name that is associated with the parameter.
     *         </p>
     */
    public String getParameterKey() {
        return parameterKey;
    }

    /**
     * <p>
     * The name that is associated with the parameter.
     * </p>
     *
     * @param parameterKey <p>
     *            The name that is associated with the parameter.
     *            </p>
     */
    public void setParameterKey(String parameterKey) {
        this.parameterKey = parameterKey;
    }

    /**
     * <p>
     * The name that is associated with the parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parameterKey <p>
     *            The name that is associated with the parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ParameterDeclaration withParameterKey(String parameterKey) {
        this.parameterKey = parameterKey;
        return this;
    }

    /**
     * <p>
     * The default value of the parameter.
     * </p>
     *
     * @return <p>
     *         The default value of the parameter.
     *         </p>
     */
    public String getDefaultValue() {
        return defaultValue;
    }

    /**
     * <p>
     * The default value of the parameter.
     * </p>
     *
     * @param defaultValue <p>
     *            The default value of the parameter.
     *            </p>
     */
    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    /**
     * <p>
     * The default value of the parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param defaultValue <p>
     *            The default value of the parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ParameterDeclaration withDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }

    /**
     * <p>
     * The type of parameter.
     * </p>
     *
     * @return <p>
     *         The type of parameter.
     *         </p>
     */
    public String getParameterType() {
        return parameterType;
    }

    /**
     * <p>
     * The type of parameter.
     * </p>
     *
     * @param parameterType <p>
     *            The type of parameter.
     *            </p>
     */
    public void setParameterType(String parameterType) {
        this.parameterType = parameterType;
    }

    /**
     * <p>
     * The type of parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parameterType <p>
     *            The type of parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ParameterDeclaration withParameterType(String parameterType) {
        this.parameterType = parameterType;
        return this;
    }

    /**
     * <p>
     * Flag that indicates whether the parameter value is shown as plain text in
     * logs and in the AWS Management Console.
     * </p>
     *
     * @return <p>
     *         Flag that indicates whether the parameter value is shown as plain
     *         text in logs and in the AWS Management Console.
     *         </p>
     */
    public Boolean isNoEcho() {
        return noEcho;
    }

    /**
     * <p>
     * Flag that indicates whether the parameter value is shown as plain text in
     * logs and in the AWS Management Console.
     * </p>
     *
     * @return <p>
     *         Flag that indicates whether the parameter value is shown as plain
     *         text in logs and in the AWS Management Console.
     *         </p>
     */
    public Boolean getNoEcho() {
        return noEcho;
    }

    /**
     * <p>
     * Flag that indicates whether the parameter value is shown as plain text in
     * logs and in the AWS Management Console.
     * </p>
     *
     * @param noEcho <p>
     *            Flag that indicates whether the parameter value is shown as
     *            plain text in logs and in the AWS Management Console.
     *            </p>
     */
    public void setNoEcho(Boolean noEcho) {
        this.noEcho = noEcho;
    }

    /**
     * <p>
     * Flag that indicates whether the parameter value is shown as plain text in
     * logs and in the AWS Management Console.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param noEcho <p>
     *            Flag that indicates whether the parameter value is shown as
     *            plain text in logs and in the AWS Management Console.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ParameterDeclaration withNoEcho(Boolean noEcho) {
        this.noEcho = noEcho;
        return this;
    }

    /**
     * <p>
     * The description that is associate with the parameter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         The description that is associate with the parameter.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description that is associate with the parameter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param description <p>
     *            The description that is associate with the parameter.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description that is associate with the parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param description <p>
     *            The description that is associate with the parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ParameterDeclaration withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The criteria that AWS CloudFormation uses to validate parameter values.
     * </p>
     *
     * @return <p>
     *         The criteria that AWS CloudFormation uses to validate parameter
     *         values.
     *         </p>
     */
    public ParameterConstraints getParameterConstraints() {
        return parameterConstraints;
    }

    /**
     * <p>
     * The criteria that AWS CloudFormation uses to validate parameter values.
     * </p>
     *
     * @param parameterConstraints <p>
     *            The criteria that AWS CloudFormation uses to validate
     *            parameter values.
     *            </p>
     */
    public void setParameterConstraints(ParameterConstraints parameterConstraints) {
        this.parameterConstraints = parameterConstraints;
    }

    /**
     * <p>
     * The criteria that AWS CloudFormation uses to validate parameter values.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parameterConstraints <p>
     *            The criteria that AWS CloudFormation uses to validate
     *            parameter values.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ParameterDeclaration withParameterConstraints(ParameterConstraints parameterConstraints) {
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
        if (getNoEcho() != null)
            sb.append("NoEcho: " + getNoEcho() + ",");
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
        hashCode = prime * hashCode + ((getNoEcho() == null) ? 0 : getNoEcho().hashCode());
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

        if (obj instanceof ParameterDeclaration == false)
            return false;
        ParameterDeclaration other = (ParameterDeclaration) obj;

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
        if (other.getNoEcho() == null ^ this.getNoEcho() == null)
            return false;
        if (other.getNoEcho() != null && other.getNoEcho().equals(this.getNoEcho()) == false)
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
