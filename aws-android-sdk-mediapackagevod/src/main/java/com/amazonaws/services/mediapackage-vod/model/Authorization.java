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
package com.amazonaws.services.mediapackage-vod.model;

import java.io.Serializable;


/**
 * CDN Authorization credentials
 */
public class Authorization implements Serializable {
    /**
     * The Amazon Resource Name (ARN) for the secret in AWS Secrets Manager that is used for CDN authorization.
     */
    private String cdnIdentifierSecret;

    /**
     * The Amazon Resource Name (ARN) for the IAM role that allows MediaPackage to communicate with AWS Secrets Manager.
     */
    private String secretsRoleArn;

    /**
     * The Amazon Resource Name (ARN) for the secret in AWS Secrets Manager that is used for CDN authorization.
     *
     * @return The Amazon Resource Name (ARN) for the secret in AWS Secrets Manager that is used for CDN authorization.
     */
    public String getCdnIdentifierSecret() {
        return cdnIdentifierSecret;
    }

    /**
     * The Amazon Resource Name (ARN) for the secret in AWS Secrets Manager that is used for CDN authorization.
     *
     * @param cdnIdentifierSecret The Amazon Resource Name (ARN) for the secret in AWS Secrets Manager that is used for CDN authorization.
     */
    public void setCdnIdentifierSecret(String cdnIdentifierSecret) {
        this.cdnIdentifierSecret = cdnIdentifierSecret;
    }

    /**
     * The Amazon Resource Name (ARN) for the secret in AWS Secrets Manager that is used for CDN authorization.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cdnIdentifierSecret The Amazon Resource Name (ARN) for the secret in AWS Secrets Manager that is used for CDN authorization.
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public Authorization withCdnIdentifierSecret(String cdnIdentifierSecret) {
        this.cdnIdentifierSecret = cdnIdentifierSecret;
        return this;
    }

    /**
     * The Amazon Resource Name (ARN) for the IAM role that allows MediaPackage to communicate with AWS Secrets Manager.
     *
     * @return The Amazon Resource Name (ARN) for the IAM role that allows MediaPackage to communicate with AWS Secrets Manager.
     */
    public String getSecretsRoleArn() {
        return secretsRoleArn;
    }

    /**
     * The Amazon Resource Name (ARN) for the IAM role that allows MediaPackage to communicate with AWS Secrets Manager.
     *
     * @param secretsRoleArn The Amazon Resource Name (ARN) for the IAM role that allows MediaPackage to communicate with AWS Secrets Manager.
     */
    public void setSecretsRoleArn(String secretsRoleArn) {
        this.secretsRoleArn = secretsRoleArn;
    }

    /**
     * The Amazon Resource Name (ARN) for the IAM role that allows MediaPackage to communicate with AWS Secrets Manager.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param secretsRoleArn The Amazon Resource Name (ARN) for the IAM role that allows MediaPackage to communicate with AWS Secrets Manager.
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public Authorization withSecretsRoleArn(String secretsRoleArn) {
        this.secretsRoleArn = secretsRoleArn;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCdnIdentifierSecret() != null) sb.append("CdnIdentifierSecret: " + getCdnIdentifierSecret() + ",");
        if (getSecretsRoleArn() != null) sb.append("SecretsRoleArn: " + getSecretsRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCdnIdentifierSecret() == null) ? 0 : getCdnIdentifierSecret().hashCode());
        hashCode = prime * hashCode + ((getSecretsRoleArn() == null) ? 0 : getSecretsRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Authorization == false) return false;
        Authorization other = (Authorization)obj;

        if (other.getCdnIdentifierSecret() == null ^ this.getCdnIdentifierSecret() == null) return false;
        if (other.getCdnIdentifierSecret() != null && other.getCdnIdentifierSecret().equals(this.getCdnIdentifierSecret()) == false) return false;
        if (other.getSecretsRoleArn() == null ^ this.getSecretsRoleArn() == null) return false;
        if (other.getSecretsRoleArn() != null && other.getSecretsRoleArn().equals(this.getSecretsRoleArn()) == false) return false;
        return true;
    }
}
