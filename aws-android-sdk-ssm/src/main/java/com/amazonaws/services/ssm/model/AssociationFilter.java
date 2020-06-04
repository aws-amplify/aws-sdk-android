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
 * Describes a filter.
 * </p>
 */
public class AssociationFilter implements Serializable {
    /**
     * <p>
     * The name of the filter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InstanceId, Name, AssociationId,
     * AssociationStatusName, LastExecutedBefore, LastExecutedAfter,
     * AssociationName, ResourceGroupName
     */
    private String key;

    /**
     * <p>
     * The filter value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String value;

    /**
     * <p>
     * The name of the filter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InstanceId, Name, AssociationId,
     * AssociationStatusName, LastExecutedBefore, LastExecutedAfter,
     * AssociationName, ResourceGroupName
     *
     * @return <p>
     *         The name of the filter.
     *         </p>
     * @see AssociationFilterKey
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
     * <b>Allowed Values: </b>InstanceId, Name, AssociationId,
     * AssociationStatusName, LastExecutedBefore, LastExecutedAfter,
     * AssociationName, ResourceGroupName
     *
     * @param key <p>
     *            The name of the filter.
     *            </p>
     * @see AssociationFilterKey
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
     * <b>Allowed Values: </b>InstanceId, Name, AssociationId,
     * AssociationStatusName, LastExecutedBefore, LastExecutedAfter,
     * AssociationName, ResourceGroupName
     *
     * @param key <p>
     *            The name of the filter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AssociationFilterKey
     */
    public AssociationFilter withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * <p>
     * The name of the filter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InstanceId, Name, AssociationId,
     * AssociationStatusName, LastExecutedBefore, LastExecutedAfter,
     * AssociationName, ResourceGroupName
     *
     * @param key <p>
     *            The name of the filter.
     *            </p>
     * @see AssociationFilterKey
     */
    public void setKey(AssociationFilterKey key) {
        this.key = key.toString();
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
     * <b>Allowed Values: </b>InstanceId, Name, AssociationId,
     * AssociationStatusName, LastExecutedBefore, LastExecutedAfter,
     * AssociationName, ResourceGroupName
     *
     * @param key <p>
     *            The name of the filter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AssociationFilterKey
     */
    public AssociationFilter withKey(AssociationFilterKey key) {
        this.key = key.toString();
        return this;
    }

    /**
     * <p>
     * The filter value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The filter value.
     *         </p>
     */
    public String getValue() {
        return value;
    }

    /**
     * <p>
     * The filter value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param value <p>
     *            The filter value.
     *            </p>
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The filter value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param value <p>
     *            The filter value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssociationFilter withValue(String value) {
        this.value = value;
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
            sb.append("key: " + getKey() + ",");
        if (getValue() != null)
            sb.append("value: " + getValue());
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
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociationFilter == false)
            return false;
        AssociationFilter other = (AssociationFilter) obj;

        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }
}
