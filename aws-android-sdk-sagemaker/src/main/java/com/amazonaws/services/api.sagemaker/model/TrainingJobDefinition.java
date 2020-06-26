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
 * Defines the input needed to run a training job using the algorithm.
 * </p>
 */
public class TrainingJobDefinition implements Serializable {
    /**
     * <p>
     * The input mode used by the algorithm for the training job. For the input
     * modes that Amazon SageMaker algorithms support, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/algos.html"
     * >Algorithms</a>.
     * </p>
     * <p>
     * If an algorithm supports the <code>File</code> input mode, Amazon
     * SageMaker downloads the training data from S3 to the provisioned ML
     * storage Volume, and mounts the directory to docker volume for training
     * container. If an algorithm supports the <code>Pipe</code> input mode,
     * Amazon SageMaker streams data directly from S3 to the container.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pipe, File
     */
    private String trainingInputMode;

    /**
     * <p>
     * The hyperparameters used for the training job.
     * </p>
     */
    private java.util.Map<String, String> hyperParameters;

    /**
     * <p>
     * An array of <code>Channel</code> objects, each of which specifies an
     * input source.
     * </p>
     */
    private java.util.List<Channel> inputDataConfig;

    /**
     * <p>
     * the path to the S3 bucket where you want to store model artifacts. Amazon
     * SageMaker creates subfolders for the artifacts.
     * </p>
     */
    private OutputDataConfig outputDataConfig;

    /**
     * <p>
     * The resources, including the ML compute instances and ML storage volumes,
     * to use for model training.
     * </p>
     */
    private ResourceConfig resourceConfig;

    /**
     * <p>
     * Specifies a limit to how long a model training job can run. When the job
     * reaches the time limit, Amazon SageMaker ends the training job. Use this
     * API to cap model training costs.
     * </p>
     * <p>
     * To stop a job, Amazon SageMaker sends the algorithm the SIGTERM signal,
     * which delays job termination for 120 seconds. Algorithms can use this
     * 120-second window to save the model artifacts.
     * </p>
     */
    private StoppingCondition stoppingCondition;

    /**
     * <p>
     * The input mode used by the algorithm for the training job. For the input
     * modes that Amazon SageMaker algorithms support, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/algos.html"
     * >Algorithms</a>.
     * </p>
     * <p>
     * If an algorithm supports the <code>File</code> input mode, Amazon
     * SageMaker downloads the training data from S3 to the provisioned ML
     * storage Volume, and mounts the directory to docker volume for training
     * container. If an algorithm supports the <code>Pipe</code> input mode,
     * Amazon SageMaker streams data directly from S3 to the container.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pipe, File
     *
     * @return <p>
     *         The input mode used by the algorithm for the training job. For
     *         the input modes that Amazon SageMaker algorithms support, see <a
     *         href
     *         ="https://docs.aws.amazon.com/sagemaker/latest/dg/algos.html">
     *         Algorithms</a>.
     *         </p>
     *         <p>
     *         If an algorithm supports the <code>File</code> input mode, Amazon
     *         SageMaker downloads the training data from S3 to the provisioned
     *         ML storage Volume, and mounts the directory to docker volume for
     *         training container. If an algorithm supports the
     *         <code>Pipe</code> input mode, Amazon SageMaker streams data
     *         directly from S3 to the container.
     *         </p>
     * @see TrainingInputMode
     */
    public String getTrainingInputMode() {
        return trainingInputMode;
    }

    /**
     * <p>
     * The input mode used by the algorithm for the training job. For the input
     * modes that Amazon SageMaker algorithms support, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/algos.html"
     * >Algorithms</a>.
     * </p>
     * <p>
     * If an algorithm supports the <code>File</code> input mode, Amazon
     * SageMaker downloads the training data from S3 to the provisioned ML
     * storage Volume, and mounts the directory to docker volume for training
     * container. If an algorithm supports the <code>Pipe</code> input mode,
     * Amazon SageMaker streams data directly from S3 to the container.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pipe, File
     *
     * @param trainingInputMode <p>
     *            The input mode used by the algorithm for the training job. For
     *            the input modes that Amazon SageMaker algorithms support, see
     *            <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/algos.html"
     *            >Algorithms</a>.
     *            </p>
     *            <p>
     *            If an algorithm supports the <code>File</code> input mode,
     *            Amazon SageMaker downloads the training data from S3 to the
     *            provisioned ML storage Volume, and mounts the directory to
     *            docker volume for training container. If an algorithm supports
     *            the <code>Pipe</code> input mode, Amazon SageMaker streams
     *            data directly from S3 to the container.
     *            </p>
     * @see TrainingInputMode
     */
    public void setTrainingInputMode(String trainingInputMode) {
        this.trainingInputMode = trainingInputMode;
    }

    /**
     * <p>
     * The input mode used by the algorithm for the training job. For the input
     * modes that Amazon SageMaker algorithms support, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/algos.html"
     * >Algorithms</a>.
     * </p>
     * <p>
     * If an algorithm supports the <code>File</code> input mode, Amazon
     * SageMaker downloads the training data from S3 to the provisioned ML
     * storage Volume, and mounts the directory to docker volume for training
     * container. If an algorithm supports the <code>Pipe</code> input mode,
     * Amazon SageMaker streams data directly from S3 to the container.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pipe, File
     *
     * @param trainingInputMode <p>
     *            The input mode used by the algorithm for the training job. For
     *            the input modes that Amazon SageMaker algorithms support, see
     *            <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/algos.html"
     *            >Algorithms</a>.
     *            </p>
     *            <p>
     *            If an algorithm supports the <code>File</code> input mode,
     *            Amazon SageMaker downloads the training data from S3 to the
     *            provisioned ML storage Volume, and mounts the directory to
     *            docker volume for training container. If an algorithm supports
     *            the <code>Pipe</code> input mode, Amazon SageMaker streams
     *            data directly from S3 to the container.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TrainingInputMode
     */
    public TrainingJobDefinition withTrainingInputMode(String trainingInputMode) {
        this.trainingInputMode = trainingInputMode;
        return this;
    }

    /**
     * <p>
     * The input mode used by the algorithm for the training job. For the input
     * modes that Amazon SageMaker algorithms support, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/algos.html"
     * >Algorithms</a>.
     * </p>
     * <p>
     * If an algorithm supports the <code>File</code> input mode, Amazon
     * SageMaker downloads the training data from S3 to the provisioned ML
     * storage Volume, and mounts the directory to docker volume for training
     * container. If an algorithm supports the <code>Pipe</code> input mode,
     * Amazon SageMaker streams data directly from S3 to the container.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pipe, File
     *
     * @param trainingInputMode <p>
     *            The input mode used by the algorithm for the training job. For
     *            the input modes that Amazon SageMaker algorithms support, see
     *            <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/algos.html"
     *            >Algorithms</a>.
     *            </p>
     *            <p>
     *            If an algorithm supports the <code>File</code> input mode,
     *            Amazon SageMaker downloads the training data from S3 to the
     *            provisioned ML storage Volume, and mounts the directory to
     *            docker volume for training container. If an algorithm supports
     *            the <code>Pipe</code> input mode, Amazon SageMaker streams
     *            data directly from S3 to the container.
     *            </p>
     * @see TrainingInputMode
     */
    public void setTrainingInputMode(TrainingInputMode trainingInputMode) {
        this.trainingInputMode = trainingInputMode.toString();
    }

    /**
     * <p>
     * The input mode used by the algorithm for the training job. For the input
     * modes that Amazon SageMaker algorithms support, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/algos.html"
     * >Algorithms</a>.
     * </p>
     * <p>
     * If an algorithm supports the <code>File</code> input mode, Amazon
     * SageMaker downloads the training data from S3 to the provisioned ML
     * storage Volume, and mounts the directory to docker volume for training
     * container. If an algorithm supports the <code>Pipe</code> input mode,
     * Amazon SageMaker streams data directly from S3 to the container.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pipe, File
     *
     * @param trainingInputMode <p>
     *            The input mode used by the algorithm for the training job. For
     *            the input modes that Amazon SageMaker algorithms support, see
     *            <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/algos.html"
     *            >Algorithms</a>.
     *            </p>
     *            <p>
     *            If an algorithm supports the <code>File</code> input mode,
     *            Amazon SageMaker downloads the training data from S3 to the
     *            provisioned ML storage Volume, and mounts the directory to
     *            docker volume for training container. If an algorithm supports
     *            the <code>Pipe</code> input mode, Amazon SageMaker streams
     *            data directly from S3 to the container.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TrainingInputMode
     */
    public TrainingJobDefinition withTrainingInputMode(TrainingInputMode trainingInputMode) {
        this.trainingInputMode = trainingInputMode.toString();
        return this;
    }

    /**
     * <p>
     * The hyperparameters used for the training job.
     * </p>
     *
     * @return <p>
     *         The hyperparameters used for the training job.
     *         </p>
     */
    public java.util.Map<String, String> getHyperParameters() {
        return hyperParameters;
    }

    /**
     * <p>
     * The hyperparameters used for the training job.
     * </p>
     *
     * @param hyperParameters <p>
     *            The hyperparameters used for the training job.
     *            </p>
     */
    public void setHyperParameters(java.util.Map<String, String> hyperParameters) {
        this.hyperParameters = hyperParameters;
    }

    /**
     * <p>
     * The hyperparameters used for the training job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hyperParameters <p>
     *            The hyperparameters used for the training job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrainingJobDefinition withHyperParameters(java.util.Map<String, String> hyperParameters) {
        this.hyperParameters = hyperParameters;
        return this;
    }

    /**
     * <p>
     * The hyperparameters used for the training job.
     * </p>
     * <p>
     * The method adds a new key-value pair into HyperParameters parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into HyperParameters.
     * @param value The corresponding value of the entry to be added into
     *            HyperParameters.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrainingJobDefinition addHyperParametersEntry(String key, String value) {
        if (null == this.hyperParameters) {
            this.hyperParameters = new java.util.HashMap<String, String>();
        }
        if (this.hyperParameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.hyperParameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into HyperParameters.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public TrainingJobDefinition clearHyperParametersEntries() {
        this.hyperParameters = null;
        return this;
    }

    /**
     * <p>
     * An array of <code>Channel</code> objects, each of which specifies an
     * input source.
     * </p>
     *
     * @return <p>
     *         An array of <code>Channel</code> objects, each of which specifies
     *         an input source.
     *         </p>
     */
    public java.util.List<Channel> getInputDataConfig() {
        return inputDataConfig;
    }

    /**
     * <p>
     * An array of <code>Channel</code> objects, each of which specifies an
     * input source.
     * </p>
     *
     * @param inputDataConfig <p>
     *            An array of <code>Channel</code> objects, each of which
     *            specifies an input source.
     *            </p>
     */
    public void setInputDataConfig(java.util.Collection<Channel> inputDataConfig) {
        if (inputDataConfig == null) {
            this.inputDataConfig = null;
            return;
        }

        this.inputDataConfig = new java.util.ArrayList<Channel>(inputDataConfig);
    }

    /**
     * <p>
     * An array of <code>Channel</code> objects, each of which specifies an
     * input source.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inputDataConfig <p>
     *            An array of <code>Channel</code> objects, each of which
     *            specifies an input source.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrainingJobDefinition withInputDataConfig(Channel... inputDataConfig) {
        if (getInputDataConfig() == null) {
            this.inputDataConfig = new java.util.ArrayList<Channel>(inputDataConfig.length);
        }
        for (Channel value : inputDataConfig) {
            this.inputDataConfig.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>Channel</code> objects, each of which specifies an
     * input source.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inputDataConfig <p>
     *            An array of <code>Channel</code> objects, each of which
     *            specifies an input source.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrainingJobDefinition withInputDataConfig(java.util.Collection<Channel> inputDataConfig) {
        setInputDataConfig(inputDataConfig);
        return this;
    }

    /**
     * <p>
     * the path to the S3 bucket where you want to store model artifacts. Amazon
     * SageMaker creates subfolders for the artifacts.
     * </p>
     *
     * @return <p>
     *         the path to the S3 bucket where you want to store model
     *         artifacts. Amazon SageMaker creates subfolders for the artifacts.
     *         </p>
     */
    public OutputDataConfig getOutputDataConfig() {
        return outputDataConfig;
    }

    /**
     * <p>
     * the path to the S3 bucket where you want to store model artifacts. Amazon
     * SageMaker creates subfolders for the artifacts.
     * </p>
     *
     * @param outputDataConfig <p>
     *            the path to the S3 bucket where you want to store model
     *            artifacts. Amazon SageMaker creates subfolders for the
     *            artifacts.
     *            </p>
     */
    public void setOutputDataConfig(OutputDataConfig outputDataConfig) {
        this.outputDataConfig = outputDataConfig;
    }

    /**
     * <p>
     * the path to the S3 bucket where you want to store model artifacts. Amazon
     * SageMaker creates subfolders for the artifacts.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param outputDataConfig <p>
     *            the path to the S3 bucket where you want to store model
     *            artifacts. Amazon SageMaker creates subfolders for the
     *            artifacts.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrainingJobDefinition withOutputDataConfig(OutputDataConfig outputDataConfig) {
        this.outputDataConfig = outputDataConfig;
        return this;
    }

    /**
     * <p>
     * The resources, including the ML compute instances and ML storage volumes,
     * to use for model training.
     * </p>
     *
     * @return <p>
     *         The resources, including the ML compute instances and ML storage
     *         volumes, to use for model training.
     *         </p>
     */
    public ResourceConfig getResourceConfig() {
        return resourceConfig;
    }

    /**
     * <p>
     * The resources, including the ML compute instances and ML storage volumes,
     * to use for model training.
     * </p>
     *
     * @param resourceConfig <p>
     *            The resources, including the ML compute instances and ML
     *            storage volumes, to use for model training.
     *            </p>
     */
    public void setResourceConfig(ResourceConfig resourceConfig) {
        this.resourceConfig = resourceConfig;
    }

    /**
     * <p>
     * The resources, including the ML compute instances and ML storage volumes,
     * to use for model training.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceConfig <p>
     *            The resources, including the ML compute instances and ML
     *            storage volumes, to use for model training.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrainingJobDefinition withResourceConfig(ResourceConfig resourceConfig) {
        this.resourceConfig = resourceConfig;
        return this;
    }

    /**
     * <p>
     * Specifies a limit to how long a model training job can run. When the job
     * reaches the time limit, Amazon SageMaker ends the training job. Use this
     * API to cap model training costs.
     * </p>
     * <p>
     * To stop a job, Amazon SageMaker sends the algorithm the SIGTERM signal,
     * which delays job termination for 120 seconds. Algorithms can use this
     * 120-second window to save the model artifacts.
     * </p>
     *
     * @return <p>
     *         Specifies a limit to how long a model training job can run. When
     *         the job reaches the time limit, Amazon SageMaker ends the
     *         training job. Use this API to cap model training costs.
     *         </p>
     *         <p>
     *         To stop a job, Amazon SageMaker sends the algorithm the SIGTERM
     *         signal, which delays job termination for 120 seconds. Algorithms
     *         can use this 120-second window to save the model artifacts.
     *         </p>
     */
    public StoppingCondition getStoppingCondition() {
        return stoppingCondition;
    }

    /**
     * <p>
     * Specifies a limit to how long a model training job can run. When the job
     * reaches the time limit, Amazon SageMaker ends the training job. Use this
     * API to cap model training costs.
     * </p>
     * <p>
     * To stop a job, Amazon SageMaker sends the algorithm the SIGTERM signal,
     * which delays job termination for 120 seconds. Algorithms can use this
     * 120-second window to save the model artifacts.
     * </p>
     *
     * @param stoppingCondition <p>
     *            Specifies a limit to how long a model training job can run.
     *            When the job reaches the time limit, Amazon SageMaker ends the
     *            training job. Use this API to cap model training costs.
     *            </p>
     *            <p>
     *            To stop a job, Amazon SageMaker sends the algorithm the
     *            SIGTERM signal, which delays job termination for 120 seconds.
     *            Algorithms can use this 120-second window to save the model
     *            artifacts.
     *            </p>
     */
    public void setStoppingCondition(StoppingCondition stoppingCondition) {
        this.stoppingCondition = stoppingCondition;
    }

    /**
     * <p>
     * Specifies a limit to how long a model training job can run. When the job
     * reaches the time limit, Amazon SageMaker ends the training job. Use this
     * API to cap model training costs.
     * </p>
     * <p>
     * To stop a job, Amazon SageMaker sends the algorithm the SIGTERM signal,
     * which delays job termination for 120 seconds. Algorithms can use this
     * 120-second window to save the model artifacts.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stoppingCondition <p>
     *            Specifies a limit to how long a model training job can run.
     *            When the job reaches the time limit, Amazon SageMaker ends the
     *            training job. Use this API to cap model training costs.
     *            </p>
     *            <p>
     *            To stop a job, Amazon SageMaker sends the algorithm the
     *            SIGTERM signal, which delays job termination for 120 seconds.
     *            Algorithms can use this 120-second window to save the model
     *            artifacts.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrainingJobDefinition withStoppingCondition(StoppingCondition stoppingCondition) {
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
        if (getTrainingInputMode() != null)
            sb.append("TrainingInputMode: " + getTrainingInputMode() + ",");
        if (getHyperParameters() != null)
            sb.append("HyperParameters: " + getHyperParameters() + ",");
        if (getInputDataConfig() != null)
            sb.append("InputDataConfig: " + getInputDataConfig() + ",");
        if (getOutputDataConfig() != null)
            sb.append("OutputDataConfig: " + getOutputDataConfig() + ",");
        if (getResourceConfig() != null)
            sb.append("ResourceConfig: " + getResourceConfig() + ",");
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
                + ((getTrainingInputMode() == null) ? 0 : getTrainingInputMode().hashCode());
        hashCode = prime * hashCode
                + ((getHyperParameters() == null) ? 0 : getHyperParameters().hashCode());
        hashCode = prime * hashCode
                + ((getInputDataConfig() == null) ? 0 : getInputDataConfig().hashCode());
        hashCode = prime * hashCode
                + ((getOutputDataConfig() == null) ? 0 : getOutputDataConfig().hashCode());
        hashCode = prime * hashCode
                + ((getResourceConfig() == null) ? 0 : getResourceConfig().hashCode());
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

        if (obj instanceof TrainingJobDefinition == false)
            return false;
        TrainingJobDefinition other = (TrainingJobDefinition) obj;

        if (other.getTrainingInputMode() == null ^ this.getTrainingInputMode() == null)
            return false;
        if (other.getTrainingInputMode() != null
                && other.getTrainingInputMode().equals(this.getTrainingInputMode()) == false)
            return false;
        if (other.getHyperParameters() == null ^ this.getHyperParameters() == null)
            return false;
        if (other.getHyperParameters() != null
                && other.getHyperParameters().equals(this.getHyperParameters()) == false)
            return false;
        if (other.getInputDataConfig() == null ^ this.getInputDataConfig() == null)
            return false;
        if (other.getInputDataConfig() != null
                && other.getInputDataConfig().equals(this.getInputDataConfig()) == false)
            return false;
        if (other.getOutputDataConfig() == null ^ this.getOutputDataConfig() == null)
            return false;
        if (other.getOutputDataConfig() != null
                && other.getOutputDataConfig().equals(this.getOutputDataConfig()) == false)
            return false;
        if (other.getResourceConfig() == null ^ this.getResourceConfig() == null)
            return false;
        if (other.getResourceConfig() != null
                && other.getResourceConfig().equals(this.getResourceConfig()) == false)
            return false;
        if (other.getStoppingCondition() == null ^ this.getStoppingCondition() == null)
            return false;
        if (other.getStoppingCondition() != null
                && other.getStoppingCondition().equals(this.getStoppingCondition()) == false)
            return false;
        return true;
    }
}
