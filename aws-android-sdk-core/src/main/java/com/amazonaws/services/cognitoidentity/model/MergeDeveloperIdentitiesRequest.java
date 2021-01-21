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
 * Merges two users having different <code>IdentityId</code>s, existing in the
 * same identity pool, and identified by the same developer provider. You can
 * use this action to request that discrete users be merged and identified as a
 * single user in the Cognito environment. Cognito associates the given source
 * user (<code>SourceUserIdentifier</code>) with the <code>IdentityId</code> of
 * the <code>DestinationUserIdentifier</code>. Only developer-authenticated
 * users can be merged. If the users to be merged are associated with the same
 * public provider, but as two different users, an exception will be thrown.
 * </p>
 * <p>
 * The number of linked logins is limited to 20. So, the number of linked logins
 * for the source user, <code>SourceUserIdentifier</code>, and the destination
 * user, <code>DestinationUserIdentifier</code>, together should not be larger
 * than 20. Otherwise, an exception will be thrown.
 * </p>
 * <p>
 * You must use AWS Developer credentials to call this API.
 * </p>
 */
public class MergeDeveloperIdentitiesRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * User identifier for the source user. The value should be a
     * <code>DeveloperUserIdentifier</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String sourceUserIdentifier;

    /**
     * <p>
     * User identifier for the destination user. The value should be a
     * <code>DeveloperUserIdentifier</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String destinationUserIdentifier;

    /**
     * <p>
     * The "domain" by which Cognito will refer to your users. This is a
     * (pseudo) domain name that you provide while creating an identity pool.
     * This name acts as a placeholder that allows your backend and the Cognito
     * service to communicate about the developer provider. For the
     * <code>DeveloperProviderName</code>, you can use letters as well as period
     * (.), underscore (_), and dash (-).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w._-]+<br/>
     */
    private String developerProviderName;

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
     * User identifier for the source user. The value should be a
     * <code>DeveloperUserIdentifier</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         User identifier for the source user. The value should be a
     *         <code>DeveloperUserIdentifier</code>.
     *         </p>
     */
    public String getSourceUserIdentifier() {
        return sourceUserIdentifier;
    }

    /**
     * <p>
     * User identifier for the source user. The value should be a
     * <code>DeveloperUserIdentifier</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param sourceUserIdentifier <p>
     *            User identifier for the source user. The value should be a
     *            <code>DeveloperUserIdentifier</code>.
     *            </p>
     */
    public void setSourceUserIdentifier(String sourceUserIdentifier) {
        this.sourceUserIdentifier = sourceUserIdentifier;
    }

    /**
     * <p>
     * User identifier for the source user. The value should be a
     * <code>DeveloperUserIdentifier</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param sourceUserIdentifier <p>
     *            User identifier for the source user. The value should be a
     *            <code>DeveloperUserIdentifier</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MergeDeveloperIdentitiesRequest withSourceUserIdentifier(String sourceUserIdentifier) {
        this.sourceUserIdentifier = sourceUserIdentifier;
        return this;
    }

    /**
     * <p>
     * User identifier for the destination user. The value should be a
     * <code>DeveloperUserIdentifier</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         User identifier for the destination user. The value should be a
     *         <code>DeveloperUserIdentifier</code>.
     *         </p>
     */
    public String getDestinationUserIdentifier() {
        return destinationUserIdentifier;
    }

    /**
     * <p>
     * User identifier for the destination user. The value should be a
     * <code>DeveloperUserIdentifier</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param destinationUserIdentifier <p>
     *            User identifier for the destination user. The value should be
     *            a <code>DeveloperUserIdentifier</code>.
     *            </p>
     */
    public void setDestinationUserIdentifier(String destinationUserIdentifier) {
        this.destinationUserIdentifier = destinationUserIdentifier;
    }

    /**
     * <p>
     * User identifier for the destination user. The value should be a
     * <code>DeveloperUserIdentifier</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param destinationUserIdentifier <p>
     *            User identifier for the destination user. The value should be
     *            a <code>DeveloperUserIdentifier</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MergeDeveloperIdentitiesRequest withDestinationUserIdentifier(
            String destinationUserIdentifier) {
        this.destinationUserIdentifier = destinationUserIdentifier;
        return this;
    }

    /**
     * <p>
     * The "domain" by which Cognito will refer to your users. This is a
     * (pseudo) domain name that you provide while creating an identity pool.
     * This name acts as a placeholder that allows your backend and the Cognito
     * service to communicate about the developer provider. For the
     * <code>DeveloperProviderName</code>, you can use letters as well as period
     * (.), underscore (_), and dash (-).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w._-]+<br/>
     *
     * @return <p>
     *         The "domain" by which Cognito will refer to your users. This is a
     *         (pseudo) domain name that you provide while creating an identity
     *         pool. This name acts as a placeholder that allows your backend
     *         and the Cognito service to communicate about the developer
     *         provider. For the <code>DeveloperProviderName</code>, you can use
     *         letters as well as period (.), underscore (_), and dash (-).
     *         </p>
     */
    public String getDeveloperProviderName() {
        return developerProviderName;
    }

    /**
     * <p>
     * The "domain" by which Cognito will refer to your users. This is a
     * (pseudo) domain name that you provide while creating an identity pool.
     * This name acts as a placeholder that allows your backend and the Cognito
     * service to communicate about the developer provider. For the
     * <code>DeveloperProviderName</code>, you can use letters as well as period
     * (.), underscore (_), and dash (-).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w._-]+<br/>
     *
     * @param developerProviderName <p>
     *            The "domain" by which Cognito will refer to your users. This
     *            is a (pseudo) domain name that you provide while creating an
     *            identity pool. This name acts as a placeholder that allows
     *            your backend and the Cognito service to communicate about the
     *            developer provider. For the <code>DeveloperProviderName</code>
     *            , you can use letters as well as period (.), underscore (_),
     *            and dash (-).
     *            </p>
     */
    public void setDeveloperProviderName(String developerProviderName) {
        this.developerProviderName = developerProviderName;
    }

    /**
     * <p>
     * The "domain" by which Cognito will refer to your users. This is a
     * (pseudo) domain name that you provide while creating an identity pool.
     * This name acts as a placeholder that allows your backend and the Cognito
     * service to communicate about the developer provider. For the
     * <code>DeveloperProviderName</code>, you can use letters as well as period
     * (.), underscore (_), and dash (-).
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
     *            The "domain" by which Cognito will refer to your users. This
     *            is a (pseudo) domain name that you provide while creating an
     *            identity pool. This name acts as a placeholder that allows
     *            your backend and the Cognito service to communicate about the
     *            developer provider. For the <code>DeveloperProviderName</code>
     *            , you can use letters as well as period (.), underscore (_),
     *            and dash (-).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MergeDeveloperIdentitiesRequest withDeveloperProviderName(String developerProviderName) {
        this.developerProviderName = developerProviderName;
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
    public MergeDeveloperIdentitiesRequest withIdentityPoolId(String identityPoolId) {
        this.identityPoolId = identityPoolId;
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
        if (getSourceUserIdentifier() != null)
            sb.append("SourceUserIdentifier: " + getSourceUserIdentifier() + ",");
        if (getDestinationUserIdentifier() != null)
            sb.append("DestinationUserIdentifier: " + getDestinationUserIdentifier() + ",");
        if (getDeveloperProviderName() != null)
            sb.append("DeveloperProviderName: " + getDeveloperProviderName() + ",");
        if (getIdentityPoolId() != null)
            sb.append("IdentityPoolId: " + getIdentityPoolId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSourceUserIdentifier() == null) ? 0 : getSourceUserIdentifier().hashCode());
        hashCode = prime
                * hashCode
                + ((getDestinationUserIdentifier() == null) ? 0 : getDestinationUserIdentifier()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getDeveloperProviderName() == null) ? 0 : getDeveloperProviderName().hashCode());
        hashCode = prime * hashCode
                + ((getIdentityPoolId() == null) ? 0 : getIdentityPoolId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MergeDeveloperIdentitiesRequest == false)
            return false;
        MergeDeveloperIdentitiesRequest other = (MergeDeveloperIdentitiesRequest) obj;

        if (other.getSourceUserIdentifier() == null ^ this.getSourceUserIdentifier() == null)
            return false;
        if (other.getSourceUserIdentifier() != null
                && other.getSourceUserIdentifier().equals(this.getSourceUserIdentifier()) == false)
            return false;
        if (other.getDestinationUserIdentifier() == null
                ^ this.getDestinationUserIdentifier() == null)
            return false;
        if (other.getDestinationUserIdentifier() != null
                && other.getDestinationUserIdentifier().equals(this.getDestinationUserIdentifier()) == false)
            return false;
        if (other.getDeveloperProviderName() == null ^ this.getDeveloperProviderName() == null)
            return false;
        if (other.getDeveloperProviderName() != null
                && other.getDeveloperProviderName().equals(this.getDeveloperProviderName()) == false)
            return false;
        if (other.getIdentityPoolId() == null ^ this.getIdentityPoolId() == null)
            return false;
        if (other.getIdentityPoolId() != null
                && other.getIdentityPoolId().equals(this.getIdentityPoolId()) == false)
            return false;
        return true;
    }
}
