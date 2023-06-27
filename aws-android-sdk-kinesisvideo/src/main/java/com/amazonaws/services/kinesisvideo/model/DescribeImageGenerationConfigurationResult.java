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

public class DescribeImageGenerationConfigurationResult implements Serializable {
    /**
     * <p>
     * The structure that contains the information required for the Kinesis
     * video stream (KVS) images delivery. If this structure is null, the
     * configuration will be deleted from the stream.
     * </p>
     */
    private ImageGenerationConfiguration imageGenerationConfiguration;

    /**
     * <p>
     * The structure that contains the information required for the Kinesis
     * video stream (KVS) images delivery. If this structure is null, the
     * configuration will be deleted from the stream.
     * </p>
     *
     * @return <p>
     *         The structure that contains the information required for the
     *         Kinesis video stream (KVS) images delivery. If this structure is
     *         null, the configuration will be deleted from the stream.
     *         </p>
     */
    public ImageGenerationConfiguration getImageGenerationConfiguration() {
        return imageGenerationConfiguration;
    }

    /**
     * <p>
     * The structure that contains the information required for the Kinesis
     * video stream (KVS) images delivery. If this structure is null, the
     * configuration will be deleted from the stream.
     * </p>
     *
     * @param imageGenerationConfiguration <p>
     *            The structure that contains the information required for the
     *            Kinesis video stream (KVS) images delivery. If this structure
     *            is null, the configuration will be deleted from the stream.
     *            </p>
     */
    public void setImageGenerationConfiguration(
            ImageGenerationConfiguration imageGenerationConfiguration) {
        this.imageGenerationConfiguration = imageGenerationConfiguration;
    }

    /**
     * <p>
     * The structure that contains the information required for the Kinesis
     * video stream (KVS) images delivery. If this structure is null, the
     * configuration will be deleted from the stream.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param imageGenerationConfiguration <p>
     *            The structure that contains the information required for the
     *            Kinesis video stream (KVS) images delivery. If this structure
     *            is null, the configuration will be deleted from the stream.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeImageGenerationConfigurationResult withImageGenerationConfiguration(
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
        if (getImageGenerationConfiguration() != null)
            sb.append("ImageGenerationConfiguration: " + getImageGenerationConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

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

        if (obj instanceof DescribeImageGenerationConfigurationResult == false)
            return false;
        DescribeImageGenerationConfigurationResult other = (DescribeImageGenerationConfigurationResult) obj;

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
