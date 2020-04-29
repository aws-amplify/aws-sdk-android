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

package com.amazonaws.services.awswaf.model;

import java.io.Serializable;

public class CreateIPSetResult implements Serializable {
    /**
     * <p>
     * The <a>IPSet</a> returned in the <code>CreateIPSet</code> response.
     * </p>
     */
    private IPSet iPSet;

    /**
     * <p>
     * The <code>ChangeToken</code> that you used to submit the
     * <code>CreateIPSet</code> request. You can also use this value to query
     * the status of the request. For more information, see
     * <a>GetChangeTokenStatus</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String changeToken;

    /**
     * <p>
     * The <a>IPSet</a> returned in the <code>CreateIPSet</code> response.
     * </p>
     *
     * @return <p>
     *         The <a>IPSet</a> returned in the <code>CreateIPSet</code>
     *         response.
     *         </p>
     */
    public IPSet getIPSet() {
        return iPSet;
    }

    /**
     * <p>
     * The <a>IPSet</a> returned in the <code>CreateIPSet</code> response.
     * </p>
     *
     * @param iPSet <p>
     *            The <a>IPSet</a> returned in the <code>CreateIPSet</code>
     *            response.
     *            </p>
     */
    public void setIPSet(IPSet iPSet) {
        this.iPSet = iPSet;
    }

    /**
     * <p>
     * The <a>IPSet</a> returned in the <code>CreateIPSet</code> response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param iPSet <p>
     *            The <a>IPSet</a> returned in the <code>CreateIPSet</code>
     *            response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateIPSetResult withIPSet(IPSet iPSet) {
        this.iPSet = iPSet;
        return this;
    }

    /**
     * <p>
     * The <code>ChangeToken</code> that you used to submit the
     * <code>CreateIPSet</code> request. You can also use this value to query
     * the status of the request. For more information, see
     * <a>GetChangeTokenStatus</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The <code>ChangeToken</code> that you used to submit the
     *         <code>CreateIPSet</code> request. You can also use this value to
     *         query the status of the request. For more information, see
     *         <a>GetChangeTokenStatus</a>.
     *         </p>
     */
    public String getChangeToken() {
        return changeToken;
    }

    /**
     * <p>
     * The <code>ChangeToken</code> that you used to submit the
     * <code>CreateIPSet</code> request. You can also use this value to query
     * the status of the request. For more information, see
     * <a>GetChangeTokenStatus</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param changeToken <p>
     *            The <code>ChangeToken</code> that you used to submit the
     *            <code>CreateIPSet</code> request. You can also use this value
     *            to query the status of the request. For more information, see
     *            <a>GetChangeTokenStatus</a>.
     *            </p>
     */
    public void setChangeToken(String changeToken) {
        this.changeToken = changeToken;
    }

    /**
     * <p>
     * The <code>ChangeToken</code> that you used to submit the
     * <code>CreateIPSet</code> request. You can also use this value to query
     * the status of the request. For more information, see
     * <a>GetChangeTokenStatus</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param changeToken <p>
     *            The <code>ChangeToken</code> that you used to submit the
     *            <code>CreateIPSet</code> request. You can also use this value
     *            to query the status of the request. For more information, see
     *            <a>GetChangeTokenStatus</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateIPSetResult withChangeToken(String changeToken) {
        this.changeToken = changeToken;
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
        if (getIPSet() != null)
            sb.append("IPSet: " + getIPSet() + ",");
        if (getChangeToken() != null)
            sb.append("ChangeToken: " + getChangeToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIPSet() == null) ? 0 : getIPSet().hashCode());
        hashCode = prime * hashCode
                + ((getChangeToken() == null) ? 0 : getChangeToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateIPSetResult == false)
            return false;
        CreateIPSetResult other = (CreateIPSetResult) obj;

        if (other.getIPSet() == null ^ this.getIPSet() == null)
            return false;
        if (other.getIPSet() != null && other.getIPSet().equals(this.getIPSet()) == false)
            return false;
        if (other.getChangeToken() == null ^ this.getChangeToken() == null)
            return false;
        if (other.getChangeToken() != null
                && other.getChangeToken().equals(this.getChangeToken()) == false)
            return false;
        return true;
    }
}
