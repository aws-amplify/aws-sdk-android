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

package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Delete a distribution.
 * </p>
 */
public class DeleteDistribution2019_03_26Request extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The distribution ID.
     * </p>
     */
    private String id;

    /**
     * <p>
     * The value of the <code>ETag</code> header that you received when you
     * disabled the distribution. For example: <code>E2QWRUHAPOMQZL</code>.
     * </p>
     */
    private String ifMatch;

    /**
     * <p>
     * The distribution ID.
     * </p>
     *
     * @return <p>
     *         The distribution ID.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The distribution ID.
     * </p>
     *
     * @param id <p>
     *            The distribution ID.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The distribution ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id <p>
     *            The distribution ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteDistribution2019_03_26Request withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The value of the <code>ETag</code> header that you received when you
     * disabled the distribution. For example: <code>E2QWRUHAPOMQZL</code>.
     * </p>
     *
     * @return <p>
     *         The value of the <code>ETag</code> header that you received when
     *         you disabled the distribution. For example:
     *         <code>E2QWRUHAPOMQZL</code>.
     *         </p>
     */
    public String getIfMatch() {
        return ifMatch;
    }

    /**
     * <p>
     * The value of the <code>ETag</code> header that you received when you
     * disabled the distribution. For example: <code>E2QWRUHAPOMQZL</code>.
     * </p>
     *
     * @param ifMatch <p>
     *            The value of the <code>ETag</code> header that you received
     *            when you disabled the distribution. For example:
     *            <code>E2QWRUHAPOMQZL</code>.
     *            </p>
     */
    public void setIfMatch(String ifMatch) {
        this.ifMatch = ifMatch;
    }

    /**
     * <p>
     * The value of the <code>ETag</code> header that you received when you
     * disabled the distribution. For example: <code>E2QWRUHAPOMQZL</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ifMatch <p>
     *            The value of the <code>ETag</code> header that you received
     *            when you disabled the distribution. For example:
     *            <code>E2QWRUHAPOMQZL</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteDistribution2019_03_26Request withIfMatch(String ifMatch) {
        this.ifMatch = ifMatch;
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
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getIfMatch() != null)
            sb.append("IfMatch: " + getIfMatch());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getIfMatch() == null) ? 0 : getIfMatch().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteDistribution2019_03_26Request == false)
            return false;
        DeleteDistribution2019_03_26Request other = (DeleteDistribution2019_03_26Request) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getIfMatch() == null ^ this.getIfMatch() == null)
            return false;
        if (other.getIfMatch() != null && other.getIfMatch().equals(this.getIfMatch()) == false)
            return false;
        return true;
    }
}
