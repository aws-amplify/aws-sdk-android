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
 * Represents a migration task in a migration tool.
 * </p>
 */
public class MigrationTask implements Serializable {
    /**
     * <p>
     * A name that identifies the vendor of the migration tool being used.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[^/:|\000-\037]+<br/>
     */
    private String progressUpdateStream;

    /**
     * <p>
     * Unique identifier that references the migration task. <i>Do not store
     * personal data in this field.</i>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[^:|]+<br/>
     */
    private String migrationTaskName;

    /**
     * <p>
     * Task object encapsulating task information.
     * </p>
     */
    private Task task;

    /**
     * <p>
     * The timestamp when the task was gathered.
     * </p>
     */
    private java.util.Date updateDateTime;

    /**
     * <p>
     * Information about the resource that is being migrated. This data will be
     * used to map the task to a resource in the Application Discovery Service
     * repository.
     * </p>
     */
    private java.util.List<ResourceAttribute> resourceAttributeList;

    /**
     * <p>
     * A name that identifies the vendor of the migration tool being used.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[^/:|\000-\037]+<br/>
     *
     * @return <p>
     *         A name that identifies the vendor of the migration tool being
     *         used.
     *         </p>
     */
    public String getProgressUpdateStream() {
        return progressUpdateStream;
    }

    /**
     * <p>
     * A name that identifies the vendor of the migration tool being used.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[^/:|\000-\037]+<br/>
     *
     * @param progressUpdateStream <p>
     *            A name that identifies the vendor of the migration tool being
     *            used.
     *            </p>
     */
    public void setProgressUpdateStream(String progressUpdateStream) {
        this.progressUpdateStream = progressUpdateStream;
    }

    /**
     * <p>
     * A name that identifies the vendor of the migration tool being used.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[^/:|\000-\037]+<br/>
     *
     * @param progressUpdateStream <p>
     *            A name that identifies the vendor of the migration tool being
     *            used.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MigrationTask withProgressUpdateStream(String progressUpdateStream) {
        this.progressUpdateStream = progressUpdateStream;
        return this;
    }

    /**
     * <p>
     * Unique identifier that references the migration task. <i>Do not store
     * personal data in this field.</i>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[^:|]+<br/>
     *
     * @return <p>
     *         Unique identifier that references the migration task. <i>Do not
     *         store personal data in this field.</i>
     *         </p>
     */
    public String getMigrationTaskName() {
        return migrationTaskName;
    }

    /**
     * <p>
     * Unique identifier that references the migration task. <i>Do not store
     * personal data in this field.</i>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[^:|]+<br/>
     *
     * @param migrationTaskName <p>
     *            Unique identifier that references the migration task. <i>Do
     *            not store personal data in this field.</i>
     *            </p>
     */
    public void setMigrationTaskName(String migrationTaskName) {
        this.migrationTaskName = migrationTaskName;
    }

    /**
     * <p>
     * Unique identifier that references the migration task. <i>Do not store
     * personal data in this field.</i>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[^:|]+<br/>
     *
     * @param migrationTaskName <p>
     *            Unique identifier that references the migration task. <i>Do
     *            not store personal data in this field.</i>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MigrationTask withMigrationTaskName(String migrationTaskName) {
        this.migrationTaskName = migrationTaskName;
        return this;
    }

    /**
     * <p>
     * Task object encapsulating task information.
     * </p>
     *
     * @return <p>
     *         Task object encapsulating task information.
     *         </p>
     */
    public Task getTask() {
        return task;
    }

    /**
     * <p>
     * Task object encapsulating task information.
     * </p>
     *
     * @param task <p>
     *            Task object encapsulating task information.
     *            </p>
     */
    public void setTask(Task task) {
        this.task = task;
    }

    /**
     * <p>
     * Task object encapsulating task information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param task <p>
     *            Task object encapsulating task information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MigrationTask withTask(Task task) {
        this.task = task;
        return this;
    }

    /**
     * <p>
     * The timestamp when the task was gathered.
     * </p>
     *
     * @return <p>
     *         The timestamp when the task was gathered.
     *         </p>
     */
    public java.util.Date getUpdateDateTime() {
        return updateDateTime;
    }

    /**
     * <p>
     * The timestamp when the task was gathered.
     * </p>
     *
     * @param updateDateTime <p>
     *            The timestamp when the task was gathered.
     *            </p>
     */
    public void setUpdateDateTime(java.util.Date updateDateTime) {
        this.updateDateTime = updateDateTime;
    }

    /**
     * <p>
     * The timestamp when the task was gathered.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param updateDateTime <p>
     *            The timestamp when the task was gathered.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MigrationTask withUpdateDateTime(java.util.Date updateDateTime) {
        this.updateDateTime = updateDateTime;
        return this;
    }

    /**
     * <p>
     * Information about the resource that is being migrated. This data will be
     * used to map the task to a resource in the Application Discovery Service
     * repository.
     * </p>
     *
     * @return <p>
     *         Information about the resource that is being migrated. This data
     *         will be used to map the task to a resource in the Application
     *         Discovery Service repository.
     *         </p>
     */
    public java.util.List<ResourceAttribute> getResourceAttributeList() {
        return resourceAttributeList;
    }

    /**
     * <p>
     * Information about the resource that is being migrated. This data will be
     * used to map the task to a resource in the Application Discovery Service
     * repository.
     * </p>
     *
     * @param resourceAttributeList <p>
     *            Information about the resource that is being migrated. This
     *            data will be used to map the task to a resource in the
     *            Application Discovery Service repository.
     *            </p>
     */
    public void setResourceAttributeList(
            java.util.Collection<ResourceAttribute> resourceAttributeList) {
        if (resourceAttributeList == null) {
            this.resourceAttributeList = null;
            return;
        }

        this.resourceAttributeList = new java.util.ArrayList<ResourceAttribute>(
                resourceAttributeList);
    }

    /**
     * <p>
     * Information about the resource that is being migrated. This data will be
     * used to map the task to a resource in the Application Discovery Service
     * repository.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceAttributeList <p>
     *            Information about the resource that is being migrated. This
     *            data will be used to map the task to a resource in the
     *            Application Discovery Service repository.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MigrationTask withResourceAttributeList(ResourceAttribute... resourceAttributeList) {
        if (getResourceAttributeList() == null) {
            this.resourceAttributeList = new java.util.ArrayList<ResourceAttribute>(
                    resourceAttributeList.length);
        }
        for (ResourceAttribute value : resourceAttributeList) {
            this.resourceAttributeList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the resource that is being migrated. This data will be
     * used to map the task to a resource in the Application Discovery Service
     * repository.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceAttributeList <p>
     *            Information about the resource that is being migrated. This
     *            data will be used to map the task to a resource in the
     *            Application Discovery Service repository.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MigrationTask withResourceAttributeList(
            java.util.Collection<ResourceAttribute> resourceAttributeList) {
        setResourceAttributeList(resourceAttributeList);
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
        if (getProgressUpdateStream() != null)
            sb.append("ProgressUpdateStream: " + getProgressUpdateStream() + ",");
        if (getMigrationTaskName() != null)
            sb.append("MigrationTaskName: " + getMigrationTaskName() + ",");
        if (getTask() != null)
            sb.append("Task: " + getTask() + ",");
        if (getUpdateDateTime() != null)
            sb.append("UpdateDateTime: " + getUpdateDateTime() + ",");
        if (getResourceAttributeList() != null)
            sb.append("ResourceAttributeList: " + getResourceAttributeList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getProgressUpdateStream() == null) ? 0 : getProgressUpdateStream().hashCode());
        hashCode = prime * hashCode
                + ((getMigrationTaskName() == null) ? 0 : getMigrationTaskName().hashCode());
        hashCode = prime * hashCode + ((getTask() == null) ? 0 : getTask().hashCode());
        hashCode = prime * hashCode
                + ((getUpdateDateTime() == null) ? 0 : getUpdateDateTime().hashCode());
        hashCode = prime
                * hashCode
                + ((getResourceAttributeList() == null) ? 0 : getResourceAttributeList().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MigrationTask == false)
            return false;
        MigrationTask other = (MigrationTask) obj;

        if (other.getProgressUpdateStream() == null ^ this.getProgressUpdateStream() == null)
            return false;
        if (other.getProgressUpdateStream() != null
                && other.getProgressUpdateStream().equals(this.getProgressUpdateStream()) == false)
            return false;
        if (other.getMigrationTaskName() == null ^ this.getMigrationTaskName() == null)
            return false;
        if (other.getMigrationTaskName() != null
                && other.getMigrationTaskName().equals(this.getMigrationTaskName()) == false)
            return false;
        if (other.getTask() == null ^ this.getTask() == null)
            return false;
        if (other.getTask() != null && other.getTask().equals(this.getTask()) == false)
            return false;
        if (other.getUpdateDateTime() == null ^ this.getUpdateDateTime() == null)
            return false;
        if (other.getUpdateDateTime() != null
                && other.getUpdateDateTime().equals(this.getUpdateDateTime()) == false)
            return false;
        if (other.getResourceAttributeList() == null ^ this.getResourceAttributeList() == null)
            return false;
        if (other.getResourceAttributeList() != null
                && other.getResourceAttributeList().equals(this.getResourceAttributeList()) == false)
            return false;
        return true;
    }
}
