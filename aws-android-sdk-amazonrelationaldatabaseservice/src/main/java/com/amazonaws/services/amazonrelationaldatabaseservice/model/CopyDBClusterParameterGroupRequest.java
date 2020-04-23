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

package com.amazonaws.services.amazonrelationaldatabaseservice.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Copies the specified DB cluster parameter group.
 * </p>
 * <note>
 * <p>
 * This action only applies to Aurora DB clusters.
 * </p>
 * </note>
 */
public class CopyDBClusterParameterGroupRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The identifier or Amazon Resource Name (ARN) for the source DB cluster
     * parameter group. For information about creating an ARN, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_Tagging.ARN.html#USER_Tagging.ARN.Constructing"
     * > Constructing an ARN for Amazon RDS</a> in the <i>Amazon Aurora User
     * Guide</i>.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must specify a valid DB cluster parameter group.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source DB cluster parameter group is in the same AWS Region as the
     * copy, specify a valid DB parameter group identifier, for example
     * <code>my-db-cluster-param-group</code>, or a valid ARN.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source DB parameter group is in a different AWS Region than the
     * copy, specify a valid DB cluster parameter group ARN, for example
     * <code>arn:aws:rds:us-east-1:123456789012:cluster-pg:custom-cluster-group1</code>
     * .
     * </p>
     * </li>
     * </ul>
     */
    private String sourceDBClusterParameterGroupIdentifier;

    /**
     * <p>
     * The identifier for the copied DB cluster parameter group.
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
     * Example: <code>my-cluster-param-group1</code>
     * </p>
     */
    private String targetDBClusterParameterGroupIdentifier;

    /**
     * <p>
     * A description for the copied DB cluster parameter group.
     * </p>
     */
    private String targetDBClusterParameterGroupDescription;

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
     * The identifier or Amazon Resource Name (ARN) for the source DB cluster
     * parameter group. For information about creating an ARN, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_Tagging.ARN.html#USER_Tagging.ARN.Constructing"
     * > Constructing an ARN for Amazon RDS</a> in the <i>Amazon Aurora User
     * Guide</i>.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must specify a valid DB cluster parameter group.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source DB cluster parameter group is in the same AWS Region as the
     * copy, specify a valid DB parameter group identifier, for example
     * <code>my-db-cluster-param-group</code>, or a valid ARN.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source DB parameter group is in a different AWS Region than the
     * copy, specify a valid DB cluster parameter group ARN, for example
     * <code>arn:aws:rds:us-east-1:123456789012:cluster-pg:custom-cluster-group1</code>
     * .
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The identifier or Amazon Resource Name (ARN) for the source DB
     *         cluster parameter group. For information about creating an ARN,
     *         see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_Tagging.ARN.html#USER_Tagging.ARN.Constructing"
     *         > Constructing an ARN for Amazon RDS</a> in the <i>Amazon Aurora
     *         User Guide</i>.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must specify a valid DB cluster parameter group.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If the source DB cluster parameter group is in the same AWS
     *         Region as the copy, specify a valid DB parameter group
     *         identifier, for example <code>my-db-cluster-param-group</code>,
     *         or a valid ARN.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If the source DB parameter group is in a different AWS Region
     *         than the copy, specify a valid DB cluster parameter group ARN,
     *         for example
     *         <code>arn:aws:rds:us-east-1:123456789012:cluster-pg:custom-cluster-group1</code>
     *         .
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getSourceDBClusterParameterGroupIdentifier() {
        return sourceDBClusterParameterGroupIdentifier;
    }

    /**
     * <p>
     * The identifier or Amazon Resource Name (ARN) for the source DB cluster
     * parameter group. For information about creating an ARN, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_Tagging.ARN.html#USER_Tagging.ARN.Constructing"
     * > Constructing an ARN for Amazon RDS</a> in the <i>Amazon Aurora User
     * Guide</i>.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must specify a valid DB cluster parameter group.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source DB cluster parameter group is in the same AWS Region as the
     * copy, specify a valid DB parameter group identifier, for example
     * <code>my-db-cluster-param-group</code>, or a valid ARN.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source DB parameter group is in a different AWS Region than the
     * copy, specify a valid DB cluster parameter group ARN, for example
     * <code>arn:aws:rds:us-east-1:123456789012:cluster-pg:custom-cluster-group1</code>
     * .
     * </p>
     * </li>
     * </ul>
     *
     * @param sourceDBClusterParameterGroupIdentifier <p>
     *            The identifier or Amazon Resource Name (ARN) for the source DB
     *            cluster parameter group. For information about creating an
     *            ARN, see <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_Tagging.ARN.html#USER_Tagging.ARN.Constructing"
     *            > Constructing an ARN for Amazon RDS</a> in the <i>Amazon
     *            Aurora User Guide</i>.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must specify a valid DB cluster parameter group.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If the source DB cluster parameter group is in the same AWS
     *            Region as the copy, specify a valid DB parameter group
     *            identifier, for example <code>my-db-cluster-param-group</code>
     *            , or a valid ARN.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If the source DB parameter group is in a different AWS Region
     *            than the copy, specify a valid DB cluster parameter group ARN,
     *            for example
     *            <code>arn:aws:rds:us-east-1:123456789012:cluster-pg:custom-cluster-group1</code>
     *            .
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setSourceDBClusterParameterGroupIdentifier(
            String sourceDBClusterParameterGroupIdentifier) {
        this.sourceDBClusterParameterGroupIdentifier = sourceDBClusterParameterGroupIdentifier;
    }

    /**
     * <p>
     * The identifier or Amazon Resource Name (ARN) for the source DB cluster
     * parameter group. For information about creating an ARN, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_Tagging.ARN.html#USER_Tagging.ARN.Constructing"
     * > Constructing an ARN for Amazon RDS</a> in the <i>Amazon Aurora User
     * Guide</i>.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must specify a valid DB cluster parameter group.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source DB cluster parameter group is in the same AWS Region as the
     * copy, specify a valid DB parameter group identifier, for example
     * <code>my-db-cluster-param-group</code>, or a valid ARN.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source DB parameter group is in a different AWS Region than the
     * copy, specify a valid DB cluster parameter group ARN, for example
     * <code>arn:aws:rds:us-east-1:123456789012:cluster-pg:custom-cluster-group1</code>
     * .
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceDBClusterParameterGroupIdentifier <p>
     *            The identifier or Amazon Resource Name (ARN) for the source DB
     *            cluster parameter group. For information about creating an
     *            ARN, see <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_Tagging.ARN.html#USER_Tagging.ARN.Constructing"
     *            > Constructing an ARN for Amazon RDS</a> in the <i>Amazon
     *            Aurora User Guide</i>.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must specify a valid DB cluster parameter group.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If the source DB cluster parameter group is in the same AWS
     *            Region as the copy, specify a valid DB parameter group
     *            identifier, for example <code>my-db-cluster-param-group</code>
     *            , or a valid ARN.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If the source DB parameter group is in a different AWS Region
     *            than the copy, specify a valid DB cluster parameter group ARN,
     *            for example
     *            <code>arn:aws:rds:us-east-1:123456789012:cluster-pg:custom-cluster-group1</code>
     *            .
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CopyDBClusterParameterGroupRequest withSourceDBClusterParameterGroupIdentifier(
            String sourceDBClusterParameterGroupIdentifier) {
        this.sourceDBClusterParameterGroupIdentifier = sourceDBClusterParameterGroupIdentifier;
        return this;
    }

    /**
     * <p>
     * The identifier for the copied DB cluster parameter group.
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
     * Example: <code>my-cluster-param-group1</code>
     * </p>
     *
     * @return <p>
     *         The identifier for the copied DB cluster parameter group.
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
     *         Example: <code>my-cluster-param-group1</code>
     *         </p>
     */
    public String getTargetDBClusterParameterGroupIdentifier() {
        return targetDBClusterParameterGroupIdentifier;
    }

    /**
     * <p>
     * The identifier for the copied DB cluster parameter group.
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
     * Example: <code>my-cluster-param-group1</code>
     * </p>
     *
     * @param targetDBClusterParameterGroupIdentifier <p>
     *            The identifier for the copied DB cluster parameter group.
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
     *            Example: <code>my-cluster-param-group1</code>
     *            </p>
     */
    public void setTargetDBClusterParameterGroupIdentifier(
            String targetDBClusterParameterGroupIdentifier) {
        this.targetDBClusterParameterGroupIdentifier = targetDBClusterParameterGroupIdentifier;
    }

    /**
     * <p>
     * The identifier for the copied DB cluster parameter group.
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
     * Example: <code>my-cluster-param-group1</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetDBClusterParameterGroupIdentifier <p>
     *            The identifier for the copied DB cluster parameter group.
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
     *            Example: <code>my-cluster-param-group1</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CopyDBClusterParameterGroupRequest withTargetDBClusterParameterGroupIdentifier(
            String targetDBClusterParameterGroupIdentifier) {
        this.targetDBClusterParameterGroupIdentifier = targetDBClusterParameterGroupIdentifier;
        return this;
    }

    /**
     * <p>
     * A description for the copied DB cluster parameter group.
     * </p>
     *
     * @return <p>
     *         A description for the copied DB cluster parameter group.
     *         </p>
     */
    public String getTargetDBClusterParameterGroupDescription() {
        return targetDBClusterParameterGroupDescription;
    }

    /**
     * <p>
     * A description for the copied DB cluster parameter group.
     * </p>
     *
     * @param targetDBClusterParameterGroupDescription <p>
     *            A description for the copied DB cluster parameter group.
     *            </p>
     */
    public void setTargetDBClusterParameterGroupDescription(
            String targetDBClusterParameterGroupDescription) {
        this.targetDBClusterParameterGroupDescription = targetDBClusterParameterGroupDescription;
    }

    /**
     * <p>
     * A description for the copied DB cluster parameter group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetDBClusterParameterGroupDescription <p>
     *            A description for the copied DB cluster parameter group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CopyDBClusterParameterGroupRequest withTargetDBClusterParameterGroupDescription(
            String targetDBClusterParameterGroupDescription) {
        this.targetDBClusterParameterGroupDescription = targetDBClusterParameterGroupDescription;
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
    public CopyDBClusterParameterGroupRequest withTags(Tag... tags) {
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
    public CopyDBClusterParameterGroupRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getSourceDBClusterParameterGroupIdentifier() != null)
            sb.append("SourceDBClusterParameterGroupIdentifier: "
                    + getSourceDBClusterParameterGroupIdentifier() + ",");
        if (getTargetDBClusterParameterGroupIdentifier() != null)
            sb.append("TargetDBClusterParameterGroupIdentifier: "
                    + getTargetDBClusterParameterGroupIdentifier() + ",");
        if (getTargetDBClusterParameterGroupDescription() != null)
            sb.append("TargetDBClusterParameterGroupDescription: "
                    + getTargetDBClusterParameterGroupDescription() + ",");
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
                + ((getSourceDBClusterParameterGroupIdentifier() == null) ? 0
                        : getSourceDBClusterParameterGroupIdentifier().hashCode());
        hashCode = prime
                * hashCode
                + ((getTargetDBClusterParameterGroupIdentifier() == null) ? 0
                        : getTargetDBClusterParameterGroupIdentifier().hashCode());
        hashCode = prime
                * hashCode
                + ((getTargetDBClusterParameterGroupDescription() == null) ? 0
                        : getTargetDBClusterParameterGroupDescription().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CopyDBClusterParameterGroupRequest == false)
            return false;
        CopyDBClusterParameterGroupRequest other = (CopyDBClusterParameterGroupRequest) obj;

        if (other.getSourceDBClusterParameterGroupIdentifier() == null
                ^ this.getSourceDBClusterParameterGroupIdentifier() == null)
            return false;
        if (other.getSourceDBClusterParameterGroupIdentifier() != null
                && other.getSourceDBClusterParameterGroupIdentifier().equals(
                        this.getSourceDBClusterParameterGroupIdentifier()) == false)
            return false;
        if (other.getTargetDBClusterParameterGroupIdentifier() == null
                ^ this.getTargetDBClusterParameterGroupIdentifier() == null)
            return false;
        if (other.getTargetDBClusterParameterGroupIdentifier() != null
                && other.getTargetDBClusterParameterGroupIdentifier().equals(
                        this.getTargetDBClusterParameterGroupIdentifier()) == false)
            return false;
        if (other.getTargetDBClusterParameterGroupDescription() == null
                ^ this.getTargetDBClusterParameterGroupDescription() == null)
            return false;
        if (other.getTargetDBClusterParameterGroupDescription() != null
                && other.getTargetDBClusterParameterGroupDescription().equals(
                        this.getTargetDBClusterParameterGroupDescription()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
