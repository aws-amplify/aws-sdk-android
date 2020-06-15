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

package com.amazonaws.services.a4b.model;

import java.io.Serializable;

/**
 * <p>
 * The schedule of the usage report.
 * </p>
 */
public class BusinessReportSchedule implements Serializable {
    /**
     * <p>
     * The ARN of the business report schedule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     */
    private String scheduleArn;

    /**
     * <p>
     * The name identifier of the schedule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     * <b>Pattern: </b>[
     * -\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*<br/>
     */
    private String scheduleName;

    /**
     * <p>
     * The S3 bucket name of the output reports.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-z0-9-\.]{3,63}<br/>
     */
    private String s3BucketName;

    /**
     * <p>
     * The S3 key where the report is delivered.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     * <b>Pattern: </b>[A-Za-z0-9!_\-\.\*'()/]*<br/>
     */
    private String s3KeyPrefix;

    /**
     * <p>
     * The format of the generated report (individual CSV files or zipped files
     * of individual files).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CSV, CSV_ZIP
     */
    private String format;

    /**
     * <p>
     * The content range of the reports.
     * </p>
     */
    private BusinessReportContentRange contentRange;

    /**
     * <p>
     * The recurrence of the reports.
     * </p>
     */
    private BusinessReportRecurrence recurrence;

    /**
     * <p>
     * The details of the last business report delivery for a specified time
     * interval.
     * </p>
     */
    private BusinessReport lastBusinessReport;

    /**
     * <p>
     * The ARN of the business report schedule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @return <p>
     *         The ARN of the business report schedule.
     *         </p>
     */
    public String getScheduleArn() {
        return scheduleArn;
    }

    /**
     * <p>
     * The ARN of the business report schedule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param scheduleArn <p>
     *            The ARN of the business report schedule.
     *            </p>
     */
    public void setScheduleArn(String scheduleArn) {
        this.scheduleArn = scheduleArn;
    }

    /**
     * <p>
     * The ARN of the business report schedule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param scheduleArn <p>
     *            The ARN of the business report schedule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BusinessReportSchedule withScheduleArn(String scheduleArn) {
        this.scheduleArn = scheduleArn;
        return this;
    }

    /**
     * <p>
     * The name identifier of the schedule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     * <b>Pattern: </b>[
     * -\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*<br/>
     *
     * @return <p>
     *         The name identifier of the schedule.
     *         </p>
     */
    public String getScheduleName() {
        return scheduleName;
    }

    /**
     * <p>
     * The name identifier of the schedule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     * <b>Pattern: </b>[
     * -\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*<br/>
     *
     * @param scheduleName <p>
     *            The name identifier of the schedule.
     *            </p>
     */
    public void setScheduleName(String scheduleName) {
        this.scheduleName = scheduleName;
    }

    /**
     * <p>
     * The name identifier of the schedule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     * <b>Pattern: </b>[
     * -\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*<br/>
     *
     * @param scheduleName <p>
     *            The name identifier of the schedule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BusinessReportSchedule withScheduleName(String scheduleName) {
        this.scheduleName = scheduleName;
        return this;
    }

    /**
     * <p>
     * The S3 bucket name of the output reports.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-z0-9-\.]{3,63}<br/>
     *
     * @return <p>
     *         The S3 bucket name of the output reports.
     *         </p>
     */
    public String getS3BucketName() {
        return s3BucketName;
    }

    /**
     * <p>
     * The S3 bucket name of the output reports.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-z0-9-\.]{3,63}<br/>
     *
     * @param s3BucketName <p>
     *            The S3 bucket name of the output reports.
     *            </p>
     */
    public void setS3BucketName(String s3BucketName) {
        this.s3BucketName = s3BucketName;
    }

    /**
     * <p>
     * The S3 bucket name of the output reports.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-z0-9-\.]{3,63}<br/>
     *
     * @param s3BucketName <p>
     *            The S3 bucket name of the output reports.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BusinessReportSchedule withS3BucketName(String s3BucketName) {
        this.s3BucketName = s3BucketName;
        return this;
    }

    /**
     * <p>
     * The S3 key where the report is delivered.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     * <b>Pattern: </b>[A-Za-z0-9!_\-\.\*'()/]*<br/>
     *
     * @return <p>
     *         The S3 key where the report is delivered.
     *         </p>
     */
    public String getS3KeyPrefix() {
        return s3KeyPrefix;
    }

    /**
     * <p>
     * The S3 key where the report is delivered.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     * <b>Pattern: </b>[A-Za-z0-9!_\-\.\*'()/]*<br/>
     *
     * @param s3KeyPrefix <p>
     *            The S3 key where the report is delivered.
     *            </p>
     */
    public void setS3KeyPrefix(String s3KeyPrefix) {
        this.s3KeyPrefix = s3KeyPrefix;
    }

    /**
     * <p>
     * The S3 key where the report is delivered.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     * <b>Pattern: </b>[A-Za-z0-9!_\-\.\*'()/]*<br/>
     *
     * @param s3KeyPrefix <p>
     *            The S3 key where the report is delivered.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BusinessReportSchedule withS3KeyPrefix(String s3KeyPrefix) {
        this.s3KeyPrefix = s3KeyPrefix;
        return this;
    }

    /**
     * <p>
     * The format of the generated report (individual CSV files or zipped files
     * of individual files).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CSV, CSV_ZIP
     *
     * @return <p>
     *         The format of the generated report (individual CSV files or
     *         zipped files of individual files).
     *         </p>
     * @see BusinessReportFormat
     */
    public String getFormat() {
        return format;
    }

    /**
     * <p>
     * The format of the generated report (individual CSV files or zipped files
     * of individual files).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CSV, CSV_ZIP
     *
     * @param format <p>
     *            The format of the generated report (individual CSV files or
     *            zipped files of individual files).
     *            </p>
     * @see BusinessReportFormat
     */
    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * <p>
     * The format of the generated report (individual CSV files or zipped files
     * of individual files).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CSV, CSV_ZIP
     *
     * @param format <p>
     *            The format of the generated report (individual CSV files or
     *            zipped files of individual files).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see BusinessReportFormat
     */
    public BusinessReportSchedule withFormat(String format) {
        this.format = format;
        return this;
    }

    /**
     * <p>
     * The format of the generated report (individual CSV files or zipped files
     * of individual files).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CSV, CSV_ZIP
     *
     * @param format <p>
     *            The format of the generated report (individual CSV files or
     *            zipped files of individual files).
     *            </p>
     * @see BusinessReportFormat
     */
    public void setFormat(BusinessReportFormat format) {
        this.format = format.toString();
    }

    /**
     * <p>
     * The format of the generated report (individual CSV files or zipped files
     * of individual files).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CSV, CSV_ZIP
     *
     * @param format <p>
     *            The format of the generated report (individual CSV files or
     *            zipped files of individual files).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see BusinessReportFormat
     */
    public BusinessReportSchedule withFormat(BusinessReportFormat format) {
        this.format = format.toString();
        return this;
    }

    /**
     * <p>
     * The content range of the reports.
     * </p>
     *
     * @return <p>
     *         The content range of the reports.
     *         </p>
     */
    public BusinessReportContentRange getContentRange() {
        return contentRange;
    }

    /**
     * <p>
     * The content range of the reports.
     * </p>
     *
     * @param contentRange <p>
     *            The content range of the reports.
     *            </p>
     */
    public void setContentRange(BusinessReportContentRange contentRange) {
        this.contentRange = contentRange;
    }

    /**
     * <p>
     * The content range of the reports.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param contentRange <p>
     *            The content range of the reports.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BusinessReportSchedule withContentRange(BusinessReportContentRange contentRange) {
        this.contentRange = contentRange;
        return this;
    }

    /**
     * <p>
     * The recurrence of the reports.
     * </p>
     *
     * @return <p>
     *         The recurrence of the reports.
     *         </p>
     */
    public BusinessReportRecurrence getRecurrence() {
        return recurrence;
    }

    /**
     * <p>
     * The recurrence of the reports.
     * </p>
     *
     * @param recurrence <p>
     *            The recurrence of the reports.
     *            </p>
     */
    public void setRecurrence(BusinessReportRecurrence recurrence) {
        this.recurrence = recurrence;
    }

    /**
     * <p>
     * The recurrence of the reports.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param recurrence <p>
     *            The recurrence of the reports.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BusinessReportSchedule withRecurrence(BusinessReportRecurrence recurrence) {
        this.recurrence = recurrence;
        return this;
    }

    /**
     * <p>
     * The details of the last business report delivery for a specified time
     * interval.
     * </p>
     *
     * @return <p>
     *         The details of the last business report delivery for a specified
     *         time interval.
     *         </p>
     */
    public BusinessReport getLastBusinessReport() {
        return lastBusinessReport;
    }

    /**
     * <p>
     * The details of the last business report delivery for a specified time
     * interval.
     * </p>
     *
     * @param lastBusinessReport <p>
     *            The details of the last business report delivery for a
     *            specified time interval.
     *            </p>
     */
    public void setLastBusinessReport(BusinessReport lastBusinessReport) {
        this.lastBusinessReport = lastBusinessReport;
    }

    /**
     * <p>
     * The details of the last business report delivery for a specified time
     * interval.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastBusinessReport <p>
     *            The details of the last business report delivery for a
     *            specified time interval.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BusinessReportSchedule withLastBusinessReport(BusinessReport lastBusinessReport) {
        this.lastBusinessReport = lastBusinessReport;
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
        if (getScheduleArn() != null)
            sb.append("ScheduleArn: " + getScheduleArn() + ",");
        if (getScheduleName() != null)
            sb.append("ScheduleName: " + getScheduleName() + ",");
        if (getS3BucketName() != null)
            sb.append("S3BucketName: " + getS3BucketName() + ",");
        if (getS3KeyPrefix() != null)
            sb.append("S3KeyPrefix: " + getS3KeyPrefix() + ",");
        if (getFormat() != null)
            sb.append("Format: " + getFormat() + ",");
        if (getContentRange() != null)
            sb.append("ContentRange: " + getContentRange() + ",");
        if (getRecurrence() != null)
            sb.append("Recurrence: " + getRecurrence() + ",");
        if (getLastBusinessReport() != null)
            sb.append("LastBusinessReport: " + getLastBusinessReport());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getScheduleArn() == null) ? 0 : getScheduleArn().hashCode());
        hashCode = prime * hashCode
                + ((getScheduleName() == null) ? 0 : getScheduleName().hashCode());
        hashCode = prime * hashCode
                + ((getS3BucketName() == null) ? 0 : getS3BucketName().hashCode());
        hashCode = prime * hashCode
                + ((getS3KeyPrefix() == null) ? 0 : getS3KeyPrefix().hashCode());
        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode());
        hashCode = prime * hashCode
                + ((getContentRange() == null) ? 0 : getContentRange().hashCode());
        hashCode = prime * hashCode + ((getRecurrence() == null) ? 0 : getRecurrence().hashCode());
        hashCode = prime * hashCode
                + ((getLastBusinessReport() == null) ? 0 : getLastBusinessReport().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BusinessReportSchedule == false)
            return false;
        BusinessReportSchedule other = (BusinessReportSchedule) obj;

        if (other.getScheduleArn() == null ^ this.getScheduleArn() == null)
            return false;
        if (other.getScheduleArn() != null
                && other.getScheduleArn().equals(this.getScheduleArn()) == false)
            return false;
        if (other.getScheduleName() == null ^ this.getScheduleName() == null)
            return false;
        if (other.getScheduleName() != null
                && other.getScheduleName().equals(this.getScheduleName()) == false)
            return false;
        if (other.getS3BucketName() == null ^ this.getS3BucketName() == null)
            return false;
        if (other.getS3BucketName() != null
                && other.getS3BucketName().equals(this.getS3BucketName()) == false)
            return false;
        if (other.getS3KeyPrefix() == null ^ this.getS3KeyPrefix() == null)
            return false;
        if (other.getS3KeyPrefix() != null
                && other.getS3KeyPrefix().equals(this.getS3KeyPrefix()) == false)
            return false;
        if (other.getFormat() == null ^ this.getFormat() == null)
            return false;
        if (other.getFormat() != null && other.getFormat().equals(this.getFormat()) == false)
            return false;
        if (other.getContentRange() == null ^ this.getContentRange() == null)
            return false;
        if (other.getContentRange() != null
                && other.getContentRange().equals(this.getContentRange()) == false)
            return false;
        if (other.getRecurrence() == null ^ this.getRecurrence() == null)
            return false;
        if (other.getRecurrence() != null
                && other.getRecurrence().equals(this.getRecurrence()) == false)
            return false;
        if (other.getLastBusinessReport() == null ^ this.getLastBusinessReport() == null)
            return false;
        if (other.getLastBusinessReport() != null
                && other.getLastBusinessReport().equals(this.getLastBusinessReport()) == false)
            return false;
        return true;
    }
}
