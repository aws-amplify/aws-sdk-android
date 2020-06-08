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

package com.amazonaws.services.shield.model;

import java.io.Serializable;

/**
 * <p>
 * Specifies how many protections of a given type you can create.
 * </p>
 */
public class Limit implements Serializable {
    /**
     * <p>
     * The type of protection.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The maximum number of protections that can be created for the specified
     * <code>Type</code>.
     * </p>
     */
    private Long max;

    /**
     * <p>
     * The type of protection.
     * </p>
     *
     * @return <p>
     *         The type of protection.
     *         </p>
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of protection.
     * </p>
     *
     * @param type <p>
     *            The type of protection.
     *            </p>
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of protection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param type <p>
     *            The type of protection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Limit withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The maximum number of protections that can be created for the specified
     * <code>Type</code>.
     * </p>
     *
     * @return <p>
     *         The maximum number of protections that can be created for the
     *         specified <code>Type</code>.
     *         </p>
     */
    public Long getMax() {
        return max;
    }

    /**
     * <p>
     * The maximum number of protections that can be created for the specified
     * <code>Type</code>.
     * </p>
     *
     * @param max <p>
     *            The maximum number of protections that can be created for the
     *            specified <code>Type</code>.
     *            </p>
     */
    public void setMax(Long max) {
        this.max = max;
    }

    /**
     * <p>
     * The maximum number of protections that can be created for the specified
     * <code>Type</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param max <p>
     *            The maximum number of protections that can be created for the
     *            specified <code>Type</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Limit withMax(Long max) {
        this.max = max;
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
        if (getMax() != null)
            sb.append("Max: " + getMax());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getMax() == null) ? 0 : getMax().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Limit == false)
            return false;
        Limit other = (Limit) obj;

        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getMax() == null ^ this.getMax() == null)
            return false;
        if (other.getMax() != null && other.getMax().equals(this.getMax()) == false)
            return false;
        return true;
    }
}
