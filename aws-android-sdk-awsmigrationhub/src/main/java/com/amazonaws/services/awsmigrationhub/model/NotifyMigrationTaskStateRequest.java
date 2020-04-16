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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Notifies Migration Hub of the current status, progress, or other detail
 * regarding a migration task. This API has the following traits:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Migration tools will call the <code>NotifyMigrationTaskState</code> API to
 * share the latest progress and status.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>MigrationTaskName</code> is used for addressing updates to the correct
 * target.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ProgressUpdateStream</code> is used for access control and to provide a
 * namespace for each migration tool.
 * </p>
 * </li>
 * </ul>
 */
public class NotifyMigrationTaskStateRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the ProgressUpdateStream.
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
     * Information about the task's progress and status.
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
     * Number of seconds after the UpdateDateTime within which the Migration Hub
     * can expect an update. If Migration Hub does not receive an update within
     * the specified interval, then the migration task will be considered stale.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer nextUpdateSeconds;

    /**
     * <p>
     * Optional boolean flag to indicate whether any effect should take place.
     * Used to test if the caller has permission to make the call.
     * </p>
     */
    private Boolean dryRun;

    /**
     * <p>
     * The name of the ProgressUpdateStream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[^/:|\000-\037]+<br/>
     *
     * @return <p>
     *         The name of the ProgressUpdateStream.
     *         </p>
     */
    public String getProgressUpdateStream() {
        return progressUpdateStream;
    }

    /**
     * <p>
     * The name of the ProgressUpdateStream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[^/:|\000-\037]+<br/>
     *
     * @param progressUpdateStream <p>
     *            The name of the ProgressUpdateStream.
     *            </p>
     */
    public void setProgressUpdateStream(String progressUpdateStream) {
        this.progressUpdateStream = progressUpdateStream;
    }

    /**
     * <p>
     * The name of the ProgressUpdateStream.
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
     *            The name of the ProgressUpdateStream.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NotifyMigrationTaskStateRequest withProgressUpdateStream(String progressUpdateStream) {
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
    public NotifyMigrationTaskStateRequest withMigrationTaskName(String migrationTaskName) {
        this.migrationTaskName = migrationTaskName;
        return this;
    }

    /**
     * <p>
     * Information about the task's progress and status.
     * </p>
     *
     * @return <p>
     *         Information about the task's progress and status.
     *         </p>
     */
    public Task getTask() {
        return task;
    }

    /**
     * <p>
     * Information about the task's progress and status.
     * </p>
     *
     * @param task <p>
     *            Information about the task's progress and status.
     *            </p>
     */
    public void setTask(Task task) {
        this.task = task;
    }

    /**
     * <p>
     * Information about the task's progress and status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param task <p>
     *            Information about the task's progress and status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NotifyMigrationTaskStateRequest withTask(Task task) {
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
    public NotifyMigrationTaskStateRequest withUpdateDateTime(java.util.Date updateDateTime) {
        this.updateDateTime = updateDateTime;
        return this;
    }

    /**
     * <p>
     * Number of seconds after the UpdateDateTime within which the Migration Hub
     * can expect an update. If Migration Hub does not receive an update within
     * the specified interval, then the migration task will be considered stale.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         Number of seconds after the UpdateDateTime within which the
     *         Migration Hub can expect an update. If Migration Hub does not
     *         receive an update within the specified interval, then the
     *         migration task will be considered stale.
     *         </p>
     */
    public Integer getNextUpdateSeconds() {
        return nextUpdateSeconds;
    }

    /**
     * <p>
     * Number of seconds after the UpdateDateTime within which the Migration Hub
     * can expect an update. If Migration Hub does not receive an update within
     * the specified interval, then the migration task will be considered stale.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param nextUpdateSeconds <p>
     *            Number of seconds after the UpdateDateTime within which the
     *            Migration Hub can expect an update. If Migration Hub does not
     *            receive an update within the specified interval, then the
     *            migration task will be considered stale.
     *            </p>
     */
    public void setNextUpdateSeconds(Integer nextUpdateSeconds) {
        this.nextUpdateSeconds = nextUpdateSeconds;
    }

    /**
     * <p>
     * Number of seconds after the UpdateDateTime within which the Migration Hub
     * can expect an update. If Migration Hub does not receive an update within
     * the specified interval, then the migration task will be considered stale.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param nextUpdateSeconds <p>
     *            Number of seconds after the UpdateDateTime within which the
     *            Migration Hub can expect an update. If Migration Hub does not
     *            receive an update within the specified interval, then the
     *            migration task will be considered stale.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NotifyMigrationTaskStateRequest withNextUpdateSeconds(Integer nextUpdateSeconds) {
        this.nextUpdateSeconds = nextUpdateSeconds;
        return this;
    }

    /**
     * <p>
     * Optional boolean flag to indicate whether any effect should take place.
     * Used to test if the caller has permission to make the call.
     * </p>
     *
     * @return <p>
     *         Optional boolean flag to indicate whether any effect should take
     *         place. Used to test if the caller has permission to make the
     *         call.
     *         </p>
     */
    public Boolean isDryRun() {
        return dryRun;
    }

    /**
     * <p>
     * Optional boolean flag to indicate whether any effect should take place.
     * Used to test if the caller has permission to make the call.
     * </p>
     *
     * @return <p>
     *         Optional boolean flag to indicate whether any effect should take
     *         place. Used to test if the caller has permission to make the
     *         call.
     *         </p>
     */
    public Boolean getDryRun() {
        return dryRun;
    }

    /**
     * <p>
     * Optional boolean flag to indicate whether any effect should take place.
     * Used to test if the caller has permission to make the call.
     * </p>
     *
     * @param dryRun <p>
     *            Optional boolean flag to indicate whether any effect should
     *            take place. Used to test if the caller has permission to make
     *            the call.
     *            </p>
     */
    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    /**
     * <p>
     * Optional boolean flag to indicate whether any effect should take place.
     * Used to test if the caller has permission to make the call.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dryRun <p>
     *            Optional boolean flag to indicate whether any effect should
     *            take place. Used to test if the caller has permission to make
     *            the call.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NotifyMigrationTaskStateRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
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
        if (getNextUpdateSeconds() != null)
            sb.append("NextUpdateSeconds: " + getNextUpdateSeconds() + ",");
        if (getDryRun() != null)
            sb.append("DryRun: " + getDryRun());
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
        hashCode = prime * hashCode
                + ((getNextUpdateSeconds() == null) ? 0 : getNextUpdateSeconds().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NotifyMigrationTaskStateRequest == false)
            return false;
        NotifyMigrationTaskStateRequest other = (NotifyMigrationTaskStateRequest) obj;

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
        if (other.getNextUpdateSeconds() == null ^ this.getNextUpdateSeconds() == null)
            return false;
        if (other.getNextUpdateSeconds() != null
                && other.getNextUpdateSeconds().equals(this.getNextUpdateSeconds()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        return true;
    }
}
