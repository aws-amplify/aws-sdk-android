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

package com.amazonaws.services.macie2.model;

import java.io.Serializable;

public class TestCustomDataIdentifierResult implements Serializable {
    /**
     * <p>
     * The number of instances of sample text that matched the detection
     * criteria specified in the custom data identifier.
     * </p>
     */
    private Integer matchCount;

    /**
     * <p>
     * The number of instances of sample text that matched the detection
     * criteria specified in the custom data identifier.
     * </p>
     *
     * @return <p>
     *         The number of instances of sample text that matched the detection
     *         criteria specified in the custom data identifier.
     *         </p>
     */
    public Integer getMatchCount() {
        return matchCount;
    }

    /**
     * <p>
     * The number of instances of sample text that matched the detection
     * criteria specified in the custom data identifier.
     * </p>
     *
     * @param matchCount <p>
     *            The number of instances of sample text that matched the
     *            detection criteria specified in the custom data identifier.
     *            </p>
     */
    public void setMatchCount(Integer matchCount) {
        this.matchCount = matchCount;
    }

    /**
     * <p>
     * The number of instances of sample text that matched the detection
     * criteria specified in the custom data identifier.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param matchCount <p>
     *            The number of instances of sample text that matched the
     *            detection criteria specified in the custom data identifier.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TestCustomDataIdentifierResult withMatchCount(Integer matchCount) {
        this.matchCount = matchCount;
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
        if (getMatchCount() != null)
            sb.append("matchCount: " + getMatchCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMatchCount() == null) ? 0 : getMatchCount().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TestCustomDataIdentifierResult == false)
            return false;
        TestCustomDataIdentifierResult other = (TestCustomDataIdentifierResult) obj;

        if (other.getMatchCount() == null ^ this.getMatchCount() == null)
            return false;
        if (other.getMatchCount() != null
                && other.getMatchCount().equals(this.getMatchCount()) == false)
            return false;
        return true;
    }
}
