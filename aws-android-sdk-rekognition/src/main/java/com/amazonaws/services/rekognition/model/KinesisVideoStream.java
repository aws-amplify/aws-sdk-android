/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Kinesis video stream stream that provides the source streaming video for a
 * Amazon Rekognition Video stream processor. For more information, see
 * CreateStreamProcessor in the Amazon Rekognition Developer Guide.
 * </p>
 */
public class KinesisVideoStream implements Serializable {
    /**
     * <p>
     * ARN of the Kinesis video stream stream that streams the source video.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^arn:([a-z\d-]+):kinesisvideo:([a-z\d-]+):\d{12}:.+$)
     * <br/>
     */
    private String arn;

    /**
     * <p>
     * ARN of the Kinesis video stream stream that streams the source video.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^arn:([a-z\d-]+):kinesisvideo:([a-z\d-]+):\d{12}:.+$)
     * <br/>
     *
     * @return <p>
     *         ARN of the Kinesis video stream stream that streams the source
     *         video.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * ARN of the Kinesis video stream stream that streams the source video.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^arn:([a-z\d-]+):kinesisvideo:([a-z\d-]+):\d{12}:.+$)
     * <br/>
     *
     * @param arn <p>
     *            ARN of the Kinesis video stream stream that streams the source
     *            video.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * ARN of the Kinesis video stream stream that streams the source video.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^arn:([a-z\d-]+):kinesisvideo:([a-z\d-]+):\d{12}:.+$)
     * <br/>
     *
     * @param arn <p>
     *            ARN of the Kinesis video stream stream that streams the source
     *            video.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public KinesisVideoStream withArn(String arn) {
        this.arn = arn;
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
        if (getArn() != null)
            sb.append("Arn: " + getArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KinesisVideoStream == false)
            return false;
        KinesisVideoStream other = (KinesisVideoStream) obj;

        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        return true;
    }
}
