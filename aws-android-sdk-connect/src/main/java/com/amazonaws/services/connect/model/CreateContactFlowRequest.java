/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a contact flow for the specified Amazon Connect instance.
 * </p>
 * <p>
 * You can also create and update contact flows using the <a href=
 * "https://docs.aws.amazon.com/connect/latest/adminguide/flow-language.html"
 * >Amazon Connect Flow language</a>.
 * </p>
 */
public class CreateContactFlowRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The identifier of the Amazon Connect instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String instanceId;

    /**
     * <p>
     * The name of the contact flow.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String name;

    /**
     * <p>
     * The type of the contact flow. For descriptions of the available types,
     * see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/create-contact-flow.html#contact-flow-types"
     * >Choose a Contact Flow Type</a> in the <i>Amazon Connect Administrator
     * Guide</i>.
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
     * The description of the contact flow.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The content of the contact flow.
     * </p>
     */
    private String content;

    /**
     * <p>
     * One or more tags.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The identifier of the Amazon Connect instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The identifier of the Amazon Connect instance.
     *         </p>
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param instanceId <p>
     *            The identifier of the Amazon Connect instance.
     *            </p>
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param instanceId <p>
     *            The identifier of the Amazon Connect instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateContactFlowRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * <p>
     * The name of the contact flow.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The name of the contact flow.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the contact flow.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param name <p>
     *            The name of the contact flow.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the contact flow.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param name <p>
     *            The name of the contact flow.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateContactFlowRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The type of the contact flow. For descriptions of the available types,
     * see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/create-contact-flow.html#contact-flow-types"
     * >Choose a Contact Flow Type</a> in the <i>Amazon Connect Administrator
     * Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONTACT_FLOW, CUSTOMER_QUEUE, CUSTOMER_HOLD,
     * CUSTOMER_WHISPER, AGENT_HOLD, AGENT_WHISPER, OUTBOUND_WHISPER,
     * AGENT_TRANSFER, QUEUE_TRANSFER
     *
     * @return <p>
     *         The type of the contact flow. For descriptions of the available
     *         types, see <a href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/create-contact-flow.html#contact-flow-types"
     *         >Choose a Contact Flow Type</a> in the <i>Amazon Connect
     *         Administrator Guide</i>.
     *         </p>
     * @see ContactFlowType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of the contact flow. For descriptions of the available types,
     * see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/create-contact-flow.html#contact-flow-types"
     * >Choose a Contact Flow Type</a> in the <i>Amazon Connect Administrator
     * Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONTACT_FLOW, CUSTOMER_QUEUE, CUSTOMER_HOLD,
     * CUSTOMER_WHISPER, AGENT_HOLD, AGENT_WHISPER, OUTBOUND_WHISPER,
     * AGENT_TRANSFER, QUEUE_TRANSFER
     *
     * @param type <p>
     *            The type of the contact flow. For descriptions of the
     *            available types, see <a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/create-contact-flow.html#contact-flow-types"
     *            >Choose a Contact Flow Type</a> in the <i>Amazon Connect
     *            Administrator Guide</i>.
     *            </p>
     * @see ContactFlowType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the contact flow. For descriptions of the available types,
     * see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/create-contact-flow.html#contact-flow-types"
     * >Choose a Contact Flow Type</a> in the <i>Amazon Connect Administrator
     * Guide</i>.
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
     *            The type of the contact flow. For descriptions of the
     *            available types, see <a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/create-contact-flow.html#contact-flow-types"
     *            >Choose a Contact Flow Type</a> in the <i>Amazon Connect
     *            Administrator Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ContactFlowType
     */
    public CreateContactFlowRequest withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The type of the contact flow. For descriptions of the available types,
     * see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/create-contact-flow.html#contact-flow-types"
     * >Choose a Contact Flow Type</a> in the <i>Amazon Connect Administrator
     * Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONTACT_FLOW, CUSTOMER_QUEUE, CUSTOMER_HOLD,
     * CUSTOMER_WHISPER, AGENT_HOLD, AGENT_WHISPER, OUTBOUND_WHISPER,
     * AGENT_TRANSFER, QUEUE_TRANSFER
     *
     * @param type <p>
     *            The type of the contact flow. For descriptions of the
     *            available types, see <a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/create-contact-flow.html#contact-flow-types"
     *            >Choose a Contact Flow Type</a> in the <i>Amazon Connect
     *            Administrator Guide</i>.
     *            </p>
     * @see ContactFlowType
     */
    public void setType(ContactFlowType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of the contact flow. For descriptions of the available types,
     * see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/create-contact-flow.html#contact-flow-types"
     * >Choose a Contact Flow Type</a> in the <i>Amazon Connect Administrator
     * Guide</i>.
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
     *            The type of the contact flow. For descriptions of the
     *            available types, see <a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/create-contact-flow.html#contact-flow-types"
     *            >Choose a Contact Flow Type</a> in the <i>Amazon Connect
     *            Administrator Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ContactFlowType
     */
    public CreateContactFlowRequest withType(ContactFlowType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The description of the contact flow.
     * </p>
     *
     * @return <p>
     *         The description of the contact flow.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description of the contact flow.
     * </p>
     *
     * @param description <p>
     *            The description of the contact flow.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the contact flow.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            The description of the contact flow.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateContactFlowRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The content of the contact flow.
     * </p>
     *
     * @return <p>
     *         The content of the contact flow.
     *         </p>
     */
    public String getContent() {
        return content;
    }

    /**
     * <p>
     * The content of the contact flow.
     * </p>
     *
     * @param content <p>
     *            The content of the contact flow.
     *            </p>
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * <p>
     * The content of the contact flow.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param content <p>
     *            The content of the contact flow.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateContactFlowRequest withContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * <p>
     * One or more tags.
     * </p>
     *
     * @return <p>
     *         One or more tags.
     *         </p>
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * One or more tags.
     * </p>
     *
     * @param tags <p>
     *            One or more tags.
     *            </p>
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * One or more tags.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            One or more tags.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateContactFlowRequest withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * <p>
     * One or more tags.
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
    public CreateContactFlowRequest addTagsEntry(String key, String value) {
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
    public CreateContactFlowRequest clearTagsEntries() {
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
        if (getInstanceId() != null)
            sb.append("InstanceId: " + getInstanceId() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
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

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
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

        if (obj instanceof CreateContactFlowRequest == false)
            return false;
        CreateContactFlowRequest other = (CreateContactFlowRequest) obj;

        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
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
