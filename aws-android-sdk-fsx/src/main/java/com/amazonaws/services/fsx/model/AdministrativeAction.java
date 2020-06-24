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

package com.amazonaws.services.fsx.model;

import java.io.Serializable;

/**
 * <p>
 * Describes a specific Amazon FSx Administrative Action for the current Windows
 * file system.
 * </p>
 */
public class AdministrativeAction implements Serializable {
    /**
     * <p>
     * Describes the type of administrative action, as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FILE_SYSTEM_UPDATE</code> - A file system update administrative
     * action initiated by the user from the Amazon FSx console, API
     * (UpdateFileSystem), or CLI (update-file-system). A
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STORAGE_OPTIMIZATION</code> - Once the
     * <code>FILE_SYSTEM_UPDATE</code> task to increase a file system's storage
     * capacity completes successfully, a <code>STORAGE_OPTIMIZATION</code> task
     * starts. Storage optimization is the process of migrating the file system
     * data to the new, larger disks. You can track the storage migration
     * progress using the <code>ProgressPercent</code> property. When
     * <code>STORAGE_OPTIMIZATION</code> completes successfully, the parent
     * <code>FILE_SYSTEM_UPDATE</code> action status changes to
     * <code>COMPLETED</code>. For more information, see <a href=
     * "https://docs.aws.amazon.com/fsx/latest/WindowsGuide/managing-storage-capacity.html"
     * >Managing Storage Capacity</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FILE_SYSTEM_UPDATE, STORAGE_OPTIMIZATION
     */
    private String administrativeActionType;

    /**
     * <p>
     * Provides the percent complete of a <code>STORAGE_OPTIMIZATION</code>
     * administrative action.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     */
    private Integer progressPercent;

    /**
     * <p>
     * Time that the administrative action request was received.
     * </p>
     */
    private java.util.Date requestTime;

    /**
     * <p>
     * Describes the status of the administrative action, as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FAILED</code> - Amazon FSx failed to process the administrative
     * action successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code> - Amazon FSx is processing the administrative
     * action.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING</code> - Amazon FSx is waiting to process the
     * administrative action.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLETED</code> - Amazon FSx has finished processing the
     * administrative task.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATED_OPTIMIZING</code> - For a storage capacity increase update,
     * Amazon FSx has updated the file system with the new storage capacity, and
     * is now performing the storage optimization process. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/fsx/latest/WindowsGuide/managing-storage-capacity.html"
     * >Managing Storage Capacity</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FAILED, IN_PROGRESS, PENDING, COMPLETED,
     * UPDATED_OPTIMIZING
     */
    private String status;

    /**
     * <p>
     * Describes the target <code>StorageCapacity</code> or
     * <code>ThroughputCapacity</code> value provided in the
     * <code>UpdateFileSystem</code> operation. Returned for
     * <code>FILE_SYSTEM_UPDATE</code> administrative actions.
     * </p>
     */
    private FileSystem targetFileSystemValues;

    /**
     * <p>
     * Provides information about a failed administrative action.
     * </p>
     */
    private AdministrativeActionFailureDetails failureDetails;

    /**
     * <p>
     * Describes the type of administrative action, as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FILE_SYSTEM_UPDATE</code> - A file system update administrative
     * action initiated by the user from the Amazon FSx console, API
     * (UpdateFileSystem), or CLI (update-file-system). A
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STORAGE_OPTIMIZATION</code> - Once the
     * <code>FILE_SYSTEM_UPDATE</code> task to increase a file system's storage
     * capacity completes successfully, a <code>STORAGE_OPTIMIZATION</code> task
     * starts. Storage optimization is the process of migrating the file system
     * data to the new, larger disks. You can track the storage migration
     * progress using the <code>ProgressPercent</code> property. When
     * <code>STORAGE_OPTIMIZATION</code> completes successfully, the parent
     * <code>FILE_SYSTEM_UPDATE</code> action status changes to
     * <code>COMPLETED</code>. For more information, see <a href=
     * "https://docs.aws.amazon.com/fsx/latest/WindowsGuide/managing-storage-capacity.html"
     * >Managing Storage Capacity</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FILE_SYSTEM_UPDATE, STORAGE_OPTIMIZATION
     *
     * @return <p>
     *         Describes the type of administrative action, as follows:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>FILE_SYSTEM_UPDATE</code> - A file system update
     *         administrative action initiated by the user from the Amazon FSx
     *         console, API (UpdateFileSystem), or CLI (update-file-system). A
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>STORAGE_OPTIMIZATION</code> - Once the
     *         <code>FILE_SYSTEM_UPDATE</code> task to increase a file system's
     *         storage capacity completes successfully, a
     *         <code>STORAGE_OPTIMIZATION</code> task starts. Storage
     *         optimization is the process of migrating the file system data to
     *         the new, larger disks. You can track the storage migration
     *         progress using the <code>ProgressPercent</code> property. When
     *         <code>STORAGE_OPTIMIZATION</code> completes successfully, the
     *         parent <code>FILE_SYSTEM_UPDATE</code> action status changes to
     *         <code>COMPLETED</code>. For more information, see <a href=
     *         "https://docs.aws.amazon.com/fsx/latest/WindowsGuide/managing-storage-capacity.html"
     *         >Managing Storage Capacity</a>.
     *         </p>
     *         </li>
     *         </ul>
     * @see AdministrativeActionType
     */
    public String getAdministrativeActionType() {
        return administrativeActionType;
    }

    /**
     * <p>
     * Describes the type of administrative action, as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FILE_SYSTEM_UPDATE</code> - A file system update administrative
     * action initiated by the user from the Amazon FSx console, API
     * (UpdateFileSystem), or CLI (update-file-system). A
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STORAGE_OPTIMIZATION</code> - Once the
     * <code>FILE_SYSTEM_UPDATE</code> task to increase a file system's storage
     * capacity completes successfully, a <code>STORAGE_OPTIMIZATION</code> task
     * starts. Storage optimization is the process of migrating the file system
     * data to the new, larger disks. You can track the storage migration
     * progress using the <code>ProgressPercent</code> property. When
     * <code>STORAGE_OPTIMIZATION</code> completes successfully, the parent
     * <code>FILE_SYSTEM_UPDATE</code> action status changes to
     * <code>COMPLETED</code>. For more information, see <a href=
     * "https://docs.aws.amazon.com/fsx/latest/WindowsGuide/managing-storage-capacity.html"
     * >Managing Storage Capacity</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FILE_SYSTEM_UPDATE, STORAGE_OPTIMIZATION
     *
     * @param administrativeActionType <p>
     *            Describes the type of administrative action, as follows:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>FILE_SYSTEM_UPDATE</code> - A file system update
     *            administrative action initiated by the user from the Amazon
     *            FSx console, API (UpdateFileSystem), or CLI
     *            (update-file-system). A
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>STORAGE_OPTIMIZATION</code> - Once the
     *            <code>FILE_SYSTEM_UPDATE</code> task to increase a file
     *            system's storage capacity completes successfully, a
     *            <code>STORAGE_OPTIMIZATION</code> task starts. Storage
     *            optimization is the process of migrating the file system data
     *            to the new, larger disks. You can track the storage migration
     *            progress using the <code>ProgressPercent</code> property. When
     *            <code>STORAGE_OPTIMIZATION</code> completes successfully, the
     *            parent <code>FILE_SYSTEM_UPDATE</code> action status changes
     *            to <code>COMPLETED</code>. For more information, see <a href=
     *            "https://docs.aws.amazon.com/fsx/latest/WindowsGuide/managing-storage-capacity.html"
     *            >Managing Storage Capacity</a>.
     *            </p>
     *            </li>
     *            </ul>
     * @see AdministrativeActionType
     */
    public void setAdministrativeActionType(String administrativeActionType) {
        this.administrativeActionType = administrativeActionType;
    }

    /**
     * <p>
     * Describes the type of administrative action, as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FILE_SYSTEM_UPDATE</code> - A file system update administrative
     * action initiated by the user from the Amazon FSx console, API
     * (UpdateFileSystem), or CLI (update-file-system). A
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STORAGE_OPTIMIZATION</code> - Once the
     * <code>FILE_SYSTEM_UPDATE</code> task to increase a file system's storage
     * capacity completes successfully, a <code>STORAGE_OPTIMIZATION</code> task
     * starts. Storage optimization is the process of migrating the file system
     * data to the new, larger disks. You can track the storage migration
     * progress using the <code>ProgressPercent</code> property. When
     * <code>STORAGE_OPTIMIZATION</code> completes successfully, the parent
     * <code>FILE_SYSTEM_UPDATE</code> action status changes to
     * <code>COMPLETED</code>. For more information, see <a href=
     * "https://docs.aws.amazon.com/fsx/latest/WindowsGuide/managing-storage-capacity.html"
     * >Managing Storage Capacity</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FILE_SYSTEM_UPDATE, STORAGE_OPTIMIZATION
     *
     * @param administrativeActionType <p>
     *            Describes the type of administrative action, as follows:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>FILE_SYSTEM_UPDATE</code> - A file system update
     *            administrative action initiated by the user from the Amazon
     *            FSx console, API (UpdateFileSystem), or CLI
     *            (update-file-system). A
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>STORAGE_OPTIMIZATION</code> - Once the
     *            <code>FILE_SYSTEM_UPDATE</code> task to increase a file
     *            system's storage capacity completes successfully, a
     *            <code>STORAGE_OPTIMIZATION</code> task starts. Storage
     *            optimization is the process of migrating the file system data
     *            to the new, larger disks. You can track the storage migration
     *            progress using the <code>ProgressPercent</code> property. When
     *            <code>STORAGE_OPTIMIZATION</code> completes successfully, the
     *            parent <code>FILE_SYSTEM_UPDATE</code> action status changes
     *            to <code>COMPLETED</code>. For more information, see <a href=
     *            "https://docs.aws.amazon.com/fsx/latest/WindowsGuide/managing-storage-capacity.html"
     *            >Managing Storage Capacity</a>.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AdministrativeActionType
     */
    public AdministrativeAction withAdministrativeActionType(String administrativeActionType) {
        this.administrativeActionType = administrativeActionType;
        return this;
    }

    /**
     * <p>
     * Describes the type of administrative action, as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FILE_SYSTEM_UPDATE</code> - A file system update administrative
     * action initiated by the user from the Amazon FSx console, API
     * (UpdateFileSystem), or CLI (update-file-system). A
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STORAGE_OPTIMIZATION</code> - Once the
     * <code>FILE_SYSTEM_UPDATE</code> task to increase a file system's storage
     * capacity completes successfully, a <code>STORAGE_OPTIMIZATION</code> task
     * starts. Storage optimization is the process of migrating the file system
     * data to the new, larger disks. You can track the storage migration
     * progress using the <code>ProgressPercent</code> property. When
     * <code>STORAGE_OPTIMIZATION</code> completes successfully, the parent
     * <code>FILE_SYSTEM_UPDATE</code> action status changes to
     * <code>COMPLETED</code>. For more information, see <a href=
     * "https://docs.aws.amazon.com/fsx/latest/WindowsGuide/managing-storage-capacity.html"
     * >Managing Storage Capacity</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FILE_SYSTEM_UPDATE, STORAGE_OPTIMIZATION
     *
     * @param administrativeActionType <p>
     *            Describes the type of administrative action, as follows:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>FILE_SYSTEM_UPDATE</code> - A file system update
     *            administrative action initiated by the user from the Amazon
     *            FSx console, API (UpdateFileSystem), or CLI
     *            (update-file-system). A
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>STORAGE_OPTIMIZATION</code> - Once the
     *            <code>FILE_SYSTEM_UPDATE</code> task to increase a file
     *            system's storage capacity completes successfully, a
     *            <code>STORAGE_OPTIMIZATION</code> task starts. Storage
     *            optimization is the process of migrating the file system data
     *            to the new, larger disks. You can track the storage migration
     *            progress using the <code>ProgressPercent</code> property. When
     *            <code>STORAGE_OPTIMIZATION</code> completes successfully, the
     *            parent <code>FILE_SYSTEM_UPDATE</code> action status changes
     *            to <code>COMPLETED</code>. For more information, see <a href=
     *            "https://docs.aws.amazon.com/fsx/latest/WindowsGuide/managing-storage-capacity.html"
     *            >Managing Storage Capacity</a>.
     *            </p>
     *            </li>
     *            </ul>
     * @see AdministrativeActionType
     */
    public void setAdministrativeActionType(AdministrativeActionType administrativeActionType) {
        this.administrativeActionType = administrativeActionType.toString();
    }

    /**
     * <p>
     * Describes the type of administrative action, as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FILE_SYSTEM_UPDATE</code> - A file system update administrative
     * action initiated by the user from the Amazon FSx console, API
     * (UpdateFileSystem), or CLI (update-file-system). A
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STORAGE_OPTIMIZATION</code> - Once the
     * <code>FILE_SYSTEM_UPDATE</code> task to increase a file system's storage
     * capacity completes successfully, a <code>STORAGE_OPTIMIZATION</code> task
     * starts. Storage optimization is the process of migrating the file system
     * data to the new, larger disks. You can track the storage migration
     * progress using the <code>ProgressPercent</code> property. When
     * <code>STORAGE_OPTIMIZATION</code> completes successfully, the parent
     * <code>FILE_SYSTEM_UPDATE</code> action status changes to
     * <code>COMPLETED</code>. For more information, see <a href=
     * "https://docs.aws.amazon.com/fsx/latest/WindowsGuide/managing-storage-capacity.html"
     * >Managing Storage Capacity</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FILE_SYSTEM_UPDATE, STORAGE_OPTIMIZATION
     *
     * @param administrativeActionType <p>
     *            Describes the type of administrative action, as follows:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>FILE_SYSTEM_UPDATE</code> - A file system update
     *            administrative action initiated by the user from the Amazon
     *            FSx console, API (UpdateFileSystem), or CLI
     *            (update-file-system). A
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>STORAGE_OPTIMIZATION</code> - Once the
     *            <code>FILE_SYSTEM_UPDATE</code> task to increase a file
     *            system's storage capacity completes successfully, a
     *            <code>STORAGE_OPTIMIZATION</code> task starts. Storage
     *            optimization is the process of migrating the file system data
     *            to the new, larger disks. You can track the storage migration
     *            progress using the <code>ProgressPercent</code> property. When
     *            <code>STORAGE_OPTIMIZATION</code> completes successfully, the
     *            parent <code>FILE_SYSTEM_UPDATE</code> action status changes
     *            to <code>COMPLETED</code>. For more information, see <a href=
     *            "https://docs.aws.amazon.com/fsx/latest/WindowsGuide/managing-storage-capacity.html"
     *            >Managing Storage Capacity</a>.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AdministrativeActionType
     */
    public AdministrativeAction withAdministrativeActionType(
            AdministrativeActionType administrativeActionType) {
        this.administrativeActionType = administrativeActionType.toString();
        return this;
    }

    /**
     * <p>
     * Provides the percent complete of a <code>STORAGE_OPTIMIZATION</code>
     * administrative action.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @return <p>
     *         Provides the percent complete of a
     *         <code>STORAGE_OPTIMIZATION</code> administrative action.
     *         </p>
     */
    public Integer getProgressPercent() {
        return progressPercent;
    }

    /**
     * <p>
     * Provides the percent complete of a <code>STORAGE_OPTIMIZATION</code>
     * administrative action.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @param progressPercent <p>
     *            Provides the percent complete of a
     *            <code>STORAGE_OPTIMIZATION</code> administrative action.
     *            </p>
     */
    public void setProgressPercent(Integer progressPercent) {
        this.progressPercent = progressPercent;
    }

    /**
     * <p>
     * Provides the percent complete of a <code>STORAGE_OPTIMIZATION</code>
     * administrative action.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @param progressPercent <p>
     *            Provides the percent complete of a
     *            <code>STORAGE_OPTIMIZATION</code> administrative action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AdministrativeAction withProgressPercent(Integer progressPercent) {
        this.progressPercent = progressPercent;
        return this;
    }

    /**
     * <p>
     * Time that the administrative action request was received.
     * </p>
     *
     * @return <p>
     *         Time that the administrative action request was received.
     *         </p>
     */
    public java.util.Date getRequestTime() {
        return requestTime;
    }

    /**
     * <p>
     * Time that the administrative action request was received.
     * </p>
     *
     * @param requestTime <p>
     *            Time that the administrative action request was received.
     *            </p>
     */
    public void setRequestTime(java.util.Date requestTime) {
        this.requestTime = requestTime;
    }

    /**
     * <p>
     * Time that the administrative action request was received.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param requestTime <p>
     *            Time that the administrative action request was received.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AdministrativeAction withRequestTime(java.util.Date requestTime) {
        this.requestTime = requestTime;
        return this;
    }

    /**
     * <p>
     * Describes the status of the administrative action, as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FAILED</code> - Amazon FSx failed to process the administrative
     * action successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code> - Amazon FSx is processing the administrative
     * action.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING</code> - Amazon FSx is waiting to process the
     * administrative action.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLETED</code> - Amazon FSx has finished processing the
     * administrative task.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATED_OPTIMIZING</code> - For a storage capacity increase update,
     * Amazon FSx has updated the file system with the new storage capacity, and
     * is now performing the storage optimization process. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/fsx/latest/WindowsGuide/managing-storage-capacity.html"
     * >Managing Storage Capacity</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FAILED, IN_PROGRESS, PENDING, COMPLETED,
     * UPDATED_OPTIMIZING
     *
     * @return <p>
     *         Describes the status of the administrative action, as follows:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>FAILED</code> - Amazon FSx failed to process the
     *         administrative action successfully.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>IN_PROGRESS</code> - Amazon FSx is processing the
     *         administrative action.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PENDING</code> - Amazon FSx is waiting to process the
     *         administrative action.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>COMPLETED</code> - Amazon FSx has finished processing the
     *         administrative task.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>UPDATED_OPTIMIZING</code> - For a storage capacity increase
     *         update, Amazon FSx has updated the file system with the new
     *         storage capacity, and is now performing the storage optimization
     *         process. For more information, see <a href=
     *         "https://docs.aws.amazon.com/fsx/latest/WindowsGuide/managing-storage-capacity.html"
     *         >Managing Storage Capacity</a>.
     *         </p>
     *         </li>
     *         </ul>
     * @see Status
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * Describes the status of the administrative action, as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FAILED</code> - Amazon FSx failed to process the administrative
     * action successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code> - Amazon FSx is processing the administrative
     * action.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING</code> - Amazon FSx is waiting to process the
     * administrative action.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLETED</code> - Amazon FSx has finished processing the
     * administrative task.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATED_OPTIMIZING</code> - For a storage capacity increase update,
     * Amazon FSx has updated the file system with the new storage capacity, and
     * is now performing the storage optimization process. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/fsx/latest/WindowsGuide/managing-storage-capacity.html"
     * >Managing Storage Capacity</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FAILED, IN_PROGRESS, PENDING, COMPLETED,
     * UPDATED_OPTIMIZING
     *
     * @param status <p>
     *            Describes the status of the administrative action, as follows:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>FAILED</code> - Amazon FSx failed to process the
     *            administrative action successfully.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>IN_PROGRESS</code> - Amazon FSx is processing the
     *            administrative action.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>PENDING</code> - Amazon FSx is waiting to process the
     *            administrative action.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>COMPLETED</code> - Amazon FSx has finished processing
     *            the administrative task.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>UPDATED_OPTIMIZING</code> - For a storage capacity
     *            increase update, Amazon FSx has updated the file system with
     *            the new storage capacity, and is now performing the storage
     *            optimization process. For more information, see <a href=
     *            "https://docs.aws.amazon.com/fsx/latest/WindowsGuide/managing-storage-capacity.html"
     *            >Managing Storage Capacity</a>.
     *            </p>
     *            </li>
     *            </ul>
     * @see Status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Describes the status of the administrative action, as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FAILED</code> - Amazon FSx failed to process the administrative
     * action successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code> - Amazon FSx is processing the administrative
     * action.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING</code> - Amazon FSx is waiting to process the
     * administrative action.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLETED</code> - Amazon FSx has finished processing the
     * administrative task.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATED_OPTIMIZING</code> - For a storage capacity increase update,
     * Amazon FSx has updated the file system with the new storage capacity, and
     * is now performing the storage optimization process. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/fsx/latest/WindowsGuide/managing-storage-capacity.html"
     * >Managing Storage Capacity</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FAILED, IN_PROGRESS, PENDING, COMPLETED,
     * UPDATED_OPTIMIZING
     *
     * @param status <p>
     *            Describes the status of the administrative action, as follows:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>FAILED</code> - Amazon FSx failed to process the
     *            administrative action successfully.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>IN_PROGRESS</code> - Amazon FSx is processing the
     *            administrative action.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>PENDING</code> - Amazon FSx is waiting to process the
     *            administrative action.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>COMPLETED</code> - Amazon FSx has finished processing
     *            the administrative task.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>UPDATED_OPTIMIZING</code> - For a storage capacity
     *            increase update, Amazon FSx has updated the file system with
     *            the new storage capacity, and is now performing the storage
     *            optimization process. For more information, see <a href=
     *            "https://docs.aws.amazon.com/fsx/latest/WindowsGuide/managing-storage-capacity.html"
     *            >Managing Storage Capacity</a>.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Status
     */
    public AdministrativeAction withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * Describes the status of the administrative action, as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FAILED</code> - Amazon FSx failed to process the administrative
     * action successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code> - Amazon FSx is processing the administrative
     * action.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING</code> - Amazon FSx is waiting to process the
     * administrative action.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLETED</code> - Amazon FSx has finished processing the
     * administrative task.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATED_OPTIMIZING</code> - For a storage capacity increase update,
     * Amazon FSx has updated the file system with the new storage capacity, and
     * is now performing the storage optimization process. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/fsx/latest/WindowsGuide/managing-storage-capacity.html"
     * >Managing Storage Capacity</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FAILED, IN_PROGRESS, PENDING, COMPLETED,
     * UPDATED_OPTIMIZING
     *
     * @param status <p>
     *            Describes the status of the administrative action, as follows:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>FAILED</code> - Amazon FSx failed to process the
     *            administrative action successfully.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>IN_PROGRESS</code> - Amazon FSx is processing the
     *            administrative action.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>PENDING</code> - Amazon FSx is waiting to process the
     *            administrative action.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>COMPLETED</code> - Amazon FSx has finished processing
     *            the administrative task.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>UPDATED_OPTIMIZING</code> - For a storage capacity
     *            increase update, Amazon FSx has updated the file system with
     *            the new storage capacity, and is now performing the storage
     *            optimization process. For more information, see <a href=
     *            "https://docs.aws.amazon.com/fsx/latest/WindowsGuide/managing-storage-capacity.html"
     *            >Managing Storage Capacity</a>.
     *            </p>
     *            </li>
     *            </ul>
     * @see Status
     */
    public void setStatus(Status status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * Describes the status of the administrative action, as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FAILED</code> - Amazon FSx failed to process the administrative
     * action successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code> - Amazon FSx is processing the administrative
     * action.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING</code> - Amazon FSx is waiting to process the
     * administrative action.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLETED</code> - Amazon FSx has finished processing the
     * administrative task.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATED_OPTIMIZING</code> - For a storage capacity increase update,
     * Amazon FSx has updated the file system with the new storage capacity, and
     * is now performing the storage optimization process. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/fsx/latest/WindowsGuide/managing-storage-capacity.html"
     * >Managing Storage Capacity</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FAILED, IN_PROGRESS, PENDING, COMPLETED,
     * UPDATED_OPTIMIZING
     *
     * @param status <p>
     *            Describes the status of the administrative action, as follows:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>FAILED</code> - Amazon FSx failed to process the
     *            administrative action successfully.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>IN_PROGRESS</code> - Amazon FSx is processing the
     *            administrative action.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>PENDING</code> - Amazon FSx is waiting to process the
     *            administrative action.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>COMPLETED</code> - Amazon FSx has finished processing
     *            the administrative task.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>UPDATED_OPTIMIZING</code> - For a storage capacity
     *            increase update, Amazon FSx has updated the file system with
     *            the new storage capacity, and is now performing the storage
     *            optimization process. For more information, see <a href=
     *            "https://docs.aws.amazon.com/fsx/latest/WindowsGuide/managing-storage-capacity.html"
     *            >Managing Storage Capacity</a>.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Status
     */
    public AdministrativeAction withStatus(Status status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Describes the target <code>StorageCapacity</code> or
     * <code>ThroughputCapacity</code> value provided in the
     * <code>UpdateFileSystem</code> operation. Returned for
     * <code>FILE_SYSTEM_UPDATE</code> administrative actions.
     * </p>
     *
     * @return <p>
     *         Describes the target <code>StorageCapacity</code> or
     *         <code>ThroughputCapacity</code> value provided in the
     *         <code>UpdateFileSystem</code> operation. Returned for
     *         <code>FILE_SYSTEM_UPDATE</code> administrative actions.
     *         </p>
     */
    public FileSystem getTargetFileSystemValues() {
        return targetFileSystemValues;
    }

    /**
     * <p>
     * Describes the target <code>StorageCapacity</code> or
     * <code>ThroughputCapacity</code> value provided in the
     * <code>UpdateFileSystem</code> operation. Returned for
     * <code>FILE_SYSTEM_UPDATE</code> administrative actions.
     * </p>
     *
     * @param targetFileSystemValues <p>
     *            Describes the target <code>StorageCapacity</code> or
     *            <code>ThroughputCapacity</code> value provided in the
     *            <code>UpdateFileSystem</code> operation. Returned for
     *            <code>FILE_SYSTEM_UPDATE</code> administrative actions.
     *            </p>
     */
    public void setTargetFileSystemValues(FileSystem targetFileSystemValues) {
        this.targetFileSystemValues = targetFileSystemValues;
    }

    /**
     * <p>
     * Describes the target <code>StorageCapacity</code> or
     * <code>ThroughputCapacity</code> value provided in the
     * <code>UpdateFileSystem</code> operation. Returned for
     * <code>FILE_SYSTEM_UPDATE</code> administrative actions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetFileSystemValues <p>
     *            Describes the target <code>StorageCapacity</code> or
     *            <code>ThroughputCapacity</code> value provided in the
     *            <code>UpdateFileSystem</code> operation. Returned for
     *            <code>FILE_SYSTEM_UPDATE</code> administrative actions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AdministrativeAction withTargetFileSystemValues(FileSystem targetFileSystemValues) {
        this.targetFileSystemValues = targetFileSystemValues;
        return this;
    }

    /**
     * <p>
     * Provides information about a failed administrative action.
     * </p>
     *
     * @return <p>
     *         Provides information about a failed administrative action.
     *         </p>
     */
    public AdministrativeActionFailureDetails getFailureDetails() {
        return failureDetails;
    }

    /**
     * <p>
     * Provides information about a failed administrative action.
     * </p>
     *
     * @param failureDetails <p>
     *            Provides information about a failed administrative action.
     *            </p>
     */
    public void setFailureDetails(AdministrativeActionFailureDetails failureDetails) {
        this.failureDetails = failureDetails;
    }

    /**
     * <p>
     * Provides information about a failed administrative action.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param failureDetails <p>
     *            Provides information about a failed administrative action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AdministrativeAction withFailureDetails(AdministrativeActionFailureDetails failureDetails) {
        this.failureDetails = failureDetails;
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
        if (getAdministrativeActionType() != null)
            sb.append("AdministrativeActionType: " + getAdministrativeActionType() + ",");
        if (getProgressPercent() != null)
            sb.append("ProgressPercent: " + getProgressPercent() + ",");
        if (getRequestTime() != null)
            sb.append("RequestTime: " + getRequestTime() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getTargetFileSystemValues() != null)
            sb.append("TargetFileSystemValues: " + getTargetFileSystemValues() + ",");
        if (getFailureDetails() != null)
            sb.append("FailureDetails: " + getFailureDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getAdministrativeActionType() == null) ? 0 : getAdministrativeActionType()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getProgressPercent() == null) ? 0 : getProgressPercent().hashCode());
        hashCode = prime * hashCode
                + ((getRequestTime() == null) ? 0 : getRequestTime().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime
                * hashCode
                + ((getTargetFileSystemValues() == null) ? 0 : getTargetFileSystemValues()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getFailureDetails() == null) ? 0 : getFailureDetails().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AdministrativeAction == false)
            return false;
        AdministrativeAction other = (AdministrativeAction) obj;

        if (other.getAdministrativeActionType() == null
                ^ this.getAdministrativeActionType() == null)
            return false;
        if (other.getAdministrativeActionType() != null
                && other.getAdministrativeActionType().equals(this.getAdministrativeActionType()) == false)
            return false;
        if (other.getProgressPercent() == null ^ this.getProgressPercent() == null)
            return false;
        if (other.getProgressPercent() != null
                && other.getProgressPercent().equals(this.getProgressPercent()) == false)
            return false;
        if (other.getRequestTime() == null ^ this.getRequestTime() == null)
            return false;
        if (other.getRequestTime() != null
                && other.getRequestTime().equals(this.getRequestTime()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getTargetFileSystemValues() == null ^ this.getTargetFileSystemValues() == null)
            return false;
        if (other.getTargetFileSystemValues() != null
                && other.getTargetFileSystemValues().equals(this.getTargetFileSystemValues()) == false)
            return false;
        if (other.getFailureDetails() == null ^ this.getFailureDetails() == null)
            return false;
        if (other.getFailureDetails() != null
                && other.getFailureDetails().equals(this.getFailureDetails()) == false)
            return false;
        return true;
    }
}
