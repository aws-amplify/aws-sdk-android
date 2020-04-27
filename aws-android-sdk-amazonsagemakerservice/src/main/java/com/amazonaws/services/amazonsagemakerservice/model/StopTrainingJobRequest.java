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
 * Stops a training job. To stop a job, Amazon SageMaker sends the algorithm the
 * <code>SIGTERM</code> signal, which delays job termination for 120 seconds.
 * Algorithms might use this 120-second window to save the model artifacts, so
 * the results of the training is not lost.
 * </p>
 * <p>
 * When it receives a <code>StopTrainingJob</code> request, Amazon SageMaker
 * changes the status of the job to <code>Stopping</code>. After Amazon
 * SageMaker stops the job, it sets the status to <code>Stopped</code>.
 * </p>
 */
public class StopTrainingJobRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the training job to stop.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     */
    private String trainingJobName;

    /**
     * <p>
     * The name of the training job to stop.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @return <p>
     *         The name of the training job to stop.
     *         </p>
     */
    public String getTrainingJobName() {
        return trainingJobName;
    }

    /**
     * <p>
     * The name of the training job to stop.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param trainingJobName <p>
     *            The name of the training job to stop.
     *            </p>
     */
    public void setTrainingJobName(String trainingJobName) {
        this.trainingJobName = trainingJobName;
    }

    /**
     * <p>
     * The name of the training job to stop.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param trainingJobName <p>
     *            The name of the training job to stop.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StopTrainingJobRequest withTrainingJobName(String trainingJobName) {
        this.trainingJobName = trainingJobName;
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
        if (getTrainingJobName() != null)
            sb.append("TrainingJobName: " + getTrainingJobName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTrainingJobName() == null) ? 0 : getTrainingJobName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StopTrainingJobRequest == false)
            return false;
        StopTrainingJobRequest other = (StopTrainingJobRequest) obj;

        if (other.getTrainingJobName() == null ^ this.getTrainingJobName() == null)
            return false;
        if (other.getTrainingJobName() != null
                && other.getTrainingJobName().equals(this.getTrainingJobName()) == false)
            return false;
        return true;
    }
}
