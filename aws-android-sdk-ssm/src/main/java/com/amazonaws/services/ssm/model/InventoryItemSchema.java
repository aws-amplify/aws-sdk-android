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
 * The inventory item schema definition. Users can use this to compose inventory
 * query filters.
 * </p>
 */
public class InventoryItemSchema implements Serializable {
    /**
     * <p>
     * The name of the inventory type. Default inventory item type names start
     * with AWS. Custom inventory type names will start with Custom. Default
     * inventory item types include the following: AWS:AWSComponent,
     * AWS:Application, AWS:InstanceInformation, AWS:Network, and
     * AWS:WindowsUpdate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^(AWS|Custom):.*$<br/>
     */
    private String typeName;

    /**
     * <p>
     * The schema version for the inventory item.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^([0-9]{1,6})(\.[0-9]{1,6})$<br/>
     */
    private String version;

    /**
     * <p>
     * The schema attributes for inventory. This contains data type and
     * attribute name.
     * </p>
     */
    private java.util.List<InventoryItemAttribute> attributes;

    /**
     * <p>
     * The alias name of the inventory type. The alias name is used for display
     * purposes.
     * </p>
     */
    private String displayName;

    /**
     * <p>
     * The name of the inventory type. Default inventory item type names start
     * with AWS. Custom inventory type names will start with Custom. Default
     * inventory item types include the following: AWS:AWSComponent,
     * AWS:Application, AWS:InstanceInformation, AWS:Network, and
     * AWS:WindowsUpdate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^(AWS|Custom):.*$<br/>
     *
     * @return <p>
     *         The name of the inventory type. Default inventory item type names
     *         start with AWS. Custom inventory type names will start with
     *         Custom. Default inventory item types include the following:
     *         AWS:AWSComponent, AWS:Application, AWS:InstanceInformation,
     *         AWS:Network, and AWS:WindowsUpdate.
     *         </p>
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * <p>
     * The name of the inventory type. Default inventory item type names start
     * with AWS. Custom inventory type names will start with Custom. Default
     * inventory item types include the following: AWS:AWSComponent,
     * AWS:Application, AWS:InstanceInformation, AWS:Network, and
     * AWS:WindowsUpdate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^(AWS|Custom):.*$<br/>
     *
     * @param typeName <p>
     *            The name of the inventory type. Default inventory item type
     *            names start with AWS. Custom inventory type names will start
     *            with Custom. Default inventory item types include the
     *            following: AWS:AWSComponent, AWS:Application,
     *            AWS:InstanceInformation, AWS:Network, and AWS:WindowsUpdate.
     *            </p>
     */
    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    /**
     * <p>
     * The name of the inventory type. Default inventory item type names start
     * with AWS. Custom inventory type names will start with Custom. Default
     * inventory item types include the following: AWS:AWSComponent,
     * AWS:Application, AWS:InstanceInformation, AWS:Network, and
     * AWS:WindowsUpdate.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^(AWS|Custom):.*$<br/>
     *
     * @param typeName <p>
     *            The name of the inventory type. Default inventory item type
     *            names start with AWS. Custom inventory type names will start
     *            with Custom. Default inventory item types include the
     *            following: AWS:AWSComponent, AWS:Application,
     *            AWS:InstanceInformation, AWS:Network, and AWS:WindowsUpdate.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InventoryItemSchema withTypeName(String typeName) {
        this.typeName = typeName;
        return this;
    }

    /**
     * <p>
     * The schema version for the inventory item.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^([0-9]{1,6})(\.[0-9]{1,6})$<br/>
     *
     * @return <p>
     *         The schema version for the inventory item.
     *         </p>
     */
    public String getVersion() {
        return version;
    }

    /**
     * <p>
     * The schema version for the inventory item.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^([0-9]{1,6})(\.[0-9]{1,6})$<br/>
     *
     * @param version <p>
     *            The schema version for the inventory item.
     *            </p>
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The schema version for the inventory item.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^([0-9]{1,6})(\.[0-9]{1,6})$<br/>
     *
     * @param version <p>
     *            The schema version for the inventory item.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InventoryItemSchema withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * <p>
     * The schema attributes for inventory. This contains data type and
     * attribute name.
     * </p>
     *
     * @return <p>
     *         The schema attributes for inventory. This contains data type and
     *         attribute name.
     *         </p>
     */
    public java.util.List<InventoryItemAttribute> getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * The schema attributes for inventory. This contains data type and
     * attribute name.
     * </p>
     *
     * @param attributes <p>
     *            The schema attributes for inventory. This contains data type
     *            and attribute name.
     *            </p>
     */
    public void setAttributes(java.util.Collection<InventoryItemAttribute> attributes) {
        if (attributes == null) {
            this.attributes = null;
            return;
        }

        this.attributes = new java.util.ArrayList<InventoryItemAttribute>(attributes);
    }

    /**
     * <p>
     * The schema attributes for inventory. This contains data type and
     * attribute name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attributes <p>
     *            The schema attributes for inventory. This contains data type
     *            and attribute name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InventoryItemSchema withAttributes(InventoryItemAttribute... attributes) {
        if (getAttributes() == null) {
            this.attributes = new java.util.ArrayList<InventoryItemAttribute>(attributes.length);
        }
        for (InventoryItemAttribute value : attributes) {
            this.attributes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The schema attributes for inventory. This contains data type and
     * attribute name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attributes <p>
     *            The schema attributes for inventory. This contains data type
     *            and attribute name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InventoryItemSchema withAttributes(
            java.util.Collection<InventoryItemAttribute> attributes) {
        setAttributes(attributes);
        return this;
    }

    /**
     * <p>
     * The alias name of the inventory type. The alias name is used for display
     * purposes.
     * </p>
     *
     * @return <p>
     *         The alias name of the inventory type. The alias name is used for
     *         display purposes.
     *         </p>
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * <p>
     * The alias name of the inventory type. The alias name is used for display
     * purposes.
     * </p>
     *
     * @param displayName <p>
     *            The alias name of the inventory type. The alias name is used
     *            for display purposes.
     *            </p>
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The alias name of the inventory type. The alias name is used for display
     * purposes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param displayName <p>
     *            The alias name of the inventory type. The alias name is used
     *            for display purposes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InventoryItemSchema withDisplayName(String displayName) {
        this.displayName = displayName;
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
        if (getTypeName() != null)
            sb.append("TypeName: " + getTypeName() + ",");
        if (getVersion() != null)
            sb.append("Version: " + getVersion() + ",");
        if (getAttributes() != null)
            sb.append("Attributes: " + getAttributes() + ",");
        if (getDisplayName() != null)
            sb.append("DisplayName: " + getDisplayName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTypeName() == null) ? 0 : getTypeName().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        hashCode = prime * hashCode
                + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InventoryItemSchema == false)
            return false;
        InventoryItemSchema other = (InventoryItemSchema) obj;

        if (other.getTypeName() == null ^ this.getTypeName() == null)
            return false;
        if (other.getTypeName() != null && other.getTypeName().equals(this.getTypeName()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null
                && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null
                && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        return true;
    }
}
