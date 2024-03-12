/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Contains information about a flow.
 * </p>
 */
public class ContactFlow implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the flow.
     * </p>
     */
    private String arn;

    /**
     * <p>
     * The identifier of the flow.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     */
    private String id;

    /**
     * <p>
     * The name of the flow.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String name;

    /**
     * <p>
     * The type of the flow. For descriptions of the available types, see <a
     * href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/create-contact-flow.html#contact-flow-types"
     * >Choose a flow type</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONTACT_FLOW, CUSTOMER_QUEUE, CUSTOMER_HOLD,
     * CUSTOMER_WHISPER, AGENT_HOLD, AGENT_WHISPER, OUTBOUND_WHISPER,
     * AGENT_TRANSFER, QUEUE_TRANSFER
     */
    private String type;

    /**
     * <p>
     * The type of flow.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, ARCHIVED
     */
    private String state;

    /**
     * <p>
     * The description of the flow.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The JSON string that represents the content of the flow. For an example,
     * see <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/flow-language-example.html"
     * >Example flow in Amazon Connect Flow language</a>.
     * </p>
     * <p>
     * Length Constraints: Minimum length of 1. Maximum length of 256000.
     * </p>
     */
    private String content;

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * For example, { "Tags": {"key1":"value1", "key2":"value2"} }.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the flow.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the flow.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the flow.
     * </p>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the flow.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the flow.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the flow.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContactFlow withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * <p>
     * The identifier of the flow.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     *
     * @return <p>
     *         The identifier of the flow.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The identifier of the flow.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     *
     * @param id <p>
     *            The identifier of the flow.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the flow.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     *
     * @param id <p>
     *            The identifier of the flow.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContactFlow withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The name of the flow.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The name of the flow.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the flow.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param name <p>
     *            The name of the flow.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the flow.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param name <p>
     *            The name of the flow.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContactFlow withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The type of the flow. For descriptions of the available types, see <a
     * href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/create-contact-flow.html#contact-flow-types"
     * >Choose a flow type</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONTACT_FLOW, CUSTOMER_QUEUE, CUSTOMER_HOLD,
     * CUSTOMER_WHISPER, AGENT_HOLD, AGENT_WHISPER, OUTBOUND_WHISPER,
     * AGENT_TRANSFER, QUEUE_TRANSFER
     *
     * @return <p>
     *         The type of the flow. For descriptions of the available types,
     *         see <a href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/create-contact-flow.html#contact-flow-types"
     *         >Choose a flow type</a> in the <i>Amazon Connect Administrator
     *         Guide</i>.
     *         </p>
     * @see ContactFlowType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of the flow. For descriptions of the available types, see <a
     * href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/create-contact-flow.html#contact-flow-types"
     * >Choose a flow type</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONTACT_FLOW, CUSTOMER_QUEUE, CUSTOMER_HOLD,
     * CUSTOMER_WHISPER, AGENT_HOLD, AGENT_WHISPER, OUTBOUND_WHISPER,
     * AGENT_TRANSFER, QUEUE_TRANSFER
     *
     * @param type <p>
     *            The type of the flow. For descriptions of the available types,
     *            see <a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/create-contact-flow.html#contact-flow-types"
     *            >Choose a flow type</a> in the <i>Amazon Connect Administrator
     *            Guide</i>.
     *            </p>
     * @see ContactFlowType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the flow. For descriptions of the available types, see <a
     * href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/create-contact-flow.html#contact-flow-types"
     * >Choose a flow type</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONTACT_FLOW, CUSTOMER_QUEUE, CUSTOMER_HOLD,
     * CUSTOMER_WHISPER, AGENT_HOLD, AGENT_WHISPER, OUTBOUND_WHISPER,
     * AGENT_TRANSFER, QUEUE_TRANSFER
     *
     * @param type <p>
     *            The type of the flow. For descriptions of the available types,
     *            see <a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/create-contact-flow.html#contact-flow-types"
     *            >Choose a flow type</a> in the <i>Amazon Connect Administrator
     *            Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ContactFlowType
     */
    public ContactFlow withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The type of the flow. For descriptions of the available types, see <a
     * href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/create-contact-flow.html#contact-flow-types"
     * >Choose a flow type</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONTACT_FLOW, CUSTOMER_QUEUE, CUSTOMER_HOLD,
     * CUSTOMER_WHISPER, AGENT_HOLD, AGENT_WHISPER, OUTBOUND_WHISPER,
     * AGENT_TRANSFER, QUEUE_TRANSFER
     *
     * @param type <p>
     *            The type of the flow. For descriptions of the available types,
     *            see <a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/create-contact-flow.html#contact-flow-types"
     *            >Choose a flow type</a> in the <i>Amazon Connect Administrator
     *            Guide</i>.
     *            </p>
     * @see ContactFlowType
     */
    public void setType(ContactFlowType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of the flow. For descriptions of the available types, see <a
     * href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/create-contact-flow.html#contact-flow-types"
     * >Choose a flow type</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONTACT_FLOW, CUSTOMER_QUEUE, CUSTOMER_HOLD,
     * CUSTOMER_WHISPER, AGENT_HOLD, AGENT_WHISPER, OUTBOUND_WHISPER,
     * AGENT_TRANSFER, QUEUE_TRANSFER
     *
     * @param type <p>
     *            The type of the flow. For descriptions of the available types,
     *            see <a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/create-contact-flow.html#contact-flow-types"
     *            >Choose a flow type</a> in the <i>Amazon Connect Administrator
     *            Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ContactFlowType
     */
    public ContactFlow withType(ContactFlowType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The type of flow.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, ARCHIVED
     *
     * @return <p>
     *         The type of flow.
     *         </p>
     * @see ContactFlowState
     */
    public String getState() {
        return state;
    }

    /**
     * <p>
     * The type of flow.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, ARCHIVED
     *
     * @param state <p>
     *            The type of flow.
     *            </p>
     * @see ContactFlowState
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The type of flow.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, ARCHIVED
     *
     * @param state <p>
     *            The type of flow.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ContactFlowState
     */
    public ContactFlow withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * <p>
     * The type of flow.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, ARCHIVED
     *
     * @param state <p>
     *            The type of flow.
     *            </p>
     * @see ContactFlowState
     */
    public void setState(ContactFlowState state) {
        this.state = state.toString();
    }

    /**
     * <p>
     * The type of flow.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, ARCHIVED
     *
     * @param state <p>
     *            The type of flow.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ContactFlowState
     */
    public ContactFlow withState(ContactFlowState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The description of the flow.
     * </p>
     *
     * @return <p>
     *         The description of the flow.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description of the flow.
     * </p>
     *
     * @param description <p>
     *            The description of the flow.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the flow.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            The description of the flow.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContactFlow withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The JSON string that represents the content of the flow. For an example,
     * see <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/flow-language-example.html"
     * >Example flow in Amazon Connect Flow language</a>.
     * </p>
     * <p>
     * Length Constraints: Minimum length of 1. Maximum length of 256000.
     * </p>
     *
     * @return <p>
     *         The JSON string that represents the content of the flow. For an
     *         example, see <a href=
     *         "https://docs.aws.amazon.com/connect/latest/APIReference/flow-language-example.html"
     *         >Example flow in Amazon Connect Flow language</a>.
     *         </p>
     *         <p>
     *         Length Constraints: Minimum length of 1. Maximum length of
     *         256000.
     *         </p>
     */
    public String getContent() {
        return content;
    }

    /**
     * <p>
     * The JSON string that represents the content of the flow. For an example,
     * see <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/flow-language-example.html"
     * >Example flow in Amazon Connect Flow language</a>.
     * </p>
     * <p>
     * Length Constraints: Minimum length of 1. Maximum length of 256000.
     * </p>
     *
     * @param content <p>
     *            The JSON string that represents the content of the flow. For
     *            an example, see <a href=
     *            "https://docs.aws.amazon.com/connect/latest/APIReference/flow-language-example.html"
     *            >Example flow in Amazon Connect Flow language</a>.
     *            </p>
     *            <p>
     *            Length Constraints: Minimum length of 1. Maximum length of
     *            256000.
     *            </p>
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * <p>
     * The JSON string that represents the content of the flow. For an example,
     * see <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/flow-language-example.html"
     * >Example flow in Amazon Connect Flow language</a>.
     * </p>
     * <p>
     * Length Constraints: Minimum length of 1. Maximum length of 256000.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param content <p>
     *            The JSON string that represents the content of the flow. For
     *            an example, see <a href=
     *            "https://docs.aws.amazon.com/connect/latest/APIReference/flow-language-example.html"
     *            >Example flow in Amazon Connect Flow language</a>.
     *            </p>
     *            <p>
     *            Length Constraints: Minimum length of 1. Maximum length of
     *            256000.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContactFlow withContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * For example, { "Tags": {"key1":"value1", "key2":"value2"} }.
     * </p>
     *
     * @return <p>
     *         The tags used to organize, track, or control access for this
     *         resource. For example, { "Tags": {"key1":"value1",
     *         "key2":"value2"} }.
     *         </p>
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * For example, { "Tags": {"key1":"value1", "key2":"value2"} }.
     * </p>
     *
     * @param tags <p>
     *            The tags used to organize, track, or control access for this
     *            resource. For example, { "Tags": {"key1":"value1",
     *            "key2":"value2"} }.
     *            </p>
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * For example, { "Tags": {"key1":"value1", "key2":"value2"} }.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags used to organize, track, or control access for this
     *            resource. For example, { "Tags": {"key1":"value1",
     *            "key2":"value2"} }.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContactFlow withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * For example, { "Tags": {"key1":"value1", "key2":"value2"} }.
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
    public ContactFlow addTagsEntry(String key, String value) {
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
    public ContactFlow clearTagsEntries() {
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
        if (getArn() != null)
            sb.append("Arn: " + getArn() + ",");
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getState() != null)
            sb.append("State: " + getState() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getContent() != null)
            sb.append("Content: " + getContent() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ContactFlow == false)
            return false;
        ContactFlow other = (ContactFlow) obj;

        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
