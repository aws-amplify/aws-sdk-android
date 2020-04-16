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
 * Copies the specified option group.
 * </p>
 */
public class CopyOptionGroupRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The identifier or ARN for the source option group. For information about
     * creating an ARN, see <a href=
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
     * Must specify a valid option group.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source option group is in the same AWS Region as the copy, specify
     * a valid option group identifier, for example <code>my-option-group</code>
     * , or a valid ARN.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source option group is in a different AWS Region than the copy,
     * specify a valid option group ARN, for example
     * <code>arn:aws:rds:us-west-2:123456789012:og:special-options</code>.
     * </p>
     * </li>
     * </ul>
     */
    private String sourceOptionGroupIdentifier;

    /**
     * <p>
     * The identifier for the copied option group.
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
     * Example: <code>my-option-group</code>
     * </p>
     */
    private String targetOptionGroupIdentifier;

    /**
     * <p>
     * The description for the copied option group.
     * </p>
     */
    private String targetOptionGroupDescription;

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
     * The identifier or ARN for the source option group. For information about
     * creating an ARN, see <a href=
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
     * Must specify a valid option group.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source option group is in the same AWS Region as the copy, specify
     * a valid option group identifier, for example <code>my-option-group</code>
     * , or a valid ARN.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source option group is in a different AWS Region than the copy,
     * specify a valid option group ARN, for example
     * <code>arn:aws:rds:us-west-2:123456789012:og:special-options</code>.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The identifier or ARN for the source option group. For
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
     *         Must specify a valid option group.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If the source option group is in the same AWS Region as the copy,
     *         specify a valid option group identifier, for example
     *         <code>my-option-group</code>, or a valid ARN.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If the source option group is in a different AWS Region than the
     *         copy, specify a valid option group ARN, for example
     *         <code>arn:aws:rds:us-west-2:123456789012:og:special-options</code>
     *         .
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getSourceOptionGroupIdentifier() {
        return sourceOptionGroupIdentifier;
    }

    /**
     * <p>
     * The identifier or ARN for the source option group. For information about
     * creating an ARN, see <a href=
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
     * Must specify a valid option group.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source option group is in the same AWS Region as the copy, specify
     * a valid option group identifier, for example <code>my-option-group</code>
     * , or a valid ARN.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source option group is in a different AWS Region than the copy,
     * specify a valid option group ARN, for example
     * <code>arn:aws:rds:us-west-2:123456789012:og:special-options</code>.
     * </p>
     * </li>
     * </ul>
     *
     * @param sourceOptionGroupIdentifier <p>
     *            The identifier or ARN for the source option group. For
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
     *            Must specify a valid option group.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If the source option group is in the same AWS Region as the
     *            copy, specify a valid option group identifier, for example
     *            <code>my-option-group</code>, or a valid ARN.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If the source option group is in a different AWS Region than
     *            the copy, specify a valid option group ARN, for example
     *            <code>arn:aws:rds:us-west-2:123456789012:og:special-options</code>
     *            .
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setSourceOptionGroupIdentifier(String sourceOptionGroupIdentifier) {
        this.sourceOptionGroupIdentifier = sourceOptionGroupIdentifier;
    }

    /**
     * <p>
     * The identifier or ARN for the source option group. For information about
     * creating an ARN, see <a href=
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
     * Must specify a valid option group.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source option group is in the same AWS Region as the copy, specify
     * a valid option group identifier, for example <code>my-option-group</code>
     * , or a valid ARN.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source option group is in a different AWS Region than the copy,
     * specify a valid option group ARN, for example
     * <code>arn:aws:rds:us-west-2:123456789012:og:special-options</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceOptionGroupIdentifier <p>
     *            The identifier or ARN for the source option group. For
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
     *            Must specify a valid option group.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If the source option group is in the same AWS Region as the
     *            copy, specify a valid option group identifier, for example
     *            <code>my-option-group</code>, or a valid ARN.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If the source option group is in a different AWS Region than
     *            the copy, specify a valid option group ARN, for example
     *            <code>arn:aws:rds:us-west-2:123456789012:og:special-options</code>
     *            .
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CopyOptionGroupRequest withSourceOptionGroupIdentifier(String sourceOptionGroupIdentifier) {
        this.sourceOptionGroupIdentifier = sourceOptionGroupIdentifier;
        return this;
    }

    /**
     * <p>
     * The identifier for the copied option group.
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
     * Example: <code>my-option-group</code>
     * </p>
     *
     * @return <p>
     *         The identifier for the copied option group.
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
     *         Example: <code>my-option-group</code>
     *         </p>
     */
    public String getTargetOptionGroupIdentifier() {
        return targetOptionGroupIdentifier;
    }

    /**
     * <p>
     * The identifier for the copied option group.
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
     * Example: <code>my-option-group</code>
     * </p>
     *
     * @param targetOptionGroupIdentifier <p>
     *            The identifier for the copied option group.
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
     *            Example: <code>my-option-group</code>
     *            </p>
     */
    public void setTargetOptionGroupIdentifier(String targetOptionGroupIdentifier) {
        this.targetOptionGroupIdentifier = targetOptionGroupIdentifier;
    }

    /**
     * <p>
     * The identifier for the copied option group.
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
     * Example: <code>my-option-group</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetOptionGroupIdentifier <p>
     *            The identifier for the copied option group.
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
     *            Example: <code>my-option-group</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CopyOptionGroupRequest withTargetOptionGroupIdentifier(String targetOptionGroupIdentifier) {
        this.targetOptionGroupIdentifier = targetOptionGroupIdentifier;
        return this;
    }

    /**
     * <p>
     * The description for the copied option group.
     * </p>
     *
     * @return <p>
     *         The description for the copied option group.
     *         </p>
     */
    public String getTargetOptionGroupDescription() {
        return targetOptionGroupDescription;
    }

    /**
     * <p>
     * The description for the copied option group.
     * </p>
     *
     * @param targetOptionGroupDescription <p>
     *            The description for the copied option group.
     *            </p>
     */
    public void setTargetOptionGroupDescription(String targetOptionGroupDescription) {
        this.targetOptionGroupDescription = targetOptionGroupDescription;
    }

    /**
     * <p>
     * The description for the copied option group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetOptionGroupDescription <p>
     *            The description for the copied option group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CopyOptionGroupRequest withTargetOptionGroupDescription(
            String targetOptionGroupDescription) {
        this.targetOptionGroupDescription = targetOptionGroupDescription;
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
    public CopyOptionGroupRequest withTags(Tag... tags) {
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
    public CopyOptionGroupRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getSourceOptionGroupIdentifier() != null)
            sb.append("SourceOptionGroupIdentifier: " + getSourceOptionGroupIdentifier() + ",");
        if (getTargetOptionGroupIdentifier() != null)
            sb.append("TargetOptionGroupIdentifier: " + getTargetOptionGroupIdentifier() + ",");
        if (getTargetOptionGroupDescription() != null)
            sb.append("TargetOptionGroupDescription: " + getTargetOptionGroupDescription() + ",");
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
                + ((getSourceOptionGroupIdentifier() == null) ? 0
                        : getSourceOptionGroupIdentifier().hashCode());
        hashCode = prime
                * hashCode
                + ((getTargetOptionGroupIdentifier() == null) ? 0
                        : getTargetOptionGroupIdentifier().hashCode());
        hashCode = prime
                * hashCode
                + ((getTargetOptionGroupDescription() == null) ? 0
                        : getTargetOptionGroupDescription().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CopyOptionGroupRequest == false)
            return false;
        CopyOptionGroupRequest other = (CopyOptionGroupRequest) obj;

        if (other.getSourceOptionGroupIdentifier() == null
                ^ this.getSourceOptionGroupIdentifier() == null)
            return false;
        if (other.getSourceOptionGroupIdentifier() != null
                && other.getSourceOptionGroupIdentifier().equals(
                        this.getSourceOptionGroupIdentifier()) == false)
            return false;
        if (other.getTargetOptionGroupIdentifier() == null
                ^ this.getTargetOptionGroupIdentifier() == null)
            return false;
        if (other.getTargetOptionGroupIdentifier() != null
                && other.getTargetOptionGroupIdentifier().equals(
                        this.getTargetOptionGroupIdentifier()) == false)
            return false;
        if (other.getTargetOptionGroupDescription() == null
                ^ this.getTargetOptionGroupDescription() == null)
            return false;
        if (other.getTargetOptionGroupDescription() != null
                && other.getTargetOptionGroupDescription().equals(
                        this.getTargetOptionGroupDescription()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
