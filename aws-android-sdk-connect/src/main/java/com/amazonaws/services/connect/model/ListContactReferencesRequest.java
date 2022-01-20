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
 * This API is in preview release for Amazon Connect and is subject to change.
 * </p>
 * <p>
 * For the specified <code>referenceTypes</code>, returns a list of references
 * associated with the contact.
 * </p>
 */
public class ListContactReferencesRequest extends AmazonWebServiceRequest implements Serializable {
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
     * The identifier of the initial contact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String contactId;

    /**
     * <p>
     * The type of reference.
     * </p>
     */
    private java.util.List<String> referenceTypes;

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the
     * previous response in the next request to retrieve the next set of
     * results.
     * </p>
     * <important>
     * <p>
     * This is not expected to be set, because the value returned in the
     * previous response is always null.
     * </p>
     * </important>
     */
    private String nextToken;

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
    public ListContactReferencesRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * <p>
     * The identifier of the initial contact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         The identifier of the initial contact.
     *         </p>
     */
    public String getContactId() {
        return contactId;
    }

    /**
     * <p>
     * The identifier of the initial contact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param contactId <p>
     *            The identifier of the initial contact.
     *            </p>
     */
    public void setContactId(String contactId) {
        this.contactId = contactId;
    }

    /**
     * <p>
     * The identifier of the initial contact.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param contactId <p>
     *            The identifier of the initial contact.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListContactReferencesRequest withContactId(String contactId) {
        this.contactId = contactId;
        return this;
    }

    /**
     * <p>
     * The type of reference.
     * </p>
     *
     * @return <p>
     *         The type of reference.
     *         </p>
     */
    public java.util.List<String> getReferenceTypes() {
        return referenceTypes;
    }

    /**
     * <p>
     * The type of reference.
     * </p>
     *
     * @param referenceTypes <p>
     *            The type of reference.
     *            </p>
     */
    public void setReferenceTypes(java.util.Collection<String> referenceTypes) {
        if (referenceTypes == null) {
            this.referenceTypes = null;
            return;
        }

        this.referenceTypes = new java.util.ArrayList<String>(referenceTypes);
    }

    /**
     * <p>
     * The type of reference.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param referenceTypes <p>
     *            The type of reference.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListContactReferencesRequest withReferenceTypes(String... referenceTypes) {
        if (getReferenceTypes() == null) {
            this.referenceTypes = new java.util.ArrayList<String>(referenceTypes.length);
        }
        for (String value : referenceTypes) {
            this.referenceTypes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The type of reference.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param referenceTypes <p>
     *            The type of reference.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListContactReferencesRequest withReferenceTypes(
            java.util.Collection<String> referenceTypes) {
        setReferenceTypes(referenceTypes);
        return this;
    }

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the
     * previous response in the next request to retrieve the next set of
     * results.
     * </p>
     * <important>
     * <p>
     * This is not expected to be set, because the value returned in the
     * previous response is always null.
     * </p>
     * </important>
     *
     * @return <p>
     *         The token for the next set of results. Use the value returned in
     *         the previous response in the next request to retrieve the next
     *         set of results.
     *         </p>
     *         <important>
     *         <p>
     *         This is not expected to be set, because the value returned in the
     *         previous response is always null.
     *         </p>
     *         </important>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the
     * previous response in the next request to retrieve the next set of
     * results.
     * </p>
     * <important>
     * <p>
     * This is not expected to be set, because the value returned in the
     * previous response is always null.
     * </p>
     * </important>
     *
     * @param nextToken <p>
     *            The token for the next set of results. Use the value returned
     *            in the previous response in the next request to retrieve the
     *            next set of results.
     *            </p>
     *            <important>
     *            <p>
     *            This is not expected to be set, because the value returned in
     *            the previous response is always null.
     *            </p>
     *            </important>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the
     * previous response in the next request to retrieve the next set of
     * results.
     * </p>
     * <important>
     * <p>
     * This is not expected to be set, because the value returned in the
     * previous response is always null.
     * </p>
     * </important>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The token for the next set of results. Use the value returned
     *            in the previous response in the next request to retrieve the
     *            next set of results.
     *            </p>
     *            <important>
     *            <p>
     *            This is not expected to be set, because the value returned in
     *            the previous response is always null.
     *            </p>
     *            </important>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListContactReferencesRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getContactId() != null)
            sb.append("ContactId: " + getContactId() + ",");
        if (getReferenceTypes() != null)
            sb.append("ReferenceTypes: " + getReferenceTypes() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getContactId() == null) ? 0 : getContactId().hashCode());
        hashCode = prime * hashCode
                + ((getReferenceTypes() == null) ? 0 : getReferenceTypes().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListContactReferencesRequest == false)
            return false;
        ListContactReferencesRequest other = (ListContactReferencesRequest) obj;

        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getContactId() == null ^ this.getContactId() == null)
            return false;
        if (other.getContactId() != null
                && other.getContactId().equals(this.getContactId()) == false)
            return false;
        if (other.getReferenceTypes() == null ^ this.getReferenceTypes() == null)
            return false;
        if (other.getReferenceTypes() != null
                && other.getReferenceTypes().equals(this.getReferenceTypes()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
