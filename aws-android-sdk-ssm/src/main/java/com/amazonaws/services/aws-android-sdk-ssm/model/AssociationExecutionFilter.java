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
 * <p>Filters used in the request.</p>
 */
public class AssociationExecutionFilter implements Serializable {
    /**
     * <p>The key value used in the request.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ExecutionId, Status, CreatedTime
     */
    private String key;

    /**
     * <p>The value specified for the key.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String value;

    /**
     * <p>The filter type specified in the request.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EQUAL, LESS_THAN, GREATER_THAN
     */
    private String type;

    /**
     * <p>The key value used in the request.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ExecutionId, Status, CreatedTime
     *
     * @return <p>The key value used in the request.</p>
     *
     * @see AssociationExecutionFilterKey
     */
    public String getKey() {
        return key;
    }

    /**
     * <p>The key value used in the request.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ExecutionId, Status, CreatedTime
     *
     * @param key <p>The key value used in the request.</p>
     *
     * @see AssociationExecutionFilterKey
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>The key value used in the request.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ExecutionId, Status, CreatedTime
     *
     * @param key <p>The key value used in the request.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see AssociationExecutionFilterKey
     */
    public AssociationExecutionFilter withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * <p>The key value used in the request.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ExecutionId, Status, CreatedTime
     *
     * @param key <p>The key value used in the request.</p>
     *
     * @see AssociationExecutionFilterKey
     */
    public void setKey(AssociationExecutionFilterKey key) {
        this.key = key.toString();
    }

    /**
     * <p>The key value used in the request.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ExecutionId, Status, CreatedTime
     *
     * @param key <p>The key value used in the request.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see AssociationExecutionFilterKey
     */
    public AssociationExecutionFilter withKey(AssociationExecutionFilterKey key) {
        this.key = key.toString();
        return this;
    }

    /**
     * <p>The value specified for the key.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>The value specified for the key.</p>
     */
    public String getValue() {
        return value;
    }

    /**
     * <p>The value specified for the key.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param value <p>The value specified for the key.</p>
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>The value specified for the key.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param value <p>The value specified for the key.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public AssociationExecutionFilter withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * <p>The filter type specified in the request.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EQUAL, LESS_THAN, GREATER_THAN
     *
     * @return <p>The filter type specified in the request.</p>
     *
     * @see AssociationFilterOperatorType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>The filter type specified in the request.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EQUAL, LESS_THAN, GREATER_THAN
     *
     * @param type <p>The filter type specified in the request.</p>
     *
     * @see AssociationFilterOperatorType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>The filter type specified in the request.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EQUAL, LESS_THAN, GREATER_THAN
     *
     * @param type <p>The filter type specified in the request.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see AssociationFilterOperatorType
     */
    public AssociationExecutionFilter withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>The filter type specified in the request.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EQUAL, LESS_THAN, GREATER_THAN
     *
     * @param type <p>The filter type specified in the request.</p>
     *
     * @see AssociationFilterOperatorType
     */
    public void setType(AssociationFilterOperatorType type) {
        this.type = type.toString();
    }

    /**
     * <p>The filter type specified in the request.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EQUAL, LESS_THAN, GREATER_THAN
     *
     * @param type <p>The filter type specified in the request.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see AssociationFilterOperatorType
     */
    public AssociationExecutionFilter withType(AssociationFilterOperatorType type) {
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
        if (getValue() != null) sb.append("Value: " + getValue() + ",");
        if (getType() != null) sb.append("Type: " + getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof AssociationExecutionFilter == false) return false;
        AssociationExecutionFilter other = (AssociationExecutionFilter)obj;

        if (other.getKey() == null ^ this.getKey() == null) return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false) return false;
        if (other.getValue() == null ^ this.getValue() == null) return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false) return false;
        if (other.getType() == null ^ this.getType() == null) return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false) return false;
        return true;
    }
}
