/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.kinesisvideo.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates the <code>StreamInfo</code> and
 * <code>ImageProcessingConfiguration</code> fields.
 * </p>
 */
public class UpdateImageGenerationConfigurationRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the stream from which to update the image generation
     * configuration. You must specify either the <code>StreamName</code> or the
     * <code>StreamARN</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String streamName;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Kinesis video stream from where you
     * want to update the image generation configuration. You must specify
     * either the <code>StreamName</code> or the <code>StreamARN</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern:
     * </b>arn:[a-z\d-]+:kinesisvideo:[a-z0-9-]+:[0-9]+:[a-z]+/[a-zA-
     * Z0-9_.-]+/[0-9]+<br/>
     */
    private String streamARN;

    /**
     * <p>
     * The structure that contains the information required for the KVS images
     * delivery. If the structure is null, the configuration will be deleted
     * from the stream.
     * </p>
     */
    private ImageGenerationConfiguration imageGenerationConfiguration;

    /**
     * <p>
     * The name of the stream from which to update the image generation
     * configuration. You must specify either the <code>StreamName</code> or the
     * <code>StreamARN</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return <p>
     *         The name of the stream from which to update the image generation
     *         configuration. You must specify either the
     *         <code>StreamName</code> or the <code>StreamARN</code>.
     *         </p>
     */
    public String getStreamName() {
        return streamName;
    }

    /**
     * <p>
     * The name of the stream from which to update the image generation
     * configuration. You must specify either the <code>StreamName</code> or the
     * <code>StreamARN</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param streamName <p>
     *            The name of the stream from which to update the image
     *            generation configuration. You must specify either the
     *            <code>StreamName</code> or the <code>StreamARN</code>.
     *            </p>
     */
    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    /**
     * <p>
     * The name of the stream from which to update the image generation
     * configuration. You must specify either the <code>StreamName</code> or the
     * <code>StreamARN</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param streamName <p>
     *            The name of the stream from which to update the image
     *            generation configuration. You must specify either the
     *            <code>StreamName</code> or the <code>StreamARN</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateImageGenerationConfigurationRequest withStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Kinesis video stream from where you
     * want to update the image generation configuration. You must specify
     * either the <code>StreamName</code> or the <code>StreamARN</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern:
     * </b>arn:[a-z\d-]+:kinesisvideo:[a-z0-9-]+:[0-9]+:[a-z]+/[a-zA-
     * Z0-9_.-]+/[0-9]+<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the Kinesis video stream from
     *         where you want to update the image generation configuration. You
     *         must specify either the <code>StreamName</code> or the
     *         <code>StreamARN</code>.
     *         </p>
     */
    public String getStreamARN() {
        return streamARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Kinesis video stream from where you
     * want to update the image generation configuration. You must specify
     * either the <code>StreamName</code> or the <code>StreamARN</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern:
     * </b>arn:[a-z\d-]+:kinesisvideo:[a-z0-9-]+:[0-9]+:[a-z]+/[a-zA-
     * Z0-9_.-]+/[0-9]+<br/>
     *
     * @param streamARN <p>
     *            The Amazon Resource Name (ARN) of the Kinesis video stream
     *            from where you want to update the image generation
     *            configuration. You must specify either the
     *            <code>StreamName</code> or the <code>StreamARN</code>.
     *            </p>
     */
    public void setStreamARN(String streamARN) {
        this.streamARN = streamARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Kinesis video stream from where you
     * want to update the image generation configuration. You must specify
     * either the <code>StreamName</code> or the <code>StreamARN</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern:
     * </b>arn:[a-z\d-]+:kinesisvideo:[a-z0-9-]+:[0-9]+:[a-z]+/[a-zA-
     * Z0-9_.-]+/[0-9]+<br/>
     *
     * @param streamARN <p>
     *            The Amazon Resource Name (ARN) of the Kinesis video stream
     *            from where you want to update the image generation
     *            configuration. You must specify either the
     *            <code>StreamName</code> or the <code>StreamARN</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateImageGenerationConfigurationRequest withStreamARN(String streamARN) {
        this.streamARN = streamARN;
        return this;
    }

    /**
     * <p>
     * The structure that contains the information required for the KVS images
     * delivery. If the structure is null, the configuration will be deleted
     * from the stream.
     * </p>
     *
     * @return <p>
     *         The structure that contains the information required for the KVS
     *         images delivery. If the structure is null, the configuration will
     *         be deleted from the stream.
     *         </p>
     */
    public ImageGenerationConfiguration getImageGenerationConfiguration() {
        return imageGenerationConfiguration;
    }

    /**
     * <p>
     * The structure that contains the information required for the KVS images
     * delivery. If the structure is null, the configuration will be deleted
     * from the stream.
     * </p>
     *
     * @param imageGenerationConfiguration <p>
     *            The structure that contains the information required for the
     *            KVS images delivery. If the structure is null, the
     *            configuration will be deleted from the stream.
     *            </p>
     */
    public void setImageGenerationConfiguration(
            ImageGenerationConfiguration imageGenerationConfiguration) {
        this.imageGenerationConfiguration = imageGenerationConfiguration;
    }

    /**
     * <p>
     * The structure that contains the information required for the KVS images
     * delivery. If the structure is null, the configuration will be deleted
     * from the stream.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param imageGenerationConfiguration <p>
     *            The structure that contains the information required for the
     *            KVS images delivery. If the structure is null, the
     *            configuration will be deleted from the stream.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateImageGenerationConfigurationRequest withImageGenerationConfiguration(
            ImageGenerationConfiguration imageGenerationConfiguration) {
        this.imageGenerationConfiguration = imageGenerationConfiguration;
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
        if (getStreamName() != null)
            sb.append("StreamName: " + getStreamName() + ",");
        if (getStreamARN() != null)
            sb.append("StreamARN: " + getStreamARN() + ",");
        if (getImageGenerationConfiguration() != null)
            sb.append("ImageGenerationConfiguration: " + getImageGenerationConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStreamName() == null) ? 0 : getStreamName().hashCode());
        hashCode = prime * hashCode + ((getStreamARN() == null) ? 0 : getStreamARN().hashCode());
        hashCode = prime
                * hashCode
                + ((getImageGenerationConfiguration() == null) ? 0
                        : getImageGenerationConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateImageGenerationConfigurationRequest == false)
            return false;
        UpdateImageGenerationConfigurationRequest other = (UpdateImageGenerationConfigurationRequest) obj;

        if (other.getStreamName() == null ^ this.getStreamName() == null)
            return false;
        if (other.getStreamName() != null
                && other.getStreamName().equals(this.getStreamName()) == false)
            return false;
        if (other.getStreamARN() == null ^ this.getStreamARN() == null)
            return false;
        if (other.getStreamARN() != null
                && other.getStreamARN().equals(this.getStreamARN()) == false)
            return false;
        if (other.getImageGenerationConfiguration() == null
                ^ this.getImageGenerationConfiguration() == null)
            return false;
        if (other.getImageGenerationConfiguration() != null
                && other.getImageGenerationConfiguration().equals(
                        this.getImageGenerationConfiguration()) == false)
            return false;
        return true;
    }
}
