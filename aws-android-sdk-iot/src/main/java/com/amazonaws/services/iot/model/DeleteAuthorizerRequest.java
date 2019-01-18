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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Deletes an authorizer.
 * </p>
 */
public class DeleteAuthorizerRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the authorizer to delete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w=,@-]+<br/>
     */
    private String authorizerName;

    /**
     * <p>
     * The name of the authorizer to delete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w=,@-]+<br/>
     *
     * @return <p>
     *         The name of the authorizer to delete.
     *         </p>
     */
    public String getAuthorizerName() {
        return authorizerName;
    }

    /**
     * <p>
     * The name of the authorizer to delete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w=,@-]+<br/>
     *
     * @param authorizerName <p>
     *            The name of the authorizer to delete.
     *            </p>
     */
    public void setAuthorizerName(String authorizerName) {
        this.authorizerName = authorizerName;
    }

    /**
     * <p>
     * The name of the authorizer to delete.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w=,@-]+<br/>
     *
     * @param authorizerName <p>
     *            The name of the authorizer to delete.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteAuthorizerRequest withAuthorizerName(String authorizerName) {
        this.authorizerName = authorizerName;
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
        if (getAuthorizerName() != null)
            sb.append("authorizerName: " + getAuthorizerName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAuthorizerName() == null) ? 0 : getAuthorizerName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteAuthorizerRequest == false)
            return false;
        DeleteAuthorizerRequest other = (DeleteAuthorizerRequest) obj;

        if (other.getAuthorizerName() == null ^ this.getAuthorizerName() == null)
            return false;
        if (other.getAuthorizerName() != null
                && other.getAuthorizerName().equals(this.getAuthorizerName()) == false)
            return false;
        return true;
    }
}
