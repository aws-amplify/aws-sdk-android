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

package com.amazonaws.services.synthetics.model;

import java.io.Serializable;

/**
 * <p>
 * This structure contains the details about one run of one canary.
 * </p>
 */
public class CanaryRun implements Serializable {
    /**
     * <p>
     * The name of the canary.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 21<br/>
     * <b>Pattern: </b>^[0-9a-z_\-]+$<br/>
     */
    private String name;

    /**
     * <p>
     * The status of this run.
     * </p>
     */
    private CanaryRunStatus status;

    /**
     * <p>
     * A structure that contains the start and end times of this run.
     * </p>
     */
    private CanaryRunTimeline timeline;

    /**
     * <p>
     * The location where the canary stored artifacts from the run. Artifacts
     * include the log file, screenshots, and HAR files.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String artifactS3Location;

    /**
     * <p>
     * The name of the canary.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 21<br/>
     * <b>Pattern: </b>^[0-9a-z_\-]+$<br/>
     *
     * @return <p>
     *         The name of the canary.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the canary.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 21<br/>
     * <b>Pattern: </b>^[0-9a-z_\-]+$<br/>
     *
     * @param name <p>
     *            The name of the canary.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the canary.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 21<br/>
     * <b>Pattern: </b>^[0-9a-z_\-]+$<br/>
     *
     * @param name <p>
     *            The name of the canary.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CanaryRun withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The status of this run.
     * </p>
     *
     * @return <p>
     *         The status of this run.
     *         </p>
     */
    public CanaryRunStatus getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of this run.
     * </p>
     *
     * @param status <p>
     *            The status of this run.
     *            </p>
     */
    public void setStatus(CanaryRunStatus status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of this run.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            The status of this run.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CanaryRun withStatus(CanaryRunStatus status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * A structure that contains the start and end times of this run.
     * </p>
     *
     * @return <p>
     *         A structure that contains the start and end times of this run.
     *         </p>
     */
    public CanaryRunTimeline getTimeline() {
        return timeline;
    }

    /**
     * <p>
     * A structure that contains the start and end times of this run.
     * </p>
     *
     * @param timeline <p>
     *            A structure that contains the start and end times of this run.
     *            </p>
     */
    public void setTimeline(CanaryRunTimeline timeline) {
        this.timeline = timeline;
    }

    /**
     * <p>
     * A structure that contains the start and end times of this run.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timeline <p>
     *            A structure that contains the start and end times of this run.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CanaryRun withTimeline(CanaryRunTimeline timeline) {
        this.timeline = timeline;
        return this;
    }

    /**
     * <p>
     * The location where the canary stored artifacts from the run. Artifacts
     * include the log file, screenshots, and HAR files.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         The location where the canary stored artifacts from the run.
     *         Artifacts include the log file, screenshots, and HAR files.
     *         </p>
     */
    public String getArtifactS3Location() {
        return artifactS3Location;
    }

    /**
     * <p>
     * The location where the canary stored artifacts from the run. Artifacts
     * include the log file, screenshots, and HAR files.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param artifactS3Location <p>
     *            The location where the canary stored artifacts from the run.
     *            Artifacts include the log file, screenshots, and HAR files.
     *            </p>
     */
    public void setArtifactS3Location(String artifactS3Location) {
        this.artifactS3Location = artifactS3Location;
    }

    /**
     * <p>
     * The location where the canary stored artifacts from the run. Artifacts
     * include the log file, screenshots, and HAR files.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param artifactS3Location <p>
     *            The location where the canary stored artifacts from the run.
     *            Artifacts include the log file, screenshots, and HAR files.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CanaryRun withArtifactS3Location(String artifactS3Location) {
        this.artifactS3Location = artifactS3Location;
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getTimeline() != null)
            sb.append("Timeline: " + getTimeline() + ",");
        if (getArtifactS3Location() != null)
            sb.append("ArtifactS3Location: " + getArtifactS3Location());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getTimeline() == null) ? 0 : getTimeline().hashCode());
        hashCode = prime * hashCode
                + ((getArtifactS3Location() == null) ? 0 : getArtifactS3Location().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CanaryRun == false)
            return false;
        CanaryRun other = (CanaryRun) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getTimeline() == null ^ this.getTimeline() == null)
            return false;
        if (other.getTimeline() != null && other.getTimeline().equals(this.getTimeline()) == false)
            return false;
        if (other.getArtifactS3Location() == null ^ this.getArtifactS3Location() == null)
            return false;
        if (other.getArtifactS3Location() != null
                && other.getArtifactS3Location().equals(this.getArtifactS3Location()) == false)
            return false;
        return true;
    }
}
