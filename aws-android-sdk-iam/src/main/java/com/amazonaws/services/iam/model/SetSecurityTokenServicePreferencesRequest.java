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

package com.amazonaws.services.iam.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Sets the specified version of the global endpoint token as the token version
 * used for the AWS account.
 * </p>
 * <p>
 * By default, AWS Security Token Service (STS) is available as a global
 * service, and all STS requests go to a single endpoint at
 * <code>https://sts.amazonaws.com</code>. AWS recommends using Regional STS
 * endpoints to reduce latency, build in redundancy, and increase session token
 * availability. For information about Regional endpoints for STS, see <a
 * href="https://docs.aws.amazon.com/general/latest/gr/rande.html#sts_region"
 * >AWS Regions and Endpoints</a> in the <i>AWS General Reference</i>.
 * </p>
 * <p>
 * If you make an STS call to the global endpoint, the resulting session tokens
 * might be valid in some Regions but not others. It depends on the version that
 * is set in this operation. Version 1 tokens are valid only in AWS Regions that
 * are available by default. These tokens do not work in manually enabled
 * Regions, such as Asia Pacific (Hong Kong). Version 2 tokens are valid in all
 * Regions. However, version 2 tokens are longer and might affect systems where
 * you temporarily store tokens. For information, see <a href=
 * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_enable-regions.html"
 * >Activating and Deactivating STS in an AWS Region</a> in the <i>IAM User
 * Guide</i>.
 * </p>
 * <p>
 * To view the current session token version, see the
 * <code>GlobalEndpointTokenVersion</code> entry in the response of the
 * <a>GetAccountSummary</a> operation.
 * </p>
 */
public class SetSecurityTokenServicePreferencesRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The version of the global endpoint token. Version 1 tokens are valid only
     * in AWS Regions that are available by default. These tokens do not work in
     * manually enabled Regions, such as Asia Pacific (Hong Kong). Version 2
     * tokens are valid in all Regions. However, version 2 tokens are longer and
     * might affect systems where you temporarily store tokens.
     * </p>
     * <p>
     * For information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_enable-regions.html"
     * >Activating and Deactivating STS in an AWS Region</a> in the <i>IAM User
     * Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>v1Token, v2Token
     */
    private String globalEndpointTokenVersion;

    /**
     * <p>
     * The version of the global endpoint token. Version 1 tokens are valid only
     * in AWS Regions that are available by default. These tokens do not work in
     * manually enabled Regions, such as Asia Pacific (Hong Kong). Version 2
     * tokens are valid in all Regions. However, version 2 tokens are longer and
     * might affect systems where you temporarily store tokens.
     * </p>
     * <p>
     * For information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_enable-regions.html"
     * >Activating and Deactivating STS in an AWS Region</a> in the <i>IAM User
     * Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>v1Token, v2Token
     *
     * @return <p>
     *         The version of the global endpoint token. Version 1 tokens are
     *         valid only in AWS Regions that are available by default. These
     *         tokens do not work in manually enabled Regions, such as Asia
     *         Pacific (Hong Kong). Version 2 tokens are valid in all Regions.
     *         However, version 2 tokens are longer and might affect systems
     *         where you temporarily store tokens.
     *         </p>
     *         <p>
     *         For information, see <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_enable-regions.html"
     *         >Activating and Deactivating STS in an AWS Region</a> in the
     *         <i>IAM User Guide</i>.
     *         </p>
     * @see GlobalEndpointTokenVersion
     */
    public String getGlobalEndpointTokenVersion() {
        return globalEndpointTokenVersion;
    }

    /**
     * <p>
     * The version of the global endpoint token. Version 1 tokens are valid only
     * in AWS Regions that are available by default. These tokens do not work in
     * manually enabled Regions, such as Asia Pacific (Hong Kong). Version 2
     * tokens are valid in all Regions. However, version 2 tokens are longer and
     * might affect systems where you temporarily store tokens.
     * </p>
     * <p>
     * For information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_enable-regions.html"
     * >Activating and Deactivating STS in an AWS Region</a> in the <i>IAM User
     * Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>v1Token, v2Token
     *
     * @param globalEndpointTokenVersion <p>
     *            The version of the global endpoint token. Version 1 tokens are
     *            valid only in AWS Regions that are available by default. These
     *            tokens do not work in manually enabled Regions, such as Asia
     *            Pacific (Hong Kong). Version 2 tokens are valid in all
     *            Regions. However, version 2 tokens are longer and might affect
     *            systems where you temporarily store tokens.
     *            </p>
     *            <p>
     *            For information, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_enable-regions.html"
     *            >Activating and Deactivating STS in an AWS Region</a> in the
     *            <i>IAM User Guide</i>.
     *            </p>
     * @see GlobalEndpointTokenVersion
     */
    public void setGlobalEndpointTokenVersion(String globalEndpointTokenVersion) {
        this.globalEndpointTokenVersion = globalEndpointTokenVersion;
    }

    /**
     * <p>
     * The version of the global endpoint token. Version 1 tokens are valid only
     * in AWS Regions that are available by default. These tokens do not work in
     * manually enabled Regions, such as Asia Pacific (Hong Kong). Version 2
     * tokens are valid in all Regions. However, version 2 tokens are longer and
     * might affect systems where you temporarily store tokens.
     * </p>
     * <p>
     * For information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_enable-regions.html"
     * >Activating and Deactivating STS in an AWS Region</a> in the <i>IAM User
     * Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>v1Token, v2Token
     *
     * @param globalEndpointTokenVersion <p>
     *            The version of the global endpoint token. Version 1 tokens are
     *            valid only in AWS Regions that are available by default. These
     *            tokens do not work in manually enabled Regions, such as Asia
     *            Pacific (Hong Kong). Version 2 tokens are valid in all
     *            Regions. However, version 2 tokens are longer and might affect
     *            systems where you temporarily store tokens.
     *            </p>
     *            <p>
     *            For information, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_enable-regions.html"
     *            >Activating and Deactivating STS in an AWS Region</a> in the
     *            <i>IAM User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see GlobalEndpointTokenVersion
     */
    public SetSecurityTokenServicePreferencesRequest withGlobalEndpointTokenVersion(
            String globalEndpointTokenVersion) {
        this.globalEndpointTokenVersion = globalEndpointTokenVersion;
        return this;
    }

    /**
     * <p>
     * The version of the global endpoint token. Version 1 tokens are valid only
     * in AWS Regions that are available by default. These tokens do not work in
     * manually enabled Regions, such as Asia Pacific (Hong Kong). Version 2
     * tokens are valid in all Regions. However, version 2 tokens are longer and
     * might affect systems where you temporarily store tokens.
     * </p>
     * <p>
     * For information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_enable-regions.html"
     * >Activating and Deactivating STS in an AWS Region</a> in the <i>IAM User
     * Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>v1Token, v2Token
     *
     * @param globalEndpointTokenVersion <p>
     *            The version of the global endpoint token. Version 1 tokens are
     *            valid only in AWS Regions that are available by default. These
     *            tokens do not work in manually enabled Regions, such as Asia
     *            Pacific (Hong Kong). Version 2 tokens are valid in all
     *            Regions. However, version 2 tokens are longer and might affect
     *            systems where you temporarily store tokens.
     *            </p>
     *            <p>
     *            For information, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_enable-regions.html"
     *            >Activating and Deactivating STS in an AWS Region</a> in the
     *            <i>IAM User Guide</i>.
     *            </p>
     * @see GlobalEndpointTokenVersion
     */
    public void setGlobalEndpointTokenVersion(GlobalEndpointTokenVersion globalEndpointTokenVersion) {
        this.globalEndpointTokenVersion = globalEndpointTokenVersion.toString();
    }

    /**
     * <p>
     * The version of the global endpoint token. Version 1 tokens are valid only
     * in AWS Regions that are available by default. These tokens do not work in
     * manually enabled Regions, such as Asia Pacific (Hong Kong). Version 2
     * tokens are valid in all Regions. However, version 2 tokens are longer and
     * might affect systems where you temporarily store tokens.
     * </p>
     * <p>
     * For information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_enable-regions.html"
     * >Activating and Deactivating STS in an AWS Region</a> in the <i>IAM User
     * Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>v1Token, v2Token
     *
     * @param globalEndpointTokenVersion <p>
     *            The version of the global endpoint token. Version 1 tokens are
     *            valid only in AWS Regions that are available by default. These
     *            tokens do not work in manually enabled Regions, such as Asia
     *            Pacific (Hong Kong). Version 2 tokens are valid in all
     *            Regions. However, version 2 tokens are longer and might affect
     *            systems where you temporarily store tokens.
     *            </p>
     *            <p>
     *            For information, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_enable-regions.html"
     *            >Activating and Deactivating STS in an AWS Region</a> in the
     *            <i>IAM User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see GlobalEndpointTokenVersion
     */
    public SetSecurityTokenServicePreferencesRequest withGlobalEndpointTokenVersion(
            GlobalEndpointTokenVersion globalEndpointTokenVersion) {
        this.globalEndpointTokenVersion = globalEndpointTokenVersion.toString();
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
        if (getGlobalEndpointTokenVersion() != null)
            sb.append("GlobalEndpointTokenVersion: " + getGlobalEndpointTokenVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getGlobalEndpointTokenVersion() == null) ? 0 : getGlobalEndpointTokenVersion()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SetSecurityTokenServicePreferencesRequest == false)
            return false;
        SetSecurityTokenServicePreferencesRequest other = (SetSecurityTokenServicePreferencesRequest) obj;

        if (other.getGlobalEndpointTokenVersion() == null
                ^ this.getGlobalEndpointTokenVersion() == null)
            return false;
        if (other.getGlobalEndpointTokenVersion() != null
                && other.getGlobalEndpointTokenVersion().equals(
                        this.getGlobalEndpointTokenVersion()) == false)
            return false;
        return true;
    }
}
