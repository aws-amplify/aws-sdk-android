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
package com.amazonaws.services.aws-android-sdk-ssm.model;

import java.io.Serializable;


/**
 * <p>Parameters specified in a System Manager document that run on the server when the command is run. </p>
 */
public class DocumentParameter implements Serializable {
    /**
     * <p>The name of the parameter.</p>
     */
    private String name;

    /**
     * <p>The type of parameter. The type can be either String or StringList.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>String, StringList
     */
    private String type;

    /**
     * <p>A description of what the parameter does, how to use it, the default value, and whether or not the parameter is optional.</p>
     */
    private String description;

    /**
     * <p>If specified, the default values for the parameters. Parameters without a default value are required. Parameters with a default value are optional.</p>
     */
    private String defaultValue;

    /**
     * <p>The name of the parameter.</p>
     *
     * @return <p>The name of the parameter.</p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>The name of the parameter.</p>
     *
     * @param name <p>The name of the parameter.</p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>The name of the parameter.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param name <p>The name of the parameter.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DocumentParameter withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>The type of parameter. The type can be either String or StringList.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>String, StringList
     *
     * @return <p>The type of parameter. The type can be either String or StringList.</p>
     *
     * @see DocumentParameterType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>The type of parameter. The type can be either String or StringList.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>String, StringList
     *
     * @param type <p>The type of parameter. The type can be either String or StringList.</p>
     *
     * @see DocumentParameterType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>The type of parameter. The type can be either String or StringList.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>String, StringList
     *
     * @param type <p>The type of parameter. The type can be either String or StringList.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see DocumentParameterType
     */
    public DocumentParameter withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>The type of parameter. The type can be either String or StringList.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>String, StringList
     *
     * @param type <p>The type of parameter. The type can be either String or StringList.</p>
     *
     * @see DocumentParameterType
     */
    public void setType(DocumentParameterType type) {
        this.type = type.toString();
    }

    /**
     * <p>The type of parameter. The type can be either String or StringList.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>String, StringList
     *
     * @param type <p>The type of parameter. The type can be either String or StringList.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see DocumentParameterType
     */
    public DocumentParameter withType(DocumentParameterType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>A description of what the parameter does, how to use it, the default value, and whether or not the parameter is optional.</p>
     *
     * @return <p>A description of what the parameter does, how to use it, the default value, and whether or not the parameter is optional.</p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>A description of what the parameter does, how to use it, the default value, and whether or not the parameter is optional.</p>
     *
     * @param description <p>A description of what the parameter does, how to use it, the default value, and whether or not the parameter is optional.</p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>A description of what the parameter does, how to use it, the default value, and whether or not the parameter is optional.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param description <p>A description of what the parameter does, how to use it, the default value, and whether or not the parameter is optional.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DocumentParameter withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>If specified, the default values for the parameters. Parameters without a default value are required. Parameters with a default value are optional.</p>
     *
     * @return <p>If specified, the default values for the parameters. Parameters without a default value are required. Parameters with a default value are optional.</p>
     */
    public String getDefaultValue() {
        return defaultValue;
    }

    /**
     * <p>If specified, the default values for the parameters. Parameters without a default value are required. Parameters with a default value are optional.</p>
     *
     * @param defaultValue <p>If specified, the default values for the parameters. Parameters without a default value are required. Parameters with a default value are optional.</p>
     */
    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    /**
     * <p>If specified, the default values for the parameters. Parameters without a default value are required. Parameters with a default value are optional.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param defaultValue <p>If specified, the default values for the parameters. Parameters without a default value are required. Parameters with a default value are optional.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DocumentParameter withDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getName() != null) sb.append("Name: " + getName() + ",");
        if (getType() != null) sb.append("Type: " + getType() + ",");
        if (getDescription() != null) sb.append("Description: " + getDescription() + ",");
        if (getDefaultValue() != null) sb.append("DefaultValue: " + getDefaultValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDefaultValue() == null) ? 0 : getDefaultValue().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DocumentParameter == false) return false;
        DocumentParameter other = (DocumentParameter)obj;

        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false;
        if (other.getType() == null ^ this.getType() == null) return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false) return false;
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false;
        if (other.getDefaultValue() == null ^ this.getDefaultValue() == null) return false;
        if (other.getDefaultValue() != null && other.getDefaultValue().equals(this.getDefaultValue()) == false) return false;
        return true;
    }
}
