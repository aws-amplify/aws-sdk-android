/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

public class CreateStreamProcessorResult implements Serializable {
    /**
     * <p>
     * ARN for the newly create stream processor.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>(^arn:[a-z\d-]+:rekognition:[a-z\d-]+:\d{12}:streamprocessor\/.+$)
     * <br/>
     */
    private String streamProcessorArn;

    /**
     * <p>
     * ARN for the newly create stream processor.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>(^arn:[a-z\d-]+:rekognition:[a-z\d-]+:\d{12}:streamprocessor\/.+$)
     * <br/>
     *
     * @return <p>
     *         ARN for the newly create stream processor.
     *         </p>
     */
    public String getStreamProcessorArn() {
        return streamProcessorArn;
    }

    /**
     * <p>
     * ARN for the newly create stream processor.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>(^arn:[a-z\d-]+:rekognition:[a-z\d-]+:\d{12}:streamprocessor\/.+$)
     * <br/>
     *
     * @param streamProcessorArn <p>
     *            ARN for the newly create stream processor.
     *            </p>
     */
    public void setStreamProcessorArn(String streamProcessorArn) {
        this.streamProcessorArn = streamProcessorArn;
    }

    /**
     * <p>
     * ARN for the newly create stream processor.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>(^arn:[a-z\d-]+:rekognition:[a-z\d-]+:\d{12}:streamprocessor\/.+$)
     * <br/>
     *
     * @param streamProcessorArn <p>
     *            ARN for the newly create stream processor.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateStreamProcessorResult withStreamProcessorArn(String streamProcessorArn) {
        this.streamProcessorArn = streamProcessorArn;
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
        if (getStreamProcessorArn() != null)
            sb.append("StreamProcessorArn: " + getStreamProcessorArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getStreamProcessorArn() == null) ? 0 : getStreamProcessorArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateStreamProcessorResult == false)
            return false;
        CreateStreamProcessorResult other = (CreateStreamProcessorResult) obj;

        if (other.getStreamProcessorArn() == null ^ this.getStreamProcessorArn() == null)
            return false;
        if (other.getStreamProcessorArn() != null
                && other.getStreamProcessorArn().equals(this.getStreamProcessorArn()) == false)
            return false;
        return true;
    }
}
