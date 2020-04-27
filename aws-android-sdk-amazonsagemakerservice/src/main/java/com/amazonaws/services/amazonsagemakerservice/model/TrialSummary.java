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
 * A summary of the properties of a trial. To get the complete set of
 * properties, call the <a>DescribeTrial</a> API and provide the
 * <code>TrialName</code>.
 * </p>
 */
public class TrialSummary implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the trial.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:experiment-trial/.*
     * <br/>
     */
    private String trialArn;

    /**
     * <p>
     * The name of the trial.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 82<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     */
    private String trialName;

    /**
     * <p>
     * The name of the trial as displayed. If <code>DisplayName</code> isn't
     * specified, <code>TrialName</code> is displayed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 82<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     */
    private String displayName;

    /**
     * <p>
     * The source of the trial.
     * </p>
     */
    private TrialSource trialSource;

    /**
     * <p>
     * When the trial was created.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * When the trial was last modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the trial.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:experiment-trial/.*
     * <br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the trial.
     *         </p>
     */
    public String getTrialArn() {
        return trialArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the trial.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:experiment-trial/.*
     * <br/>
     *
     * @param trialArn <p>
     *            The Amazon Resource Name (ARN) of the trial.
     *            </p>
     */
    public void setTrialArn(String trialArn) {
        this.trialArn = trialArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the trial.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:experiment-trial/.*
     * <br/>
     *
     * @param trialArn <p>
     *            The Amazon Resource Name (ARN) of the trial.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrialSummary withTrialArn(String trialArn) {
        this.trialArn = trialArn;
        return this;
    }

    /**
     * <p>
     * The name of the trial.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 82<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @return <p>
     *         The name of the trial.
     *         </p>
     */
    public String getTrialName() {
        return trialName;
    }

    /**
     * <p>
     * The name of the trial.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 82<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param trialName <p>
     *            The name of the trial.
     *            </p>
     */
    public void setTrialName(String trialName) {
        this.trialName = trialName;
    }

    /**
     * <p>
     * The name of the trial.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 82<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param trialName <p>
     *            The name of the trial.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrialSummary withTrialName(String trialName) {
        this.trialName = trialName;
        return this;
    }

    /**
     * <p>
     * The name of the trial as displayed. If <code>DisplayName</code> isn't
     * specified, <code>TrialName</code> is displayed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 82<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @return <p>
     *         The name of the trial as displayed. If <code>DisplayName</code>
     *         isn't specified, <code>TrialName</code> is displayed.
     *         </p>
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * <p>
     * The name of the trial as displayed. If <code>DisplayName</code> isn't
     * specified, <code>TrialName</code> is displayed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 82<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param displayName <p>
     *            The name of the trial as displayed. If
     *            <code>DisplayName</code> isn't specified,
     *            <code>TrialName</code> is displayed.
     *            </p>
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The name of the trial as displayed. If <code>DisplayName</code> isn't
     * specified, <code>TrialName</code> is displayed.
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
     *            The name of the trial as displayed. If
     *            <code>DisplayName</code> isn't specified,
     *            <code>TrialName</code> is displayed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrialSummary withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * <p>
     * The source of the trial.
     * </p>
     *
     * @return <p>
     *         The source of the trial.
     *         </p>
     */
    public TrialSource getTrialSource() {
        return trialSource;
    }

    /**
     * <p>
     * The source of the trial.
     * </p>
     *
     * @param trialSource <p>
     *            The source of the trial.
     *            </p>
     */
    public void setTrialSource(TrialSource trialSource) {
        this.trialSource = trialSource;
    }

    /**
     * <p>
     * The source of the trial.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param trialSource <p>
     *            The source of the trial.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrialSummary withTrialSource(TrialSource trialSource) {
        this.trialSource = trialSource;
        return this;
    }

    /**
     * <p>
     * When the trial was created.
     * </p>
     *
     * @return <p>
     *         When the trial was created.
     *         </p>
     */
    public java.util.Date getCreationTime() {
        return creationTime;
    }

    /**
     * <p>
     * When the trial was created.
     * </p>
     *
     * @param creationTime <p>
     *            When the trial was created.
     *            </p>
     */
    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * When the trial was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTime <p>
     *            When the trial was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrialSummary withCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * <p>
     * When the trial was last modified.
     * </p>
     *
     * @return <p>
     *         When the trial was last modified.
     *         </p>
     */
    public java.util.Date getLastModifiedTime() {
        return lastModifiedTime;
    }

    /**
     * <p>
     * When the trial was last modified.
     * </p>
     *
     * @param lastModifiedTime <p>
     *            When the trial was last modified.
     *            </p>
     */
    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * When the trial was last modified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModifiedTime <p>
     *            When the trial was last modified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrialSummary withLastModifiedTime(java.util.Date lastModifiedTime) {
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
        if (getTrialArn() != null)
            sb.append("TrialArn: " + getTrialArn() + ",");
        if (getTrialName() != null)
            sb.append("TrialName: " + getTrialName() + ",");
        if (getDisplayName() != null)
            sb.append("DisplayName: " + getDisplayName() + ",");
        if (getTrialSource() != null)
            sb.append("TrialSource: " + getTrialSource() + ",");
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

        hashCode = prime * hashCode + ((getTrialArn() == null) ? 0 : getTrialArn().hashCode());
        hashCode = prime * hashCode + ((getTrialName() == null) ? 0 : getTrialName().hashCode());
        hashCode = prime * hashCode
                + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode
                + ((getTrialSource() == null) ? 0 : getTrialSource().hashCode());
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

        if (obj instanceof TrialSummary == false)
            return false;
        TrialSummary other = (TrialSummary) obj;

        if (other.getTrialArn() == null ^ this.getTrialArn() == null)
            return false;
        if (other.getTrialArn() != null && other.getTrialArn().equals(this.getTrialArn()) == false)
            return false;
        if (other.getTrialName() == null ^ this.getTrialName() == null)
            return false;
        if (other.getTrialName() != null
                && other.getTrialName().equals(this.getTrialName()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null
                && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getTrialSource() == null ^ this.getTrialSource() == null)
            return false;
        if (other.getTrialSource() != null
                && other.getTrialSource().equals(this.getTrialSource()) == false)
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
