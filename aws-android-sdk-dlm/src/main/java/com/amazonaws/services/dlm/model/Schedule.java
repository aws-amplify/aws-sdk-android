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

package com.amazonaws.services.dlm.model;

import java.io.Serializable;

/**
 * <p>
 * Specifies a backup schedule.
 * </p>
 */
public class Schedule implements Serializable {
    /**
     * <p>
     * The name of the schedule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 120<br/>
     * <b>Pattern: </b>[\p{all}]*<br/>
     */
    private String name;

    /**
     * <p>
     * Copy all user-defined tags on a source volume to snapshots of the volume
     * created by this policy.
     * </p>
     */
    private Boolean copyTags;

    /**
     * <p>
     * The tags to apply to policy-created resources. These user-defined tags
     * are in addition to the AWS-added lifecycle tags.
     * </p>
     */
    private java.util.List<Tag> tagsToAdd;

    /**
     * <p>
     * A collection of key/value pairs with values determined dynamically when
     * the policy is executed. Keys may be any valid Amazon EC2 tag key. Values
     * must be in one of the two following formats: <code>$(instance-id)</code>
     * or <code>$(timestamp)</code>. Variable tags are only valid for EBS
     * Snapshot Management – Instance policies.
     * </p>
     */
    private java.util.List<Tag> variableTags;

    /**
     * <p>
     * The creation rule.
     * </p>
     */
    private CreateRule createRule;

    /**
     * <p>
     * The retention rule.
     * </p>
     */
    private RetainRule retainRule;

    /**
     * <p>
     * The rule for enabling fast snapshot restore.
     * </p>
     */
    private FastRestoreRule fastRestoreRule;

    /**
     * <p>
     * The rule for cross-Region snapshot copies.
     * </p>
     */
    private java.util.List<CrossRegionCopyRule> crossRegionCopyRules;

    /**
     * <p>
     * The name of the schedule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 120<br/>
     * <b>Pattern: </b>[\p{all}]*<br/>
     *
     * @return <p>
     *         The name of the schedule.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the schedule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 120<br/>
     * <b>Pattern: </b>[\p{all}]*<br/>
     *
     * @param name <p>
     *            The name of the schedule.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the schedule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 120<br/>
     * <b>Pattern: </b>[\p{all}]*<br/>
     *
     * @param name <p>
     *            The name of the schedule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Schedule withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * Copy all user-defined tags on a source volume to snapshots of the volume
     * created by this policy.
     * </p>
     *
     * @return <p>
     *         Copy all user-defined tags on a source volume to snapshots of the
     *         volume created by this policy.
     *         </p>
     */
    public Boolean isCopyTags() {
        return copyTags;
    }

    /**
     * <p>
     * Copy all user-defined tags on a source volume to snapshots of the volume
     * created by this policy.
     * </p>
     *
     * @return <p>
     *         Copy all user-defined tags on a source volume to snapshots of the
     *         volume created by this policy.
     *         </p>
     */
    public Boolean getCopyTags() {
        return copyTags;
    }

    /**
     * <p>
     * Copy all user-defined tags on a source volume to snapshots of the volume
     * created by this policy.
     * </p>
     *
     * @param copyTags <p>
     *            Copy all user-defined tags on a source volume to snapshots of
     *            the volume created by this policy.
     *            </p>
     */
    public void setCopyTags(Boolean copyTags) {
        this.copyTags = copyTags;
    }

    /**
     * <p>
     * Copy all user-defined tags on a source volume to snapshots of the volume
     * created by this policy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param copyTags <p>
     *            Copy all user-defined tags on a source volume to snapshots of
     *            the volume created by this policy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Schedule withCopyTags(Boolean copyTags) {
        this.copyTags = copyTags;
        return this;
    }

    /**
     * <p>
     * The tags to apply to policy-created resources. These user-defined tags
     * are in addition to the AWS-added lifecycle tags.
     * </p>
     *
     * @return <p>
     *         The tags to apply to policy-created resources. These user-defined
     *         tags are in addition to the AWS-added lifecycle tags.
     *         </p>
     */
    public java.util.List<Tag> getTagsToAdd() {
        return tagsToAdd;
    }

    /**
     * <p>
     * The tags to apply to policy-created resources. These user-defined tags
     * are in addition to the AWS-added lifecycle tags.
     * </p>
     *
     * @param tagsToAdd <p>
     *            The tags to apply to policy-created resources. These
     *            user-defined tags are in addition to the AWS-added lifecycle
     *            tags.
     *            </p>
     */
    public void setTagsToAdd(java.util.Collection<Tag> tagsToAdd) {
        if (tagsToAdd == null) {
            this.tagsToAdd = null;
            return;
        }

        this.tagsToAdd = new java.util.ArrayList<Tag>(tagsToAdd);
    }

    /**
     * <p>
     * The tags to apply to policy-created resources. These user-defined tags
     * are in addition to the AWS-added lifecycle tags.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagsToAdd <p>
     *            The tags to apply to policy-created resources. These
     *            user-defined tags are in addition to the AWS-added lifecycle
     *            tags.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Schedule withTagsToAdd(Tag... tagsToAdd) {
        if (getTagsToAdd() == null) {
            this.tagsToAdd = new java.util.ArrayList<Tag>(tagsToAdd.length);
        }
        for (Tag value : tagsToAdd) {
            this.tagsToAdd.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The tags to apply to policy-created resources. These user-defined tags
     * are in addition to the AWS-added lifecycle tags.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagsToAdd <p>
     *            The tags to apply to policy-created resources. These
     *            user-defined tags are in addition to the AWS-added lifecycle
     *            tags.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Schedule withTagsToAdd(java.util.Collection<Tag> tagsToAdd) {
        setTagsToAdd(tagsToAdd);
        return this;
    }

    /**
     * <p>
     * A collection of key/value pairs with values determined dynamically when
     * the policy is executed. Keys may be any valid Amazon EC2 tag key. Values
     * must be in one of the two following formats: <code>$(instance-id)</code>
     * or <code>$(timestamp)</code>. Variable tags are only valid for EBS
     * Snapshot Management – Instance policies.
     * </p>
     *
     * @return <p>
     *         A collection of key/value pairs with values determined
     *         dynamically when the policy is executed. Keys may be any valid
     *         Amazon EC2 tag key. Values must be in one of the two following
     *         formats: <code>$(instance-id)</code> or <code>$(timestamp)</code>
     *         . Variable tags are only valid for EBS Snapshot Management –
     *         Instance policies.
     *         </p>
     */
    public java.util.List<Tag> getVariableTags() {
        return variableTags;
    }

    /**
     * <p>
     * A collection of key/value pairs with values determined dynamically when
     * the policy is executed. Keys may be any valid Amazon EC2 tag key. Values
     * must be in one of the two following formats: <code>$(instance-id)</code>
     * or <code>$(timestamp)</code>. Variable tags are only valid for EBS
     * Snapshot Management – Instance policies.
     * </p>
     *
     * @param variableTags <p>
     *            A collection of key/value pairs with values determined
     *            dynamically when the policy is executed. Keys may be any valid
     *            Amazon EC2 tag key. Values must be in one of the two following
     *            formats: <code>$(instance-id)</code> or
     *            <code>$(timestamp)</code>. Variable tags are only valid for
     *            EBS Snapshot Management – Instance policies.
     *            </p>
     */
    public void setVariableTags(java.util.Collection<Tag> variableTags) {
        if (variableTags == null) {
            this.variableTags = null;
            return;
        }

        this.variableTags = new java.util.ArrayList<Tag>(variableTags);
    }

    /**
     * <p>
     * A collection of key/value pairs with values determined dynamically when
     * the policy is executed. Keys may be any valid Amazon EC2 tag key. Values
     * must be in one of the two following formats: <code>$(instance-id)</code>
     * or <code>$(timestamp)</code>. Variable tags are only valid for EBS
     * Snapshot Management – Instance policies.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param variableTags <p>
     *            A collection of key/value pairs with values determined
     *            dynamically when the policy is executed. Keys may be any valid
     *            Amazon EC2 tag key. Values must be in one of the two following
     *            formats: <code>$(instance-id)</code> or
     *            <code>$(timestamp)</code>. Variable tags are only valid for
     *            EBS Snapshot Management – Instance policies.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Schedule withVariableTags(Tag... variableTags) {
        if (getVariableTags() == null) {
            this.variableTags = new java.util.ArrayList<Tag>(variableTags.length);
        }
        for (Tag value : variableTags) {
            this.variableTags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A collection of key/value pairs with values determined dynamically when
     * the policy is executed. Keys may be any valid Amazon EC2 tag key. Values
     * must be in one of the two following formats: <code>$(instance-id)</code>
     * or <code>$(timestamp)</code>. Variable tags are only valid for EBS
     * Snapshot Management – Instance policies.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param variableTags <p>
     *            A collection of key/value pairs with values determined
     *            dynamically when the policy is executed. Keys may be any valid
     *            Amazon EC2 tag key. Values must be in one of the two following
     *            formats: <code>$(instance-id)</code> or
     *            <code>$(timestamp)</code>. Variable tags are only valid for
     *            EBS Snapshot Management – Instance policies.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Schedule withVariableTags(java.util.Collection<Tag> variableTags) {
        setVariableTags(variableTags);
        return this;
    }

    /**
     * <p>
     * The creation rule.
     * </p>
     *
     * @return <p>
     *         The creation rule.
     *         </p>
     */
    public CreateRule getCreateRule() {
        return createRule;
    }

    /**
     * <p>
     * The creation rule.
     * </p>
     *
     * @param createRule <p>
     *            The creation rule.
     *            </p>
     */
    public void setCreateRule(CreateRule createRule) {
        this.createRule = createRule;
    }

    /**
     * <p>
     * The creation rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createRule <p>
     *            The creation rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Schedule withCreateRule(CreateRule createRule) {
        this.createRule = createRule;
        return this;
    }

    /**
     * <p>
     * The retention rule.
     * </p>
     *
     * @return <p>
     *         The retention rule.
     *         </p>
     */
    public RetainRule getRetainRule() {
        return retainRule;
    }

    /**
     * <p>
     * The retention rule.
     * </p>
     *
     * @param retainRule <p>
     *            The retention rule.
     *            </p>
     */
    public void setRetainRule(RetainRule retainRule) {
        this.retainRule = retainRule;
    }

    /**
     * <p>
     * The retention rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param retainRule <p>
     *            The retention rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Schedule withRetainRule(RetainRule retainRule) {
        this.retainRule = retainRule;
        return this;
    }

    /**
     * <p>
     * The rule for enabling fast snapshot restore.
     * </p>
     *
     * @return <p>
     *         The rule for enabling fast snapshot restore.
     *         </p>
     */
    public FastRestoreRule getFastRestoreRule() {
        return fastRestoreRule;
    }

    /**
     * <p>
     * The rule for enabling fast snapshot restore.
     * </p>
     *
     * @param fastRestoreRule <p>
     *            The rule for enabling fast snapshot restore.
     *            </p>
     */
    public void setFastRestoreRule(FastRestoreRule fastRestoreRule) {
        this.fastRestoreRule = fastRestoreRule;
    }

    /**
     * <p>
     * The rule for enabling fast snapshot restore.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fastRestoreRule <p>
     *            The rule for enabling fast snapshot restore.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Schedule withFastRestoreRule(FastRestoreRule fastRestoreRule) {
        this.fastRestoreRule = fastRestoreRule;
        return this;
    }

    /**
     * <p>
     * The rule for cross-Region snapshot copies.
     * </p>
     *
     * @return <p>
     *         The rule for cross-Region snapshot copies.
     *         </p>
     */
    public java.util.List<CrossRegionCopyRule> getCrossRegionCopyRules() {
        return crossRegionCopyRules;
    }

    /**
     * <p>
     * The rule for cross-Region snapshot copies.
     * </p>
     *
     * @param crossRegionCopyRules <p>
     *            The rule for cross-Region snapshot copies.
     *            </p>
     */
    public void setCrossRegionCopyRules(
            java.util.Collection<CrossRegionCopyRule> crossRegionCopyRules) {
        if (crossRegionCopyRules == null) {
            this.crossRegionCopyRules = null;
            return;
        }

        this.crossRegionCopyRules = new java.util.ArrayList<CrossRegionCopyRule>(
                crossRegionCopyRules);
    }

    /**
     * <p>
     * The rule for cross-Region snapshot copies.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param crossRegionCopyRules <p>
     *            The rule for cross-Region snapshot copies.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Schedule withCrossRegionCopyRules(CrossRegionCopyRule... crossRegionCopyRules) {
        if (getCrossRegionCopyRules() == null) {
            this.crossRegionCopyRules = new java.util.ArrayList<CrossRegionCopyRule>(
                    crossRegionCopyRules.length);
        }
        for (CrossRegionCopyRule value : crossRegionCopyRules) {
            this.crossRegionCopyRules.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The rule for cross-Region snapshot copies.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param crossRegionCopyRules <p>
     *            The rule for cross-Region snapshot copies.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Schedule withCrossRegionCopyRules(
            java.util.Collection<CrossRegionCopyRule> crossRegionCopyRules) {
        setCrossRegionCopyRules(crossRegionCopyRules);
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getCopyTags() != null)
            sb.append("CopyTags: " + getCopyTags() + ",");
        if (getTagsToAdd() != null)
            sb.append("TagsToAdd: " + getTagsToAdd() + ",");
        if (getVariableTags() != null)
            sb.append("VariableTags: " + getVariableTags() + ",");
        if (getCreateRule() != null)
            sb.append("CreateRule: " + getCreateRule() + ",");
        if (getRetainRule() != null)
            sb.append("RetainRule: " + getRetainRule() + ",");
        if (getFastRestoreRule() != null)
            sb.append("FastRestoreRule: " + getFastRestoreRule() + ",");
        if (getCrossRegionCopyRules() != null)
            sb.append("CrossRegionCopyRules: " + getCrossRegionCopyRules());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getCopyTags() == null) ? 0 : getCopyTags().hashCode());
        hashCode = prime * hashCode + ((getTagsToAdd() == null) ? 0 : getTagsToAdd().hashCode());
        hashCode = prime * hashCode
                + ((getVariableTags() == null) ? 0 : getVariableTags().hashCode());
        hashCode = prime * hashCode + ((getCreateRule() == null) ? 0 : getCreateRule().hashCode());
        hashCode = prime * hashCode + ((getRetainRule() == null) ? 0 : getRetainRule().hashCode());
        hashCode = prime * hashCode
                + ((getFastRestoreRule() == null) ? 0 : getFastRestoreRule().hashCode());
        hashCode = prime * hashCode
                + ((getCrossRegionCopyRules() == null) ? 0 : getCrossRegionCopyRules().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Schedule == false)
            return false;
        Schedule other = (Schedule) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getCopyTags() == null ^ this.getCopyTags() == null)
            return false;
        if (other.getCopyTags() != null && other.getCopyTags().equals(this.getCopyTags()) == false)
            return false;
        if (other.getTagsToAdd() == null ^ this.getTagsToAdd() == null)
            return false;
        if (other.getTagsToAdd() != null
                && other.getTagsToAdd().equals(this.getTagsToAdd()) == false)
            return false;
        if (other.getVariableTags() == null ^ this.getVariableTags() == null)
            return false;
        if (other.getVariableTags() != null
                && other.getVariableTags().equals(this.getVariableTags()) == false)
            return false;
        if (other.getCreateRule() == null ^ this.getCreateRule() == null)
            return false;
        if (other.getCreateRule() != null
                && other.getCreateRule().equals(this.getCreateRule()) == false)
            return false;
        if (other.getRetainRule() == null ^ this.getRetainRule() == null)
            return false;
        if (other.getRetainRule() != null
                && other.getRetainRule().equals(this.getRetainRule()) == false)
            return false;
        if (other.getFastRestoreRule() == null ^ this.getFastRestoreRule() == null)
            return false;
        if (other.getFastRestoreRule() != null
                && other.getFastRestoreRule().equals(this.getFastRestoreRule()) == false)
            return false;
        if (other.getCrossRegionCopyRules() == null ^ this.getCrossRegionCopyRules() == null)
            return false;
        if (other.getCrossRegionCopyRules() != null
                && other.getCrossRegionCopyRules().equals(this.getCrossRegionCopyRules()) == false)
            return false;
        return true;
    }
}
