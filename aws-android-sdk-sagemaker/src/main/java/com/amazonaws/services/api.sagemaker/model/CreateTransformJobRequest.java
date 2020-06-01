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

package com.amazonaws.services.api.sagemaker.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Starts a transform job. A transform job uses a trained model to get
 * inferences on a dataset and saves these results to an Amazon S3 location that
 * you specify.
 * </p>
 * <p>
 * To perform batch transformations, you create a transform job and use the data
 * that you have readily available.
 * </p>
 * <p>
 * In the request body, you provide the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>TransformJobName</code> - Identifies the transform job. The name must
 * be unique within an AWS Region in an AWS account.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ModelName</code> - Identifies the model to use. <code>ModelName</code>
 * must be the name of an existing Amazon SageMaker model in the same AWS Region
 * and AWS account. For information on creating a model, see <a>CreateModel</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>TransformInput</code> - Describes the dataset to be transformed and the
 * Amazon S3 location where it is stored.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>TransformOutput</code> - Identifies the Amazon S3 location where you
 * want Amazon SageMaker to save the results from the transform job.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>TransformResources</code> - Identifies the ML compute instances for the
 * transform job.
 * </p>
 * </li>
 * </ul>
 * <p>
 * For more information about how batch transformation works, see <a
 * href="https://docs.aws.amazon.com/sagemaker/latest/dg/batch-transform.html"
 * >Batch Transform</a>.
 * </p>
 */
public class CreateTransformJobRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the transform job. The name must be unique within an AWS
     * Region in an AWS account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     */
    private String transformJobName;

    /**
     * <p>
     * The name of the model that you want to use for the transform job.
     * <code>ModelName</code> must be the name of an existing Amazon SageMaker
     * model within an AWS Region in an AWS account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     */
    private String modelName;

    /**
     * <p>
     * The maximum number of parallel requests that can be sent to each instance
     * in a transform job. If <code>MaxConcurrentTransforms</code> is set to
     * <code>0</code> or left unset, Amazon SageMaker checks the optional
     * execution-parameters to determine the settings for your chosen algorithm.
     * If the execution-parameters endpoint is not enabled, the default value is
     * <code>1</code>. For more information on execution-parameters, see <a
     * href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms-batch-code.html#your-algorithms-batch-code-how-containe-serves-requests"
     * >How Containers Serve Requests</a>. For built-in algorithms, you don't
     * need to set a value for <code>MaxConcurrentTransforms</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer maxConcurrentTransforms;

    /**
     * <p>
     * The maximum allowed size of the payload, in MB. A <i>payload</i> is the
     * data portion of a record (without metadata). The value in
     * <code>MaxPayloadInMB</code> must be greater than, or equal to, the size
     * of a single record. To estimate the size of a record in MB, divide the
     * size of your dataset by the number of records. To ensure that the records
     * fit within the maximum payload size, we recommend using a slightly larger
     * value. The default value is <code>6</code> MB.
     * </p>
     * <p>
     * For cases where the payload might be arbitrarily large and is transmitted
     * using HTTP chunked encoding, set the value to <code>0</code>. This
     * feature works only in supported algorithms. Currently, Amazon SageMaker
     * built-in algorithms do not support HTTP chunked encoding.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer maxPayloadInMB;

    /**
     * <p>
     * Specifies the number of records to include in a mini-batch for an HTTP
     * inference request. A <i>record</i> <i/> is a single unit of input data
     * that inference can be made on. For example, a single line in a CSV file
     * is a record.
     * </p>
     * <p>
     * To enable the batch strategy, you must set the <code>SplitType</code>
     * property to <code>Line</code>, <code>RecordIO</code>, or
     * <code>TFRecord</code>.
     * </p>
     * <p>
     * To use only one record when making an HTTP invocation request to a
     * container, set <code>BatchStrategy</code> to <code>SingleRecord</code>
     * and <code>SplitType</code> to <code>Line</code>.
     * </p>
     * <p>
     * To fit as many records in a mini-batch as can fit within the
     * <code>MaxPayloadInMB</code> limit, set <code>BatchStrategy</code> to
     * <code>MultiRecord</code> and <code>SplitType</code> to <code>Line</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MultiRecord, SingleRecord
     */
    private String batchStrategy;

    /**
     * <p>
     * The environment variables to set in the Docker container. We support up
     * to 16 key and values entries in the map.
     * </p>
     */
    private java.util.Map<String, String> environment;

    /**
     * <p>
     * Describes the input source and the way the transform job consumes it.
     * </p>
     */
    private TransformInput transformInput;

    /**
     * <p>
     * Describes the results of the transform job.
     * </p>
     */
    private TransformOutput transformOutput;

    /**
     * <p>
     * Describes the resources, including ML instance types and ML instance
     * count, to use for the transform job.
     * </p>
     */
    private TransformResources transformResources;

    /**
     * <p>
     * The data structure used to specify the data to be used for inference in a
     * batch transform job and to associate the data that is relevant to the
     * prediction results in the output. The input filter provided allows you to
     * exclude input data that is not needed for inference in a batch transform
     * job. The output filter provided allows you to include input data relevant
     * to interpreting the predictions in the output from the job. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/batch-transform-data-processing.html"
     * >Associate Prediction Results with their Corresponding Input Records</a>.
     * </p>
     */
    private DataProcessing dataProcessing;

    /**
     * <p>
     * (Optional) An array of key-value pairs. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what"
     * >Using Cost Allocation Tags</a> in the <i>AWS Billing and Cost Management
     * User Guide</i>.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * Configuration for the experiment.
     * </p>
     */
    private ExperimentConfig experimentConfig;

    /**
     * <p>
     * The name of the transform job. The name must be unique within an AWS
     * Region in an AWS account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @return <p>
     *         The name of the transform job. The name must be unique within an
     *         AWS Region in an AWS account.
     *         </p>
     */
    public String getTransformJobName() {
        return transformJobName;
    }

    /**
     * <p>
     * The name of the transform job. The name must be unique within an AWS
     * Region in an AWS account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param transformJobName <p>
     *            The name of the transform job. The name must be unique within
     *            an AWS Region in an AWS account.
     *            </p>
     */
    public void setTransformJobName(String transformJobName) {
        this.transformJobName = transformJobName;
    }

    /**
     * <p>
     * The name of the transform job. The name must be unique within an AWS
     * Region in an AWS account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param transformJobName <p>
     *            The name of the transform job. The name must be unique within
     *            an AWS Region in an AWS account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTransformJobRequest withTransformJobName(String transformJobName) {
        this.transformJobName = transformJobName;
        return this;
    }

    /**
     * <p>
     * The name of the model that you want to use for the transform job.
     * <code>ModelName</code> must be the name of an existing Amazon SageMaker
     * model within an AWS Region in an AWS account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @return <p>
     *         The name of the model that you want to use for the transform job.
     *         <code>ModelName</code> must be the name of an existing Amazon
     *         SageMaker model within an AWS Region in an AWS account.
     *         </p>
     */
    public String getModelName() {
        return modelName;
    }

    /**
     * <p>
     * The name of the model that you want to use for the transform job.
     * <code>ModelName</code> must be the name of an existing Amazon SageMaker
     * model within an AWS Region in an AWS account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param modelName <p>
     *            The name of the model that you want to use for the transform
     *            job. <code>ModelName</code> must be the name of an existing
     *            Amazon SageMaker model within an AWS Region in an AWS account.
     *            </p>
     */
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    /**
     * <p>
     * The name of the model that you want to use for the transform job.
     * <code>ModelName</code> must be the name of an existing Amazon SageMaker
     * model within an AWS Region in an AWS account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param modelName <p>
     *            The name of the model that you want to use for the transform
     *            job. <code>ModelName</code> must be the name of an existing
     *            Amazon SageMaker model within an AWS Region in an AWS account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTransformJobRequest withModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }

    /**
     * <p>
     * The maximum number of parallel requests that can be sent to each instance
     * in a transform job. If <code>MaxConcurrentTransforms</code> is set to
     * <code>0</code> or left unset, Amazon SageMaker checks the optional
     * execution-parameters to determine the settings for your chosen algorithm.
     * If the execution-parameters endpoint is not enabled, the default value is
     * <code>1</code>. For more information on execution-parameters, see <a
     * href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms-batch-code.html#your-algorithms-batch-code-how-containe-serves-requests"
     * >How Containers Serve Requests</a>. For built-in algorithms, you don't
     * need to set a value for <code>MaxConcurrentTransforms</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The maximum number of parallel requests that can be sent to each
     *         instance in a transform job. If
     *         <code>MaxConcurrentTransforms</code> is set to <code>0</code> or
     *         left unset, Amazon SageMaker checks the optional
     *         execution-parameters to determine the settings for your chosen
     *         algorithm. If the execution-parameters endpoint is not enabled,
     *         the default value is <code>1</code>. For more information on
     *         execution-parameters, see <a href=
     *         "https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms-batch-code.html#your-algorithms-batch-code-how-containe-serves-requests"
     *         >How Containers Serve Requests</a>. For built-in algorithms, you
     *         don't need to set a value for
     *         <code>MaxConcurrentTransforms</code>.
     *         </p>
     */
    public Integer getMaxConcurrentTransforms() {
        return maxConcurrentTransforms;
    }

    /**
     * <p>
     * The maximum number of parallel requests that can be sent to each instance
     * in a transform job. If <code>MaxConcurrentTransforms</code> is set to
     * <code>0</code> or left unset, Amazon SageMaker checks the optional
     * execution-parameters to determine the settings for your chosen algorithm.
     * If the execution-parameters endpoint is not enabled, the default value is
     * <code>1</code>. For more information on execution-parameters, see <a
     * href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms-batch-code.html#your-algorithms-batch-code-how-containe-serves-requests"
     * >How Containers Serve Requests</a>. For built-in algorithms, you don't
     * need to set a value for <code>MaxConcurrentTransforms</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param maxConcurrentTransforms <p>
     *            The maximum number of parallel requests that can be sent to
     *            each instance in a transform job. If
     *            <code>MaxConcurrentTransforms</code> is set to <code>0</code>
     *            or left unset, Amazon SageMaker checks the optional
     *            execution-parameters to determine the settings for your chosen
     *            algorithm. If the execution-parameters endpoint is not
     *            enabled, the default value is <code>1</code>. For more
     *            information on execution-parameters, see <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms-batch-code.html#your-algorithms-batch-code-how-containe-serves-requests"
     *            >How Containers Serve Requests</a>. For built-in algorithms,
     *            you don't need to set a value for
     *            <code>MaxConcurrentTransforms</code>.
     *            </p>
     */
    public void setMaxConcurrentTransforms(Integer maxConcurrentTransforms) {
        this.maxConcurrentTransforms = maxConcurrentTransforms;
    }

    /**
     * <p>
     * The maximum number of parallel requests that can be sent to each instance
     * in a transform job. If <code>MaxConcurrentTransforms</code> is set to
     * <code>0</code> or left unset, Amazon SageMaker checks the optional
     * execution-parameters to determine the settings for your chosen algorithm.
     * If the execution-parameters endpoint is not enabled, the default value is
     * <code>1</code>. For more information on execution-parameters, see <a
     * href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms-batch-code.html#your-algorithms-batch-code-how-containe-serves-requests"
     * >How Containers Serve Requests</a>. For built-in algorithms, you don't
     * need to set a value for <code>MaxConcurrentTransforms</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param maxConcurrentTransforms <p>
     *            The maximum number of parallel requests that can be sent to
     *            each instance in a transform job. If
     *            <code>MaxConcurrentTransforms</code> is set to <code>0</code>
     *            or left unset, Amazon SageMaker checks the optional
     *            execution-parameters to determine the settings for your chosen
     *            algorithm. If the execution-parameters endpoint is not
     *            enabled, the default value is <code>1</code>. For more
     *            information on execution-parameters, see <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms-batch-code.html#your-algorithms-batch-code-how-containe-serves-requests"
     *            >How Containers Serve Requests</a>. For built-in algorithms,
     *            you don't need to set a value for
     *            <code>MaxConcurrentTransforms</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTransformJobRequest withMaxConcurrentTransforms(Integer maxConcurrentTransforms) {
        this.maxConcurrentTransforms = maxConcurrentTransforms;
        return this;
    }

    /**
     * <p>
     * The maximum allowed size of the payload, in MB. A <i>payload</i> is the
     * data portion of a record (without metadata). The value in
     * <code>MaxPayloadInMB</code> must be greater than, or equal to, the size
     * of a single record. To estimate the size of a record in MB, divide the
     * size of your dataset by the number of records. To ensure that the records
     * fit within the maximum payload size, we recommend using a slightly larger
     * value. The default value is <code>6</code> MB.
     * </p>
     * <p>
     * For cases where the payload might be arbitrarily large and is transmitted
     * using HTTP chunked encoding, set the value to <code>0</code>. This
     * feature works only in supported algorithms. Currently, Amazon SageMaker
     * built-in algorithms do not support HTTP chunked encoding.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The maximum allowed size of the payload, in MB. A <i>payload</i>
     *         is the data portion of a record (without metadata). The value in
     *         <code>MaxPayloadInMB</code> must be greater than, or equal to,
     *         the size of a single record. To estimate the size of a record in
     *         MB, divide the size of your dataset by the number of records. To
     *         ensure that the records fit within the maximum payload size, we
     *         recommend using a slightly larger value. The default value is
     *         <code>6</code> MB.
     *         </p>
     *         <p>
     *         For cases where the payload might be arbitrarily large and is
     *         transmitted using HTTP chunked encoding, set the value to
     *         <code>0</code>. This feature works only in supported algorithms.
     *         Currently, Amazon SageMaker built-in algorithms do not support
     *         HTTP chunked encoding.
     *         </p>
     */
    public Integer getMaxPayloadInMB() {
        return maxPayloadInMB;
    }

    /**
     * <p>
     * The maximum allowed size of the payload, in MB. A <i>payload</i> is the
     * data portion of a record (without metadata). The value in
     * <code>MaxPayloadInMB</code> must be greater than, or equal to, the size
     * of a single record. To estimate the size of a record in MB, divide the
     * size of your dataset by the number of records. To ensure that the records
     * fit within the maximum payload size, we recommend using a slightly larger
     * value. The default value is <code>6</code> MB.
     * </p>
     * <p>
     * For cases where the payload might be arbitrarily large and is transmitted
     * using HTTP chunked encoding, set the value to <code>0</code>. This
     * feature works only in supported algorithms. Currently, Amazon SageMaker
     * built-in algorithms do not support HTTP chunked encoding.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param maxPayloadInMB <p>
     *            The maximum allowed size of the payload, in MB. A
     *            <i>payload</i> is the data portion of a record (without
     *            metadata). The value in <code>MaxPayloadInMB</code> must be
     *            greater than, or equal to, the size of a single record. To
     *            estimate the size of a record in MB, divide the size of your
     *            dataset by the number of records. To ensure that the records
     *            fit within the maximum payload size, we recommend using a
     *            slightly larger value. The default value is <code>6</code> MB.
     *            </p>
     *            <p>
     *            For cases where the payload might be arbitrarily large and is
     *            transmitted using HTTP chunked encoding, set the value to
     *            <code>0</code>. This feature works only in supported
     *            algorithms. Currently, Amazon SageMaker built-in algorithms do
     *            not support HTTP chunked encoding.
     *            </p>
     */
    public void setMaxPayloadInMB(Integer maxPayloadInMB) {
        this.maxPayloadInMB = maxPayloadInMB;
    }

    /**
     * <p>
     * The maximum allowed size of the payload, in MB. A <i>payload</i> is the
     * data portion of a record (without metadata). The value in
     * <code>MaxPayloadInMB</code> must be greater than, or equal to, the size
     * of a single record. To estimate the size of a record in MB, divide the
     * size of your dataset by the number of records. To ensure that the records
     * fit within the maximum payload size, we recommend using a slightly larger
     * value. The default value is <code>6</code> MB.
     * </p>
     * <p>
     * For cases where the payload might be arbitrarily large and is transmitted
     * using HTTP chunked encoding, set the value to <code>0</code>. This
     * feature works only in supported algorithms. Currently, Amazon SageMaker
     * built-in algorithms do not support HTTP chunked encoding.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param maxPayloadInMB <p>
     *            The maximum allowed size of the payload, in MB. A
     *            <i>payload</i> is the data portion of a record (without
     *            metadata). The value in <code>MaxPayloadInMB</code> must be
     *            greater than, or equal to, the size of a single record. To
     *            estimate the size of a record in MB, divide the size of your
     *            dataset by the number of records. To ensure that the records
     *            fit within the maximum payload size, we recommend using a
     *            slightly larger value. The default value is <code>6</code> MB.
     *            </p>
     *            <p>
     *            For cases where the payload might be arbitrarily large and is
     *            transmitted using HTTP chunked encoding, set the value to
     *            <code>0</code>. This feature works only in supported
     *            algorithms. Currently, Amazon SageMaker built-in algorithms do
     *            not support HTTP chunked encoding.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTransformJobRequest withMaxPayloadInMB(Integer maxPayloadInMB) {
        this.maxPayloadInMB = maxPayloadInMB;
        return this;
    }

    /**
     * <p>
     * Specifies the number of records to include in a mini-batch for an HTTP
     * inference request. A <i>record</i> <i/> is a single unit of input data
     * that inference can be made on. For example, a single line in a CSV file
     * is a record.
     * </p>
     * <p>
     * To enable the batch strategy, you must set the <code>SplitType</code>
     * property to <code>Line</code>, <code>RecordIO</code>, or
     * <code>TFRecord</code>.
     * </p>
     * <p>
     * To use only one record when making an HTTP invocation request to a
     * container, set <code>BatchStrategy</code> to <code>SingleRecord</code>
     * and <code>SplitType</code> to <code>Line</code>.
     * </p>
     * <p>
     * To fit as many records in a mini-batch as can fit within the
     * <code>MaxPayloadInMB</code> limit, set <code>BatchStrategy</code> to
     * <code>MultiRecord</code> and <code>SplitType</code> to <code>Line</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MultiRecord, SingleRecord
     *
     * @return <p>
     *         Specifies the number of records to include in a mini-batch for an
     *         HTTP inference request. A <i>record</i> <i/> is a single unit of
     *         input data that inference can be made on. For example, a single
     *         line in a CSV file is a record.
     *         </p>
     *         <p>
     *         To enable the batch strategy, you must set the
     *         <code>SplitType</code> property to <code>Line</code>,
     *         <code>RecordIO</code>, or <code>TFRecord</code>.
     *         </p>
     *         <p>
     *         To use only one record when making an HTTP invocation request to
     *         a container, set <code>BatchStrategy</code> to
     *         <code>SingleRecord</code> and <code>SplitType</code> to
     *         <code>Line</code>.
     *         </p>
     *         <p>
     *         To fit as many records in a mini-batch as can fit within the
     *         <code>MaxPayloadInMB</code> limit, set <code>BatchStrategy</code>
     *         to <code>MultiRecord</code> and <code>SplitType</code> to
     *         <code>Line</code>.
     *         </p>
     * @see BatchStrategy
     */
    public String getBatchStrategy() {
        return batchStrategy;
    }

    /**
     * <p>
     * Specifies the number of records to include in a mini-batch for an HTTP
     * inference request. A <i>record</i> <i/> is a single unit of input data
     * that inference can be made on. For example, a single line in a CSV file
     * is a record.
     * </p>
     * <p>
     * To enable the batch strategy, you must set the <code>SplitType</code>
     * property to <code>Line</code>, <code>RecordIO</code>, or
     * <code>TFRecord</code>.
     * </p>
     * <p>
     * To use only one record when making an HTTP invocation request to a
     * container, set <code>BatchStrategy</code> to <code>SingleRecord</code>
     * and <code>SplitType</code> to <code>Line</code>.
     * </p>
     * <p>
     * To fit as many records in a mini-batch as can fit within the
     * <code>MaxPayloadInMB</code> limit, set <code>BatchStrategy</code> to
     * <code>MultiRecord</code> and <code>SplitType</code> to <code>Line</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MultiRecord, SingleRecord
     *
     * @param batchStrategy <p>
     *            Specifies the number of records to include in a mini-batch for
     *            an HTTP inference request. A <i>record</i> <i/> is a single
     *            unit of input data that inference can be made on. For example,
     *            a single line in a CSV file is a record.
     *            </p>
     *            <p>
     *            To enable the batch strategy, you must set the
     *            <code>SplitType</code> property to <code>Line</code>,
     *            <code>RecordIO</code>, or <code>TFRecord</code>.
     *            </p>
     *            <p>
     *            To use only one record when making an HTTP invocation request
     *            to a container, set <code>BatchStrategy</code> to
     *            <code>SingleRecord</code> and <code>SplitType</code> to
     *            <code>Line</code>.
     *            </p>
     *            <p>
     *            To fit as many records in a mini-batch as can fit within the
     *            <code>MaxPayloadInMB</code> limit, set
     *            <code>BatchStrategy</code> to <code>MultiRecord</code> and
     *            <code>SplitType</code> to <code>Line</code>.
     *            </p>
     * @see BatchStrategy
     */
    public void setBatchStrategy(String batchStrategy) {
        this.batchStrategy = batchStrategy;
    }

    /**
     * <p>
     * Specifies the number of records to include in a mini-batch for an HTTP
     * inference request. A <i>record</i> <i/> is a single unit of input data
     * that inference can be made on. For example, a single line in a CSV file
     * is a record.
     * </p>
     * <p>
     * To enable the batch strategy, you must set the <code>SplitType</code>
     * property to <code>Line</code>, <code>RecordIO</code>, or
     * <code>TFRecord</code>.
     * </p>
     * <p>
     * To use only one record when making an HTTP invocation request to a
     * container, set <code>BatchStrategy</code> to <code>SingleRecord</code>
     * and <code>SplitType</code> to <code>Line</code>.
     * </p>
     * <p>
     * To fit as many records in a mini-batch as can fit within the
     * <code>MaxPayloadInMB</code> limit, set <code>BatchStrategy</code> to
     * <code>MultiRecord</code> and <code>SplitType</code> to <code>Line</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MultiRecord, SingleRecord
     *
     * @param batchStrategy <p>
     *            Specifies the number of records to include in a mini-batch for
     *            an HTTP inference request. A <i>record</i> <i/> is a single
     *            unit of input data that inference can be made on. For example,
     *            a single line in a CSV file is a record.
     *            </p>
     *            <p>
     *            To enable the batch strategy, you must set the
     *            <code>SplitType</code> property to <code>Line</code>,
     *            <code>RecordIO</code>, or <code>TFRecord</code>.
     *            </p>
     *            <p>
     *            To use only one record when making an HTTP invocation request
     *            to a container, set <code>BatchStrategy</code> to
     *            <code>SingleRecord</code> and <code>SplitType</code> to
     *            <code>Line</code>.
     *            </p>
     *            <p>
     *            To fit as many records in a mini-batch as can fit within the
     *            <code>MaxPayloadInMB</code> limit, set
     *            <code>BatchStrategy</code> to <code>MultiRecord</code> and
     *            <code>SplitType</code> to <code>Line</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see BatchStrategy
     */
    public CreateTransformJobRequest withBatchStrategy(String batchStrategy) {
        this.batchStrategy = batchStrategy;
        return this;
    }

    /**
     * <p>
     * Specifies the number of records to include in a mini-batch for an HTTP
     * inference request. A <i>record</i> <i/> is a single unit of input data
     * that inference can be made on. For example, a single line in a CSV file
     * is a record.
     * </p>
     * <p>
     * To enable the batch strategy, you must set the <code>SplitType</code>
     * property to <code>Line</code>, <code>RecordIO</code>, or
     * <code>TFRecord</code>.
     * </p>
     * <p>
     * To use only one record when making an HTTP invocation request to a
     * container, set <code>BatchStrategy</code> to <code>SingleRecord</code>
     * and <code>SplitType</code> to <code>Line</code>.
     * </p>
     * <p>
     * To fit as many records in a mini-batch as can fit within the
     * <code>MaxPayloadInMB</code> limit, set <code>BatchStrategy</code> to
     * <code>MultiRecord</code> and <code>SplitType</code> to <code>Line</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MultiRecord, SingleRecord
     *
     * @param batchStrategy <p>
     *            Specifies the number of records to include in a mini-batch for
     *            an HTTP inference request. A <i>record</i> <i/> is a single
     *            unit of input data that inference can be made on. For example,
     *            a single line in a CSV file is a record.
     *            </p>
     *            <p>
     *            To enable the batch strategy, you must set the
     *            <code>SplitType</code> property to <code>Line</code>,
     *            <code>RecordIO</code>, or <code>TFRecord</code>.
     *            </p>
     *            <p>
     *            To use only one record when making an HTTP invocation request
     *            to a container, set <code>BatchStrategy</code> to
     *            <code>SingleRecord</code> and <code>SplitType</code> to
     *            <code>Line</code>.
     *            </p>
     *            <p>
     *            To fit as many records in a mini-batch as can fit within the
     *            <code>MaxPayloadInMB</code> limit, set
     *            <code>BatchStrategy</code> to <code>MultiRecord</code> and
     *            <code>SplitType</code> to <code>Line</code>.
     *            </p>
     * @see BatchStrategy
     */
    public void setBatchStrategy(BatchStrategy batchStrategy) {
        this.batchStrategy = batchStrategy.toString();
    }

    /**
     * <p>
     * Specifies the number of records to include in a mini-batch for an HTTP
     * inference request. A <i>record</i> <i/> is a single unit of input data
     * that inference can be made on. For example, a single line in a CSV file
     * is a record.
     * </p>
     * <p>
     * To enable the batch strategy, you must set the <code>SplitType</code>
     * property to <code>Line</code>, <code>RecordIO</code>, or
     * <code>TFRecord</code>.
     * </p>
     * <p>
     * To use only one record when making an HTTP invocation request to a
     * container, set <code>BatchStrategy</code> to <code>SingleRecord</code>
     * and <code>SplitType</code> to <code>Line</code>.
     * </p>
     * <p>
     * To fit as many records in a mini-batch as can fit within the
     * <code>MaxPayloadInMB</code> limit, set <code>BatchStrategy</code> to
     * <code>MultiRecord</code> and <code>SplitType</code> to <code>Line</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MultiRecord, SingleRecord
     *
     * @param batchStrategy <p>
     *            Specifies the number of records to include in a mini-batch for
     *            an HTTP inference request. A <i>record</i> <i/> is a single
     *            unit of input data that inference can be made on. For example,
     *            a single line in a CSV file is a record.
     *            </p>
     *            <p>
     *            To enable the batch strategy, you must set the
     *            <code>SplitType</code> property to <code>Line</code>,
     *            <code>RecordIO</code>, or <code>TFRecord</code>.
     *            </p>
     *            <p>
     *            To use only one record when making an HTTP invocation request
     *            to a container, set <code>BatchStrategy</code> to
     *            <code>SingleRecord</code> and <code>SplitType</code> to
     *            <code>Line</code>.
     *            </p>
     *            <p>
     *            To fit as many records in a mini-batch as can fit within the
     *            <code>MaxPayloadInMB</code> limit, set
     *            <code>BatchStrategy</code> to <code>MultiRecord</code> and
     *            <code>SplitType</code> to <code>Line</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see BatchStrategy
     */
    public CreateTransformJobRequest withBatchStrategy(BatchStrategy batchStrategy) {
        this.batchStrategy = batchStrategy.toString();
        return this;
    }

    /**
     * <p>
     * The environment variables to set in the Docker container. We support up
     * to 16 key and values entries in the map.
     * </p>
     *
     * @return <p>
     *         The environment variables to set in the Docker container. We
     *         support up to 16 key and values entries in the map.
     *         </p>
     */
    public java.util.Map<String, String> getEnvironment() {
        return environment;
    }

    /**
     * <p>
     * The environment variables to set in the Docker container. We support up
     * to 16 key and values entries in the map.
     * </p>
     *
     * @param environment <p>
     *            The environment variables to set in the Docker container. We
     *            support up to 16 key and values entries in the map.
     *            </p>
     */
    public void setEnvironment(java.util.Map<String, String> environment) {
        this.environment = environment;
    }

    /**
     * <p>
     * The environment variables to set in the Docker container. We support up
     * to 16 key and values entries in the map.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param environment <p>
     *            The environment variables to set in the Docker container. We
     *            support up to 16 key and values entries in the map.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTransformJobRequest withEnvironment(java.util.Map<String, String> environment) {
        this.environment = environment;
        return this;
    }

    /**
     * <p>
     * The environment variables to set in the Docker container. We support up
     * to 16 key and values entries in the map.
     * </p>
     * <p>
     * The method adds a new key-value pair into Environment parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into Environment.
     * @param value The corresponding value of the entry to be added into
     *            Environment.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTransformJobRequest addEnvironmentEntry(String key, String value) {
        if (null == this.environment) {
            this.environment = new java.util.HashMap<String, String>();
        }
        if (this.environment.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.environment.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Environment.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public CreateTransformJobRequest clearEnvironmentEntries() {
        this.environment = null;
        return this;
    }

    /**
     * <p>
     * Describes the input source and the way the transform job consumes it.
     * </p>
     *
     * @return <p>
     *         Describes the input source and the way the transform job consumes
     *         it.
     *         </p>
     */
    public TransformInput getTransformInput() {
        return transformInput;
    }

    /**
     * <p>
     * Describes the input source and the way the transform job consumes it.
     * </p>
     *
     * @param transformInput <p>
     *            Describes the input source and the way the transform job
     *            consumes it.
     *            </p>
     */
    public void setTransformInput(TransformInput transformInput) {
        this.transformInput = transformInput;
    }

    /**
     * <p>
     * Describes the input source and the way the transform job consumes it.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param transformInput <p>
     *            Describes the input source and the way the transform job
     *            consumes it.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTransformJobRequest withTransformInput(TransformInput transformInput) {
        this.transformInput = transformInput;
        return this;
    }

    /**
     * <p>
     * Describes the results of the transform job.
     * </p>
     *
     * @return <p>
     *         Describes the results of the transform job.
     *         </p>
     */
    public TransformOutput getTransformOutput() {
        return transformOutput;
    }

    /**
     * <p>
     * Describes the results of the transform job.
     * </p>
     *
     * @param transformOutput <p>
     *            Describes the results of the transform job.
     *            </p>
     */
    public void setTransformOutput(TransformOutput transformOutput) {
        this.transformOutput = transformOutput;
    }

    /**
     * <p>
     * Describes the results of the transform job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param transformOutput <p>
     *            Describes the results of the transform job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTransformJobRequest withTransformOutput(TransformOutput transformOutput) {
        this.transformOutput = transformOutput;
        return this;
    }

    /**
     * <p>
     * Describes the resources, including ML instance types and ML instance
     * count, to use for the transform job.
     * </p>
     *
     * @return <p>
     *         Describes the resources, including ML instance types and ML
     *         instance count, to use for the transform job.
     *         </p>
     */
    public TransformResources getTransformResources() {
        return transformResources;
    }

    /**
     * <p>
     * Describes the resources, including ML instance types and ML instance
     * count, to use for the transform job.
     * </p>
     *
     * @param transformResources <p>
     *            Describes the resources, including ML instance types and ML
     *            instance count, to use for the transform job.
     *            </p>
     */
    public void setTransformResources(TransformResources transformResources) {
        this.transformResources = transformResources;
    }

    /**
     * <p>
     * Describes the resources, including ML instance types and ML instance
     * count, to use for the transform job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param transformResources <p>
     *            Describes the resources, including ML instance types and ML
     *            instance count, to use for the transform job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTransformJobRequest withTransformResources(TransformResources transformResources) {
        this.transformResources = transformResources;
        return this;
    }

    /**
     * <p>
     * The data structure used to specify the data to be used for inference in a
     * batch transform job and to associate the data that is relevant to the
     * prediction results in the output. The input filter provided allows you to
     * exclude input data that is not needed for inference in a batch transform
     * job. The output filter provided allows you to include input data relevant
     * to interpreting the predictions in the output from the job. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/batch-transform-data-processing.html"
     * >Associate Prediction Results with their Corresponding Input Records</a>.
     * </p>
     *
     * @return <p>
     *         The data structure used to specify the data to be used for
     *         inference in a batch transform job and to associate the data that
     *         is relevant to the prediction results in the output. The input
     *         filter provided allows you to exclude input data that is not
     *         needed for inference in a batch transform job. The output filter
     *         provided allows you to include input data relevant to
     *         interpreting the predictions in the output from the job. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/sagemaker/latest/dg/batch-transform-data-processing.html"
     *         >Associate Prediction Results with their Corresponding Input
     *         Records</a>.
     *         </p>
     */
    public DataProcessing getDataProcessing() {
        return dataProcessing;
    }

    /**
     * <p>
     * The data structure used to specify the data to be used for inference in a
     * batch transform job and to associate the data that is relevant to the
     * prediction results in the output. The input filter provided allows you to
     * exclude input data that is not needed for inference in a batch transform
     * job. The output filter provided allows you to include input data relevant
     * to interpreting the predictions in the output from the job. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/batch-transform-data-processing.html"
     * >Associate Prediction Results with their Corresponding Input Records</a>.
     * </p>
     *
     * @param dataProcessing <p>
     *            The data structure used to specify the data to be used for
     *            inference in a batch transform job and to associate the data
     *            that is relevant to the prediction results in the output. The
     *            input filter provided allows you to exclude input data that is
     *            not needed for inference in a batch transform job. The output
     *            filter provided allows you to include input data relevant to
     *            interpreting the predictions in the output from the job. For
     *            more information, see <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/batch-transform-data-processing.html"
     *            >Associate Prediction Results with their Corresponding Input
     *            Records</a>.
     *            </p>
     */
    public void setDataProcessing(DataProcessing dataProcessing) {
        this.dataProcessing = dataProcessing;
    }

    /**
     * <p>
     * The data structure used to specify the data to be used for inference in a
     * batch transform job and to associate the data that is relevant to the
     * prediction results in the output. The input filter provided allows you to
     * exclude input data that is not needed for inference in a batch transform
     * job. The output filter provided allows you to include input data relevant
     * to interpreting the predictions in the output from the job. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/batch-transform-data-processing.html"
     * >Associate Prediction Results with their Corresponding Input Records</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dataProcessing <p>
     *            The data structure used to specify the data to be used for
     *            inference in a batch transform job and to associate the data
     *            that is relevant to the prediction results in the output. The
     *            input filter provided allows you to exclude input data that is
     *            not needed for inference in a batch transform job. The output
     *            filter provided allows you to include input data relevant to
     *            interpreting the predictions in the output from the job. For
     *            more information, see <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/batch-transform-data-processing.html"
     *            >Associate Prediction Results with their Corresponding Input
     *            Records</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTransformJobRequest withDataProcessing(DataProcessing dataProcessing) {
        this.dataProcessing = dataProcessing;
        return this;
    }

    /**
     * <p>
     * (Optional) An array of key-value pairs. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what"
     * >Using Cost Allocation Tags</a> in the <i>AWS Billing and Cost Management
     * User Guide</i>.
     * </p>
     *
     * @return <p>
     *         (Optional) An array of key-value pairs. For more information, see
     *         <a href=
     *         "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what"
     *         >Using Cost Allocation Tags</a> in the <i>AWS Billing and Cost
     *         Management User Guide</i>.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * (Optional) An array of key-value pairs. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what"
     * >Using Cost Allocation Tags</a> in the <i>AWS Billing and Cost Management
     * User Guide</i>.
     * </p>
     *
     * @param tags <p>
     *            (Optional) An array of key-value pairs. For more information,
     *            see <a href=
     *            "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what"
     *            >Using Cost Allocation Tags</a> in the <i>AWS Billing and Cost
     *            Management User Guide</i>.
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
     * (Optional) An array of key-value pairs. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what"
     * >Using Cost Allocation Tags</a> in the <i>AWS Billing and Cost Management
     * User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            (Optional) An array of key-value pairs. For more information,
     *            see <a href=
     *            "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what"
     *            >Using Cost Allocation Tags</a> in the <i>AWS Billing and Cost
     *            Management User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTransformJobRequest withTags(Tag... tags) {
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
     * (Optional) An array of key-value pairs. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what"
     * >Using Cost Allocation Tags</a> in the <i>AWS Billing and Cost Management
     * User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            (Optional) An array of key-value pairs. For more information,
     *            see <a href=
     *            "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what"
     *            >Using Cost Allocation Tags</a> in the <i>AWS Billing and Cost
     *            Management User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTransformJobRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * Configuration for the experiment.
     * </p>
     *
     * @return <p>
     *         Configuration for the experiment.
     *         </p>
     */
    public ExperimentConfig getExperimentConfig() {
        return experimentConfig;
    }

    /**
     * <p>
     * Configuration for the experiment.
     * </p>
     *
     * @param experimentConfig <p>
     *            Configuration for the experiment.
     *            </p>
     */
    public void setExperimentConfig(ExperimentConfig experimentConfig) {
        this.experimentConfig = experimentConfig;
    }

    /**
     * <p>
     * Configuration for the experiment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param experimentConfig <p>
     *            Configuration for the experiment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTransformJobRequest withExperimentConfig(ExperimentConfig experimentConfig) {
        this.experimentConfig = experimentConfig;
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
        if (getTransformJobName() != null)
            sb.append("TransformJobName: " + getTransformJobName() + ",");
        if (getModelName() != null)
            sb.append("ModelName: " + getModelName() + ",");
        if (getMaxConcurrentTransforms() != null)
            sb.append("MaxConcurrentTransforms: " + getMaxConcurrentTransforms() + ",");
        if (getMaxPayloadInMB() != null)
            sb.append("MaxPayloadInMB: " + getMaxPayloadInMB() + ",");
        if (getBatchStrategy() != null)
            sb.append("BatchStrategy: " + getBatchStrategy() + ",");
        if (getEnvironment() != null)
            sb.append("Environment: " + getEnvironment() + ",");
        if (getTransformInput() != null)
            sb.append("TransformInput: " + getTransformInput() + ",");
        if (getTransformOutput() != null)
            sb.append("TransformOutput: " + getTransformOutput() + ",");
        if (getTransformResources() != null)
            sb.append("TransformResources: " + getTransformResources() + ",");
        if (getDataProcessing() != null)
            sb.append("DataProcessing: " + getDataProcessing() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getExperimentConfig() != null)
            sb.append("ExperimentConfig: " + getExperimentConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTransformJobName() == null) ? 0 : getTransformJobName().hashCode());
        hashCode = prime * hashCode + ((getModelName() == null) ? 0 : getModelName().hashCode());
        hashCode = prime
                * hashCode
                + ((getMaxConcurrentTransforms() == null) ? 0 : getMaxConcurrentTransforms()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getMaxPayloadInMB() == null) ? 0 : getMaxPayloadInMB().hashCode());
        hashCode = prime * hashCode
                + ((getBatchStrategy() == null) ? 0 : getBatchStrategy().hashCode());
        hashCode = prime * hashCode
                + ((getEnvironment() == null) ? 0 : getEnvironment().hashCode());
        hashCode = prime * hashCode
                + ((getTransformInput() == null) ? 0 : getTransformInput().hashCode());
        hashCode = prime * hashCode
                + ((getTransformOutput() == null) ? 0 : getTransformOutput().hashCode());
        hashCode = prime * hashCode
                + ((getTransformResources() == null) ? 0 : getTransformResources().hashCode());
        hashCode = prime * hashCode
                + ((getDataProcessing() == null) ? 0 : getDataProcessing().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode
                + ((getExperimentConfig() == null) ? 0 : getExperimentConfig().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateTransformJobRequest == false)
            return false;
        CreateTransformJobRequest other = (CreateTransformJobRequest) obj;

        if (other.getTransformJobName() == null ^ this.getTransformJobName() == null)
            return false;
        if (other.getTransformJobName() != null
                && other.getTransformJobName().equals(this.getTransformJobName()) == false)
            return false;
        if (other.getModelName() == null ^ this.getModelName() == null)
            return false;
        if (other.getModelName() != null
                && other.getModelName().equals(this.getModelName()) == false)
            return false;
        if (other.getMaxConcurrentTransforms() == null ^ this.getMaxConcurrentTransforms() == null)
            return false;
        if (other.getMaxConcurrentTransforms() != null
                && other.getMaxConcurrentTransforms().equals(this.getMaxConcurrentTransforms()) == false)
            return false;
        if (other.getMaxPayloadInMB() == null ^ this.getMaxPayloadInMB() == null)
            return false;
        if (other.getMaxPayloadInMB() != null
                && other.getMaxPayloadInMB().equals(this.getMaxPayloadInMB()) == false)
            return false;
        if (other.getBatchStrategy() == null ^ this.getBatchStrategy() == null)
            return false;
        if (other.getBatchStrategy() != null
                && other.getBatchStrategy().equals(this.getBatchStrategy()) == false)
            return false;
        if (other.getEnvironment() == null ^ this.getEnvironment() == null)
            return false;
        if (other.getEnvironment() != null
                && other.getEnvironment().equals(this.getEnvironment()) == false)
            return false;
        if (other.getTransformInput() == null ^ this.getTransformInput() == null)
            return false;
        if (other.getTransformInput() != null
                && other.getTransformInput().equals(this.getTransformInput()) == false)
            return false;
        if (other.getTransformOutput() == null ^ this.getTransformOutput() == null)
            return false;
        if (other.getTransformOutput() != null
                && other.getTransformOutput().equals(this.getTransformOutput()) == false)
            return false;
        if (other.getTransformResources() == null ^ this.getTransformResources() == null)
            return false;
        if (other.getTransformResources() != null
                && other.getTransformResources().equals(this.getTransformResources()) == false)
            return false;
        if (other.getDataProcessing() == null ^ this.getDataProcessing() == null)
            return false;
        if (other.getDataProcessing() != null
                && other.getDataProcessing().equals(this.getDataProcessing()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getExperimentConfig() == null ^ this.getExperimentConfig() == null)
            return false;
        if (other.getExperimentConfig() != null
                && other.getExperimentConfig().equals(this.getExperimentConfig()) == false)
            return false;
        return true;
    }
}
