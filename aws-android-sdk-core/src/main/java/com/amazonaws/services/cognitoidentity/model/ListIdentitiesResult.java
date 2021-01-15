/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.cognitoidentity.model;

import java.io.Serializable;

/**
 * <p>
 * The response to a ListIdentities request.
 * </p>
 */
public class ListIdentitiesResult implements Serializable {
    /**
     * <p>
     * An identity pool ID in the format REGION:GUID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     */
    private String identityPoolId;

    /**
     * <p>
     * An object containing a set of identities and associated mappings.
     * </p>
     */
    private java.util.List<IdentityDescription> identities;

    /**
     * <p>
     * A pagination token.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 65535<br/>
     * <b>Pattern: </b>[\S]+<br/>
     */
    private String nextToken;

    /**
     * <p>
     * An identity pool ID in the format REGION:GUID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     *
     * @return <p>
     *         An identity pool ID in the format REGION:GUID.
     *         </p>
     */
    public String getIdentityPoolId() {
        return identityPoolId;
    }

    /**
     * <p>
     * An identity pool ID in the format REGION:GUID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     *
     * @param identityPoolId <p>
     *            An identity pool ID in the format REGION:GUID.
     *            </p>
     */
    public void setIdentityPoolId(String identityPoolId) {
        this.identityPoolId = identityPoolId;
    }

    /**
     * <p>
     * An identity pool ID in the format REGION:GUID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     *
     * @param identityPoolId <p>
     *            An identity pool ID in the format REGION:GUID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListIdentitiesResult withIdentityPoolId(String identityPoolId) {
        this.identityPoolId = identityPoolId;
        return this;
    }

    /**
     * <p>
     * An object containing a set of identities and associated mappings.
     * </p>
     *
     * @return <p>
     *         An object containing a set of identities and associated mappings.
     *         </p>
     */
    public java.util.List<IdentityDescription> getIdentities() {
        return identities;
    }

    /**
     * <p>
     * An object containing a set of identities and associated mappings.
     * </p>
     *
     * @param identities <p>
     *            An object containing a set of identities and associated
     *            mappings.
     *            </p>
     */
    public void setIdentities(java.util.Collection<IdentityDescription> identities) {
        if (identities == null) {
            this.identities = null;
            return;
        }

        this.identities = new java.util.ArrayList<IdentityDescription>(identities);
    }

    /**
     * <p>
     * An object containing a set of identities and associated mappings.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param identities <p>
     *            An object containing a set of identities and associated
     *            mappings.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListIdentitiesResult withIdentities(IdentityDescription... identities) {
        if (getIdentities() == null) {
            this.identities = new java.util.ArrayList<IdentityDescription>(identities.length);
        }
        for (IdentityDescription value : identities) {
            this.identities.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An object containing a set of identities and associated mappings.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param identities <p>
     *            An object containing a set of identities and associated
     *            mappings.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListIdentitiesResult withIdentities(java.util.Collection<IdentityDescription> identities) {
        setIdentities(identities);
        return this;
    }

    /**
     * <p>
     * A pagination token.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 65535<br/>
     * <b>Pattern: </b>[\S]+<br/>
     *
     * @return <p>
     *         A pagination token.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A pagination token.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 65535<br/>
     * <b>Pattern: </b>[\S]+<br/>
     *
     * @param nextToken <p>
     *            A pagination token.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A pagination token.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 65535<br/>
     * <b>Pattern: </b>[\S]+<br/>
     *
     * @param nextToken <p>
     *            A pagination token.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListIdentitiesResult withNextToken(String nextToken) {
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
        if (getIdentityPoolId() != null)
            sb.append("IdentityPoolId: " + getIdentityPoolId() + ",");
        if (getIdentities() != null)
            sb.append("Identities: " + getIdentities() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getIdentityPoolId() == null) ? 0 : getIdentityPoolId().hashCode());
        hashCode = prime * hashCode + ((getIdentities() == null) ? 0 : getIdentities().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListIdentitiesResult == false)
            return false;
        ListIdentitiesResult other = (ListIdentitiesResult) obj;

        if (other.getIdentityPoolId() == null ^ this.getIdentityPoolId() == null)
            return false;
        if (other.getIdentityPoolId() != null
                && other.getIdentityPoolId().equals(this.getIdentityPoolId()) == false)
            return false;
        if (other.getIdentities() == null ^ this.getIdentities() == null)
            return false;
        if (other.getIdentities() != null
                && other.getIdentities().equals(this.getIdentities()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
