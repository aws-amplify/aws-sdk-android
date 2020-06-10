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
package com.amazonaws.services.compute-optimizer.model;

import java.io.Serializable;


/**
 * <p>The summary of a recommendation.</p>
 */
public class Summary implements Serializable {
    /**
     * <p>The finding classification of the recommendation.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Underprovisioned, Overprovisioned, Optimized, NotOptimized
     */
    private String name;

    /**
     * <p>The value of the recommendation summary.</p>
     */
    private Double value;

    /**
     * <p>The finding classification of the recommendation.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Underprovisioned, Overprovisioned, Optimized, NotOptimized
     *
     * @return <p>The finding classification of the recommendation.</p>
     *
     * @see Finding
     */
    public String getName() {
        return name;
    }

    /**
     * <p>The finding classification of the recommendation.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Underprovisioned, Overprovisioned, Optimized, NotOptimized
     *
     * @param name <p>The finding classification of the recommendation.</p>
     *
     * @see Finding
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>The finding classification of the recommendation.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Underprovisioned, Overprovisioned, Optimized, NotOptimized
     *
     * @param name <p>The finding classification of the recommendation.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see Finding
     */
    public Summary withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>The finding classification of the recommendation.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Underprovisioned, Overprovisioned, Optimized, NotOptimized
     *
     * @param name <p>The finding classification of the recommendation.</p>
     *
     * @see Finding
     */
    public void setName(Finding name) {
        this.name = name.toString();
    }

    /**
     * <p>The finding classification of the recommendation.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Underprovisioned, Overprovisioned, Optimized, NotOptimized
     *
     * @param name <p>The finding classification of the recommendation.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see Finding
     */
    public Summary withName(Finding name) {
        this.name = name.toString();
        return this;
    }

    /**
     * <p>The value of the recommendation summary.</p>
     *
     * @return <p>The value of the recommendation summary.</p>
     */
    public Double getValue() {
        return value;
    }

    /**
     * <p>The value of the recommendation summary.</p>
     *
     * @param value <p>The value of the recommendation summary.</p>
     */
    public void setValue(Double value) {
        this.value = value;
    }

    /**
     * <p>The value of the recommendation summary.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param value <p>The value of the recommendation summary.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public Summary withValue(Double value) {
        this.value = value;
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
        if (getName() != null) sb.append("name: " + getName() + ",");
        if (getValue() != null) sb.append("value: " + getValue());
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
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Summary == false) return false;
        Summary other = (Summary)obj;

        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false;
        if (other.getValue() == null ^ this.getValue() == null) return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false) return false;
        return true;
    }
}
