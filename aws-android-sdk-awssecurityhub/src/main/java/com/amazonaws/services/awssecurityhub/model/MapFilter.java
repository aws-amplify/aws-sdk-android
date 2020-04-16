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

package com.amazonaws.services.awssecurityhub.model;

import java.io.Serializable;

/**
 * <p>
 * The map filter for querying findings.
 * </p>
 */
public class MapFilter implements Serializable {
    /**
     * <p>
     * The key of the map filter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String key;

    /**
     * <p>
     * The value for the key in the map filter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String value;

    /**
     * <p>
     * The condition to apply to a key value when querying for findings with a
     * map filter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EQUALS
     */
    private String comparison;

    /**
     * <p>
     * The key of the map filter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The key of the map filter.
     *         </p>
     */
    public String getKey() {
        return key;
    }

    /**
     * <p>
     * The key of the map filter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param key <p>
     *            The key of the map filter.
     *            </p>
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The key of the map filter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param key <p>
     *            The key of the map filter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MapFilter withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * <p>
     * The value for the key in the map filter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The value for the key in the map filter.
     *         </p>
     */
    public String getValue() {
        return value;
    }

    /**
     * <p>
     * The value for the key in the map filter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param value <p>
     *            The value for the key in the map filter.
     *            </p>
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value for the key in the map filter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param value <p>
     *            The value for the key in the map filter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MapFilter withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * <p>
     * The condition to apply to a key value when querying for findings with a
     * map filter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EQUALS
     *
     * @return <p>
     *         The condition to apply to a key value when querying for findings
     *         with a map filter.
     *         </p>
     * @see MapFilterComparison
     */
    public String getComparison() {
        return comparison;
    }

    /**
     * <p>
     * The condition to apply to a key value when querying for findings with a
     * map filter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EQUALS
     *
     * @param comparison <p>
     *            The condition to apply to a key value when querying for
     *            findings with a map filter.
     *            </p>
     * @see MapFilterComparison
     */
    public void setComparison(String comparison) {
        this.comparison = comparison;
    }

    /**
     * <p>
     * The condition to apply to a key value when querying for findings with a
     * map filter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EQUALS
     *
     * @param comparison <p>
     *            The condition to apply to a key value when querying for
     *            findings with a map filter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MapFilterComparison
     */
    public MapFilter withComparison(String comparison) {
        this.comparison = comparison;
        return this;
    }

    /**
     * <p>
     * The condition to apply to a key value when querying for findings with a
     * map filter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EQUALS
     *
     * @param comparison <p>
     *            The condition to apply to a key value when querying for
     *            findings with a map filter.
     *            </p>
     * @see MapFilterComparison
     */
    public void setComparison(MapFilterComparison comparison) {
        this.comparison = comparison.toString();
    }

    /**
     * <p>
     * The condition to apply to a key value when querying for findings with a
     * map filter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EQUALS
     *
     * @param comparison <p>
     *            The condition to apply to a key value when querying for
     *            findings with a map filter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MapFilterComparison
     */
    public MapFilter withComparison(MapFilterComparison comparison) {
        this.comparison = comparison.toString();
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
        if (getValue() != null)
            sb.append("Value: " + getValue() + ",");
        if (getComparison() != null)
            sb.append("Comparison: " + getComparison());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getComparison() == null) ? 0 : getComparison().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MapFilter == false)
            return false;
        MapFilter other = (MapFilter) obj;

        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getComparison() == null ^ this.getComparison() == null)
            return false;
        if (other.getComparison() != null
                && other.getComparison().equals(this.getComparison()) == false)
            return false;
        return true;
    }
}
