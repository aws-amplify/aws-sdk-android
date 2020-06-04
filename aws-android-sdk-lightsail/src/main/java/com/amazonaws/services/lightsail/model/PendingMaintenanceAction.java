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

package com.amazonaws.services.lightsail.model;

import java.io.Serializable;

/**
 * <p>
 * Describes a pending database maintenance action.
 * </p>
 */
public class PendingMaintenanceAction implements Serializable {
    /**
     * <p>
     * The type of pending database maintenance action.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String action;

    /**
     * <p>
     * Additional detail about the pending database maintenance action.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String description;

    /**
     * <p>
     * The effective date of the pending database maintenance action.
     * </p>
     */
    private java.util.Date currentApplyDate;

    /**
     * <p>
     * The type of pending database maintenance action.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The type of pending database maintenance action.
     *         </p>
     */
    public String getAction() {
        return action;
    }

    /**
     * <p>
     * The type of pending database maintenance action.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param action <p>
     *            The type of pending database maintenance action.
     *            </p>
     */
    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * The type of pending database maintenance action.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param action <p>
     *            The type of pending database maintenance action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PendingMaintenanceAction withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * <p>
     * Additional detail about the pending database maintenance action.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         Additional detail about the pending database maintenance action.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * Additional detail about the pending database maintenance action.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param description <p>
     *            Additional detail about the pending database maintenance
     *            action.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Additional detail about the pending database maintenance action.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param description <p>
     *            Additional detail about the pending database maintenance
     *            action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PendingMaintenanceAction withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The effective date of the pending database maintenance action.
     * </p>
     *
     * @return <p>
     *         The effective date of the pending database maintenance action.
     *         </p>
     */
    public java.util.Date getCurrentApplyDate() {
        return currentApplyDate;
    }

    /**
     * <p>
     * The effective date of the pending database maintenance action.
     * </p>
     *
     * @param currentApplyDate <p>
     *            The effective date of the pending database maintenance action.
     *            </p>
     */
    public void setCurrentApplyDate(java.util.Date currentApplyDate) {
        this.currentApplyDate = currentApplyDate;
    }

    /**
     * <p>
     * The effective date of the pending database maintenance action.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param currentApplyDate <p>
     *            The effective date of the pending database maintenance action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PendingMaintenanceAction withCurrentApplyDate(java.util.Date currentApplyDate) {
        this.currentApplyDate = currentApplyDate;
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
        if (getAction() != null)
            sb.append("action: " + getAction() + ",");
        if (getDescription() != null)
            sb.append("description: " + getDescription() + ",");
        if (getCurrentApplyDate() != null)
            sb.append("currentApplyDate: " + getCurrentApplyDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getCurrentApplyDate() == null) ? 0 : getCurrentApplyDate().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PendingMaintenanceAction == false)
            return false;
        PendingMaintenanceAction other = (PendingMaintenanceAction) obj;

        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getCurrentApplyDate() == null ^ this.getCurrentApplyDate() == null)
            return false;
        if (other.getCurrentApplyDate() != null
                && other.getCurrentApplyDate().equals(this.getCurrentApplyDate()) == false)
            return false;
        return true;
    }
}
