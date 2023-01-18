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
 * Information about a rule.
 * </p>
 */
public class Rule implements Serializable {
    /**
     * <p>
     * The name of the rule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     */
    private String name;

    /**
     * <p>
     * A unique identifier for the rule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String ruleId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the rule.
     * </p>
     */
    private String ruleArn;

    /**
     * <p>
     * The event source to trigger the rule.
     * </p>
     */
    private RuleTriggerEventSource triggerEventSource;

    /**
     * <p>
     * The conditions of the rule.
     * </p>
     */
    private String function;

    /**
     * <p>
     * A list of actions to be run when the rule is triggered.
     * </p>
     */
    private java.util.List<RuleAction> actions;

    /**
     * <p>
     * The publish status of the rule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DRAFT, PUBLISHED
     */
    private String publishStatus;

    /**
     * <p>
     * The timestamp for when the rule was created.
     * </p>
     */
    private java.util.Date createdTime;

    /**
     * <p>
     * The timestamp for the when the rule was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedTime;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who last updated the rule.
     * </p>
     */
    private String lastUpdatedBy;

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The name of the rule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @return <p>
     *         The name of the rule.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the rule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @param name <p>
     *            The name of the rule.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @param name <p>
     *            The name of the rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Rule withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * A unique identifier for the rule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         A unique identifier for the rule.
     *         </p>
     */
    public String getRuleId() {
        return ruleId;
    }

    /**
     * <p>
     * A unique identifier for the rule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param ruleId <p>
     *            A unique identifier for the rule.
     *            </p>
     */
    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    /**
     * <p>
     * A unique identifier for the rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param ruleId <p>
     *            A unique identifier for the rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Rule withRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the rule.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the rule.
     *         </p>
     */
    public String getRuleArn() {
        return ruleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the rule.
     * </p>
     *
     * @param ruleArn <p>
     *            The Amazon Resource Name (ARN) of the rule.
     *            </p>
     */
    public void setRuleArn(String ruleArn) {
        this.ruleArn = ruleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ruleArn <p>
     *            The Amazon Resource Name (ARN) of the rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Rule withRuleArn(String ruleArn) {
        this.ruleArn = ruleArn;
        return this;
    }

    /**
     * <p>
     * The event source to trigger the rule.
     * </p>
     *
     * @return <p>
     *         The event source to trigger the rule.
     *         </p>
     */
    public RuleTriggerEventSource getTriggerEventSource() {
        return triggerEventSource;
    }

    /**
     * <p>
     * The event source to trigger the rule.
     * </p>
     *
     * @param triggerEventSource <p>
     *            The event source to trigger the rule.
     *            </p>
     */
    public void setTriggerEventSource(RuleTriggerEventSource triggerEventSource) {
        this.triggerEventSource = triggerEventSource;
    }

    /**
     * <p>
     * The event source to trigger the rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param triggerEventSource <p>
     *            The event source to trigger the rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Rule withTriggerEventSource(RuleTriggerEventSource triggerEventSource) {
        this.triggerEventSource = triggerEventSource;
        return this;
    }

    /**
     * <p>
     * The conditions of the rule.
     * </p>
     *
     * @return <p>
     *         The conditions of the rule.
     *         </p>
     */
    public String getFunction() {
        return function;
    }

    /**
     * <p>
     * The conditions of the rule.
     * </p>
     *
     * @param function <p>
     *            The conditions of the rule.
     *            </p>
     */
    public void setFunction(String function) {
        this.function = function;
    }

    /**
     * <p>
     * The conditions of the rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param function <p>
     *            The conditions of the rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Rule withFunction(String function) {
        this.function = function;
        return this;
    }

    /**
     * <p>
     * A list of actions to be run when the rule is triggered.
     * </p>
     *
     * @return <p>
     *         A list of actions to be run when the rule is triggered.
     *         </p>
     */
    public java.util.List<RuleAction> getActions() {
        return actions;
    }

    /**
     * <p>
     * A list of actions to be run when the rule is triggered.
     * </p>
     *
     * @param actions <p>
     *            A list of actions to be run when the rule is triggered.
     *            </p>
     */
    public void setActions(java.util.Collection<RuleAction> actions) {
        if (actions == null) {
            this.actions = null;
            return;
        }

        this.actions = new java.util.ArrayList<RuleAction>(actions);
    }

    /**
     * <p>
     * A list of actions to be run when the rule is triggered.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param actions <p>
     *            A list of actions to be run when the rule is triggered.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Rule withActions(RuleAction... actions) {
        if (getActions() == null) {
            this.actions = new java.util.ArrayList<RuleAction>(actions.length);
        }
        for (RuleAction value : actions) {
            this.actions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of actions to be run when the rule is triggered.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param actions <p>
     *            A list of actions to be run when the rule is triggered.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Rule withActions(java.util.Collection<RuleAction> actions) {
        setActions(actions);
        return this;
    }

    /**
     * <p>
     * The publish status of the rule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DRAFT, PUBLISHED
     *
     * @return <p>
     *         The publish status of the rule.
     *         </p>
     * @see RulePublishStatus
     */
    public String getPublishStatus() {
        return publishStatus;
    }

    /**
     * <p>
     * The publish status of the rule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DRAFT, PUBLISHED
     *
     * @param publishStatus <p>
     *            The publish status of the rule.
     *            </p>
     * @see RulePublishStatus
     */
    public void setPublishStatus(String publishStatus) {
        this.publishStatus = publishStatus;
    }

    /**
     * <p>
     * The publish status of the rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DRAFT, PUBLISHED
     *
     * @param publishStatus <p>
     *            The publish status of the rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RulePublishStatus
     */
    public Rule withPublishStatus(String publishStatus) {
        this.publishStatus = publishStatus;
        return this;
    }

    /**
     * <p>
     * The publish status of the rule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DRAFT, PUBLISHED
     *
     * @param publishStatus <p>
     *            The publish status of the rule.
     *            </p>
     * @see RulePublishStatus
     */
    public void setPublishStatus(RulePublishStatus publishStatus) {
        this.publishStatus = publishStatus.toString();
    }

    /**
     * <p>
     * The publish status of the rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DRAFT, PUBLISHED
     *
     * @param publishStatus <p>
     *            The publish status of the rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RulePublishStatus
     */
    public Rule withPublishStatus(RulePublishStatus publishStatus) {
        this.publishStatus = publishStatus.toString();
        return this;
    }

    /**
     * <p>
     * The timestamp for when the rule was created.
     * </p>
     *
     * @return <p>
     *         The timestamp for when the rule was created.
     *         </p>
     */
    public java.util.Date getCreatedTime() {
        return createdTime;
    }

    /**
     * <p>
     * The timestamp for when the rule was created.
     * </p>
     *
     * @param createdTime <p>
     *            The timestamp for when the rule was created.
     *            </p>
     */
    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The timestamp for when the rule was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdTime <p>
     *            The timestamp for when the rule was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Rule withCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * <p>
     * The timestamp for the when the rule was last updated.
     * </p>
     *
     * @return <p>
     *         The timestamp for the when the rule was last updated.
     *         </p>
     */
    public java.util.Date getLastUpdatedTime() {
        return lastUpdatedTime;
    }

    /**
     * <p>
     * The timestamp for the when the rule was last updated.
     * </p>
     *
     * @param lastUpdatedTime <p>
     *            The timestamp for the when the rule was last updated.
     *            </p>
     */
    public void setLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * The timestamp for the when the rule was last updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastUpdatedTime <p>
     *            The timestamp for the when the rule was last updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Rule withLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who last updated the rule.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the user who last updated the
     *         rule.
     *         </p>
     */
    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who last updated the rule.
     * </p>
     *
     * @param lastUpdatedBy <p>
     *            The Amazon Resource Name (ARN) of the user who last updated
     *            the rule.
     *            </p>
     */
    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who last updated the rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastUpdatedBy <p>
     *            The Amazon Resource Name (ARN) of the user who last updated
     *            the rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Rule withLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
        return this;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     * </p>
     *
     * @return <p>
     *         The tags used to organize, track, or control access for this
     *         resource. For example, { "tags": {"key1":"value1",
     *         "key2":"value2"} }.
     *         </p>
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     * </p>
     *
     * @param tags <p>
     *            The tags used to organize, track, or control access for this
     *            resource. For example, { "tags": {"key1":"value1",
     *            "key2":"value2"} }.
     *            </p>
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags used to organize, track, or control access for this
     *            resource. For example, { "tags": {"key1":"value1",
     *            "key2":"value2"} }.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Rule withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     * </p>
     * <p>
     * The method adds a new key-value pair into Tags parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into Tags.
     * @param value The corresponding value of the entry to be added into Tags.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Rule addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public Rule clearTagsEntries() {
        this.tags = null;
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
        if (getRuleId() != null)
            sb.append("RuleId: " + getRuleId() + ",");
        if (getRuleArn() != null)
            sb.append("RuleArn: " + getRuleArn() + ",");
        if (getTriggerEventSource() != null)
            sb.append("TriggerEventSource: " + getTriggerEventSource() + ",");
        if (getFunction() != null)
            sb.append("Function: " + getFunction() + ",");
        if (getActions() != null)
            sb.append("Actions: " + getActions() + ",");
        if (getPublishStatus() != null)
            sb.append("PublishStatus: " + getPublishStatus() + ",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: " + getCreatedTime() + ",");
        if (getLastUpdatedTime() != null)
            sb.append("LastUpdatedTime: " + getLastUpdatedTime() + ",");
        if (getLastUpdatedBy() != null)
            sb.append("LastUpdatedBy: " + getLastUpdatedBy() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRuleId() == null) ? 0 : getRuleId().hashCode());
        hashCode = prime * hashCode + ((getRuleArn() == null) ? 0 : getRuleArn().hashCode());
        hashCode = prime * hashCode
                + ((getTriggerEventSource() == null) ? 0 : getTriggerEventSource().hashCode());
        hashCode = prime * hashCode + ((getFunction() == null) ? 0 : getFunction().hashCode());
        hashCode = prime * hashCode + ((getActions() == null) ? 0 : getActions().hashCode());
        hashCode = prime * hashCode
                + ((getPublishStatus() == null) ? 0 : getPublishStatus().hashCode());
        hashCode = prime * hashCode
                + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode
                + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        hashCode = prime * hashCode
                + ((getLastUpdatedBy() == null) ? 0 : getLastUpdatedBy().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Rule == false)
            return false;
        Rule other = (Rule) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getRuleId() == null ^ this.getRuleId() == null)
            return false;
        if (other.getRuleId() != null && other.getRuleId().equals(this.getRuleId()) == false)
            return false;
        if (other.getRuleArn() == null ^ this.getRuleArn() == null)
            return false;
        if (other.getRuleArn() != null && other.getRuleArn().equals(this.getRuleArn()) == false)
            return false;
        if (other.getTriggerEventSource() == null ^ this.getTriggerEventSource() == null)
            return false;
        if (other.getTriggerEventSource() != null
                && other.getTriggerEventSource().equals(this.getTriggerEventSource()) == false)
            return false;
        if (other.getFunction() == null ^ this.getFunction() == null)
            return false;
        if (other.getFunction() != null && other.getFunction().equals(this.getFunction()) == false)
            return false;
        if (other.getActions() == null ^ this.getActions() == null)
            return false;
        if (other.getActions() != null && other.getActions().equals(this.getActions()) == false)
            return false;
        if (other.getPublishStatus() == null ^ this.getPublishStatus() == null)
            return false;
        if (other.getPublishStatus() != null
                && other.getPublishStatus().equals(this.getPublishStatus()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null
                && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getLastUpdatedTime() == null ^ this.getLastUpdatedTime() == null)
            return false;
        if (other.getLastUpdatedTime() != null
                && other.getLastUpdatedTime().equals(this.getLastUpdatedTime()) == false)
            return false;
        if (other.getLastUpdatedBy() == null ^ this.getLastUpdatedBy() == null)
            return false;
        if (other.getLastUpdatedBy() != null
                && other.getLastUpdatedBy().equals(this.getLastUpdatedBy()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
