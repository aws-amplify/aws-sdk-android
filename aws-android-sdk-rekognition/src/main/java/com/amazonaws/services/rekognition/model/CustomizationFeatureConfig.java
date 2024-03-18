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

package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/**
 * <p>
 * Feature specific configuration for the training job. Configuration provided
 * for the job must match the feature type parameter associated with project. If
 * configuration and feature type do not match an InvalidParameterException is
 * returned.
 * </p>
 */
public class CustomizationFeatureConfig implements Serializable {
    /**
     * <p>
     * Configuration options for Custom Moderation training.
     * </p>
     */
    private CustomizationFeatureContentModerationConfig contentModeration;

    /**
     * <p>
     * Configuration options for Custom Moderation training.
     * </p>
     *
     * @return <p>
     *         Configuration options for Custom Moderation training.
     *         </p>
     */
    public CustomizationFeatureContentModerationConfig getContentModeration() {
        return contentModeration;
    }

    /**
     * <p>
     * Configuration options for Custom Moderation training.
     * </p>
     *
     * @param contentModeration <p>
     *            Configuration options for Custom Moderation training.
     *            </p>
     */
    public void setContentModeration(CustomizationFeatureContentModerationConfig contentModeration) {
        this.contentModeration = contentModeration;
    }

    /**
     * <p>
     * Configuration options for Custom Moderation training.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param contentModeration <p>
     *            Configuration options for Custom Moderation training.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CustomizationFeatureConfig withContentModeration(
            CustomizationFeatureContentModerationConfig contentModeration) {
        this.contentModeration = contentModeration;
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
        if (getContentModeration() != null)
            sb.append("ContentModeration: " + getContentModeration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getContentModeration() == null) ? 0 : getContentModeration().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CustomizationFeatureConfig == false)
            return false;
        CustomizationFeatureConfig other = (CustomizationFeatureConfig) obj;

        if (other.getContentModeration() == null ^ this.getContentModeration() == null)
            return false;
        if (other.getContentModeration() != null
                && other.getContentModeration().equals(this.getContentModeration()) == false)
            return false;
        return true;
    }
}
