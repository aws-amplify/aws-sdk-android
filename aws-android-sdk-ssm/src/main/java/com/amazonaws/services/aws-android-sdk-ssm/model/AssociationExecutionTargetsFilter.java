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
 * <p>Filters for the association execution.</p>
 */
public class AssociationExecutionTargetsFilter implements Serializable {
    /**
     * <p>The key value used in the request.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Status, ResourceId, ResourceType
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
     * <p>The key value used in the request.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Status, ResourceId, ResourceType
     *
     * @return <p>The key value used in the request.</p>
     *
     * @see AssociationExecutionTargetsFilterKey
     */
    public String getKey() {
        return key;
    }

    /**
     * <p>The key value used in the request.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Status, ResourceId, ResourceType
     *
     * @param key <p>The key value used in the request.</p>
     *
     * @see AssociationExecutionTargetsFilterKey
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
     * <b>Allowed Values: </b>Status, ResourceId, ResourceType
     *
     * @param key <p>The key value used in the request.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see AssociationExecutionTargetsFilterKey
     */
    public AssociationExecutionTargetsFilter withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * <p>The key value used in the request.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Status, ResourceId, ResourceType
     *
     * @param key <p>The key value used in the request.</p>
     *
     * @see AssociationExecutionTargetsFilterKey
     */
    public void setKey(AssociationExecutionTargetsFilterKey key) {
        this.key = key.toString();
    }

    /**
     * <p>The key value used in the request.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Status, ResourceId, ResourceType
     *
     * @param key <p>The key value used in the request.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see AssociationExecutionTargetsFilterKey
     */
    public AssociationExecutionTargetsFilter withKey(AssociationExecutionTargetsFilterKey key) {
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
    public AssociationExecutionTargetsFilter withValue(String value) {
        this.value = value;
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
        if (getValue() != null) sb.append("Value: " + getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof AssociationExecutionTargetsFilter == false) return false;
        AssociationExecutionTargetsFilter other = (AssociationExecutionTargetsFilter)obj;

        if (other.getKey() == null ^ this.getKey() == null) return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false) return false;
        if (other.getValue() == null ^ this.getValue() == null) return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false) return false;
        return true;
    }
}
