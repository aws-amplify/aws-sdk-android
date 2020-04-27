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

/**
 * <p>
 * Provides configuration information for auto-labeling of your data objects. A
 * <code>LabelingJobAlgorithmsConfig</code> object must be supplied in order to
 * use auto-labeling.
 * </p>
 */
public class LabelingJobAlgorithmsConfig implements Serializable {
    /**
     * <p>
     * Specifies the Amazon Resource Name (ARN) of the algorithm used for
     * auto-labeling. You must select one of the following ARNs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>Image classification</i>
     * </p>
     * <p>
     * <code>arn:aws:sagemaker:<i>region</i>:027400017018:labeling-job-algorithm-specification/image-classification</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Text classification</i>
     * </p>
     * <p>
     * <code>arn:aws:sagemaker:<i>region</i>:027400017018:labeling-job-algorithm-specification/text-classification</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Object detection</i>
     * </p>
     * <p>
     * <code>arn:aws:sagemaker:<i>region</i>:027400017018:labeling-job-algorithm-specification/object-detection</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Semantic Segmentation</i>
     * </p>
     * <p>
     * <code>arn:aws:sagemaker:<i>region</i>:027400017018:labeling-job-algorithm-specification/semantic-segmentation</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern: </b>arn:.*<br/>
     */
    private String labelingJobAlgorithmSpecificationArn;

    /**
     * <p>
     * At the end of an auto-label job Amazon SageMaker Ground Truth sends the
     * Amazon Resource Nam (ARN) of the final model used for auto-labeling. You
     * can use this model as the starting point for subsequent similar jobs by
     * providing the ARN of the model here.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:model/.*
     * <br/>
     */
    private String initialActiveLearningModelArn;

    /**
     * <p>
     * Provides configuration information for a labeling job.
     * </p>
     */
    private LabelingJobResourceConfig labelingJobResourceConfig;

    /**
     * <p>
     * Specifies the Amazon Resource Name (ARN) of the algorithm used for
     * auto-labeling. You must select one of the following ARNs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>Image classification</i>
     * </p>
     * <p>
     * <code>arn:aws:sagemaker:<i>region</i>:027400017018:labeling-job-algorithm-specification/image-classification</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Text classification</i>
     * </p>
     * <p>
     * <code>arn:aws:sagemaker:<i>region</i>:027400017018:labeling-job-algorithm-specification/text-classification</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Object detection</i>
     * </p>
     * <p>
     * <code>arn:aws:sagemaker:<i>region</i>:027400017018:labeling-job-algorithm-specification/object-detection</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Semantic Segmentation</i>
     * </p>
     * <p>
     * <code>arn:aws:sagemaker:<i>region</i>:027400017018:labeling-job-algorithm-specification/semantic-segmentation</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern: </b>arn:.*<br/>
     *
     * @return <p>
     *         Specifies the Amazon Resource Name (ARN) of the algorithm used
     *         for auto-labeling. You must select one of the following ARNs:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>Image classification</i>
     *         </p>
     *         <p>
     *         <code>arn:aws:sagemaker:<i>region</i>:027400017018:labeling-job-algorithm-specification/image-classification</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Text classification</i>
     *         </p>
     *         <p>
     *         <code>arn:aws:sagemaker:<i>region</i>:027400017018:labeling-job-algorithm-specification/text-classification</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Object detection</i>
     *         </p>
     *         <p>
     *         <code>arn:aws:sagemaker:<i>region</i>:027400017018:labeling-job-algorithm-specification/object-detection</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Semantic Segmentation</i>
     *         </p>
     *         <p>
     *         <code>arn:aws:sagemaker:<i>region</i>:027400017018:labeling-job-algorithm-specification/semantic-segmentation</code>
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getLabelingJobAlgorithmSpecificationArn() {
        return labelingJobAlgorithmSpecificationArn;
    }

    /**
     * <p>
     * Specifies the Amazon Resource Name (ARN) of the algorithm used for
     * auto-labeling. You must select one of the following ARNs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>Image classification</i>
     * </p>
     * <p>
     * <code>arn:aws:sagemaker:<i>region</i>:027400017018:labeling-job-algorithm-specification/image-classification</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Text classification</i>
     * </p>
     * <p>
     * <code>arn:aws:sagemaker:<i>region</i>:027400017018:labeling-job-algorithm-specification/text-classification</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Object detection</i>
     * </p>
     * <p>
     * <code>arn:aws:sagemaker:<i>region</i>:027400017018:labeling-job-algorithm-specification/object-detection</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Semantic Segmentation</i>
     * </p>
     * <p>
     * <code>arn:aws:sagemaker:<i>region</i>:027400017018:labeling-job-algorithm-specification/semantic-segmentation</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern: </b>arn:.*<br/>
     *
     * @param labelingJobAlgorithmSpecificationArn <p>
     *            Specifies the Amazon Resource Name (ARN) of the algorithm used
     *            for auto-labeling. You must select one of the following ARNs:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <i>Image classification</i>
     *            </p>
     *            <p>
     *            <code>arn:aws:sagemaker:<i>region</i>:027400017018:labeling-job-algorithm-specification/image-classification</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>Text classification</i>
     *            </p>
     *            <p>
     *            <code>arn:aws:sagemaker:<i>region</i>:027400017018:labeling-job-algorithm-specification/text-classification</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>Object detection</i>
     *            </p>
     *            <p>
     *            <code>arn:aws:sagemaker:<i>region</i>:027400017018:labeling-job-algorithm-specification/object-detection</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>Semantic Segmentation</i>
     *            </p>
     *            <p>
     *            <code>arn:aws:sagemaker:<i>region</i>:027400017018:labeling-job-algorithm-specification/semantic-segmentation</code>
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setLabelingJobAlgorithmSpecificationArn(String labelingJobAlgorithmSpecificationArn) {
        this.labelingJobAlgorithmSpecificationArn = labelingJobAlgorithmSpecificationArn;
    }

    /**
     * <p>
     * Specifies the Amazon Resource Name (ARN) of the algorithm used for
     * auto-labeling. You must select one of the following ARNs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>Image classification</i>
     * </p>
     * <p>
     * <code>arn:aws:sagemaker:<i>region</i>:027400017018:labeling-job-algorithm-specification/image-classification</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Text classification</i>
     * </p>
     * <p>
     * <code>arn:aws:sagemaker:<i>region</i>:027400017018:labeling-job-algorithm-specification/text-classification</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Object detection</i>
     * </p>
     * <p>
     * <code>arn:aws:sagemaker:<i>region</i>:027400017018:labeling-job-algorithm-specification/object-detection</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Semantic Segmentation</i>
     * </p>
     * <p>
     * <code>arn:aws:sagemaker:<i>region</i>:027400017018:labeling-job-algorithm-specification/semantic-segmentation</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern: </b>arn:.*<br/>
     *
     * @param labelingJobAlgorithmSpecificationArn <p>
     *            Specifies the Amazon Resource Name (ARN) of the algorithm used
     *            for auto-labeling. You must select one of the following ARNs:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <i>Image classification</i>
     *            </p>
     *            <p>
     *            <code>arn:aws:sagemaker:<i>region</i>:027400017018:labeling-job-algorithm-specification/image-classification</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>Text classification</i>
     *            </p>
     *            <p>
     *            <code>arn:aws:sagemaker:<i>region</i>:027400017018:labeling-job-algorithm-specification/text-classification</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>Object detection</i>
     *            </p>
     *            <p>
     *            <code>arn:aws:sagemaker:<i>region</i>:027400017018:labeling-job-algorithm-specification/object-detection</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>Semantic Segmentation</i>
     *            </p>
     *            <p>
     *            <code>arn:aws:sagemaker:<i>region</i>:027400017018:labeling-job-algorithm-specification/semantic-segmentation</code>
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LabelingJobAlgorithmsConfig withLabelingJobAlgorithmSpecificationArn(
            String labelingJobAlgorithmSpecificationArn) {
        this.labelingJobAlgorithmSpecificationArn = labelingJobAlgorithmSpecificationArn;
        return this;
    }

    /**
     * <p>
     * At the end of an auto-label job Amazon SageMaker Ground Truth sends the
     * Amazon Resource Nam (ARN) of the final model used for auto-labeling. You
     * can use this model as the starting point for subsequent similar jobs by
     * providing the ARN of the model here.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:model/.*
     * <br/>
     *
     * @return <p>
     *         At the end of an auto-label job Amazon SageMaker Ground Truth
     *         sends the Amazon Resource Nam (ARN) of the final model used for
     *         auto-labeling. You can use this model as the starting point for
     *         subsequent similar jobs by providing the ARN of the model here.
     *         </p>
     */
    public String getInitialActiveLearningModelArn() {
        return initialActiveLearningModelArn;
    }

    /**
     * <p>
     * At the end of an auto-label job Amazon SageMaker Ground Truth sends the
     * Amazon Resource Nam (ARN) of the final model used for auto-labeling. You
     * can use this model as the starting point for subsequent similar jobs by
     * providing the ARN of the model here.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:model/.*
     * <br/>
     *
     * @param initialActiveLearningModelArn <p>
     *            At the end of an auto-label job Amazon SageMaker Ground Truth
     *            sends the Amazon Resource Nam (ARN) of the final model used
     *            for auto-labeling. You can use this model as the starting
     *            point for subsequent similar jobs by providing the ARN of the
     *            model here.
     *            </p>
     */
    public void setInitialActiveLearningModelArn(String initialActiveLearningModelArn) {
        this.initialActiveLearningModelArn = initialActiveLearningModelArn;
    }

    /**
     * <p>
     * At the end of an auto-label job Amazon SageMaker Ground Truth sends the
     * Amazon Resource Nam (ARN) of the final model used for auto-labeling. You
     * can use this model as the starting point for subsequent similar jobs by
     * providing the ARN of the model here.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:model/.*
     * <br/>
     *
     * @param initialActiveLearningModelArn <p>
     *            At the end of an auto-label job Amazon SageMaker Ground Truth
     *            sends the Amazon Resource Nam (ARN) of the final model used
     *            for auto-labeling. You can use this model as the starting
     *            point for subsequent similar jobs by providing the ARN of the
     *            model here.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LabelingJobAlgorithmsConfig withInitialActiveLearningModelArn(
            String initialActiveLearningModelArn) {
        this.initialActiveLearningModelArn = initialActiveLearningModelArn;
        return this;
    }

    /**
     * <p>
     * Provides configuration information for a labeling job.
     * </p>
     *
     * @return <p>
     *         Provides configuration information for a labeling job.
     *         </p>
     */
    public LabelingJobResourceConfig getLabelingJobResourceConfig() {
        return labelingJobResourceConfig;
    }

    /**
     * <p>
     * Provides configuration information for a labeling job.
     * </p>
     *
     * @param labelingJobResourceConfig <p>
     *            Provides configuration information for a labeling job.
     *            </p>
     */
    public void setLabelingJobResourceConfig(LabelingJobResourceConfig labelingJobResourceConfig) {
        this.labelingJobResourceConfig = labelingJobResourceConfig;
    }

    /**
     * <p>
     * Provides configuration information for a labeling job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param labelingJobResourceConfig <p>
     *            Provides configuration information for a labeling job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LabelingJobAlgorithmsConfig withLabelingJobResourceConfig(
            LabelingJobResourceConfig labelingJobResourceConfig) {
        this.labelingJobResourceConfig = labelingJobResourceConfig;
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
        if (getLabelingJobAlgorithmSpecificationArn() != null)
            sb.append("LabelingJobAlgorithmSpecificationArn: "
                    + getLabelingJobAlgorithmSpecificationArn() + ",");
        if (getInitialActiveLearningModelArn() != null)
            sb.append("InitialActiveLearningModelArn: " + getInitialActiveLearningModelArn() + ",");
        if (getLabelingJobResourceConfig() != null)
            sb.append("LabelingJobResourceConfig: " + getLabelingJobResourceConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getLabelingJobAlgorithmSpecificationArn() == null) ? 0
                        : getLabelingJobAlgorithmSpecificationArn().hashCode());
        hashCode = prime
                * hashCode
                + ((getInitialActiveLearningModelArn() == null) ? 0
                        : getInitialActiveLearningModelArn().hashCode());
        hashCode = prime
                * hashCode
                + ((getLabelingJobResourceConfig() == null) ? 0 : getLabelingJobResourceConfig()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LabelingJobAlgorithmsConfig == false)
            return false;
        LabelingJobAlgorithmsConfig other = (LabelingJobAlgorithmsConfig) obj;

        if (other.getLabelingJobAlgorithmSpecificationArn() == null
                ^ this.getLabelingJobAlgorithmSpecificationArn() == null)
            return false;
        if (other.getLabelingJobAlgorithmSpecificationArn() != null
                && other.getLabelingJobAlgorithmSpecificationArn().equals(
                        this.getLabelingJobAlgorithmSpecificationArn()) == false)
            return false;
        if (other.getInitialActiveLearningModelArn() == null
                ^ this.getInitialActiveLearningModelArn() == null)
            return false;
        if (other.getInitialActiveLearningModelArn() != null
                && other.getInitialActiveLearningModelArn().equals(
                        this.getInitialActiveLearningModelArn()) == false)
            return false;
        if (other.getLabelingJobResourceConfig() == null
                ^ this.getLabelingJobResourceConfig() == null)
            return false;
        if (other.getLabelingJobResourceConfig() != null
                && other.getLabelingJobResourceConfig().equals(this.getLabelingJobResourceConfig()) == false)
            return false;
        return true;
    }
}
