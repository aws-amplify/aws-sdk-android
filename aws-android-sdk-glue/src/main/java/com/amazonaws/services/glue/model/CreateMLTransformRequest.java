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

package com.amazonaws.services.glue.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates an AWS Glue machine learning transform. This operation creates the
 * transform and all the necessary parameters to train it.
 * </p>
 * <p>
 * Call this operation as the first step in the process of using a machine
 * learning transform (such as the <code>FindMatches</code> transform) for
 * deduplicating data. You can provide an optional <code>Description</code>, in
 * addition to the parameters that you want to use for your algorithm.
 * </p>
 * <p>
 * You must also specify certain parameters for the tasks that AWS Glue runs on
 * your behalf as part of learning from your data and creating a high-quality
 * machine learning transform. These parameters include <code>Role</code>, and
 * optionally, <code>AllocatedCapacity</code>, <code>Timeout</code>, and
 * <code>MaxRetries</code>. For more information, see <a href=
 * "https://docs.aws.amazon.com/glue/latest/dg/aws-glue-api-jobs-job.html"
 * >Jobs</a>.
 * </p>
 */
public class CreateMLTransformRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The unique name that you give the transform when you create it.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     */
    private String name;

    /**
     * <p>
     * A description of the machine learning transform that is being defined.
     * The default is an empty string.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String description;

    /**
     * <p>
     * A list of AWS Glue table definitions used by the transform.
     * </p>
     */
    private java.util.List<GlueTable> inputRecordTables;

    /**
     * <p>
     * The algorithmic parameters that are specific to the transform type used.
     * Conditionally dependent on the transform type.
     * </p>
     */
    private TransformParameters parameters;

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the IAM role with the required
     * permissions. The required permissions include both AWS Glue service role
     * permissions to AWS Glue resources, and Amazon S3 permissions required by
     * the transform.
     * </p>
     * <ul>
     * <li>
     * <p>
     * This role needs AWS Glue service role permissions to allow access to
     * resources in AWS Glue. See <a href=
     * "https://docs.aws.amazon.com/glue/latest/dg/attach-policy-iam-user.html"
     * >Attach a Policy to IAM Users That Access AWS Glue</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * This role needs permission to your Amazon Simple Storage Service (Amazon
     * S3) sources, targets, temporary directory, scripts, and any libraries
     * used by the task run for this transform.
     * </p>
     * </li>
     * </ul>
     */
    private String role;

    /**
     * <p>
     * This value determines which version of AWS Glue this machine learning
     * transform is compatible with. Glue 1.0 is recommended for most customers.
     * If the value is not set, the Glue compatibility defaults to Glue 0.9. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/glue/latest/dg/release-notes.html#release-notes-versions"
     * >AWS Glue Versions</a> in the developer guide.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^\w+\.\w+$<br/>
     */
    private String glueVersion;

    /**
     * <p>
     * The number of AWS Glue data processing units (DPUs) that are allocated to
     * task runs for this transform. You can allocate from 2 to 100 DPUs; the
     * default is 10. A DPU is a relative measure of processing power that
     * consists of 4 vCPUs of compute capacity and 16 GB of memory. For more
     * information, see the <a href="https://aws.amazon.com/glue/pricing/">AWS
     * Glue pricing page</a>.
     * </p>
     * <p>
     * <code>MaxCapacity</code> is a mutually exclusive option with
     * <code>NumberOfWorkers</code> and <code>WorkerType</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If either <code>NumberOfWorkers</code> or <code>WorkerType</code> is set,
     * then <code>MaxCapacity</code> cannot be set.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>MaxCapacity</code> is set then neither
     * <code>NumberOfWorkers</code> or <code>WorkerType</code> can be set.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>WorkerType</code> is set, then <code>NumberOfWorkers</code> is
     * required (and vice versa).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MaxCapacity</code> and <code>NumberOfWorkers</code> must both be at
     * least 1.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When the <code>WorkerType</code> field is set to a value other than
     * <code>Standard</code>, the <code>MaxCapacity</code> field is set
     * automatically and becomes read-only.
     * </p>
     * <p>
     * When the <code>WorkerType</code> field is set to a value other than
     * <code>Standard</code>, the <code>MaxCapacity</code> field is set
     * automatically and becomes read-only.
     * </p>
     */
    private Double maxCapacity;

    /**
     * <p>
     * The type of predefined worker that is allocated when this task runs.
     * Accepts a value of Standard, G.1X, or G.2X.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For the <code>Standard</code> worker type, each worker provides 4 vCPU,
     * 16 GB of memory and a 50GB disk, and 2 executors per worker.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.1X</code> worker type, each worker provides 4 vCPU, 16 GB
     * of memory and a 64GB disk, and 1 executor per worker.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.2X</code> worker type, each worker provides 8 vCPU, 32 GB
     * of memory and a 128GB disk, and 1 executor per worker.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>MaxCapacity</code> is a mutually exclusive option with
     * <code>NumberOfWorkers</code> and <code>WorkerType</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If either <code>NumberOfWorkers</code> or <code>WorkerType</code> is set,
     * then <code>MaxCapacity</code> cannot be set.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>MaxCapacity</code> is set then neither
     * <code>NumberOfWorkers</code> or <code>WorkerType</code> can be set.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>WorkerType</code> is set, then <code>NumberOfWorkers</code> is
     * required (and vice versa).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MaxCapacity</code> and <code>NumberOfWorkers</code> must both be at
     * least 1.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Standard, G.1X, G.2X
     */
    private String workerType;

    /**
     * <p>
     * The number of workers of a defined <code>workerType</code> that are
     * allocated when this task runs.
     * </p>
     * <p>
     * If <code>WorkerType</code> is set, then <code>NumberOfWorkers</code> is
     * required (and vice versa).
     * </p>
     */
    private Integer numberOfWorkers;

    /**
     * <p>
     * The timeout of the task run for this transform in minutes. This is the
     * maximum time that a task run for this transform can consume resources
     * before it is terminated and enters <code>TIMEOUT</code> status. The
     * default is 2,880 minutes (48 hours).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Integer timeout;

    /**
     * <p>
     * The maximum number of times to retry a task for this transform after a
     * task run fails.
     * </p>
     */
    private Integer maxRetries;

    /**
     * <p>
     * The tags to use with this machine learning transform. You may use tags to
     * limit access to the machine learning transform. For more information
     * about tags in AWS Glue, see <a
     * href="https://docs.aws.amazon.com/glue/latest/dg/monitor-tags.html">AWS
     * Tags in AWS Glue</a> in the developer guide.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The unique name that you give the transform when you create it.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @return <p>
     *         The unique name that you give the transform when you create it.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The unique name that you give the transform when you create it.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param name <p>
     *            The unique name that you give the transform when you create
     *            it.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The unique name that you give the transform when you create it.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param name <p>
     *            The unique name that you give the transform when you create
     *            it.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateMLTransformRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * A description of the machine learning transform that is being defined.
     * The default is an empty string.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         A description of the machine learning transform that is being
     *         defined. The default is an empty string.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A description of the machine learning transform that is being defined.
     * The default is an empty string.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param description <p>
     *            A description of the machine learning transform that is being
     *            defined. The default is an empty string.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the machine learning transform that is being defined.
     * The default is an empty string.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param description <p>
     *            A description of the machine learning transform that is being
     *            defined. The default is an empty string.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateMLTransformRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * A list of AWS Glue table definitions used by the transform.
     * </p>
     *
     * @return <p>
     *         A list of AWS Glue table definitions used by the transform.
     *         </p>
     */
    public java.util.List<GlueTable> getInputRecordTables() {
        return inputRecordTables;
    }

    /**
     * <p>
     * A list of AWS Glue table definitions used by the transform.
     * </p>
     *
     * @param inputRecordTables <p>
     *            A list of AWS Glue table definitions used by the transform.
     *            </p>
     */
    public void setInputRecordTables(java.util.Collection<GlueTable> inputRecordTables) {
        if (inputRecordTables == null) {
            this.inputRecordTables = null;
            return;
        }

        this.inputRecordTables = new java.util.ArrayList<GlueTable>(inputRecordTables);
    }

    /**
     * <p>
     * A list of AWS Glue table definitions used by the transform.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inputRecordTables <p>
     *            A list of AWS Glue table definitions used by the transform.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateMLTransformRequest withInputRecordTables(GlueTable... inputRecordTables) {
        if (getInputRecordTables() == null) {
            this.inputRecordTables = new java.util.ArrayList<GlueTable>(inputRecordTables.length);
        }
        for (GlueTable value : inputRecordTables) {
            this.inputRecordTables.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of AWS Glue table definitions used by the transform.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inputRecordTables <p>
     *            A list of AWS Glue table definitions used by the transform.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateMLTransformRequest withInputRecordTables(
            java.util.Collection<GlueTable> inputRecordTables) {
        setInputRecordTables(inputRecordTables);
        return this;
    }

    /**
     * <p>
     * The algorithmic parameters that are specific to the transform type used.
     * Conditionally dependent on the transform type.
     * </p>
     *
     * @return <p>
     *         The algorithmic parameters that are specific to the transform
     *         type used. Conditionally dependent on the transform type.
     *         </p>
     */
    public TransformParameters getParameters() {
        return parameters;
    }

    /**
     * <p>
     * The algorithmic parameters that are specific to the transform type used.
     * Conditionally dependent on the transform type.
     * </p>
     *
     * @param parameters <p>
     *            The algorithmic parameters that are specific to the transform
     *            type used. Conditionally dependent on the transform type.
     *            </p>
     */
    public void setParameters(TransformParameters parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * The algorithmic parameters that are specific to the transform type used.
     * Conditionally dependent on the transform type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parameters <p>
     *            The algorithmic parameters that are specific to the transform
     *            type used. Conditionally dependent on the transform type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateMLTransformRequest withParameters(TransformParameters parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the IAM role with the required
     * permissions. The required permissions include both AWS Glue service role
     * permissions to AWS Glue resources, and Amazon S3 permissions required by
     * the transform.
     * </p>
     * <ul>
     * <li>
     * <p>
     * This role needs AWS Glue service role permissions to allow access to
     * resources in AWS Glue. See <a href=
     * "https://docs.aws.amazon.com/glue/latest/dg/attach-policy-iam-user.html"
     * >Attach a Policy to IAM Users That Access AWS Glue</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * This role needs permission to your Amazon Simple Storage Service (Amazon
     * S3) sources, targets, temporary directory, scripts, and any libraries
     * used by the task run for this transform.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The name or Amazon Resource Name (ARN) of the IAM role with the
     *         required permissions. The required permissions include both AWS
     *         Glue service role permissions to AWS Glue resources, and Amazon
     *         S3 permissions required by the transform.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         This role needs AWS Glue service role permissions to allow access
     *         to resources in AWS Glue. See <a href=
     *         "https://docs.aws.amazon.com/glue/latest/dg/attach-policy-iam-user.html"
     *         >Attach a Policy to IAM Users That Access AWS Glue</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         This role needs permission to your Amazon Simple Storage Service
     *         (Amazon S3) sources, targets, temporary directory, scripts, and
     *         any libraries used by the task run for this transform.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getRole() {
        return role;
    }

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the IAM role with the required
     * permissions. The required permissions include both AWS Glue service role
     * permissions to AWS Glue resources, and Amazon S3 permissions required by
     * the transform.
     * </p>
     * <ul>
     * <li>
     * <p>
     * This role needs AWS Glue service role permissions to allow access to
     * resources in AWS Glue. See <a href=
     * "https://docs.aws.amazon.com/glue/latest/dg/attach-policy-iam-user.html"
     * >Attach a Policy to IAM Users That Access AWS Glue</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * This role needs permission to your Amazon Simple Storage Service (Amazon
     * S3) sources, targets, temporary directory, scripts, and any libraries
     * used by the task run for this transform.
     * </p>
     * </li>
     * </ul>
     *
     * @param role <p>
     *            The name or Amazon Resource Name (ARN) of the IAM role with
     *            the required permissions. The required permissions include
     *            both AWS Glue service role permissions to AWS Glue resources,
     *            and Amazon S3 permissions required by the transform.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            This role needs AWS Glue service role permissions to allow
     *            access to resources in AWS Glue. See <a href=
     *            "https://docs.aws.amazon.com/glue/latest/dg/attach-policy-iam-user.html"
     *            >Attach a Policy to IAM Users That Access AWS Glue</a>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            This role needs permission to your Amazon Simple Storage
     *            Service (Amazon S3) sources, targets, temporary directory,
     *            scripts, and any libraries used by the task run for this
     *            transform.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setRole(String role) {
        this.role = role;
    }

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the IAM role with the required
     * permissions. The required permissions include both AWS Glue service role
     * permissions to AWS Glue resources, and Amazon S3 permissions required by
     * the transform.
     * </p>
     * <ul>
     * <li>
     * <p>
     * This role needs AWS Glue service role permissions to allow access to
     * resources in AWS Glue. See <a href=
     * "https://docs.aws.amazon.com/glue/latest/dg/attach-policy-iam-user.html"
     * >Attach a Policy to IAM Users That Access AWS Glue</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * This role needs permission to your Amazon Simple Storage Service (Amazon
     * S3) sources, targets, temporary directory, scripts, and any libraries
     * used by the task run for this transform.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param role <p>
     *            The name or Amazon Resource Name (ARN) of the IAM role with
     *            the required permissions. The required permissions include
     *            both AWS Glue service role permissions to AWS Glue resources,
     *            and Amazon S3 permissions required by the transform.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            This role needs AWS Glue service role permissions to allow
     *            access to resources in AWS Glue. See <a href=
     *            "https://docs.aws.amazon.com/glue/latest/dg/attach-policy-iam-user.html"
     *            >Attach a Policy to IAM Users That Access AWS Glue</a>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            This role needs permission to your Amazon Simple Storage
     *            Service (Amazon S3) sources, targets, temporary directory,
     *            scripts, and any libraries used by the task run for this
     *            transform.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateMLTransformRequest withRole(String role) {
        this.role = role;
        return this;
    }

    /**
     * <p>
     * This value determines which version of AWS Glue this machine learning
     * transform is compatible with. Glue 1.0 is recommended for most customers.
     * If the value is not set, the Glue compatibility defaults to Glue 0.9. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/glue/latest/dg/release-notes.html#release-notes-versions"
     * >AWS Glue Versions</a> in the developer guide.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^\w+\.\w+$<br/>
     *
     * @return <p>
     *         This value determines which version of AWS Glue this machine
     *         learning transform is compatible with. Glue 1.0 is recommended
     *         for most customers. If the value is not set, the Glue
     *         compatibility defaults to Glue 0.9. For more information, see <a
     *         href=
     *         "https://docs.aws.amazon.com/glue/latest/dg/release-notes.html#release-notes-versions"
     *         >AWS Glue Versions</a> in the developer guide.
     *         </p>
     */
    public String getGlueVersion() {
        return glueVersion;
    }

    /**
     * <p>
     * This value determines which version of AWS Glue this machine learning
     * transform is compatible with. Glue 1.0 is recommended for most customers.
     * If the value is not set, the Glue compatibility defaults to Glue 0.9. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/glue/latest/dg/release-notes.html#release-notes-versions"
     * >AWS Glue Versions</a> in the developer guide.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^\w+\.\w+$<br/>
     *
     * @param glueVersion <p>
     *            This value determines which version of AWS Glue this machine
     *            learning transform is compatible with. Glue 1.0 is recommended
     *            for most customers. If the value is not set, the Glue
     *            compatibility defaults to Glue 0.9. For more information, see
     *            <a href=
     *            "https://docs.aws.amazon.com/glue/latest/dg/release-notes.html#release-notes-versions"
     *            >AWS Glue Versions</a> in the developer guide.
     *            </p>
     */
    public void setGlueVersion(String glueVersion) {
        this.glueVersion = glueVersion;
    }

    /**
     * <p>
     * This value determines which version of AWS Glue this machine learning
     * transform is compatible with. Glue 1.0 is recommended for most customers.
     * If the value is not set, the Glue compatibility defaults to Glue 0.9. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/glue/latest/dg/release-notes.html#release-notes-versions"
     * >AWS Glue Versions</a> in the developer guide.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^\w+\.\w+$<br/>
     *
     * @param glueVersion <p>
     *            This value determines which version of AWS Glue this machine
     *            learning transform is compatible with. Glue 1.0 is recommended
     *            for most customers. If the value is not set, the Glue
     *            compatibility defaults to Glue 0.9. For more information, see
     *            <a href=
     *            "https://docs.aws.amazon.com/glue/latest/dg/release-notes.html#release-notes-versions"
     *            >AWS Glue Versions</a> in the developer guide.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateMLTransformRequest withGlueVersion(String glueVersion) {
        this.glueVersion = glueVersion;
        return this;
    }

    /**
     * <p>
     * The number of AWS Glue data processing units (DPUs) that are allocated to
     * task runs for this transform. You can allocate from 2 to 100 DPUs; the
     * default is 10. A DPU is a relative measure of processing power that
     * consists of 4 vCPUs of compute capacity and 16 GB of memory. For more
     * information, see the <a href="https://aws.amazon.com/glue/pricing/">AWS
     * Glue pricing page</a>.
     * </p>
     * <p>
     * <code>MaxCapacity</code> is a mutually exclusive option with
     * <code>NumberOfWorkers</code> and <code>WorkerType</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If either <code>NumberOfWorkers</code> or <code>WorkerType</code> is set,
     * then <code>MaxCapacity</code> cannot be set.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>MaxCapacity</code> is set then neither
     * <code>NumberOfWorkers</code> or <code>WorkerType</code> can be set.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>WorkerType</code> is set, then <code>NumberOfWorkers</code> is
     * required (and vice versa).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MaxCapacity</code> and <code>NumberOfWorkers</code> must both be at
     * least 1.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When the <code>WorkerType</code> field is set to a value other than
     * <code>Standard</code>, the <code>MaxCapacity</code> field is set
     * automatically and becomes read-only.
     * </p>
     * <p>
     * When the <code>WorkerType</code> field is set to a value other than
     * <code>Standard</code>, the <code>MaxCapacity</code> field is set
     * automatically and becomes read-only.
     * </p>
     *
     * @return <p>
     *         The number of AWS Glue data processing units (DPUs) that are
     *         allocated to task runs for this transform. You can allocate from
     *         2 to 100 DPUs; the default is 10. A DPU is a relative measure of
     *         processing power that consists of 4 vCPUs of compute capacity and
     *         16 GB of memory. For more information, see the <a
     *         href="https://aws.amazon.com/glue/pricing/">AWS Glue pricing
     *         page</a>.
     *         </p>
     *         <p>
     *         <code>MaxCapacity</code> is a mutually exclusive option with
     *         <code>NumberOfWorkers</code> and <code>WorkerType</code>.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If either <code>NumberOfWorkers</code> or <code>WorkerType</code>
     *         is set, then <code>MaxCapacity</code> cannot be set.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If <code>MaxCapacity</code> is set then neither
     *         <code>NumberOfWorkers</code> or <code>WorkerType</code> can be
     *         set.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If <code>WorkerType</code> is set, then
     *         <code>NumberOfWorkers</code> is required (and vice versa).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MaxCapacity</code> and <code>NumberOfWorkers</code> must
     *         both be at least 1.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         When the <code>WorkerType</code> field is set to a value other
     *         than <code>Standard</code>, the <code>MaxCapacity</code> field is
     *         set automatically and becomes read-only.
     *         </p>
     *         <p>
     *         When the <code>WorkerType</code> field is set to a value other
     *         than <code>Standard</code>, the <code>MaxCapacity</code> field is
     *         set automatically and becomes read-only.
     *         </p>
     */
    public Double getMaxCapacity() {
        return maxCapacity;
    }

    /**
     * <p>
     * The number of AWS Glue data processing units (DPUs) that are allocated to
     * task runs for this transform. You can allocate from 2 to 100 DPUs; the
     * default is 10. A DPU is a relative measure of processing power that
     * consists of 4 vCPUs of compute capacity and 16 GB of memory. For more
     * information, see the <a href="https://aws.amazon.com/glue/pricing/">AWS
     * Glue pricing page</a>.
     * </p>
     * <p>
     * <code>MaxCapacity</code> is a mutually exclusive option with
     * <code>NumberOfWorkers</code> and <code>WorkerType</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If either <code>NumberOfWorkers</code> or <code>WorkerType</code> is set,
     * then <code>MaxCapacity</code> cannot be set.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>MaxCapacity</code> is set then neither
     * <code>NumberOfWorkers</code> or <code>WorkerType</code> can be set.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>WorkerType</code> is set, then <code>NumberOfWorkers</code> is
     * required (and vice versa).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MaxCapacity</code> and <code>NumberOfWorkers</code> must both be at
     * least 1.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When the <code>WorkerType</code> field is set to a value other than
     * <code>Standard</code>, the <code>MaxCapacity</code> field is set
     * automatically and becomes read-only.
     * </p>
     * <p>
     * When the <code>WorkerType</code> field is set to a value other than
     * <code>Standard</code>, the <code>MaxCapacity</code> field is set
     * automatically and becomes read-only.
     * </p>
     *
     * @param maxCapacity <p>
     *            The number of AWS Glue data processing units (DPUs) that are
     *            allocated to task runs for this transform. You can allocate
     *            from 2 to 100 DPUs; the default is 10. A DPU is a relative
     *            measure of processing power that consists of 4 vCPUs of
     *            compute capacity and 16 GB of memory. For more information,
     *            see the <a href="https://aws.amazon.com/glue/pricing/">AWS
     *            Glue pricing page</a>.
     *            </p>
     *            <p>
     *            <code>MaxCapacity</code> is a mutually exclusive option with
     *            <code>NumberOfWorkers</code> and <code>WorkerType</code>.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If either <code>NumberOfWorkers</code> or
     *            <code>WorkerType</code> is set, then <code>MaxCapacity</code>
     *            cannot be set.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If <code>MaxCapacity</code> is set then neither
     *            <code>NumberOfWorkers</code> or <code>WorkerType</code> can be
     *            set.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If <code>WorkerType</code> is set, then
     *            <code>NumberOfWorkers</code> is required (and vice versa).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>MaxCapacity</code> and <code>NumberOfWorkers</code> must
     *            both be at least 1.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            When the <code>WorkerType</code> field is set to a value other
     *            than <code>Standard</code>, the <code>MaxCapacity</code> field
     *            is set automatically and becomes read-only.
     *            </p>
     *            <p>
     *            When the <code>WorkerType</code> field is set to a value other
     *            than <code>Standard</code>, the <code>MaxCapacity</code> field
     *            is set automatically and becomes read-only.
     *            </p>
     */
    public void setMaxCapacity(Double maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    /**
     * <p>
     * The number of AWS Glue data processing units (DPUs) that are allocated to
     * task runs for this transform. You can allocate from 2 to 100 DPUs; the
     * default is 10. A DPU is a relative measure of processing power that
     * consists of 4 vCPUs of compute capacity and 16 GB of memory. For more
     * information, see the <a href="https://aws.amazon.com/glue/pricing/">AWS
     * Glue pricing page</a>.
     * </p>
     * <p>
     * <code>MaxCapacity</code> is a mutually exclusive option with
     * <code>NumberOfWorkers</code> and <code>WorkerType</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If either <code>NumberOfWorkers</code> or <code>WorkerType</code> is set,
     * then <code>MaxCapacity</code> cannot be set.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>MaxCapacity</code> is set then neither
     * <code>NumberOfWorkers</code> or <code>WorkerType</code> can be set.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>WorkerType</code> is set, then <code>NumberOfWorkers</code> is
     * required (and vice versa).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MaxCapacity</code> and <code>NumberOfWorkers</code> must both be at
     * least 1.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When the <code>WorkerType</code> field is set to a value other than
     * <code>Standard</code>, the <code>MaxCapacity</code> field is set
     * automatically and becomes read-only.
     * </p>
     * <p>
     * When the <code>WorkerType</code> field is set to a value other than
     * <code>Standard</code>, the <code>MaxCapacity</code> field is set
     * automatically and becomes read-only.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxCapacity <p>
     *            The number of AWS Glue data processing units (DPUs) that are
     *            allocated to task runs for this transform. You can allocate
     *            from 2 to 100 DPUs; the default is 10. A DPU is a relative
     *            measure of processing power that consists of 4 vCPUs of
     *            compute capacity and 16 GB of memory. For more information,
     *            see the <a href="https://aws.amazon.com/glue/pricing/">AWS
     *            Glue pricing page</a>.
     *            </p>
     *            <p>
     *            <code>MaxCapacity</code> is a mutually exclusive option with
     *            <code>NumberOfWorkers</code> and <code>WorkerType</code>.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If either <code>NumberOfWorkers</code> or
     *            <code>WorkerType</code> is set, then <code>MaxCapacity</code>
     *            cannot be set.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If <code>MaxCapacity</code> is set then neither
     *            <code>NumberOfWorkers</code> or <code>WorkerType</code> can be
     *            set.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If <code>WorkerType</code> is set, then
     *            <code>NumberOfWorkers</code> is required (and vice versa).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>MaxCapacity</code> and <code>NumberOfWorkers</code> must
     *            both be at least 1.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            When the <code>WorkerType</code> field is set to a value other
     *            than <code>Standard</code>, the <code>MaxCapacity</code> field
     *            is set automatically and becomes read-only.
     *            </p>
     *            <p>
     *            When the <code>WorkerType</code> field is set to a value other
     *            than <code>Standard</code>, the <code>MaxCapacity</code> field
     *            is set automatically and becomes read-only.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateMLTransformRequest withMaxCapacity(Double maxCapacity) {
        this.maxCapacity = maxCapacity;
        return this;
    }

    /**
     * <p>
     * The type of predefined worker that is allocated when this task runs.
     * Accepts a value of Standard, G.1X, or G.2X.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For the <code>Standard</code> worker type, each worker provides 4 vCPU,
     * 16 GB of memory and a 50GB disk, and 2 executors per worker.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.1X</code> worker type, each worker provides 4 vCPU, 16 GB
     * of memory and a 64GB disk, and 1 executor per worker.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.2X</code> worker type, each worker provides 8 vCPU, 32 GB
     * of memory and a 128GB disk, and 1 executor per worker.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>MaxCapacity</code> is a mutually exclusive option with
     * <code>NumberOfWorkers</code> and <code>WorkerType</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If either <code>NumberOfWorkers</code> or <code>WorkerType</code> is set,
     * then <code>MaxCapacity</code> cannot be set.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>MaxCapacity</code> is set then neither
     * <code>NumberOfWorkers</code> or <code>WorkerType</code> can be set.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>WorkerType</code> is set, then <code>NumberOfWorkers</code> is
     * required (and vice versa).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MaxCapacity</code> and <code>NumberOfWorkers</code> must both be at
     * least 1.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Standard, G.1X, G.2X
     *
     * @return <p>
     *         The type of predefined worker that is allocated when this task
     *         runs. Accepts a value of Standard, G.1X, or G.2X.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For the <code>Standard</code> worker type, each worker provides 4
     *         vCPU, 16 GB of memory and a 50GB disk, and 2 executors per
     *         worker.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For the <code>G.1X</code> worker type, each worker provides 4
     *         vCPU, 16 GB of memory and a 64GB disk, and 1 executor per worker.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For the <code>G.2X</code> worker type, each worker provides 8
     *         vCPU, 32 GB of memory and a 128GB disk, and 1 executor per
     *         worker.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <code>MaxCapacity</code> is a mutually exclusive option with
     *         <code>NumberOfWorkers</code> and <code>WorkerType</code>.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If either <code>NumberOfWorkers</code> or <code>WorkerType</code>
     *         is set, then <code>MaxCapacity</code> cannot be set.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If <code>MaxCapacity</code> is set then neither
     *         <code>NumberOfWorkers</code> or <code>WorkerType</code> can be
     *         set.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If <code>WorkerType</code> is set, then
     *         <code>NumberOfWorkers</code> is required (and vice versa).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MaxCapacity</code> and <code>NumberOfWorkers</code> must
     *         both be at least 1.
     *         </p>
     *         </li>
     *         </ul>
     * @see WorkerType
     */
    public String getWorkerType() {
        return workerType;
    }

    /**
     * <p>
     * The type of predefined worker that is allocated when this task runs.
     * Accepts a value of Standard, G.1X, or G.2X.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For the <code>Standard</code> worker type, each worker provides 4 vCPU,
     * 16 GB of memory and a 50GB disk, and 2 executors per worker.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.1X</code> worker type, each worker provides 4 vCPU, 16 GB
     * of memory and a 64GB disk, and 1 executor per worker.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.2X</code> worker type, each worker provides 8 vCPU, 32 GB
     * of memory and a 128GB disk, and 1 executor per worker.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>MaxCapacity</code> is a mutually exclusive option with
     * <code>NumberOfWorkers</code> and <code>WorkerType</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If either <code>NumberOfWorkers</code> or <code>WorkerType</code> is set,
     * then <code>MaxCapacity</code> cannot be set.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>MaxCapacity</code> is set then neither
     * <code>NumberOfWorkers</code> or <code>WorkerType</code> can be set.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>WorkerType</code> is set, then <code>NumberOfWorkers</code> is
     * required (and vice versa).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MaxCapacity</code> and <code>NumberOfWorkers</code> must both be at
     * least 1.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Standard, G.1X, G.2X
     *
     * @param workerType <p>
     *            The type of predefined worker that is allocated when this task
     *            runs. Accepts a value of Standard, G.1X, or G.2X.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            For the <code>Standard</code> worker type, each worker
     *            provides 4 vCPU, 16 GB of memory and a 50GB disk, and 2
     *            executors per worker.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For the <code>G.1X</code> worker type, each worker provides 4
     *            vCPU, 16 GB of memory and a 64GB disk, and 1 executor per
     *            worker.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For the <code>G.2X</code> worker type, each worker provides 8
     *            vCPU, 32 GB of memory and a 128GB disk, and 1 executor per
     *            worker.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            <code>MaxCapacity</code> is a mutually exclusive option with
     *            <code>NumberOfWorkers</code> and <code>WorkerType</code>.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If either <code>NumberOfWorkers</code> or
     *            <code>WorkerType</code> is set, then <code>MaxCapacity</code>
     *            cannot be set.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If <code>MaxCapacity</code> is set then neither
     *            <code>NumberOfWorkers</code> or <code>WorkerType</code> can be
     *            set.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If <code>WorkerType</code> is set, then
     *            <code>NumberOfWorkers</code> is required (and vice versa).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>MaxCapacity</code> and <code>NumberOfWorkers</code> must
     *            both be at least 1.
     *            </p>
     *            </li>
     *            </ul>
     * @see WorkerType
     */
    public void setWorkerType(String workerType) {
        this.workerType = workerType;
    }

    /**
     * <p>
     * The type of predefined worker that is allocated when this task runs.
     * Accepts a value of Standard, G.1X, or G.2X.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For the <code>Standard</code> worker type, each worker provides 4 vCPU,
     * 16 GB of memory and a 50GB disk, and 2 executors per worker.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.1X</code> worker type, each worker provides 4 vCPU, 16 GB
     * of memory and a 64GB disk, and 1 executor per worker.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.2X</code> worker type, each worker provides 8 vCPU, 32 GB
     * of memory and a 128GB disk, and 1 executor per worker.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>MaxCapacity</code> is a mutually exclusive option with
     * <code>NumberOfWorkers</code> and <code>WorkerType</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If either <code>NumberOfWorkers</code> or <code>WorkerType</code> is set,
     * then <code>MaxCapacity</code> cannot be set.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>MaxCapacity</code> is set then neither
     * <code>NumberOfWorkers</code> or <code>WorkerType</code> can be set.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>WorkerType</code> is set, then <code>NumberOfWorkers</code> is
     * required (and vice versa).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MaxCapacity</code> and <code>NumberOfWorkers</code> must both be at
     * least 1.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Standard, G.1X, G.2X
     *
     * @param workerType <p>
     *            The type of predefined worker that is allocated when this task
     *            runs. Accepts a value of Standard, G.1X, or G.2X.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            For the <code>Standard</code> worker type, each worker
     *            provides 4 vCPU, 16 GB of memory and a 50GB disk, and 2
     *            executors per worker.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For the <code>G.1X</code> worker type, each worker provides 4
     *            vCPU, 16 GB of memory and a 64GB disk, and 1 executor per
     *            worker.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For the <code>G.2X</code> worker type, each worker provides 8
     *            vCPU, 32 GB of memory and a 128GB disk, and 1 executor per
     *            worker.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            <code>MaxCapacity</code> is a mutually exclusive option with
     *            <code>NumberOfWorkers</code> and <code>WorkerType</code>.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If either <code>NumberOfWorkers</code> or
     *            <code>WorkerType</code> is set, then <code>MaxCapacity</code>
     *            cannot be set.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If <code>MaxCapacity</code> is set then neither
     *            <code>NumberOfWorkers</code> or <code>WorkerType</code> can be
     *            set.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If <code>WorkerType</code> is set, then
     *            <code>NumberOfWorkers</code> is required (and vice versa).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>MaxCapacity</code> and <code>NumberOfWorkers</code> must
     *            both be at least 1.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see WorkerType
     */
    public CreateMLTransformRequest withWorkerType(String workerType) {
        this.workerType = workerType;
        return this;
    }

    /**
     * <p>
     * The type of predefined worker that is allocated when this task runs.
     * Accepts a value of Standard, G.1X, or G.2X.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For the <code>Standard</code> worker type, each worker provides 4 vCPU,
     * 16 GB of memory and a 50GB disk, and 2 executors per worker.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.1X</code> worker type, each worker provides 4 vCPU, 16 GB
     * of memory and a 64GB disk, and 1 executor per worker.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.2X</code> worker type, each worker provides 8 vCPU, 32 GB
     * of memory and a 128GB disk, and 1 executor per worker.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>MaxCapacity</code> is a mutually exclusive option with
     * <code>NumberOfWorkers</code> and <code>WorkerType</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If either <code>NumberOfWorkers</code> or <code>WorkerType</code> is set,
     * then <code>MaxCapacity</code> cannot be set.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>MaxCapacity</code> is set then neither
     * <code>NumberOfWorkers</code> or <code>WorkerType</code> can be set.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>WorkerType</code> is set, then <code>NumberOfWorkers</code> is
     * required (and vice versa).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MaxCapacity</code> and <code>NumberOfWorkers</code> must both be at
     * least 1.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Standard, G.1X, G.2X
     *
     * @param workerType <p>
     *            The type of predefined worker that is allocated when this task
     *            runs. Accepts a value of Standard, G.1X, or G.2X.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            For the <code>Standard</code> worker type, each worker
     *            provides 4 vCPU, 16 GB of memory and a 50GB disk, and 2
     *            executors per worker.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For the <code>G.1X</code> worker type, each worker provides 4
     *            vCPU, 16 GB of memory and a 64GB disk, and 1 executor per
     *            worker.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For the <code>G.2X</code> worker type, each worker provides 8
     *            vCPU, 32 GB of memory and a 128GB disk, and 1 executor per
     *            worker.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            <code>MaxCapacity</code> is a mutually exclusive option with
     *            <code>NumberOfWorkers</code> and <code>WorkerType</code>.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If either <code>NumberOfWorkers</code> or
     *            <code>WorkerType</code> is set, then <code>MaxCapacity</code>
     *            cannot be set.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If <code>MaxCapacity</code> is set then neither
     *            <code>NumberOfWorkers</code> or <code>WorkerType</code> can be
     *            set.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If <code>WorkerType</code> is set, then
     *            <code>NumberOfWorkers</code> is required (and vice versa).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>MaxCapacity</code> and <code>NumberOfWorkers</code> must
     *            both be at least 1.
     *            </p>
     *            </li>
     *            </ul>
     * @see WorkerType
     */
    public void setWorkerType(WorkerType workerType) {
        this.workerType = workerType.toString();
    }

    /**
     * <p>
     * The type of predefined worker that is allocated when this task runs.
     * Accepts a value of Standard, G.1X, or G.2X.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For the <code>Standard</code> worker type, each worker provides 4 vCPU,
     * 16 GB of memory and a 50GB disk, and 2 executors per worker.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.1X</code> worker type, each worker provides 4 vCPU, 16 GB
     * of memory and a 64GB disk, and 1 executor per worker.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.2X</code> worker type, each worker provides 8 vCPU, 32 GB
     * of memory and a 128GB disk, and 1 executor per worker.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>MaxCapacity</code> is a mutually exclusive option with
     * <code>NumberOfWorkers</code> and <code>WorkerType</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If either <code>NumberOfWorkers</code> or <code>WorkerType</code> is set,
     * then <code>MaxCapacity</code> cannot be set.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>MaxCapacity</code> is set then neither
     * <code>NumberOfWorkers</code> or <code>WorkerType</code> can be set.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>WorkerType</code> is set, then <code>NumberOfWorkers</code> is
     * required (and vice versa).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MaxCapacity</code> and <code>NumberOfWorkers</code> must both be at
     * least 1.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Standard, G.1X, G.2X
     *
     * @param workerType <p>
     *            The type of predefined worker that is allocated when this task
     *            runs. Accepts a value of Standard, G.1X, or G.2X.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            For the <code>Standard</code> worker type, each worker
     *            provides 4 vCPU, 16 GB of memory and a 50GB disk, and 2
     *            executors per worker.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For the <code>G.1X</code> worker type, each worker provides 4
     *            vCPU, 16 GB of memory and a 64GB disk, and 1 executor per
     *            worker.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For the <code>G.2X</code> worker type, each worker provides 8
     *            vCPU, 32 GB of memory and a 128GB disk, and 1 executor per
     *            worker.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            <code>MaxCapacity</code> is a mutually exclusive option with
     *            <code>NumberOfWorkers</code> and <code>WorkerType</code>.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If either <code>NumberOfWorkers</code> or
     *            <code>WorkerType</code> is set, then <code>MaxCapacity</code>
     *            cannot be set.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If <code>MaxCapacity</code> is set then neither
     *            <code>NumberOfWorkers</code> or <code>WorkerType</code> can be
     *            set.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If <code>WorkerType</code> is set, then
     *            <code>NumberOfWorkers</code> is required (and vice versa).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>MaxCapacity</code> and <code>NumberOfWorkers</code> must
     *            both be at least 1.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see WorkerType
     */
    public CreateMLTransformRequest withWorkerType(WorkerType workerType) {
        this.workerType = workerType.toString();
        return this;
    }

    /**
     * <p>
     * The number of workers of a defined <code>workerType</code> that are
     * allocated when this task runs.
     * </p>
     * <p>
     * If <code>WorkerType</code> is set, then <code>NumberOfWorkers</code> is
     * required (and vice versa).
     * </p>
     *
     * @return <p>
     *         The number of workers of a defined <code>workerType</code> that
     *         are allocated when this task runs.
     *         </p>
     *         <p>
     *         If <code>WorkerType</code> is set, then
     *         <code>NumberOfWorkers</code> is required (and vice versa).
     *         </p>
     */
    public Integer getNumberOfWorkers() {
        return numberOfWorkers;
    }

    /**
     * <p>
     * The number of workers of a defined <code>workerType</code> that are
     * allocated when this task runs.
     * </p>
     * <p>
     * If <code>WorkerType</code> is set, then <code>NumberOfWorkers</code> is
     * required (and vice versa).
     * </p>
     *
     * @param numberOfWorkers <p>
     *            The number of workers of a defined <code>workerType</code>
     *            that are allocated when this task runs.
     *            </p>
     *            <p>
     *            If <code>WorkerType</code> is set, then
     *            <code>NumberOfWorkers</code> is required (and vice versa).
     *            </p>
     */
    public void setNumberOfWorkers(Integer numberOfWorkers) {
        this.numberOfWorkers = numberOfWorkers;
    }

    /**
     * <p>
     * The number of workers of a defined <code>workerType</code> that are
     * allocated when this task runs.
     * </p>
     * <p>
     * If <code>WorkerType</code> is set, then <code>NumberOfWorkers</code> is
     * required (and vice versa).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param numberOfWorkers <p>
     *            The number of workers of a defined <code>workerType</code>
     *            that are allocated when this task runs.
     *            </p>
     *            <p>
     *            If <code>WorkerType</code> is set, then
     *            <code>NumberOfWorkers</code> is required (and vice versa).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateMLTransformRequest withNumberOfWorkers(Integer numberOfWorkers) {
        this.numberOfWorkers = numberOfWorkers;
        return this;
    }

    /**
     * <p>
     * The timeout of the task run for this transform in minutes. This is the
     * maximum time that a task run for this transform can consume resources
     * before it is terminated and enters <code>TIMEOUT</code> status. The
     * default is 2,880 minutes (48 hours).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return <p>
     *         The timeout of the task run for this transform in minutes. This
     *         is the maximum time that a task run for this transform can
     *         consume resources before it is terminated and enters
     *         <code>TIMEOUT</code> status. The default is 2,880 minutes (48
     *         hours).
     *         </p>
     */
    public Integer getTimeout() {
        return timeout;
    }

    /**
     * <p>
     * The timeout of the task run for this transform in minutes. This is the
     * maximum time that a task run for this transform can consume resources
     * before it is terminated and enters <code>TIMEOUT</code> status. The
     * default is 2,880 minutes (48 hours).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param timeout <p>
     *            The timeout of the task run for this transform in minutes.
     *            This is the maximum time that a task run for this transform
     *            can consume resources before it is terminated and enters
     *            <code>TIMEOUT</code> status. The default is 2,880 minutes (48
     *            hours).
     *            </p>
     */
    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    /**
     * <p>
     * The timeout of the task run for this transform in minutes. This is the
     * maximum time that a task run for this transform can consume resources
     * before it is terminated and enters <code>TIMEOUT</code> status. The
     * default is 2,880 minutes (48 hours).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param timeout <p>
     *            The timeout of the task run for this transform in minutes.
     *            This is the maximum time that a task run for this transform
     *            can consume resources before it is terminated and enters
     *            <code>TIMEOUT</code> status. The default is 2,880 minutes (48
     *            hours).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateMLTransformRequest withTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * <p>
     * The maximum number of times to retry a task for this transform after a
     * task run fails.
     * </p>
     *
     * @return <p>
     *         The maximum number of times to retry a task for this transform
     *         after a task run fails.
     *         </p>
     */
    public Integer getMaxRetries() {
        return maxRetries;
    }

    /**
     * <p>
     * The maximum number of times to retry a task for this transform after a
     * task run fails.
     * </p>
     *
     * @param maxRetries <p>
     *            The maximum number of times to retry a task for this transform
     *            after a task run fails.
     *            </p>
     */
    public void setMaxRetries(Integer maxRetries) {
        this.maxRetries = maxRetries;
    }

    /**
     * <p>
     * The maximum number of times to retry a task for this transform after a
     * task run fails.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxRetries <p>
     *            The maximum number of times to retry a task for this transform
     *            after a task run fails.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateMLTransformRequest withMaxRetries(Integer maxRetries) {
        this.maxRetries = maxRetries;
        return this;
    }

    /**
     * <p>
     * The tags to use with this machine learning transform. You may use tags to
     * limit access to the machine learning transform. For more information
     * about tags in AWS Glue, see <a
     * href="https://docs.aws.amazon.com/glue/latest/dg/monitor-tags.html">AWS
     * Tags in AWS Glue</a> in the developer guide.
     * </p>
     *
     * @return <p>
     *         The tags to use with this machine learning transform. You may use
     *         tags to limit access to the machine learning transform. For more
     *         information about tags in AWS Glue, see <a href=
     *         "https://docs.aws.amazon.com/glue/latest/dg/monitor-tags.html"
     *         >AWS Tags in AWS Glue</a> in the developer guide.
     *         </p>
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags to use with this machine learning transform. You may use tags to
     * limit access to the machine learning transform. For more information
     * about tags in AWS Glue, see <a
     * href="https://docs.aws.amazon.com/glue/latest/dg/monitor-tags.html">AWS
     * Tags in AWS Glue</a> in the developer guide.
     * </p>
     *
     * @param tags <p>
     *            The tags to use with this machine learning transform. You may
     *            use tags to limit access to the machine learning transform.
     *            For more information about tags in AWS Glue, see <a href=
     *            "https://docs.aws.amazon.com/glue/latest/dg/monitor-tags.html"
     *            >AWS Tags in AWS Glue</a> in the developer guide.
     *            </p>
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags to use with this machine learning transform. You may use tags to
     * limit access to the machine learning transform. For more information
     * about tags in AWS Glue, see <a
     * href="https://docs.aws.amazon.com/glue/latest/dg/monitor-tags.html">AWS
     * Tags in AWS Glue</a> in the developer guide.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags to use with this machine learning transform. You may
     *            use tags to limit access to the machine learning transform.
     *            For more information about tags in AWS Glue, see <a href=
     *            "https://docs.aws.amazon.com/glue/latest/dg/monitor-tags.html"
     *            >AWS Tags in AWS Glue</a> in the developer guide.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateMLTransformRequest withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * <p>
     * The tags to use with this machine learning transform. You may use tags to
     * limit access to the machine learning transform. For more information
     * about tags in AWS Glue, see <a
     * href="https://docs.aws.amazon.com/glue/latest/dg/monitor-tags.html">AWS
     * Tags in AWS Glue</a> in the developer guide.
     * </p>
     * <p>
     * The method adds a new key-value pair into Tags parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into Tags.
     * @param value The corresponding value of the entry to be added into Tags.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateMLTransformRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public CreateMLTransformRequest clearTagsEntries() {
        this.tags = null;
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getInputRecordTables() != null)
            sb.append("InputRecordTables: " + getInputRecordTables() + ",");
        if (getParameters() != null)
            sb.append("Parameters: " + getParameters() + ",");
        if (getRole() != null)
            sb.append("Role: " + getRole() + ",");
        if (getGlueVersion() != null)
            sb.append("GlueVersion: " + getGlueVersion() + ",");
        if (getMaxCapacity() != null)
            sb.append("MaxCapacity: " + getMaxCapacity() + ",");
        if (getWorkerType() != null)
            sb.append("WorkerType: " + getWorkerType() + ",");
        if (getNumberOfWorkers() != null)
            sb.append("NumberOfWorkers: " + getNumberOfWorkers() + ",");
        if (getTimeout() != null)
            sb.append("Timeout: " + getTimeout() + ",");
        if (getMaxRetries() != null)
            sb.append("MaxRetries: " + getMaxRetries() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getInputRecordTables() == null) ? 0 : getInputRecordTables().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        hashCode = prime * hashCode + ((getRole() == null) ? 0 : getRole().hashCode());
        hashCode = prime * hashCode
                + ((getGlueVersion() == null) ? 0 : getGlueVersion().hashCode());
        hashCode = prime * hashCode
                + ((getMaxCapacity() == null) ? 0 : getMaxCapacity().hashCode());
        hashCode = prime * hashCode + ((getWorkerType() == null) ? 0 : getWorkerType().hashCode());
        hashCode = prime * hashCode
                + ((getNumberOfWorkers() == null) ? 0 : getNumberOfWorkers().hashCode());
        hashCode = prime * hashCode + ((getTimeout() == null) ? 0 : getTimeout().hashCode());
        hashCode = prime * hashCode + ((getMaxRetries() == null) ? 0 : getMaxRetries().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateMLTransformRequest == false)
            return false;
        CreateMLTransformRequest other = (CreateMLTransformRequest) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getInputRecordTables() == null ^ this.getInputRecordTables() == null)
            return false;
        if (other.getInputRecordTables() != null
                && other.getInputRecordTables().equals(this.getInputRecordTables()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null
                && other.getParameters().equals(this.getParameters()) == false)
            return false;
        if (other.getRole() == null ^ this.getRole() == null)
            return false;
        if (other.getRole() != null && other.getRole().equals(this.getRole()) == false)
            return false;
        if (other.getGlueVersion() == null ^ this.getGlueVersion() == null)
            return false;
        if (other.getGlueVersion() != null
                && other.getGlueVersion().equals(this.getGlueVersion()) == false)
            return false;
        if (other.getMaxCapacity() == null ^ this.getMaxCapacity() == null)
            return false;
        if (other.getMaxCapacity() != null
                && other.getMaxCapacity().equals(this.getMaxCapacity()) == false)
            return false;
        if (other.getWorkerType() == null ^ this.getWorkerType() == null)
            return false;
        if (other.getWorkerType() != null
                && other.getWorkerType().equals(this.getWorkerType()) == false)
            return false;
        if (other.getNumberOfWorkers() == null ^ this.getNumberOfWorkers() == null)
            return false;
        if (other.getNumberOfWorkers() != null
                && other.getNumberOfWorkers().equals(this.getNumberOfWorkers()) == false)
            return false;
        if (other.getTimeout() == null ^ this.getTimeout() == null)
            return false;
        if (other.getTimeout() != null && other.getTimeout().equals(this.getTimeout()) == false)
            return false;
        if (other.getMaxRetries() == null ^ this.getMaxRetries() == null)
            return false;
        if (other.getMaxRetries() != null
                && other.getMaxRetries().equals(this.getMaxRetries()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
