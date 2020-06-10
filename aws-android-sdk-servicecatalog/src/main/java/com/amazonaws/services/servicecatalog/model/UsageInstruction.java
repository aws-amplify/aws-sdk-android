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
 * Additional information provided by the administrator.
 * </p>
 */
public class UsageInstruction implements Serializable {
    /**
     * <p>
     * The usage instruction type for the value.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The usage instruction value for this type.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The usage instruction type for the value.
     * </p>
     *
     * @return <p>
     *         The usage instruction type for the value.
     *         </p>
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The usage instruction type for the value.
     * </p>
     *
     * @param type <p>
     *            The usage instruction type for the value.
     *            </p>
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The usage instruction type for the value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param type <p>
     *            The usage instruction type for the value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UsageInstruction withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The usage instruction value for this type.
     * </p>
     *
     * @return <p>
     *         The usage instruction value for this type.
     *         </p>
     */
    public String getValue() {
        return value;
    }

    /**
     * <p>
     * The usage instruction value for this type.
     * </p>
     *
     * @param value <p>
     *            The usage instruction value for this type.
     *            </p>
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The usage instruction value for this type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param value <p>
     *            The usage instruction value for this type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UsageInstruction withValue(String value) {
        this.value = value;
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
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getValue() != null)
            sb.append("Value: " + getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UsageInstruction == false)
            return false;
        UsageInstruction other = (UsageInstruction) obj;

        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }
}
