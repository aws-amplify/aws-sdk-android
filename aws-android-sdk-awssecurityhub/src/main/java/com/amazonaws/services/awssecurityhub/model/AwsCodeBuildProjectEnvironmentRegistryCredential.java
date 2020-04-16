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

package com.amazonaws.services.awssecurityhub.model;

import java.io.Serializable;

/**
 * <p>
 * The credentials for access to a private registry.
 * </p>
 */
public class AwsCodeBuildProjectEnvironmentRegistryCredential implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) or name of credentials created using AWS
     * Secrets Manager.
     * </p>
     * <note>
     * <p>
     * The credential can use the name of the credentials only if they exist in
     * your current AWS Region.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String credential;

    /**
     * <p>
     * The service that created the credentials to access a private Docker
     * registry.
     * </p>
     * <p>
     * The valid value,<code> SECRETS_MANAGER</code>, is for AWS Secrets
     * Manager.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String credentialProvider;

    /**
     * <p>
     * The Amazon Resource Name (ARN) or name of credentials created using AWS
     * Secrets Manager.
     * </p>
     * <note>
     * <p>
     * The credential can use the name of the credentials only if they exist in
     * your current AWS Region.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) or name of credentials created
     *         using AWS Secrets Manager.
     *         </p>
     *         <note>
     *         <p>
     *         The credential can use the name of the credentials only if they
     *         exist in your current AWS Region.
     *         </p>
     *         </note>
     */
    public String getCredential() {
        return credential;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) or name of credentials created using AWS
     * Secrets Manager.
     * </p>
     * <note>
     * <p>
     * The credential can use the name of the credentials only if they exist in
     * your current AWS Region.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param credential <p>
     *            The Amazon Resource Name (ARN) or name of credentials created
     *            using AWS Secrets Manager.
     *            </p>
     *            <note>
     *            <p>
     *            The credential can use the name of the credentials only if
     *            they exist in your current AWS Region.
     *            </p>
     *            </note>
     */
    public void setCredential(String credential) {
        this.credential = credential;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) or name of credentials created using AWS
     * Secrets Manager.
     * </p>
     * <note>
     * <p>
     * The credential can use the name of the credentials only if they exist in
     * your current AWS Region.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param credential <p>
     *            The Amazon Resource Name (ARN) or name of credentials created
     *            using AWS Secrets Manager.
     *            </p>
     *            <note>
     *            <p>
     *            The credential can use the name of the credentials only if
     *            they exist in your current AWS Region.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsCodeBuildProjectEnvironmentRegistryCredential withCredential(String credential) {
        this.credential = credential;
        return this;
    }

    /**
     * <p>
     * The service that created the credentials to access a private Docker
     * registry.
     * </p>
     * <p>
     * The valid value,<code> SECRETS_MANAGER</code>, is for AWS Secrets
     * Manager.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The service that created the credentials to access a private
     *         Docker registry.
     *         </p>
     *         <p>
     *         The valid value,<code> SECRETS_MANAGER</code>, is for AWS Secrets
     *         Manager.
     *         </p>
     */
    public String getCredentialProvider() {
        return credentialProvider;
    }

    /**
     * <p>
     * The service that created the credentials to access a private Docker
     * registry.
     * </p>
     * <p>
     * The valid value,<code> SECRETS_MANAGER</code>, is for AWS Secrets
     * Manager.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param credentialProvider <p>
     *            The service that created the credentials to access a private
     *            Docker registry.
     *            </p>
     *            <p>
     *            The valid value,<code> SECRETS_MANAGER</code>, is for AWS
     *            Secrets Manager.
     *            </p>
     */
    public void setCredentialProvider(String credentialProvider) {
        this.credentialProvider = credentialProvider;
    }

    /**
     * <p>
     * The service that created the credentials to access a private Docker
     * registry.
     * </p>
     * <p>
     * The valid value,<code> SECRETS_MANAGER</code>, is for AWS Secrets
     * Manager.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param credentialProvider <p>
     *            The service that created the credentials to access a private
     *            Docker registry.
     *            </p>
     *            <p>
     *            The valid value,<code> SECRETS_MANAGER</code>, is for AWS
     *            Secrets Manager.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsCodeBuildProjectEnvironmentRegistryCredential withCredentialProvider(
            String credentialProvider) {
        this.credentialProvider = credentialProvider;
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
        if (getCredential() != null)
            sb.append("Credential: " + getCredential() + ",");
        if (getCredentialProvider() != null)
            sb.append("CredentialProvider: " + getCredentialProvider());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCredential() == null) ? 0 : getCredential().hashCode());
        hashCode = prime * hashCode
                + ((getCredentialProvider() == null) ? 0 : getCredentialProvider().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsCodeBuildProjectEnvironmentRegistryCredential == false)
            return false;
        AwsCodeBuildProjectEnvironmentRegistryCredential other = (AwsCodeBuildProjectEnvironmentRegistryCredential) obj;

        if (other.getCredential() == null ^ this.getCredential() == null)
            return false;
        if (other.getCredential() != null
                && other.getCredential().equals(this.getCredential()) == false)
            return false;
        if (other.getCredentialProvider() == null ^ this.getCredentialProvider() == null)
            return false;
        if (other.getCredentialProvider() != null
                && other.getCredentialProvider().equals(this.getCredentialProvider()) == false)
            return false;
        return true;
    }
}
