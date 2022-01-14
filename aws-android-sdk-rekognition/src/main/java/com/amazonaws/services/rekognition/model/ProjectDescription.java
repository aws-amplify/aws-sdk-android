/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * A description of an Amazon Rekognition Custom Labels project. For more
 * information, see <a>DescribeProjects</a>.
 * </p>
 */
public class ProjectDescription implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the project.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>(^arn:[a-z\d-]+:rekognition:[a-z\d-]+:\d{12}:project\/[a-zA
     * -Z0-9_.\-]{1,255}\/[0-9]+$)<br/>
     */
    private String projectArn;

    /**
     * <p>
     * The Unix timestamp for the date and time that the project was created.
     * </p>
     */
    private java.util.Date creationTimestamp;

    /**
     * <p>
     * The current status of the project.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, CREATED, DELETING
     */
    private String status;

    /**
     * <p>
     * Information about the training and test datasets in the project.
     * </p>
     */
    private java.util.List<DatasetMetadata> datasets;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the project.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>(^arn:[a-z\d-]+:rekognition:[a-z\d-]+:\d{12}:project\/[a-zA
     * -Z0-9_.\-]{1,255}\/[0-9]+$)<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the project.
     *         </p>
     */
    public String getProjectArn() {
        return projectArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the project.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>(^arn:[a-z\d-]+:rekognition:[a-z\d-]+:\d{12}:project\/[a-zA
     * -Z0-9_.\-]{1,255}\/[0-9]+$)<br/>
     *
     * @param projectArn <p>
     *            The Amazon Resource Name (ARN) of the project.
     *            </p>
     */
    public void setProjectArn(String projectArn) {
        this.projectArn = projectArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the project.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>(^arn:[a-z\d-]+:rekognition:[a-z\d-]+:\d{12}:project\/[a-zA
     * -Z0-9_.\-]{1,255}\/[0-9]+$)<br/>
     *
     * @param projectArn <p>
     *            The Amazon Resource Name (ARN) of the project.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProjectDescription withProjectArn(String projectArn) {
        this.projectArn = projectArn;
        return this;
    }

    /**
     * <p>
     * The Unix timestamp for the date and time that the project was created.
     * </p>
     *
     * @return <p>
     *         The Unix timestamp for the date and time that the project was
     *         created.
     *         </p>
     */
    public java.util.Date getCreationTimestamp() {
        return creationTimestamp;
    }

    /**
     * <p>
     * The Unix timestamp for the date and time that the project was created.
     * </p>
     *
     * @param creationTimestamp <p>
     *            The Unix timestamp for the date and time that the project was
     *            created.
     *            </p>
     */
    public void setCreationTimestamp(java.util.Date creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
    }

    /**
     * <p>
     * The Unix timestamp for the date and time that the project was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTimestamp <p>
     *            The Unix timestamp for the date and time that the project was
     *            created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProjectDescription withCreationTimestamp(java.util.Date creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
        return this;
    }

    /**
     * <p>
     * The current status of the project.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, CREATED, DELETING
     *
     * @return <p>
     *         The current status of the project.
     *         </p>
     * @see ProjectStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The current status of the project.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, CREATED, DELETING
     *
     * @param status <p>
     *            The current status of the project.
     *            </p>
     * @see ProjectStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the project.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, CREATED, DELETING
     *
     * @param status <p>
     *            The current status of the project.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ProjectStatus
     */
    public ProjectDescription withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The current status of the project.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, CREATED, DELETING
     *
     * @param status <p>
     *            The current status of the project.
     *            </p>
     * @see ProjectStatus
     */
    public void setStatus(ProjectStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The current status of the project.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, CREATED, DELETING
     *
     * @param status <p>
     *            The current status of the project.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ProjectStatus
     */
    public ProjectDescription withStatus(ProjectStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Information about the training and test datasets in the project.
     * </p>
     *
     * @return <p>
     *         Information about the training and test datasets in the project.
     *         </p>
     */
    public java.util.List<DatasetMetadata> getDatasets() {
        return datasets;
    }

    /**
     * <p>
     * Information about the training and test datasets in the project.
     * </p>
     *
     * @param datasets <p>
     *            Information about the training and test datasets in the
     *            project.
     *            </p>
     */
    public void setDatasets(java.util.Collection<DatasetMetadata> datasets) {
        if (datasets == null) {
            this.datasets = null;
            return;
        }

        this.datasets = new java.util.ArrayList<DatasetMetadata>(datasets);
    }

    /**
     * <p>
     * Information about the training and test datasets in the project.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param datasets <p>
     *            Information about the training and test datasets in the
     *            project.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProjectDescription withDatasets(DatasetMetadata... datasets) {
        if (getDatasets() == null) {
            this.datasets = new java.util.ArrayList<DatasetMetadata>(datasets.length);
        }
        for (DatasetMetadata value : datasets) {
            this.datasets.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the training and test datasets in the project.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param datasets <p>
     *            Information about the training and test datasets in the
     *            project.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProjectDescription withDatasets(java.util.Collection<DatasetMetadata> datasets) {
        setDatasets(datasets);
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
        if (getProjectArn() != null)
            sb.append("ProjectArn: " + getProjectArn() + ",");
        if (getCreationTimestamp() != null)
            sb.append("CreationTimestamp: " + getCreationTimestamp() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getDatasets() != null)
            sb.append("Datasets: " + getDatasets());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProjectArn() == null) ? 0 : getProjectArn().hashCode());
        hashCode = prime * hashCode
                + ((getCreationTimestamp() == null) ? 0 : getCreationTimestamp().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getDatasets() == null) ? 0 : getDatasets().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProjectDescription == false)
            return false;
        ProjectDescription other = (ProjectDescription) obj;

        if (other.getProjectArn() == null ^ this.getProjectArn() == null)
            return false;
        if (other.getProjectArn() != null
                && other.getProjectArn().equals(this.getProjectArn()) == false)
            return false;
        if (other.getCreationTimestamp() == null ^ this.getCreationTimestamp() == null)
            return false;
        if (other.getCreationTimestamp() != null
                && other.getCreationTimestamp().equals(this.getCreationTimestamp()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getDatasets() == null ^ this.getDatasets() == null)
            return false;
        if (other.getDatasets() != null && other.getDatasets().equals(this.getDatasets()) == false)
            return false;
        return true;
    }
}
