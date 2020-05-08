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

/**
 * <p>
 * Specifies the training algorithm to use in a <a>CreateTrainingJob</a>
 * request.
 * </p>
 * <p>
 * For more information about algorithms provided by Amazon SageMaker, see <a
 * href
 * ="https://docs.aws.amazon.com/sagemaker/latest/dg/algos.html">Algorithms</a>.
 * For information about using your own algorithms, see <a
 * href="https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms.html"
 * >Using Your Own Algorithms with Amazon SageMaker</a>.
 * </p>
 */
public class AlgorithmSpecification implements Serializable {
    /**
     * <p>
     * The registry path of the Docker image that contains the training
     * algorithm. For information about docker registry paths for built-in
     * algorithms, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-algo-docker-registry-paths.html"
     * >Algorithms Provided by Amazon SageMaker: Common Parameters</a>. Amazon
     * SageMaker supports both <code>registry/repository[:tag]</code> and
     * <code>registry/repository[@digest]</code> image path formats. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms.html"
     * >Using Your Own Algorithms with Amazon SageMaker</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     * <b>Pattern: </b>.*<br/>
     */
    private String trainingImage;

    /**
     * <p>
     * The name of the algorithm resource to use for the training job. This must
     * be an algorithm resource that you created or subscribe to on AWS
     * Marketplace. If you specify a value for this parameter, you can't specify
     * a value for <code>TrainingImage</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 170<br/>
     * <b>Pattern:
     * </b>(arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:[a-z\-]*\
     * /)?([a-zA-Z0-9]([a-zA-Z0-9-]){0,62})(?<!-)$<br/>
     */
    private String algorithmName;

    /**
     * <p>
     * The input mode that the algorithm supports. For the input modes that
     * Amazon SageMaker algorithms support, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/algos.html"
     * >Algorithms</a>. If an algorithm supports the <code>File</code> input
     * mode, Amazon SageMaker downloads the training data from S3 to the
     * provisioned ML storage Volume, and mounts the directory to docker volume
     * for training container. If an algorithm supports the <code>Pipe</code>
     * input mode, Amazon SageMaker streams data directly from S3 to the
     * container.
     * </p>
     * <p>
     * In File mode, make sure you provision ML storage volume with sufficient
     * capacity to accommodate the data download from S3. In addition to the
     * training data, the ML storage volume also stores the output model. The
     * algorithm container use ML storage volume to also store intermediate
     * information, if any.
     * </p>
     * <p>
     * For distributed algorithms using File mode, training data is distributed
     * uniformly, and your training duration is predictable if the input data
     * objects size is approximately same. Amazon SageMaker does not split the
     * files any further for model training. If the object sizes are skewed,
     * training won't be optimal as the data distribution is also skewed where
     * one host in a training cluster is overloaded, thus becoming bottleneck in
     * training.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pipe, File
     */
    private String trainingInputMode;

    /**
     * <p>
     * A list of metric definition objects. Each object specifies the metric
     * name and regular expressions used to parse algorithm logs. Amazon
     * SageMaker publishes each metric to Amazon CloudWatch.
     * </p>
     */
    private java.util.List<MetricDefinition> metricDefinitions;

    /**
     * <p>
     * To generate and save time-series metrics during training, set to
     * <code>true</code>. The default is <code>false</code> and time-series
     * metrics aren't generated except in the following cases:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You use one of the Amazon SageMaker built-in algorithms
     * </p>
     * </li>
     * <li>
     * <p>
     * You use one of the following <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/pre-built-containers-frameworks-deep-learning.html"
     * >Prebuilt Amazon SageMaker Docker Images</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Tensorflow (version &gt;= 1.15)
     * </p>
     * </li>
     * <li>
     * <p>
     * MXNet (version &gt;= 1.6)
     * </p>
     * </li>
     * <li>
     * <p>
     * PyTorch (version &gt;= 1.3)
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * You specify at least one <a>MetricDefinition</a>
     * </p>
     * </li>
     * </ul>
     */
    private Boolean enableSageMakerMetricsTimeSeries;

    /**
     * <p>
     * The registry path of the Docker image that contains the training
     * algorithm. For information about docker registry paths for built-in
     * algorithms, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-algo-docker-registry-paths.html"
     * >Algorithms Provided by Amazon SageMaker: Common Parameters</a>. Amazon
     * SageMaker supports both <code>registry/repository[:tag]</code> and
     * <code>registry/repository[@digest]</code> image path formats. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms.html"
     * >Using Your Own Algorithms with Amazon SageMaker</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @return <p>
     *         The registry path of the Docker image that contains the training
     *         algorithm. For information about docker registry paths for
     *         built-in algorithms, see <a href=
     *         "https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-algo-docker-registry-paths.html"
     *         >Algorithms Provided by Amazon SageMaker: Common Parameters</a>.
     *         Amazon SageMaker supports both
     *         <code>registry/repository[:tag]</code> and
     *         <code>registry/repository[@digest]</code> image path formats. For
     *         more information, see <a href=
     *         "https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms.html"
     *         >Using Your Own Algorithms with Amazon SageMaker</a>.
     *         </p>
     */
    public String getTrainingImage() {
        return trainingImage;
    }

    /**
     * <p>
     * The registry path of the Docker image that contains the training
     * algorithm. For information about docker registry paths for built-in
     * algorithms, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-algo-docker-registry-paths.html"
     * >Algorithms Provided by Amazon SageMaker: Common Parameters</a>. Amazon
     * SageMaker supports both <code>registry/repository[:tag]</code> and
     * <code>registry/repository[@digest]</code> image path formats. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms.html"
     * >Using Your Own Algorithms with Amazon SageMaker</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param trainingImage <p>
     *            The registry path of the Docker image that contains the
     *            training algorithm. For information about docker registry
     *            paths for built-in algorithms, see <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-algo-docker-registry-paths.html"
     *            >Algorithms Provided by Amazon SageMaker: Common
     *            Parameters</a>. Amazon SageMaker supports both
     *            <code>registry/repository[:tag]</code> and
     *            <code>registry/repository[@digest]</code> image path formats.
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms.html"
     *            >Using Your Own Algorithms with Amazon SageMaker</a>.
     *            </p>
     */
    public void setTrainingImage(String trainingImage) {
        this.trainingImage = trainingImage;
    }

    /**
     * <p>
     * The registry path of the Docker image that contains the training
     * algorithm. For information about docker registry paths for built-in
     * algorithms, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-algo-docker-registry-paths.html"
     * >Algorithms Provided by Amazon SageMaker: Common Parameters</a>. Amazon
     * SageMaker supports both <code>registry/repository[:tag]</code> and
     * <code>registry/repository[@digest]</code> image path formats. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms.html"
     * >Using Your Own Algorithms with Amazon SageMaker</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param trainingImage <p>
     *            The registry path of the Docker image that contains the
     *            training algorithm. For information about docker registry
     *            paths for built-in algorithms, see <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-algo-docker-registry-paths.html"
     *            >Algorithms Provided by Amazon SageMaker: Common
     *            Parameters</a>. Amazon SageMaker supports both
     *            <code>registry/repository[:tag]</code> and
     *            <code>registry/repository[@digest]</code> image path formats.
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms.html"
     *            >Using Your Own Algorithms with Amazon SageMaker</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AlgorithmSpecification withTrainingImage(String trainingImage) {
        this.trainingImage = trainingImage;
        return this;
    }

    /**
     * <p>
     * The name of the algorithm resource to use for the training job. This must
     * be an algorithm resource that you created or subscribe to on AWS
     * Marketplace. If you specify a value for this parameter, you can't specify
     * a value for <code>TrainingImage</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 170<br/>
     * <b>Pattern:
     * </b>(arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:[a-z\-]*\
     * /)?([a-zA-Z0-9]([a-zA-Z0-9-]){0,62})(?<!-)$<br/>
     *
     * @return <p>
     *         The name of the algorithm resource to use for the training job.
     *         This must be an algorithm resource that you created or subscribe
     *         to on AWS Marketplace. If you specify a value for this parameter,
     *         you can't specify a value for <code>TrainingImage</code>.
     *         </p>
     */
    public String getAlgorithmName() {
        return algorithmName;
    }

    /**
     * <p>
     * The name of the algorithm resource to use for the training job. This must
     * be an algorithm resource that you created or subscribe to on AWS
     * Marketplace. If you specify a value for this parameter, you can't specify
     * a value for <code>TrainingImage</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 170<br/>
     * <b>Pattern:
     * </b>(arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:[a-z\-]*\
     * /)?([a-zA-Z0-9]([a-zA-Z0-9-]){0,62})(?<!-)$<br/>
     *
     * @param algorithmName <p>
     *            The name of the algorithm resource to use for the training
     *            job. This must be an algorithm resource that you created or
     *            subscribe to on AWS Marketplace. If you specify a value for
     *            this parameter, you can't specify a value for
     *            <code>TrainingImage</code>.
     *            </p>
     */
    public void setAlgorithmName(String algorithmName) {
        this.algorithmName = algorithmName;
    }

    /**
     * <p>
     * The name of the algorithm resource to use for the training job. This must
     * be an algorithm resource that you created or subscribe to on AWS
     * Marketplace. If you specify a value for this parameter, you can't specify
     * a value for <code>TrainingImage</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 170<br/>
     * <b>Pattern:
     * </b>(arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:[a-z\-]*\
     * /)?([a-zA-Z0-9]([a-zA-Z0-9-]){0,62})(?<!-)$<br/>
     *
     * @param algorithmName <p>
     *            The name of the algorithm resource to use for the training
     *            job. This must be an algorithm resource that you created or
     *            subscribe to on AWS Marketplace. If you specify a value for
     *            this parameter, you can't specify a value for
     *            <code>TrainingImage</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AlgorithmSpecification withAlgorithmName(String algorithmName) {
        this.algorithmName = algorithmName;
        return this;
    }

    /**
     * <p>
     * The input mode that the algorithm supports. For the input modes that
     * Amazon SageMaker algorithms support, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/algos.html"
     * >Algorithms</a>. If an algorithm supports the <code>File</code> input
     * mode, Amazon SageMaker downloads the training data from S3 to the
     * provisioned ML storage Volume, and mounts the directory to docker volume
     * for training container. If an algorithm supports the <code>Pipe</code>
     * input mode, Amazon SageMaker streams data directly from S3 to the
     * container.
     * </p>
     * <p>
     * In File mode, make sure you provision ML storage volume with sufficient
     * capacity to accommodate the data download from S3. In addition to the
     * training data, the ML storage volume also stores the output model. The
     * algorithm container use ML storage volume to also store intermediate
     * information, if any.
     * </p>
     * <p>
     * For distributed algorithms using File mode, training data is distributed
     * uniformly, and your training duration is predictable if the input data
     * objects size is approximately same. Amazon SageMaker does not split the
     * files any further for model training. If the object sizes are skewed,
     * training won't be optimal as the data distribution is also skewed where
     * one host in a training cluster is overloaded, thus becoming bottleneck in
     * training.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pipe, File
     *
     * @return <p>
     *         The input mode that the algorithm supports. For the input modes
     *         that Amazon SageMaker algorithms support, see <a href=
     *         "https://docs.aws.amazon.com/sagemaker/latest/dg/algos.html"
     *         >Algorithms</a>. If an algorithm supports the <code>File</code>
     *         input mode, Amazon SageMaker downloads the training data from S3
     *         to the provisioned ML storage Volume, and mounts the directory to
     *         docker volume for training container. If an algorithm supports
     *         the <code>Pipe</code> input mode, Amazon SageMaker streams data
     *         directly from S3 to the container.
     *         </p>
     *         <p>
     *         In File mode, make sure you provision ML storage volume with
     *         sufficient capacity to accommodate the data download from S3. In
     *         addition to the training data, the ML storage volume also stores
     *         the output model. The algorithm container use ML storage volume
     *         to also store intermediate information, if any.
     *         </p>
     *         <p>
     *         For distributed algorithms using File mode, training data is
     *         distributed uniformly, and your training duration is predictable
     *         if the input data objects size is approximately same. Amazon
     *         SageMaker does not split the files any further for model
     *         training. If the object sizes are skewed, training won't be
     *         optimal as the data distribution is also skewed where one host in
     *         a training cluster is overloaded, thus becoming bottleneck in
     *         training.
     *         </p>
     * @see TrainingInputMode
     */
    public String getTrainingInputMode() {
        return trainingInputMode;
    }

    /**
     * <p>
     * The input mode that the algorithm supports. For the input modes that
     * Amazon SageMaker algorithms support, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/algos.html"
     * >Algorithms</a>. If an algorithm supports the <code>File</code> input
     * mode, Amazon SageMaker downloads the training data from S3 to the
     * provisioned ML storage Volume, and mounts the directory to docker volume
     * for training container. If an algorithm supports the <code>Pipe</code>
     * input mode, Amazon SageMaker streams data directly from S3 to the
     * container.
     * </p>
     * <p>
     * In File mode, make sure you provision ML storage volume with sufficient
     * capacity to accommodate the data download from S3. In addition to the
     * training data, the ML storage volume also stores the output model. The
     * algorithm container use ML storage volume to also store intermediate
     * information, if any.
     * </p>
     * <p>
     * For distributed algorithms using File mode, training data is distributed
     * uniformly, and your training duration is predictable if the input data
     * objects size is approximately same. Amazon SageMaker does not split the
     * files any further for model training. If the object sizes are skewed,
     * training won't be optimal as the data distribution is also skewed where
     * one host in a training cluster is overloaded, thus becoming bottleneck in
     * training.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pipe, File
     *
     * @param trainingInputMode <p>
     *            The input mode that the algorithm supports. For the input
     *            modes that Amazon SageMaker algorithms support, see <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/algos.html"
     *            >Algorithms</a>. If an algorithm supports the
     *            <code>File</code> input mode, Amazon SageMaker downloads the
     *            training data from S3 to the provisioned ML storage Volume,
     *            and mounts the directory to docker volume for training
     *            container. If an algorithm supports the <code>Pipe</code>
     *            input mode, Amazon SageMaker streams data directly from S3 to
     *            the container.
     *            </p>
     *            <p>
     *            In File mode, make sure you provision ML storage volume with
     *            sufficient capacity to accommodate the data download from S3.
     *            In addition to the training data, the ML storage volume also
     *            stores the output model. The algorithm container use ML
     *            storage volume to also store intermediate information, if any.
     *            </p>
     *            <p>
     *            For distributed algorithms using File mode, training data is
     *            distributed uniformly, and your training duration is
     *            predictable if the input data objects size is approximately
     *            same. Amazon SageMaker does not split the files any further
     *            for model training. If the object sizes are skewed, training
     *            won't be optimal as the data distribution is also skewed where
     *            one host in a training cluster is overloaded, thus becoming
     *            bottleneck in training.
     *            </p>
     * @see TrainingInputMode
     */
    public void setTrainingInputMode(String trainingInputMode) {
        this.trainingInputMode = trainingInputMode;
    }

    /**
     * <p>
     * The input mode that the algorithm supports. For the input modes that
     * Amazon SageMaker algorithms support, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/algos.html"
     * >Algorithms</a>. If an algorithm supports the <code>File</code> input
     * mode, Amazon SageMaker downloads the training data from S3 to the
     * provisioned ML storage Volume, and mounts the directory to docker volume
     * for training container. If an algorithm supports the <code>Pipe</code>
     * input mode, Amazon SageMaker streams data directly from S3 to the
     * container.
     * </p>
     * <p>
     * In File mode, make sure you provision ML storage volume with sufficient
     * capacity to accommodate the data download from S3. In addition to the
     * training data, the ML storage volume also stores the output model. The
     * algorithm container use ML storage volume to also store intermediate
     * information, if any.
     * </p>
     * <p>
     * For distributed algorithms using File mode, training data is distributed
     * uniformly, and your training duration is predictable if the input data
     * objects size is approximately same. Amazon SageMaker does not split the
     * files any further for model training. If the object sizes are skewed,
     * training won't be optimal as the data distribution is also skewed where
     * one host in a training cluster is overloaded, thus becoming bottleneck in
     * training.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pipe, File
     *
     * @param trainingInputMode <p>
     *            The input mode that the algorithm supports. For the input
     *            modes that Amazon SageMaker algorithms support, see <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/algos.html"
     *            >Algorithms</a>. If an algorithm supports the
     *            <code>File</code> input mode, Amazon SageMaker downloads the
     *            training data from S3 to the provisioned ML storage Volume,
     *            and mounts the directory to docker volume for training
     *            container. If an algorithm supports the <code>Pipe</code>
     *            input mode, Amazon SageMaker streams data directly from S3 to
     *            the container.
     *            </p>
     *            <p>
     *            In File mode, make sure you provision ML storage volume with
     *            sufficient capacity to accommodate the data download from S3.
     *            In addition to the training data, the ML storage volume also
     *            stores the output model. The algorithm container use ML
     *            storage volume to also store intermediate information, if any.
     *            </p>
     *            <p>
     *            For distributed algorithms using File mode, training data is
     *            distributed uniformly, and your training duration is
     *            predictable if the input data objects size is approximately
     *            same. Amazon SageMaker does not split the files any further
     *            for model training. If the object sizes are skewed, training
     *            won't be optimal as the data distribution is also skewed where
     *            one host in a training cluster is overloaded, thus becoming
     *            bottleneck in training.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TrainingInputMode
     */
    public AlgorithmSpecification withTrainingInputMode(String trainingInputMode) {
        this.trainingInputMode = trainingInputMode;
        return this;
    }

    /**
     * <p>
     * The input mode that the algorithm supports. For the input modes that
     * Amazon SageMaker algorithms support, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/algos.html"
     * >Algorithms</a>. If an algorithm supports the <code>File</code> input
     * mode, Amazon SageMaker downloads the training data from S3 to the
     * provisioned ML storage Volume, and mounts the directory to docker volume
     * for training container. If an algorithm supports the <code>Pipe</code>
     * input mode, Amazon SageMaker streams data directly from S3 to the
     * container.
     * </p>
     * <p>
     * In File mode, make sure you provision ML storage volume with sufficient
     * capacity to accommodate the data download from S3. In addition to the
     * training data, the ML storage volume also stores the output model. The
     * algorithm container use ML storage volume to also store intermediate
     * information, if any.
     * </p>
     * <p>
     * For distributed algorithms using File mode, training data is distributed
     * uniformly, and your training duration is predictable if the input data
     * objects size is approximately same. Amazon SageMaker does not split the
     * files any further for model training. If the object sizes are skewed,
     * training won't be optimal as the data distribution is also skewed where
     * one host in a training cluster is overloaded, thus becoming bottleneck in
     * training.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pipe, File
     *
     * @param trainingInputMode <p>
     *            The input mode that the algorithm supports. For the input
     *            modes that Amazon SageMaker algorithms support, see <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/algos.html"
     *            >Algorithms</a>. If an algorithm supports the
     *            <code>File</code> input mode, Amazon SageMaker downloads the
     *            training data from S3 to the provisioned ML storage Volume,
     *            and mounts the directory to docker volume for training
     *            container. If an algorithm supports the <code>Pipe</code>
     *            input mode, Amazon SageMaker streams data directly from S3 to
     *            the container.
     *            </p>
     *            <p>
     *            In File mode, make sure you provision ML storage volume with
     *            sufficient capacity to accommodate the data download from S3.
     *            In addition to the training data, the ML storage volume also
     *            stores the output model. The algorithm container use ML
     *            storage volume to also store intermediate information, if any.
     *            </p>
     *            <p>
     *            For distributed algorithms using File mode, training data is
     *            distributed uniformly, and your training duration is
     *            predictable if the input data objects size is approximately
     *            same. Amazon SageMaker does not split the files any further
     *            for model training. If the object sizes are skewed, training
     *            won't be optimal as the data distribution is also skewed where
     *            one host in a training cluster is overloaded, thus becoming
     *            bottleneck in training.
     *            </p>
     * @see TrainingInputMode
     */
    public void setTrainingInputMode(TrainingInputMode trainingInputMode) {
        this.trainingInputMode = trainingInputMode.toString();
    }

    /**
     * <p>
     * The input mode that the algorithm supports. For the input modes that
     * Amazon SageMaker algorithms support, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/algos.html"
     * >Algorithms</a>. If an algorithm supports the <code>File</code> input
     * mode, Amazon SageMaker downloads the training data from S3 to the
     * provisioned ML storage Volume, and mounts the directory to docker volume
     * for training container. If an algorithm supports the <code>Pipe</code>
     * input mode, Amazon SageMaker streams data directly from S3 to the
     * container.
     * </p>
     * <p>
     * In File mode, make sure you provision ML storage volume with sufficient
     * capacity to accommodate the data download from S3. In addition to the
     * training data, the ML storage volume also stores the output model. The
     * algorithm container use ML storage volume to also store intermediate
     * information, if any.
     * </p>
     * <p>
     * For distributed algorithms using File mode, training data is distributed
     * uniformly, and your training duration is predictable if the input data
     * objects size is approximately same. Amazon SageMaker does not split the
     * files any further for model training. If the object sizes are skewed,
     * training won't be optimal as the data distribution is also skewed where
     * one host in a training cluster is overloaded, thus becoming bottleneck in
     * training.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pipe, File
     *
     * @param trainingInputMode <p>
     *            The input mode that the algorithm supports. For the input
     *            modes that Amazon SageMaker algorithms support, see <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/algos.html"
     *            >Algorithms</a>. If an algorithm supports the
     *            <code>File</code> input mode, Amazon SageMaker downloads the
     *            training data from S3 to the provisioned ML storage Volume,
     *            and mounts the directory to docker volume for training
     *            container. If an algorithm supports the <code>Pipe</code>
     *            input mode, Amazon SageMaker streams data directly from S3 to
     *            the container.
     *            </p>
     *            <p>
     *            In File mode, make sure you provision ML storage volume with
     *            sufficient capacity to accommodate the data download from S3.
     *            In addition to the training data, the ML storage volume also
     *            stores the output model. The algorithm container use ML
     *            storage volume to also store intermediate information, if any.
     *            </p>
     *            <p>
     *            For distributed algorithms using File mode, training data is
     *            distributed uniformly, and your training duration is
     *            predictable if the input data objects size is approximately
     *            same. Amazon SageMaker does not split the files any further
     *            for model training. If the object sizes are skewed, training
     *            won't be optimal as the data distribution is also skewed where
     *            one host in a training cluster is overloaded, thus becoming
     *            bottleneck in training.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TrainingInputMode
     */
    public AlgorithmSpecification withTrainingInputMode(TrainingInputMode trainingInputMode) {
        this.trainingInputMode = trainingInputMode.toString();
        return this;
    }

    /**
     * <p>
     * A list of metric definition objects. Each object specifies the metric
     * name and regular expressions used to parse algorithm logs. Amazon
     * SageMaker publishes each metric to Amazon CloudWatch.
     * </p>
     *
     * @return <p>
     *         A list of metric definition objects. Each object specifies the
     *         metric name and regular expressions used to parse algorithm logs.
     *         Amazon SageMaker publishes each metric to Amazon CloudWatch.
     *         </p>
     */
    public java.util.List<MetricDefinition> getMetricDefinitions() {
        return metricDefinitions;
    }

    /**
     * <p>
     * A list of metric definition objects. Each object specifies the metric
     * name and regular expressions used to parse algorithm logs. Amazon
     * SageMaker publishes each metric to Amazon CloudWatch.
     * </p>
     *
     * @param metricDefinitions <p>
     *            A list of metric definition objects. Each object specifies the
     *            metric name and regular expressions used to parse algorithm
     *            logs. Amazon SageMaker publishes each metric to Amazon
     *            CloudWatch.
     *            </p>
     */
    public void setMetricDefinitions(java.util.Collection<MetricDefinition> metricDefinitions) {
        if (metricDefinitions == null) {
            this.metricDefinitions = null;
            return;
        }

        this.metricDefinitions = new java.util.ArrayList<MetricDefinition>(metricDefinitions);
    }

    /**
     * <p>
     * A list of metric definition objects. Each object specifies the metric
     * name and regular expressions used to parse algorithm logs. Amazon
     * SageMaker publishes each metric to Amazon CloudWatch.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param metricDefinitions <p>
     *            A list of metric definition objects. Each object specifies the
     *            metric name and regular expressions used to parse algorithm
     *            logs. Amazon SageMaker publishes each metric to Amazon
     *            CloudWatch.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AlgorithmSpecification withMetricDefinitions(MetricDefinition... metricDefinitions) {
        if (getMetricDefinitions() == null) {
            this.metricDefinitions = new java.util.ArrayList<MetricDefinition>(
                    metricDefinitions.length);
        }
        for (MetricDefinition value : metricDefinitions) {
            this.metricDefinitions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of metric definition objects. Each object specifies the metric
     * name and regular expressions used to parse algorithm logs. Amazon
     * SageMaker publishes each metric to Amazon CloudWatch.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param metricDefinitions <p>
     *            A list of metric definition objects. Each object specifies the
     *            metric name and regular expressions used to parse algorithm
     *            logs. Amazon SageMaker publishes each metric to Amazon
     *            CloudWatch.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AlgorithmSpecification withMetricDefinitions(
            java.util.Collection<MetricDefinition> metricDefinitions) {
        setMetricDefinitions(metricDefinitions);
        return this;
    }

    /**
     * <p>
     * To generate and save time-series metrics during training, set to
     * <code>true</code>. The default is <code>false</code> and time-series
     * metrics aren't generated except in the following cases:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You use one of the Amazon SageMaker built-in algorithms
     * </p>
     * </li>
     * <li>
     * <p>
     * You use one of the following <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/pre-built-containers-frameworks-deep-learning.html"
     * >Prebuilt Amazon SageMaker Docker Images</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Tensorflow (version &gt;= 1.15)
     * </p>
     * </li>
     * <li>
     * <p>
     * MXNet (version &gt;= 1.6)
     * </p>
     * </li>
     * <li>
     * <p>
     * PyTorch (version &gt;= 1.3)
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * You specify at least one <a>MetricDefinition</a>
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         To generate and save time-series metrics during training, set to
     *         <code>true</code>. The default is <code>false</code> and
     *         time-series metrics aren't generated except in the following
     *         cases:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You use one of the Amazon SageMaker built-in algorithms
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You use one of the following <a href=
     *         "https://docs.aws.amazon.com/sagemaker/latest/dg/pre-built-containers-frameworks-deep-learning.html"
     *         >Prebuilt Amazon SageMaker Docker Images</a>:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Tensorflow (version &gt;= 1.15)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MXNet (version &gt;= 1.6)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         PyTorch (version &gt;= 1.3)
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         You specify at least one <a>MetricDefinition</a>
     *         </p>
     *         </li>
     *         </ul>
     */
    public Boolean isEnableSageMakerMetricsTimeSeries() {
        return enableSageMakerMetricsTimeSeries;
    }

    /**
     * <p>
     * To generate and save time-series metrics during training, set to
     * <code>true</code>. The default is <code>false</code> and time-series
     * metrics aren't generated except in the following cases:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You use one of the Amazon SageMaker built-in algorithms
     * </p>
     * </li>
     * <li>
     * <p>
     * You use one of the following <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/pre-built-containers-frameworks-deep-learning.html"
     * >Prebuilt Amazon SageMaker Docker Images</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Tensorflow (version &gt;= 1.15)
     * </p>
     * </li>
     * <li>
     * <p>
     * MXNet (version &gt;= 1.6)
     * </p>
     * </li>
     * <li>
     * <p>
     * PyTorch (version &gt;= 1.3)
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * You specify at least one <a>MetricDefinition</a>
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         To generate and save time-series metrics during training, set to
     *         <code>true</code>. The default is <code>false</code> and
     *         time-series metrics aren't generated except in the following
     *         cases:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You use one of the Amazon SageMaker built-in algorithms
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You use one of the following <a href=
     *         "https://docs.aws.amazon.com/sagemaker/latest/dg/pre-built-containers-frameworks-deep-learning.html"
     *         >Prebuilt Amazon SageMaker Docker Images</a>:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Tensorflow (version &gt;= 1.15)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MXNet (version &gt;= 1.6)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         PyTorch (version &gt;= 1.3)
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         You specify at least one <a>MetricDefinition</a>
     *         </p>
     *         </li>
     *         </ul>
     */
    public Boolean getEnableSageMakerMetricsTimeSeries() {
        return enableSageMakerMetricsTimeSeries;
    }

    /**
     * <p>
     * To generate and save time-series metrics during training, set to
     * <code>true</code>. The default is <code>false</code> and time-series
     * metrics aren't generated except in the following cases:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You use one of the Amazon SageMaker built-in algorithms
     * </p>
     * </li>
     * <li>
     * <p>
     * You use one of the following <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/pre-built-containers-frameworks-deep-learning.html"
     * >Prebuilt Amazon SageMaker Docker Images</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Tensorflow (version &gt;= 1.15)
     * </p>
     * </li>
     * <li>
     * <p>
     * MXNet (version &gt;= 1.6)
     * </p>
     * </li>
     * <li>
     * <p>
     * PyTorch (version &gt;= 1.3)
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * You specify at least one <a>MetricDefinition</a>
     * </p>
     * </li>
     * </ul>
     *
     * @param enableSageMakerMetricsTimeSeries <p>
     *            To generate and save time-series metrics during training, set
     *            to <code>true</code>. The default is <code>false</code> and
     *            time-series metrics aren't generated except in the following
     *            cases:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            You use one of the Amazon SageMaker built-in algorithms
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            You use one of the following <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/pre-built-containers-frameworks-deep-learning.html"
     *            >Prebuilt Amazon SageMaker Docker Images</a>:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Tensorflow (version &gt;= 1.15)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            MXNet (version &gt;= 1.6)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            PyTorch (version &gt;= 1.3)
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            You specify at least one <a>MetricDefinition</a>
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setEnableSageMakerMetricsTimeSeries(Boolean enableSageMakerMetricsTimeSeries) {
        this.enableSageMakerMetricsTimeSeries = enableSageMakerMetricsTimeSeries;
    }

    /**
     * <p>
     * To generate and save time-series metrics during training, set to
     * <code>true</code>. The default is <code>false</code> and time-series
     * metrics aren't generated except in the following cases:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You use one of the Amazon SageMaker built-in algorithms
     * </p>
     * </li>
     * <li>
     * <p>
     * You use one of the following <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/pre-built-containers-frameworks-deep-learning.html"
     * >Prebuilt Amazon SageMaker Docker Images</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Tensorflow (version &gt;= 1.15)
     * </p>
     * </li>
     * <li>
     * <p>
     * MXNet (version &gt;= 1.6)
     * </p>
     * </li>
     * <li>
     * <p>
     * PyTorch (version &gt;= 1.3)
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * You specify at least one <a>MetricDefinition</a>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enableSageMakerMetricsTimeSeries <p>
     *            To generate and save time-series metrics during training, set
     *            to <code>true</code>. The default is <code>false</code> and
     *            time-series metrics aren't generated except in the following
     *            cases:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            You use one of the Amazon SageMaker built-in algorithms
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            You use one of the following <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/pre-built-containers-frameworks-deep-learning.html"
     *            >Prebuilt Amazon SageMaker Docker Images</a>:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Tensorflow (version &gt;= 1.15)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            MXNet (version &gt;= 1.6)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            PyTorch (version &gt;= 1.3)
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            You specify at least one <a>MetricDefinition</a>
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AlgorithmSpecification withEnableSageMakerMetricsTimeSeries(
            Boolean enableSageMakerMetricsTimeSeries) {
        this.enableSageMakerMetricsTimeSeries = enableSageMakerMetricsTimeSeries;
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
        if (getTrainingImage() != null)
            sb.append("TrainingImage: " + getTrainingImage() + ",");
        if (getAlgorithmName() != null)
            sb.append("AlgorithmName: " + getAlgorithmName() + ",");
        if (getTrainingInputMode() != null)
            sb.append("TrainingInputMode: " + getTrainingInputMode() + ",");
        if (getMetricDefinitions() != null)
            sb.append("MetricDefinitions: " + getMetricDefinitions() + ",");
        if (getEnableSageMakerMetricsTimeSeries() != null)
            sb.append("EnableSageMakerMetricsTimeSeries: " + getEnableSageMakerMetricsTimeSeries());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTrainingImage() == null) ? 0 : getTrainingImage().hashCode());
        hashCode = prime * hashCode
                + ((getAlgorithmName() == null) ? 0 : getAlgorithmName().hashCode());
        hashCode = prime * hashCode
                + ((getTrainingInputMode() == null) ? 0 : getTrainingInputMode().hashCode());
        hashCode = prime * hashCode
                + ((getMetricDefinitions() == null) ? 0 : getMetricDefinitions().hashCode());
        hashCode = prime
                * hashCode
                + ((getEnableSageMakerMetricsTimeSeries() == null) ? 0
                        : getEnableSageMakerMetricsTimeSeries().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AlgorithmSpecification == false)
            return false;
        AlgorithmSpecification other = (AlgorithmSpecification) obj;

        if (other.getTrainingImage() == null ^ this.getTrainingImage() == null)
            return false;
        if (other.getTrainingImage() != null
                && other.getTrainingImage().equals(this.getTrainingImage()) == false)
            return false;
        if (other.getAlgorithmName() == null ^ this.getAlgorithmName() == null)
            return false;
        if (other.getAlgorithmName() != null
                && other.getAlgorithmName().equals(this.getAlgorithmName()) == false)
            return false;
        if (other.getTrainingInputMode() == null ^ this.getTrainingInputMode() == null)
            return false;
        if (other.getTrainingInputMode() != null
                && other.getTrainingInputMode().equals(this.getTrainingInputMode()) == false)
            return false;
        if (other.getMetricDefinitions() == null ^ this.getMetricDefinitions() == null)
            return false;
        if (other.getMetricDefinitions() != null
                && other.getMetricDefinitions().equals(this.getMetricDefinitions()) == false)
            return false;
        if (other.getEnableSageMakerMetricsTimeSeries() == null
                ^ this.getEnableSageMakerMetricsTimeSeries() == null)
            return false;
        if (other.getEnableSageMakerMetricsTimeSeries() != null
                && other.getEnableSageMakerMetricsTimeSeries().equals(
                        this.getEnableSageMakerMetricsTimeSeries()) == false)
            return false;
        return true;
    }
}
