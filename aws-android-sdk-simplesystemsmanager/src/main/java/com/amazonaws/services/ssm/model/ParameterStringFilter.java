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
 * One or more filters. Use a filter to return a more specific list of results.
 * </p>
 * <important>
 * <p>
 * The <code>ParameterStringFilter</code> object is used by the
 * <a>DescribeParameters</a> and <a>GetParametersByPath</a> API actions.
 * However, not all of the pattern values listed for <code>Key</code> can be
 * used with both actions.
 * </p>
 * <p>
 * For <code>DescribeActions</code>, all of the listed patterns are valid, with
 * the exception of <code>Label</code>.
 * </p>
 * <p>
 * For <code>GetParametersByPath</code>, the following patterns listed for
 * <code>Key</code> are not valid: <code>Name</code>, <code>Path</code>, and
 * <code>Tier</code>.
 * </p>
 * <p>
 * For examples of CLI commands demonstrating valid parameter filter
 * constructions, see <a href=
 * "https://docs.aws.amazon.com/systems-manager/latest/userguide/parameter-search.html"
 * >Searching for Systems Manager parameters</a> in the <i>AWS Systems Manager
 * User Guide</i>.
 * </p>
 * </important>
 */
public class ParameterStringFilter implements Serializable {
    /**
     * <p>
     * The name of the filter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 132<br/>
     * <b>Pattern: </b>tag:.+|Name|Type|KeyId|Path|Label|Tier|DataType<br/>
     */
    private String key;

    /**
     * <p>
     * For all filters used with <a>DescribeParameters</a>, valid options
     * include <code>Equals</code> and <code>BeginsWith</code>. The
     * <code>Name</code> filter additionally supports the <code>Contains</code>
     * option. (Exception: For filters using the key <code>Path</code>, valid
     * options include <code>Recursive</code> and <code>OneLevel</code>.)
     * </p>
     * <p>
     * For filters used with <a>GetParametersByPath</a>, valid options include
     * <code>Equals</code> and <code>BeginsWith</code>. (Exception: For filters
     * using the key <code>Label</code>, the only valid option is
     * <code>Equals</code>.)
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 10<br/>
     */
    private String option;

    /**
     * <p>
     * The value you want to search for.
     * </p>
     */
    private java.util.List<String> values;

    /**
     * <p>
     * The name of the filter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 132<br/>
     * <b>Pattern: </b>tag:.+|Name|Type|KeyId|Path|Label|Tier|DataType<br/>
     *
     * @return <p>
     *         The name of the filter.
     *         </p>
     */
    public String getKey() {
        return key;
    }

    /**
     * <p>
     * The name of the filter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 132<br/>
     * <b>Pattern: </b>tag:.+|Name|Type|KeyId|Path|Label|Tier|DataType<br/>
     *
     * @param key <p>
     *            The name of the filter.
     *            </p>
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The name of the filter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 132<br/>
     * <b>Pattern: </b>tag:.+|Name|Type|KeyId|Path|Label|Tier|DataType<br/>
     *
     * @param key <p>
     *            The name of the filter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ParameterStringFilter withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * <p>
     * For all filters used with <a>DescribeParameters</a>, valid options
     * include <code>Equals</code> and <code>BeginsWith</code>. The
     * <code>Name</code> filter additionally supports the <code>Contains</code>
     * option. (Exception: For filters using the key <code>Path</code>, valid
     * options include <code>Recursive</code> and <code>OneLevel</code>.)
     * </p>
     * <p>
     * For filters used with <a>GetParametersByPath</a>, valid options include
     * <code>Equals</code> and <code>BeginsWith</code>. (Exception: For filters
     * using the key <code>Label</code>, the only valid option is
     * <code>Equals</code>.)
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 10<br/>
     *
     * @return <p>
     *         For all filters used with <a>DescribeParameters</a>, valid
     *         options include <code>Equals</code> and <code>BeginsWith</code>.
     *         The <code>Name</code> filter additionally supports the
     *         <code>Contains</code> option. (Exception: For filters using the
     *         key <code>Path</code>, valid options include
     *         <code>Recursive</code> and <code>OneLevel</code>.)
     *         </p>
     *         <p>
     *         For filters used with <a>GetParametersByPath</a>, valid options
     *         include <code>Equals</code> and <code>BeginsWith</code>.
     *         (Exception: For filters using the key <code>Label</code>, the
     *         only valid option is <code>Equals</code>.)
     *         </p>
     */
    public String getOption() {
        return option;
    }

    /**
     * <p>
     * For all filters used with <a>DescribeParameters</a>, valid options
     * include <code>Equals</code> and <code>BeginsWith</code>. The
     * <code>Name</code> filter additionally supports the <code>Contains</code>
     * option. (Exception: For filters using the key <code>Path</code>, valid
     * options include <code>Recursive</code> and <code>OneLevel</code>.)
     * </p>
     * <p>
     * For filters used with <a>GetParametersByPath</a>, valid options include
     * <code>Equals</code> and <code>BeginsWith</code>. (Exception: For filters
     * using the key <code>Label</code>, the only valid option is
     * <code>Equals</code>.)
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 10<br/>
     *
     * @param option <p>
     *            For all filters used with <a>DescribeParameters</a>, valid
     *            options include <code>Equals</code> and
     *            <code>BeginsWith</code>. The <code>Name</code> filter
     *            additionally supports the <code>Contains</code> option.
     *            (Exception: For filters using the key <code>Path</code>, valid
     *            options include <code>Recursive</code> and
     *            <code>OneLevel</code>.)
     *            </p>
     *            <p>
     *            For filters used with <a>GetParametersByPath</a>, valid
     *            options include <code>Equals</code> and
     *            <code>BeginsWith</code>. (Exception: For filters using the key
     *            <code>Label</code>, the only valid option is
     *            <code>Equals</code>.)
     *            </p>
     */
    public void setOption(String option) {
        this.option = option;
    }

    /**
     * <p>
     * For all filters used with <a>DescribeParameters</a>, valid options
     * include <code>Equals</code> and <code>BeginsWith</code>. The
     * <code>Name</code> filter additionally supports the <code>Contains</code>
     * option. (Exception: For filters using the key <code>Path</code>, valid
     * options include <code>Recursive</code> and <code>OneLevel</code>.)
     * </p>
     * <p>
     * For filters used with <a>GetParametersByPath</a>, valid options include
     * <code>Equals</code> and <code>BeginsWith</code>. (Exception: For filters
     * using the key <code>Label</code>, the only valid option is
     * <code>Equals</code>.)
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 10<br/>
     *
     * @param option <p>
     *            For all filters used with <a>DescribeParameters</a>, valid
     *            options include <code>Equals</code> and
     *            <code>BeginsWith</code>. The <code>Name</code> filter
     *            additionally supports the <code>Contains</code> option.
     *            (Exception: For filters using the key <code>Path</code>, valid
     *            options include <code>Recursive</code> and
     *            <code>OneLevel</code>.)
     *            </p>
     *            <p>
     *            For filters used with <a>GetParametersByPath</a>, valid
     *            options include <code>Equals</code> and
     *            <code>BeginsWith</code>. (Exception: For filters using the key
     *            <code>Label</code>, the only valid option is
     *            <code>Equals</code>.)
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ParameterStringFilter withOption(String option) {
        this.option = option;
        return this;
    }

    /**
     * <p>
     * The value you want to search for.
     * </p>
     *
     * @return <p>
     *         The value you want to search for.
     *         </p>
     */
    public java.util.List<String> getValues() {
        return values;
    }

    /**
     * <p>
     * The value you want to search for.
     * </p>
     *
     * @param values <p>
     *            The value you want to search for.
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
     * The value you want to search for.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param values <p>
     *            The value you want to search for.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ParameterStringFilter withValues(String... values) {
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
     * The value you want to search for.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param values <p>
     *            The value you want to search for.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ParameterStringFilter withValues(java.util.Collection<String> values) {
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
        if (getOption() != null)
            sb.append("Option: " + getOption() + ",");
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
        hashCode = prime * hashCode + ((getOption() == null) ? 0 : getOption().hashCode());
        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ParameterStringFilter == false)
            return false;
        ParameterStringFilter other = (ParameterStringFilter) obj;

        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getOption() == null ^ this.getOption() == null)
            return false;
        if (other.getOption() != null && other.getOption().equals(this.getOption()) == false)
            return false;
        if (other.getValues() == null ^ this.getValues() == null)
            return false;
        if (other.getValues() != null && other.getValues().equals(this.getValues()) == false)
            return false;
        return true;
    }
}
