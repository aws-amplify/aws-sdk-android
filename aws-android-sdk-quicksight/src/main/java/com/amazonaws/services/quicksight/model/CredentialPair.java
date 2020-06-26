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

package com.amazonaws.services.quicksight.model;

import java.io.Serializable;

/**
 * <p>
 * The combination of user name and password that are used as credentials.
 * </p>
 */
public class CredentialPair implements Serializable {
    /**
     * <p>
     * User name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     */
    private String username;

    /**
     * <p>
     * Password.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String password;

    /**
     * <p>
     * A set of alternate data source parameters that you want to share for
     * these credentials. The credentials are applied in tandem with the data
     * source parameters when you copy a data source by using a create or update
     * request. The API compares the <code>DataSourceParameters</code> structure
     * that's in the request with the structures in the
     * <code>AlternateDataSourceParameters</code> allowlist. If the structures
     * are an exact match, the request is allowed to use the new data source
     * with the existing credentials. If the
     * <code>AlternateDataSourceParameters</code> list is null, the
     * <code>DataSourceParameters</code> originally used with these
     * <code>Credentials</code> is automatically allowed.
     * </p>
     */
    private java.util.List<DataSourceParameters> alternateDataSourceParameters;

    /**
     * <p>
     * User name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return <p>
     *         User name.
     *         </p>
     */
    public String getUsername() {
        return username;
    }

    /**
     * <p>
     * User name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param username <p>
     *            User name.
     *            </p>
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * <p>
     * User name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param username <p>
     *            User name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CredentialPair withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * <p>
     * Password.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         Password.
     *         </p>
     */
    public String getPassword() {
        return password;
    }

    /**
     * <p>
     * Password.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param password <p>
     *            Password.
     *            </p>
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * <p>
     * Password.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param password <p>
     *            Password.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CredentialPair withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * <p>
     * A set of alternate data source parameters that you want to share for
     * these credentials. The credentials are applied in tandem with the data
     * source parameters when you copy a data source by using a create or update
     * request. The API compares the <code>DataSourceParameters</code> structure
     * that's in the request with the structures in the
     * <code>AlternateDataSourceParameters</code> allowlist. If the structures
     * are an exact match, the request is allowed to use the new data source
     * with the existing credentials. If the
     * <code>AlternateDataSourceParameters</code> list is null, the
     * <code>DataSourceParameters</code> originally used with these
     * <code>Credentials</code> is automatically allowed.
     * </p>
     *
     * @return <p>
     *         A set of alternate data source parameters that you want to share
     *         for these credentials. The credentials are applied in tandem with
     *         the data source parameters when you copy a data source by using a
     *         create or update request. The API compares the
     *         <code>DataSourceParameters</code> structure that's in the request
     *         with the structures in the
     *         <code>AlternateDataSourceParameters</code> allowlist. If the
     *         structures are an exact match, the request is allowed to use the
     *         new data source with the existing credentials. If the
     *         <code>AlternateDataSourceParameters</code> list is null, the
     *         <code>DataSourceParameters</code> originally used with these
     *         <code>Credentials</code> is automatically allowed.
     *         </p>
     */
    public java.util.List<DataSourceParameters> getAlternateDataSourceParameters() {
        return alternateDataSourceParameters;
    }

    /**
     * <p>
     * A set of alternate data source parameters that you want to share for
     * these credentials. The credentials are applied in tandem with the data
     * source parameters when you copy a data source by using a create or update
     * request. The API compares the <code>DataSourceParameters</code> structure
     * that's in the request with the structures in the
     * <code>AlternateDataSourceParameters</code> allowlist. If the structures
     * are an exact match, the request is allowed to use the new data source
     * with the existing credentials. If the
     * <code>AlternateDataSourceParameters</code> list is null, the
     * <code>DataSourceParameters</code> originally used with these
     * <code>Credentials</code> is automatically allowed.
     * </p>
     *
     * @param alternateDataSourceParameters <p>
     *            A set of alternate data source parameters that you want to
     *            share for these credentials. The credentials are applied in
     *            tandem with the data source parameters when you copy a data
     *            source by using a create or update request. The API compares
     *            the <code>DataSourceParameters</code> structure that's in the
     *            request with the structures in the
     *            <code>AlternateDataSourceParameters</code> allowlist. If the
     *            structures are an exact match, the request is allowed to use
     *            the new data source with the existing credentials. If the
     *            <code>AlternateDataSourceParameters</code> list is null, the
     *            <code>DataSourceParameters</code> originally used with these
     *            <code>Credentials</code> is automatically allowed.
     *            </p>
     */
    public void setAlternateDataSourceParameters(
            java.util.Collection<DataSourceParameters> alternateDataSourceParameters) {
        if (alternateDataSourceParameters == null) {
            this.alternateDataSourceParameters = null;
            return;
        }

        this.alternateDataSourceParameters = new java.util.ArrayList<DataSourceParameters>(
                alternateDataSourceParameters);
    }

    /**
     * <p>
     * A set of alternate data source parameters that you want to share for
     * these credentials. The credentials are applied in tandem with the data
     * source parameters when you copy a data source by using a create or update
     * request. The API compares the <code>DataSourceParameters</code> structure
     * that's in the request with the structures in the
     * <code>AlternateDataSourceParameters</code> allowlist. If the structures
     * are an exact match, the request is allowed to use the new data source
     * with the existing credentials. If the
     * <code>AlternateDataSourceParameters</code> list is null, the
     * <code>DataSourceParameters</code> originally used with these
     * <code>Credentials</code> is automatically allowed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param alternateDataSourceParameters <p>
     *            A set of alternate data source parameters that you want to
     *            share for these credentials. The credentials are applied in
     *            tandem with the data source parameters when you copy a data
     *            source by using a create or update request. The API compares
     *            the <code>DataSourceParameters</code> structure that's in the
     *            request with the structures in the
     *            <code>AlternateDataSourceParameters</code> allowlist. If the
     *            structures are an exact match, the request is allowed to use
     *            the new data source with the existing credentials. If the
     *            <code>AlternateDataSourceParameters</code> list is null, the
     *            <code>DataSourceParameters</code> originally used with these
     *            <code>Credentials</code> is automatically allowed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CredentialPair withAlternateDataSourceParameters(
            DataSourceParameters... alternateDataSourceParameters) {
        if (getAlternateDataSourceParameters() == null) {
            this.alternateDataSourceParameters = new java.util.ArrayList<DataSourceParameters>(
                    alternateDataSourceParameters.length);
        }
        for (DataSourceParameters value : alternateDataSourceParameters) {
            this.alternateDataSourceParameters.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A set of alternate data source parameters that you want to share for
     * these credentials. The credentials are applied in tandem with the data
     * source parameters when you copy a data source by using a create or update
     * request. The API compares the <code>DataSourceParameters</code> structure
     * that's in the request with the structures in the
     * <code>AlternateDataSourceParameters</code> allowlist. If the structures
     * are an exact match, the request is allowed to use the new data source
     * with the existing credentials. If the
     * <code>AlternateDataSourceParameters</code> list is null, the
     * <code>DataSourceParameters</code> originally used with these
     * <code>Credentials</code> is automatically allowed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param alternateDataSourceParameters <p>
     *            A set of alternate data source parameters that you want to
     *            share for these credentials. The credentials are applied in
     *            tandem with the data source parameters when you copy a data
     *            source by using a create or update request. The API compares
     *            the <code>DataSourceParameters</code> structure that's in the
     *            request with the structures in the
     *            <code>AlternateDataSourceParameters</code> allowlist. If the
     *            structures are an exact match, the request is allowed to use
     *            the new data source with the existing credentials. If the
     *            <code>AlternateDataSourceParameters</code> list is null, the
     *            <code>DataSourceParameters</code> originally used with these
     *            <code>Credentials</code> is automatically allowed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CredentialPair withAlternateDataSourceParameters(
            java.util.Collection<DataSourceParameters> alternateDataSourceParameters) {
        setAlternateDataSourceParameters(alternateDataSourceParameters);
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
        if (getUsername() != null)
            sb.append("Username: " + getUsername() + ",");
        if (getPassword() != null)
            sb.append("Password: " + getPassword() + ",");
        if (getAlternateDataSourceParameters() != null)
            sb.append("AlternateDataSourceParameters: " + getAlternateDataSourceParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode());
        hashCode = prime * hashCode + ((getPassword() == null) ? 0 : getPassword().hashCode());
        hashCode = prime
                * hashCode
                + ((getAlternateDataSourceParameters() == null) ? 0
                        : getAlternateDataSourceParameters().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CredentialPair == false)
            return false;
        CredentialPair other = (CredentialPair) obj;

        if (other.getUsername() == null ^ this.getUsername() == null)
            return false;
        if (other.getUsername() != null && other.getUsername().equals(this.getUsername()) == false)
            return false;
        if (other.getPassword() == null ^ this.getPassword() == null)
            return false;
        if (other.getPassword() != null && other.getPassword().equals(this.getPassword()) == false)
            return false;
        if (other.getAlternateDataSourceParameters() == null
                ^ this.getAlternateDataSourceParameters() == null)
            return false;
        if (other.getAlternateDataSourceParameters() != null
                && other.getAlternateDataSourceParameters().equals(
                        this.getAlternateDataSourceParameters()) == false)
            return false;
        return true;
    }
}
