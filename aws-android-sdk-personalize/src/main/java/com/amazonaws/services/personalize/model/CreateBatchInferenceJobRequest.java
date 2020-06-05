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
 * Creates a batch inference job. The operation can handle up to 50 million
 * records and the input file must be in JSON format. For more information, see
 * <a>recommendations-batch</a>.
 * </p>
 */
public class CreateBatchInferenceJobRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the batch inference job to create.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9][a-zA-Z0-9\-_]*<br/>
     */
    private String jobName;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the solution version that will be used
     * to generate the batch inference recommendations.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     */
    private String solutionVersionArn;

    /**
     * <p>
     * The ARN of the filter to apply to the batch inference job. For more
     * information on using filters, see Using Filters with Amazon Personalize.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     */
    private String filterArn;

    /**
     * <p>
     * The number of recommendations to retreive.
     * </p>
     */
    private Integer numResults;

    /**
     * <p>
     * The Amazon S3 path that leads to the input file to base your
     * recommendations on. The input material must be in JSON format.
     * </p>
     */
    private BatchInferenceJobInput jobInput;

    /**
     * <p>
     * The path to the Amazon S3 bucket where the job's output will be stored.
     * </p>
     */
    private BatchInferenceJobOutput jobOutput;

    /**
     * <p>
     * The ARN of the Amazon Identity and Access Management role that has
     * permissions to read and write to your input and out Amazon S3 buckets
     * respectively.
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
     * The name of the batch inference job to create.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9][a-zA-Z0-9\-_]*<br/>
     *
     * @return <p>
     *         The name of the batch inference job to create.
     *         </p>
     */
    public String getJobName() {
        return jobName;
    }

    /**
     * <p>
     * The name of the batch inference job to create.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9][a-zA-Z0-9\-_]*<br/>
     *
     * @param jobName <p>
     *            The name of the batch inference job to create.
     *            </p>
     */
    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * <p>
     * The name of the batch inference job to create.
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
     *            The name of the batch inference job to create.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateBatchInferenceJobRequest withJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the solution version that will be used
     * to generate the batch inference recommendations.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the solution version that will
     *         be used to generate the batch inference recommendations.
     *         </p>
     */
    public String getSolutionVersionArn() {
        return solutionVersionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the solution version that will be used
     * to generate the batch inference recommendations.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @param solutionVersionArn <p>
     *            The Amazon Resource Name (ARN) of the solution version that
     *            will be used to generate the batch inference recommendations.
     *            </p>
     */
    public void setSolutionVersionArn(String solutionVersionArn) {
        this.solutionVersionArn = solutionVersionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the solution version that will be used
     * to generate the batch inference recommendations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @param solutionVersionArn <p>
     *            The Amazon Resource Name (ARN) of the solution version that
     *            will be used to generate the batch inference recommendations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateBatchInferenceJobRequest withSolutionVersionArn(String solutionVersionArn) {
        this.solutionVersionArn = solutionVersionArn;
        return this;
    }

    /**
     * <p>
     * The ARN of the filter to apply to the batch inference job. For more
     * information on using filters, see Using Filters with Amazon Personalize.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @return <p>
     *         The ARN of the filter to apply to the batch inference job. For
     *         more information on using filters, see Using Filters with Amazon
     *         Personalize.
     *         </p>
     */
    public String getFilterArn() {
        return filterArn;
    }

    /**
     * <p>
     * The ARN of the filter to apply to the batch inference job. For more
     * information on using filters, see Using Filters with Amazon Personalize.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @param filterArn <p>
     *            The ARN of the filter to apply to the batch inference job. For
     *            more information on using filters, see Using Filters with
     *            Amazon Personalize.
     *            </p>
     */
    public void setFilterArn(String filterArn) {
        this.filterArn = filterArn;
    }

    /**
     * <p>
     * The ARN of the filter to apply to the batch inference job. For more
     * information on using filters, see Using Filters with Amazon Personalize.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @param filterArn <p>
     *            The ARN of the filter to apply to the batch inference job. For
     *            more information on using filters, see Using Filters with
     *            Amazon Personalize.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateBatchInferenceJobRequest withFilterArn(String filterArn) {
        this.filterArn = filterArn;
        return this;
    }

    /**
     * <p>
     * The number of recommendations to retreive.
     * </p>
     *
     * @return <p>
     *         The number of recommendations to retreive.
     *         </p>
     */
    public Integer getNumResults() {
        return numResults;
    }

    /**
     * <p>
     * The number of recommendations to retreive.
     * </p>
     *
     * @param numResults <p>
     *            The number of recommendations to retreive.
     *            </p>
     */
    public void setNumResults(Integer numResults) {
        this.numResults = numResults;
    }

    /**
     * <p>
     * The number of recommendations to retreive.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param numResults <p>
     *            The number of recommendations to retreive.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateBatchInferenceJobRequest withNumResults(Integer numResults) {
        this.numResults = numResults;
        return this;
    }

    /**
     * <p>
     * The Amazon S3 path that leads to the input file to base your
     * recommendations on. The input material must be in JSON format.
     * </p>
     *
     * @return <p>
     *         The Amazon S3 path that leads to the input file to base your
     *         recommendations on. The input material must be in JSON format.
     *         </p>
     */
    public BatchInferenceJobInput getJobInput() {
        return jobInput;
    }

    /**
     * <p>
     * The Amazon S3 path that leads to the input file to base your
     * recommendations on. The input material must be in JSON format.
     * </p>
     *
     * @param jobInput <p>
     *            The Amazon S3 path that leads to the input file to base your
     *            recommendations on. The input material must be in JSON format.
     *            </p>
     */
    public void setJobInput(BatchInferenceJobInput jobInput) {
        this.jobInput = jobInput;
    }

    /**
     * <p>
     * The Amazon S3 path that leads to the input file to base your
     * recommendations on. The input material must be in JSON format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param jobInput <p>
     *            The Amazon S3 path that leads to the input file to base your
     *            recommendations on. The input material must be in JSON format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateBatchInferenceJobRequest withJobInput(BatchInferenceJobInput jobInput) {
        this.jobInput = jobInput;
        return this;
    }

    /**
     * <p>
     * The path to the Amazon S3 bucket where the job's output will be stored.
     * </p>
     *
     * @return <p>
     *         The path to the Amazon S3 bucket where the job's output will be
     *         stored.
     *         </p>
     */
    public BatchInferenceJobOutput getJobOutput() {
        return jobOutput;
    }

    /**
     * <p>
     * The path to the Amazon S3 bucket where the job's output will be stored.
     * </p>
     *
     * @param jobOutput <p>
     *            The path to the Amazon S3 bucket where the job's output will
     *            be stored.
     *            </p>
     */
    public void setJobOutput(BatchInferenceJobOutput jobOutput) {
        this.jobOutput = jobOutput;
    }

    /**
     * <p>
     * The path to the Amazon S3 bucket where the job's output will be stored.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param jobOutput <p>
     *            The path to the Amazon S3 bucket where the job's output will
     *            be stored.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateBatchInferenceJobRequest withJobOutput(BatchInferenceJobOutput jobOutput) {
        this.jobOutput = jobOutput;
        return this;
    }

    /**
     * <p>
     * The ARN of the Amazon Identity and Access Management role that has
     * permissions to read and write to your input and out Amazon S3 buckets
     * respectively.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+
     * <br/>
     *
     * @return <p>
     *         The ARN of the Amazon Identity and Access Management role that
     *         has permissions to read and write to your input and out Amazon S3
     *         buckets respectively.
     *         </p>
     */
    public String getRoleArn() {
        return roleArn;
    }

    /**
     * <p>
     * The ARN of the Amazon Identity and Access Management role that has
     * permissions to read and write to your input and out Amazon S3 buckets
     * respectively.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+
     * <br/>
     *
     * @param roleArn <p>
     *            The ARN of the Amazon Identity and Access Management role that
     *            has permissions to read and write to your input and out Amazon
     *            S3 buckets respectively.
     *            </p>
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of the Amazon Identity and Access Management role that has
     * permissions to read and write to your input and out Amazon S3 buckets
     * respectively.
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
     *            The ARN of the Amazon Identity and Access Management role that
     *            has permissions to read and write to your input and out Amazon
     *            S3 buckets respectively.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateBatchInferenceJobRequest withRoleArn(String roleArn) {
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
        if (getSolutionVersionArn() != null)
            sb.append("solutionVersionArn: " + getSolutionVersionArn() + ",");
        if (getFilterArn() != null)
            sb.append("filterArn: " + getFilterArn() + ",");
        if (getNumResults() != null)
            sb.append("numResults: " + getNumResults() + ",");
        if (getJobInput() != null)
            sb.append("jobInput: " + getJobInput() + ",");
        if (getJobOutput() != null)
            sb.append("jobOutput: " + getJobOutput() + ",");
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
        hashCode = prime * hashCode
                + ((getSolutionVersionArn() == null) ? 0 : getSolutionVersionArn().hashCode());
        hashCode = prime * hashCode + ((getFilterArn() == null) ? 0 : getFilterArn().hashCode());
        hashCode = prime * hashCode + ((getNumResults() == null) ? 0 : getNumResults().hashCode());
        hashCode = prime * hashCode + ((getJobInput() == null) ? 0 : getJobInput().hashCode());
        hashCode = prime * hashCode + ((getJobOutput() == null) ? 0 : getJobOutput().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateBatchInferenceJobRequest == false)
            return false;
        CreateBatchInferenceJobRequest other = (CreateBatchInferenceJobRequest) obj;

        if (other.getJobName() == null ^ this.getJobName() == null)
            return false;
        if (other.getJobName() != null && other.getJobName().equals(this.getJobName()) == false)
            return false;
        if (other.getSolutionVersionArn() == null ^ this.getSolutionVersionArn() == null)
            return false;
        if (other.getSolutionVersionArn() != null
                && other.getSolutionVersionArn().equals(this.getSolutionVersionArn()) == false)
            return false;
        if (other.getFilterArn() == null ^ this.getFilterArn() == null)
            return false;
        if (other.getFilterArn() != null
                && other.getFilterArn().equals(this.getFilterArn()) == false)
            return false;
        if (other.getNumResults() == null ^ this.getNumResults() == null)
            return false;
        if (other.getNumResults() != null
                && other.getNumResults().equals(this.getNumResults()) == false)
            return false;
        if (other.getJobInput() == null ^ this.getJobInput() == null)
            return false;
        if (other.getJobInput() != null && other.getJobInput().equals(this.getJobInput()) == false)
            return false;
        if (other.getJobOutput() == null ^ this.getJobOutput() == null)
            return false;
        if (other.getJobOutput() != null
                && other.getJobOutput().equals(this.getJobOutput()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        return true;
    }
}
