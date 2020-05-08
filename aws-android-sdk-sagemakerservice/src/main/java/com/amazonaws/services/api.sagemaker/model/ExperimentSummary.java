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
 * A summary of the properties of an experiment. To get the complete set of
 * properties, call the <a>DescribeExperiment</a> API and provide the
 * <code>ExperimentName</code>.
 * </p>
 */
public class ExperimentSummary implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the experiment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:experiment/.*<br/>
     */
    private String experimentArn;

    /**
     * <p>
     * The name of the experiment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 82<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     */
    private String experimentName;

    /**
     * <p>
     * The name of the experiment as displayed. If <code>DisplayName</code>
     * isn't specified, <code>ExperimentName</code> is displayed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 82<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     */
    private String displayName;

    /**
     * <p>
     * The source of the experiment.
     * </p>
     */
    private ExperimentSource experimentSource;

    /**
     * <p>
     * When the experiment was created.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * When the experiment was last modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the experiment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:experiment/.*<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the experiment.
     *         </p>
     */
    public String getExperimentArn() {
        return experimentArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the experiment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:experiment/.*<br/>
     *
     * @param experimentArn <p>
     *            The Amazon Resource Name (ARN) of the experiment.
     *            </p>
     */
    public void setExperimentArn(String experimentArn) {
        this.experimentArn = experimentArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the experiment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:experiment/.*<br/>
     *
     * @param experimentArn <p>
     *            The Amazon Resource Name (ARN) of the experiment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExperimentSummary withExperimentArn(String experimentArn) {
        this.experimentArn = experimentArn;
        return this;
    }

    /**
     * <p>
     * The name of the experiment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 82<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @return <p>
     *         The name of the experiment.
     *         </p>
     */
    public String getExperimentName() {
        return experimentName;
    }

    /**
     * <p>
     * The name of the experiment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 82<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param experimentName <p>
     *            The name of the experiment.
     *            </p>
     */
    public void setExperimentName(String experimentName) {
        this.experimentName = experimentName;
    }

    /**
     * <p>
     * The name of the experiment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 82<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param experimentName <p>
     *            The name of the experiment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExperimentSummary withExperimentName(String experimentName) {
        this.experimentName = experimentName;
        return this;
    }

    /**
     * <p>
     * The name of the experiment as displayed. If <code>DisplayName</code>
     * isn't specified, <code>ExperimentName</code> is displayed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 82<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @return <p>
     *         The name of the experiment as displayed. If
     *         <code>DisplayName</code> isn't specified,
     *         <code>ExperimentName</code> is displayed.
     *         </p>
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * <p>
     * The name of the experiment as displayed. If <code>DisplayName</code>
     * isn't specified, <code>ExperimentName</code> is displayed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 82<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param displayName <p>
     *            The name of the experiment as displayed. If
     *            <code>DisplayName</code> isn't specified,
     *            <code>ExperimentName</code> is displayed.
     *            </p>
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The name of the experiment as displayed. If <code>DisplayName</code>
     * isn't specified, <code>ExperimentName</code> is displayed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 82<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param displayName <p>
     *            The name of the experiment as displayed. If
     *            <code>DisplayName</code> isn't specified,
     *            <code>ExperimentName</code> is displayed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExperimentSummary withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * <p>
     * The source of the experiment.
     * </p>
     *
     * @return <p>
     *         The source of the experiment.
     *         </p>
     */
    public ExperimentSource getExperimentSource() {
        return experimentSource;
    }

    /**
     * <p>
     * The source of the experiment.
     * </p>
     *
     * @param experimentSource <p>
     *            The source of the experiment.
     *            </p>
     */
    public void setExperimentSource(ExperimentSource experimentSource) {
        this.experimentSource = experimentSource;
    }

    /**
     * <p>
     * The source of the experiment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param experimentSource <p>
     *            The source of the experiment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExperimentSummary withExperimentSource(ExperimentSource experimentSource) {
        this.experimentSource = experimentSource;
        return this;
    }

    /**
     * <p>
     * When the experiment was created.
     * </p>
     *
     * @return <p>
     *         When the experiment was created.
     *         </p>
     */
    public java.util.Date getCreationTime() {
        return creationTime;
    }

    /**
     * <p>
     * When the experiment was created.
     * </p>
     *
     * @param creationTime <p>
     *            When the experiment was created.
     *            </p>
     */
    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * When the experiment was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTime <p>
     *            When the experiment was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExperimentSummary withCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * <p>
     * When the experiment was last modified.
     * </p>
     *
     * @return <p>
     *         When the experiment was last modified.
     *         </p>
     */
    public java.util.Date getLastModifiedTime() {
        return lastModifiedTime;
    }

    /**
     * <p>
     * When the experiment was last modified.
     * </p>
     *
     * @param lastModifiedTime <p>
     *            When the experiment was last modified.
     *            </p>
     */
    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * When the experiment was last modified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModifiedTime <p>
     *            When the experiment was last modified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExperimentSummary withLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
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
        if (getExperimentArn() != null)
            sb.append("ExperimentArn: " + getExperimentArn() + ",");
        if (getExperimentName() != null)
            sb.append("ExperimentName: " + getExperimentName() + ",");
        if (getDisplayName() != null)
            sb.append("DisplayName: " + getDisplayName() + ",");
        if (getExperimentSource() != null)
            sb.append("ExperimentSource: " + getExperimentSource() + ",");
        if (getCreationTime() != null)
            sb.append("CreationTime: " + getCreationTime() + ",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: " + getLastModifiedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getExperimentArn() == null) ? 0 : getExperimentArn().hashCode());
        hashCode = prime * hashCode
                + ((getExperimentName() == null) ? 0 : getExperimentName().hashCode());
        hashCode = prime * hashCode
                + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode
                + ((getExperimentSource() == null) ? 0 : getExperimentSource().hashCode());
        hashCode = prime * hashCode
                + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode
                + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExperimentSummary == false)
            return false;
        ExperimentSummary other = (ExperimentSummary) obj;

        if (other.getExperimentArn() == null ^ this.getExperimentArn() == null)
            return false;
        if (other.getExperimentArn() != null
                && other.getExperimentArn().equals(this.getExperimentArn()) == false)
            return false;
        if (other.getExperimentName() == null ^ this.getExperimentName() == null)
            return false;
        if (other.getExperimentName() != null
                && other.getExperimentName().equals(this.getExperimentName()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null
                && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getExperimentSource() == null ^ this.getExperimentSource() == null)
            return false;
        if (other.getExperimentSource() != null
                && other.getExperimentSource().equals(this.getExperimentSource()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null
                && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null
                && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        return true;
    }
}
