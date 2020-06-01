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

public class CreateLabelingJobResult implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the labeling job. You use this ARN to
     * identify the labeling job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:labeling-job/.*<br/>
     */
    private String labelingJobArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the labeling job. You use this ARN to
     * identify the labeling job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:labeling-job/.*<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the labeling job. You use this
     *         ARN to identify the labeling job.
     *         </p>
     */
    public String getLabelingJobArn() {
        return labelingJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the labeling job. You use this ARN to
     * identify the labeling job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:labeling-job/.*<br/>
     *
     * @param labelingJobArn <p>
     *            The Amazon Resource Name (ARN) of the labeling job. You use
     *            this ARN to identify the labeling job.
     *            </p>
     */
    public void setLabelingJobArn(String labelingJobArn) {
        this.labelingJobArn = labelingJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the labeling job. You use this ARN to
     * identify the labeling job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:labeling-job/.*<br/>
     *
     * @param labelingJobArn <p>
     *            The Amazon Resource Name (ARN) of the labeling job. You use
     *            this ARN to identify the labeling job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateLabelingJobResult withLabelingJobArn(String labelingJobArn) {
        this.labelingJobArn = labelingJobArn;
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
        if (getLabelingJobArn() != null)
            sb.append("LabelingJobArn: " + getLabelingJobArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getLabelingJobArn() == null) ? 0 : getLabelingJobArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateLabelingJobResult == false)
            return false;
        CreateLabelingJobResult other = (CreateLabelingJobResult) obj;

        if (other.getLabelingJobArn() == null ^ this.getLabelingJobArn() == null)
            return false;
        if (other.getLabelingJobArn() != null
                && other.getLabelingJobArn().equals(this.getLabelingJobArn()) == false)
            return false;
        return true;
    }
}
