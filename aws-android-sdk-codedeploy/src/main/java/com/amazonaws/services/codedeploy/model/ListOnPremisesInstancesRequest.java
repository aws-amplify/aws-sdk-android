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

package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Gets a list of names for one or more on-premises instances.
 * </p>
 * <p>
 * Unless otherwise specified, both registered and deregistered on-premises
 * instance names are listed. To list only registered or deregistered
 * on-premises instance names, use the registration status parameter.
 * </p>
 */
public class ListOnPremisesInstancesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The registration status of the on-premises instances:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Deregistered</code>: Include deregistered on-premises instances in
     * the resulting list.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Registered</code>: Include registered on-premises instances in the
     * resulting list.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Registered, Deregistered
     */
    private String registrationStatus;

    /**
     * <p>
     * The on-premises instance tags that are used to restrict the on-premises
     * instance names returned.
     * </p>
     */
    private java.util.List<TagFilter> tagFilters;

    /**
     * <p>
     * An identifier returned from the previous list on-premises instances call.
     * It can be used to return the next set of on-premises instances in the
     * list.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The registration status of the on-premises instances:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Deregistered</code>: Include deregistered on-premises instances in
     * the resulting list.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Registered</code>: Include registered on-premises instances in the
     * resulting list.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Registered, Deregistered
     *
     * @return <p>
     *         The registration status of the on-premises instances:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Deregistered</code>: Include deregistered on-premises
     *         instances in the resulting list.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Registered</code>: Include registered on-premises instances
     *         in the resulting list.
     *         </p>
     *         </li>
     *         </ul>
     * @see RegistrationStatus
     */
    public String getRegistrationStatus() {
        return registrationStatus;
    }

    /**
     * <p>
     * The registration status of the on-premises instances:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Deregistered</code>: Include deregistered on-premises instances in
     * the resulting list.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Registered</code>: Include registered on-premises instances in the
     * resulting list.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Registered, Deregistered
     *
     * @param registrationStatus <p>
     *            The registration status of the on-premises instances:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Deregistered</code>: Include deregistered on-premises
     *            instances in the resulting list.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Registered</code>: Include registered on-premises
     *            instances in the resulting list.
     *            </p>
     *            </li>
     *            </ul>
     * @see RegistrationStatus
     */
    public void setRegistrationStatus(String registrationStatus) {
        this.registrationStatus = registrationStatus;
    }

    /**
     * <p>
     * The registration status of the on-premises instances:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Deregistered</code>: Include deregistered on-premises instances in
     * the resulting list.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Registered</code>: Include registered on-premises instances in the
     * resulting list.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Registered, Deregistered
     *
     * @param registrationStatus <p>
     *            The registration status of the on-premises instances:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Deregistered</code>: Include deregistered on-premises
     *            instances in the resulting list.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Registered</code>: Include registered on-premises
     *            instances in the resulting list.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RegistrationStatus
     */
    public ListOnPremisesInstancesRequest withRegistrationStatus(String registrationStatus) {
        this.registrationStatus = registrationStatus;
        return this;
    }

    /**
     * <p>
     * The registration status of the on-premises instances:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Deregistered</code>: Include deregistered on-premises instances in
     * the resulting list.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Registered</code>: Include registered on-premises instances in the
     * resulting list.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Registered, Deregistered
     *
     * @param registrationStatus <p>
     *            The registration status of the on-premises instances:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Deregistered</code>: Include deregistered on-premises
     *            instances in the resulting list.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Registered</code>: Include registered on-premises
     *            instances in the resulting list.
     *            </p>
     *            </li>
     *            </ul>
     * @see RegistrationStatus
     */
    public void setRegistrationStatus(RegistrationStatus registrationStatus) {
        this.registrationStatus = registrationStatus.toString();
    }

    /**
     * <p>
     * The registration status of the on-premises instances:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Deregistered</code>: Include deregistered on-premises instances in
     * the resulting list.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Registered</code>: Include registered on-premises instances in the
     * resulting list.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Registered, Deregistered
     *
     * @param registrationStatus <p>
     *            The registration status of the on-premises instances:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Deregistered</code>: Include deregistered on-premises
     *            instances in the resulting list.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Registered</code>: Include registered on-premises
     *            instances in the resulting list.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RegistrationStatus
     */
    public ListOnPremisesInstancesRequest withRegistrationStatus(
            RegistrationStatus registrationStatus) {
        this.registrationStatus = registrationStatus.toString();
        return this;
    }

    /**
     * <p>
     * The on-premises instance tags that are used to restrict the on-premises
     * instance names returned.
     * </p>
     *
     * @return <p>
     *         The on-premises instance tags that are used to restrict the
     *         on-premises instance names returned.
     *         </p>
     */
    public java.util.List<TagFilter> getTagFilters() {
        return tagFilters;
    }

    /**
     * <p>
     * The on-premises instance tags that are used to restrict the on-premises
     * instance names returned.
     * </p>
     *
     * @param tagFilters <p>
     *            The on-premises instance tags that are used to restrict the
     *            on-premises instance names returned.
     *            </p>
     */
    public void setTagFilters(java.util.Collection<TagFilter> tagFilters) {
        if (tagFilters == null) {
            this.tagFilters = null;
            return;
        }

        this.tagFilters = new java.util.ArrayList<TagFilter>(tagFilters);
    }

    /**
     * <p>
     * The on-premises instance tags that are used to restrict the on-premises
     * instance names returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagFilters <p>
     *            The on-premises instance tags that are used to restrict the
     *            on-premises instance names returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListOnPremisesInstancesRequest withTagFilters(TagFilter... tagFilters) {
        if (getTagFilters() == null) {
            this.tagFilters = new java.util.ArrayList<TagFilter>(tagFilters.length);
        }
        for (TagFilter value : tagFilters) {
            this.tagFilters.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The on-premises instance tags that are used to restrict the on-premises
     * instance names returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagFilters <p>
     *            The on-premises instance tags that are used to restrict the
     *            on-premises instance names returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListOnPremisesInstancesRequest withTagFilters(java.util.Collection<TagFilter> tagFilters) {
        setTagFilters(tagFilters);
        return this;
    }

    /**
     * <p>
     * An identifier returned from the previous list on-premises instances call.
     * It can be used to return the next set of on-premises instances in the
     * list.
     * </p>
     *
     * @return <p>
     *         An identifier returned from the previous list on-premises
     *         instances call. It can be used to return the next set of
     *         on-premises instances in the list.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * An identifier returned from the previous list on-premises instances call.
     * It can be used to return the next set of on-premises instances in the
     * list.
     * </p>
     *
     * @param nextToken <p>
     *            An identifier returned from the previous list on-premises
     *            instances call. It can be used to return the next set of
     *            on-premises instances in the list.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An identifier returned from the previous list on-premises instances call.
     * It can be used to return the next set of on-premises instances in the
     * list.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            An identifier returned from the previous list on-premises
     *            instances call. It can be used to return the next set of
     *            on-premises instances in the list.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListOnPremisesInstancesRequest withNextToken(String nextToken) {
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
        if (getRegistrationStatus() != null)
            sb.append("registrationStatus: " + getRegistrationStatus() + ",");
        if (getTagFilters() != null)
            sb.append("tagFilters: " + getTagFilters() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getRegistrationStatus() == null) ? 0 : getRegistrationStatus().hashCode());
        hashCode = prime * hashCode + ((getTagFilters() == null) ? 0 : getTagFilters().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListOnPremisesInstancesRequest == false)
            return false;
        ListOnPremisesInstancesRequest other = (ListOnPremisesInstancesRequest) obj;

        if (other.getRegistrationStatus() == null ^ this.getRegistrationStatus() == null)
            return false;
        if (other.getRegistrationStatus() != null
                && other.getRegistrationStatus().equals(this.getRegistrationStatus()) == false)
            return false;
        if (other.getTagFilters() == null ^ this.getTagFilters() == null)
            return false;
        if (other.getTagFilters() != null
                && other.getTagFilters().equals(this.getTagFilters()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
