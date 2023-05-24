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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

/**
 * <p>
 * Summary information about an evaluation form.
 * </p>
 */
public class EvaluationFormSummary implements Serializable {
    /**
     * <p>
     * The unique identifier for the evaluation form.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 500<br/>
     */
    private String evaluationFormId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the evaluation form resource.
     * </p>
     */
    private String evaluationFormArn;

    /**
     * <p>
     * A title of the evaluation form.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     */
    private String title;

    /**
     * <p>
     * The timestamp for when the evaluation form was created.
     * </p>
     */
    private java.util.Date createdTime;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who created the evaluation
     * form.
     * </p>
     */
    private String createdBy;

    /**
     * <p>
     * The timestamp for when the evaluation form was last updated.
     * </p>
     */
    private java.util.Date lastModifiedTime;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who last updated the
     * evaluation form.
     * </p>
     */
    private String lastModifiedBy;

    /**
     * <p>
     * The timestamp for when the evaluation form was last activated.
     * </p>
     */
    private java.util.Date lastActivatedTime;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who last activated the
     * evaluation form.
     * </p>
     */
    private String lastActivatedBy;

    /**
     * <p>
     * The version number of the latest evaluation form version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Integer latestVersion;

    /**
     * <p>
     * The version of the active evaluation form version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Integer activeVersion;

    /**
     * <p>
     * The unique identifier for the evaluation form.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 500<br/>
     *
     * @return <p>
     *         The unique identifier for the evaluation form.
     *         </p>
     */
    public String getEvaluationFormId() {
        return evaluationFormId;
    }

    /**
     * <p>
     * The unique identifier for the evaluation form.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 500<br/>
     *
     * @param evaluationFormId <p>
     *            The unique identifier for the evaluation form.
     *            </p>
     */
    public void setEvaluationFormId(String evaluationFormId) {
        this.evaluationFormId = evaluationFormId;
    }

    /**
     * <p>
     * The unique identifier for the evaluation form.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 500<br/>
     *
     * @param evaluationFormId <p>
     *            The unique identifier for the evaluation form.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EvaluationFormSummary withEvaluationFormId(String evaluationFormId) {
        this.evaluationFormId = evaluationFormId;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the evaluation form resource.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) for the evaluation form resource.
     *         </p>
     */
    public String getEvaluationFormArn() {
        return evaluationFormArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the evaluation form resource.
     * </p>
     *
     * @param evaluationFormArn <p>
     *            The Amazon Resource Name (ARN) for the evaluation form
     *            resource.
     *            </p>
     */
    public void setEvaluationFormArn(String evaluationFormArn) {
        this.evaluationFormArn = evaluationFormArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the evaluation form resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param evaluationFormArn <p>
     *            The Amazon Resource Name (ARN) for the evaluation form
     *            resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EvaluationFormSummary withEvaluationFormArn(String evaluationFormArn) {
        this.evaluationFormArn = evaluationFormArn;
        return this;
    }

    /**
     * <p>
     * A title of the evaluation form.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @return <p>
     *         A title of the evaluation form.
     *         </p>
     */
    public String getTitle() {
        return title;
    }

    /**
     * <p>
     * A title of the evaluation form.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param title <p>
     *            A title of the evaluation form.
     *            </p>
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * <p>
     * A title of the evaluation form.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param title <p>
     *            A title of the evaluation form.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EvaluationFormSummary withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * <p>
     * The timestamp for when the evaluation form was created.
     * </p>
     *
     * @return <p>
     *         The timestamp for when the evaluation form was created.
     *         </p>
     */
    public java.util.Date getCreatedTime() {
        return createdTime;
    }

    /**
     * <p>
     * The timestamp for when the evaluation form was created.
     * </p>
     *
     * @param createdTime <p>
     *            The timestamp for when the evaluation form was created.
     *            </p>
     */
    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The timestamp for when the evaluation form was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdTime <p>
     *            The timestamp for when the evaluation form was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EvaluationFormSummary withCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who created the evaluation
     * form.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the user who created the
     *         evaluation form.
     *         </p>
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who created the evaluation
     * form.
     * </p>
     *
     * @param createdBy <p>
     *            The Amazon Resource Name (ARN) of the user who created the
     *            evaluation form.
     *            </p>
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who created the evaluation
     * form.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdBy <p>
     *            The Amazon Resource Name (ARN) of the user who created the
     *            evaluation form.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EvaluationFormSummary withCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * <p>
     * The timestamp for when the evaluation form was last updated.
     * </p>
     *
     * @return <p>
     *         The timestamp for when the evaluation form was last updated.
     *         </p>
     */
    public java.util.Date getLastModifiedTime() {
        return lastModifiedTime;
    }

    /**
     * <p>
     * The timestamp for when the evaluation form was last updated.
     * </p>
     *
     * @param lastModifiedTime <p>
     *            The timestamp for when the evaluation form was last updated.
     *            </p>
     */
    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The timestamp for when the evaluation form was last updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModifiedTime <p>
     *            The timestamp for when the evaluation form was last updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EvaluationFormSummary withLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who last updated the
     * evaluation form.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the user who last updated the
     *         evaluation form.
     *         </p>
     */
    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who last updated the
     * evaluation form.
     * </p>
     *
     * @param lastModifiedBy <p>
     *            The Amazon Resource Name (ARN) of the user who last updated
     *            the evaluation form.
     *            </p>
     */
    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who last updated the
     * evaluation form.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModifiedBy <p>
     *            The Amazon Resource Name (ARN) of the user who last updated
     *            the evaluation form.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EvaluationFormSummary withLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     * <p>
     * The timestamp for when the evaluation form was last activated.
     * </p>
     *
     * @return <p>
     *         The timestamp for when the evaluation form was last activated.
     *         </p>
     */
    public java.util.Date getLastActivatedTime() {
        return lastActivatedTime;
    }

    /**
     * <p>
     * The timestamp for when the evaluation form was last activated.
     * </p>
     *
     * @param lastActivatedTime <p>
     *            The timestamp for when the evaluation form was last activated.
     *            </p>
     */
    public void setLastActivatedTime(java.util.Date lastActivatedTime) {
        this.lastActivatedTime = lastActivatedTime;
    }

    /**
     * <p>
     * The timestamp for when the evaluation form was last activated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastActivatedTime <p>
     *            The timestamp for when the evaluation form was last activated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EvaluationFormSummary withLastActivatedTime(java.util.Date lastActivatedTime) {
        this.lastActivatedTime = lastActivatedTime;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who last activated the
     * evaluation form.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the user who last activated the
     *         evaluation form.
     *         </p>
     */
    public String getLastActivatedBy() {
        return lastActivatedBy;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who last activated the
     * evaluation form.
     * </p>
     *
     * @param lastActivatedBy <p>
     *            The Amazon Resource Name (ARN) of the user who last activated
     *            the evaluation form.
     *            </p>
     */
    public void setLastActivatedBy(String lastActivatedBy) {
        this.lastActivatedBy = lastActivatedBy;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who last activated the
     * evaluation form.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastActivatedBy <p>
     *            The Amazon Resource Name (ARN) of the user who last activated
     *            the evaluation form.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EvaluationFormSummary withLastActivatedBy(String lastActivatedBy) {
        this.lastActivatedBy = lastActivatedBy;
        return this;
    }

    /**
     * <p>
     * The version number of the latest evaluation form version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return <p>
     *         The version number of the latest evaluation form version.
     *         </p>
     */
    public Integer getLatestVersion() {
        return latestVersion;
    }

    /**
     * <p>
     * The version number of the latest evaluation form version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param latestVersion <p>
     *            The version number of the latest evaluation form version.
     *            </p>
     */
    public void setLatestVersion(Integer latestVersion) {
        this.latestVersion = latestVersion;
    }

    /**
     * <p>
     * The version number of the latest evaluation form version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param latestVersion <p>
     *            The version number of the latest evaluation form version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EvaluationFormSummary withLatestVersion(Integer latestVersion) {
        this.latestVersion = latestVersion;
        return this;
    }

    /**
     * <p>
     * The version of the active evaluation form version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return <p>
     *         The version of the active evaluation form version.
     *         </p>
     */
    public Integer getActiveVersion() {
        return activeVersion;
    }

    /**
     * <p>
     * The version of the active evaluation form version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param activeVersion <p>
     *            The version of the active evaluation form version.
     *            </p>
     */
    public void setActiveVersion(Integer activeVersion) {
        this.activeVersion = activeVersion;
    }

    /**
     * <p>
     * The version of the active evaluation form version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param activeVersion <p>
     *            The version of the active evaluation form version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EvaluationFormSummary withActiveVersion(Integer activeVersion) {
        this.activeVersion = activeVersion;
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
        if (getEvaluationFormId() != null)
            sb.append("EvaluationFormId: " + getEvaluationFormId() + ",");
        if (getEvaluationFormArn() != null)
            sb.append("EvaluationFormArn: " + getEvaluationFormArn() + ",");
        if (getTitle() != null)
            sb.append("Title: " + getTitle() + ",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: " + getCreatedTime() + ",");
        if (getCreatedBy() != null)
            sb.append("CreatedBy: " + getCreatedBy() + ",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: " + getLastModifiedTime() + ",");
        if (getLastModifiedBy() != null)
            sb.append("LastModifiedBy: " + getLastModifiedBy() + ",");
        if (getLastActivatedTime() != null)
            sb.append("LastActivatedTime: " + getLastActivatedTime() + ",");
        if (getLastActivatedBy() != null)
            sb.append("LastActivatedBy: " + getLastActivatedBy() + ",");
        if (getLatestVersion() != null)
            sb.append("LatestVersion: " + getLatestVersion() + ",");
        if (getActiveVersion() != null)
            sb.append("ActiveVersion: " + getActiveVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getEvaluationFormId() == null) ? 0 : getEvaluationFormId().hashCode());
        hashCode = prime * hashCode
                + ((getEvaluationFormArn() == null) ? 0 : getEvaluationFormArn().hashCode());
        hashCode = prime * hashCode + ((getTitle() == null) ? 0 : getTitle().hashCode());
        hashCode = prime * hashCode
                + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        hashCode = prime * hashCode
                + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode
                + ((getLastModifiedBy() == null) ? 0 : getLastModifiedBy().hashCode());
        hashCode = prime * hashCode
                + ((getLastActivatedTime() == null) ? 0 : getLastActivatedTime().hashCode());
        hashCode = prime * hashCode
                + ((getLastActivatedBy() == null) ? 0 : getLastActivatedBy().hashCode());
        hashCode = prime * hashCode
                + ((getLatestVersion() == null) ? 0 : getLatestVersion().hashCode());
        hashCode = prime * hashCode
                + ((getActiveVersion() == null) ? 0 : getActiveVersion().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EvaluationFormSummary == false)
            return false;
        EvaluationFormSummary other = (EvaluationFormSummary) obj;

        if (other.getEvaluationFormId() == null ^ this.getEvaluationFormId() == null)
            return false;
        if (other.getEvaluationFormId() != null
                && other.getEvaluationFormId().equals(this.getEvaluationFormId()) == false)
            return false;
        if (other.getEvaluationFormArn() == null ^ this.getEvaluationFormArn() == null)
            return false;
        if (other.getEvaluationFormArn() != null
                && other.getEvaluationFormArn().equals(this.getEvaluationFormArn()) == false)
            return false;
        if (other.getTitle() == null ^ this.getTitle() == null)
            return false;
        if (other.getTitle() != null && other.getTitle().equals(this.getTitle()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null
                && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getCreatedBy() == null ^ this.getCreatedBy() == null)
            return false;
        if (other.getCreatedBy() != null
                && other.getCreatedBy().equals(this.getCreatedBy()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null
                && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getLastModifiedBy() == null ^ this.getLastModifiedBy() == null)
            return false;
        if (other.getLastModifiedBy() != null
                && other.getLastModifiedBy().equals(this.getLastModifiedBy()) == false)
            return false;
        if (other.getLastActivatedTime() == null ^ this.getLastActivatedTime() == null)
            return false;
        if (other.getLastActivatedTime() != null
                && other.getLastActivatedTime().equals(this.getLastActivatedTime()) == false)
            return false;
        if (other.getLastActivatedBy() == null ^ this.getLastActivatedBy() == null)
            return false;
        if (other.getLastActivatedBy() != null
                && other.getLastActivatedBy().equals(this.getLastActivatedBy()) == false)
            return false;
        if (other.getLatestVersion() == null ^ this.getLatestVersion() == null)
            return false;
        if (other.getLatestVersion() != null
                && other.getLatestVersion().equals(this.getLatestVersion()) == false)
            return false;
        if (other.getActiveVersion() == null ^ this.getActiveVersion() == null)
            return false;
        if (other.getActiveVersion() != null
                && other.getActiveVersion().equals(this.getActiveVersion()) == false)
            return false;
        return true;
    }
}
