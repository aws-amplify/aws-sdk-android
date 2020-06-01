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

public class DescribeExperimentResult implements Serializable {
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
     * The ARN of the source and, optionally, the type.
     * </p>
     */
    private ExperimentSource source;

    /**
     * <p>
     * The description of the experiment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 3072<br/>
     * <b>Pattern: </b>.*<br/>
     */
    private String description;

    /**
     * <p>
     * When the experiment was created.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * Who created the experiment.
     * </p>
     */
    private UserContext createdBy;

    /**
     * <p>
     * When the experiment was last modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;

    /**
     * <p>
     * Who last modified the experiment.
     * </p>
     */
    private UserContext lastModifiedBy;

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
    public DescribeExperimentResult withExperimentName(String experimentName) {
        this.experimentName = experimentName;
        return this;
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
    public DescribeExperimentResult withExperimentArn(String experimentArn) {
        this.experimentArn = experimentArn;
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
    public DescribeExperimentResult withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * <p>
     * The ARN of the source and, optionally, the type.
     * </p>
     *
     * @return <p>
     *         The ARN of the source and, optionally, the type.
     *         </p>
     */
    public ExperimentSource getSource() {
        return source;
    }

    /**
     * <p>
     * The ARN of the source and, optionally, the type.
     * </p>
     *
     * @param source <p>
     *            The ARN of the source and, optionally, the type.
     *            </p>
     */
    public void setSource(ExperimentSource source) {
        this.source = source;
    }

    /**
     * <p>
     * The ARN of the source and, optionally, the type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param source <p>
     *            The ARN of the source and, optionally, the type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeExperimentResult withSource(ExperimentSource source) {
        this.source = source;
        return this;
    }

    /**
     * <p>
     * The description of the experiment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 3072<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @return <p>
     *         The description of the experiment.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description of the experiment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 3072<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param description <p>
     *            The description of the experiment.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the experiment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 3072<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param description <p>
     *            The description of the experiment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeExperimentResult withDescription(String description) {
        this.description = description;
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
    public DescribeExperimentResult withCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * <p>
     * Who created the experiment.
     * </p>
     *
     * @return <p>
     *         Who created the experiment.
     *         </p>
     */
    public UserContext getCreatedBy() {
        return createdBy;
    }

    /**
     * <p>
     * Who created the experiment.
     * </p>
     *
     * @param createdBy <p>
     *            Who created the experiment.
     *            </p>
     */
    public void setCreatedBy(UserContext createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * <p>
     * Who created the experiment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdBy <p>
     *            Who created the experiment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeExperimentResult withCreatedBy(UserContext createdBy) {
        this.createdBy = createdBy;
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
    public DescribeExperimentResult withLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    /**
     * <p>
     * Who last modified the experiment.
     * </p>
     *
     * @return <p>
     *         Who last modified the experiment.
     *         </p>
     */
    public UserContext getLastModifiedBy() {
        return lastModifiedBy;
    }

    /**
     * <p>
     * Who last modified the experiment.
     * </p>
     *
     * @param lastModifiedBy <p>
     *            Who last modified the experiment.
     *            </p>
     */
    public void setLastModifiedBy(UserContext lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    /**
     * <p>
     * Who last modified the experiment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModifiedBy <p>
     *            Who last modified the experiment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeExperimentResult withLastModifiedBy(UserContext lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
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
        if (getExperimentName() != null)
            sb.append("ExperimentName: " + getExperimentName() + ",");
        if (getExperimentArn() != null)
            sb.append("ExperimentArn: " + getExperimentArn() + ",");
        if (getDisplayName() != null)
            sb.append("DisplayName: " + getDisplayName() + ",");
        if (getSource() != null)
            sb.append("Source: " + getSource() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getCreationTime() != null)
            sb.append("CreationTime: " + getCreationTime() + ",");
        if (getCreatedBy() != null)
            sb.append("CreatedBy: " + getCreatedBy() + ",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: " + getLastModifiedTime() + ",");
        if (getLastModifiedBy() != null)
            sb.append("LastModifiedBy: " + getLastModifiedBy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getExperimentName() == null) ? 0 : getExperimentName().hashCode());
        hashCode = prime * hashCode
                + ((getExperimentArn() == null) ? 0 : getExperimentArn().hashCode());
        hashCode = prime * hashCode
                + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        hashCode = prime * hashCode
                + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode
                + ((getLastModifiedBy() == null) ? 0 : getLastModifiedBy().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeExperimentResult == false)
            return false;
        DescribeExperimentResult other = (DescribeExperimentResult) obj;

        if (other.getExperimentName() == null ^ this.getExperimentName() == null)
            return false;
        if (other.getExperimentName() != null
                && other.getExperimentName().equals(this.getExperimentName()) == false)
            return false;
        if (other.getExperimentArn() == null ^ this.getExperimentArn() == null)
            return false;
        if (other.getExperimentArn() != null
                && other.getExperimentArn().equals(this.getExperimentArn()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null
                && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null
                && other.getCreationTime().equals(this.getCreationTime()) == false)
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
        return true;
    }
}
