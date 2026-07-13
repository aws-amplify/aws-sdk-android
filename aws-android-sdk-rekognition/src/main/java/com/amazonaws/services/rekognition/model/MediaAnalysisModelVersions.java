/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Object containing information about the model versions of selected features
 * in a given job.
 * </p>
 */
public class MediaAnalysisModelVersions implements Serializable {
    /**
     * <p>
     * The Moderation base model version.
     * </p>
     */
    private String moderation;

    /**
     * <p>
     * The Moderation base model version.
     * </p>
     *
     * @return <p>
     *         The Moderation base model version.
     *         </p>
     */
    public String getModeration() {
        return moderation;
    }

    /**
     * <p>
     * The Moderation base model version.
     * </p>
     *
     * @param moderation <p>
     *            The Moderation base model version.
     *            </p>
     */
    public void setModeration(String moderation) {
        this.moderation = moderation;
    }

    /**
     * <p>
     * The Moderation base model version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param moderation <p>
     *            The Moderation base model version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MediaAnalysisModelVersions withModeration(String moderation) {
        this.moderation = moderation;
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
        if (getModeration() != null)
            sb.append("Moderation: " + getModeration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getModeration() == null) ? 0 : getModeration().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MediaAnalysisModelVersions == false)
            return false;
        MediaAnalysisModelVersions other = (MediaAnalysisModelVersions) obj;

        if (other.getModeration() == null ^ this.getModeration() == null)
            return false;
        if (other.getModeration() != null
                && other.getModeration().equals(this.getModeration()) == false)
            return false;
        return true;
    }
}
