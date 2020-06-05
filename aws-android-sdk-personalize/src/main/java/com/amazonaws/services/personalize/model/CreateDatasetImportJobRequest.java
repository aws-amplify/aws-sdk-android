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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a job that imports training data from your data source (an Amazon S3
 * bucket) to an Amazon Personalize dataset. To allow Amazon Personalize to
 * import the training data, you must specify an AWS Identity and Access
 * Management (IAM) role that has permission to read from the data source.
 * </p>
 * <important>
 * <p>
 * The dataset import job replaces any previous data in the dataset.
 * </p>
 * </important>
 * <p>
 * <b>Status</b>
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
 * To get the status of the import job, call <a>DescribeDatasetImportJob</a>,
 * providing the Amazon Resource Name (ARN) of the dataset import job. The
 * dataset import is complete when the status shows as ACTIVE. If the status
 * shows as CREATE FAILED, the response includes a <code>failureReason</code>
 * key, which describes why the job failed.
 * </p>
 * <note>
 * <p>
 * Importing takes time. You must wait until the status shows as ACTIVE before
 * training a model using the dataset.
 * </p>
 * </note>
 * <p class="title">
 * <b>Related APIs</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>ListDatasetImportJobs</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeDatasetImportJob</a>
 * </p>
 * </li>
 * </ul>
 */
public class CreateDatasetImportJobRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name for the dataset import job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9][a-zA-Z0-9\-_]*<br/>
     */
    private String jobName;

    /**
     * <p>
     * The ARN of the dataset that receives the imported data.
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
     * The ARN of the IAM role that has permissions to read from the Amazon S3
     * data source.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+
     * <br/>
     */
    private String roleArn;

    /**
     * <p>
     * The name for the dataset import job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9][a-zA-Z0-9\-_]*<br/>
     *
     * @return <p>
     *         The name for the dataset import job.
     *         </p>
     */
    public String getJobName() {
        return jobName;
    }

    /**
     * <p>
     * The name for the dataset import job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9][a-zA-Z0-9\-_]*<br/>
     *
     * @param jobName <p>
     *            The name for the dataset import job.
     *            </p>
     */
    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * <p>
     * The name for the dataset import job.
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
     *            The name for the dataset import job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDatasetImportJobRequest withJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }

    /**
     * <p>
     * The ARN of the dataset that receives the imported data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @return <p>
     *         The ARN of the dataset that receives the imported data.
     *         </p>
     */
    public String getDatasetArn() {
        return datasetArn;
    }

    /**
     * <p>
     * The ARN of the dataset that receives the imported data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @param datasetArn <p>
     *            The ARN of the dataset that receives the imported data.
     *            </p>
     */
    public void setDatasetArn(String datasetArn) {
        this.datasetArn = datasetArn;
    }

    /**
     * <p>
     * The ARN of the dataset that receives the imported data.
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
     *            The ARN of the dataset that receives the imported data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDatasetImportJobRequest withDatasetArn(String datasetArn) {
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
    public CreateDatasetImportJobRequest withDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        return this;
    }

    /**
     * <p>
     * The ARN of the IAM role that has permissions to read from the Amazon S3
     * data source.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+
     * <br/>
     *
     * @return <p>
     *         The ARN of the IAM role that has permissions to read from the
     *         Amazon S3 data source.
     *         </p>
     */
    public String getRoleArn() {
        return roleArn;
    }

    /**
     * <p>
     * The ARN of the IAM role that has permissions to read from the Amazon S3
     * data source.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+
     * <br/>
     *
     * @param roleArn <p>
     *            The ARN of the IAM role that has permissions to read from the
     *            Amazon S3 data source.
     *            </p>
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of the IAM role that has permissions to read from the Amazon S3
     * data source.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+
     * <br/>
     *
     * @param roleArn <p>
     *            The ARN of the IAM role that has permissions to read from the
     *            Amazon S3 data source.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDatasetImportJobRequest withRoleArn(String roleArn) {
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
        if (getJobName() != null)
            sb.append("jobName: " + getJobName() + ",");
        if (getDatasetArn() != null)
            sb.append("datasetArn: " + getDatasetArn() + ",");
        if (getDataSource() != null)
            sb.append("dataSource: " + getDataSource() + ",");
        if (getRoleArn() != null)
            sb.append("roleArn: " + getRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobName() == null) ? 0 : getJobName().hashCode());
        hashCode = prime * hashCode + ((getDatasetArn() == null) ? 0 : getDatasetArn().hashCode());
        hashCode = prime * hashCode + ((getDataSource() == null) ? 0 : getDataSource().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDatasetImportJobRequest == false)
            return false;
        CreateDatasetImportJobRequest other = (CreateDatasetImportJobRequest) obj;

        if (other.getJobName() == null ^ this.getJobName() == null)
            return false;
        if (other.getJobName() != null && other.getJobName().equals(this.getJobName()) == false)
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
        return true;
    }
}
