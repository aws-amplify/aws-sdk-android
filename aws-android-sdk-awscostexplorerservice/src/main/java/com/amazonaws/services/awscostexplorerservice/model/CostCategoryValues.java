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

package com.amazonaws.services.awscostexplorerservice.model;

import java.io.Serializable;

/**
 * <p>
 * The Cost Categories values used for filtering the costs.
 * </p>
 */
public class CostCategoryValues implements Serializable {
    /**
     * <p>
     * The unique name of the Cost Category.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^(?! )[\p{L}\p{N}\p{Z}-_]*(?<! )$<br/>
     */
    private String key;

    /**
     * <p>
     * The specific value of the Cost Category.
     * </p>
     */
    private java.util.List<String> values;

    /**
     * <p>
     * The unique name of the Cost Category.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^(?! )[\p{L}\p{N}\p{Z}-_]*(?<! )$<br/>
     *
     * @return <p>
     *         The unique name of the Cost Category.
     *         </p>
     */
    public String getKey() {
        return key;
    }

    /**
     * <p>
     * The unique name of the Cost Category.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^(?! )[\p{L}\p{N}\p{Z}-_]*(?<! )$<br/>
     *
     * @param key <p>
     *            The unique name of the Cost Category.
     *            </p>
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The unique name of the Cost Category.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^(?! )[\p{L}\p{N}\p{Z}-_]*(?<! )$<br/>
     *
     * @param key <p>
     *            The unique name of the Cost Category.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CostCategoryValues withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * <p>
     * The specific value of the Cost Category.
     * </p>
     *
     * @return <p>
     *         The specific value of the Cost Category.
     *         </p>
     */
    public java.util.List<String> getValues() {
        return values;
    }

    /**
     * <p>
     * The specific value of the Cost Category.
     * </p>
     *
     * @param values <p>
     *            The specific value of the Cost Category.
     *            </p>
     */
    public void setValues(java.util.Collection<String> values) {
        if (values == null) {
            this.values = null;
            return;
        }

        this.values = new java.util.ArrayList<String>(values);
    }

    /**
     * <p>
     * The specific value of the Cost Category.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param values <p>
     *            The specific value of the Cost Category.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CostCategoryValues withValues(String... values) {
        if (getValues() == null) {
            this.values = new java.util.ArrayList<String>(values.length);
        }
        for (String value : values) {
            this.values.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The specific value of the Cost Category.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param values <p>
     *            The specific value of the Cost Category.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CostCategoryValues withValues(java.util.Collection<String> values) {
        setValues(values);
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
        if (getKey() != null)
            sb.append("Key: " + getKey() + ",");
        if (getValues() != null)
            sb.append("Values: " + getValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CostCategoryValues == false)
            return false;
        CostCategoryValues other = (CostCategoryValues) obj;

        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getValues() == null ^ this.getValues() == null)
            return false;
        if (other.getValues() != null && other.getValues().equals(this.getValues()) == false)
            return false;
        return true;
    }
}
