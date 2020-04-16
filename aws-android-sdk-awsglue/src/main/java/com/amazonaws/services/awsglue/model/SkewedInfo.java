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

package com.amazonaws.services.awsglue.model;

import java.io.Serializable;

/**
 * <p>
 * Specifies skewed values in a table. Skewed values are those that occur with
 * very high frequency.
 * </p>
 */
public class SkewedInfo implements Serializable {
    /**
     * <p>
     * A list of names of columns that contain skewed values.
     * </p>
     */
    private java.util.List<String> skewedColumnNames;

    /**
     * <p>
     * A list of values that appear so frequently as to be considered skewed.
     * </p>
     */
    private java.util.List<String> skewedColumnValues;

    /**
     * <p>
     * A mapping of skewed values to the columns that contain them.
     * </p>
     */
    private java.util.Map<String, String> skewedColumnValueLocationMaps;

    /**
     * <p>
     * A list of names of columns that contain skewed values.
     * </p>
     *
     * @return <p>
     *         A list of names of columns that contain skewed values.
     *         </p>
     */
    public java.util.List<String> getSkewedColumnNames() {
        return skewedColumnNames;
    }

    /**
     * <p>
     * A list of names of columns that contain skewed values.
     * </p>
     *
     * @param skewedColumnNames <p>
     *            A list of names of columns that contain skewed values.
     *            </p>
     */
    public void setSkewedColumnNames(java.util.Collection<String> skewedColumnNames) {
        if (skewedColumnNames == null) {
            this.skewedColumnNames = null;
            return;
        }

        this.skewedColumnNames = new java.util.ArrayList<String>(skewedColumnNames);
    }

    /**
     * <p>
     * A list of names of columns that contain skewed values.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param skewedColumnNames <p>
     *            A list of names of columns that contain skewed values.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SkewedInfo withSkewedColumnNames(String... skewedColumnNames) {
        if (getSkewedColumnNames() == null) {
            this.skewedColumnNames = new java.util.ArrayList<String>(skewedColumnNames.length);
        }
        for (String value : skewedColumnNames) {
            this.skewedColumnNames.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of names of columns that contain skewed values.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param skewedColumnNames <p>
     *            A list of names of columns that contain skewed values.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SkewedInfo withSkewedColumnNames(java.util.Collection<String> skewedColumnNames) {
        setSkewedColumnNames(skewedColumnNames);
        return this;
    }

    /**
     * <p>
     * A list of values that appear so frequently as to be considered skewed.
     * </p>
     *
     * @return <p>
     *         A list of values that appear so frequently as to be considered
     *         skewed.
     *         </p>
     */
    public java.util.List<String> getSkewedColumnValues() {
        return skewedColumnValues;
    }

    /**
     * <p>
     * A list of values that appear so frequently as to be considered skewed.
     * </p>
     *
     * @param skewedColumnValues <p>
     *            A list of values that appear so frequently as to be considered
     *            skewed.
     *            </p>
     */
    public void setSkewedColumnValues(java.util.Collection<String> skewedColumnValues) {
        if (skewedColumnValues == null) {
            this.skewedColumnValues = null;
            return;
        }

        this.skewedColumnValues = new java.util.ArrayList<String>(skewedColumnValues);
    }

    /**
     * <p>
     * A list of values that appear so frequently as to be considered skewed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param skewedColumnValues <p>
     *            A list of values that appear so frequently as to be considered
     *            skewed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SkewedInfo withSkewedColumnValues(String... skewedColumnValues) {
        if (getSkewedColumnValues() == null) {
            this.skewedColumnValues = new java.util.ArrayList<String>(skewedColumnValues.length);
        }
        for (String value : skewedColumnValues) {
            this.skewedColumnValues.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of values that appear so frequently as to be considered skewed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param skewedColumnValues <p>
     *            A list of values that appear so frequently as to be considered
     *            skewed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SkewedInfo withSkewedColumnValues(java.util.Collection<String> skewedColumnValues) {
        setSkewedColumnValues(skewedColumnValues);
        return this;
    }

    /**
     * <p>
     * A mapping of skewed values to the columns that contain them.
     * </p>
     *
     * @return <p>
     *         A mapping of skewed values to the columns that contain them.
     *         </p>
     */
    public java.util.Map<String, String> getSkewedColumnValueLocationMaps() {
        return skewedColumnValueLocationMaps;
    }

    /**
     * <p>
     * A mapping of skewed values to the columns that contain them.
     * </p>
     *
     * @param skewedColumnValueLocationMaps <p>
     *            A mapping of skewed values to the columns that contain them.
     *            </p>
     */
    public void setSkewedColumnValueLocationMaps(
            java.util.Map<String, String> skewedColumnValueLocationMaps) {
        this.skewedColumnValueLocationMaps = skewedColumnValueLocationMaps;
    }

    /**
     * <p>
     * A mapping of skewed values to the columns that contain them.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param skewedColumnValueLocationMaps <p>
     *            A mapping of skewed values to the columns that contain them.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SkewedInfo withSkewedColumnValueLocationMaps(
            java.util.Map<String, String> skewedColumnValueLocationMaps) {
        this.skewedColumnValueLocationMaps = skewedColumnValueLocationMaps;
        return this;
    }

    /**
     * <p>
     * A mapping of skewed values to the columns that contain them.
     * </p>
     * <p>
     * The method adds a new key-value pair into SkewedColumnValueLocationMaps
     * parameter, and returns a reference to this object so that method calls
     * can be chained together.
     *
     * @param key The key of the entry to be added into
     *            SkewedColumnValueLocationMaps.
     * @param value The corresponding value of the entry to be added into
     *            SkewedColumnValueLocationMaps.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SkewedInfo addSkewedColumnValueLocationMapsEntry(String key, String value) {
        if (null == this.skewedColumnValueLocationMaps) {
            this.skewedColumnValueLocationMaps = new java.util.HashMap<String, String>();
        }
        if (this.skewedColumnValueLocationMaps.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.skewedColumnValueLocationMaps.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into SkewedColumnValueLocationMaps.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public SkewedInfo clearSkewedColumnValueLocationMapsEntries() {
        this.skewedColumnValueLocationMaps = null;
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
        if (getSkewedColumnNames() != null)
            sb.append("SkewedColumnNames: " + getSkewedColumnNames() + ",");
        if (getSkewedColumnValues() != null)
            sb.append("SkewedColumnValues: " + getSkewedColumnValues() + ",");
        if (getSkewedColumnValueLocationMaps() != null)
            sb.append("SkewedColumnValueLocationMaps: " + getSkewedColumnValueLocationMaps());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSkewedColumnNames() == null) ? 0 : getSkewedColumnNames().hashCode());
        hashCode = prime * hashCode
                + ((getSkewedColumnValues() == null) ? 0 : getSkewedColumnValues().hashCode());
        hashCode = prime
                * hashCode
                + ((getSkewedColumnValueLocationMaps() == null) ? 0
                        : getSkewedColumnValueLocationMaps().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SkewedInfo == false)
            return false;
        SkewedInfo other = (SkewedInfo) obj;

        if (other.getSkewedColumnNames() == null ^ this.getSkewedColumnNames() == null)
            return false;
        if (other.getSkewedColumnNames() != null
                && other.getSkewedColumnNames().equals(this.getSkewedColumnNames()) == false)
            return false;
        if (other.getSkewedColumnValues() == null ^ this.getSkewedColumnValues() == null)
            return false;
        if (other.getSkewedColumnValues() != null
                && other.getSkewedColumnValues().equals(this.getSkewedColumnValues()) == false)
            return false;
        if (other.getSkewedColumnValueLocationMaps() == null
                ^ this.getSkewedColumnValueLocationMaps() == null)
            return false;
        if (other.getSkewedColumnValueLocationMaps() != null
                && other.getSkewedColumnValueLocationMaps().equals(
                        this.getSkewedColumnValueLocationMaps()) == false)
            return false;
        return true;
    }
}
