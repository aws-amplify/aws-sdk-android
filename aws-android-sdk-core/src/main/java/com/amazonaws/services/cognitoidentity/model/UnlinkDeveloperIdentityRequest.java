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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Unlinks a <code>DeveloperUserIdentifier</code> from an existing identity.
 * Unlinked developer users will be considered new identities next time they are
 * seen. If, for a given Cognito identity, you remove all federated identities
 * as well as the developer user identifier, the Cognito identity becomes
 * inaccessible.
 * </p>
 * <p>
 * You must use AWS Developer credentials to call this API.
 * </p>
 */
public class UnlinkDeveloperIdentityRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A unique identifier in the format REGION:GUID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     */
    private String identityId;

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
     * The "domain" by which Cognito will refer to your users.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w._-]+<br/>
     */
    private String developerProviderName;

    /**
     * <p>
     * A unique ID used by your backend authentication process to identify a
     * user.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String developerUserIdentifier;

    /**
     * <p>
     * A unique identifier in the format REGION:GUID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     *
     * @return <p>
     *         A unique identifier in the format REGION:GUID.
     *         </p>
     */
    public String getIdentityId() {
        return identityId;
    }

    /**
     * <p>
     * A unique identifier in the format REGION:GUID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     *
     * @param identityId <p>
     *            A unique identifier in the format REGION:GUID.
     *            </p>
     */
    public void setIdentityId(String identityId) {
        this.identityId = identityId;
    }

    /**
     * <p>
     * A unique identifier in the format REGION:GUID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     *
     * @param identityId <p>
     *            A unique identifier in the format REGION:GUID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UnlinkDeveloperIdentityRequest withIdentityId(String identityId) {
        this.identityId = identityId;
        return this;
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
    public UnlinkDeveloperIdentityRequest withIdentityPoolId(String identityPoolId) {
        this.identityPoolId = identityPoolId;
        return this;
    }

    /**
     * <p>
     * The "domain" by which Cognito will refer to your users.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w._-]+<br/>
     *
     * @return <p>
     *         The "domain" by which Cognito will refer to your users.
     *         </p>
     */
    public String getDeveloperProviderName() {
        return developerProviderName;
    }

    /**
     * <p>
     * The "domain" by which Cognito will refer to your users.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w._-]+<br/>
     *
     * @param developerProviderName <p>
     *            The "domain" by which Cognito will refer to your users.
     *            </p>
     */
    public void setDeveloperProviderName(String developerProviderName) {
        this.developerProviderName = developerProviderName;
    }

    /**
     * <p>
     * The "domain" by which Cognito will refer to your users.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w._-]+<br/>
     *
     * @param developerProviderName <p>
     *            The "domain" by which Cognito will refer to your users.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UnlinkDeveloperIdentityRequest withDeveloperProviderName(String developerProviderName) {
        this.developerProviderName = developerProviderName;
        return this;
    }

    /**
     * <p>
     * A unique ID used by your backend authentication process to identify a
     * user.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         A unique ID used by your backend authentication process to
     *         identify a user.
     *         </p>
     */
    public String getDeveloperUserIdentifier() {
        return developerUserIdentifier;
    }

    /**
     * <p>
     * A unique ID used by your backend authentication process to identify a
     * user.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param developerUserIdentifier <p>
     *            A unique ID used by your backend authentication process to
     *            identify a user.
     *            </p>
     */
    public void setDeveloperUserIdentifier(String developerUserIdentifier) {
        this.developerUserIdentifier = developerUserIdentifier;
    }

    /**
     * <p>
     * A unique ID used by your backend authentication process to identify a
     * user.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param developerUserIdentifier <p>
     *            A unique ID used by your backend authentication process to
     *            identify a user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UnlinkDeveloperIdentityRequest withDeveloperUserIdentifier(String developerUserIdentifier) {
        this.developerUserIdentifier = developerUserIdentifier;
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
        if (getIdentityId() != null)
            sb.append("IdentityId: " + getIdentityId() + ",");
        if (getIdentityPoolId() != null)
            sb.append("IdentityPoolId: " + getIdentityPoolId() + ",");
        if (getDeveloperProviderName() != null)
            sb.append("DeveloperProviderName: " + getDeveloperProviderName() + ",");
        if (getDeveloperUserIdentifier() != null)
            sb.append("DeveloperUserIdentifier: " + getDeveloperUserIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIdentityId() == null) ? 0 : getIdentityId().hashCode());
        hashCode = prime * hashCode
                + ((getIdentityPoolId() == null) ? 0 : getIdentityPoolId().hashCode());
        hashCode = prime
                * hashCode
                + ((getDeveloperProviderName() == null) ? 0 : getDeveloperProviderName().hashCode());
        hashCode = prime
                * hashCode
                + ((getDeveloperUserIdentifier() == null) ? 0 : getDeveloperUserIdentifier()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UnlinkDeveloperIdentityRequest == false)
            return false;
        UnlinkDeveloperIdentityRequest other = (UnlinkDeveloperIdentityRequest) obj;

        if (other.getIdentityId() == null ^ this.getIdentityId() == null)
            return false;
        if (other.getIdentityId() != null
                && other.getIdentityId().equals(this.getIdentityId()) == false)
            return false;
        if (other.getIdentityPoolId() == null ^ this.getIdentityPoolId() == null)
            return false;
        if (other.getIdentityPoolId() != null
                && other.getIdentityPoolId().equals(this.getIdentityPoolId()) == false)
            return false;
        if (other.getDeveloperProviderName() == null ^ this.getDeveloperProviderName() == null)
            return false;
        if (other.getDeveloperProviderName() != null
                && other.getDeveloperProviderName().equals(this.getDeveloperProviderName()) == false)
            return false;
        if (other.getDeveloperUserIdentifier() == null ^ this.getDeveloperUserIdentifier() == null)
            return false;
        if (other.getDeveloperUserIdentifier() != null
                && other.getDeveloperUserIdentifier().equals(this.getDeveloperUserIdentifier()) == false)
            return false;
        return true;
    }
}
