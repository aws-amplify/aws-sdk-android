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

package com.amazonaws.services.personalize.model;

import java.io.Serializable;

/**
 * <p>
 * Describes a job that imports training data from a data source (Amazon S3
 * bucket) to an Amazon Personalize dataset. For more information, see
 * <a>CreateDatasetImportJob</a>.
 * </p>
 * <p>
 * A dataset import job can be in one of the following states:
 * </p>
 * <ul>
 * <li>
 * <p>
 * CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
 * </p>
 * </li>
 * </ul>
 */
public class DatasetImportJob implements Serializable {
    /**
     * <p>
     * The name of the import job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9][a-zA-Z0-9\-_]*<br/>
     */
    private String jobName;

    /**
     * <p>
     * The ARN of the dataset import job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     */
    private String datasetImportJobArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset that receives the imported
     * data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     */
    private String datasetArn;

    /**
     * <p>
     * The Amazon S3 bucket that contains the training data to import.
     * </p>
     */
    private DataSource dataSource;

    /**
     * <p>
     * The ARN of the AWS Identity and Access Management (IAM) role that has
     * permissions to read from the Amazon S3 data source.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     */
    private String roleArn;

    /**
     * <p>
     * The status of the dataset import job.
     * </p>
     * <p>
     * A dataset import job can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     */
    private String status;

    /**
     * <p>
     * The creation date and time (in Unix time) of the dataset import job.
     * </p>
     */
    private java.util.Date creationDateTime;

    /**
     * <p>
     * The date and time (in Unix time) the dataset was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedDateTime;

    /**
     * <p>
     * If a dataset import job fails, provides the reason why.
     * </p>
     */
    private String failureReason;

    /**
     * <p>
     * The name of the import job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9][a-zA-Z0-9\-_]*<br/>
     *
     * @return <p>
     *         The name of the import job.
     *         </p>
     */
    public String getJobName() {
        return jobName;
    }

    /**
     * <p>
     * The name of the import job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9][a-zA-Z0-9\-_]*<br/>
     *
     * @param jobName <p>
     *            The name of the import job.
     *            </p>
     */
    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * <p>
     * The name of the import job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9][a-zA-Z0-9\-_]*<br/>
     *
     * @param jobName <p>
     *            The name of the import job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DatasetImportJob withJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }

    /**
     * <p>
     * The ARN of the dataset import job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @return <p>
     *         The ARN of the dataset import job.
     *         </p>
     */
    public String getDatasetImportJobArn() {
        return datasetImportJobArn;
    }

    /**
     * <p>
     * The ARN of the dataset import job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @param datasetImportJobArn <p>
     *            The ARN of the dataset import job.
     *            </p>
     */
    public void setDatasetImportJobArn(String datasetImportJobArn) {
        this.datasetImportJobArn = datasetImportJobArn;
    }

    /**
     * <p>
     * The ARN of the dataset import job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @param datasetImportJobArn <p>
     *            The ARN of the dataset import job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DatasetImportJob withDatasetImportJobArn(String datasetImportJobArn) {
        this.datasetImportJobArn = datasetImportJobArn;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset that receives the imported
     * data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the dataset that receives the
     *         imported data.
     *         </p>
     */
    public String getDatasetArn() {
        return datasetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset that receives the imported
     * data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @param datasetArn <p>
     *            The Amazon Resource Name (ARN) of the dataset that receives
     *            the imported data.
     *            </p>
     */
    public void setDatasetArn(String datasetArn) {
        this.datasetArn = datasetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset that receives the imported
     * data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @param datasetArn <p>
     *            The Amazon Resource Name (ARN) of the dataset that receives
     *            the imported data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DatasetImportJob withDatasetArn(String datasetArn) {
        this.datasetArn = datasetArn;
        return this;
    }

    /**
     * <p>
     * The Amazon S3 bucket that contains the training data to import.
     * </p>
     *
     * @return <p>
     *         The Amazon S3 bucket that contains the training data to import.
     *         </p>
     */
    public DataSource getDataSource() {
        return dataSource;
    }

    /**
     * <p>
     * The Amazon S3 bucket that contains the training data to import.
     * </p>
     *
     * @param dataSource <p>
     *            The Amazon S3 bucket that contains the training data to
     *            import.
     *            </p>
     */
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    /**
     * <p>
     * The Amazon S3 bucket that contains the training data to import.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dataSource <p>
     *            The Amazon S3 bucket that contains the training data to
     *            import.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DatasetImportJob withDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        return this;
    }

    /**
     * <p>
     * The ARN of the AWS Identity and Access Management (IAM) role that has
     * permissions to read from the Amazon S3 data source.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @return <p>
     *         The ARN of the AWS Identity and Access Management (IAM) role that
     *         has permissions to read from the Amazon S3 data source.
     *         </p>
     */
    public String getRoleArn() {
        return roleArn;
    }

    /**
     * <p>
     * The ARN of the AWS Identity and Access Management (IAM) role that has
     * permissions to read from the Amazon S3 data source.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @param roleArn <p>
     *            The ARN of the AWS Identity and Access Management (IAM) role
     *            that has permissions to read from the Amazon S3 data source.
     *            </p>
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of the AWS Identity and Access Management (IAM) role that has
     * permissions to read from the Amazon S3 data source.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @param roleArn <p>
     *            The ARN of the AWS Identity and Access Management (IAM) role
     *            that has permissions to read from the Amazon S3 data source.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DatasetImportJob withRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * <p>
     * The status of the dataset import job.
     * </p>
     * <p>
     * A dataset import job can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @return <p>
     *         The status of the dataset import job.
     *         </p>
     *         <p>
     *         A dataset import job can be in one of the following states:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE
     *         FAILED
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the dataset import job.
     * </p>
     * <p>
     * A dataset import job can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param status <p>
     *            The status of the dataset import job.
     *            </p>
     *            <p>
     *            A dataset import job can be in one of the following states:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE
     *            FAILED
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the dataset import job.
     * </p>
     * <p>
     * A dataset import job can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param status <p>
     *            The status of the dataset import job.
     *            </p>
     *            <p>
     *            A dataset import job can be in one of the following states:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE
     *            FAILED
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DatasetImportJob withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The creation date and time (in Unix time) of the dataset import job.
     * </p>
     *
     * @return <p>
     *         The creation date and time (in Unix time) of the dataset import
     *         job.
     *         </p>
     */
    public java.util.Date getCreationDateTime() {
        return creationDateTime;
    }

    /**
     * <p>
     * The creation date and time (in Unix time) of the dataset import job.
     * </p>
     *
     * @param creationDateTime <p>
     *            The creation date and time (in Unix time) of the dataset
     *            import job.
     *            </p>
     */
    public void setCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    /**
     * <p>
     * The creation date and time (in Unix time) of the dataset import job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationDateTime <p>
     *            The creation date and time (in Unix time) of the dataset
     *            import job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DatasetImportJob withCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
        return this;
    }

    /**
     * <p>
     * The date and time (in Unix time) the dataset was last updated.
     * </p>
     *
     * @return <p>
     *         The date and time (in Unix time) the dataset was last updated.
     *         </p>
     */
    public java.util.Date getLastUpdatedDateTime() {
        return lastUpdatedDateTime;
    }

    /**
     * <p>
     * The date and time (in Unix time) the dataset was last updated.
     * </p>
     *
     * @param lastUpdatedDateTime <p>
     *            The date and time (in Unix time) the dataset was last updated.
     *            </p>
     */
    public void setLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        this.lastUpdatedDateTime = lastUpdatedDateTime;
    }

    /**
     * <p>
     * The date and time (in Unix time) the dataset was last updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastUpdatedDateTime <p>
     *            The date and time (in Unix time) the dataset was last updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DatasetImportJob withLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        this.lastUpdatedDateTime = lastUpdatedDateTime;
        return this;
    }

    /**
     * <p>
     * If a dataset import job fails, provides the reason why.
     * </p>
     *
     * @return <p>
     *         If a dataset import job fails, provides the reason why.
     *         </p>
     */
    public String getFailureReason() {
        return failureReason;
    }

    /**
     * <p>
     * If a dataset import job fails, provides the reason why.
     * </p>
     *
     * @param failureReason <p>
     *            If a dataset import job fails, provides the reason why.
     *            </p>
     */
    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * If a dataset import job fails, provides the reason why.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param failureReason <p>
     *            If a dataset import job fails, provides the reason why.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DatasetImportJob withFailureReason(String failureReason) {
        this.failureReason = failureReason;
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
        if (getJobName() != null)
            sb.append("jobName: " + getJobName() + ",");
        if (getDatasetImportJobArn() != null)
            sb.append("datasetImportJobArn: " + getDatasetImportJobArn() + ",");
        if (getDatasetArn() != null)
            sb.append("datasetArn: " + getDatasetArn() + ",");
        if (getDataSource() != null)
            sb.append("dataSource: " + getDataSource() + ",");
        if (getRoleArn() != null)
            sb.append("roleArn: " + getRoleArn() + ",");
        if (getStatus() != null)
            sb.append("status: " + getStatus() + ",");
        if (getCreationDateTime() != null)
            sb.append("creationDateTime: " + getCreationDateTime() + ",");
        if (getLastUpdatedDateTime() != null)
            sb.append("lastUpdatedDateTime: " + getLastUpdatedDateTime() + ",");
        if (getFailureReason() != null)
            sb.append("failureReason: " + getFailureReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobName() == null) ? 0 : getJobName().hashCode());
        hashCode = prime * hashCode
                + ((getDatasetImportJobArn() == null) ? 0 : getDatasetImportJobArn().hashCode());
        hashCode = prime * hashCode + ((getDatasetArn() == null) ? 0 : getDatasetArn().hashCode());
        hashCode = prime * hashCode + ((getDataSource() == null) ? 0 : getDataSource().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getCreationDateTime() == null) ? 0 : getCreationDateTime().hashCode());
        hashCode = prime * hashCode
                + ((getLastUpdatedDateTime() == null) ? 0 : getLastUpdatedDateTime().hashCode());
        hashCode = prime * hashCode
                + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DatasetImportJob == false)
            return false;
        DatasetImportJob other = (DatasetImportJob) obj;

        if (other.getJobName() == null ^ this.getJobName() == null)
            return false;
        if (other.getJobName() != null && other.getJobName().equals(this.getJobName()) == false)
            return false;
        if (other.getDatasetImportJobArn() == null ^ this.getDatasetImportJobArn() == null)
            return false;
        if (other.getDatasetImportJobArn() != null
                && other.getDatasetImportJobArn().equals(this.getDatasetImportJobArn()) == false)
            return false;
        if (other.getDatasetArn() == null ^ this.getDatasetArn() == null)
            return false;
        if (other.getDatasetArn() != null
                && other.getDatasetArn().equals(this.getDatasetArn()) == false)
            return false;
        if (other.getDataSource() == null ^ this.getDataSource() == null)
            return false;
        if (other.getDataSource() != null
                && other.getDataSource().equals(this.getDataSource()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCreationDateTime() == null ^ this.getCreationDateTime() == null)
            return false;
        if (other.getCreationDateTime() != null
                && other.getCreationDateTime().equals(this.getCreationDateTime()) == false)
            return false;
        if (other.getLastUpdatedDateTime() == null ^ this.getLastUpdatedDateTime() == null)
            return false;
        if (other.getLastUpdatedDateTime() != null
                && other.getLastUpdatedDateTime().equals(this.getLastUpdatedDateTime()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null
                && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        return true;
    }
}
