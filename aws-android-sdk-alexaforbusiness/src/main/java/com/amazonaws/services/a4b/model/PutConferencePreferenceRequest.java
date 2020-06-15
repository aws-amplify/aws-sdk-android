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

package com.amazonaws.services.a4b.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Sets the conference preferences on a specific conference provider at the
 * account level.
 * </p>
 */
public class PutConferencePreferenceRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The conference preference of a specific conference provider.
     * </p>
     */
    private ConferencePreference conferencePreference;

    /**
     * <p>
     * The conference preference of a specific conference provider.
     * </p>
     *
     * @return <p>
     *         The conference preference of a specific conference provider.
     *         </p>
     */
    public ConferencePreference getConferencePreference() {
        return conferencePreference;
    }

    /**
     * <p>
     * The conference preference of a specific conference provider.
     * </p>
     *
     * @param conferencePreference <p>
     *            The conference preference of a specific conference provider.
     *            </p>
     */
    public void setConferencePreference(ConferencePreference conferencePreference) {
        this.conferencePreference = conferencePreference;
    }

    /**
     * <p>
     * The conference preference of a specific conference provider.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param conferencePreference <p>
     *            The conference preference of a specific conference provider.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutConferencePreferenceRequest withConferencePreference(
            ConferencePreference conferencePreference) {
        this.conferencePreference = conferencePreference;
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
        if (getConferencePreference() != null)
            sb.append("ConferencePreference: " + getConferencePreference());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getConferencePreference() == null) ? 0 : getConferencePreference().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutConferencePreferenceRequest == false)
            return false;
        PutConferencePreferenceRequest other = (PutConferencePreferenceRequest) obj;

        if (other.getConferencePreference() == null ^ this.getConferencePreference() == null)
            return false;
        if (other.getConferencePreference() != null
                && other.getConferencePreference().equals(this.getConferencePreference()) == false)
            return false;
        return true;
    }
}
