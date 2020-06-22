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

package com.amazonaws.services.rds.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Copies the specified DB parameter group.
 * </p>
 */
public class CopyDBParameterGroupRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The identifier or ARN for the source DB parameter group. For information
     * about creating an ARN, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.ARN.html#USER_Tagging.ARN.Constructing"
     * > Constructing an ARN for Amazon RDS</a> in the <i>Amazon RDS User
     * Guide</i>.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must specify a valid DB parameter group.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must specify a valid DB parameter group identifier, for example
     * <code>my-db-param-group</code>, or a valid ARN.
     * </p>
     * </li>
     * </ul>
     */
    private String sourceDBParameterGroupIdentifier;

    /**
     * <p>
     * The identifier for the copied DB parameter group.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Can't be null, empty, or blank
     * </p>
     * </li>
     * <li>
     * <p>
     * Must contain from 1 to 255 letters, numbers, or hyphens
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>my-db-parameter-group</code>
     * </p>
     */
    private String targetDBParameterGroupIdentifier;

    /**
     * <p>
     * A description for the copied DB parameter group.
     * </p>
     */
    private String targetDBParameterGroupDescription;

    /**
     * <p>
     * A list of tags. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html"
     * >Tagging Amazon RDS Resources</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The identifier or ARN for the source DB parameter group. For information
     * about creating an ARN, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.ARN.html#USER_Tagging.ARN.Constructing"
     * > Constructing an ARN for Amazon RDS</a> in the <i>Amazon RDS User
     * Guide</i>.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must specify a valid DB parameter group.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must specify a valid DB parameter group identifier, for example
     * <code>my-db-param-group</code>, or a valid ARN.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The identifier or ARN for the source DB parameter group. For
     *         information about creating an ARN, see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.ARN.html#USER_Tagging.ARN.Constructing"
     *         > Constructing an ARN for Amazon RDS</a> in the <i>Amazon RDS
     *         User Guide</i>.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must specify a valid DB parameter group.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must specify a valid DB parameter group identifier, for example
     *         <code>my-db-param-group</code>, or a valid ARN.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getSourceDBParameterGroupIdentifier() {
        return sourceDBParameterGroupIdentifier;
    }

    /**
     * <p>
     * The identifier or ARN for the source DB parameter group. For information
     * about creating an ARN, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.ARN.html#USER_Tagging.ARN.Constructing"
     * > Constructing an ARN for Amazon RDS</a> in the <i>Amazon RDS User
     * Guide</i>.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must specify a valid DB parameter group.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must specify a valid DB parameter group identifier, for example
     * <code>my-db-param-group</code>, or a valid ARN.
     * </p>
     * </li>
     * </ul>
     *
     * @param sourceDBParameterGroupIdentifier <p>
     *            The identifier or ARN for the source DB parameter group. For
     *            information about creating an ARN, see <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.ARN.html#USER_Tagging.ARN.Constructing"
     *            > Constructing an ARN for Amazon RDS</a> in the <i>Amazon RDS
     *            User Guide</i>.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must specify a valid DB parameter group.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Must specify a valid DB parameter group identifier, for
     *            example <code>my-db-param-group</code>, or a valid ARN.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setSourceDBParameterGroupIdentifier(String sourceDBParameterGroupIdentifier) {
        this.sourceDBParameterGroupIdentifier = sourceDBParameterGroupIdentifier;
    }

    /**
     * <p>
     * The identifier or ARN for the source DB parameter group. For information
     * about creating an ARN, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.ARN.html#USER_Tagging.ARN.Constructing"
     * > Constructing an ARN for Amazon RDS</a> in the <i>Amazon RDS User
     * Guide</i>.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must specify a valid DB parameter group.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must specify a valid DB parameter group identifier, for example
     * <code>my-db-param-group</code>, or a valid ARN.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceDBParameterGroupIdentifier <p>
     *            The identifier or ARN for the source DB parameter group. For
     *            information about creating an ARN, see <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.ARN.html#USER_Tagging.ARN.Constructing"
     *            > Constructing an ARN for Amazon RDS</a> in the <i>Amazon RDS
     *            User Guide</i>.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must specify a valid DB parameter group.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Must specify a valid DB parameter group identifier, for
     *            example <code>my-db-param-group</code>, or a valid ARN.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CopyDBParameterGroupRequest withSourceDBParameterGroupIdentifier(
            String sourceDBParameterGroupIdentifier) {
        this.sourceDBParameterGroupIdentifier = sourceDBParameterGroupIdentifier;
        return this;
    }

    /**
     * <p>
     * The identifier for the copied DB parameter group.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Can't be null, empty, or blank
     * </p>
     * </li>
     * <li>
     * <p>
     * Must contain from 1 to 255 letters, numbers, or hyphens
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>my-db-parameter-group</code>
     * </p>
     *
     * @return <p>
     *         The identifier for the copied DB parameter group.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Can't be null, empty, or blank
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must contain from 1 to 255 letters, numbers, or hyphens
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         First character must be a letter
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Can't end with a hyphen or contain two consecutive hyphens
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Example: <code>my-db-parameter-group</code>
     *         </p>
     */
    public String getTargetDBParameterGroupIdentifier() {
        return targetDBParameterGroupIdentifier;
    }

    /**
     * <p>
     * The identifier for the copied DB parameter group.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Can't be null, empty, or blank
     * </p>
     * </li>
     * <li>
     * <p>
     * Must contain from 1 to 255 letters, numbers, or hyphens
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>my-db-parameter-group</code>
     * </p>
     *
     * @param targetDBParameterGroupIdentifier <p>
     *            The identifier for the copied DB parameter group.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Can't be null, empty, or blank
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Must contain from 1 to 255 letters, numbers, or hyphens
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            First character must be a letter
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Can't end with a hyphen or contain two consecutive hyphens
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Example: <code>my-db-parameter-group</code>
     *            </p>
     */
    public void setTargetDBParameterGroupIdentifier(String targetDBParameterGroupIdentifier) {
        this.targetDBParameterGroupIdentifier = targetDBParameterGroupIdentifier;
    }

    /**
     * <p>
     * The identifier for the copied DB parameter group.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Can't be null, empty, or blank
     * </p>
     * </li>
     * <li>
     * <p>
     * Must contain from 1 to 255 letters, numbers, or hyphens
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>my-db-parameter-group</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetDBParameterGroupIdentifier <p>
     *            The identifier for the copied DB parameter group.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Can't be null, empty, or blank
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Must contain from 1 to 255 letters, numbers, or hyphens
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            First character must be a letter
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Can't end with a hyphen or contain two consecutive hyphens
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Example: <code>my-db-parameter-group</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CopyDBParameterGroupRequest withTargetDBParameterGroupIdentifier(
            String targetDBParameterGroupIdentifier) {
        this.targetDBParameterGroupIdentifier = targetDBParameterGroupIdentifier;
        return this;
    }

    /**
     * <p>
     * A description for the copied DB parameter group.
     * </p>
     *
     * @return <p>
     *         A description for the copied DB parameter group.
     *         </p>
     */
    public String getTargetDBParameterGroupDescription() {
        return targetDBParameterGroupDescription;
    }

    /**
     * <p>
     * A description for the copied DB parameter group.
     * </p>
     *
     * @param targetDBParameterGroupDescription <p>
     *            A description for the copied DB parameter group.
     *            </p>
     */
    public void setTargetDBParameterGroupDescription(String targetDBParameterGroupDescription) {
        this.targetDBParameterGroupDescription = targetDBParameterGroupDescription;
    }

    /**
     * <p>
     * A description for the copied DB parameter group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetDBParameterGroupDescription <p>
     *            A description for the copied DB parameter group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CopyDBParameterGroupRequest withTargetDBParameterGroupDescription(
            String targetDBParameterGroupDescription) {
        this.targetDBParameterGroupDescription = targetDBParameterGroupDescription;
        return this;
    }

    /**
     * <p>
     * A list of tags. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html"
     * >Tagging Amazon RDS Resources</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     *
     * @return <p>
     *         A list of tags. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html"
     *         >Tagging Amazon RDS Resources</a> in the <i>Amazon RDS User
     *         Guide.</i>
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of tags. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html"
     * >Tagging Amazon RDS Resources</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     *
     * @param tags <p>
     *            A list of tags. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html"
     *            >Tagging Amazon RDS Resources</a> in the <i>Amazon RDS User
     *            Guide.</i>
     *            </p>
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * A list of tags. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html"
     * >Tagging Amazon RDS Resources</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A list of tags. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html"
     *            >Tagging Amazon RDS Resources</a> in the <i>Amazon RDS User
     *            Guide.</i>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CopyDBParameterGroupRequest withTags(Tag... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<Tag>(tags.length);
        }
        for (Tag value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of tags. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html"
     * >Tagging Amazon RDS Resources</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A list of tags. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html"
     *            >Tagging Amazon RDS Resources</a> in the <i>Amazon RDS User
     *            Guide.</i>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CopyDBParameterGroupRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getSourceDBParameterGroupIdentifier() != null)
            sb.append("SourceDBParameterGroupIdentifier: " + getSourceDBParameterGroupIdentifier()
                    + ",");
        if (getTargetDBParameterGroupIdentifier() != null)
            sb.append("TargetDBParameterGroupIdentifier: " + getTargetDBParameterGroupIdentifier()
                    + ",");
        if (getTargetDBParameterGroupDescription() != null)
            sb.append("TargetDBParameterGroupDescription: "
                    + getTargetDBParameterGroupDescription() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getSourceDBParameterGroupIdentifier() == null) ? 0
                        : getSourceDBParameterGroupIdentifier().hashCode());
        hashCode = prime
                * hashCode
                + ((getTargetDBParameterGroupIdentifier() == null) ? 0
                        : getTargetDBParameterGroupIdentifier().hashCode());
        hashCode = prime
                * hashCode
                + ((getTargetDBParameterGroupDescription() == null) ? 0
                        : getTargetDBParameterGroupDescription().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CopyDBParameterGroupRequest == false)
            return false;
        CopyDBParameterGroupRequest other = (CopyDBParameterGroupRequest) obj;

        if (other.getSourceDBParameterGroupIdentifier() == null
                ^ this.getSourceDBParameterGroupIdentifier() == null)
            return false;
        if (other.getSourceDBParameterGroupIdentifier() != null
                && other.getSourceDBParameterGroupIdentifier().equals(
                        this.getSourceDBParameterGroupIdentifier()) == false)
            return false;
        if (other.getTargetDBParameterGroupIdentifier() == null
                ^ this.getTargetDBParameterGroupIdentifier() == null)
            return false;
        if (other.getTargetDBParameterGroupIdentifier() != null
                && other.getTargetDBParameterGroupIdentifier().equals(
                        this.getTargetDBParameterGroupIdentifier()) == false)
            return false;
        if (other.getTargetDBParameterGroupDescription() == null
                ^ this.getTargetDBParameterGroupDescription() == null)
            return false;
        if (other.getTargetDBParameterGroupDescription() != null
                && other.getTargetDBParameterGroupDescription().equals(
                        this.getTargetDBParameterGroupDescription()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
