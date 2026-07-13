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
 * Request object with information to create a contact.
 * </p>
 */
public class ContactDataRequest implements Serializable {
    /**
     * <p>
     * Endpoint associated with the Amazon Connect instance from which outbound
     * contact will be initiated for the campaign.
     * </p>
     */
    private Endpoint systemEndpoint;

    /**
     * <p>
     * Endpoint of the customer for which contact will be initiated.
     * </p>
     */
    private Endpoint customerEndpoint;

    /**
     * <p>
     * Identifier to uniquely identify individual requests in the batch.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 80<br/>
     */
    private String requestIdentifier;

    /**
     * <p>
     * The identifier of the queue associated with the Amazon Connect instance
     * in which contacts that are created will be queued.
     * </p>
     */
    private String queueId;

    /**
     * <p>
     * List of attributes to be stored in a contact.
     * </p>
     */
    private java.util.Map<String, String> attributes;

    /**
     * <p>
     * Structure to store information associated with a campaign.
     * </p>
     */
    private Campaign campaign;

    /**
     * <p>
     * Endpoint associated with the Amazon Connect instance from which outbound
     * contact will be initiated for the campaign.
     * </p>
     *
     * @return <p>
     *         Endpoint associated with the Amazon Connect instance from which
     *         outbound contact will be initiated for the campaign.
     *         </p>
     */
    public Endpoint getSystemEndpoint() {
        return systemEndpoint;
    }

    /**
     * <p>
     * Endpoint associated with the Amazon Connect instance from which outbound
     * contact will be initiated for the campaign.
     * </p>
     *
     * @param systemEndpoint <p>
     *            Endpoint associated with the Amazon Connect instance from
     *            which outbound contact will be initiated for the campaign.
     *            </p>
     */
    public void setSystemEndpoint(Endpoint systemEndpoint) {
        this.systemEndpoint = systemEndpoint;
    }

    /**
     * <p>
     * Endpoint associated with the Amazon Connect instance from which outbound
     * contact will be initiated for the campaign.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param systemEndpoint <p>
     *            Endpoint associated with the Amazon Connect instance from
     *            which outbound contact will be initiated for the campaign.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContactDataRequest withSystemEndpoint(Endpoint systemEndpoint) {
        this.systemEndpoint = systemEndpoint;
        return this;
    }

    /**
     * <p>
     * Endpoint of the customer for which contact will be initiated.
     * </p>
     *
     * @return <p>
     *         Endpoint of the customer for which contact will be initiated.
     *         </p>
     */
    public Endpoint getCustomerEndpoint() {
        return customerEndpoint;
    }

    /**
     * <p>
     * Endpoint of the customer for which contact will be initiated.
     * </p>
     *
     * @param customerEndpoint <p>
     *            Endpoint of the customer for which contact will be initiated.
     *            </p>
     */
    public void setCustomerEndpoint(Endpoint customerEndpoint) {
        this.customerEndpoint = customerEndpoint;
    }

    /**
     * <p>
     * Endpoint of the customer for which contact will be initiated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param customerEndpoint <p>
     *            Endpoint of the customer for which contact will be initiated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContactDataRequest withCustomerEndpoint(Endpoint customerEndpoint) {
        this.customerEndpoint = customerEndpoint;
        return this;
    }

    /**
     * <p>
     * Identifier to uniquely identify individual requests in the batch.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 80<br/>
     *
     * @return <p>
     *         Identifier to uniquely identify individual requests in the batch.
     *         </p>
     */
    public String getRequestIdentifier() {
        return requestIdentifier;
    }

    /**
     * <p>
     * Identifier to uniquely identify individual requests in the batch.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 80<br/>
     *
     * @param requestIdentifier <p>
     *            Identifier to uniquely identify individual requests in the
     *            batch.
     *            </p>
     */
    public void setRequestIdentifier(String requestIdentifier) {
        this.requestIdentifier = requestIdentifier;
    }

    /**
     * <p>
     * Identifier to uniquely identify individual requests in the batch.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 80<br/>
     *
     * @param requestIdentifier <p>
     *            Identifier to uniquely identify individual requests in the
     *            batch.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContactDataRequest withRequestIdentifier(String requestIdentifier) {
        this.requestIdentifier = requestIdentifier;
        return this;
    }

    /**
     * <p>
     * The identifier of the queue associated with the Amazon Connect instance
     * in which contacts that are created will be queued.
     * </p>
     *
     * @return <p>
     *         The identifier of the queue associated with the Amazon Connect
     *         instance in which contacts that are created will be queued.
     *         </p>
     */
    public String getQueueId() {
        return queueId;
    }

    /**
     * <p>
     * The identifier of the queue associated with the Amazon Connect instance
     * in which contacts that are created will be queued.
     * </p>
     *
     * @param queueId <p>
     *            The identifier of the queue associated with the Amazon Connect
     *            instance in which contacts that are created will be queued.
     *            </p>
     */
    public void setQueueId(String queueId) {
        this.queueId = queueId;
    }

    /**
     * <p>
     * The identifier of the queue associated with the Amazon Connect instance
     * in which contacts that are created will be queued.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param queueId <p>
     *            The identifier of the queue associated with the Amazon Connect
     *            instance in which contacts that are created will be queued.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContactDataRequest withQueueId(String queueId) {
        this.queueId = queueId;
        return this;
    }

    /**
     * <p>
     * List of attributes to be stored in a contact.
     * </p>
     *
     * @return <p>
     *         List of attributes to be stored in a contact.
     *         </p>
     */
    public java.util.Map<String, String> getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * List of attributes to be stored in a contact.
     * </p>
     *
     * @param attributes <p>
     *            List of attributes to be stored in a contact.
     *            </p>
     */
    public void setAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes;
    }

    /**
     * <p>
     * List of attributes to be stored in a contact.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attributes <p>
     *            List of attributes to be stored in a contact.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContactDataRequest withAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     * <p>
     * List of attributes to be stored in a contact.
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
    public ContactDataRequest addAttributesEntry(String key, String value) {
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
    public ContactDataRequest clearAttributesEntries() {
        this.attributes = null;
        return this;
    }

    /**
     * <p>
     * Structure to store information associated with a campaign.
     * </p>
     *
     * @return <p>
     *         Structure to store information associated with a campaign.
     *         </p>
     */
    public Campaign getCampaign() {
        return campaign;
    }

    /**
     * <p>
     * Structure to store information associated with a campaign.
     * </p>
     *
     * @param campaign <p>
     *            Structure to store information associated with a campaign.
     *            </p>
     */
    public void setCampaign(Campaign campaign) {
        this.campaign = campaign;
    }

    /**
     * <p>
     * Structure to store information associated with a campaign.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param campaign <p>
     *            Structure to store information associated with a campaign.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContactDataRequest withCampaign(Campaign campaign) {
        this.campaign = campaign;
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
        if (getSystemEndpoint() != null)
            sb.append("SystemEndpoint: " + getSystemEndpoint() + ",");
        if (getCustomerEndpoint() != null)
            sb.append("CustomerEndpoint: " + getCustomerEndpoint() + ",");
        if (getRequestIdentifier() != null)
            sb.append("RequestIdentifier: " + getRequestIdentifier() + ",");
        if (getQueueId() != null)
            sb.append("QueueId: " + getQueueId() + ",");
        if (getAttributes() != null)
            sb.append("Attributes: " + getAttributes() + ",");
        if (getCampaign() != null)
            sb.append("Campaign: " + getCampaign());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSystemEndpoint() == null) ? 0 : getSystemEndpoint().hashCode());
        hashCode = prime * hashCode
                + ((getCustomerEndpoint() == null) ? 0 : getCustomerEndpoint().hashCode());
        hashCode = prime * hashCode
                + ((getRequestIdentifier() == null) ? 0 : getRequestIdentifier().hashCode());
        hashCode = prime * hashCode + ((getQueueId() == null) ? 0 : getQueueId().hashCode());
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        hashCode = prime * hashCode + ((getCampaign() == null) ? 0 : getCampaign().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ContactDataRequest == false)
            return false;
        ContactDataRequest other = (ContactDataRequest) obj;

        if (other.getSystemEndpoint() == null ^ this.getSystemEndpoint() == null)
            return false;
        if (other.getSystemEndpoint() != null
                && other.getSystemEndpoint().equals(this.getSystemEndpoint()) == false)
            return false;
        if (other.getCustomerEndpoint() == null ^ this.getCustomerEndpoint() == null)
            return false;
        if (other.getCustomerEndpoint() != null
                && other.getCustomerEndpoint().equals(this.getCustomerEndpoint()) == false)
            return false;
        if (other.getRequestIdentifier() == null ^ this.getRequestIdentifier() == null)
            return false;
        if (other.getRequestIdentifier() != null
                && other.getRequestIdentifier().equals(this.getRequestIdentifier()) == false)
            return false;
        if (other.getQueueId() == null ^ this.getQueueId() == null)
            return false;
        if (other.getQueueId() != null && other.getQueueId().equals(this.getQueueId()) == false)
            return false;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null
                && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        if (other.getCampaign() == null ^ this.getCampaign() == null)
            return false;
        if (other.getCampaign() != null && other.getCampaign().equals(this.getCampaign()) == false)
            return false;
        return true;
    }
}
