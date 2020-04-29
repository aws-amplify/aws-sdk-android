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

package com.amazonaws.services.awswafregional.model;

import java.io.Serializable;

public class ListRegexPatternSetsResult implements Serializable {
    /**
     * <p>
     * If you have more <code>RegexPatternSet</code> objects than the number
     * that you specified for <code>Limit</code> in the request, the response
     * includes a <code>NextMarker</code> value. To list more
     * <code>RegexPatternSet</code> objects, submit another
     * <code>ListRegexPatternSets</code> request, and specify the
     * <code>NextMarker</code> value from the response in the
     * <code>NextMarker</code> value in the next request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1224<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String nextMarker;

    /**
     * <p>
     * An array of <a>RegexPatternSetSummary</a> objects.
     * </p>
     */
    private java.util.List<RegexPatternSetSummary> regexPatternSets;

    /**
     * <p>
     * If you have more <code>RegexPatternSet</code> objects than the number
     * that you specified for <code>Limit</code> in the request, the response
     * includes a <code>NextMarker</code> value. To list more
     * <code>RegexPatternSet</code> objects, submit another
     * <code>ListRegexPatternSets</code> request, and specify the
     * <code>NextMarker</code> value from the response in the
     * <code>NextMarker</code> value in the next request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1224<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         If you have more <code>RegexPatternSet</code> objects than the
     *         number that you specified for <code>Limit</code> in the request,
     *         the response includes a <code>NextMarker</code> value. To list
     *         more <code>RegexPatternSet</code> objects, submit another
     *         <code>ListRegexPatternSets</code> request, and specify the
     *         <code>NextMarker</code> value from the response in the
     *         <code>NextMarker</code> value in the next request.
     *         </p>
     */
    public String getNextMarker() {
        return nextMarker;
    }

    /**
     * <p>
     * If you have more <code>RegexPatternSet</code> objects than the number
     * that you specified for <code>Limit</code> in the request, the response
     * includes a <code>NextMarker</code> value. To list more
     * <code>RegexPatternSet</code> objects, submit another
     * <code>ListRegexPatternSets</code> request, and specify the
     * <code>NextMarker</code> value from the response in the
     * <code>NextMarker</code> value in the next request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1224<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param nextMarker <p>
     *            If you have more <code>RegexPatternSet</code> objects than the
     *            number that you specified for <code>Limit</code> in the
     *            request, the response includes a <code>NextMarker</code>
     *            value. To list more <code>RegexPatternSet</code> objects,
     *            submit another <code>ListRegexPatternSets</code> request, and
     *            specify the <code>NextMarker</code> value from the response in
     *            the <code>NextMarker</code> value in the next request.
     *            </p>
     */
    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }

    /**
     * <p>
     * If you have more <code>RegexPatternSet</code> objects than the number
     * that you specified for <code>Limit</code> in the request, the response
     * includes a <code>NextMarker</code> value. To list more
     * <code>RegexPatternSet</code> objects, submit another
     * <code>ListRegexPatternSets</code> request, and specify the
     * <code>NextMarker</code> value from the response in the
     * <code>NextMarker</code> value in the next request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1224<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param nextMarker <p>
     *            If you have more <code>RegexPatternSet</code> objects than the
     *            number that you specified for <code>Limit</code> in the
     *            request, the response includes a <code>NextMarker</code>
     *            value. To list more <code>RegexPatternSet</code> objects,
     *            submit another <code>ListRegexPatternSets</code> request, and
     *            specify the <code>NextMarker</code> value from the response in
     *            the <code>NextMarker</code> value in the next request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListRegexPatternSetsResult withNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }

    /**
     * <p>
     * An array of <a>RegexPatternSetSummary</a> objects.
     * </p>
     *
     * @return <p>
     *         An array of <a>RegexPatternSetSummary</a> objects.
     *         </p>
     */
    public java.util.List<RegexPatternSetSummary> getRegexPatternSets() {
        return regexPatternSets;
    }

    /**
     * <p>
     * An array of <a>RegexPatternSetSummary</a> objects.
     * </p>
     *
     * @param regexPatternSets <p>
     *            An array of <a>RegexPatternSetSummary</a> objects.
     *            </p>
     */
    public void setRegexPatternSets(java.util.Collection<RegexPatternSetSummary> regexPatternSets) {
        if (regexPatternSets == null) {
            this.regexPatternSets = null;
            return;
        }

        this.regexPatternSets = new java.util.ArrayList<RegexPatternSetSummary>(regexPatternSets);
    }

    /**
     * <p>
     * An array of <a>RegexPatternSetSummary</a> objects.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param regexPatternSets <p>
     *            An array of <a>RegexPatternSetSummary</a> objects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListRegexPatternSetsResult withRegexPatternSets(
            RegexPatternSetSummary... regexPatternSets) {
        if (getRegexPatternSets() == null) {
            this.regexPatternSets = new java.util.ArrayList<RegexPatternSetSummary>(
                    regexPatternSets.length);
        }
        for (RegexPatternSetSummary value : regexPatternSets) {
            this.regexPatternSets.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of <a>RegexPatternSetSummary</a> objects.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param regexPatternSets <p>
     *            An array of <a>RegexPatternSetSummary</a> objects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListRegexPatternSetsResult withRegexPatternSets(
            java.util.Collection<RegexPatternSetSummary> regexPatternSets) {
        setRegexPatternSets(regexPatternSets);
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
        if (getNextMarker() != null)
            sb.append("NextMarker: " + getNextMarker() + ",");
        if (getRegexPatternSets() != null)
            sb.append("RegexPatternSets: " + getRegexPatternSets());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextMarker() == null) ? 0 : getNextMarker().hashCode());
        hashCode = prime * hashCode
                + ((getRegexPatternSets() == null) ? 0 : getRegexPatternSets().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListRegexPatternSetsResult == false)
            return false;
        ListRegexPatternSetsResult other = (ListRegexPatternSetsResult) obj;

        if (other.getNextMarker() == null ^ this.getNextMarker() == null)
            return false;
        if (other.getNextMarker() != null
                && other.getNextMarker().equals(this.getNextMarker()) == false)
            return false;
        if (other.getRegexPatternSets() == null ^ this.getRegexPatternSets() == null)
            return false;
        if (other.getRegexPatternSets() != null
                && other.getRegexPatternSets().equals(this.getRegexPatternSets()) == false)
            return false;
        return true;
    }
}
