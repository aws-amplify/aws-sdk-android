/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.amazonsagemakerservice.model;

import java.io.Serializable;

/**
 * <p>
 * Represents an input or output artifact of a trial component. You specify
 * <code>TrialComponentArtifact</code> as part of the
 * <code>InputArtifacts</code> and <code>OutputArtifacts</code> parameters in
 * the <a>CreateTrialComponent</a> request.
 * </p>
 * <p>
 * Examples of input artifacts are datasets, algorithms, hyperparameters, source
 * code, and instance types. Examples of output artifacts are metrics,
 * snapshots, logs, and images.
 * </p>
 */
public class TrialComponentArtifact implements Serializable {
    /**
     * <p>
     * The media type of the artifact, which indicates the type of data in the
     * artifact file. The media type consists of a <i>type</i> and a
     * <i>subtype</i> concatenated with a slash (/) character, for example,
     * text/csv, image/jpeg, and s3/uri. The type specifies the category of the
     * media. The subtype specifies the kind of data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     * <b>Pattern: </b>^[\w]+\/[\w+]+$<br/>
     */
    private String mediaType;

    /**
     * <p>
     * The location of the artifact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern: </b>.*<br/>
     */
    private String value;

    /**
     * <p>
     * The media type of the artifact, which indicates the type of data in the
     * artifact file. The media type consists of a <i>type</i> and a
     * <i>subtype</i> concatenated with a slash (/) character, for example,
     * text/csv, image/jpeg, and s3/uri. The type specifies the category of the
     * media. The subtype specifies the kind of data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     * <b>Pattern: </b>^[\w]+\/[\w+]+$<br/>
     *
     * @return <p>
     *         The media type of the artifact, which indicates the type of data
     *         in the artifact file. The media type consists of a <i>type</i>
     *         and a <i>subtype</i> concatenated with a slash (/) character, for
     *         example, text/csv, image/jpeg, and s3/uri. The type specifies the
     *         category of the media. The subtype specifies the kind of data.
     *         </p>
     */
    public String getMediaType() {
        return mediaType;
    }

    /**
     * <p>
     * The media type of the artifact, which indicates the type of data in the
     * artifact file. The media type consists of a <i>type</i> and a
     * <i>subtype</i> concatenated with a slash (/) character, for example,
     * text/csv, image/jpeg, and s3/uri. The type specifies the category of the
     * media. The subtype specifies the kind of data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     * <b>Pattern: </b>^[\w]+\/[\w+]+$<br/>
     *
     * @param mediaType <p>
     *            The media type of the artifact, which indicates the type of
     *            data in the artifact file. The media type consists of a
     *            <i>type</i> and a <i>subtype</i> concatenated with a slash (/)
     *            character, for example, text/csv, image/jpeg, and s3/uri. The
     *            type specifies the category of the media. The subtype
     *            specifies the kind of data.
     *            </p>
     */
    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    /**
     * <p>
     * The media type of the artifact, which indicates the type of data in the
     * artifact file. The media type consists of a <i>type</i> and a
     * <i>subtype</i> concatenated with a slash (/) character, for example,
     * text/csv, image/jpeg, and s3/uri. The type specifies the category of the
     * media. The subtype specifies the kind of data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     * <b>Pattern: </b>^[\w]+\/[\w+]+$<br/>
     *
     * @param mediaType <p>
     *            The media type of the artifact, which indicates the type of
     *            data in the artifact file. The media type consists of a
     *            <i>type</i> and a <i>subtype</i> concatenated with a slash (/)
     *            character, for example, text/csv, image/jpeg, and s3/uri. The
     *            type specifies the category of the media. The subtype
     *            specifies the kind of data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrialComponentArtifact withMediaType(String mediaType) {
        this.mediaType = mediaType;
        return this;
    }

    /**
     * <p>
     * The location of the artifact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @return <p>
     *         The location of the artifact.
     *         </p>
     */
    public String getValue() {
        return value;
    }

    /**
     * <p>
     * The location of the artifact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param value <p>
     *            The location of the artifact.
     *            </p>
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The location of the artifact.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param value <p>
     *            The location of the artifact.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrialComponentArtifact withValue(String value) {
        this.value = value;
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
        if (getMediaType() != null)
            sb.append("MediaType: " + getMediaType() + ",");
        if (getValue() != null)
            sb.append("Value: " + getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMediaType() == null) ? 0 : getMediaType().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TrialComponentArtifact == false)
            return false;
        TrialComponentArtifact other = (TrialComponentArtifact) obj;

        if (other.getMediaType() == null ^ this.getMediaType() == null)
            return false;
        if (other.getMediaType() != null
                && other.getMediaType().equals(this.getMediaType()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }
}
