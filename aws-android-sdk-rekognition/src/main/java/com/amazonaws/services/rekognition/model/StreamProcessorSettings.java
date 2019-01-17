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

/**
 * <p>
 * Input parameters used to recognize faces in a streaming video analyzed by a
 * Amazon Rekognition stream processor.
 * </p>
 */
public class StreamProcessorSettings implements Serializable {
    /**
     * <p>
     * Face search settings to use on a streaming video.
     * </p>
     */
    private FaceSearchSettings faceSearch;

    /**
     * <p>
     * Face search settings to use on a streaming video.
     * </p>
     *
     * @return <p>
     *         Face search settings to use on a streaming video.
     *         </p>
     */
    public FaceSearchSettings getFaceSearch() {
        return faceSearch;
    }

    /**
     * <p>
     * Face search settings to use on a streaming video.
     * </p>
     *
     * @param faceSearch <p>
     *            Face search settings to use on a streaming video.
     *            </p>
     */
    public void setFaceSearch(FaceSearchSettings faceSearch) {
        this.faceSearch = faceSearch;
    }

    /**
     * <p>
     * Face search settings to use on a streaming video.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param faceSearch <p>
     *            Face search settings to use on a streaming video.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StreamProcessorSettings withFaceSearch(FaceSearchSettings faceSearch) {
        this.faceSearch = faceSearch;
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
        if (getFaceSearch() != null)
            sb.append("FaceSearch: " + getFaceSearch());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFaceSearch() == null) ? 0 : getFaceSearch().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StreamProcessorSettings == false)
            return false;
        StreamProcessorSettings other = (StreamProcessorSettings) obj;

        if (other.getFaceSearch() == null ^ this.getFaceSearch() == null)
            return false;
        if (other.getFaceSearch() != null
                && other.getFaceSearch().equals(this.getFaceSearch()) == false)
            return false;
        return true;
    }
}
