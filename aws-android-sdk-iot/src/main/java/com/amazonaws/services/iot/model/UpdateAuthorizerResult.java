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

public class UpdateAuthorizerResult implements Serializable {
    /**
     * <p>
     * The authorizer name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w=,@-]+<br/>
     */
    private String authorizerName;

    /**
     * <p>
     * The authorizer ARN.
     * </p>
     */
    private String authorizerArn;

    /**
     * <p>
     * The authorizer name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w=,@-]+<br/>
     *
     * @return <p>
     *         The authorizer name.
     *         </p>
     */
    public String getAuthorizerName() {
        return authorizerName;
    }

    /**
     * <p>
     * The authorizer name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w=,@-]+<br/>
     *
     * @param authorizerName <p>
     *            The authorizer name.
     *            </p>
     */
    public void setAuthorizerName(String authorizerName) {
        this.authorizerName = authorizerName;
    }

    /**
     * <p>
     * The authorizer name.
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
     *            The authorizer name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAuthorizerResult withAuthorizerName(String authorizerName) {
        this.authorizerName = authorizerName;
        return this;
    }

    /**
     * <p>
     * The authorizer ARN.
     * </p>
     *
     * @return <p>
     *         The authorizer ARN.
     *         </p>
     */
    public String getAuthorizerArn() {
        return authorizerArn;
    }

    /**
     * <p>
     * The authorizer ARN.
     * </p>
     *
     * @param authorizerArn <p>
     *            The authorizer ARN.
     *            </p>
     */
    public void setAuthorizerArn(String authorizerArn) {
        this.authorizerArn = authorizerArn;
    }

    /**
     * <p>
     * The authorizer ARN.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param authorizerArn <p>
     *            The authorizer ARN.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAuthorizerResult withAuthorizerArn(String authorizerArn) {
        this.authorizerArn = authorizerArn;
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
            sb.append("authorizerName: " + getAuthorizerName() + ",");
        if (getAuthorizerArn() != null)
            sb.append("authorizerArn: " + getAuthorizerArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAuthorizerName() == null) ? 0 : getAuthorizerName().hashCode());
        hashCode = prime * hashCode
                + ((getAuthorizerArn() == null) ? 0 : getAuthorizerArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateAuthorizerResult == false)
            return false;
        UpdateAuthorizerResult other = (UpdateAuthorizerResult) obj;

        if (other.getAuthorizerName() == null ^ this.getAuthorizerName() == null)
            return false;
        if (other.getAuthorizerName() != null
                && other.getAuthorizerName().equals(this.getAuthorizerName()) == false)
            return false;
        if (other.getAuthorizerArn() == null ^ this.getAuthorizerArn() == null)
            return false;
        if (other.getAuthorizerArn() != null
                && other.getAuthorizerArn().equals(this.getAuthorizerArn()) == false)
            return false;
        return true;
    }
}
