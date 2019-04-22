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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns a list of pronunciation lexicons stored in an AWS Region. For more
 * information, see <a
 * href="http://docs.aws.amazon.com/polly/latest/dg/managing-lexicons.html"
 * >Managing Lexicons</a>.
 * </p>
 */
public class ListLexiconsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * An opaque pagination token returned from previous
     * <code>ListLexicons</code> operation. If present, indicates where to
     * continue the list of lexicons.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 4096<br/>
     */
    private String nextToken;

    /**
     * <p>
     * An opaque pagination token returned from previous
     * <code>ListLexicons</code> operation. If present, indicates where to
     * continue the list of lexicons.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 4096<br/>
     *
     * @return <p>
     *         An opaque pagination token returned from previous
     *         <code>ListLexicons</code> operation. If present, indicates where
     *         to continue the list of lexicons.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * An opaque pagination token returned from previous
     * <code>ListLexicons</code> operation. If present, indicates where to
     * continue the list of lexicons.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 4096<br/>
     *
     * @param nextToken <p>
     *            An opaque pagination token returned from previous
     *            <code>ListLexicons</code> operation. If present, indicates
     *            where to continue the list of lexicons.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An opaque pagination token returned from previous
     * <code>ListLexicons</code> operation. If present, indicates where to
     * continue the list of lexicons.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 4096<br/>
     *
     * @param nextToken <p>
     *            An opaque pagination token returned from previous
     *            <code>ListLexicons</code> operation. If present, indicates
     *            where to continue the list of lexicons.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListLexiconsRequest withNextToken(String nextToken) {
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
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListLexiconsRequest == false)
            return false;
        ListLexiconsRequest other = (ListLexiconsRequest) obj;

        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
