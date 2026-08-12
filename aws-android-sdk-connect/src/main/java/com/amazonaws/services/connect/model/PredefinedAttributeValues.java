/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

/**
 * <p>
 * Information about values of a predefined attribute.
 * </p>
 */
public class PredefinedAttributeValues implements Serializable {
    /**
     * <p>
     * Predefined attribute values of type string list.
     * </p>
     */
    private java.util.List<String> stringList;

    /**
     * <p>
     * Predefined attribute values of type string list.
     * </p>
     *
     * @return <p>
     *         Predefined attribute values of type string list.
     *         </p>
     */
    public java.util.List<String> getStringList() {
        return stringList;
    }

    /**
     * <p>
     * Predefined attribute values of type string list.
     * </p>
     *
     * @param stringList <p>
     *            Predefined attribute values of type string list.
     *            </p>
     */
    public void setStringList(java.util.Collection<String> stringList) {
        if (stringList == null) {
            this.stringList = null;
            return;
        }

        this.stringList = new java.util.ArrayList<String>(stringList);
    }

    /**
     * <p>
     * Predefined attribute values of type string list.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stringList <p>
     *            Predefined attribute values of type string list.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PredefinedAttributeValues withStringList(String... stringList) {
        if (getStringList() == null) {
            this.stringList = new java.util.ArrayList<String>(stringList.length);
        }
        for (String value : stringList) {
            this.stringList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Predefined attribute values of type string list.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stringList <p>
     *            Predefined attribute values of type string list.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PredefinedAttributeValues withStringList(java.util.Collection<String> stringList) {
        setStringList(stringList);
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
        if (getStringList() != null)
            sb.append("StringList: " + getStringList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStringList() == null) ? 0 : getStringList().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PredefinedAttributeValues == false)
            return false;
        PredefinedAttributeValues other = (PredefinedAttributeValues) obj;

        if (other.getStringList() == null ^ this.getStringList() == null)
            return false;
        if (other.getStringList() != null
                && other.getStringList().equals(this.getStringList()) == false)
            return false;
        return true;
    }
}
