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
 * Registers a new migration task which represents a server, database, etc.,
 * being migrated to AWS by a migration tool.
 * </p>
 * <p>
 * This API is a prerequisite to calling the
 * <code>NotifyMigrationTaskState</code> API as the migration tool must first
 * register the migration task with Migration Hub.
 * </p>
 */
public class ImportMigrationTaskRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the ProgressUpdateStream. &gt;
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
     * Optional boolean flag to indicate whether any effect should take place.
     * Used to test if the caller has permission to make the call.
     * </p>
     */
    private Boolean dryRun;

    /**
     * <p>
     * The name of the ProgressUpdateStream. &gt;
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[^/:|\000-\037]+<br/>
     *
     * @return <p>
     *         The name of the ProgressUpdateStream. &gt;
     *         </p>
     */
    public String getProgressUpdateStream() {
        return progressUpdateStream;
    }

    /**
     * <p>
     * The name of the ProgressUpdateStream. &gt;
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[^/:|\000-\037]+<br/>
     *
     * @param progressUpdateStream <p>
     *            The name of the ProgressUpdateStream. &gt;
     *            </p>
     */
    public void setProgressUpdateStream(String progressUpdateStream) {
        this.progressUpdateStream = progressUpdateStream;
    }

    /**
     * <p>
     * The name of the ProgressUpdateStream. &gt;
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
     *            The name of the ProgressUpdateStream. &gt;
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportMigrationTaskRequest withProgressUpdateStream(String progressUpdateStream) {
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
    public ImportMigrationTaskRequest withMigrationTaskName(String migrationTaskName) {
        this.migrationTaskName = migrationTaskName;
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
    public ImportMigrationTaskRequest withDryRun(Boolean dryRun) {
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
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImportMigrationTaskRequest == false)
            return false;
        ImportMigrationTaskRequest other = (ImportMigrationTaskRequest) obj;

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
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        return true;
    }
}
