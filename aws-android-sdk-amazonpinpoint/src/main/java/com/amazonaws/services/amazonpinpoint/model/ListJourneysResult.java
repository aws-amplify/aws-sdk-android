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

package com.amazonaws.services.amazonpinpoint.model;

import java.io.Serializable;

public class ListJourneysResult implements Serializable {
    /**
     * <p>
     * Provides information about the status, configuration, and other settings
     * for all the journeys that are associated with an application.
     * </p>
     */
    private JourneysResponse journeysResponse;

    /**
     * <p>
     * Provides information about the status, configuration, and other settings
     * for all the journeys that are associated with an application.
     * </p>
     *
     * @return <p>
     *         Provides information about the status, configuration, and other
     *         settings for all the journeys that are associated with an
     *         application.
     *         </p>
     */
    public JourneysResponse getJourneysResponse() {
        return journeysResponse;
    }

    /**
     * <p>
     * Provides information about the status, configuration, and other settings
     * for all the journeys that are associated with an application.
     * </p>
     *
     * @param journeysResponse <p>
     *            Provides information about the status, configuration, and
     *            other settings for all the journeys that are associated with
     *            an application.
     *            </p>
     */
    public void setJourneysResponse(JourneysResponse journeysResponse) {
        this.journeysResponse = journeysResponse;
    }

    /**
     * <p>
     * Provides information about the status, configuration, and other settings
     * for all the journeys that are associated with an application.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param journeysResponse <p>
     *            Provides information about the status, configuration, and
     *            other settings for all the journeys that are associated with
     *            an application.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListJourneysResult withJourneysResponse(JourneysResponse journeysResponse) {
        this.journeysResponse = journeysResponse;
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
        if (getJourneysResponse() != null)
            sb.append("JourneysResponse: " + getJourneysResponse());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getJourneysResponse() == null) ? 0 : getJourneysResponse().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListJourneysResult == false)
            return false;
        ListJourneysResult other = (ListJourneysResult) obj;

        if (other.getJourneysResponse() == null ^ this.getJourneysResponse() == null)
            return false;
        if (other.getJourneysResponse() != null
                && other.getJourneysResponse().equals(this.getJourneysResponse()) == false)
            return false;
        return true;
    }
}
