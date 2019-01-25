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

package com.amazonaws.services.polly.model;

import java.io.Serializable;

public class ListSpeechSynthesisTasksResult implements Serializable {
    /**
     * <p>
     * An opaque pagination token returned from the previous List operation in
     * this request. If present, this indicates where to continue the listing.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * List of SynthesisTask objects that provides information from the
     * specified task in the list request, including output format, creation
     * time, task status, and so on.
     * </p>
     */
    private java.util.List<SynthesisTask> synthesisTasks;

    /**
     * <p>
     * An opaque pagination token returned from the previous List operation in
     * this request. If present, this indicates where to continue the listing.
     * </p>
     *
     * @return <p>
     *         An opaque pagination token returned from the previous List
     *         operation in this request. If present, this indicates where to
     *         continue the listing.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * An opaque pagination token returned from the previous List operation in
     * this request. If present, this indicates where to continue the listing.
     * </p>
     *
     * @param nextToken <p>
     *            An opaque pagination token returned from the previous List
     *            operation in this request. If present, this indicates where to
     *            continue the listing.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An opaque pagination token returned from the previous List operation in
     * this request. If present, this indicates where to continue the listing.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            An opaque pagination token returned from the previous List
     *            operation in this request. If present, this indicates where to
     *            continue the listing.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListSpeechSynthesisTasksResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * List of SynthesisTask objects that provides information from the
     * specified task in the list request, including output format, creation
     * time, task status, and so on.
     * </p>
     *
     * @return <p>
     *         List of SynthesisTask objects that provides information from the
     *         specified task in the list request, including output format,
     *         creation time, task status, and so on.
     *         </p>
     */
    public java.util.List<SynthesisTask> getSynthesisTasks() {
        return synthesisTasks;
    }

    /**
     * <p>
     * List of SynthesisTask objects that provides information from the
     * specified task in the list request, including output format, creation
     * time, task status, and so on.
     * </p>
     *
     * @param synthesisTasks <p>
     *            List of SynthesisTask objects that provides information from
     *            the specified task in the list request, including output
     *            format, creation time, task status, and so on.
     *            </p>
     */
    public void setSynthesisTasks(java.util.Collection<SynthesisTask> synthesisTasks) {
        if (synthesisTasks == null) {
            this.synthesisTasks = null;
            return;
        }

        this.synthesisTasks = new java.util.ArrayList<SynthesisTask>(synthesisTasks);
    }

    /**
     * <p>
     * List of SynthesisTask objects that provides information from the
     * specified task in the list request, including output format, creation
     * time, task status, and so on.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param synthesisTasks <p>
     *            List of SynthesisTask objects that provides information from
     *            the specified task in the list request, including output
     *            format, creation time, task status, and so on.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListSpeechSynthesisTasksResult withSynthesisTasks(SynthesisTask... synthesisTasks) {
        if (getSynthesisTasks() == null) {
            this.synthesisTasks = new java.util.ArrayList<SynthesisTask>(synthesisTasks.length);
        }
        for (SynthesisTask value : synthesisTasks) {
            this.synthesisTasks.add(value);
        }
        return this;
    }

    /**
     * <p>
     * List of SynthesisTask objects that provides information from the
     * specified task in the list request, including output format, creation
     * time, task status, and so on.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param synthesisTasks <p>
     *            List of SynthesisTask objects that provides information from
     *            the specified task in the list request, including output
     *            format, creation time, task status, and so on.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListSpeechSynthesisTasksResult withSynthesisTasks(
            java.util.Collection<SynthesisTask> synthesisTasks) {
        setSynthesisTasks(synthesisTasks);
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
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getSynthesisTasks() != null)
            sb.append("SynthesisTasks: " + getSynthesisTasks());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode
                + ((getSynthesisTasks() == null) ? 0 : getSynthesisTasks().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListSpeechSynthesisTasksResult == false)
            return false;
        ListSpeechSynthesisTasksResult other = (ListSpeechSynthesisTasksResult) obj;

        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getSynthesisTasks() == null ^ this.getSynthesisTasks() == null)
            return false;
        if (other.getSynthesisTasks() != null
                && other.getSynthesisTasks().equals(this.getSynthesisTasks()) == false)
            return false;
        return true;
    }
}
