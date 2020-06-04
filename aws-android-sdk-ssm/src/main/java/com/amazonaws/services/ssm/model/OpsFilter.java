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
 * A filter for viewing OpsItem summaries.
 * </p>
 */
public class OpsFilter implements Serializable {
    /**
     * <p>
     * The name of the filter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     */
    private String key;

    /**
     * <p>
     * The filter value.
     * </p>
     */
    private java.util.List<String> values;

    /**
     * <p>
     * The type of filter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Equal, NotEqual, BeginWith, LessThan, GreaterThan,
     * Exists
     */
    private String type;

    /**
     * <p>
     * The name of the filter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
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
     * <b>Length: </b>1 - 200<br/>
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
     * <b>Length: </b>1 - 200<br/>
     *
     * @param key <p>
     *            The name of the filter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OpsFilter withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * <p>
     * The filter value.
     * </p>
     *
     * @return <p>
     *         The filter value.
     *         </p>
     */
    public java.util.List<String> getValues() {
        return values;
    }

    /**
     * <p>
     * The filter value.
     * </p>
     *
     * @param values <p>
     *            The filter value.
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
     * The filter value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param values <p>
     *            The filter value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OpsFilter withValues(String... values) {
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
     * The filter value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param values <p>
     *            The filter value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OpsFilter withValues(java.util.Collection<String> values) {
        setValues(values);
        return this;
    }

    /**
     * <p>
     * The type of filter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Equal, NotEqual, BeginWith, LessThan, GreaterThan,
     * Exists
     *
     * @return <p>
     *         The type of filter.
     *         </p>
     * @see OpsFilterOperatorType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of filter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Equal, NotEqual, BeginWith, LessThan, GreaterThan,
     * Exists
     *
     * @param type <p>
     *            The type of filter.
     *            </p>
     * @see OpsFilterOperatorType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of filter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Equal, NotEqual, BeginWith, LessThan, GreaterThan,
     * Exists
     *
     * @param type <p>
     *            The type of filter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OpsFilterOperatorType
     */
    public OpsFilter withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The type of filter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Equal, NotEqual, BeginWith, LessThan, GreaterThan,
     * Exists
     *
     * @param type <p>
     *            The type of filter.
     *            </p>
     * @see OpsFilterOperatorType
     */
    public void setType(OpsFilterOperatorType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of filter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Equal, NotEqual, BeginWith, LessThan, GreaterThan,
     * Exists
     *
     * @param type <p>
     *            The type of filter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OpsFilterOperatorType
     */
    public OpsFilter withType(OpsFilterOperatorType type) {
        this.type = type.toString();
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
            sb.append("Values: " + getValues() + ",");
        if (getType() != null)
            sb.append("Type: " + getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OpsFilter == false)
            return false;
        OpsFilter other = (OpsFilter) obj;

        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getValues() == null ^ this.getValues() == null)
            return false;
        if (other.getValues() != null && other.getValues().equals(this.getValues()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }
}
