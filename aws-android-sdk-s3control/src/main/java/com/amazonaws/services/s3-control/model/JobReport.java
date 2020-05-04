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
package com.amazonaws.services.s3-control.model;

import java.io.Serializable;


/**
 * <p>Contains the configuration parameters for a job-completion report.</p>
 */
public class JobReport implements Serializable {
    /**
     * <p>The Amazon Resource Name (ARN) for the bucket where specified job-completion report will be stored.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>arn:[^:]+:s3:.*<br/>
     */
    private String bucket;

    /**
     * <p>The format of the specified job-completion report.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Report_CSV_20180820
     */
    private String format;

    /**
     * <p>Indicates whether the specified job will generate a job-completion report.</p>
     */
    private Boolean enabled;

    /**
     * <p>An optional prefix to describe where in the specified bucket the job-completion report will be stored. Amazon S3 will store the job-completion report at &lt;prefix&gt;/job-&lt;job-id&gt;/report.json.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     */
    private String prefix;

    /**
     * <p>Indicates whether the job-completion report will include details of all tasks or only failed tasks.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AllTasks, FailedTasksOnly
     */
    private String reportScope;

    /**
     * <p>The Amazon Resource Name (ARN) for the bucket where specified job-completion report will be stored.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>arn:[^:]+:s3:.*<br/>
     *
     * @return <p>The Amazon Resource Name (ARN) for the bucket where specified job-completion report will be stored.</p>
     */
    public String getBucket() {
        return bucket;
    }

    /**
     * <p>The Amazon Resource Name (ARN) for the bucket where specified job-completion report will be stored.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>arn:[^:]+:s3:.*<br/>
     *
     * @param bucket <p>The Amazon Resource Name (ARN) for the bucket where specified job-completion report will be stored.</p>
     */
    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>The Amazon Resource Name (ARN) for the bucket where specified job-completion report will be stored.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>arn:[^:]+:s3:.*<br/>
     *
     * @param bucket <p>The Amazon Resource Name (ARN) for the bucket where specified job-completion report will be stored.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public JobReport withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * <p>The format of the specified job-completion report.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Report_CSV_20180820
     *
     * @return <p>The format of the specified job-completion report.</p>
     *
     * @see JobReportFormat
     */
    public String getFormat() {
        return format;
    }

    /**
     * <p>The format of the specified job-completion report.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Report_CSV_20180820
     *
     * @param format <p>The format of the specified job-completion report.</p>
     *
     * @see JobReportFormat
     */
    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * <p>The format of the specified job-completion report.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Report_CSV_20180820
     *
     * @param format <p>The format of the specified job-completion report.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see JobReportFormat
     */
    public JobReport withFormat(String format) {
        this.format = format;
        return this;
    }

    /**
     * <p>The format of the specified job-completion report.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Report_CSV_20180820
     *
     * @param format <p>The format of the specified job-completion report.</p>
     *
     * @see JobReportFormat
     */
    public void setFormat(JobReportFormat format) {
        this.format = format.toString();
    }

    /**
     * <p>The format of the specified job-completion report.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Report_CSV_20180820
     *
     * @param format <p>The format of the specified job-completion report.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see JobReportFormat
     */
    public JobReport withFormat(JobReportFormat format) {
        this.format = format.toString();
        return this;
    }

    /**
     * <p>Indicates whether the specified job will generate a job-completion report.</p>
     *
     * @return <p>Indicates whether the specified job will generate a job-completion report.</p>
     */
    public Boolean isEnabled() {
        return enabled;
    }

    /**
     * <p>Indicates whether the specified job will generate a job-completion report.</p>
     *
     * @return <p>Indicates whether the specified job will generate a job-completion report.</p>
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * <p>Indicates whether the specified job will generate a job-completion report.</p>
     *
     * @param enabled <p>Indicates whether the specified job will generate a job-completion report.</p>
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>Indicates whether the specified job will generate a job-completion report.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param enabled <p>Indicates whether the specified job will generate a job-completion report.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public JobReport withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * <p>An optional prefix to describe where in the specified bucket the job-completion report will be stored. Amazon S3 will store the job-completion report at &lt;prefix&gt;/job-&lt;job-id&gt;/report.json.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     *
     * @return <p>An optional prefix to describe where in the specified bucket the job-completion report will be stored. Amazon S3 will store the job-completion report at &lt;prefix&gt;/job-&lt;job-id&gt;/report.json.</p>
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * <p>An optional prefix to describe where in the specified bucket the job-completion report will be stored. Amazon S3 will store the job-completion report at &lt;prefix&gt;/job-&lt;job-id&gt;/report.json.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     *
     * @param prefix <p>An optional prefix to describe where in the specified bucket the job-completion report will be stored. Amazon S3 will store the job-completion report at &lt;prefix&gt;/job-&lt;job-id&gt;/report.json.</p>
     */
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * <p>An optional prefix to describe where in the specified bucket the job-completion report will be stored. Amazon S3 will store the job-completion report at &lt;prefix&gt;/job-&lt;job-id&gt;/report.json.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     *
     * @param prefix <p>An optional prefix to describe where in the specified bucket the job-completion report will be stored. Amazon S3 will store the job-completion report at &lt;prefix&gt;/job-&lt;job-id&gt;/report.json.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public JobReport withPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }

    /**
     * <p>Indicates whether the job-completion report will include details of all tasks or only failed tasks.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AllTasks, FailedTasksOnly
     *
     * @return <p>Indicates whether the job-completion report will include details of all tasks or only failed tasks.</p>
     *
     * @see JobReportScope
     */
    public String getReportScope() {
        return reportScope;
    }

    /**
     * <p>Indicates whether the job-completion report will include details of all tasks or only failed tasks.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AllTasks, FailedTasksOnly
     *
     * @param reportScope <p>Indicates whether the job-completion report will include details of all tasks or only failed tasks.</p>
     *
     * @see JobReportScope
     */
    public void setReportScope(String reportScope) {
        this.reportScope = reportScope;
    }

    /**
     * <p>Indicates whether the job-completion report will include details of all tasks or only failed tasks.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AllTasks, FailedTasksOnly
     *
     * @param reportScope <p>Indicates whether the job-completion report will include details of all tasks or only failed tasks.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see JobReportScope
     */
    public JobReport withReportScope(String reportScope) {
        this.reportScope = reportScope;
        return this;
    }

    /**
     * <p>Indicates whether the job-completion report will include details of all tasks or only failed tasks.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AllTasks, FailedTasksOnly
     *
     * @param reportScope <p>Indicates whether the job-completion report will include details of all tasks or only failed tasks.</p>
     *
     * @see JobReportScope
     */
    public void setReportScope(JobReportScope reportScope) {
        this.reportScope = reportScope.toString();
    }

    /**
     * <p>Indicates whether the job-completion report will include details of all tasks or only failed tasks.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AllTasks, FailedTasksOnly
     *
     * @param reportScope <p>Indicates whether the job-completion report will include details of all tasks or only failed tasks.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see JobReportScope
     */
    public JobReport withReportScope(JobReportScope reportScope) {
        this.reportScope = reportScope.toString();
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getBucket() != null) sb.append("Bucket: " + getBucket() + ",");
        if (getFormat() != null) sb.append("Format: " + getFormat() + ",");
        if (getEnabled() != null) sb.append("Enabled: " + getEnabled() + ",");
        if (getPrefix() != null) sb.append("Prefix: " + getPrefix() + ",");
        if (getReportScope() != null) sb.append("ReportScope: " + getReportScope());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode());
        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getPrefix() == null) ? 0 : getPrefix().hashCode());
        hashCode = prime * hashCode + ((getReportScope() == null) ? 0 : getReportScope().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof JobReport == false) return false;
        JobReport other = (JobReport)obj;

        if (other.getBucket() == null ^ this.getBucket() == null) return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false) return false;
        if (other.getFormat() == null ^ this.getFormat() == null) return false;
        if (other.getFormat() != null && other.getFormat().equals(this.getFormat()) == false) return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null) return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false) return false;
        if (other.getPrefix() == null ^ this.getPrefix() == null) return false;
        if (other.getPrefix() != null && other.getPrefix().equals(this.getPrefix()) == false) return false;
        if (other.getReportScope() == null ^ this.getReportScope() == null) return false;
        if (other.getReportScope() != null && other.getReportScope().equals(this.getReportScope()) == false) return false;
        return true;
    }
}
