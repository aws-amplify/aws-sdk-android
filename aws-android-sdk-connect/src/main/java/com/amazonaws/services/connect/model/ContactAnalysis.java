/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * A structure that defines filters can be used to search within outputs
 * analyzed by Amazon Connect Contact Lens in a contact.
 * </p>
 */
public class ContactAnalysis implements Serializable {
    /**
     * <p>
     * A structure that defines filters can be used to search with text within
     * an Amazon Connect Contact Lens analyzed transcript.
     * </p>
     */
    private Transcript transcript;

    /**
     * <p>
     * A structure that defines filters can be used to search with text within
     * an Amazon Connect Contact Lens analyzed transcript.
     * </p>
     *
     * @return <p>
     *         A structure that defines filters can be used to search with text
     *         within an Amazon Connect Contact Lens analyzed transcript.
     *         </p>
     */
    public Transcript getTranscript() {
        return transcript;
    }

    /**
     * <p>
     * A structure that defines filters can be used to search with text within
     * an Amazon Connect Contact Lens analyzed transcript.
     * </p>
     *
     * @param transcript <p>
     *            A structure that defines filters can be used to search with
     *            text within an Amazon Connect Contact Lens analyzed
     *            transcript.
     *            </p>
     */
    public void setTranscript(Transcript transcript) {
        this.transcript = transcript;
    }

    /**
     * <p>
     * A structure that defines filters can be used to search with text within
     * an Amazon Connect Contact Lens analyzed transcript.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param transcript <p>
     *            A structure that defines filters can be used to search with
     *            text within an Amazon Connect Contact Lens analyzed
     *            transcript.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContactAnalysis withTranscript(Transcript transcript) {
        this.transcript = transcript;
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
        if (getTranscript() != null)
            sb.append("Transcript: " + getTranscript());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTranscript() == null) ? 0 : getTranscript().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ContactAnalysis == false)
            return false;
        ContactAnalysis other = (ContactAnalysis) obj;

        if (other.getTranscript() == null ^ this.getTranscript() == null)
            return false;
        if (other.getTranscript() != null
                && other.getTranscript().equals(this.getTranscript()) == false)
            return false;
        return true;
    }
}
