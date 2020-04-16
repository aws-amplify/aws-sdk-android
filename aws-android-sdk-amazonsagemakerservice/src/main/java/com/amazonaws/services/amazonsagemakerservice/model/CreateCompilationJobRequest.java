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

package com.amazonaws.services.amazonsagemakerservice.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Starts a model compilation job. After the model has been compiled, Amazon
 * SageMaker saves the resulting model artifacts to an Amazon Simple Storage
 * Service (Amazon S3) bucket that you specify.
 * </p>
 * <p>
 * If you choose to host your model using Amazon SageMaker hosting services, you
 * can use the resulting model artifacts as part of the model. You can also use
 * the artifacts with AWS IoT Greengrass. In that case, deploy them as an ML
 * resource.
 * </p>
 * <p>
 * In the request body, you provide the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * A name for the compilation job
 * </p>
 * </li>
 * <li>
 * <p>
 * Information about the input model artifacts
 * </p>
 * </li>
 * <li>
 * <p>
 * The output location for the compiled model and the device (target) that the
 * model runs on
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>The Amazon Resource Name (ARN) of the IAM role that Amazon SageMaker assumes to perform the model compilation job</code>
 * </p>
 * </li>
 * </ul>
 * <p>
 * You can also provide a <code>Tag</code> to track the model compilation job's
 * resource use and costs. The response body contains the
 * <code>CompilationJobArn</code> for the compiled job.
 * </p>
 * <p>
 * To stop a model compilation job, use <a>StopCompilationJob</a>. To get
 * information about a particular model compilation job, use
 * <a>DescribeCompilationJob</a>. To get information about multiple model
 * compilation jobs, use <a>ListCompilationJobs</a>.
 * </p>
 */
public class CreateCompilationJobRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A name for the model compilation job. The name must be unique within the
     * AWS Region and within your AWS account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*$<br/>
     */
    private String compilationJobName;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that enables Amazon
     * SageMaker to perform tasks on your behalf.
     * </p>
     * <p>
     * During model compilation, Amazon SageMaker needs your permission to:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Read input data from an S3 bucket
     * </p>
     * </li>
     * <li>
     * <p>
     * Write model artifacts to an S3 bucket
     * </p>
     * </li>
     * <li>
     * <p>
     * Write logs to Amazon CloudWatch Logs
     * </p>
     * </li>
     * <li>
     * <p>
     * Publish metrics to Amazon CloudWatch
     * </p>
     * </li>
     * </ul>
     * <p>
     * You grant permissions for all of these tasks to an IAM role. To pass this
     * role to Amazon SageMaker, the caller of this API must have the
     * <code>iam:PassRole</code> permission. For more information, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-roles.html"
     * >Amazon SageMaker Roles.</a>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>^arn:aws[a-z\-]*:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+$<br/>
     */
    private String roleArn;

    /**
     * <p>
     * Provides information about the location of input model artifacts, the
     * name and shape of the expected data inputs, and the framework in which
     * the model was trained.
     * </p>
     */
    private InputConfig inputConfig;

    /**
     * <p>
     * Provides information about the output location for the compiled model and
     * the target device the model runs on.
     * </p>
     */
    private OutputConfig outputConfig;

    /**
     * <p>
     * Specifies a limit to how long a model compilation job can run. When the
     * job reaches the time limit, Amazon SageMaker ends the compilation job.
     * Use this API to cap model training costs.
     * </p>
     */
    private StoppingCondition stoppingCondition;

    /**
     * <p>
     * A name for the model compilation job. The name must be unique within the
     * AWS Region and within your AWS account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*$<br/>
     *
     * @return <p>
     *         A name for the model compilation job. The name must be unique
     *         within the AWS Region and within your AWS account.
     *         </p>
     */
    public String getCompilationJobName() {
        return compilationJobName;
    }

    /**
     * <p>
     * A name for the model compilation job. The name must be unique within the
     * AWS Region and within your AWS account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*$<br/>
     *
     * @param compilationJobName <p>
     *            A name for the model compilation job. The name must be unique
     *            within the AWS Region and within your AWS account.
     *            </p>
     */
    public void setCompilationJobName(String compilationJobName) {
        this.compilationJobName = compilationJobName;
    }

    /**
     * <p>
     * A name for the model compilation job. The name must be unique within the
     * AWS Region and within your AWS account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*$<br/>
     *
     * @param compilationJobName <p>
     *            A name for the model compilation job. The name must be unique
     *            within the AWS Region and within your AWS account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCompilationJobRequest withCompilationJobName(String compilationJobName) {
        this.compilationJobName = compilationJobName;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that enables Amazon
     * SageMaker to perform tasks on your behalf.
     * </p>
     * <p>
     * During model compilation, Amazon SageMaker needs your permission to:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Read input data from an S3 bucket
     * </p>
     * </li>
     * <li>
     * <p>
     * Write model artifacts to an S3 bucket
     * </p>
     * </li>
     * <li>
     * <p>
     * Write logs to Amazon CloudWatch Logs
     * </p>
     * </li>
     * <li>
     * <p>
     * Publish metrics to Amazon CloudWatch
     * </p>
     * </li>
     * </ul>
     * <p>
     * You grant permissions for all of these tasks to an IAM role. To pass this
     * role to Amazon SageMaker, the caller of this API must have the
     * <code>iam:PassRole</code> permission. For more information, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-roles.html"
     * >Amazon SageMaker Roles.</a>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>^arn:aws[a-z\-]*:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+$<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of an IAM role that enables Amazon
     *         SageMaker to perform tasks on your behalf.
     *         </p>
     *         <p>
     *         During model compilation, Amazon SageMaker needs your permission
     *         to:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Read input data from an S3 bucket
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Write model artifacts to an S3 bucket
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Write logs to Amazon CloudWatch Logs
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Publish metrics to Amazon CloudWatch
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         You grant permissions for all of these tasks to an IAM role. To
     *         pass this role to Amazon SageMaker, the caller of this API must
     *         have the <code>iam:PassRole</code> permission. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-roles.html"
     *         >Amazon SageMaker Roles.</a>
     *         </p>
     */
    public String getRoleArn() {
        return roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that enables Amazon
     * SageMaker to perform tasks on your behalf.
     * </p>
     * <p>
     * During model compilation, Amazon SageMaker needs your permission to:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Read input data from an S3 bucket
     * </p>
     * </li>
     * <li>
     * <p>
     * Write model artifacts to an S3 bucket
     * </p>
     * </li>
     * <li>
     * <p>
     * Write logs to Amazon CloudWatch Logs
     * </p>
     * </li>
     * <li>
     * <p>
     * Publish metrics to Amazon CloudWatch
     * </p>
     * </li>
     * </ul>
     * <p>
     * You grant permissions for all of these tasks to an IAM role. To pass this
     * role to Amazon SageMaker, the caller of this API must have the
     * <code>iam:PassRole</code> permission. For more information, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-roles.html"
     * >Amazon SageMaker Roles.</a>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>^arn:aws[a-z\-]*:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+$<br/>
     *
     * @param roleArn <p>
     *            The Amazon Resource Name (ARN) of an IAM role that enables
     *            Amazon SageMaker to perform tasks on your behalf.
     *            </p>
     *            <p>
     *            During model compilation, Amazon SageMaker needs your
     *            permission to:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Read input data from an S3 bucket
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Write model artifacts to an S3 bucket
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Write logs to Amazon CloudWatch Logs
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Publish metrics to Amazon CloudWatch
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            You grant permissions for all of these tasks to an IAM role.
     *            To pass this role to Amazon SageMaker, the caller of this API
     *            must have the <code>iam:PassRole</code> permission. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-roles.html"
     *            >Amazon SageMaker Roles.</a>
     *            </p>
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that enables Amazon
     * SageMaker to perform tasks on your behalf.
     * </p>
     * <p>
     * During model compilation, Amazon SageMaker needs your permission to:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Read input data from an S3 bucket
     * </p>
     * </li>
     * <li>
     * <p>
     * Write model artifacts to an S3 bucket
     * </p>
     * </li>
     * <li>
     * <p>
     * Write logs to Amazon CloudWatch Logs
     * </p>
     * </li>
     * <li>
     * <p>
     * Publish metrics to Amazon CloudWatch
     * </p>
     * </li>
     * </ul>
     * <p>
     * You grant permissions for all of these tasks to an IAM role. To pass this
     * role to Amazon SageMaker, the caller of this API must have the
     * <code>iam:PassRole</code> permission. For more information, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-roles.html"
     * >Amazon SageMaker Roles.</a>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>^arn:aws[a-z\-]*:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+$<br/>
     *
     * @param roleArn <p>
     *            The Amazon Resource Name (ARN) of an IAM role that enables
     *            Amazon SageMaker to perform tasks on your behalf.
     *            </p>
     *            <p>
     *            During model compilation, Amazon SageMaker needs your
     *            permission to:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Read input data from an S3 bucket
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Write model artifacts to an S3 bucket
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Write logs to Amazon CloudWatch Logs
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Publish metrics to Amazon CloudWatch
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            You grant permissions for all of these tasks to an IAM role.
     *            To pass this role to Amazon SageMaker, the caller of this API
     *            must have the <code>iam:PassRole</code> permission. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-roles.html"
     *            >Amazon SageMaker Roles.</a>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCompilationJobRequest withRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * <p>
     * Provides information about the location of input model artifacts, the
     * name and shape of the expected data inputs, and the framework in which
     * the model was trained.
     * </p>
     *
     * @return <p>
     *         Provides information about the location of input model artifacts,
     *         the name and shape of the expected data inputs, and the framework
     *         in which the model was trained.
     *         </p>
     */
    public InputConfig getInputConfig() {
        return inputConfig;
    }

    /**
     * <p>
     * Provides information about the location of input model artifacts, the
     * name and shape of the expected data inputs, and the framework in which
     * the model was trained.
     * </p>
     *
     * @param inputConfig <p>
     *            Provides information about the location of input model
     *            artifacts, the name and shape of the expected data inputs, and
     *            the framework in which the model was trained.
     *            </p>
     */
    public void setInputConfig(InputConfig inputConfig) {
        this.inputConfig = inputConfig;
    }

    /**
     * <p>
     * Provides information about the location of input model artifacts, the
     * name and shape of the expected data inputs, and the framework in which
     * the model was trained.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inputConfig <p>
     *            Provides information about the location of input model
     *            artifacts, the name and shape of the expected data inputs, and
     *            the framework in which the model was trained.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCompilationJobRequest withInputConfig(InputConfig inputConfig) {
        this.inputConfig = inputConfig;
        return this;
    }

    /**
     * <p>
     * Provides information about the output location for the compiled model and
     * the target device the model runs on.
     * </p>
     *
     * @return <p>
     *         Provides information about the output location for the compiled
     *         model and the target device the model runs on.
     *         </p>
     */
    public OutputConfig getOutputConfig() {
        return outputConfig;
    }

    /**
     * <p>
     * Provides information about the output location for the compiled model and
     * the target device the model runs on.
     * </p>
     *
     * @param outputConfig <p>
     *            Provides information about the output location for the
     *            compiled model and the target device the model runs on.
     *            </p>
     */
    public void setOutputConfig(OutputConfig outputConfig) {
        this.outputConfig = outputConfig;
    }

    /**
     * <p>
     * Provides information about the output location for the compiled model and
     * the target device the model runs on.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param outputConfig <p>
     *            Provides information about the output location for the
     *            compiled model and the target device the model runs on.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCompilationJobRequest withOutputConfig(OutputConfig outputConfig) {
        this.outputConfig = outputConfig;
        return this;
    }

    /**
     * <p>
     * Specifies a limit to how long a model compilation job can run. When the
     * job reaches the time limit, Amazon SageMaker ends the compilation job.
     * Use this API to cap model training costs.
     * </p>
     *
     * @return <p>
     *         Specifies a limit to how long a model compilation job can run.
     *         When the job reaches the time limit, Amazon SageMaker ends the
     *         compilation job. Use this API to cap model training costs.
     *         </p>
     */
    public StoppingCondition getStoppingCondition() {
        return stoppingCondition;
    }

    /**
     * <p>
     * Specifies a limit to how long a model compilation job can run. When the
     * job reaches the time limit, Amazon SageMaker ends the compilation job.
     * Use this API to cap model training costs.
     * </p>
     *
     * @param stoppingCondition <p>
     *            Specifies a limit to how long a model compilation job can run.
     *            When the job reaches the time limit, Amazon SageMaker ends the
     *            compilation job. Use this API to cap model training costs.
     *            </p>
     */
    public void setStoppingCondition(StoppingCondition stoppingCondition) {
        this.stoppingCondition = stoppingCondition;
    }

    /**
     * <p>
     * Specifies a limit to how long a model compilation job can run. When the
     * job reaches the time limit, Amazon SageMaker ends the compilation job.
     * Use this API to cap model training costs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stoppingCondition <p>
     *            Specifies a limit to how long a model compilation job can run.
     *            When the job reaches the time limit, Amazon SageMaker ends the
     *            compilation job. Use this API to cap model training costs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCompilationJobRequest withStoppingCondition(StoppingCondition stoppingCondition) {
        this.stoppingCondition = stoppingCondition;
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
        if (getCompilationJobName() != null)
            sb.append("CompilationJobName: " + getCompilationJobName() + ",");
        if (getRoleArn() != null)
            sb.append("RoleArn: " + getRoleArn() + ",");
        if (getInputConfig() != null)
            sb.append("InputConfig: " + getInputConfig() + ",");
        if (getOutputConfig() != null)
            sb.append("OutputConfig: " + getOutputConfig() + ",");
        if (getStoppingCondition() != null)
            sb.append("StoppingCondition: " + getStoppingCondition());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCompilationJobName() == null) ? 0 : getCompilationJobName().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode
                + ((getInputConfig() == null) ? 0 : getInputConfig().hashCode());
        hashCode = prime * hashCode
                + ((getOutputConfig() == null) ? 0 : getOutputConfig().hashCode());
        hashCode = prime * hashCode
                + ((getStoppingCondition() == null) ? 0 : getStoppingCondition().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateCompilationJobRequest == false)
            return false;
        CreateCompilationJobRequest other = (CreateCompilationJobRequest) obj;

        if (other.getCompilationJobName() == null ^ this.getCompilationJobName() == null)
            return false;
        if (other.getCompilationJobName() != null
                && other.getCompilationJobName().equals(this.getCompilationJobName()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getInputConfig() == null ^ this.getInputConfig() == null)
            return false;
        if (other.getInputConfig() != null
                && other.getInputConfig().equals(this.getInputConfig()) == false)
            return false;
        if (other.getOutputConfig() == null ^ this.getOutputConfig() == null)
            return false;
        if (other.getOutputConfig() != null
                && other.getOutputConfig().equals(this.getOutputConfig()) == false)
            return false;
        if (other.getStoppingCondition() == null ^ this.getStoppingCondition() == null)
            return false;
        if (other.getStoppingCondition() != null
                && other.getStoppingCondition().equals(this.getStoppingCondition()) == false)
            return false;
        return true;
    }
}
