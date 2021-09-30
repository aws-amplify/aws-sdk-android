/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.comprehend.model;

import java.io.Serializable;

/**
 * <p>
 * Describes the information about an entity recognizer and its versions.
 * </p>
 */
public class EntityRecognizerSummary implements Serializable {
    /**
     * <p>
     * The name that you assigned the entity recognizer.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*$<br/>
     */
    private String recognizerName;

    /**
     * <p>
     * The number of versions you created.
     * </p>
     */
    private Integer numberOfVersions;

    /**
     * <p>
     * The time that the latest entity recognizer version was submitted for
     * processing.
     * </p>
     */
    private java.util.Date latestVersionCreatedAt;

    /**
     * <p>
     * The version name you assigned to the latest entity recognizer version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*$<br/>
     */
    private String latestVersionName;

    /**
     * <p>
     * Provides the status of the latest entity recognizer version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUBMITTED, TRAINING, DELETING, STOP_REQUESTED,
     * STOPPED, IN_ERROR, TRAINED
     */
    private String latestVersionStatus;

    /**
     * <p>
     * The name that you assigned the entity recognizer.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*$<br/>
     *
     * @return <p>
     *         The name that you assigned the entity recognizer.
     *         </p>
     */
    public String getRecognizerName() {
        return recognizerName;
    }

    /**
     * <p>
     * The name that you assigned the entity recognizer.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*$<br/>
     *
     * @param recognizerName <p>
     *            The name that you assigned the entity recognizer.
     *            </p>
     */
    public void setRecognizerName(String recognizerName) {
        this.recognizerName = recognizerName;
    }

    /**
     * <p>
     * The name that you assigned the entity recognizer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*$<br/>
     *
     * @param recognizerName <p>
     *            The name that you assigned the entity recognizer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EntityRecognizerSummary withRecognizerName(String recognizerName) {
        this.recognizerName = recognizerName;
        return this;
    }

    /**
     * <p>
     * The number of versions you created.
     * </p>
     *
     * @return <p>
     *         The number of versions you created.
     *         </p>
     */
    public Integer getNumberOfVersions() {
        return numberOfVersions;
    }

    /**
     * <p>
     * The number of versions you created.
     * </p>
     *
     * @param numberOfVersions <p>
     *            The number of versions you created.
     *            </p>
     */
    public void setNumberOfVersions(Integer numberOfVersions) {
        this.numberOfVersions = numberOfVersions;
    }

    /**
     * <p>
     * The number of versions you created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param numberOfVersions <p>
     *            The number of versions you created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EntityRecognizerSummary withNumberOfVersions(Integer numberOfVersions) {
        this.numberOfVersions = numberOfVersions;
        return this;
    }

    /**
     * <p>
     * The time that the latest entity recognizer version was submitted for
     * processing.
     * </p>
     *
     * @return <p>
     *         The time that the latest entity recognizer version was submitted
     *         for processing.
     *         </p>
     */
    public java.util.Date getLatestVersionCreatedAt() {
        return latestVersionCreatedAt;
    }

    /**
     * <p>
     * The time that the latest entity recognizer version was submitted for
     * processing.
     * </p>
     *
     * @param latestVersionCreatedAt <p>
     *            The time that the latest entity recognizer version was
     *            submitted for processing.
     *            </p>
     */
    public void setLatestVersionCreatedAt(java.util.Date latestVersionCreatedAt) {
        this.latestVersionCreatedAt = latestVersionCreatedAt;
    }

    /**
     * <p>
     * The time that the latest entity recognizer version was submitted for
     * processing.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param latestVersionCreatedAt <p>
     *            The time that the latest entity recognizer version was
     *            submitted for processing.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EntityRecognizerSummary withLatestVersionCreatedAt(java.util.Date latestVersionCreatedAt) {
        this.latestVersionCreatedAt = latestVersionCreatedAt;
        return this;
    }

    /**
     * <p>
     * The version name you assigned to the latest entity recognizer version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*$<br/>
     *
     * @return <p>
     *         The version name you assigned to the latest entity recognizer
     *         version.
     *         </p>
     */
    public String getLatestVersionName() {
        return latestVersionName;
    }

    /**
     * <p>
     * The version name you assigned to the latest entity recognizer version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*$<br/>
     *
     * @param latestVersionName <p>
     *            The version name you assigned to the latest entity recognizer
     *            version.
     *            </p>
     */
    public void setLatestVersionName(String latestVersionName) {
        this.latestVersionName = latestVersionName;
    }

    /**
     * <p>
     * The version name you assigned to the latest entity recognizer version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*$<br/>
     *
     * @param latestVersionName <p>
     *            The version name you assigned to the latest entity recognizer
     *            version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EntityRecognizerSummary withLatestVersionName(String latestVersionName) {
        this.latestVersionName = latestVersionName;
        return this;
    }

    /**
     * <p>
     * Provides the status of the latest entity recognizer version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUBMITTED, TRAINING, DELETING, STOP_REQUESTED,
     * STOPPED, IN_ERROR, TRAINED
     *
     * @return <p>
     *         Provides the status of the latest entity recognizer version.
     *         </p>
     * @see ModelStatus
     */
    public String getLatestVersionStatus() {
        return latestVersionStatus;
    }

    /**
     * <p>
     * Provides the status of the latest entity recognizer version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUBMITTED, TRAINING, DELETING, STOP_REQUESTED,
     * STOPPED, IN_ERROR, TRAINED
     *
     * @param latestVersionStatus <p>
     *            Provides the status of the latest entity recognizer version.
     *            </p>
     * @see ModelStatus
     */
    public void setLatestVersionStatus(String latestVersionStatus) {
        this.latestVersionStatus = latestVersionStatus;
    }

    /**
     * <p>
     * Provides the status of the latest entity recognizer version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUBMITTED, TRAINING, DELETING, STOP_REQUESTED,
     * STOPPED, IN_ERROR, TRAINED
     *
     * @param latestVersionStatus <p>
     *            Provides the status of the latest entity recognizer version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ModelStatus
     */
    public EntityRecognizerSummary withLatestVersionStatus(String latestVersionStatus) {
        this.latestVersionStatus = latestVersionStatus;
        return this;
    }

    /**
     * <p>
     * Provides the status of the latest entity recognizer version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUBMITTED, TRAINING, DELETING, STOP_REQUESTED,
     * STOPPED, IN_ERROR, TRAINED
     *
     * @param latestVersionStatus <p>
     *            Provides the status of the latest entity recognizer version.
     *            </p>
     * @see ModelStatus
     */
    public void setLatestVersionStatus(ModelStatus latestVersionStatus) {
        this.latestVersionStatus = latestVersionStatus.toString();
    }

    /**
     * <p>
     * Provides the status of the latest entity recognizer version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUBMITTED, TRAINING, DELETING, STOP_REQUESTED,
     * STOPPED, IN_ERROR, TRAINED
     *
     * @param latestVersionStatus <p>
     *            Provides the status of the latest entity recognizer version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ModelStatus
     */
    public EntityRecognizerSummary withLatestVersionStatus(ModelStatus latestVersionStatus) {
        this.latestVersionStatus = latestVersionStatus.toString();
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
        if (getRecognizerName() != null)
            sb.append("RecognizerName: " + getRecognizerName() + ",");
        if (getNumberOfVersions() != null)
            sb.append("NumberOfVersions: " + getNumberOfVersions() + ",");
        if (getLatestVersionCreatedAt() != null)
            sb.append("LatestVersionCreatedAt: " + getLatestVersionCreatedAt() + ",");
        if (getLatestVersionName() != null)
            sb.append("LatestVersionName: " + getLatestVersionName() + ",");
        if (getLatestVersionStatus() != null)
            sb.append("LatestVersionStatus: " + getLatestVersionStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getRecognizerName() == null) ? 0 : getRecognizerName().hashCode());
        hashCode = prime * hashCode
                + ((getNumberOfVersions() == null) ? 0 : getNumberOfVersions().hashCode());
        hashCode = prime
                * hashCode
                + ((getLatestVersionCreatedAt() == null) ? 0 : getLatestVersionCreatedAt()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getLatestVersionName() == null) ? 0 : getLatestVersionName().hashCode());
        hashCode = prime * hashCode
                + ((getLatestVersionStatus() == null) ? 0 : getLatestVersionStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EntityRecognizerSummary == false)
            return false;
        EntityRecognizerSummary other = (EntityRecognizerSummary) obj;

        if (other.getRecognizerName() == null ^ this.getRecognizerName() == null)
            return false;
        if (other.getRecognizerName() != null
                && other.getRecognizerName().equals(this.getRecognizerName()) == false)
            return false;
        if (other.getNumberOfVersions() == null ^ this.getNumberOfVersions() == null)
            return false;
        if (other.getNumberOfVersions() != null
                && other.getNumberOfVersions().equals(this.getNumberOfVersions()) == false)
            return false;
        if (other.getLatestVersionCreatedAt() == null ^ this.getLatestVersionCreatedAt() == null)
            return false;
        if (other.getLatestVersionCreatedAt() != null
                && other.getLatestVersionCreatedAt().equals(this.getLatestVersionCreatedAt()) == false)
            return false;
        if (other.getLatestVersionName() == null ^ this.getLatestVersionName() == null)
            return false;
        if (other.getLatestVersionName() != null
                && other.getLatestVersionName().equals(this.getLatestVersionName()) == false)
            return false;
        if (other.getLatestVersionStatus() == null ^ this.getLatestVersionStatus() == null)
            return false;
        if (other.getLatestVersionStatus() != null
                && other.getLatestVersionStatus().equals(this.getLatestVersionStatus()) == false)
            return false;
        return true;
    }
}
