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
 * Stops a transform job.
 * </p>
 * <p>
 * When Amazon SageMaker receives a <code>StopTransformJob</code> request, the
 * status of the job changes to <code>Stopping</code>. After Amazon SageMaker
 * stops the job, the status is set to <code>Stopped</code>. When you stop a
 * transform job before it is completed, Amazon SageMaker doesn't store the
 * job's output in Amazon S3.
 * </p>
 */
public class StopTransformJobRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the transform job to stop.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     */
    private String transformJobName;

    /**
     * <p>
     * The name of the transform job to stop.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @return <p>
     *         The name of the transform job to stop.
     *         </p>
     */
    public String getTransformJobName() {
        return transformJobName;
    }

    /**
     * <p>
     * The name of the transform job to stop.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param transformJobName <p>
     *            The name of the transform job to stop.
     *            </p>
     */
    public void setTransformJobName(String transformJobName) {
        this.transformJobName = transformJobName;
    }

    /**
     * <p>
     * The name of the transform job to stop.
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
     *            The name of the transform job to stop.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StopTransformJobRequest withTransformJobName(String transformJobName) {
        this.transformJobName = transformJobName;
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
            sb.append("TransformJobName: " + getTransformJobName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTransformJobName() == null) ? 0 : getTransformJobName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StopTransformJobRequest == false)
            return false;
        StopTransformJobRequest other = (StopTransformJobRequest) obj;

        if (other.getTransformJobName() == null ^ this.getTransformJobName() == null)
            return false;
        if (other.getTransformJobName() != null
                && other.getTransformJobName().equals(this.getTransformJobName()) == false)
            return false;
        return true;
    }
}
