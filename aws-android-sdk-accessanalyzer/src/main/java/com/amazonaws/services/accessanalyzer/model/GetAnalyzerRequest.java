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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Retrieves information about the specified analyzer.
 * </p>
 */
public class GetAnalyzerRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the analyzer retrieved.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^[A-Za-z][A-Za-z0-9_.-]*$<br/>
     */
    private String analyzerName;

    /**
     * <p>
     * The name of the analyzer retrieved.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^[A-Za-z][A-Za-z0-9_.-]*$<br/>
     *
     * @return <p>
     *         The name of the analyzer retrieved.
     *         </p>
     */
    public String getAnalyzerName() {
        return analyzerName;
    }

    /**
     * <p>
     * The name of the analyzer retrieved.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^[A-Za-z][A-Za-z0-9_.-]*$<br/>
     *
     * @param analyzerName <p>
     *            The name of the analyzer retrieved.
     *            </p>
     */
    public void setAnalyzerName(String analyzerName) {
        this.analyzerName = analyzerName;
    }

    /**
     * <p>
     * The name of the analyzer retrieved.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^[A-Za-z][A-Za-z0-9_.-]*$<br/>
     *
     * @param analyzerName <p>
     *            The name of the analyzer retrieved.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetAnalyzerRequest withAnalyzerName(String analyzerName) {
        this.analyzerName = analyzerName;
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
        if (getAnalyzerName() != null)
            sb.append("analyzerName: " + getAnalyzerName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAnalyzerName() == null) ? 0 : getAnalyzerName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAnalyzerRequest == false)
            return false;
        GetAnalyzerRequest other = (GetAnalyzerRequest) obj;

        if (other.getAnalyzerName() == null ^ this.getAnalyzerName() == null)
            return false;
        if (other.getAnalyzerName() != null
                && other.getAnalyzerName().equals(this.getAnalyzerName()) == false)
            return false;
        return true;
    }
}
