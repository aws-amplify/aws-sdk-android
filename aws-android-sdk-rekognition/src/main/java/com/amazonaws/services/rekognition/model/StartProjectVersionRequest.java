/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Starts the running of the version of a model. Starting a model takes a while
 * to complete. To check the current state of the model, use
 * <a>DescribeProjectVersions</a>.
 * </p>
 * <p>
 * Once the model is running, you can detect custom labels in new images by
 * calling <a>DetectCustomLabels</a>.
 * </p>
 * <note>
 * <p>
 * You are charged for the amount of time that the model is running. To stop a
 * running model, call <a>StopProjectVersion</a>.
 * </p>
 * </note>
 * <p>
 * This operation requires permissions to perform the
 * <code>rekognition:StartProjectVersion</code> action.
 * </p>
 */
public class StartProjectVersionRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name(ARN) of the model version that you want to
     * start.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>(^arn:[a-z\d-]+:rekognition:[a-z\d-]+:\d{12}:project\/[a-zA
     * -Z0-9_.\-]{1,255}\/version\/[a-zA-Z0-9_.\-]{1,255}\/[0-9]+$)<br/>
     */
    private String projectVersionArn;

    /**
     * <p>
     * The minimum number of inference units to use. A single inference unit
     * represents 1 hour of processing and can support up to 5 Transaction Pers
     * Second (TPS). Use a higher number to increase the TPS throughput of your
     * model. You are charged for the number of inference units that you use.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Integer minInferenceUnits;

    /**
     * <p>
     * The Amazon Resource Name(ARN) of the model version that you want to
     * start.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>(^arn:[a-z\d-]+:rekognition:[a-z\d-]+:\d{12}:project\/[a-zA
     * -Z0-9_.\-]{1,255}\/version\/[a-zA-Z0-9_.\-]{1,255}\/[0-9]+$)<br/>
     *
     * @return <p>
     *         The Amazon Resource Name(ARN) of the model version that you want
     *         to start.
     *         </p>
     */
    public String getProjectVersionArn() {
        return projectVersionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name(ARN) of the model version that you want to
     * start.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>(^arn:[a-z\d-]+:rekognition:[a-z\d-]+:\d{12}:project\/[a-zA
     * -Z0-9_.\-]{1,255}\/version\/[a-zA-Z0-9_.\-]{1,255}\/[0-9]+$)<br/>
     *
     * @param projectVersionArn <p>
     *            The Amazon Resource Name(ARN) of the model version that you
     *            want to start.
     *            </p>
     */
    public void setProjectVersionArn(String projectVersionArn) {
        this.projectVersionArn = projectVersionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name(ARN) of the model version that you want to
     * start.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>(^arn:[a-z\d-]+:rekognition:[a-z\d-]+:\d{12}:project\/[a-zA
     * -Z0-9_.\-]{1,255}\/version\/[a-zA-Z0-9_.\-]{1,255}\/[0-9]+$)<br/>
     *
     * @param projectVersionArn <p>
     *            The Amazon Resource Name(ARN) of the model version that you
     *            want to start.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartProjectVersionRequest withProjectVersionArn(String projectVersionArn) {
        this.projectVersionArn = projectVersionArn;
        return this;
    }

    /**
     * <p>
     * The minimum number of inference units to use. A single inference unit
     * represents 1 hour of processing and can support up to 5 Transaction Pers
     * Second (TPS). Use a higher number to increase the TPS throughput of your
     * model. You are charged for the number of inference units that you use.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return <p>
     *         The minimum number of inference units to use. A single inference
     *         unit represents 1 hour of processing and can support up to 5
     *         Transaction Pers Second (TPS). Use a higher number to increase
     *         the TPS throughput of your model. You are charged for the number
     *         of inference units that you use.
     *         </p>
     */
    public Integer getMinInferenceUnits() {
        return minInferenceUnits;
    }

    /**
     * <p>
     * The minimum number of inference units to use. A single inference unit
     * represents 1 hour of processing and can support up to 5 Transaction Pers
     * Second (TPS). Use a higher number to increase the TPS throughput of your
     * model. You are charged for the number of inference units that you use.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param minInferenceUnits <p>
     *            The minimum number of inference units to use. A single
     *            inference unit represents 1 hour of processing and can support
     *            up to 5 Transaction Pers Second (TPS). Use a higher number to
     *            increase the TPS throughput of your model. You are charged for
     *            the number of inference units that you use.
     *            </p>
     */
    public void setMinInferenceUnits(Integer minInferenceUnits) {
        this.minInferenceUnits = minInferenceUnits;
    }

    /**
     * <p>
     * The minimum number of inference units to use. A single inference unit
     * represents 1 hour of processing and can support up to 5 Transaction Pers
     * Second (TPS). Use a higher number to increase the TPS throughput of your
     * model. You are charged for the number of inference units that you use.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param minInferenceUnits <p>
     *            The minimum number of inference units to use. A single
     *            inference unit represents 1 hour of processing and can support
     *            up to 5 Transaction Pers Second (TPS). Use a higher number to
     *            increase the TPS throughput of your model. You are charged for
     *            the number of inference units that you use.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartProjectVersionRequest withMinInferenceUnits(Integer minInferenceUnits) {
        this.minInferenceUnits = minInferenceUnits;
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
        if (getProjectVersionArn() != null)
            sb.append("ProjectVersionArn: " + getProjectVersionArn() + ",");
        if (getMinInferenceUnits() != null)
            sb.append("MinInferenceUnits: " + getMinInferenceUnits());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getProjectVersionArn() == null) ? 0 : getProjectVersionArn().hashCode());
        hashCode = prime * hashCode
                + ((getMinInferenceUnits() == null) ? 0 : getMinInferenceUnits().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartProjectVersionRequest == false)
            return false;
        StartProjectVersionRequest other = (StartProjectVersionRequest) obj;

        if (other.getProjectVersionArn() == null ^ this.getProjectVersionArn() == null)
            return false;
        if (other.getProjectVersionArn() != null
                && other.getProjectVersionArn().equals(this.getProjectVersionArn()) == false)
            return false;
        if (other.getMinInferenceUnits() == null ^ this.getMinInferenceUnits() == null)
            return false;
        if (other.getMinInferenceUnits() != null
                && other.getMinInferenceUnits().equals(this.getMinInferenceUnits()) == false)
            return false;
        return true;
    }
}
