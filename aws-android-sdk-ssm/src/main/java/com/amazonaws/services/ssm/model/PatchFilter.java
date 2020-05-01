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

package com.amazonaws.services.ssm.model;

import java.io.Serializable;

/**
 * <p>
 * Defines which patches should be included in a patch baseline.
 * </p>
 * <p>
 * A patch filter consists of a key and a set of values. The filter key is a
 * patch property. For example, the available filter keys for WINDOWS are
 * PATCH_SET, PRODUCT, PRODUCT_FAMILY, CLASSIFICATION, and MSRC_SEVERITY. The
 * filter values define a matching criterion for the patch property indicated by
 * the key. For example, if the filter key is PRODUCT and the filter values are
 * ["Office 2013", "Office 2016"], then the filter accepts all patches where
 * product name is either "Office 2013" or "Office 2016". The filter values can
 * be exact values for the patch property given as a key, or a wildcard (*),
 * which matches all values.
 * </p>
 * <p>
 * You can view lists of valid values for the patch properties by running the
 * <code>DescribePatchProperties</code> command. For information about which
 * patch properties can be used with each major operating system, see
 * <a>DescribePatchProperties</a>.
 * </p>
 */
public class PatchFilter implements Serializable {
    /**
     * <p>
     * The key for the filter.
     * </p>
     * <p>
     * Run the <a>DescribePatchProperties</a> command to view lists of valid
     * keys for each operating system type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PATCH_SET, PRODUCT, PRODUCT_FAMILY,
     * CLASSIFICATION, MSRC_SEVERITY, PATCH_ID, SECTION, PRIORITY, SEVERITY
     */
    private String key;

    /**
     * <p>
     * The value for the filter key.
     * </p>
     * <p>
     * Run the <a>DescribePatchProperties</a> command to view lists of valid
     * values for each key based on operating system type.
     * </p>
     */
    private java.util.List<String> values;

    /**
     * <p>
     * The key for the filter.
     * </p>
     * <p>
     * Run the <a>DescribePatchProperties</a> command to view lists of valid
     * keys for each operating system type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PATCH_SET, PRODUCT, PRODUCT_FAMILY,
     * CLASSIFICATION, MSRC_SEVERITY, PATCH_ID, SECTION, PRIORITY, SEVERITY
     *
     * @return <p>
     *         The key for the filter.
     *         </p>
     *         <p>
     *         Run the <a>DescribePatchProperties</a> command to view lists of
     *         valid keys for each operating system type.
     *         </p>
     * @see PatchFilterKey
     */
    public String getKey() {
        return key;
    }

    /**
     * <p>
     * The key for the filter.
     * </p>
     * <p>
     * Run the <a>DescribePatchProperties</a> command to view lists of valid
     * keys for each operating system type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PATCH_SET, PRODUCT, PRODUCT_FAMILY,
     * CLASSIFICATION, MSRC_SEVERITY, PATCH_ID, SECTION, PRIORITY, SEVERITY
     *
     * @param key <p>
     *            The key for the filter.
     *            </p>
     *            <p>
     *            Run the <a>DescribePatchProperties</a> command to view lists
     *            of valid keys for each operating system type.
     *            </p>
     * @see PatchFilterKey
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The key for the filter.
     * </p>
     * <p>
     * Run the <a>DescribePatchProperties</a> command to view lists of valid
     * keys for each operating system type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PATCH_SET, PRODUCT, PRODUCT_FAMILY,
     * CLASSIFICATION, MSRC_SEVERITY, PATCH_ID, SECTION, PRIORITY, SEVERITY
     *
     * @param key <p>
     *            The key for the filter.
     *            </p>
     *            <p>
     *            Run the <a>DescribePatchProperties</a> command to view lists
     *            of valid keys for each operating system type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PatchFilterKey
     */
    public PatchFilter withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * <p>
     * The key for the filter.
     * </p>
     * <p>
     * Run the <a>DescribePatchProperties</a> command to view lists of valid
     * keys for each operating system type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PATCH_SET, PRODUCT, PRODUCT_FAMILY,
     * CLASSIFICATION, MSRC_SEVERITY, PATCH_ID, SECTION, PRIORITY, SEVERITY
     *
     * @param key <p>
     *            The key for the filter.
     *            </p>
     *            <p>
     *            Run the <a>DescribePatchProperties</a> command to view lists
     *            of valid keys for each operating system type.
     *            </p>
     * @see PatchFilterKey
     */
    public void setKey(PatchFilterKey key) {
        this.key = key.toString();
    }

    /**
     * <p>
     * The key for the filter.
     * </p>
     * <p>
     * Run the <a>DescribePatchProperties</a> command to view lists of valid
     * keys for each operating system type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PATCH_SET, PRODUCT, PRODUCT_FAMILY,
     * CLASSIFICATION, MSRC_SEVERITY, PATCH_ID, SECTION, PRIORITY, SEVERITY
     *
     * @param key <p>
     *            The key for the filter.
     *            </p>
     *            <p>
     *            Run the <a>DescribePatchProperties</a> command to view lists
     *            of valid keys for each operating system type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PatchFilterKey
     */
    public PatchFilter withKey(PatchFilterKey key) {
        this.key = key.toString();
        return this;
    }

    /**
     * <p>
     * The value for the filter key.
     * </p>
     * <p>
     * Run the <a>DescribePatchProperties</a> command to view lists of valid
     * values for each key based on operating system type.
     * </p>
     *
     * @return <p>
     *         The value for the filter key.
     *         </p>
     *         <p>
     *         Run the <a>DescribePatchProperties</a> command to view lists of
     *         valid values for each key based on operating system type.
     *         </p>
     */
    public java.util.List<String> getValues() {
        return values;
    }

    /**
     * <p>
     * The value for the filter key.
     * </p>
     * <p>
     * Run the <a>DescribePatchProperties</a> command to view lists of valid
     * values for each key based on operating system type.
     * </p>
     *
     * @param values <p>
     *            The value for the filter key.
     *            </p>
     *            <p>
     *            Run the <a>DescribePatchProperties</a> command to view lists
     *            of valid values for each key based on operating system type.
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
     * The value for the filter key.
     * </p>
     * <p>
     * Run the <a>DescribePatchProperties</a> command to view lists of valid
     * values for each key based on operating system type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param values <p>
     *            The value for the filter key.
     *            </p>
     *            <p>
     *            Run the <a>DescribePatchProperties</a> command to view lists
     *            of valid values for each key based on operating system type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PatchFilter withValues(String... values) {
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
     * The value for the filter key.
     * </p>
     * <p>
     * Run the <a>DescribePatchProperties</a> command to view lists of valid
     * values for each key based on operating system type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param values <p>
     *            The value for the filter key.
     *            </p>
     *            <p>
     *            Run the <a>DescribePatchProperties</a> command to view lists
     *            of valid values for each key based on operating system type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PatchFilter withValues(java.util.Collection<String> values) {
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

        if (obj instanceof PatchFilter == false)
            return false;
        PatchFilter other = (PatchFilter) obj;

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
