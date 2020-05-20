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
 * The details of the copy operation.
 * </p>
 */
public class CopyAction implements Serializable {
    /**
     * <p>
     * Contains an array of <code>Transition</code> objects specifying how long
     * in days before a recovery point transitions to cold storage or is
     * deleted.
     * </p>
     * <p>
     * Backups transitioned to cold storage must be stored in cold storage for a
     * minimum of 90 days. Therefore, on the console, the “expire after days”
     * setting must be 90 days greater than the “transition to cold after days”
     * setting. The “transition to cold after days” setting cannot be changed
     * after a backup has been transitioned to cold.
     * </p>
     */
    private Lifecycle lifecycle;

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies the destination
     * backup vault for the copied backup. For example,
     * <code>arn:aws:backup:us-east-1:123456789012:vault:aBackupVault</code>.
     * </p>
     */
    private String destinationBackupVaultArn;

    /**
     * <p>
     * Contains an array of <code>Transition</code> objects specifying how long
     * in days before a recovery point transitions to cold storage or is
     * deleted.
     * </p>
     * <p>
     * Backups transitioned to cold storage must be stored in cold storage for a
     * minimum of 90 days. Therefore, on the console, the “expire after days”
     * setting must be 90 days greater than the “transition to cold after days”
     * setting. The “transition to cold after days” setting cannot be changed
     * after a backup has been transitioned to cold.
     * </p>
     *
     * @return <p>
     *         Contains an array of <code>Transition</code> objects specifying
     *         how long in days before a recovery point transitions to cold
     *         storage or is deleted.
     *         </p>
     *         <p>
     *         Backups transitioned to cold storage must be stored in cold
     *         storage for a minimum of 90 days. Therefore, on the console, the
     *         “expire after days” setting must be 90 days greater than the
     *         “transition to cold after days” setting. The “transition to cold
     *         after days” setting cannot be changed after a backup has been
     *         transitioned to cold.
     *         </p>
     */
    public Lifecycle getLifecycle() {
        return lifecycle;
    }

    /**
     * <p>
     * Contains an array of <code>Transition</code> objects specifying how long
     * in days before a recovery point transitions to cold storage or is
     * deleted.
     * </p>
     * <p>
     * Backups transitioned to cold storage must be stored in cold storage for a
     * minimum of 90 days. Therefore, on the console, the “expire after days”
     * setting must be 90 days greater than the “transition to cold after days”
     * setting. The “transition to cold after days” setting cannot be changed
     * after a backup has been transitioned to cold.
     * </p>
     *
     * @param lifecycle <p>
     *            Contains an array of <code>Transition</code> objects
     *            specifying how long in days before a recovery point
     *            transitions to cold storage or is deleted.
     *            </p>
     *            <p>
     *            Backups transitioned to cold storage must be stored in cold
     *            storage for a minimum of 90 days. Therefore, on the console,
     *            the “expire after days” setting must be 90 days greater than
     *            the “transition to cold after days” setting. The “transition
     *            to cold after days” setting cannot be changed after a backup
     *            has been transitioned to cold.
     *            </p>
     */
    public void setLifecycle(Lifecycle lifecycle) {
        this.lifecycle = lifecycle;
    }

    /**
     * <p>
     * Contains an array of <code>Transition</code> objects specifying how long
     * in days before a recovery point transitions to cold storage or is
     * deleted.
     * </p>
     * <p>
     * Backups transitioned to cold storage must be stored in cold storage for a
     * minimum of 90 days. Therefore, on the console, the “expire after days”
     * setting must be 90 days greater than the “transition to cold after days”
     * setting. The “transition to cold after days” setting cannot be changed
     * after a backup has been transitioned to cold.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lifecycle <p>
     *            Contains an array of <code>Transition</code> objects
     *            specifying how long in days before a recovery point
     *            transitions to cold storage or is deleted.
     *            </p>
     *            <p>
     *            Backups transitioned to cold storage must be stored in cold
     *            storage for a minimum of 90 days. Therefore, on the console,
     *            the “expire after days” setting must be 90 days greater than
     *            the “transition to cold after days” setting. The “transition
     *            to cold after days” setting cannot be changed after a backup
     *            has been transitioned to cold.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CopyAction withLifecycle(Lifecycle lifecycle) {
        this.lifecycle = lifecycle;
        return this;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies the destination
     * backup vault for the copied backup. For example,
     * <code>arn:aws:backup:us-east-1:123456789012:vault:aBackupVault</code>.
     * </p>
     *
     * @return <p>
     *         An Amazon Resource Name (ARN) that uniquely identifies the
     *         destination backup vault for the copied backup. For example,
     *         <code>arn:aws:backup:us-east-1:123456789012:vault:aBackupVault</code>
     *         .
     *         </p>
     */
    public String getDestinationBackupVaultArn() {
        return destinationBackupVaultArn;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies the destination
     * backup vault for the copied backup. For example,
     * <code>arn:aws:backup:us-east-1:123456789012:vault:aBackupVault</code>.
     * </p>
     *
     * @param destinationBackupVaultArn <p>
     *            An Amazon Resource Name (ARN) that uniquely identifies the
     *            destination backup vault for the copied backup. For example,
     *            <code>arn:aws:backup:us-east-1:123456789012:vault:aBackupVault</code>
     *            .
     *            </p>
     */
    public void setDestinationBackupVaultArn(String destinationBackupVaultArn) {
        this.destinationBackupVaultArn = destinationBackupVaultArn;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies the destination
     * backup vault for the copied backup. For example,
     * <code>arn:aws:backup:us-east-1:123456789012:vault:aBackupVault</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param destinationBackupVaultArn <p>
     *            An Amazon Resource Name (ARN) that uniquely identifies the
     *            destination backup vault for the copied backup. For example,
     *            <code>arn:aws:backup:us-east-1:123456789012:vault:aBackupVault</code>
     *            .
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CopyAction withDestinationBackupVaultArn(String destinationBackupVaultArn) {
        this.destinationBackupVaultArn = destinationBackupVaultArn;
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
        if (getLifecycle() != null)
            sb.append("Lifecycle: " + getLifecycle() + ",");
        if (getDestinationBackupVaultArn() != null)
            sb.append("DestinationBackupVaultArn: " + getDestinationBackupVaultArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLifecycle() == null) ? 0 : getLifecycle().hashCode());
        hashCode = prime
                * hashCode
                + ((getDestinationBackupVaultArn() == null) ? 0 : getDestinationBackupVaultArn()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CopyAction == false)
            return false;
        CopyAction other = (CopyAction) obj;

        if (other.getLifecycle() == null ^ this.getLifecycle() == null)
            return false;
        if (other.getLifecycle() != null
                && other.getLifecycle().equals(this.getLifecycle()) == false)
            return false;
        if (other.getDestinationBackupVaultArn() == null
                ^ this.getDestinationBackupVaultArn() == null)
            return false;
        if (other.getDestinationBackupVaultArn() != null
                && other.getDestinationBackupVaultArn().equals(this.getDestinationBackupVaultArn()) == false)
            return false;
        return true;
    }
}
