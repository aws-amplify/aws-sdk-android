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

package com.amazonaws.services.glue.model;

import java.io.Serializable;

/**
 * <p>
 * An argument or property of a node.
 * </p>
 */
public class CodeGenNodeArg implements Serializable {
    /**
     * <p>
     * The name of the argument or property.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The value of the argument or property.
     * </p>
     */
    private String value;

    /**
     * <p>
     * True if the value is used as a parameter.
     * </p>
     */
    private Boolean param;

    /**
     * <p>
     * The name of the argument or property.
     * </p>
     *
     * @return <p>
     *         The name of the argument or property.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the argument or property.
     * </p>
     *
     * @param name <p>
     *            The name of the argument or property.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the argument or property.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            The name of the argument or property.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CodeGenNodeArg withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The value of the argument or property.
     * </p>
     *
     * @return <p>
     *         The value of the argument or property.
     *         </p>
     */
    public String getValue() {
        return value;
    }

    /**
     * <p>
     * The value of the argument or property.
     * </p>
     *
     * @param value <p>
     *            The value of the argument or property.
     *            </p>
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value of the argument or property.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param value <p>
     *            The value of the argument or property.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CodeGenNodeArg withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * <p>
     * True if the value is used as a parameter.
     * </p>
     *
     * @return <p>
     *         True if the value is used as a parameter.
     *         </p>
     */
    public Boolean isParam() {
        return param;
    }

    /**
     * <p>
     * True if the value is used as a parameter.
     * </p>
     *
     * @return <p>
     *         True if the value is used as a parameter.
     *         </p>
     */
    public Boolean getParam() {
        return param;
    }

    /**
     * <p>
     * True if the value is used as a parameter.
     * </p>
     *
     * @param param <p>
     *            True if the value is used as a parameter.
     *            </p>
     */
    public void setParam(Boolean param) {
        this.param = param;
    }

    /**
     * <p>
     * True if the value is used as a parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param param <p>
     *            True if the value is used as a parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CodeGenNodeArg withParam(Boolean param) {
        this.param = param;
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
        if (getParam() != null)
            sb.append("Param: " + getParam());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getParam() == null) ? 0 : getParam().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CodeGenNodeArg == false)
            return false;
        CodeGenNodeArg other = (CodeGenNodeArg) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getParam() == null ^ this.getParam() == null)
            return false;
        if (other.getParam() != null && other.getParam().equals(this.getParam()) == false)
            return false;
        return true;
    }
}
