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
 * Describes a filter for a specific list of instances. You can filter instances
 * information by using tags. You specify tags by using a key-value mapping.
 * </p>
 * <p>
 * Use this action instead of the
 * <a>DescribeInstanceInformationRequest$InstanceInformationFilterList</a>
 * method. The <code>InstanceInformationFilterList</code> method is a legacy
 * method and does not support tags.
 * </p>
 */
public class InstanceInformationFilter implements Serializable {
    /**
     * <p>
     * The name of the filter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InstanceIds, AgentVersion, PingStatus,
     * PlatformTypes, ActivationIds, IamRole, ResourceType, AssociationStatus
     */
    private String key;

    /**
     * <p>
     * The filter values.
     * </p>
     */
    private java.util.List<String> valueSet;

    /**
     * <p>
     * The name of the filter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InstanceIds, AgentVersion, PingStatus,
     * PlatformTypes, ActivationIds, IamRole, ResourceType, AssociationStatus
     *
     * @return <p>
     *         The name of the filter.
     *         </p>
     * @see InstanceInformationFilterKey
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
     * <b>Allowed Values: </b>InstanceIds, AgentVersion, PingStatus,
     * PlatformTypes, ActivationIds, IamRole, ResourceType, AssociationStatus
     *
     * @param key <p>
     *            The name of the filter.
     *            </p>
     * @see InstanceInformationFilterKey
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
     * <b>Allowed Values: </b>InstanceIds, AgentVersion, PingStatus,
     * PlatformTypes, ActivationIds, IamRole, ResourceType, AssociationStatus
     *
     * @param key <p>
     *            The name of the filter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InstanceInformationFilterKey
     */
    public InstanceInformationFilter withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * <p>
     * The name of the filter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InstanceIds, AgentVersion, PingStatus,
     * PlatformTypes, ActivationIds, IamRole, ResourceType, AssociationStatus
     *
     * @param key <p>
     *            The name of the filter.
     *            </p>
     * @see InstanceInformationFilterKey
     */
    public void setKey(InstanceInformationFilterKey key) {
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
     * <b>Allowed Values: </b>InstanceIds, AgentVersion, PingStatus,
     * PlatformTypes, ActivationIds, IamRole, ResourceType, AssociationStatus
     *
     * @param key <p>
     *            The name of the filter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InstanceInformationFilterKey
     */
    public InstanceInformationFilter withKey(InstanceInformationFilterKey key) {
        this.key = key.toString();
        return this;
    }

    /**
     * <p>
     * The filter values.
     * </p>
     *
     * @return <p>
     *         The filter values.
     *         </p>
     */
    public java.util.List<String> getValueSet() {
        return valueSet;
    }

    /**
     * <p>
     * The filter values.
     * </p>
     *
     * @param valueSet <p>
     *            The filter values.
     *            </p>
     */
    public void setValueSet(java.util.Collection<String> valueSet) {
        if (valueSet == null) {
            this.valueSet = null;
            return;
        }

        this.valueSet = new java.util.ArrayList<String>(valueSet);
    }

    /**
     * <p>
     * The filter values.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param valueSet <p>
     *            The filter values.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceInformationFilter withValueSet(String... valueSet) {
        if (getValueSet() == null) {
            this.valueSet = new java.util.ArrayList<String>(valueSet.length);
        }
        for (String value : valueSet) {
            this.valueSet.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The filter values.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param valueSet <p>
     *            The filter values.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceInformationFilter withValueSet(java.util.Collection<String> valueSet) {
        setValueSet(valueSet);
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
        if (getValueSet() != null)
            sb.append("valueSet: " + getValueSet());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getValueSet() == null) ? 0 : getValueSet().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceInformationFilter == false)
            return false;
        InstanceInformationFilter other = (InstanceInformationFilter) obj;

        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getValueSet() == null ^ this.getValueSet() == null)
            return false;
        if (other.getValueSet() != null && other.getValueSet().equals(this.getValueSet()) == false)
            return false;
        return true;
    }
}
