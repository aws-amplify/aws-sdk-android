/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Contains details for the restore.
 * </p>
 */
public class RestoreSummary implements Serializable {
    /**
     * <p>
     * ARN of the backup from which the table was restored.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>37 - 1024<br/>
     */
    private String sourceBackupArn;

    /**
     * <p>
     * ARN of the source table of the backup that is being restored.
     * </p>
     */
    private String sourceTableArn;

    /**
     * <p>
     * Point in time or source backup time.
     * </p>
     */
    private java.util.Date restoreDateTime;

    /**
     * <p>
     * Indicates if a restore is in progress or not.
     * </p>
     */
    private Boolean restoreInProgress;

    /**
     * <p>
     * ARN of the backup from which the table was restored.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>37 - 1024<br/>
     *
     * @return <p>
     *         ARN of the backup from which the table was restored.
     *         </p>
     */
    public String getSourceBackupArn() {
        return sourceBackupArn;
    }

    /**
     * <p>
     * ARN of the backup from which the table was restored.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>37 - 1024<br/>
     *
     * @param sourceBackupArn <p>
     *            ARN of the backup from which the table was restored.
     *            </p>
     */
    public void setSourceBackupArn(String sourceBackupArn) {
        this.sourceBackupArn = sourceBackupArn;
    }

    /**
     * <p>
     * ARN of the backup from which the table was restored.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>37 - 1024<br/>
     *
     * @param sourceBackupArn <p>
     *            ARN of the backup from which the table was restored.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreSummary withSourceBackupArn(String sourceBackupArn) {
        this.sourceBackupArn = sourceBackupArn;
        return this;
    }

    /**
     * <p>
     * ARN of the source table of the backup that is being restored.
     * </p>
     *
     * @return <p>
     *         ARN of the source table of the backup that is being restored.
     *         </p>
     */
    public String getSourceTableArn() {
        return sourceTableArn;
    }

    /**
     * <p>
     * ARN of the source table of the backup that is being restored.
     * </p>
     *
     * @param sourceTableArn <p>
     *            ARN of the source table of the backup that is being restored.
     *            </p>
     */
    public void setSourceTableArn(String sourceTableArn) {
        this.sourceTableArn = sourceTableArn;
    }

    /**
     * <p>
     * ARN of the source table of the backup that is being restored.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceTableArn <p>
     *            ARN of the source table of the backup that is being restored.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreSummary withSourceTableArn(String sourceTableArn) {
        this.sourceTableArn = sourceTableArn;
        return this;
    }

    /**
     * <p>
     * Point in time or source backup time.
     * </p>
     *
     * @return <p>
     *         Point in time or source backup time.
     *         </p>
     */
    public java.util.Date getRestoreDateTime() {
        return restoreDateTime;
    }

    /**
     * <p>
     * Point in time or source backup time.
     * </p>
     *
     * @param restoreDateTime <p>
     *            Point in time or source backup time.
     *            </p>
     */
    public void setRestoreDateTime(java.util.Date restoreDateTime) {
        this.restoreDateTime = restoreDateTime;
    }

    /**
     * <p>
     * Point in time or source backup time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param restoreDateTime <p>
     *            Point in time or source backup time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreSummary withRestoreDateTime(java.util.Date restoreDateTime) {
        this.restoreDateTime = restoreDateTime;
        return this;
    }

    /**
     * <p>
     * Indicates if a restore is in progress or not.
     * </p>
     *
     * @return <p>
     *         Indicates if a restore is in progress or not.
     *         </p>
     */
    public Boolean isRestoreInProgress() {
        return restoreInProgress;
    }

    /**
     * <p>
     * Indicates if a restore is in progress or not.
     * </p>
     *
     * @return <p>
     *         Indicates if a restore is in progress or not.
     *         </p>
     */
    public Boolean getRestoreInProgress() {
        return restoreInProgress;
    }

    /**
     * <p>
     * Indicates if a restore is in progress or not.
     * </p>
     *
     * @param restoreInProgress <p>
     *            Indicates if a restore is in progress or not.
     *            </p>
     */
    public void setRestoreInProgress(Boolean restoreInProgress) {
        this.restoreInProgress = restoreInProgress;
    }

    /**
     * <p>
     * Indicates if a restore is in progress or not.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param restoreInProgress <p>
     *            Indicates if a restore is in progress or not.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreSummary withRestoreInProgress(Boolean restoreInProgress) {
        this.restoreInProgress = restoreInProgress;
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
        if (getSourceBackupArn() != null)
            sb.append("SourceBackupArn: " + getSourceBackupArn() + ",");
        if (getSourceTableArn() != null)
            sb.append("SourceTableArn: " + getSourceTableArn() + ",");
        if (getRestoreDateTime() != null)
            sb.append("RestoreDateTime: " + getRestoreDateTime() + ",");
        if (getRestoreInProgress() != null)
            sb.append("RestoreInProgress: " + getRestoreInProgress());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSourceBackupArn() == null) ? 0 : getSourceBackupArn().hashCode());
        hashCode = prime * hashCode
                + ((getSourceTableArn() == null) ? 0 : getSourceTableArn().hashCode());
        hashCode = prime * hashCode
                + ((getRestoreDateTime() == null) ? 0 : getRestoreDateTime().hashCode());
        hashCode = prime * hashCode
                + ((getRestoreInProgress() == null) ? 0 : getRestoreInProgress().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RestoreSummary == false)
            return false;
        RestoreSummary other = (RestoreSummary) obj;

        if (other.getSourceBackupArn() == null ^ this.getSourceBackupArn() == null)
            return false;
        if (other.getSourceBackupArn() != null
                && other.getSourceBackupArn().equals(this.getSourceBackupArn()) == false)
            return false;
        if (other.getSourceTableArn() == null ^ this.getSourceTableArn() == null)
            return false;
        if (other.getSourceTableArn() != null
                && other.getSourceTableArn().equals(this.getSourceTableArn()) == false)
            return false;
        if (other.getRestoreDateTime() == null ^ this.getRestoreDateTime() == null)
            return false;
        if (other.getRestoreDateTime() != null
                && other.getRestoreDateTime().equals(this.getRestoreDateTime()) == false)
            return false;
        if (other.getRestoreInProgress() == null ^ this.getRestoreInProgress() == null)
            return false;
        if (other.getRestoreInProgress() != null
                && other.getRestoreInProgress().equals(this.getRestoreInProgress()) == false)
            return false;
        return true;
    }
}
