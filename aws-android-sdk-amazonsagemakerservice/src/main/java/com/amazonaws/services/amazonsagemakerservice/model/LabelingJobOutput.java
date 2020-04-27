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
 * Specifies the location of the output produced by the labeling job.
 * </p>
 */
public class LabelingJobOutput implements Serializable {
    /**
     * <p>
     * The Amazon S3 bucket location of the manifest file for labeled data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>^(https|s3)://([^/]+)/?(.*)$<br/>
     */
    private String outputDatasetS3Uri;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the most recent Amazon SageMaker model
     * trained as part of automated data labeling.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:model/.*
     * <br/>
     */
    private String finalActiveLearningModelArn;

    /**
     * <p>
     * The Amazon S3 bucket location of the manifest file for labeled data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>^(https|s3)://([^/]+)/?(.*)$<br/>
     *
     * @return <p>
     *         The Amazon S3 bucket location of the manifest file for labeled
     *         data.
     *         </p>
     */
    public String getOutputDatasetS3Uri() {
        return outputDatasetS3Uri;
    }

    /**
     * <p>
     * The Amazon S3 bucket location of the manifest file for labeled data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>^(https|s3)://([^/]+)/?(.*)$<br/>
     *
     * @param outputDatasetS3Uri <p>
     *            The Amazon S3 bucket location of the manifest file for labeled
     *            data.
     *            </p>
     */
    public void setOutputDatasetS3Uri(String outputDatasetS3Uri) {
        this.outputDatasetS3Uri = outputDatasetS3Uri;
    }

    /**
     * <p>
     * The Amazon S3 bucket location of the manifest file for labeled data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>^(https|s3)://([^/]+)/?(.*)$<br/>
     *
     * @param outputDatasetS3Uri <p>
     *            The Amazon S3 bucket location of the manifest file for labeled
     *            data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LabelingJobOutput withOutputDatasetS3Uri(String outputDatasetS3Uri) {
        this.outputDatasetS3Uri = outputDatasetS3Uri;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the most recent Amazon SageMaker model
     * trained as part of automated data labeling.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:model/.*
     * <br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) for the most recent Amazon
     *         SageMaker model trained as part of automated data labeling.
     *         </p>
     */
    public String getFinalActiveLearningModelArn() {
        return finalActiveLearningModelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the most recent Amazon SageMaker model
     * trained as part of automated data labeling.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:model/.*
     * <br/>
     *
     * @param finalActiveLearningModelArn <p>
     *            The Amazon Resource Name (ARN) for the most recent Amazon
     *            SageMaker model trained as part of automated data labeling.
     *            </p>
     */
    public void setFinalActiveLearningModelArn(String finalActiveLearningModelArn) {
        this.finalActiveLearningModelArn = finalActiveLearningModelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the most recent Amazon SageMaker model
     * trained as part of automated data labeling.
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
     * @param finalActiveLearningModelArn <p>
     *            The Amazon Resource Name (ARN) for the most recent Amazon
     *            SageMaker model trained as part of automated data labeling.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LabelingJobOutput withFinalActiveLearningModelArn(String finalActiveLearningModelArn) {
        this.finalActiveLearningModelArn = finalActiveLearningModelArn;
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
        if (getOutputDatasetS3Uri() != null)
            sb.append("OutputDatasetS3Uri: " + getOutputDatasetS3Uri() + ",");
        if (getFinalActiveLearningModelArn() != null)
            sb.append("FinalActiveLearningModelArn: " + getFinalActiveLearningModelArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getOutputDatasetS3Uri() == null) ? 0 : getOutputDatasetS3Uri().hashCode());
        hashCode = prime
                * hashCode
                + ((getFinalActiveLearningModelArn() == null) ? 0
                        : getFinalActiveLearningModelArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LabelingJobOutput == false)
            return false;
        LabelingJobOutput other = (LabelingJobOutput) obj;

        if (other.getOutputDatasetS3Uri() == null ^ this.getOutputDatasetS3Uri() == null)
            return false;
        if (other.getOutputDatasetS3Uri() != null
                && other.getOutputDatasetS3Uri().equals(this.getOutputDatasetS3Uri()) == false)
            return false;
        if (other.getFinalActiveLearningModelArn() == null
                ^ this.getFinalActiveLearningModelArn() == null)
            return false;
        if (other.getFinalActiveLearningModelArn() != null
                && other.getFinalActiveLearningModelArn().equals(
                        this.getFinalActiveLearningModelArn()) == false)
            return false;
        return true;
    }
}
