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

package com.amazonaws.services.awsglue.model;

import java.io.Serializable;

public class GetUserDefinedFunctionsResult implements Serializable {
    /**
     * <p>
     * A list of requested function definitions.
     * </p>
     */
    private java.util.List<UserDefinedFunction> userDefinedFunctions;

    /**
     * <p>
     * A continuation token, if the list of functions returned does not include
     * the last requested function.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of requested function definitions.
     * </p>
     *
     * @return <p>
     *         A list of requested function definitions.
     *         </p>
     */
    public java.util.List<UserDefinedFunction> getUserDefinedFunctions() {
        return userDefinedFunctions;
    }

    /**
     * <p>
     * A list of requested function definitions.
     * </p>
     *
     * @param userDefinedFunctions <p>
     *            A list of requested function definitions.
     *            </p>
     */
    public void setUserDefinedFunctions(
            java.util.Collection<UserDefinedFunction> userDefinedFunctions) {
        if (userDefinedFunctions == null) {
            this.userDefinedFunctions = null;
            return;
        }

        this.userDefinedFunctions = new java.util.ArrayList<UserDefinedFunction>(
                userDefinedFunctions);
    }

    /**
     * <p>
     * A list of requested function definitions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userDefinedFunctions <p>
     *            A list of requested function definitions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetUserDefinedFunctionsResult withUserDefinedFunctions(
            UserDefinedFunction... userDefinedFunctions) {
        if (getUserDefinedFunctions() == null) {
            this.userDefinedFunctions = new java.util.ArrayList<UserDefinedFunction>(
                    userDefinedFunctions.length);
        }
        for (UserDefinedFunction value : userDefinedFunctions) {
            this.userDefinedFunctions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of requested function definitions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userDefinedFunctions <p>
     *            A list of requested function definitions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetUserDefinedFunctionsResult withUserDefinedFunctions(
            java.util.Collection<UserDefinedFunction> userDefinedFunctions) {
        setUserDefinedFunctions(userDefinedFunctions);
        return this;
    }

    /**
     * <p>
     * A continuation token, if the list of functions returned does not include
     * the last requested function.
     * </p>
     *
     * @return <p>
     *         A continuation token, if the list of functions returned does not
     *         include the last requested function.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A continuation token, if the list of functions returned does not include
     * the last requested function.
     * </p>
     *
     * @param nextToken <p>
     *            A continuation token, if the list of functions returned does
     *            not include the last requested function.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A continuation token, if the list of functions returned does not include
     * the last requested function.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            A continuation token, if the list of functions returned does
     *            not include the last requested function.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetUserDefinedFunctionsResult withNextToken(String nextToken) {
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
        if (getUserDefinedFunctions() != null)
            sb.append("UserDefinedFunctions: " + getUserDefinedFunctions() + ",");
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
                + ((getUserDefinedFunctions() == null) ? 0 : getUserDefinedFunctions().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetUserDefinedFunctionsResult == false)
            return false;
        GetUserDefinedFunctionsResult other = (GetUserDefinedFunctionsResult) obj;

        if (other.getUserDefinedFunctions() == null ^ this.getUserDefinedFunctions() == null)
            return false;
        if (other.getUserDefinedFunctions() != null
                && other.getUserDefinedFunctions().equals(this.getUserDefinedFunctions()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
