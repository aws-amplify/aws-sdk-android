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

package com.amazonaws.services.amazonfrauddetector.model;

import java.io.Serializable;

/**
 * <p>
 * The model variable.&gt;
 * </p>
 */
public class ModelVariable implements Serializable {
    /**
     * <p>
     * The model variable's name.&gt;
     * </p>
     */
    private String name;

    /**
     * <p>
     * The model variable's index.&gt;
     * </p>
     */
    private Integer index;

    /**
     * <p>
     * The model variable's name.&gt;
     * </p>
     *
     * @return <p>
     *         The model variable's name.&gt;
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The model variable's name.&gt;
     * </p>
     *
     * @param name <p>
     *            The model variable's name.&gt;
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The model variable's name.&gt;
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            The model variable's name.&gt;
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModelVariable withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The model variable's index.&gt;
     * </p>
     *
     * @return <p>
     *         The model variable's index.&gt;
     *         </p>
     */
    public Integer getIndex() {
        return index;
    }

    /**
     * <p>
     * The model variable's index.&gt;
     * </p>
     *
     * @param index <p>
     *            The model variable's index.&gt;
     *            </p>
     */
    public void setIndex(Integer index) {
        this.index = index;
    }

    /**
     * <p>
     * The model variable's index.&gt;
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param index <p>
     *            The model variable's index.&gt;
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModelVariable withIndex(Integer index) {
        this.index = index;
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
            sb.append("name: " + getName() + ",");
        if (getIndex() != null)
            sb.append("index: " + getIndex());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getIndex() == null) ? 0 : getIndex().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModelVariable == false)
            return false;
        ModelVariable other = (ModelVariable) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getIndex() == null ^ this.getIndex() == null)
            return false;
        if (other.getIndex() != null && other.getIndex().equals(this.getIndex()) == false)
            return false;
        return true;
    }
}
