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

package com.amazonaws.services.lightsail.model;

import java.io.Serializable;

public class GetKeyPairsResult implements Serializable {
    /**
     * <p>
     * An array of key-value pairs containing information about the key pairs.
     * </p>
     */
    private java.util.List<KeyPair> keyPairs;

    /**
     * <p>
     * The token to advance to the next page of resutls from your request.
     * </p>
     * <p>
     * A next page token is not returned if there are no more results to
     * display.
     * </p>
     * <p>
     * To get the next page of results, perform another <code>GetKeyPairs</code>
     * request and specify the next page token using the <code>pageToken</code>
     * parameter.
     * </p>
     */
    private String nextPageToken;

    /**
     * <p>
     * An array of key-value pairs containing information about the key pairs.
     * </p>
     *
     * @return <p>
     *         An array of key-value pairs containing information about the key
     *         pairs.
     *         </p>
     */
    public java.util.List<KeyPair> getKeyPairs() {
        return keyPairs;
    }

    /**
     * <p>
     * An array of key-value pairs containing information about the key pairs.
     * </p>
     *
     * @param keyPairs <p>
     *            An array of key-value pairs containing information about the
     *            key pairs.
     *            </p>
     */
    public void setKeyPairs(java.util.Collection<KeyPair> keyPairs) {
        if (keyPairs == null) {
            this.keyPairs = null;
            return;
        }

        this.keyPairs = new java.util.ArrayList<KeyPair>(keyPairs);
    }

    /**
     * <p>
     * An array of key-value pairs containing information about the key pairs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param keyPairs <p>
     *            An array of key-value pairs containing information about the
     *            key pairs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetKeyPairsResult withKeyPairs(KeyPair... keyPairs) {
        if (getKeyPairs() == null) {
            this.keyPairs = new java.util.ArrayList<KeyPair>(keyPairs.length);
        }
        for (KeyPair value : keyPairs) {
            this.keyPairs.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of key-value pairs containing information about the key pairs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param keyPairs <p>
     *            An array of key-value pairs containing information about the
     *            key pairs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetKeyPairsResult withKeyPairs(java.util.Collection<KeyPair> keyPairs) {
        setKeyPairs(keyPairs);
        return this;
    }

    /**
     * <p>
     * The token to advance to the next page of resutls from your request.
     * </p>
     * <p>
     * A next page token is not returned if there are no more results to
     * display.
     * </p>
     * <p>
     * To get the next page of results, perform another <code>GetKeyPairs</code>
     * request and specify the next page token using the <code>pageToken</code>
     * parameter.
     * </p>
     *
     * @return <p>
     *         The token to advance to the next page of resutls from your
     *         request.
     *         </p>
     *         <p>
     *         A next page token is not returned if there are no more results to
     *         display.
     *         </p>
     *         <p>
     *         To get the next page of results, perform another
     *         <code>GetKeyPairs</code> request and specify the next page token
     *         using the <code>pageToken</code> parameter.
     *         </p>
     */
    public String getNextPageToken() {
        return nextPageToken;
    }

    /**
     * <p>
     * The token to advance to the next page of resutls from your request.
     * </p>
     * <p>
     * A next page token is not returned if there are no more results to
     * display.
     * </p>
     * <p>
     * To get the next page of results, perform another <code>GetKeyPairs</code>
     * request and specify the next page token using the <code>pageToken</code>
     * parameter.
     * </p>
     *
     * @param nextPageToken <p>
     *            The token to advance to the next page of resutls from your
     *            request.
     *            </p>
     *            <p>
     *            A next page token is not returned if there are no more results
     *            to display.
     *            </p>
     *            <p>
     *            To get the next page of results, perform another
     *            <code>GetKeyPairs</code> request and specify the next page
     *            token using the <code>pageToken</code> parameter.
     *            </p>
     */
    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }

    /**
     * <p>
     * The token to advance to the next page of resutls from your request.
     * </p>
     * <p>
     * A next page token is not returned if there are no more results to
     * display.
     * </p>
     * <p>
     * To get the next page of results, perform another <code>GetKeyPairs</code>
     * request and specify the next page token using the <code>pageToken</code>
     * parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextPageToken <p>
     *            The token to advance to the next page of resutls from your
     *            request.
     *            </p>
     *            <p>
     *            A next page token is not returned if there are no more results
     *            to display.
     *            </p>
     *            <p>
     *            To get the next page of results, perform another
     *            <code>GetKeyPairs</code> request and specify the next page
     *            token using the <code>pageToken</code> parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetKeyPairsResult withNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
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
        if (getKeyPairs() != null)
            sb.append("keyPairs: " + getKeyPairs() + ",");
        if (getNextPageToken() != null)
            sb.append("nextPageToken: " + getNextPageToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyPairs() == null) ? 0 : getKeyPairs().hashCode());
        hashCode = prime * hashCode
                + ((getNextPageToken() == null) ? 0 : getNextPageToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetKeyPairsResult == false)
            return false;
        GetKeyPairsResult other = (GetKeyPairsResult) obj;

        if (other.getKeyPairs() == null ^ this.getKeyPairs() == null)
            return false;
        if (other.getKeyPairs() != null && other.getKeyPairs().equals(this.getKeyPairs()) == false)
            return false;
        if (other.getNextPageToken() == null ^ this.getNextPageToken() == null)
            return false;
        if (other.getNextPageToken() != null
                && other.getNextPageToken().equals(this.getNextPageToken()) == false)
            return false;
        return true;
    }
}
