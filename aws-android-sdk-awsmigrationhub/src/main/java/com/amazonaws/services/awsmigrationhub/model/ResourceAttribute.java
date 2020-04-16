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

package com.amazonaws.services.awsmigrationhub.model;

import java.io.Serializable;

/**
 * <p>
 * Attribute associated with a resource.
 * </p>
 * <p>
 * Note the corresponding format required per type listed below:
 * </p>
 * <dl>
 * <dt>IPV4</dt>
 * <dd>
 * <p>
 * <code>x.x.x.x</code>
 * </p>
 * <p>
 * <i>where x is an integer in the range [0,255]</i>
 * </p>
 * </dd>
 * <dt>IPV6</dt>
 * <dd>
 * <p>
 * <code>y : y : y : y : y : y : y : y</code>
 * </p>
 * <p>
 * <i>where y is a hexadecimal between 0 and FFFF. [0, FFFF]</i>
 * </p>
 * </dd>
 * <dt>MAC_ADDRESS</dt>
 * <dd>
 * <p>
 * <code>^([0-9A-Fa-f]{2}[:-]){5}([0-9A-Fa-f]{2})$</code>
 * </p>
 * </dd>
 * <dt>FQDN</dt>
 * <dd>
 * <p>
 * <code>^[^&lt;&gt;{}\\\\/?,=\\p{Cntrl}]{1,256}$</code>
 * </p>
 * </dd>
 * </dl>
 */
public class ResourceAttribute implements Serializable {
    /**
     * <p>
     * Type of resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IPV4_ADDRESS, IPV6_ADDRESS, MAC_ADDRESS, FQDN,
     * VM_MANAGER_ID, VM_MANAGED_OBJECT_REFERENCE, VM_NAME, VM_PATH, BIOS_ID,
     * MOTHERBOARD_SERIAL_NUMBER
     */
    private String type;

    /**
     * <p>
     * Value of the resource type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^.{1,256}$<br/>
     */
    private String value;

    /**
     * <p>
     * Type of resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IPV4_ADDRESS, IPV6_ADDRESS, MAC_ADDRESS, FQDN,
     * VM_MANAGER_ID, VM_MANAGED_OBJECT_REFERENCE, VM_NAME, VM_PATH, BIOS_ID,
     * MOTHERBOARD_SERIAL_NUMBER
     *
     * @return <p>
     *         Type of resource.
     *         </p>
     * @see ResourceAttributeType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * Type of resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IPV4_ADDRESS, IPV6_ADDRESS, MAC_ADDRESS, FQDN,
     * VM_MANAGER_ID, VM_MANAGED_OBJECT_REFERENCE, VM_NAME, VM_PATH, BIOS_ID,
     * MOTHERBOARD_SERIAL_NUMBER
     *
     * @param type <p>
     *            Type of resource.
     *            </p>
     * @see ResourceAttributeType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Type of resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IPV4_ADDRESS, IPV6_ADDRESS, MAC_ADDRESS, FQDN,
     * VM_MANAGER_ID, VM_MANAGED_OBJECT_REFERENCE, VM_NAME, VM_PATH, BIOS_ID,
     * MOTHERBOARD_SERIAL_NUMBER
     *
     * @param type <p>
     *            Type of resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ResourceAttributeType
     */
    public ResourceAttribute withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * Type of resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IPV4_ADDRESS, IPV6_ADDRESS, MAC_ADDRESS, FQDN,
     * VM_MANAGER_ID, VM_MANAGED_OBJECT_REFERENCE, VM_NAME, VM_PATH, BIOS_ID,
     * MOTHERBOARD_SERIAL_NUMBER
     *
     * @param type <p>
     *            Type of resource.
     *            </p>
     * @see ResourceAttributeType
     */
    public void setType(ResourceAttributeType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * Type of resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IPV4_ADDRESS, IPV6_ADDRESS, MAC_ADDRESS, FQDN,
     * VM_MANAGER_ID, VM_MANAGED_OBJECT_REFERENCE, VM_NAME, VM_PATH, BIOS_ID,
     * MOTHERBOARD_SERIAL_NUMBER
     *
     * @param type <p>
     *            Type of resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ResourceAttributeType
     */
    public ResourceAttribute withType(ResourceAttributeType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * Value of the resource type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^.{1,256}$<br/>
     *
     * @return <p>
     *         Value of the resource type.
     *         </p>
     */
    public String getValue() {
        return value;
    }

    /**
     * <p>
     * Value of the resource type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^.{1,256}$<br/>
     *
     * @param value <p>
     *            Value of the resource type.
     *            </p>
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * Value of the resource type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^.{1,256}$<br/>
     *
     * @param value <p>
     *            Value of the resource type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceAttribute withValue(String value) {
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
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getValue() != null)
            sb.append("Value: " + getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceAttribute == false)
            return false;
        ResourceAttribute other = (ResourceAttribute) obj;

        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }
}
