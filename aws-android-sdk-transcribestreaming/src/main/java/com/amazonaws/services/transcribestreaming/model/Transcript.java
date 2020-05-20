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

package com.amazonaws.services.transcribestreaming.model;

import java.io.Serializable;

/**
 * <p>
 * The transcription in a <a>TranscriptEvent</a>.
 * </p>
 */
public class Transcript implements Serializable {
    /**
     * <p>
     * <a>Result</a> objects that contain the results of transcribing a portion
     * of the input audio stream. The array can be empty.
     * </p>
     */
    private java.util.List<Result> results;

    /**
     * <p>
     * <a>Result</a> objects that contain the results of transcribing a portion
     * of the input audio stream. The array can be empty.
     * </p>
     *
     * @return <p>
     *         <a>Result</a> objects that contain the results of transcribing a
     *         portion of the input audio stream. The array can be empty.
     *         </p>
     */
    public java.util.List<Result> getResults() {
        return results;
    }

    /**
     * <p>
     * <a>Result</a> objects that contain the results of transcribing a portion
     * of the input audio stream. The array can be empty.
     * </p>
     *
     * @param results <p>
     *            <a>Result</a> objects that contain the results of transcribing
     *            a portion of the input audio stream. The array can be empty.
     *            </p>
     */
    public void setResults(java.util.Collection<Result> results) {
        if (results == null) {
            this.results = null;
            return;
        }

        this.results = new java.util.ArrayList<Result>(results);
    }

    /**
     * <p>
     * <a>Result</a> objects that contain the results of transcribing a portion
     * of the input audio stream. The array can be empty.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param results <p>
     *            <a>Result</a> objects that contain the results of transcribing
     *            a portion of the input audio stream. The array can be empty.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Transcript withResults(Result... results) {
        if (getResults() == null) {
            this.results = new java.util.ArrayList<Result>(results.length);
        }
        for (Result value : results) {
            this.results.add(value);
        }
        return this;
    }

    /**
     * <p>
     * <a>Result</a> objects that contain the results of transcribing a portion
     * of the input audio stream. The array can be empty.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param results <p>
     *            <a>Result</a> objects that contain the results of transcribing
     *            a portion of the input audio stream. The array can be empty.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Transcript withResults(java.util.Collection<Result> results) {
        setResults(results);
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
        if (getResults() != null)
            sb.append("Results: " + getResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResults() == null) ? 0 : getResults().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Transcript == false)
            return false;
        Transcript other = (Transcript) obj;

        if (other.getResults() == null ^ this.getResults() == null)
            return false;
        if (other.getResults() != null && other.getResults().equals(this.getResults()) == false)
            return false;
        return true;
    }
}
