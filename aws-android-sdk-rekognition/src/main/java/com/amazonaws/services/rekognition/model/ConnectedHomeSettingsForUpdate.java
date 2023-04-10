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
 * The label detection settings you want to use in your stream processor. This
 * includes the labels you want the stream processor to detect and the minimum
 * confidence level allowed to label objects.
 * </p>
 */
public class ConnectedHomeSettingsForUpdate implements Serializable {
    /**
     * <p>
     * Specifies what you want to detect in the video, such as people, packages,
     * or pets. The current valid labels you can include in this list are:
     * "PERSON", "PET", "PACKAGE", and "ALL".
     * </p>
     */
    private java.util.List<String> labels;

    /**
     * <p>
     * The minimum confidence required to label an object in the video.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0.0 - 100.0<br/>
     */
    private Float minConfidence;

    /**
     * <p>
     * Specifies what you want to detect in the video, such as people, packages,
     * or pets. The current valid labels you can include in this list are:
     * "PERSON", "PET", "PACKAGE", and "ALL".
     * </p>
     *
     * @return <p>
     *         Specifies what you want to detect in the video, such as people,
     *         packages, or pets. The current valid labels you can include in
     *         this list are: "PERSON", "PET", "PACKAGE", and "ALL".
     *         </p>
     */
    public java.util.List<String> getLabels() {
        return labels;
    }

    /**
     * <p>
     * Specifies what you want to detect in the video, such as people, packages,
     * or pets. The current valid labels you can include in this list are:
     * "PERSON", "PET", "PACKAGE", and "ALL".
     * </p>
     *
     * @param labels <p>
     *            Specifies what you want to detect in the video, such as
     *            people, packages, or pets. The current valid labels you can
     *            include in this list are: "PERSON", "PET", "PACKAGE", and
     *            "ALL".
     *            </p>
     */
    public void setLabels(java.util.Collection<String> labels) {
        if (labels == null) {
            this.labels = null;
            return;
        }

        this.labels = new java.util.ArrayList<String>(labels);
    }

    /**
     * <p>
     * Specifies what you want to detect in the video, such as people, packages,
     * or pets. The current valid labels you can include in this list are:
     * "PERSON", "PET", "PACKAGE", and "ALL".
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param labels <p>
     *            Specifies what you want to detect in the video, such as
     *            people, packages, or pets. The current valid labels you can
     *            include in this list are: "PERSON", "PET", "PACKAGE", and
     *            "ALL".
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConnectedHomeSettingsForUpdate withLabels(String... labels) {
        if (getLabels() == null) {
            this.labels = new java.util.ArrayList<String>(labels.length);
        }
        for (String value : labels) {
            this.labels.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Specifies what you want to detect in the video, such as people, packages,
     * or pets. The current valid labels you can include in this list are:
     * "PERSON", "PET", "PACKAGE", and "ALL".
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param labels <p>
     *            Specifies what you want to detect in the video, such as
     *            people, packages, or pets. The current valid labels you can
     *            include in this list are: "PERSON", "PET", "PACKAGE", and
     *            "ALL".
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConnectedHomeSettingsForUpdate withLabels(java.util.Collection<String> labels) {
        setLabels(labels);
        return this;
    }

    /**
     * <p>
     * The minimum confidence required to label an object in the video.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0.0 - 100.0<br/>
     *
     * @return <p>
     *         The minimum confidence required to label an object in the video.
     *         </p>
     */
    public Float getMinConfidence() {
        return minConfidence;
    }

    /**
     * <p>
     * The minimum confidence required to label an object in the video.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0.0 - 100.0<br/>
     *
     * @param minConfidence <p>
     *            The minimum confidence required to label an object in the
     *            video.
     *            </p>
     */
    public void setMinConfidence(Float minConfidence) {
        this.minConfidence = minConfidence;
    }

    /**
     * <p>
     * The minimum confidence required to label an object in the video.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0.0 - 100.0<br/>
     *
     * @param minConfidence <p>
     *            The minimum confidence required to label an object in the
     *            video.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConnectedHomeSettingsForUpdate withMinConfidence(Float minConfidence) {
        this.minConfidence = minConfidence;
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
        if (getLabels() != null)
            sb.append("Labels: " + getLabels() + ",");
        if (getMinConfidence() != null)
            sb.append("MinConfidence: " + getMinConfidence());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLabels() == null) ? 0 : getLabels().hashCode());
        hashCode = prime * hashCode
                + ((getMinConfidence() == null) ? 0 : getMinConfidence().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConnectedHomeSettingsForUpdate == false)
            return false;
        ConnectedHomeSettingsForUpdate other = (ConnectedHomeSettingsForUpdate) obj;

        if (other.getLabels() == null ^ this.getLabels() == null)
            return false;
        if (other.getLabels() != null && other.getLabels().equals(this.getLabels()) == false)
            return false;
        if (other.getMinConfidence() == null ^ this.getMinConfidence() == null)
            return false;
        if (other.getMinConfidence() != null
                && other.getMinConfidence().equals(this.getMinConfidence()) == false)
            return false;
        return true;
    }
}
