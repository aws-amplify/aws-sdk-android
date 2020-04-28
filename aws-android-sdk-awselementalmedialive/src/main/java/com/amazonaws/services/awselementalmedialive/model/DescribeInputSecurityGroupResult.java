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

package com.amazonaws.services.awselementalmedialive.model;

import java.io.Serializable;

/**
 * Placeholder documentation for DescribeInputSecurityGroupResponse
 */
public class DescribeInputSecurityGroupResult implements Serializable {
    /**
     * Unique ARN of Input Security Group
     */
    private String arn;

    /**
     * The Id of the Input Security Group
     */
    private String id;

    /**
     * The list of inputs currently using this Input Security Group.
     */
    private java.util.List<String> inputs;

    /**
     * The current state of the Input Security Group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IDLE, IN_USE, UPDATING, DELETED
     */
    private String state;

    /**
     * A collection of key-value pairs.
     */
    private java.util.Map<String, String> tags;

    /**
     * Whitelist rules and their sync status
     */
    private java.util.List<InputWhitelistRule> whitelistRules;

    /**
     * Unique ARN of Input Security Group
     *
     * @return Unique ARN of Input Security Group
     */
    public String getArn() {
        return arn;
    }

    /**
     * Unique ARN of Input Security Group
     *
     * @param arn Unique ARN of Input Security Group
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * Unique ARN of Input Security Group
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param arn Unique ARN of Input Security Group
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeInputSecurityGroupResult withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * The Id of the Input Security Group
     *
     * @return The Id of the Input Security Group
     */
    public String getId() {
        return id;
    }

    /**
     * The Id of the Input Security Group
     *
     * @param id The Id of the Input Security Group
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * The Id of the Input Security Group
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id The Id of the Input Security Group
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeInputSecurityGroupResult withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * The list of inputs currently using this Input Security Group.
     *
     * @return The list of inputs currently using this Input Security Group.
     */
    public java.util.List<String> getInputs() {
        return inputs;
    }

    /**
     * The list of inputs currently using this Input Security Group.
     *
     * @param inputs The list of inputs currently using this Input Security
     *            Group.
     */
    public void setInputs(java.util.Collection<String> inputs) {
        if (inputs == null) {
            this.inputs = null;
            return;
        }

        this.inputs = new java.util.ArrayList<String>(inputs);
    }

    /**
     * The list of inputs currently using this Input Security Group.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inputs The list of inputs currently using this Input Security
     *            Group.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeInputSecurityGroupResult withInputs(String... inputs) {
        if (getInputs() == null) {
            this.inputs = new java.util.ArrayList<String>(inputs.length);
        }
        for (String value : inputs) {
            this.inputs.add(value);
        }
        return this;
    }

    /**
     * The list of inputs currently using this Input Security Group.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inputs The list of inputs currently using this Input Security
     *            Group.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeInputSecurityGroupResult withInputs(java.util.Collection<String> inputs) {
        setInputs(inputs);
        return this;
    }

    /**
     * The current state of the Input Security Group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IDLE, IN_USE, UPDATING, DELETED
     *
     * @return The current state of the Input Security Group.
     * @see InputSecurityGroupState
     */
    public String getState() {
        return state;
    }

    /**
     * The current state of the Input Security Group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IDLE, IN_USE, UPDATING, DELETED
     *
     * @param state The current state of the Input Security Group.
     * @see InputSecurityGroupState
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * The current state of the Input Security Group.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IDLE, IN_USE, UPDATING, DELETED
     *
     * @param state The current state of the Input Security Group.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InputSecurityGroupState
     */
    public DescribeInputSecurityGroupResult withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * The current state of the Input Security Group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IDLE, IN_USE, UPDATING, DELETED
     *
     * @param state The current state of the Input Security Group.
     * @see InputSecurityGroupState
     */
    public void setState(InputSecurityGroupState state) {
        this.state = state.toString();
    }

    /**
     * The current state of the Input Security Group.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IDLE, IN_USE, UPDATING, DELETED
     *
     * @param state The current state of the Input Security Group.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InputSecurityGroupState
     */
    public DescribeInputSecurityGroupResult withState(InputSecurityGroupState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * A collection of key-value pairs.
     *
     * @return A collection of key-value pairs.
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * A collection of key-value pairs.
     *
     * @param tags A collection of key-value pairs.
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * A collection of key-value pairs.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags A collection of key-value pairs.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeInputSecurityGroupResult withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * A collection of key-value pairs.
     * <p>
     * The method adds a new key-value pair into Tags parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into Tags.
     * @param value The corresponding value of the entry to be added into Tags.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeInputSecurityGroupResult addTagsEntry(String key, String value) {
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
    public DescribeInputSecurityGroupResult clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * Whitelist rules and their sync status
     *
     * @return Whitelist rules and their sync status
     */
    public java.util.List<InputWhitelistRule> getWhitelistRules() {
        return whitelistRules;
    }

    /**
     * Whitelist rules and their sync status
     *
     * @param whitelistRules Whitelist rules and their sync status
     */
    public void setWhitelistRules(java.util.Collection<InputWhitelistRule> whitelistRules) {
        if (whitelistRules == null) {
            this.whitelistRules = null;
            return;
        }

        this.whitelistRules = new java.util.ArrayList<InputWhitelistRule>(whitelistRules);
    }

    /**
     * Whitelist rules and their sync status
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param whitelistRules Whitelist rules and their sync status
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeInputSecurityGroupResult withWhitelistRules(InputWhitelistRule... whitelistRules) {
        if (getWhitelistRules() == null) {
            this.whitelistRules = new java.util.ArrayList<InputWhitelistRule>(whitelistRules.length);
        }
        for (InputWhitelistRule value : whitelistRules) {
            this.whitelistRules.add(value);
        }
        return this;
    }

    /**
     * Whitelist rules and their sync status
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param whitelistRules Whitelist rules and their sync status
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeInputSecurityGroupResult withWhitelistRules(
            java.util.Collection<InputWhitelistRule> whitelistRules) {
        setWhitelistRules(whitelistRules);
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
        if (getArn() != null)
            sb.append("Arn: " + getArn() + ",");
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getInputs() != null)
            sb.append("Inputs: " + getInputs() + ",");
        if (getState() != null)
            sb.append("State: " + getState() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getWhitelistRules() != null)
            sb.append("WhitelistRules: " + getWhitelistRules());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getInputs() == null) ? 0 : getInputs().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode
                + ((getWhitelistRules() == null) ? 0 : getWhitelistRules().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeInputSecurityGroupResult == false)
            return false;
        DescribeInputSecurityGroupResult other = (DescribeInputSecurityGroupResult) obj;

        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getInputs() == null ^ this.getInputs() == null)
            return false;
        if (other.getInputs() != null && other.getInputs().equals(this.getInputs()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getWhitelistRules() == null ^ this.getWhitelistRules() == null)
            return false;
        if (other.getWhitelistRules() != null
                && other.getWhitelistRules().equals(this.getWhitelistRules()) == false)
            return false;
        return true;
    }
}
