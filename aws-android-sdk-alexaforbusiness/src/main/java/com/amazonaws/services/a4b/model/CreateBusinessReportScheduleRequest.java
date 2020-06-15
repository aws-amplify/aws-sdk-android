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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a recurring schedule for usage reports to deliver to the specified S3
 * location with a specified daily or weekly interval.
 * </p>
 */
public class CreateBusinessReportScheduleRequest extends AmazonWebServiceRequest implements
        Serializable {
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
     * The S3 bucket name of the output reports. If this isn't specified, the
     * report can be retrieved from a download link by calling
     * ListBusinessReportSchedule.
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
     * The recurrence of the reports. If this isn't specified, the report will
     * only be delivered one time when the API is called.
     * </p>
     */
    private BusinessReportRecurrence recurrence;

    /**
     * <p>
     * The client request token.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>10 - 150<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9_-]*<br/>
     */
    private String clientRequestToken;

    /**
     * <p>
     * The tags for the business report schedule.
     * </p>
     */
    private java.util.List<Tag> tags;

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
    public CreateBusinessReportScheduleRequest withScheduleName(String scheduleName) {
        this.scheduleName = scheduleName;
        return this;
    }

    /**
     * <p>
     * The S3 bucket name of the output reports. If this isn't specified, the
     * report can be retrieved from a download link by calling
     * ListBusinessReportSchedule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-z0-9-\.]{3,63}<br/>
     *
     * @return <p>
     *         The S3 bucket name of the output reports. If this isn't
     *         specified, the report can be retrieved from a download link by
     *         calling ListBusinessReportSchedule.
     *         </p>
     */
    public String getS3BucketName() {
        return s3BucketName;
    }

    /**
     * <p>
     * The S3 bucket name of the output reports. If this isn't specified, the
     * report can be retrieved from a download link by calling
     * ListBusinessReportSchedule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-z0-9-\.]{3,63}<br/>
     *
     * @param s3BucketName <p>
     *            The S3 bucket name of the output reports. If this isn't
     *            specified, the report can be retrieved from a download link by
     *            calling ListBusinessReportSchedule.
     *            </p>
     */
    public void setS3BucketName(String s3BucketName) {
        this.s3BucketName = s3BucketName;
    }

    /**
     * <p>
     * The S3 bucket name of the output reports. If this isn't specified, the
     * report can be retrieved from a download link by calling
     * ListBusinessReportSchedule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-z0-9-\.]{3,63}<br/>
     *
     * @param s3BucketName <p>
     *            The S3 bucket name of the output reports. If this isn't
     *            specified, the report can be retrieved from a download link by
     *            calling ListBusinessReportSchedule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateBusinessReportScheduleRequest withS3BucketName(String s3BucketName) {
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
    public CreateBusinessReportScheduleRequest withS3KeyPrefix(String s3KeyPrefix) {
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
    public CreateBusinessReportScheduleRequest withFormat(String format) {
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
    public CreateBusinessReportScheduleRequest withFormat(BusinessReportFormat format) {
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
    public CreateBusinessReportScheduleRequest withContentRange(
            BusinessReportContentRange contentRange) {
        this.contentRange = contentRange;
        return this;
    }

    /**
     * <p>
     * The recurrence of the reports. If this isn't specified, the report will
     * only be delivered one time when the API is called.
     * </p>
     *
     * @return <p>
     *         The recurrence of the reports. If this isn't specified, the
     *         report will only be delivered one time when the API is called.
     *         </p>
     */
    public BusinessReportRecurrence getRecurrence() {
        return recurrence;
    }

    /**
     * <p>
     * The recurrence of the reports. If this isn't specified, the report will
     * only be delivered one time when the API is called.
     * </p>
     *
     * @param recurrence <p>
     *            The recurrence of the reports. If this isn't specified, the
     *            report will only be delivered one time when the API is called.
     *            </p>
     */
    public void setRecurrence(BusinessReportRecurrence recurrence) {
        this.recurrence = recurrence;
    }

    /**
     * <p>
     * The recurrence of the reports. If this isn't specified, the report will
     * only be delivered one time when the API is called.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param recurrence <p>
     *            The recurrence of the reports. If this isn't specified, the
     *            report will only be delivered one time when the API is called.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateBusinessReportScheduleRequest withRecurrence(BusinessReportRecurrence recurrence) {
        this.recurrence = recurrence;
        return this;
    }

    /**
     * <p>
     * The client request token.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>10 - 150<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9_-]*<br/>
     *
     * @return <p>
     *         The client request token.
     *         </p>
     */
    public String getClientRequestToken() {
        return clientRequestToken;
    }

    /**
     * <p>
     * The client request token.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>10 - 150<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9_-]*<br/>
     *
     * @param clientRequestToken <p>
     *            The client request token.
     *            </p>
     */
    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * The client request token.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>10 - 150<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9_-]*<br/>
     *
     * @param clientRequestToken <p>
     *            The client request token.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateBusinessReportScheduleRequest withClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
        return this;
    }

    /**
     * <p>
     * The tags for the business report schedule.
     * </p>
     *
     * @return <p>
     *         The tags for the business report schedule.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags for the business report schedule.
     * </p>
     *
     * @param tags <p>
     *            The tags for the business report schedule.
     *            </p>
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * The tags for the business report schedule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags for the business report schedule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateBusinessReportScheduleRequest withTags(Tag... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<Tag>(tags.length);
        }
        for (Tag value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The tags for the business report schedule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags for the business report schedule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateBusinessReportScheduleRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: " + getClientRequestToken() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

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
                + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateBusinessReportScheduleRequest == false)
            return false;
        CreateBusinessReportScheduleRequest other = (CreateBusinessReportScheduleRequest) obj;

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
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null
                && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
