/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The <code>UpdateContactAttributes</code> operation lets you programmatically
 * create new, or update existing, contact attributes associated with a contact.
 * You can use the operation to add or update attributes for both ongoing and
 * completed contacts. For example, you can update the customer's name or the
 * reason the customer called while the call is active, or add notes about steps
 * that the agent took during the call that are displayed to the next agent that
 * takes the call. You can also use the <code>UpdateContactAttributes</code>
 * operation to update attributes for a contact using data from your CRM
 * application and save the data with the contact in Amazon Connect. You could
 * also flag calls for additional analysis, such as legal review or identifying
 * abusive callers.
 * </p>
 * <p>
 * Contact attributes are available in Amazon Connect for 24 months, and are
 * then deleted.
 * </p>
 * <p>
 * <i>Important:</i>
 * </p>
 * <p>
 * You cannot use the operation to update attributes for contacts that occurred
 * prior to the release of the API, September 12, 2018. You can update
 * attributes only for contacts that started after the release of the API. If
 * you attempt to update attributes for a contact that occurred prior to the
 * release of the API, a 400 error is returned. This applies also to queued
 * callbacks that were initiated prior to the release of the API but are still
 * active in your instance.
 * </p>
 */
public class UpdateContactAttributesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The unique identifier of the contact for which to update attributes. This
     * is the identifier for the contact associated with the first interaction
     * with the contact center.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String initialContactId;

    /**
     * <p>
     * The identifier for your Amazon Connect instance. To find the ID of your
     * instance, open the AWS console and select Amazon Connect. Select the
     * alias of the instance in the Instance alias column. The instance ID is
     * displayed in the Overview section of your instance settings. For example,
     * the instance ID is the set of characters at the end of the instance ARN,
     * after instance/, such as 10a4c4eb-f57e-4d4c-b602-bf39176ced07.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String instanceId;

    /**
     * <p>
     * Specify a custom key-value pair using an attribute map. The attributes
     * are standard Amazon Connect attributes, and can be accessed in contact
     * flows just like any other contact attributes.
     * </p>
     * <p>
     * There can be up to 32,768 UTF-8 bytes across all key-value pairs per
     * contact. Attribute keys can include only alphanumeric, dash, and
     * underscore characters.
     * </p>
     */
    private java.util.Map<String, String> attributes;

    /**
     * <p>
     * The unique identifier of the contact for which to update attributes. This
     * is the identifier for the contact associated with the first interaction
     * with the contact center.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         The unique identifier of the contact for which to update
     *         attributes. This is the identifier for the contact associated
     *         with the first interaction with the contact center.
     *         </p>
     */
    public String getInitialContactId() {
        return initialContactId;
    }

    /**
     * <p>
     * The unique identifier of the contact for which to update attributes. This
     * is the identifier for the contact associated with the first interaction
     * with the contact center.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param initialContactId <p>
     *            The unique identifier of the contact for which to update
     *            attributes. This is the identifier for the contact associated
     *            with the first interaction with the contact center.
     *            </p>
     */
    public void setInitialContactId(String initialContactId) {
        this.initialContactId = initialContactId;
    }

    /**
     * <p>
     * The unique identifier of the contact for which to update attributes. This
     * is the identifier for the contact associated with the first interaction
     * with the contact center.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param initialContactId <p>
     *            The unique identifier of the contact for which to update
     *            attributes. This is the identifier for the contact associated
     *            with the first interaction with the contact center.
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
     * The identifier for your Amazon Connect instance. To find the ID of your
     * instance, open the AWS console and select Amazon Connect. Select the
     * alias of the instance in the Instance alias column. The instance ID is
     * displayed in the Overview section of your instance settings. For example,
     * the instance ID is the set of characters at the end of the instance ARN,
     * after instance/, such as 10a4c4eb-f57e-4d4c-b602-bf39176ced07.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The identifier for your Amazon Connect instance. To find the ID
     *         of your instance, open the AWS console and select Amazon Connect.
     *         Select the alias of the instance in the Instance alias column.
     *         The instance ID is displayed in the Overview section of your
     *         instance settings. For example, the instance ID is the set of
     *         characters at the end of the instance ARN, after instance/, such
     *         as 10a4c4eb-f57e-4d4c-b602-bf39176ced07.
     *         </p>
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * <p>
     * The identifier for your Amazon Connect instance. To find the ID of your
     * instance, open the AWS console and select Amazon Connect. Select the
     * alias of the instance in the Instance alias column. The instance ID is
     * displayed in the Overview section of your instance settings. For example,
     * the instance ID is the set of characters at the end of the instance ARN,
     * after instance/, such as 10a4c4eb-f57e-4d4c-b602-bf39176ced07.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param instanceId <p>
     *            The identifier for your Amazon Connect instance. To find the
     *            ID of your instance, open the AWS console and select Amazon
     *            Connect. Select the alias of the instance in the Instance
     *            alias column. The instance ID is displayed in the Overview
     *            section of your instance settings. For example, the instance
     *            ID is the set of characters at the end of the instance ARN,
     *            after instance/, such as 10a4c4eb-f57e-4d4c-b602-bf39176ced07.
     *            </p>
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The identifier for your Amazon Connect instance. To find the ID of your
     * instance, open the AWS console and select Amazon Connect. Select the
     * alias of the instance in the Instance alias column. The instance ID is
     * displayed in the Overview section of your instance settings. For example,
     * the instance ID is the set of characters at the end of the instance ARN,
     * after instance/, such as 10a4c4eb-f57e-4d4c-b602-bf39176ced07.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param instanceId <p>
     *            The identifier for your Amazon Connect instance. To find the
     *            ID of your instance, open the AWS console and select Amazon
     *            Connect. Select the alias of the instance in the Instance
     *            alias column. The instance ID is displayed in the Overview
     *            section of your instance settings. For example, the instance
     *            ID is the set of characters at the end of the instance ARN,
     *            after instance/, such as 10a4c4eb-f57e-4d4c-b602-bf39176ced07.
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
     * Specify a custom key-value pair using an attribute map. The attributes
     * are standard Amazon Connect attributes, and can be accessed in contact
     * flows just like any other contact attributes.
     * </p>
     * <p>
     * There can be up to 32,768 UTF-8 bytes across all key-value pairs per
     * contact. Attribute keys can include only alphanumeric, dash, and
     * underscore characters.
     * </p>
     *
     * @return <p>
     *         Specify a custom key-value pair using an attribute map. The
     *         attributes are standard Amazon Connect attributes, and can be
     *         accessed in contact flows just like any other contact attributes.
     *         </p>
     *         <p>
     *         There can be up to 32,768 UTF-8 bytes across all key-value pairs
     *         per contact. Attribute keys can include only alphanumeric, dash,
     *         and underscore characters.
     *         </p>
     */
    public java.util.Map<String, String> getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * Specify a custom key-value pair using an attribute map. The attributes
     * are standard Amazon Connect attributes, and can be accessed in contact
     * flows just like any other contact attributes.
     * </p>
     * <p>
     * There can be up to 32,768 UTF-8 bytes across all key-value pairs per
     * contact. Attribute keys can include only alphanumeric, dash, and
     * underscore characters.
     * </p>
     *
     * @param attributes <p>
     *            Specify a custom key-value pair using an attribute map. The
     *            attributes are standard Amazon Connect attributes, and can be
     *            accessed in contact flows just like any other contact
     *            attributes.
     *            </p>
     *            <p>
     *            There can be up to 32,768 UTF-8 bytes across all key-value
     *            pairs per contact. Attribute keys can include only
     *            alphanumeric, dash, and underscore characters.
     *            </p>
     */
    public void setAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes;
    }

    /**
     * <p>
     * Specify a custom key-value pair using an attribute map. The attributes
     * are standard Amazon Connect attributes, and can be accessed in contact
     * flows just like any other contact attributes.
     * </p>
     * <p>
     * There can be up to 32,768 UTF-8 bytes across all key-value pairs per
     * contact. Attribute keys can include only alphanumeric, dash, and
     * underscore characters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attributes <p>
     *            Specify a custom key-value pair using an attribute map. The
     *            attributes are standard Amazon Connect attributes, and can be
     *            accessed in contact flows just like any other contact
     *            attributes.
     *            </p>
     *            <p>
     *            There can be up to 32,768 UTF-8 bytes across all key-value
     *            pairs per contact. Attribute keys can include only
     *            alphanumeric, dash, and underscore characters.
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
     * Specify a custom key-value pair using an attribute map. The attributes
     * are standard Amazon Connect attributes, and can be accessed in contact
     * flows just like any other contact attributes.
     * </p>
     * <p>
     * There can be up to 32,768 UTF-8 bytes across all key-value pairs per
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
