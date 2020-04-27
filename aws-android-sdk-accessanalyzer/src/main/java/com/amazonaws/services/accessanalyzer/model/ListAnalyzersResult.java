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

package com.amazonaws.services.accessanalyzer.model;

import java.io.Serializable;

/**
 * <p>
 * The response to the request.
 * </p>
 */
public class ListAnalyzersResult implements Serializable {
    /**
     * <p>
     * The analyzers retrieved.
     * </p>
     */
    private java.util.List<AnalyzerSummary> analyzers;

    /**
     * <p>
     * A token used for pagination of results returned.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The analyzers retrieved.
     * </p>
     *
     * @return <p>
     *         The analyzers retrieved.
     *         </p>
     */
    public java.util.List<AnalyzerSummary> getAnalyzers() {
        return analyzers;
    }

    /**
     * <p>
     * The analyzers retrieved.
     * </p>
     *
     * @param analyzers <p>
     *            The analyzers retrieved.
     *            </p>
     */
    public void setAnalyzers(java.util.Collection<AnalyzerSummary> analyzers) {
        if (analyzers == null) {
            this.analyzers = null;
            return;
        }

        this.analyzers = new java.util.ArrayList<AnalyzerSummary>(analyzers);
    }

    /**
     * <p>
     * The analyzers retrieved.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param analyzers <p>
     *            The analyzers retrieved.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAnalyzersResult withAnalyzers(AnalyzerSummary... analyzers) {
        if (getAnalyzers() == null) {
            this.analyzers = new java.util.ArrayList<AnalyzerSummary>(analyzers.length);
        }
        for (AnalyzerSummary value : analyzers) {
            this.analyzers.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The analyzers retrieved.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param analyzers <p>
     *            The analyzers retrieved.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAnalyzersResult withAnalyzers(java.util.Collection<AnalyzerSummary> analyzers) {
        setAnalyzers(analyzers);
        return this;
    }

    /**
     * <p>
     * A token used for pagination of results returned.
     * </p>
     *
     * @return <p>
     *         A token used for pagination of results returned.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A token used for pagination of results returned.
     * </p>
     *
     * @param nextToken <p>
     *            A token used for pagination of results returned.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token used for pagination of results returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            A token used for pagination of results returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAnalyzersResult withNextToken(String nextToken) {
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
        if (getAnalyzers() != null)
            sb.append("analyzers: " + getAnalyzers() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAnalyzers() == null) ? 0 : getAnalyzers().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAnalyzersResult == false)
            return false;
        ListAnalyzersResult other = (ListAnalyzersResult) obj;

        if (other.getAnalyzers() == null ^ this.getAnalyzers() == null)
            return false;
        if (other.getAnalyzers() != null
                && other.getAnalyzers().equals(this.getAnalyzers()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
