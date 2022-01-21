/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

public class ListLambdaFunctionsResult implements Serializable {
    /**
     * <p>
     * The Lambdafunction ARNs associated with the specified instance.
     * </p>
     */
    private java.util.List<String> lambdaFunctions;

    /**
     * <p>
     * If there are additional results, this is the token for the next set of
     * results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The Lambdafunction ARNs associated with the specified instance.
     * </p>
     *
     * @return <p>
     *         The Lambdafunction ARNs associated with the specified instance.
     *         </p>
     */
    public java.util.List<String> getLambdaFunctions() {
        return lambdaFunctions;
    }

    /**
     * <p>
     * The Lambdafunction ARNs associated with the specified instance.
     * </p>
     *
     * @param lambdaFunctions <p>
     *            The Lambdafunction ARNs associated with the specified
     *            instance.
     *            </p>
     */
    public void setLambdaFunctions(java.util.Collection<String> lambdaFunctions) {
        if (lambdaFunctions == null) {
            this.lambdaFunctions = null;
            return;
        }

        this.lambdaFunctions = new java.util.ArrayList<String>(lambdaFunctions);
    }

    /**
     * <p>
     * The Lambdafunction ARNs associated with the specified instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lambdaFunctions <p>
     *            The Lambdafunction ARNs associated with the specified
     *            instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListLambdaFunctionsResult withLambdaFunctions(String... lambdaFunctions) {
        if (getLambdaFunctions() == null) {
            this.lambdaFunctions = new java.util.ArrayList<String>(lambdaFunctions.length);
        }
        for (String value : lambdaFunctions) {
            this.lambdaFunctions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The Lambdafunction ARNs associated with the specified instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lambdaFunctions <p>
     *            The Lambdafunction ARNs associated with the specified
     *            instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListLambdaFunctionsResult withLambdaFunctions(
            java.util.Collection<String> lambdaFunctions) {
        setLambdaFunctions(lambdaFunctions);
        return this;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of
     * results.
     * </p>
     *
     * @return <p>
     *         If there are additional results, this is the token for the next
     *         set of results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of
     * results.
     * </p>
     *
     * @param nextToken <p>
     *            If there are additional results, this is the token for the
     *            next set of results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of
     * results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            If there are additional results, this is the token for the
     *            next set of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListLambdaFunctionsResult withNextToken(String nextToken) {
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
        if (getLambdaFunctions() != null)
            sb.append("LambdaFunctions: " + getLambdaFunctions() + ",");
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
                + ((getLambdaFunctions() == null) ? 0 : getLambdaFunctions().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListLambdaFunctionsResult == false)
            return false;
        ListLambdaFunctionsResult other = (ListLambdaFunctionsResult) obj;

        if (other.getLambdaFunctions() == null ^ this.getLambdaFunctions() == null)
            return false;
        if (other.getLambdaFunctions() != null
                && other.getLambdaFunctions().equals(this.getLambdaFunctions()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
