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

package com.amazonaws.services.session.qldb.model;

import java.io.Serializable;

/**
 * <p>
 * Contains details of the fetched page.
 * </p>
 */
public class Page implements Serializable {
    /**
     * <p>
     * A structure that contains values in multiple encoding formats.
     * </p>
     */
    private java.util.List<ValueHolder> values;

    /**
     * <p>
     * The token of the next page.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 1024<br/>
     * <b>Pattern: </b>^[A-Za-z-0-9+/=]+$<br/>
     */
    private String nextPageToken;

    /**
     * <p>
     * A structure that contains values in multiple encoding formats.
     * </p>
     *
     * @return <p>
     *         A structure that contains values in multiple encoding formats.
     *         </p>
     */
    public java.util.List<ValueHolder> getValues() {
        return values;
    }

    /**
     * <p>
     * A structure that contains values in multiple encoding formats.
     * </p>
     *
     * @param values <p>
     *            A structure that contains values in multiple encoding formats.
     *            </p>
     */
    public void setValues(java.util.Collection<ValueHolder> values) {
        if (values == null) {
            this.values = null;
            return;
        }

        this.values = new java.util.ArrayList<ValueHolder>(values);
    }

    /**
     * <p>
     * A structure that contains values in multiple encoding formats.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param values <p>
     *            A structure that contains values in multiple encoding formats.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Page withValues(ValueHolder... values) {
        if (getValues() == null) {
            this.values = new java.util.ArrayList<ValueHolder>(values.length);
        }
        for (ValueHolder value : values) {
            this.values.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A structure that contains values in multiple encoding formats.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param values <p>
     *            A structure that contains values in multiple encoding formats.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Page withValues(java.util.Collection<ValueHolder> values) {
        setValues(values);
        return this;
    }

    /**
     * <p>
     * The token of the next page.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 1024<br/>
     * <b>Pattern: </b>^[A-Za-z-0-9+/=]+$<br/>
     *
     * @return <p>
     *         The token of the next page.
     *         </p>
     */
    public String getNextPageToken() {
        return nextPageToken;
    }

    /**
     * <p>
     * The token of the next page.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 1024<br/>
     * <b>Pattern: </b>^[A-Za-z-0-9+/=]+$<br/>
     *
     * @param nextPageToken <p>
     *            The token of the next page.
     *            </p>
     */
    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }

    /**
     * <p>
     * The token of the next page.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 1024<br/>
     * <b>Pattern: </b>^[A-Za-z-0-9+/=]+$<br/>
     *
     * @param nextPageToken <p>
     *            The token of the next page.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Page withNextPageToken(String nextPageToken) {
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
        if (getValues() != null)
            sb.append("Values: " + getValues() + ",");
        if (getNextPageToken() != null)
            sb.append("NextPageToken: " + getNextPageToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
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

        if (obj instanceof Page == false)
            return false;
        Page other = (Page) obj;

        if (other.getValues() == null ^ this.getValues() == null)
            return false;
        if (other.getValues() != null && other.getValues().equals(this.getValues()) == false)
            return false;
        if (other.getNextPageToken() == null ^ this.getNextPageToken() == null)
            return false;
        if (other.getNextPageToken() != null
                && other.getNextPageToken().equals(this.getNextPageToken()) == false)
            return false;
        return true;
    }
}
