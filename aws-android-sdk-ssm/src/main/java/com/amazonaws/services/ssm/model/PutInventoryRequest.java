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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Bulk update custom inventory items on one more instance. The request adds an
 * inventory item, if it doesn't already exist, or updates an inventory item, if
 * it does exist.
 * </p>
 */
public class PutInventoryRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * An instance ID where you want to add or update inventory items.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^i-(\w{8}|\w{17})$)|(^mi-\w{17}$)<br/>
     */
    private String instanceId;

    /**
     * <p>
     * The inventory items that you want to add or update on instances.
     * </p>
     */
    private java.util.List<InventoryItem> items;

    /**
     * <p>
     * An instance ID where you want to add or update inventory items.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^i-(\w{8}|\w{17})$)|(^mi-\w{17}$)<br/>
     *
     * @return <p>
     *         An instance ID where you want to add or update inventory items.
     *         </p>
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * <p>
     * An instance ID where you want to add or update inventory items.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^i-(\w{8}|\w{17})$)|(^mi-\w{17}$)<br/>
     *
     * @param instanceId <p>
     *            An instance ID where you want to add or update inventory
     *            items.
     *            </p>
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * An instance ID where you want to add or update inventory items.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^i-(\w{8}|\w{17})$)|(^mi-\w{17}$)<br/>
     *
     * @param instanceId <p>
     *            An instance ID where you want to add or update inventory
     *            items.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutInventoryRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * <p>
     * The inventory items that you want to add or update on instances.
     * </p>
     *
     * @return <p>
     *         The inventory items that you want to add or update on instances.
     *         </p>
     */
    public java.util.List<InventoryItem> getItems() {
        return items;
    }

    /**
     * <p>
     * The inventory items that you want to add or update on instances.
     * </p>
     *
     * @param items <p>
     *            The inventory items that you want to add or update on
     *            instances.
     *            </p>
     */
    public void setItems(java.util.Collection<InventoryItem> items) {
        if (items == null) {
            this.items = null;
            return;
        }

        this.items = new java.util.ArrayList<InventoryItem>(items);
    }

    /**
     * <p>
     * The inventory items that you want to add or update on instances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param items <p>
     *            The inventory items that you want to add or update on
     *            instances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutInventoryRequest withItems(InventoryItem... items) {
        if (getItems() == null) {
            this.items = new java.util.ArrayList<InventoryItem>(items.length);
        }
        for (InventoryItem value : items) {
            this.items.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The inventory items that you want to add or update on instances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param items <p>
     *            The inventory items that you want to add or update on
     *            instances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutInventoryRequest withItems(java.util.Collection<InventoryItem> items) {
        setItems(items);
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
        if (getInstanceId() != null)
            sb.append("InstanceId: " + getInstanceId() + ",");
        if (getItems() != null)
            sb.append("Items: " + getItems());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getItems() == null) ? 0 : getItems().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutInventoryRequest == false)
            return false;
        PutInventoryRequest other = (PutInventoryRequest) obj;

        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getItems() == null ^ this.getItems() == null)
            return false;
        if (other.getItems() != null && other.getItems().equals(this.getItems()) == false)
            return false;
        return true;
    }
}
