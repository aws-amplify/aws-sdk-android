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
public class GetAnalyzerResult implements Serializable {
    /**
     * <p>
     * An <code>AnalyzerSummary</code> object that contains information about
     * the analyzer.
     * </p>
     */
    private AnalyzerSummary analyzer;

    /**
     * <p>
     * An <code>AnalyzerSummary</code> object that contains information about
     * the analyzer.
     * </p>
     *
     * @return <p>
     *         An <code>AnalyzerSummary</code> object that contains information
     *         about the analyzer.
     *         </p>
     */
    public AnalyzerSummary getAnalyzer() {
        return analyzer;
    }

    /**
     * <p>
     * An <code>AnalyzerSummary</code> object that contains information about
     * the analyzer.
     * </p>
     *
     * @param analyzer <p>
     *            An <code>AnalyzerSummary</code> object that contains
     *            information about the analyzer.
     *            </p>
     */
    public void setAnalyzer(AnalyzerSummary analyzer) {
        this.analyzer = analyzer;
    }

    /**
     * <p>
     * An <code>AnalyzerSummary</code> object that contains information about
     * the analyzer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param analyzer <p>
     *            An <code>AnalyzerSummary</code> object that contains
     *            information about the analyzer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetAnalyzerResult withAnalyzer(AnalyzerSummary analyzer) {
        this.analyzer = analyzer;
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
        if (getAnalyzer() != null)
            sb.append("analyzer: " + getAnalyzer());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAnalyzer() == null) ? 0 : getAnalyzer().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAnalyzerResult == false)
            return false;
        GetAnalyzerResult other = (GetAnalyzerResult) obj;

        if (other.getAnalyzer() == null ^ this.getAnalyzer() == null)
            return false;
        if (other.getAnalyzer() != null && other.getAnalyzer().equals(this.getAnalyzer()) == false)
            return false;
        return true;
    }
}
