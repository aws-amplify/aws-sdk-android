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

package com.amazonaws.services.amazonfrauddetector.model;

import java.io.Serializable;

public class GetOutcomesResult implements Serializable {
    /**
     * <p>
     * The outcomes.
     * </p>
     */
    private java.util.List<Outcome> outcomes;

    /**
     * <p>
     * The next page token for subsequent requests.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The outcomes.
     * </p>
     *
     * @return <p>
     *         The outcomes.
     *         </p>
     */
    public java.util.List<Outcome> getOutcomes() {
        return outcomes;
    }

    /**
     * <p>
     * The outcomes.
     * </p>
     *
     * @param outcomes <p>
     *            The outcomes.
     *            </p>
     */
    public void setOutcomes(java.util.Collection<Outcome> outcomes) {
        if (outcomes == null) {
            this.outcomes = null;
            return;
        }

        this.outcomes = new java.util.ArrayList<Outcome>(outcomes);
    }

    /**
     * <p>
     * The outcomes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param outcomes <p>
     *            The outcomes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetOutcomesResult withOutcomes(Outcome... outcomes) {
        if (getOutcomes() == null) {
            this.outcomes = new java.util.ArrayList<Outcome>(outcomes.length);
        }
        for (Outcome value : outcomes) {
            this.outcomes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The outcomes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param outcomes <p>
     *            The outcomes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetOutcomesResult withOutcomes(java.util.Collection<Outcome> outcomes) {
        setOutcomes(outcomes);
        return this;
    }

    /**
     * <p>
     * The next page token for subsequent requests.
     * </p>
     *
     * @return <p>
     *         The next page token for subsequent requests.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The next page token for subsequent requests.
     * </p>
     *
     * @param nextToken <p>
     *            The next page token for subsequent requests.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The next page token for subsequent requests.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The next page token for subsequent requests.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetOutcomesResult withNextToken(String nextToken) {
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
        if (getOutcomes() != null)
            sb.append("outcomes: " + getOutcomes() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOutcomes() == null) ? 0 : getOutcomes().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetOutcomesResult == false)
            return false;
        GetOutcomesResult other = (GetOutcomesResult) obj;

        if (other.getOutcomes() == null ^ this.getOutcomes() == null)
            return false;
        if (other.getOutcomes() != null && other.getOutcomes().equals(this.getOutcomes()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
