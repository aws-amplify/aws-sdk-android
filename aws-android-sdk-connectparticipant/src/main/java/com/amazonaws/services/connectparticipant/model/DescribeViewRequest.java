/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connectparticipant.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Retrieves the view for the specified view token.
 * </p>
 */
public class DescribeViewRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * An encrypted token originating from the interactive message of a ShowView
     * block operation. Represents the desired view.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     */
    private String viewToken;

    /**
     * <p>
     * The connection token.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     */
    private String connectionToken;

    /**
     * <p>
     * An encrypted token originating from the interactive message of a ShowView
     * block operation. Represents the desired view.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @return <p>
     *         An encrypted token originating from the interactive message of a
     *         ShowView block operation. Represents the desired view.
     *         </p>
     */
    public String getViewToken() {
        return viewToken;
    }

    /**
     * <p>
     * An encrypted token originating from the interactive message of a ShowView
     * block operation. Represents the desired view.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @param viewToken <p>
     *            An encrypted token originating from the interactive message of
     *            a ShowView block operation. Represents the desired view.
     *            </p>
     */
    public void setViewToken(String viewToken) {
        this.viewToken = viewToken;
    }

    /**
     * <p>
     * An encrypted token originating from the interactive message of a ShowView
     * block operation. Represents the desired view.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @param viewToken <p>
     *            An encrypted token originating from the interactive message of
     *            a ShowView block operation. Represents the desired view.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeViewRequest withViewToken(String viewToken) {
        this.viewToken = viewToken;
        return this;
    }

    /**
     * <p>
     * The connection token.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @return <p>
     *         The connection token.
     *         </p>
     */
    public String getConnectionToken() {
        return connectionToken;
    }

    /**
     * <p>
     * The connection token.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @param connectionToken <p>
     *            The connection token.
     *            </p>
     */
    public void setConnectionToken(String connectionToken) {
        this.connectionToken = connectionToken;
    }

    /**
     * <p>
     * The connection token.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @param connectionToken <p>
     *            The connection token.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeViewRequest withConnectionToken(String connectionToken) {
        this.connectionToken = connectionToken;
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
        if (getViewToken() != null)
            sb.append("ViewToken: " + getViewToken() + ",");
        if (getConnectionToken() != null)
            sb.append("ConnectionToken: " + getConnectionToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getViewToken() == null) ? 0 : getViewToken().hashCode());
        hashCode = prime * hashCode
                + ((getConnectionToken() == null) ? 0 : getConnectionToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeViewRequest == false)
            return false;
        DescribeViewRequest other = (DescribeViewRequest) obj;

        if (other.getViewToken() == null ^ this.getViewToken() == null)
            return false;
        if (other.getViewToken() != null
                && other.getViewToken().equals(this.getViewToken()) == false)
            return false;
        if (other.getConnectionToken() == null ^ this.getConnectionToken() == null)
            return false;
        if (other.getConnectionToken() != null
                && other.getConnectionToken().equals(this.getConnectionToken()) == false)
            return false;
        return true;
    }
}
