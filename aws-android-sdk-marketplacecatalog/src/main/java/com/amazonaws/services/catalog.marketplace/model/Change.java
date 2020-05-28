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

package com.amazonaws.services.catalog.marketplace.model;

import java.io.Serializable;

/**
 * <p>
 * An object that contains the <code>ChangeType</code>, <code>Details</code>,
 * and <code>Entity</code>.
 * </p>
 */
public class Change implements Serializable {
    /**
     * <p>
     * Change types are single string values that describe your intention for
     * the change. Each change type is unique for each <code>EntityType</code>
     * provided in the change's scope.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^[A-Z][\w]*$<br/>
     */
    private String changeType;

    /**
     * <p>
     * The entity to be changed.
     * </p>
     */
    private Entity entity;

    /**
     * <p>
     * This object contains details specific to the change type of the requested
     * change.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 16384<br/>
     * <b>Pattern: </b>^[\s]*\{[\s\S]*\}[\s]*$<br/>
     */
    private String details;

    /**
     * <p>
     * Change types are single string values that describe your intention for
     * the change. Each change type is unique for each <code>EntityType</code>
     * provided in the change's scope.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^[A-Z][\w]*$<br/>
     *
     * @return <p>
     *         Change types are single string values that describe your
     *         intention for the change. Each change type is unique for each
     *         <code>EntityType</code> provided in the change's scope.
     *         </p>
     */
    public String getChangeType() {
        return changeType;
    }

    /**
     * <p>
     * Change types are single string values that describe your intention for
     * the change. Each change type is unique for each <code>EntityType</code>
     * provided in the change's scope.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^[A-Z][\w]*$<br/>
     *
     * @param changeType <p>
     *            Change types are single string values that describe your
     *            intention for the change. Each change type is unique for each
     *            <code>EntityType</code> provided in the change's scope.
     *            </p>
     */
    public void setChangeType(String changeType) {
        this.changeType = changeType;
    }

    /**
     * <p>
     * Change types are single string values that describe your intention for
     * the change. Each change type is unique for each <code>EntityType</code>
     * provided in the change's scope.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^[A-Z][\w]*$<br/>
     *
     * @param changeType <p>
     *            Change types are single string values that describe your
     *            intention for the change. Each change type is unique for each
     *            <code>EntityType</code> provided in the change's scope.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Change withChangeType(String changeType) {
        this.changeType = changeType;
        return this;
    }

    /**
     * <p>
     * The entity to be changed.
     * </p>
     *
     * @return <p>
     *         The entity to be changed.
     *         </p>
     */
    public Entity getEntity() {
        return entity;
    }

    /**
     * <p>
     * The entity to be changed.
     * </p>
     *
     * @param entity <p>
     *            The entity to be changed.
     *            </p>
     */
    public void setEntity(Entity entity) {
        this.entity = entity;
    }

    /**
     * <p>
     * The entity to be changed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param entity <p>
     *            The entity to be changed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Change withEntity(Entity entity) {
        this.entity = entity;
        return this;
    }

    /**
     * <p>
     * This object contains details specific to the change type of the requested
     * change.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 16384<br/>
     * <b>Pattern: </b>^[\s]*\{[\s\S]*\}[\s]*$<br/>
     *
     * @return <p>
     *         This object contains details specific to the change type of the
     *         requested change.
     *         </p>
     */
    public String getDetails() {
        return details;
    }

    /**
     * <p>
     * This object contains details specific to the change type of the requested
     * change.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 16384<br/>
     * <b>Pattern: </b>^[\s]*\{[\s\S]*\}[\s]*$<br/>
     *
     * @param details <p>
     *            This object contains details specific to the change type of
     *            the requested change.
     *            </p>
     */
    public void setDetails(String details) {
        this.details = details;
    }

    /**
     * <p>
     * This object contains details specific to the change type of the requested
     * change.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 16384<br/>
     * <b>Pattern: </b>^[\s]*\{[\s\S]*\}[\s]*$<br/>
     *
     * @param details <p>
     *            This object contains details specific to the change type of
     *            the requested change.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Change withDetails(String details) {
        this.details = details;
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
        if (getChangeType() != null)
            sb.append("ChangeType: " + getChangeType() + ",");
        if (getEntity() != null)
            sb.append("Entity: " + getEntity() + ",");
        if (getDetails() != null)
            sb.append("Details: " + getDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChangeType() == null) ? 0 : getChangeType().hashCode());
        hashCode = prime * hashCode + ((getEntity() == null) ? 0 : getEntity().hashCode());
        hashCode = prime * hashCode + ((getDetails() == null) ? 0 : getDetails().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Change == false)
            return false;
        Change other = (Change) obj;

        if (other.getChangeType() == null ^ this.getChangeType() == null)
            return false;
        if (other.getChangeType() != null
                && other.getChangeType().equals(this.getChangeType()) == false)
            return false;
        if (other.getEntity() == null ^ this.getEntity() == null)
            return false;
        if (other.getEntity() != null && other.getEntity().equals(this.getEntity()) == false)
            return false;
        if (other.getDetails() == null ^ this.getDetails() == null)
            return false;
        if (other.getDetails() != null && other.getDetails().equals(this.getDetails()) == false)
            return false;
        return true;
    }
}
