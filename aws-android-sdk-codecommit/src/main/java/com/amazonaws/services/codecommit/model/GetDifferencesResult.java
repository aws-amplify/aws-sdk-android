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

package com.amazonaws.services.codecommit.model;

import java.io.Serializable;

public class GetDifferencesResult implements Serializable {
    /**
     * <p>
     * A data type object that contains information about the differences,
     * including whether the difference is added, modified, or deleted (A, D,
     * M).
     * </p>
     */
    private java.util.List<Difference> differences;

    /**
     * <p>
     * An enumeration token that can be used in a request to return the next
     * batch of the results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A data type object that contains information about the differences,
     * including whether the difference is added, modified, or deleted (A, D,
     * M).
     * </p>
     *
     * @return <p>
     *         A data type object that contains information about the
     *         differences, including whether the difference is added, modified,
     *         or deleted (A, D, M).
     *         </p>
     */
    public java.util.List<Difference> getDifferences() {
        return differences;
    }

    /**
     * <p>
     * A data type object that contains information about the differences,
     * including whether the difference is added, modified, or deleted (A, D,
     * M).
     * </p>
     *
     * @param differences <p>
     *            A data type object that contains information about the
     *            differences, including whether the difference is added,
     *            modified, or deleted (A, D, M).
     *            </p>
     */
    public void setDifferences(java.util.Collection<Difference> differences) {
        if (differences == null) {
            this.differences = null;
            return;
        }

        this.differences = new java.util.ArrayList<Difference>(differences);
    }

    /**
     * <p>
     * A data type object that contains information about the differences,
     * including whether the difference is added, modified, or deleted (A, D,
     * M).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param differences <p>
     *            A data type object that contains information about the
     *            differences, including whether the difference is added,
     *            modified, or deleted (A, D, M).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDifferencesResult withDifferences(Difference... differences) {
        if (getDifferences() == null) {
            this.differences = new java.util.ArrayList<Difference>(differences.length);
        }
        for (Difference value : differences) {
            this.differences.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A data type object that contains information about the differences,
     * including whether the difference is added, modified, or deleted (A, D,
     * M).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param differences <p>
     *            A data type object that contains information about the
     *            differences, including whether the difference is added,
     *            modified, or deleted (A, D, M).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDifferencesResult withDifferences(java.util.Collection<Difference> differences) {
        setDifferences(differences);
        return this;
    }

    /**
     * <p>
     * An enumeration token that can be used in a request to return the next
     * batch of the results.
     * </p>
     *
     * @return <p>
     *         An enumeration token that can be used in a request to return the
     *         next batch of the results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * An enumeration token that can be used in a request to return the next
     * batch of the results.
     * </p>
     *
     * @param nextToken <p>
     *            An enumeration token that can be used in a request to return
     *            the next batch of the results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An enumeration token that can be used in a request to return the next
     * batch of the results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            An enumeration token that can be used in a request to return
     *            the next batch of the results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDifferencesResult withNextToken(String nextToken) {
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
        if (getDifferences() != null)
            sb.append("differences: " + getDifferences() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDifferences() == null) ? 0 : getDifferences().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDifferencesResult == false)
            return false;
        GetDifferencesResult other = (GetDifferencesResult) obj;

        if (other.getDifferences() == null ^ this.getDifferences() == null)
            return false;
        if (other.getDifferences() != null
                && other.getDifferences().equals(this.getDifferences()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
