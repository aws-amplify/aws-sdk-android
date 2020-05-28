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

package com.amazonaws.services.workmail.model;

import java.io.Serializable;

/**
 * <p>
 * At least one delegate must be associated to the resource to disable automatic
 * replies from the resource.
 * </p>
 */
public class BookingOptions implements Serializable {
    /**
     * <p>
     * The resource's ability to automatically reply to requests. If disabled,
     * delegates must be associated to the resource.
     * </p>
     */
    private Boolean autoAcceptRequests;

    /**
     * <p>
     * The resource's ability to automatically decline any recurring requests.
     * </p>
     */
    private Boolean autoDeclineRecurringRequests;

    /**
     * <p>
     * The resource's ability to automatically decline any conflicting requests.
     * </p>
     */
    private Boolean autoDeclineConflictingRequests;

    /**
     * <p>
     * The resource's ability to automatically reply to requests. If disabled,
     * delegates must be associated to the resource.
     * </p>
     *
     * @return <p>
     *         The resource's ability to automatically reply to requests. If
     *         disabled, delegates must be associated to the resource.
     *         </p>
     */
    public Boolean isAutoAcceptRequests() {
        return autoAcceptRequests;
    }

    /**
     * <p>
     * The resource's ability to automatically reply to requests. If disabled,
     * delegates must be associated to the resource.
     * </p>
     *
     * @return <p>
     *         The resource's ability to automatically reply to requests. If
     *         disabled, delegates must be associated to the resource.
     *         </p>
     */
    public Boolean getAutoAcceptRequests() {
        return autoAcceptRequests;
    }

    /**
     * <p>
     * The resource's ability to automatically reply to requests. If disabled,
     * delegates must be associated to the resource.
     * </p>
     *
     * @param autoAcceptRequests <p>
     *            The resource's ability to automatically reply to requests. If
     *            disabled, delegates must be associated to the resource.
     *            </p>
     */
    public void setAutoAcceptRequests(Boolean autoAcceptRequests) {
        this.autoAcceptRequests = autoAcceptRequests;
    }

    /**
     * <p>
     * The resource's ability to automatically reply to requests. If disabled,
     * delegates must be associated to the resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param autoAcceptRequests <p>
     *            The resource's ability to automatically reply to requests. If
     *            disabled, delegates must be associated to the resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BookingOptions withAutoAcceptRequests(Boolean autoAcceptRequests) {
        this.autoAcceptRequests = autoAcceptRequests;
        return this;
    }

    /**
     * <p>
     * The resource's ability to automatically decline any recurring requests.
     * </p>
     *
     * @return <p>
     *         The resource's ability to automatically decline any recurring
     *         requests.
     *         </p>
     */
    public Boolean isAutoDeclineRecurringRequests() {
        return autoDeclineRecurringRequests;
    }

    /**
     * <p>
     * The resource's ability to automatically decline any recurring requests.
     * </p>
     *
     * @return <p>
     *         The resource's ability to automatically decline any recurring
     *         requests.
     *         </p>
     */
    public Boolean getAutoDeclineRecurringRequests() {
        return autoDeclineRecurringRequests;
    }

    /**
     * <p>
     * The resource's ability to automatically decline any recurring requests.
     * </p>
     *
     * @param autoDeclineRecurringRequests <p>
     *            The resource's ability to automatically decline any recurring
     *            requests.
     *            </p>
     */
    public void setAutoDeclineRecurringRequests(Boolean autoDeclineRecurringRequests) {
        this.autoDeclineRecurringRequests = autoDeclineRecurringRequests;
    }

    /**
     * <p>
     * The resource's ability to automatically decline any recurring requests.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param autoDeclineRecurringRequests <p>
     *            The resource's ability to automatically decline any recurring
     *            requests.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BookingOptions withAutoDeclineRecurringRequests(Boolean autoDeclineRecurringRequests) {
        this.autoDeclineRecurringRequests = autoDeclineRecurringRequests;
        return this;
    }

    /**
     * <p>
     * The resource's ability to automatically decline any conflicting requests.
     * </p>
     *
     * @return <p>
     *         The resource's ability to automatically decline any conflicting
     *         requests.
     *         </p>
     */
    public Boolean isAutoDeclineConflictingRequests() {
        return autoDeclineConflictingRequests;
    }

    /**
     * <p>
     * The resource's ability to automatically decline any conflicting requests.
     * </p>
     *
     * @return <p>
     *         The resource's ability to automatically decline any conflicting
     *         requests.
     *         </p>
     */
    public Boolean getAutoDeclineConflictingRequests() {
        return autoDeclineConflictingRequests;
    }

    /**
     * <p>
     * The resource's ability to automatically decline any conflicting requests.
     * </p>
     *
     * @param autoDeclineConflictingRequests <p>
     *            The resource's ability to automatically decline any
     *            conflicting requests.
     *            </p>
     */
    public void setAutoDeclineConflictingRequests(Boolean autoDeclineConflictingRequests) {
        this.autoDeclineConflictingRequests = autoDeclineConflictingRequests;
    }

    /**
     * <p>
     * The resource's ability to automatically decline any conflicting requests.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param autoDeclineConflictingRequests <p>
     *            The resource's ability to automatically decline any
     *            conflicting requests.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BookingOptions withAutoDeclineConflictingRequests(Boolean autoDeclineConflictingRequests) {
        this.autoDeclineConflictingRequests = autoDeclineConflictingRequests;
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
        if (getAutoAcceptRequests() != null)
            sb.append("AutoAcceptRequests: " + getAutoAcceptRequests() + ",");
        if (getAutoDeclineRecurringRequests() != null)
            sb.append("AutoDeclineRecurringRequests: " + getAutoDeclineRecurringRequests() + ",");
        if (getAutoDeclineConflictingRequests() != null)
            sb.append("AutoDeclineConflictingRequests: " + getAutoDeclineConflictingRequests());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAutoAcceptRequests() == null) ? 0 : getAutoAcceptRequests().hashCode());
        hashCode = prime
                * hashCode
                + ((getAutoDeclineRecurringRequests() == null) ? 0
                        : getAutoDeclineRecurringRequests().hashCode());
        hashCode = prime
                * hashCode
                + ((getAutoDeclineConflictingRequests() == null) ? 0
                        : getAutoDeclineConflictingRequests().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BookingOptions == false)
            return false;
        BookingOptions other = (BookingOptions) obj;

        if (other.getAutoAcceptRequests() == null ^ this.getAutoAcceptRequests() == null)
            return false;
        if (other.getAutoAcceptRequests() != null
                && other.getAutoAcceptRequests().equals(this.getAutoAcceptRequests()) == false)
            return false;
        if (other.getAutoDeclineRecurringRequests() == null
                ^ this.getAutoDeclineRecurringRequests() == null)
            return false;
        if (other.getAutoDeclineRecurringRequests() != null
                && other.getAutoDeclineRecurringRequests().equals(
                        this.getAutoDeclineRecurringRequests()) == false)
            return false;
        if (other.getAutoDeclineConflictingRequests() == null
                ^ this.getAutoDeclineConflictingRequests() == null)
            return false;
        if (other.getAutoDeclineConflictingRequests() != null
                && other.getAutoDeclineConflictingRequests().equals(
                        this.getAutoDeclineConflictingRequests()) == false)
            return false;
        return true;
    }
}
