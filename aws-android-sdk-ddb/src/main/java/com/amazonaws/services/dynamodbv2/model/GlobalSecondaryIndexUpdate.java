/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;

/**
 * <p>
 * Represents one of the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * A new global secondary index to be added to an existing table.
 * </p>
 * </li>
 * <li>
 * <p>
 * New provisioned throughput parameters for an existing global secondary index.
 * </p>
 * </li>
 * <li>
 * <p>
 * An existing global secondary index to be removed from an existing table.
 * </p>
 * </li>
 * </ul>
 */
public class GlobalSecondaryIndexUpdate implements Serializable {
    /**
     * <p>
     * The name of an existing global secondary index, along with new
     * provisioned throughput settings to be applied to that index.
     * </p>
     */
    private UpdateGlobalSecondaryIndexAction update;

    /**
     * <p>
     * The parameters required for creating a global secondary index on an
     * existing table:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IndexName </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KeySchema </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AttributeDefinitions </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Projection </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ProvisionedThroughput </code>
     * </p>
     * </li>
     * </ul>
     */
    private CreateGlobalSecondaryIndexAction create;

    /**
     * <p>
     * The name of an existing global secondary index to be removed.
     * </p>
     */
    private DeleteGlobalSecondaryIndexAction delete;

    /**
     * <p>
     * The name of an existing global secondary index, along with new
     * provisioned throughput settings to be applied to that index.
     * </p>
     *
     * @return <p>
     *         The name of an existing global secondary index, along with new
     *         provisioned throughput settings to be applied to that index.
     *         </p>
     */
    public UpdateGlobalSecondaryIndexAction getUpdate() {
        return update;
    }

    /**
     * <p>
     * The name of an existing global secondary index, along with new
     * provisioned throughput settings to be applied to that index.
     * </p>
     *
     * @param update <p>
     *            The name of an existing global secondary index, along with new
     *            provisioned throughput settings to be applied to that index.
     *            </p>
     */
    public void setUpdate(UpdateGlobalSecondaryIndexAction update) {
        this.update = update;
    }

    /**
     * <p>
     * The name of an existing global secondary index, along with new
     * provisioned throughput settings to be applied to that index.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param update <p>
     *            The name of an existing global secondary index, along with new
     *            provisioned throughput settings to be applied to that index.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GlobalSecondaryIndexUpdate withUpdate(UpdateGlobalSecondaryIndexAction update) {
        this.update = update;
        return this;
    }

    /**
     * <p>
     * The parameters required for creating a global secondary index on an
     * existing table:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IndexName </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KeySchema </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AttributeDefinitions </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Projection </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ProvisionedThroughput </code>
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The parameters required for creating a global secondary index on
     *         an existing table:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>IndexName </code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>KeySchema </code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AttributeDefinitions </code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Projection </code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ProvisionedThroughput </code>
     *         </p>
     *         </li>
     *         </ul>
     */
    public CreateGlobalSecondaryIndexAction getCreate() {
        return create;
    }

    /**
     * <p>
     * The parameters required for creating a global secondary index on an
     * existing table:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IndexName </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KeySchema </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AttributeDefinitions </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Projection </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ProvisionedThroughput </code>
     * </p>
     * </li>
     * </ul>
     *
     * @param create <p>
     *            The parameters required for creating a global secondary index
     *            on an existing table:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>IndexName </code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>KeySchema </code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>AttributeDefinitions </code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Projection </code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ProvisionedThroughput </code>
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setCreate(CreateGlobalSecondaryIndexAction create) {
        this.create = create;
    }

    /**
     * <p>
     * The parameters required for creating a global secondary index on an
     * existing table:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IndexName </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KeySchema </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AttributeDefinitions </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Projection </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ProvisionedThroughput </code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param create <p>
     *            The parameters required for creating a global secondary index
     *            on an existing table:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>IndexName </code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>KeySchema </code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>AttributeDefinitions </code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Projection </code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ProvisionedThroughput </code>
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GlobalSecondaryIndexUpdate withCreate(CreateGlobalSecondaryIndexAction create) {
        this.create = create;
        return this;
    }

    /**
     * <p>
     * The name of an existing global secondary index to be removed.
     * </p>
     *
     * @return <p>
     *         The name of an existing global secondary index to be removed.
     *         </p>
     */
    public DeleteGlobalSecondaryIndexAction getDelete() {
        return delete;
    }

    /**
     * <p>
     * The name of an existing global secondary index to be removed.
     * </p>
     *
     * @param delete <p>
     *            The name of an existing global secondary index to be removed.
     *            </p>
     */
    public void setDelete(DeleteGlobalSecondaryIndexAction delete) {
        this.delete = delete;
    }

    /**
     * <p>
     * The name of an existing global secondary index to be removed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param delete <p>
     *            The name of an existing global secondary index to be removed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GlobalSecondaryIndexUpdate withDelete(DeleteGlobalSecondaryIndexAction delete) {
        this.delete = delete;
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
        if (getUpdate() != null)
            sb.append("Update: " + getUpdate() + ",");
        if (getCreate() != null)
            sb.append("Create: " + getCreate() + ",");
        if (getDelete() != null)
            sb.append("Delete: " + getDelete());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUpdate() == null) ? 0 : getUpdate().hashCode());
        hashCode = prime * hashCode + ((getCreate() == null) ? 0 : getCreate().hashCode());
        hashCode = prime * hashCode + ((getDelete() == null) ? 0 : getDelete().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GlobalSecondaryIndexUpdate == false)
            return false;
        GlobalSecondaryIndexUpdate other = (GlobalSecondaryIndexUpdate) obj;

        if (other.getUpdate() == null ^ this.getUpdate() == null)
            return false;
        if (other.getUpdate() != null && other.getUpdate().equals(this.getUpdate()) == false)
            return false;
        if (other.getCreate() == null ^ this.getCreate() == null)
            return false;
        if (other.getCreate() != null && other.getCreate().equals(this.getCreate()) == false)
            return false;
        if (other.getDelete() == null ^ this.getDelete() == null)
            return false;
        if (other.getDelete() != null && other.getDelete().equals(this.getDelete()) == false)
            return false;
        return true;
    }
}
