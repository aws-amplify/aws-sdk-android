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

package com.amazonaws.services.amplify.model;

import java.io.Serializable;

/**
 * <p>
 * Describes an artifact.
 * </p>
 */
public class Artifact implements Serializable {
    /**
     * <p>
     * The file name for the artifact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     */
    private String artifactFileName;

    /**
     * <p>
     * The unique ID for the artifact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     */
    private String artifactId;

    /**
     * <p>
     * The file name for the artifact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     *
     * @return <p>
     *         The file name for the artifact.
     *         </p>
     */
    public String getArtifactFileName() {
        return artifactFileName;
    }

    /**
     * <p>
     * The file name for the artifact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     *
     * @param artifactFileName <p>
     *            The file name for the artifact.
     *            </p>
     */
    public void setArtifactFileName(String artifactFileName) {
        this.artifactFileName = artifactFileName;
    }

    /**
     * <p>
     * The file name for the artifact.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     *
     * @param artifactFileName <p>
     *            The file name for the artifact.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Artifact withArtifactFileName(String artifactFileName) {
        this.artifactFileName = artifactFileName;
        return this;
    }

    /**
     * <p>
     * The unique ID for the artifact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @return <p>
     *         The unique ID for the artifact.
     *         </p>
     */
    public String getArtifactId() {
        return artifactId;
    }

    /**
     * <p>
     * The unique ID for the artifact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param artifactId <p>
     *            The unique ID for the artifact.
     *            </p>
     */
    public void setArtifactId(String artifactId) {
        this.artifactId = artifactId;
    }

    /**
     * <p>
     * The unique ID for the artifact.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param artifactId <p>
     *            The unique ID for the artifact.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Artifact withArtifactId(String artifactId) {
        this.artifactId = artifactId;
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
        if (getArtifactFileName() != null)
            sb.append("artifactFileName: " + getArtifactFileName() + ",");
        if (getArtifactId() != null)
            sb.append("artifactId: " + getArtifactId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getArtifactFileName() == null) ? 0 : getArtifactFileName().hashCode());
        hashCode = prime * hashCode + ((getArtifactId() == null) ? 0 : getArtifactId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Artifact == false)
            return false;
        Artifact other = (Artifact) obj;

        if (other.getArtifactFileName() == null ^ this.getArtifactFileName() == null)
            return false;
        if (other.getArtifactFileName() != null
                && other.getArtifactFileName().equals(this.getArtifactFileName()) == false)
            return false;
        if (other.getArtifactId() == null ^ this.getArtifactId() == null)
            return false;
        if (other.getArtifactId() != null
                && other.getArtifactId().equals(this.getArtifactId()) == false)
            return false;
        return true;
    }
}
