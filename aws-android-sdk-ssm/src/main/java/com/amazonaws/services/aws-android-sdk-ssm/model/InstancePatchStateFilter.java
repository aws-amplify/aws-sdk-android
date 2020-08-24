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
package com.amazonaws.services.aws-android-sdk-ssm.model;

import java.io.Serializable;


/**
 * <p>Defines a filter used in DescribeInstancePatchStatesForPatchGroup used to scope down the information returned by the API.</p>
 */
public class InstancePatchStateFilter implements Serializable {
    /**
     * <p>The key for the filter. Supported values are FailedCount, InstalledCount, InstalledOtherCount, MissingCount and NotApplicableCount.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     */
    private String key;

    /**
     * <p>The value for the filter, must be an integer greater than or equal to 0.</p>
     */
    private java.util.List<String> values;

    /**
     * <p>The type of comparison that should be performed for the value: Equal, NotEqual, LessThan or GreaterThan.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Equal, NotEqual, LessThan, GreaterThan
     */
    private String type;

    /**
     * <p>The key for the filter. Supported values are FailedCount, InstalledCount, InstalledOtherCount, MissingCount and NotApplicableCount.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     *
     * @return <p>The key for the filter. Supported values are FailedCount, InstalledCount, InstalledOtherCount, MissingCount and NotApplicableCount.</p>
     */
    public String getKey() {
        return key;
    }

    /**
     * <p>The key for the filter. Supported values are FailedCount, InstalledCount, InstalledOtherCount, MissingCount and NotApplicableCount.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     *
     * @param key <p>The key for the filter. Supported values are FailedCount, InstalledCount, InstalledOtherCount, MissingCount and NotApplicableCount.</p>
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>The key for the filter. Supported values are FailedCount, InstalledCount, InstalledOtherCount, MissingCount and NotApplicableCount.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     *
     * @param key <p>The key for the filter. Supported values are FailedCount, InstalledCount, InstalledOtherCount, MissingCount and NotApplicableCount.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public InstancePatchStateFilter withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * <p>The value for the filter, must be an integer greater than or equal to 0.</p>
     *
     * @return <p>The value for the filter, must be an integer greater than or equal to 0.</p>
     */
    public java.util.List<String> getValues() {
        return values;
    }

    /**
     * <p>The value for the filter, must be an integer greater than or equal to 0.</p>
     *
     * @param values <p>The value for the filter, must be an integer greater than or equal to 0.</p>
     */
    public void setValues(java.util.Collection<String> values) {
        if (values == null) {
            this.values = null;
            return;
        }

        this.values = new java.util.ArrayList<String>(values);
    }

    /**
     * <p>The value for the filter, must be an integer greater than or equal to 0.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param values <p>The value for the filter, must be an integer greater than or equal to 0.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public InstancePatchStateFilter withValues(String... values) {
        if (getValues() == null) {
            this.values = new java.util.ArrayList<String>(values.length);
        }
        for (String value : values) {
            this.values.add(value);
        }
        return this;
    }

    /**
     * <p>The value for the filter, must be an integer greater than or equal to 0.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param values <p>The value for the filter, must be an integer greater than or equal to 0.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public InstancePatchStateFilter withValues(java.util.Collection<String> values) {
        setValues(values);
        return this;
    }

    /**
     * <p>The type of comparison that should be performed for the value: Equal, NotEqual, LessThan or GreaterThan.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Equal, NotEqual, LessThan, GreaterThan
     *
     * @return <p>The type of comparison that should be performed for the value: Equal, NotEqual, LessThan or GreaterThan.</p>
     *
     * @see InstancePatchStateOperatorType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>The type of comparison that should be performed for the value: Equal, NotEqual, LessThan or GreaterThan.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Equal, NotEqual, LessThan, GreaterThan
     *
     * @param type <p>The type of comparison that should be performed for the value: Equal, NotEqual, LessThan or GreaterThan.</p>
     *
     * @see InstancePatchStateOperatorType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>The type of comparison that should be performed for the value: Equal, NotEqual, LessThan or GreaterThan.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Equal, NotEqual, LessThan, GreaterThan
     *
     * @param type <p>The type of comparison that should be performed for the value: Equal, NotEqual, LessThan or GreaterThan.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see InstancePatchStateOperatorType
     */
    public InstancePatchStateFilter withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>The type of comparison that should be performed for the value: Equal, NotEqual, LessThan or GreaterThan.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Equal, NotEqual, LessThan, GreaterThan
     *
     * @param type <p>The type of comparison that should be performed for the value: Equal, NotEqual, LessThan or GreaterThan.</p>
     *
     * @see InstancePatchStateOperatorType
     */
    public void setType(InstancePatchStateOperatorType type) {
        this.type = type.toString();
    }

    /**
     * <p>The type of comparison that should be performed for the value: Equal, NotEqual, LessThan or GreaterThan.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Equal, NotEqual, LessThan, GreaterThan
     *
     * @param type <p>The type of comparison that should be performed for the value: Equal, NotEqual, LessThan or GreaterThan.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see InstancePatchStateOperatorType
     */
    public InstancePatchStateFilter withType(InstancePatchStateOperatorType type) {
        this.type = type.toString();
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
        if (getKey() != null) sb.append("Key: " + getKey() + ",");
        if (getValues() != null) sb.append("Values: " + getValues() + ",");
        if (getType() != null) sb.append("Type: " + getType());
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
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof InstancePatchStateFilter == false) return false;
        InstancePatchStateFilter other = (InstancePatchStateFilter)obj;

        if (other.getKey() == null ^ this.getKey() == null) return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false) return false;
        if (other.getValues() == null ^ this.getValues() == null) return false;
        if (other.getValues() != null && other.getValues().equals(this.getValues()) == false) return false;
        if (other.getType() == null ^ this.getType() == null) return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false) return false;
        return true;
    }
}
