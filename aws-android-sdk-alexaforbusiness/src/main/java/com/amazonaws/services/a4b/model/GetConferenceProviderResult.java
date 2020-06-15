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

public class GetConferenceProviderResult implements Serializable {
    /**
     * <p>
     * The conference provider.
     * </p>
     */
    private ConferenceProvider conferenceProvider;

    /**
     * <p>
     * The conference provider.
     * </p>
     *
     * @return <p>
     *         The conference provider.
     *         </p>
     */
    public ConferenceProvider getConferenceProvider() {
        return conferenceProvider;
    }

    /**
     * <p>
     * The conference provider.
     * </p>
     *
     * @param conferenceProvider <p>
     *            The conference provider.
     *            </p>
     */
    public void setConferenceProvider(ConferenceProvider conferenceProvider) {
        this.conferenceProvider = conferenceProvider;
    }

    /**
     * <p>
     * The conference provider.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param conferenceProvider <p>
     *            The conference provider.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetConferenceProviderResult withConferenceProvider(ConferenceProvider conferenceProvider) {
        this.conferenceProvider = conferenceProvider;
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
        if (getConferenceProvider() != null)
            sb.append("ConferenceProvider: " + getConferenceProvider());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getConferenceProvider() == null) ? 0 : getConferenceProvider().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetConferenceProviderResult == false)
            return false;
        GetConferenceProviderResult other = (GetConferenceProviderResult) obj;

        if (other.getConferenceProvider() == null ^ this.getConferenceProvider() == null)
            return false;
        if (other.getConferenceProvider() != null
                && other.getConferenceProvider().equals(this.getConferenceProvider()) == false)
            return false;
        return true;
    }
}
