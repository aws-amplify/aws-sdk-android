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

package com.amazonaws.services.qldb.model;

import java.io.Serializable;

/**
 * <p>
 * The information about a journal export job, including the ledger name, export
 * ID, when it was created, current status, and its start and end time export
 * parameters.
 * </p>
 */
public class JournalS3ExportDescription implements Serializable {
    /**
     * <p>
     * The name of the ledger.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>(?!^.*--)(?!^[0-9]+$)(?!^-)(?!.*-$)^[A-Za-z0-9-]+$<br/>
     */
    private String ledgerName;

    /**
     * <p>
     * The unique ID of the journal export job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>22 - 22<br/>
     * <b>Pattern: </b>^[A-Za-z-0-9]+$<br/>
     */
    private String exportId;

    /**
     * <p>
     * The date and time, in epoch time format, when the export job was created.
     * (Epoch time format is the number of seconds elapsed since 12:00:00 AM
     * January 1, 1970 UTC.)
     * </p>
     */
    private java.util.Date exportCreationTime;

    /**
     * <p>
     * The current state of the journal export job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, COMPLETED, CANCELLED
     */
    private String status;

    /**
     * <p>
     * The inclusive start date and time for the range of journal contents that
     * are specified in the original export request.
     * </p>
     */
    private java.util.Date inclusiveStartTime;

    /**
     * <p>
     * The exclusive end date and time for the range of journal contents that
     * are specified in the original export request.
     * </p>
     */
    private java.util.Date exclusiveEndTime;

    /**
     * <p>
     * The Amazon Simple Storage Service (Amazon S3) bucket location in which a
     * journal export job writes the journal contents.
     * </p>
     */
    private S3ExportConfiguration s3ExportConfiguration;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that grants QLDB
     * permissions for a journal export job to do the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Write objects into your Amazon Simple Storage Service (Amazon S3) bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * (Optional) Use your customer master key (CMK) in AWS Key Management
     * Service (AWS KMS) for server-side encryption of your exported data.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 1600<br/>
     */
    private String roleArn;

    /**
     * <p>
     * The name of the ledger.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>(?!^.*--)(?!^[0-9]+$)(?!^-)(?!.*-$)^[A-Za-z0-9-]+$<br/>
     *
     * @return <p>
     *         The name of the ledger.
     *         </p>
     */
    public String getLedgerName() {
        return ledgerName;
    }

    /**
     * <p>
     * The name of the ledger.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>(?!^.*--)(?!^[0-9]+$)(?!^-)(?!.*-$)^[A-Za-z0-9-]+$<br/>
     *
     * @param ledgerName <p>
     *            The name of the ledger.
     *            </p>
     */
    public void setLedgerName(String ledgerName) {
        this.ledgerName = ledgerName;
    }

    /**
     * <p>
     * The name of the ledger.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>(?!^.*--)(?!^[0-9]+$)(?!^-)(?!.*-$)^[A-Za-z0-9-]+$<br/>
     *
     * @param ledgerName <p>
     *            The name of the ledger.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JournalS3ExportDescription withLedgerName(String ledgerName) {
        this.ledgerName = ledgerName;
        return this;
    }

    /**
     * <p>
     * The unique ID of the journal export job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>22 - 22<br/>
     * <b>Pattern: </b>^[A-Za-z-0-9]+$<br/>
     *
     * @return <p>
     *         The unique ID of the journal export job.
     *         </p>
     */
    public String getExportId() {
        return exportId;
    }

    /**
     * <p>
     * The unique ID of the journal export job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>22 - 22<br/>
     * <b>Pattern: </b>^[A-Za-z-0-9]+$<br/>
     *
     * @param exportId <p>
     *            The unique ID of the journal export job.
     *            </p>
     */
    public void setExportId(String exportId) {
        this.exportId = exportId;
    }

    /**
     * <p>
     * The unique ID of the journal export job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>22 - 22<br/>
     * <b>Pattern: </b>^[A-Za-z-0-9]+$<br/>
     *
     * @param exportId <p>
     *            The unique ID of the journal export job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JournalS3ExportDescription withExportId(String exportId) {
        this.exportId = exportId;
        return this;
    }

    /**
     * <p>
     * The date and time, in epoch time format, when the export job was created.
     * (Epoch time format is the number of seconds elapsed since 12:00:00 AM
     * January 1, 1970 UTC.)
     * </p>
     *
     * @return <p>
     *         The date and time, in epoch time format, when the export job was
     *         created. (Epoch time format is the number of seconds elapsed
     *         since 12:00:00 AM January 1, 1970 UTC.)
     *         </p>
     */
    public java.util.Date getExportCreationTime() {
        return exportCreationTime;
    }

    /**
     * <p>
     * The date and time, in epoch time format, when the export job was created.
     * (Epoch time format is the number of seconds elapsed since 12:00:00 AM
     * January 1, 1970 UTC.)
     * </p>
     *
     * @param exportCreationTime <p>
     *            The date and time, in epoch time format, when the export job
     *            was created. (Epoch time format is the number of seconds
     *            elapsed since 12:00:00 AM January 1, 1970 UTC.)
     *            </p>
     */
    public void setExportCreationTime(java.util.Date exportCreationTime) {
        this.exportCreationTime = exportCreationTime;
    }

    /**
     * <p>
     * The date and time, in epoch time format, when the export job was created.
     * (Epoch time format is the number of seconds elapsed since 12:00:00 AM
     * January 1, 1970 UTC.)
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param exportCreationTime <p>
     *            The date and time, in epoch time format, when the export job
     *            was created. (Epoch time format is the number of seconds
     *            elapsed since 12:00:00 AM January 1, 1970 UTC.)
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JournalS3ExportDescription withExportCreationTime(java.util.Date exportCreationTime) {
        this.exportCreationTime = exportCreationTime;
        return this;
    }

    /**
     * <p>
     * The current state of the journal export job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, COMPLETED, CANCELLED
     *
     * @return <p>
     *         The current state of the journal export job.
     *         </p>
     * @see ExportStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The current state of the journal export job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, COMPLETED, CANCELLED
     *
     * @param status <p>
     *            The current state of the journal export job.
     *            </p>
     * @see ExportStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current state of the journal export job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, COMPLETED, CANCELLED
     *
     * @param status <p>
     *            The current state of the journal export job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ExportStatus
     */
    public JournalS3ExportDescription withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The current state of the journal export job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, COMPLETED, CANCELLED
     *
     * @param status <p>
     *            The current state of the journal export job.
     *            </p>
     * @see ExportStatus
     */
    public void setStatus(ExportStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The current state of the journal export job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, COMPLETED, CANCELLED
     *
     * @param status <p>
     *            The current state of the journal export job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ExportStatus
     */
    public JournalS3ExportDescription withStatus(ExportStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The inclusive start date and time for the range of journal contents that
     * are specified in the original export request.
     * </p>
     *
     * @return <p>
     *         The inclusive start date and time for the range of journal
     *         contents that are specified in the original export request.
     *         </p>
     */
    public java.util.Date getInclusiveStartTime() {
        return inclusiveStartTime;
    }

    /**
     * <p>
     * The inclusive start date and time for the range of journal contents that
     * are specified in the original export request.
     * </p>
     *
     * @param inclusiveStartTime <p>
     *            The inclusive start date and time for the range of journal
     *            contents that are specified in the original export request.
     *            </p>
     */
    public void setInclusiveStartTime(java.util.Date inclusiveStartTime) {
        this.inclusiveStartTime = inclusiveStartTime;
    }

    /**
     * <p>
     * The inclusive start date and time for the range of journal contents that
     * are specified in the original export request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inclusiveStartTime <p>
     *            The inclusive start date and time for the range of journal
     *            contents that are specified in the original export request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JournalS3ExportDescription withInclusiveStartTime(java.util.Date inclusiveStartTime) {
        this.inclusiveStartTime = inclusiveStartTime;
        return this;
    }

    /**
     * <p>
     * The exclusive end date and time for the range of journal contents that
     * are specified in the original export request.
     * </p>
     *
     * @return <p>
     *         The exclusive end date and time for the range of journal contents
     *         that are specified in the original export request.
     *         </p>
     */
    public java.util.Date getExclusiveEndTime() {
        return exclusiveEndTime;
    }

    /**
     * <p>
     * The exclusive end date and time for the range of journal contents that
     * are specified in the original export request.
     * </p>
     *
     * @param exclusiveEndTime <p>
     *            The exclusive end date and time for the range of journal
     *            contents that are specified in the original export request.
     *            </p>
     */
    public void setExclusiveEndTime(java.util.Date exclusiveEndTime) {
        this.exclusiveEndTime = exclusiveEndTime;
    }

    /**
     * <p>
     * The exclusive end date and time for the range of journal contents that
     * are specified in the original export request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param exclusiveEndTime <p>
     *            The exclusive end date and time for the range of journal
     *            contents that are specified in the original export request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JournalS3ExportDescription withExclusiveEndTime(java.util.Date exclusiveEndTime) {
        this.exclusiveEndTime = exclusiveEndTime;
        return this;
    }

    /**
     * <p>
     * The Amazon Simple Storage Service (Amazon S3) bucket location in which a
     * journal export job writes the journal contents.
     * </p>
     *
     * @return <p>
     *         The Amazon Simple Storage Service (Amazon S3) bucket location in
     *         which a journal export job writes the journal contents.
     *         </p>
     */
    public S3ExportConfiguration getS3ExportConfiguration() {
        return s3ExportConfiguration;
    }

    /**
     * <p>
     * The Amazon Simple Storage Service (Amazon S3) bucket location in which a
     * journal export job writes the journal contents.
     * </p>
     *
     * @param s3ExportConfiguration <p>
     *            The Amazon Simple Storage Service (Amazon S3) bucket location
     *            in which a journal export job writes the journal contents.
     *            </p>
     */
    public void setS3ExportConfiguration(S3ExportConfiguration s3ExportConfiguration) {
        this.s3ExportConfiguration = s3ExportConfiguration;
    }

    /**
     * <p>
     * The Amazon Simple Storage Service (Amazon S3) bucket location in which a
     * journal export job writes the journal contents.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param s3ExportConfiguration <p>
     *            The Amazon Simple Storage Service (Amazon S3) bucket location
     *            in which a journal export job writes the journal contents.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JournalS3ExportDescription withS3ExportConfiguration(
            S3ExportConfiguration s3ExportConfiguration) {
        this.s3ExportConfiguration = s3ExportConfiguration;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that grants QLDB
     * permissions for a journal export job to do the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Write objects into your Amazon Simple Storage Service (Amazon S3) bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * (Optional) Use your customer master key (CMK) in AWS Key Management
     * Service (AWS KMS) for server-side encryption of your exported data.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 1600<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the IAM role that grants QLDB
     *         permissions for a journal export job to do the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Write objects into your Amazon Simple Storage Service (Amazon S3)
     *         bucket.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         (Optional) Use your customer master key (CMK) in AWS Key
     *         Management Service (AWS KMS) for server-side encryption of your
     *         exported data.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getRoleArn() {
        return roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that grants QLDB
     * permissions for a journal export job to do the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Write objects into your Amazon Simple Storage Service (Amazon S3) bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * (Optional) Use your customer master key (CMK) in AWS Key Management
     * Service (AWS KMS) for server-side encryption of your exported data.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 1600<br/>
     *
     * @param roleArn <p>
     *            The Amazon Resource Name (ARN) of the IAM role that grants
     *            QLDB permissions for a journal export job to do the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Write objects into your Amazon Simple Storage Service (Amazon
     *            S3) bucket.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            (Optional) Use your customer master key (CMK) in AWS Key
     *            Management Service (AWS KMS) for server-side encryption of
     *            your exported data.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that grants QLDB
     * permissions for a journal export job to do the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Write objects into your Amazon Simple Storage Service (Amazon S3) bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * (Optional) Use your customer master key (CMK) in AWS Key Management
     * Service (AWS KMS) for server-side encryption of your exported data.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 1600<br/>
     *
     * @param roleArn <p>
     *            The Amazon Resource Name (ARN) of the IAM role that grants
     *            QLDB permissions for a journal export job to do the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Write objects into your Amazon Simple Storage Service (Amazon
     *            S3) bucket.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            (Optional) Use your customer master key (CMK) in AWS Key
     *            Management Service (AWS KMS) for server-side encryption of
     *            your exported data.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JournalS3ExportDescription withRoleArn(String roleArn) {
        this.roleArn = roleArn;
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
        if (getLedgerName() != null)
            sb.append("LedgerName: " + getLedgerName() + ",");
        if (getExportId() != null)
            sb.append("ExportId: " + getExportId() + ",");
        if (getExportCreationTime() != null)
            sb.append("ExportCreationTime: " + getExportCreationTime() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getInclusiveStartTime() != null)
            sb.append("InclusiveStartTime: " + getInclusiveStartTime() + ",");
        if (getExclusiveEndTime() != null)
            sb.append("ExclusiveEndTime: " + getExclusiveEndTime() + ",");
        if (getS3ExportConfiguration() != null)
            sb.append("S3ExportConfiguration: " + getS3ExportConfiguration() + ",");
        if (getRoleArn() != null)
            sb.append("RoleArn: " + getRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLedgerName() == null) ? 0 : getLedgerName().hashCode());
        hashCode = prime * hashCode + ((getExportId() == null) ? 0 : getExportId().hashCode());
        hashCode = prime * hashCode
                + ((getExportCreationTime() == null) ? 0 : getExportCreationTime().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getInclusiveStartTime() == null) ? 0 : getInclusiveStartTime().hashCode());
        hashCode = prime * hashCode
                + ((getExclusiveEndTime() == null) ? 0 : getExclusiveEndTime().hashCode());
        hashCode = prime
                * hashCode
                + ((getS3ExportConfiguration() == null) ? 0 : getS3ExportConfiguration().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JournalS3ExportDescription == false)
            return false;
        JournalS3ExportDescription other = (JournalS3ExportDescription) obj;

        if (other.getLedgerName() == null ^ this.getLedgerName() == null)
            return false;
        if (other.getLedgerName() != null
                && other.getLedgerName().equals(this.getLedgerName()) == false)
            return false;
        if (other.getExportId() == null ^ this.getExportId() == null)
            return false;
        if (other.getExportId() != null && other.getExportId().equals(this.getExportId()) == false)
            return false;
        if (other.getExportCreationTime() == null ^ this.getExportCreationTime() == null)
            return false;
        if (other.getExportCreationTime() != null
                && other.getExportCreationTime().equals(this.getExportCreationTime()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getInclusiveStartTime() == null ^ this.getInclusiveStartTime() == null)
            return false;
        if (other.getInclusiveStartTime() != null
                && other.getInclusiveStartTime().equals(this.getInclusiveStartTime()) == false)
            return false;
        if (other.getExclusiveEndTime() == null ^ this.getExclusiveEndTime() == null)
            return false;
        if (other.getExclusiveEndTime() != null
                && other.getExclusiveEndTime().equals(this.getExclusiveEndTime()) == false)
            return false;
        if (other.getS3ExportConfiguration() == null ^ this.getS3ExportConfiguration() == null)
            return false;
        if (other.getS3ExportConfiguration() != null
                && other.getS3ExportConfiguration().equals(this.getS3ExportConfiguration()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        return true;
    }
}
