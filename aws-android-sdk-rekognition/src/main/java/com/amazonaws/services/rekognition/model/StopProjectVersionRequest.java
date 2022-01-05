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
 * Stops a running model. The operation might take a while to complete. To check
 * the current status, call <a>DescribeProjectVersions</a>.
 * </p>
 */
public class StopProjectVersionRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model version that you want to
     * delete.
     * </p>
     * <p>
     * This operation requires permissions to perform the
     * <code>rekognition:StopProjectVersion</code> action.
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
     * The Amazon Resource Name (ARN) of the model version that you want to
     * delete.
     * </p>
     * <p>
     * This operation requires permissions to perform the
     * <code>rekognition:StopProjectVersion</code> action.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>(^arn:[a-z\d-]+:rekognition:[a-z\d-]+:\d{12}:project\/[a-zA
     * -Z0-9_.\-]{1,255}\/version\/[a-zA-Z0-9_.\-]{1,255}\/[0-9]+$)<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the model version that you want
     *         to delete.
     *         </p>
     *         <p>
     *         This operation requires permissions to perform the
     *         <code>rekognition:StopProjectVersion</code> action.
     *         </p>
     */
    public String getProjectVersionArn() {
        return projectVersionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model version that you want to
     * delete.
     * </p>
     * <p>
     * This operation requires permissions to perform the
     * <code>rekognition:StopProjectVersion</code> action.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>(^arn:[a-z\d-]+:rekognition:[a-z\d-]+:\d{12}:project\/[a-zA
     * -Z0-9_.\-]{1,255}\/version\/[a-zA-Z0-9_.\-]{1,255}\/[0-9]+$)<br/>
     *
     * @param projectVersionArn <p>
     *            The Amazon Resource Name (ARN) of the model version that you
     *            want to delete.
     *            </p>
     *            <p>
     *            This operation requires permissions to perform the
     *            <code>rekognition:StopProjectVersion</code> action.
     *            </p>
     */
    public void setProjectVersionArn(String projectVersionArn) {
        this.projectVersionArn = projectVersionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model version that you want to
     * delete.
     * </p>
     * <p>
     * This operation requires permissions to perform the
     * <code>rekognition:StopProjectVersion</code> action.
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
     *            The Amazon Resource Name (ARN) of the model version that you
     *            want to delete.
     *            </p>
     *            <p>
     *            This operation requires permissions to perform the
     *            <code>rekognition:StopProjectVersion</code> action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StopProjectVersionRequest withProjectVersionArn(String projectVersionArn) {
        this.projectVersionArn = projectVersionArn;
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
            sb.append("ProjectVersionArn: " + getProjectVersionArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getProjectVersionArn() == null) ? 0 : getProjectVersionArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StopProjectVersionRequest == false)
            return false;
        StopProjectVersionRequest other = (StopProjectVersionRequest) obj;

        if (other.getProjectVersionArn() == null ^ this.getProjectVersionArn() == null)
            return false;
        if (other.getProjectVersionArn() != null
                && other.getProjectVersionArn().equals(this.getProjectVersionArn()) == false)
            return false;
        return true;
    }
}
