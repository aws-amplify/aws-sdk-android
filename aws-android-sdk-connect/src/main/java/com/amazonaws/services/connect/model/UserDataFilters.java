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

/**
 * <p>
 * A filter for the user data.
 * </p>
 */
public class UserDataFilters implements Serializable {
    /**
     * <p>
     * Contains information about a queue resource for which metrics are
     * returned.
     * </p>
     */
    private java.util.List<String> queues;

    /**
     * <p>
     * A filter for the user data based on the contact information that is
     * associated to the user. It contains a list of contact states.
     * </p>
     */
    private ContactFilter contactFilter;

    /**
     * <p>
     * Contains information about a queue resource for which metrics are
     * returned.
     * </p>
     *
     * @return <p>
     *         Contains information about a queue resource for which metrics are
     *         returned.
     *         </p>
     */
    public java.util.List<String> getQueues() {
        return queues;
    }

    /**
     * <p>
     * Contains information about a queue resource for which metrics are
     * returned.
     * </p>
     *
     * @param queues <p>
     *            Contains information about a queue resource for which metrics
     *            are returned.
     *            </p>
     */
    public void setQueues(java.util.Collection<String> queues) {
        if (queues == null) {
            this.queues = null;
            return;
        }

        this.queues = new java.util.ArrayList<String>(queues);
    }

    /**
     * <p>
     * Contains information about a queue resource for which metrics are
     * returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param queues <p>
     *            Contains information about a queue resource for which metrics
     *            are returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserDataFilters withQueues(String... queues) {
        if (getQueues() == null) {
            this.queues = new java.util.ArrayList<String>(queues.length);
        }
        for (String value : queues) {
            this.queues.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Contains information about a queue resource for which metrics are
     * returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param queues <p>
     *            Contains information about a queue resource for which metrics
     *            are returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserDataFilters withQueues(java.util.Collection<String> queues) {
        setQueues(queues);
        return this;
    }

    /**
     * <p>
     * A filter for the user data based on the contact information that is
     * associated to the user. It contains a list of contact states.
     * </p>
     *
     * @return <p>
     *         A filter for the user data based on the contact information that
     *         is associated to the user. It contains a list of contact states.
     *         </p>
     */
    public ContactFilter getContactFilter() {
        return contactFilter;
    }

    /**
     * <p>
     * A filter for the user data based on the contact information that is
     * associated to the user. It contains a list of contact states.
     * </p>
     *
     * @param contactFilter <p>
     *            A filter for the user data based on the contact information
     *            that is associated to the user. It contains a list of contact
     *            states.
     *            </p>
     */
    public void setContactFilter(ContactFilter contactFilter) {
        this.contactFilter = contactFilter;
    }

    /**
     * <p>
     * A filter for the user data based on the contact information that is
     * associated to the user. It contains a list of contact states.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param contactFilter <p>
     *            A filter for the user data based on the contact information
     *            that is associated to the user. It contains a list of contact
     *            states.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserDataFilters withContactFilter(ContactFilter contactFilter) {
        this.contactFilter = contactFilter;
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
        if (getQueues() != null)
            sb.append("Queues: " + getQueues() + ",");
        if (getContactFilter() != null)
            sb.append("ContactFilter: " + getContactFilter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQueues() == null) ? 0 : getQueues().hashCode());
        hashCode = prime * hashCode
                + ((getContactFilter() == null) ? 0 : getContactFilter().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UserDataFilters == false)
            return false;
        UserDataFilters other = (UserDataFilters) obj;

        if (other.getQueues() == null ^ this.getQueues() == null)
            return false;
        if (other.getQueues() != null && other.getQueues().equals(this.getQueues()) == false)
            return false;
        if (other.getContactFilter() == null ^ this.getContactFilter() == null)
            return false;
        if (other.getContactFilter() != null
                && other.getContactFilter().equals(this.getContactFilter()) == false)
            return false;
        return true;
    }
}
