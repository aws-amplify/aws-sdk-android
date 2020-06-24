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

package com.amazonaws.services.backup.model;

import java.io.Serializable;

/**
 * <p>
 * Contains an array of <code>Transition</code> objects specifying how long in
 * days before a recovery point transitions to cold storage or is deleted.
 * </p>
 * <p>
 * Backups transitioned to cold storage must be stored in cold storage for a
 * minimum of 90 days. Therefore, on the console, the “expire after days”
 * setting must be 90 days greater than the “transition to cold after days”
 * setting. The “transition to cold after days” setting cannot be changed after
 * a backup has been transitioned to cold.
 * </p>
 */
public class Lifecycle implements Serializable {
    /**
     * <p>
     * Specifies the number of days after creation that a recovery point is
     * moved to cold storage.
     * </p>
     */
    private Long moveToColdStorageAfterDays;

    /**
     * <p>
     * Specifies the number of days after creation that a recovery point is
     * deleted. Must be greater than 90 days plus
     * <code>MoveToColdStorageAfterDays</code>.
     * </p>
     */
    private Long deleteAfterDays;

    /**
     * <p>
     * Specifies the number of days after creation that a recovery point is
     * moved to cold storage.
     * </p>
     *
     * @return <p>
     *         Specifies the number of days after creation that a recovery point
     *         is moved to cold storage.
     *         </p>
     */
    public Long getMoveToColdStorageAfterDays() {
        return moveToColdStorageAfterDays;
    }

    /**
     * <p>
     * Specifies the number of days after creation that a recovery point is
     * moved to cold storage.
     * </p>
     *
     * @param moveToColdStorageAfterDays <p>
     *            Specifies the number of days after creation that a recovery
     *            point is moved to cold storage.
     *            </p>
     */
    public void setMoveToColdStorageAfterDays(Long moveToColdStorageAfterDays) {
        this.moveToColdStorageAfterDays = moveToColdStorageAfterDays;
    }

    /**
     * <p>
     * Specifies the number of days after creation that a recovery point is
     * moved to cold storage.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param moveToColdStorageAfterDays <p>
     *            Specifies the number of days after creation that a recovery
     *            point is moved to cold storage.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Lifecycle withMoveToColdStorageAfterDays(Long moveToColdStorageAfterDays) {
        this.moveToColdStorageAfterDays = moveToColdStorageAfterDays;
        return this;
    }

    /**
     * <p>
     * Specifies the number of days after creation that a recovery point is
     * deleted. Must be greater than 90 days plus
     * <code>MoveToColdStorageAfterDays</code>.
     * </p>
     *
     * @return <p>
     *         Specifies the number of days after creation that a recovery point
     *         is deleted. Must be greater than 90 days plus
     *         <code>MoveToColdStorageAfterDays</code>.
     *         </p>
     */
    public Long getDeleteAfterDays() {
        return deleteAfterDays;
    }

    /**
     * <p>
     * Specifies the number of days after creation that a recovery point is
     * deleted. Must be greater than 90 days plus
     * <code>MoveToColdStorageAfterDays</code>.
     * </p>
     *
     * @param deleteAfterDays <p>
     *            Specifies the number of days after creation that a recovery
     *            point is deleted. Must be greater than 90 days plus
     *            <code>MoveToColdStorageAfterDays</code>.
     *            </p>
     */
    public void setDeleteAfterDays(Long deleteAfterDays) {
        this.deleteAfterDays = deleteAfterDays;
    }

    /**
     * <p>
     * Specifies the number of days after creation that a recovery point is
     * deleted. Must be greater than 90 days plus
     * <code>MoveToColdStorageAfterDays</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deleteAfterDays <p>
     *            Specifies the number of days after creation that a recovery
     *            point is deleted. Must be greater than 90 days plus
     *            <code>MoveToColdStorageAfterDays</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Lifecycle withDeleteAfterDays(Long deleteAfterDays) {
        this.deleteAfterDays = deleteAfterDays;
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
        if (getMoveToColdStorageAfterDays() != null)
            sb.append("MoveToColdStorageAfterDays: " + getMoveToColdStorageAfterDays() + ",");
        if (getDeleteAfterDays() != null)
            sb.append("DeleteAfterDays: " + getDeleteAfterDays());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getMoveToColdStorageAfterDays() == null) ? 0 : getMoveToColdStorageAfterDays()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getDeleteAfterDays() == null) ? 0 : getDeleteAfterDays().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Lifecycle == false)
            return false;
        Lifecycle other = (Lifecycle) obj;

        if (other.getMoveToColdStorageAfterDays() == null
                ^ this.getMoveToColdStorageAfterDays() == null)
            return false;
        if (other.getMoveToColdStorageAfterDays() != null
                && other.getMoveToColdStorageAfterDays().equals(
                        this.getMoveToColdStorageAfterDays()) == false)
            return false;
        if (other.getDeleteAfterDays() == null ^ this.getDeleteAfterDays() == null)
            return false;
        if (other.getDeleteAfterDays() != null
                && other.getDeleteAfterDays().equals(this.getDeleteAfterDays()) == false)
            return false;
        return true;
    }
}
