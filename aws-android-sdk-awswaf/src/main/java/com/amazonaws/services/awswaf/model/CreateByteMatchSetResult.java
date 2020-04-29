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

public class CreateByteMatchSetResult implements Serializable {
    /**
     * <p>
     * A <a>ByteMatchSet</a> that contains no <code>ByteMatchTuple</code>
     * objects.
     * </p>
     */
    private ByteMatchSet byteMatchSet;

    /**
     * <p>
     * The <code>ChangeToken</code> that you used to submit the
     * <code>CreateByteMatchSet</code> request. You can also use this value to
     * query the status of the request. For more information, see
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
     * A <a>ByteMatchSet</a> that contains no <code>ByteMatchTuple</code>
     * objects.
     * </p>
     *
     * @return <p>
     *         A <a>ByteMatchSet</a> that contains no
     *         <code>ByteMatchTuple</code> objects.
     *         </p>
     */
    public ByteMatchSet getByteMatchSet() {
        return byteMatchSet;
    }

    /**
     * <p>
     * A <a>ByteMatchSet</a> that contains no <code>ByteMatchTuple</code>
     * objects.
     * </p>
     *
     * @param byteMatchSet <p>
     *            A <a>ByteMatchSet</a> that contains no
     *            <code>ByteMatchTuple</code> objects.
     *            </p>
     */
    public void setByteMatchSet(ByteMatchSet byteMatchSet) {
        this.byteMatchSet = byteMatchSet;
    }

    /**
     * <p>
     * A <a>ByteMatchSet</a> that contains no <code>ByteMatchTuple</code>
     * objects.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param byteMatchSet <p>
     *            A <a>ByteMatchSet</a> that contains no
     *            <code>ByteMatchTuple</code> objects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateByteMatchSetResult withByteMatchSet(ByteMatchSet byteMatchSet) {
        this.byteMatchSet = byteMatchSet;
        return this;
    }

    /**
     * <p>
     * The <code>ChangeToken</code> that you used to submit the
     * <code>CreateByteMatchSet</code> request. You can also use this value to
     * query the status of the request. For more information, see
     * <a>GetChangeTokenStatus</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The <code>ChangeToken</code> that you used to submit the
     *         <code>CreateByteMatchSet</code> request. You can also use this
     *         value to query the status of the request. For more information,
     *         see <a>GetChangeTokenStatus</a>.
     *         </p>
     */
    public String getChangeToken() {
        return changeToken;
    }

    /**
     * <p>
     * The <code>ChangeToken</code> that you used to submit the
     * <code>CreateByteMatchSet</code> request. You can also use this value to
     * query the status of the request. For more information, see
     * <a>GetChangeTokenStatus</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param changeToken <p>
     *            The <code>ChangeToken</code> that you used to submit the
     *            <code>CreateByteMatchSet</code> request. You can also use this
     *            value to query the status of the request. For more
     *            information, see <a>GetChangeTokenStatus</a>.
     *            </p>
     */
    public void setChangeToken(String changeToken) {
        this.changeToken = changeToken;
    }

    /**
     * <p>
     * The <code>ChangeToken</code> that you used to submit the
     * <code>CreateByteMatchSet</code> request. You can also use this value to
     * query the status of the request. For more information, see
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
     *            <code>CreateByteMatchSet</code> request. You can also use this
     *            value to query the status of the request. For more
     *            information, see <a>GetChangeTokenStatus</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateByteMatchSetResult withChangeToken(String changeToken) {
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
        if (getByteMatchSet() != null)
            sb.append("ByteMatchSet: " + getByteMatchSet() + ",");
        if (getChangeToken() != null)
            sb.append("ChangeToken: " + getChangeToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getByteMatchSet() == null) ? 0 : getByteMatchSet().hashCode());
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

        if (obj instanceof CreateByteMatchSetResult == false)
            return false;
        CreateByteMatchSetResult other = (CreateByteMatchSetResult) obj;

        if (other.getByteMatchSet() == null ^ this.getByteMatchSet() == null)
            return false;
        if (other.getByteMatchSet() != null
                && other.getByteMatchSet().equals(this.getByteMatchSet()) == false)
            return false;
        if (other.getChangeToken() == null ^ this.getChangeToken() == null)
            return false;
        if (other.getChangeToken() != null
                && other.getChangeToken().equals(this.getChangeToken()) == false)
            return false;
        return true;
    }
}
