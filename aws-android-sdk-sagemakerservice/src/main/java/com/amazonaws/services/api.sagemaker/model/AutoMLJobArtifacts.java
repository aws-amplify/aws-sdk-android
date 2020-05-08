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

package com.amazonaws.services.api.sagemaker.model;

import java.io.Serializable;

/**
 * <p>
 * Artifacts that are generation during a job.
 * </p>
 */
public class AutoMLJobArtifacts implements Serializable {
    /**
     * <p>
     * The URL to the notebook location.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String candidateDefinitionNotebookLocation;

    /**
     * <p>
     * The URL to the notebook location.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String dataExplorationNotebookLocation;

    /**
     * <p>
     * The URL to the notebook location.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The URL to the notebook location.
     *         </p>
     */
    public String getCandidateDefinitionNotebookLocation() {
        return candidateDefinitionNotebookLocation;
    }

    /**
     * <p>
     * The URL to the notebook location.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param candidateDefinitionNotebookLocation <p>
     *            The URL to the notebook location.
     *            </p>
     */
    public void setCandidateDefinitionNotebookLocation(String candidateDefinitionNotebookLocation) {
        this.candidateDefinitionNotebookLocation = candidateDefinitionNotebookLocation;
    }

    /**
     * <p>
     * The URL to the notebook location.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param candidateDefinitionNotebookLocation <p>
     *            The URL to the notebook location.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutoMLJobArtifacts withCandidateDefinitionNotebookLocation(
            String candidateDefinitionNotebookLocation) {
        this.candidateDefinitionNotebookLocation = candidateDefinitionNotebookLocation;
        return this;
    }

    /**
     * <p>
     * The URL to the notebook location.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The URL to the notebook location.
     *         </p>
     */
    public String getDataExplorationNotebookLocation() {
        return dataExplorationNotebookLocation;
    }

    /**
     * <p>
     * The URL to the notebook location.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param dataExplorationNotebookLocation <p>
     *            The URL to the notebook location.
     *            </p>
     */
    public void setDataExplorationNotebookLocation(String dataExplorationNotebookLocation) {
        this.dataExplorationNotebookLocation = dataExplorationNotebookLocation;
    }

    /**
     * <p>
     * The URL to the notebook location.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param dataExplorationNotebookLocation <p>
     *            The URL to the notebook location.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutoMLJobArtifacts withDataExplorationNotebookLocation(
            String dataExplorationNotebookLocation) {
        this.dataExplorationNotebookLocation = dataExplorationNotebookLocation;
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
        if (getCandidateDefinitionNotebookLocation() != null)
            sb.append("CandidateDefinitionNotebookLocation: "
                    + getCandidateDefinitionNotebookLocation() + ",");
        if (getDataExplorationNotebookLocation() != null)
            sb.append("DataExplorationNotebookLocation: " + getDataExplorationNotebookLocation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getCandidateDefinitionNotebookLocation() == null) ? 0
                        : getCandidateDefinitionNotebookLocation().hashCode());
        hashCode = prime
                * hashCode
                + ((getDataExplorationNotebookLocation() == null) ? 0
                        : getDataExplorationNotebookLocation().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AutoMLJobArtifacts == false)
            return false;
        AutoMLJobArtifacts other = (AutoMLJobArtifacts) obj;

        if (other.getCandidateDefinitionNotebookLocation() == null
                ^ this.getCandidateDefinitionNotebookLocation() == null)
            return false;
        if (other.getCandidateDefinitionNotebookLocation() != null
                && other.getCandidateDefinitionNotebookLocation().equals(
                        this.getCandidateDefinitionNotebookLocation()) == false)
            return false;
        if (other.getDataExplorationNotebookLocation() == null
                ^ this.getDataExplorationNotebookLocation() == null)
            return false;
        if (other.getDataExplorationNotebookLocation() != null
                && other.getDataExplorationNotebookLocation().equals(
                        this.getDataExplorationNotebookLocation()) == false)
            return false;
        return true;
    }
}
