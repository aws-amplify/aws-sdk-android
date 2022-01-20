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
 * Creates or updates user-defined contact attributes associated with the
 * specified contact.
 * </p>
 * <p>
 * You can create or update user-defined attributes for both ongoing and
 * completed contacts. For example, while the call is active, you can update the
 * customer's name or the reason the customer called. You can add notes about
 * steps that the agent took during the call that display to the next agent that
 * takes the call. You can also update attributes for a contact using data from
 * your CRM application and save the data with the contact in Amazon Connect.
 * You could also flag calls for additional analysis, such as legal review or to
 * identify abusive callers.
 * </p>
 * <p>
 * Contact attributes are available in Amazon Connect for 24 months, and are
 * then deleted. For information about CTR retention and the maximum size of the
 * CTR attributes section, see <a href=
 * "https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html#feature-limits"
 * >Feature specifications</a> in the <i>Amazon Connect Administrator Guide</i>.
 * </p>
 * <p>
 * <b>Important:</b> You cannot use the operation to update attributes for
 * contacts that occurred prior to the release of the API, which was September
 * 12, 2018. You can update attributes only for contacts that started after the
 * release of the API. If you attempt to update attributes for a contact that
 * occurred prior to the release of the API, a 400 error is returned. This
 * applies also to queued callbacks that were initiated prior to the release of
 * the API but are still active in your instance.
 * </p>
 */
public class UpdateContactAttributesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The identifier of the contact. This is the identifier of the contact
     * associated with the first interaction with the contact center.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String initialContactId;

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the
     * instanceId in the ARN of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String instanceId;

    /**
     * <p>
     * The Amazon Connect attributes. These attributes can be accessed in
     * contact flows just like any other contact attributes.
     * </p>
     * <p>
     * You can have up to 32,768 UTF-8 bytes across all attributes for a
     * contact. Attribute keys can include only alphanumeric, dash, and
     * underscore characters.
     * </p>
     */
    private java.util.Map<String, String> attributes;

    /**
     * <p>
     * The identifier of the contact. This is the identifier of the contact
     * associated with the first interaction with the contact center.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         The identifier of the contact. This is the identifier of the
     *         contact associated with the first interaction with the contact
     *         center.
     *         </p>
     */
    public String getInitialContactId() {
        return initialContactId;
    }

    /**
     * <p>
     * The identifier of the contact. This is the identifier of the contact
     * associated with the first interaction with the contact center.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param initialContactId <p>
     *            The identifier of the contact. This is the identifier of the
     *            contact associated with the first interaction with the contact
     *            center.
     *            </p>
     */
    public void setInitialContactId(String initialContactId) {
        this.initialContactId = initialContactId;
    }

    /**
     * <p>
     * The identifier of the contact. This is the identifier of the contact
     * associated with the first interaction with the contact center.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param initialContactId <p>
     *            The identifier of the contact. This is the identifier of the
     *            contact associated with the first interaction with the contact
     *            center.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateContactAttributesRequest withInitialContactId(String initialContactId) {
        this.initialContactId = initialContactId;
        return this;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the
     * instanceId in the ARN of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The identifier of the Amazon Connect instance. You can find the
     *         instanceId in the ARN of the instance.
     *         </p>
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the
     * instanceId in the ARN of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param instanceId <p>
     *            The identifier of the Amazon Connect instance. You can find
     *            the instanceId in the ARN of the instance.
     *            </p>
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the
     * instanceId in the ARN of the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param instanceId <p>
     *            The identifier of the Amazon Connect instance. You can find
     *            the instanceId in the ARN of the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateContactAttributesRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * <p>
     * The Amazon Connect attributes. These attributes can be accessed in
     * contact flows just like any other contact attributes.
     * </p>
     * <p>
     * You can have up to 32,768 UTF-8 bytes across all attributes for a
     * contact. Attribute keys can include only alphanumeric, dash, and
     * underscore characters.
     * </p>
     *
     * @return <p>
     *         The Amazon Connect attributes. These attributes can be accessed
     *         in contact flows just like any other contact attributes.
     *         </p>
     *         <p>
     *         You can have up to 32,768 UTF-8 bytes across all attributes for a
     *         contact. Attribute keys can include only alphanumeric, dash, and
     *         underscore characters.
     *         </p>
     */
    public java.util.Map<String, String> getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * The Amazon Connect attributes. These attributes can be accessed in
     * contact flows just like any other contact attributes.
     * </p>
     * <p>
     * You can have up to 32,768 UTF-8 bytes across all attributes for a
     * contact. Attribute keys can include only alphanumeric, dash, and
     * underscore characters.
     * </p>
     *
     * @param attributes <p>
     *            The Amazon Connect attributes. These attributes can be
     *            accessed in contact flows just like any other contact
     *            attributes.
     *            </p>
     *            <p>
     *            You can have up to 32,768 UTF-8 bytes across all attributes
     *            for a contact. Attribute keys can include only alphanumeric,
     *            dash, and underscore characters.
     *            </p>
     */
    public void setAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes;
    }

    /**
     * <p>
     * The Amazon Connect attributes. These attributes can be accessed in
     * contact flows just like any other contact attributes.
     * </p>
     * <p>
     * You can have up to 32,768 UTF-8 bytes across all attributes for a
     * contact. Attribute keys can include only alphanumeric, dash, and
     * underscore characters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attributes <p>
     *            The Amazon Connect attributes. These attributes can be
     *            accessed in contact flows just like any other contact
     *            attributes.
     *            </p>
     *            <p>
     *            You can have up to 32,768 UTF-8 bytes across all attributes
     *            for a contact. Attribute keys can include only alphanumeric,
     *            dash, and underscore characters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateContactAttributesRequest withAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     * <p>
     * The Amazon Connect attributes. These attributes can be accessed in
     * contact flows just like any other contact attributes.
     * </p>
     * <p>
     * You can have up to 32,768 UTF-8 bytes across all attributes for a
     * contact. Attribute keys can include only alphanumeric, dash, and
     * underscore characters.
     * </p>
     * <p>
     * The method adds a new key-value pair into Attributes parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into Attributes.
     * @param value The corresponding value of the entry to be added into
     *            Attributes.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateContactAttributesRequest addAttributesEntry(String key, String value) {
        if (null == this.attributes) {
            this.attributes = new java.util.HashMap<String, String>();
        }
        if (this.attributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.attributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Attributes.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public UpdateContactAttributesRequest clearAttributesEntries() {
        this.attributes = null;
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
        if (getInitialContactId() != null)
            sb.append("InitialContactId: " + getInitialContactId() + ",");
        if (getInstanceId() != null)
            sb.append("InstanceId: " + getInstanceId() + ",");
        if (getAttributes() != null)
            sb.append("Attributes: " + getAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getInitialContactId() == null) ? 0 : getInitialContactId().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateContactAttributesRequest == false)
            return false;
        UpdateContactAttributesRequest other = (UpdateContactAttributesRequest) obj;

        if (other.getInitialContactId() == null ^ this.getInitialContactId() == null)
            return false;
        if (other.getInitialContactId() != null
                && other.getInitialContactId().equals(this.getInitialContactId()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null
                && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        return true;
    }
}
