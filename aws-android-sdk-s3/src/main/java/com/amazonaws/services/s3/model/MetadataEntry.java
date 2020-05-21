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

package com.amazonaws.services.s3.model;

import java.io.Serializable;

/**
 * <p>
 * A metadata key-value pair to store with an object.
 * </p>
 */
public class MetadataEntry implements Serializable {
    /**
     * <p>
     * Name of the Object.
     * </p>
     */
    private String name;

    /**
     * <p>
     * Value of the Object.
     * </p>
     */
    private String value;

    /**
     * <p>
     * Name of the Object.
     * </p>
     *
     * @return <p>
     *         Name of the Object.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * Name of the Object.
     * </p>
     *
     * @param name <p>
     *            Name of the Object.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Name of the Object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            Name of the Object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MetadataEntry withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * Value of the Object.
     * </p>
     *
     * @return <p>
     *         Value of the Object.
     *         </p>
     */
    public String getValue() {
        return value;
    }

    /**
     * <p>
     * Value of the Object.
     * </p>
     *
     * @param value <p>
     *            Value of the Object.
     *            </p>
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * Value of the Object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param value <p>
     *            Value of the Object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MetadataEntry withValue(String value) {
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getValue() != null)
            sb.append("Value: " + getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MetadataEntry == false)
            return false;
        MetadataEntry other = (MetadataEntry) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }
}
