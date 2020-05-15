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
 * The TemplateParameter data type.
 * </p>
 */
public class TemplateParameter implements Serializable {
    /**
     * <p>
     * The name associated with the parameter.
     * </p>
     */
    private String parameterKey;

    /**
     * <p>
     * The default value associated with the parameter.
     * </p>
     */
    private String defaultValue;

    /**
     * <p>
     * Flag indicating whether the parameter should be displayed as plain text
     * in logs and UIs.
     * </p>
     */
    private Boolean noEcho;

    /**
     * <p>
     * User defined description associated with the parameter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String description;

    /**
     * <p>
     * The name associated with the parameter.
     * </p>
     *
     * @return <p>
     *         The name associated with the parameter.
     *         </p>
     */
    public String getParameterKey() {
        return parameterKey;
    }

    /**
     * <p>
     * The name associated with the parameter.
     * </p>
     *
     * @param parameterKey <p>
     *            The name associated with the parameter.
     *            </p>
     */
    public void setParameterKey(String parameterKey) {
        this.parameterKey = parameterKey;
    }

    /**
     * <p>
     * The name associated with the parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parameterKey <p>
     *            The name associated with the parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TemplateParameter withParameterKey(String parameterKey) {
        this.parameterKey = parameterKey;
        return this;
    }

    /**
     * <p>
     * The default value associated with the parameter.
     * </p>
     *
     * @return <p>
     *         The default value associated with the parameter.
     *         </p>
     */
    public String getDefaultValue() {
        return defaultValue;
    }

    /**
     * <p>
     * The default value associated with the parameter.
     * </p>
     *
     * @param defaultValue <p>
     *            The default value associated with the parameter.
     *            </p>
     */
    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    /**
     * <p>
     * The default value associated with the parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param defaultValue <p>
     *            The default value associated with the parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TemplateParameter withDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }

    /**
     * <p>
     * Flag indicating whether the parameter should be displayed as plain text
     * in logs and UIs.
     * </p>
     *
     * @return <p>
     *         Flag indicating whether the parameter should be displayed as
     *         plain text in logs and UIs.
     *         </p>
     */
    public Boolean isNoEcho() {
        return noEcho;
    }

    /**
     * <p>
     * Flag indicating whether the parameter should be displayed as plain text
     * in logs and UIs.
     * </p>
     *
     * @return <p>
     *         Flag indicating whether the parameter should be displayed as
     *         plain text in logs and UIs.
     *         </p>
     */
    public Boolean getNoEcho() {
        return noEcho;
    }

    /**
     * <p>
     * Flag indicating whether the parameter should be displayed as plain text
     * in logs and UIs.
     * </p>
     *
     * @param noEcho <p>
     *            Flag indicating whether the parameter should be displayed as
     *            plain text in logs and UIs.
     *            </p>
     */
    public void setNoEcho(Boolean noEcho) {
        this.noEcho = noEcho;
    }

    /**
     * <p>
     * Flag indicating whether the parameter should be displayed as plain text
     * in logs and UIs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param noEcho <p>
     *            Flag indicating whether the parameter should be displayed as
     *            plain text in logs and UIs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TemplateParameter withNoEcho(Boolean noEcho) {
        this.noEcho = noEcho;
        return this;
    }

    /**
     * <p>
     * User defined description associated with the parameter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         User defined description associated with the parameter.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * User defined description associated with the parameter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param description <p>
     *            User defined description associated with the parameter.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * User defined description associated with the parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param description <p>
     *            User defined description associated with the parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TemplateParameter withDescription(String description) {
        this.description = description;
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
        if (getNoEcho() != null)
            sb.append("NoEcho: " + getNoEcho() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription());
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
        hashCode = prime * hashCode + ((getNoEcho() == null) ? 0 : getNoEcho().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TemplateParameter == false)
            return false;
        TemplateParameter other = (TemplateParameter) obj;

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
        if (other.getNoEcho() == null ^ this.getNoEcho() == null)
            return false;
        if (other.getNoEcho() != null && other.getNoEcho().equals(this.getNoEcho()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }
}
