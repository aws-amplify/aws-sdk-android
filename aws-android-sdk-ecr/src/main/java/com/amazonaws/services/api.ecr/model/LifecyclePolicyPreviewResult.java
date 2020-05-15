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

package com.amazonaws.services.api.ecr.model;

import java.io.Serializable;

/**
 * <p>
 * The result of the lifecycle policy preview.
 * </p>
 */
public class LifecyclePolicyPreviewResult implements Serializable {
    /**
     * <p>
     * The list of tags associated with this image.
     * </p>
     */
    private java.util.List<String> imageTags;

    /**
     * <p>
     * The <code>sha256</code> digest of the image manifest.
     * </p>
     */
    private String imageDigest;

    /**
     * <p>
     * The date and time, expressed in standard JavaScript date format, at which
     * the current image was pushed to the repository.
     * </p>
     */
    private java.util.Date imagePushedAt;

    /**
     * <p>
     * The type of action to be taken.
     * </p>
     */
    private LifecyclePolicyRuleAction action;

    /**
     * <p>
     * The priority of the applied rule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Integer appliedRulePriority;

    /**
     * <p>
     * The list of tags associated with this image.
     * </p>
     *
     * @return <p>
     *         The list of tags associated with this image.
     *         </p>
     */
    public java.util.List<String> getImageTags() {
        return imageTags;
    }

    /**
     * <p>
     * The list of tags associated with this image.
     * </p>
     *
     * @param imageTags <p>
     *            The list of tags associated with this image.
     *            </p>
     */
    public void setImageTags(java.util.Collection<String> imageTags) {
        if (imageTags == null) {
            this.imageTags = null;
            return;
        }

        this.imageTags = new java.util.ArrayList<String>(imageTags);
    }

    /**
     * <p>
     * The list of tags associated with this image.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param imageTags <p>
     *            The list of tags associated with this image.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LifecyclePolicyPreviewResult withImageTags(String... imageTags) {
        if (getImageTags() == null) {
            this.imageTags = new java.util.ArrayList<String>(imageTags.length);
        }
        for (String value : imageTags) {
            this.imageTags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of tags associated with this image.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param imageTags <p>
     *            The list of tags associated with this image.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LifecyclePolicyPreviewResult withImageTags(java.util.Collection<String> imageTags) {
        setImageTags(imageTags);
        return this;
    }

    /**
     * <p>
     * The <code>sha256</code> digest of the image manifest.
     * </p>
     *
     * @return <p>
     *         The <code>sha256</code> digest of the image manifest.
     *         </p>
     */
    public String getImageDigest() {
        return imageDigest;
    }

    /**
     * <p>
     * The <code>sha256</code> digest of the image manifest.
     * </p>
     *
     * @param imageDigest <p>
     *            The <code>sha256</code> digest of the image manifest.
     *            </p>
     */
    public void setImageDigest(String imageDigest) {
        this.imageDigest = imageDigest;
    }

    /**
     * <p>
     * The <code>sha256</code> digest of the image manifest.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param imageDigest <p>
     *            The <code>sha256</code> digest of the image manifest.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LifecyclePolicyPreviewResult withImageDigest(String imageDigest) {
        this.imageDigest = imageDigest;
        return this;
    }

    /**
     * <p>
     * The date and time, expressed in standard JavaScript date format, at which
     * the current image was pushed to the repository.
     * </p>
     *
     * @return <p>
     *         The date and time, expressed in standard JavaScript date format,
     *         at which the current image was pushed to the repository.
     *         </p>
     */
    public java.util.Date getImagePushedAt() {
        return imagePushedAt;
    }

    /**
     * <p>
     * The date and time, expressed in standard JavaScript date format, at which
     * the current image was pushed to the repository.
     * </p>
     *
     * @param imagePushedAt <p>
     *            The date and time, expressed in standard JavaScript date
     *            format, at which the current image was pushed to the
     *            repository.
     *            </p>
     */
    public void setImagePushedAt(java.util.Date imagePushedAt) {
        this.imagePushedAt = imagePushedAt;
    }

    /**
     * <p>
     * The date and time, expressed in standard JavaScript date format, at which
     * the current image was pushed to the repository.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param imagePushedAt <p>
     *            The date and time, expressed in standard JavaScript date
     *            format, at which the current image was pushed to the
     *            repository.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LifecyclePolicyPreviewResult withImagePushedAt(java.util.Date imagePushedAt) {
        this.imagePushedAt = imagePushedAt;
        return this;
    }

    /**
     * <p>
     * The type of action to be taken.
     * </p>
     *
     * @return <p>
     *         The type of action to be taken.
     *         </p>
     */
    public LifecyclePolicyRuleAction getAction() {
        return action;
    }

    /**
     * <p>
     * The type of action to be taken.
     * </p>
     *
     * @param action <p>
     *            The type of action to be taken.
     *            </p>
     */
    public void setAction(LifecyclePolicyRuleAction action) {
        this.action = action;
    }

    /**
     * <p>
     * The type of action to be taken.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param action <p>
     *            The type of action to be taken.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LifecyclePolicyPreviewResult withAction(LifecyclePolicyRuleAction action) {
        this.action = action;
        return this;
    }

    /**
     * <p>
     * The priority of the applied rule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return <p>
     *         The priority of the applied rule.
     *         </p>
     */
    public Integer getAppliedRulePriority() {
        return appliedRulePriority;
    }

    /**
     * <p>
     * The priority of the applied rule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param appliedRulePriority <p>
     *            The priority of the applied rule.
     *            </p>
     */
    public void setAppliedRulePriority(Integer appliedRulePriority) {
        this.appliedRulePriority = appliedRulePriority;
    }

    /**
     * <p>
     * The priority of the applied rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param appliedRulePriority <p>
     *            The priority of the applied rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LifecyclePolicyPreviewResult withAppliedRulePriority(Integer appliedRulePriority) {
        this.appliedRulePriority = appliedRulePriority;
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
        if (getImageTags() != null)
            sb.append("imageTags: " + getImageTags() + ",");
        if (getImageDigest() != null)
            sb.append("imageDigest: " + getImageDigest() + ",");
        if (getImagePushedAt() != null)
            sb.append("imagePushedAt: " + getImagePushedAt() + ",");
        if (getAction() != null)
            sb.append("action: " + getAction() + ",");
        if (getAppliedRulePriority() != null)
            sb.append("appliedRulePriority: " + getAppliedRulePriority());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getImageTags() == null) ? 0 : getImageTags().hashCode());
        hashCode = prime * hashCode
                + ((getImageDigest() == null) ? 0 : getImageDigest().hashCode());
        hashCode = prime * hashCode
                + ((getImagePushedAt() == null) ? 0 : getImagePushedAt().hashCode());
        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode
                + ((getAppliedRulePriority() == null) ? 0 : getAppliedRulePriority().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LifecyclePolicyPreviewResult == false)
            return false;
        LifecyclePolicyPreviewResult other = (LifecyclePolicyPreviewResult) obj;

        if (other.getImageTags() == null ^ this.getImageTags() == null)
            return false;
        if (other.getImageTags() != null
                && other.getImageTags().equals(this.getImageTags()) == false)
            return false;
        if (other.getImageDigest() == null ^ this.getImageDigest() == null)
            return false;
        if (other.getImageDigest() != null
                && other.getImageDigest().equals(this.getImageDigest()) == false)
            return false;
        if (other.getImagePushedAt() == null ^ this.getImagePushedAt() == null)
            return false;
        if (other.getImagePushedAt() != null
                && other.getImagePushedAt().equals(this.getImagePushedAt()) == false)
            return false;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getAppliedRulePriority() == null ^ this.getAppliedRulePriority() == null)
            return false;
        if (other.getAppliedRulePriority() != null
                && other.getAppliedRulePriority().equals(this.getAppliedRulePriority()) == false)
            return false;
        return true;
    }
}
