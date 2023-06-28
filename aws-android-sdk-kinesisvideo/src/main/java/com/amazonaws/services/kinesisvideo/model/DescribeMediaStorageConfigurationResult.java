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

public class DescribeMediaStorageConfigurationResult implements Serializable {
    /**
     * <p>
     * A structure that encapsulates, or contains, the media storage
     * configuration properties.
     * </p>
     */
    private MediaStorageConfiguration mediaStorageConfiguration;

    /**
     * <p>
     * A structure that encapsulates, or contains, the media storage
     * configuration properties.
     * </p>
     *
     * @return <p>
     *         A structure that encapsulates, or contains, the media storage
     *         configuration properties.
     *         </p>
     */
    public MediaStorageConfiguration getMediaStorageConfiguration() {
        return mediaStorageConfiguration;
    }

    /**
     * <p>
     * A structure that encapsulates, or contains, the media storage
     * configuration properties.
     * </p>
     *
     * @param mediaStorageConfiguration <p>
     *            A structure that encapsulates, or contains, the media storage
     *            configuration properties.
     *            </p>
     */
    public void setMediaStorageConfiguration(MediaStorageConfiguration mediaStorageConfiguration) {
        this.mediaStorageConfiguration = mediaStorageConfiguration;
    }

    /**
     * <p>
     * A structure that encapsulates, or contains, the media storage
     * configuration properties.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param mediaStorageConfiguration <p>
     *            A structure that encapsulates, or contains, the media storage
     *            configuration properties.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeMediaStorageConfigurationResult withMediaStorageConfiguration(
            MediaStorageConfiguration mediaStorageConfiguration) {
        this.mediaStorageConfiguration = mediaStorageConfiguration;
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
        if (getMediaStorageConfiguration() != null)
            sb.append("MediaStorageConfiguration: " + getMediaStorageConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getMediaStorageConfiguration() == null) ? 0 : getMediaStorageConfiguration()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeMediaStorageConfigurationResult == false)
            return false;
        DescribeMediaStorageConfigurationResult other = (DescribeMediaStorageConfigurationResult) obj;

        if (other.getMediaStorageConfiguration() == null
                ^ this.getMediaStorageConfiguration() == null)
            return false;
        if (other.getMediaStorageConfiguration() != null
                && other.getMediaStorageConfiguration().equals(this.getMediaStorageConfiguration()) == false)
            return false;
        return true;
    }
}
