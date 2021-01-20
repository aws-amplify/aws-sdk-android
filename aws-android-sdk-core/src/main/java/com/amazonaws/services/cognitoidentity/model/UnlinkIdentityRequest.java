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
 * Unlinks a federated identity from an existing account. Unlinked logins will
 * be considered new identities next time they are seen. Removing the last
 * linked login will make this identity inaccessible.
 * </p>
 * <p>
 * This is a public API. You do not need any credentials to call this API.
 * </p>
 */
public class UnlinkIdentityRequest extends AmazonWebServiceRequest implements Serializable {
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
     * A set of optional name-value pairs that map provider names to provider
     * tokens.
     * </p>
     */
    private java.util.Map<String, String> logins;

    /**
     * <p>
     * Provider names to unlink from this identity.
     * </p>
     */
    private java.util.List<String> loginsToRemove;

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
    public UnlinkIdentityRequest withIdentityId(String identityId) {
        this.identityId = identityId;
        return this;
    }

    /**
     * <p>
     * A set of optional name-value pairs that map provider names to provider
     * tokens.
     * </p>
     *
     * @return <p>
     *         A set of optional name-value pairs that map provider names to
     *         provider tokens.
     *         </p>
     */
    public java.util.Map<String, String> getLogins() {
        return logins;
    }

    /**
     * <p>
     * A set of optional name-value pairs that map provider names to provider
     * tokens.
     * </p>
     *
     * @param logins <p>
     *            A set of optional name-value pairs that map provider names to
     *            provider tokens.
     *            </p>
     */
    public void setLogins(java.util.Map<String, String> logins) {
        this.logins = logins;
    }

    /**
     * <p>
     * A set of optional name-value pairs that map provider names to provider
     * tokens.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param logins <p>
     *            A set of optional name-value pairs that map provider names to
     *            provider tokens.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UnlinkIdentityRequest withLogins(java.util.Map<String, String> logins) {
        this.logins = logins;
        return this;
    }

    /**
     * <p>
     * A set of optional name-value pairs that map provider names to provider
     * tokens.
     * </p>
     * <p>
     * The method adds a new key-value pair into Logins parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into Logins.
     * @param value The corresponding value of the entry to be added into
     *            Logins.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UnlinkIdentityRequest addLoginsEntry(String key, String value) {
        if (null == this.logins) {
            this.logins = new java.util.HashMap<String, String>();
        }
        if (this.logins.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.logins.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Logins.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public UnlinkIdentityRequest clearLoginsEntries() {
        this.logins = null;
        return this;
    }

    /**
     * <p>
     * Provider names to unlink from this identity.
     * </p>
     *
     * @return <p>
     *         Provider names to unlink from this identity.
     *         </p>
     */
    public java.util.List<String> getLoginsToRemove() {
        return loginsToRemove;
    }

    /**
     * <p>
     * Provider names to unlink from this identity.
     * </p>
     *
     * @param loginsToRemove <p>
     *            Provider names to unlink from this identity.
     *            </p>
     */
    public void setLoginsToRemove(java.util.Collection<String> loginsToRemove) {
        if (loginsToRemove == null) {
            this.loginsToRemove = null;
            return;
        }

        this.loginsToRemove = new java.util.ArrayList<String>(loginsToRemove);
    }

    /**
     * <p>
     * Provider names to unlink from this identity.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param loginsToRemove <p>
     *            Provider names to unlink from this identity.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UnlinkIdentityRequest withLoginsToRemove(String... loginsToRemove) {
        if (getLoginsToRemove() == null) {
            this.loginsToRemove = new java.util.ArrayList<String>(loginsToRemove.length);
        }
        for (String value : loginsToRemove) {
            this.loginsToRemove.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Provider names to unlink from this identity.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param loginsToRemove <p>
     *            Provider names to unlink from this identity.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UnlinkIdentityRequest withLoginsToRemove(java.util.Collection<String> loginsToRemove) {
        setLoginsToRemove(loginsToRemove);
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
        if (getLogins() != null)
            sb.append("Logins: " + getLogins() + ",");
        if (getLoginsToRemove() != null)
            sb.append("LoginsToRemove: " + getLoginsToRemove());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIdentityId() == null) ? 0 : getIdentityId().hashCode());
        hashCode = prime * hashCode + ((getLogins() == null) ? 0 : getLogins().hashCode());
        hashCode = prime * hashCode
                + ((getLoginsToRemove() == null) ? 0 : getLoginsToRemove().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UnlinkIdentityRequest == false)
            return false;
        UnlinkIdentityRequest other = (UnlinkIdentityRequest) obj;

        if (other.getIdentityId() == null ^ this.getIdentityId() == null)
            return false;
        if (other.getIdentityId() != null
                && other.getIdentityId().equals(this.getIdentityId()) == false)
            return false;
        if (other.getLogins() == null ^ this.getLogins() == null)
            return false;
        if (other.getLogins() != null && other.getLogins().equals(this.getLogins()) == false)
            return false;
        if (other.getLoginsToRemove() == null ^ this.getLoginsToRemove() == null)
            return false;
        if (other.getLoginsToRemove() != null
                && other.getLoginsToRemove().equals(this.getLoginsToRemove()) == false)
            return false;
        return true;
    }
}
