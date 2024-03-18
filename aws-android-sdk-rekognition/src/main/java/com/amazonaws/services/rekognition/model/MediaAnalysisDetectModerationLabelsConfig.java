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
 * Configuration for Moderation Labels Detection.
 * </p>
 */
public class MediaAnalysisDetectModerationLabelsConfig implements Serializable {
    /**
     * <p>
     * Specifies the minimum confidence level for the moderation labels to
     * return. Amazon Rekognition doesn't return any labels with a confidence
     * level lower than this specified value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0.0 - 100.0<br/>
     */
    private Float minConfidence;

    /**
     * <p>
     * Specifies the custom moderation model to be used during the label
     * detection job. If not provided the pre-trained model is used.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>(^arn:[a-z\d-]+:rekognition:[a-z\d-]+:\d{12}:project\/[a-zA
     * -Z0-9_.\-]{1,255}\/version\/[a-zA-Z0-9_.\-]{1,255}\/[0-9]+$)<br/>
     */
    private String projectVersion;

    /**
     * <p>
     * Specifies the minimum confidence level for the moderation labels to
     * return. Amazon Rekognition doesn't return any labels with a confidence
     * level lower than this specified value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0.0 - 100.0<br/>
     *
     * @return <p>
     *         Specifies the minimum confidence level for the moderation labels
     *         to return. Amazon Rekognition doesn't return any labels with a
     *         confidence level lower than this specified value.
     *         </p>
     */
    public Float getMinConfidence() {
        return minConfidence;
    }

    /**
     * <p>
     * Specifies the minimum confidence level for the moderation labels to
     * return. Amazon Rekognition doesn't return any labels with a confidence
     * level lower than this specified value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0.0 - 100.0<br/>
     *
     * @param minConfidence <p>
     *            Specifies the minimum confidence level for the moderation
     *            labels to return. Amazon Rekognition doesn't return any labels
     *            with a confidence level lower than this specified value.
     *            </p>
     */
    public void setMinConfidence(Float minConfidence) {
        this.minConfidence = minConfidence;
    }

    /**
     * <p>
     * Specifies the minimum confidence level for the moderation labels to
     * return. Amazon Rekognition doesn't return any labels with a confidence
     * level lower than this specified value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0.0 - 100.0<br/>
     *
     * @param minConfidence <p>
     *            Specifies the minimum confidence level for the moderation
     *            labels to return. Amazon Rekognition doesn't return any labels
     *            with a confidence level lower than this specified value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MediaAnalysisDetectModerationLabelsConfig withMinConfidence(Float minConfidence) {
        this.minConfidence = minConfidence;
        return this;
    }

    /**
     * <p>
     * Specifies the custom moderation model to be used during the label
     * detection job. If not provided the pre-trained model is used.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>(^arn:[a-z\d-]+:rekognition:[a-z\d-]+:\d{12}:project\/[a-zA
     * -Z0-9_.\-]{1,255}\/version\/[a-zA-Z0-9_.\-]{1,255}\/[0-9]+$)<br/>
     *
     * @return <p>
     *         Specifies the custom moderation model to be used during the label
     *         detection job. If not provided the pre-trained model is used.
     *         </p>
     */
    public String getProjectVersion() {
        return projectVersion;
    }

    /**
     * <p>
     * Specifies the custom moderation model to be used during the label
     * detection job. If not provided the pre-trained model is used.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>(^arn:[a-z\d-]+:rekognition:[a-z\d-]+:\d{12}:project\/[a-zA
     * -Z0-9_.\-]{1,255}\/version\/[a-zA-Z0-9_.\-]{1,255}\/[0-9]+$)<br/>
     *
     * @param projectVersion <p>
     *            Specifies the custom moderation model to be used during the
     *            label detection job. If not provided the pre-trained model is
     *            used.
     *            </p>
     */
    public void setProjectVersion(String projectVersion) {
        this.projectVersion = projectVersion;
    }

    /**
     * <p>
     * Specifies the custom moderation model to be used during the label
     * detection job. If not provided the pre-trained model is used.
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
     * @param projectVersion <p>
     *            Specifies the custom moderation model to be used during the
     *            label detection job. If not provided the pre-trained model is
     *            used.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MediaAnalysisDetectModerationLabelsConfig withProjectVersion(String projectVersion) {
        this.projectVersion = projectVersion;
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
        if (getMinConfidence() != null)
            sb.append("MinConfidence: " + getMinConfidence() + ",");
        if (getProjectVersion() != null)
            sb.append("ProjectVersion: " + getProjectVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getMinConfidence() == null) ? 0 : getMinConfidence().hashCode());
        hashCode = prime * hashCode
                + ((getProjectVersion() == null) ? 0 : getProjectVersion().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MediaAnalysisDetectModerationLabelsConfig == false)
            return false;
        MediaAnalysisDetectModerationLabelsConfig other = (MediaAnalysisDetectModerationLabelsConfig) obj;

        if (other.getMinConfidence() == null ^ this.getMinConfidence() == null)
            return false;
        if (other.getMinConfidence() != null
                && other.getMinConfidence().equals(this.getMinConfidence()) == false)
            return false;
        if (other.getProjectVersion() == null ^ this.getProjectVersion() == null)
            return false;
        if (other.getProjectVersion() != null
                && other.getProjectVersion().equals(this.getProjectVersion()) == false)
            return false;
        return true;
    }
}
