/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * This API is in preview release for Amazon Connect and is subject to change.
 * </p>
 * <p>
 * Initiates an Amazon Connect instance with all the supported channels enabled.
 * It does not attach any storage, such as Amazon Simple Storage Service (Amazon
 * S3) or Amazon Kinesis. It also does not allow for any configurations on
 * features, such as Contact Lens for Amazon Connect.
 * </p>
 * <p>
 * Amazon Connect enforces a limit on the total number of instances that you can
 * create or delete in 30 days. If you exceed this limit, you will get an error
 * message indicating there has been an excessive number of attempts at creating
 * or deleting instances. You must wait 30 days before you can restart creating
 * and deleting instances in your account.
 * </p>
 */
public class CreateInstanceRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The idempotency token.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     */
    private String clientToken;

    /**
     * <p>
     * The type of identity management for your Amazon Connect users.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SAML, CONNECT_MANAGED, EXISTING_DIRECTORY
     */
    private String identityManagementType;

    /**
     * <p>
     * The name for your instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 62<br/>
     * <b>Pattern: </b>^(?!d-)([\da-zA-Z]+)([-]*[\da-zA-Z])*$<br/>
     */
    private String instanceAlias;

    /**
     * <p>
     * The identifier for the directory.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>^d-[0-9a-f]{10}$<br/>
     */
    private String directoryId;

    /**
     * <p>
     * Your contact center handles incoming contacts.
     * </p>
     */
    private Boolean inboundCallsEnabled;

    /**
     * <p>
     * Your contact center allows outbound calls.
     * </p>
     */
    private Boolean outboundCallsEnabled;

    /**
     * <p>
     * The idempotency token.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     *
     * @return <p>
     *         The idempotency token.
     *         </p>
     */
    public String getClientToken() {
        return clientToken;
    }

    /**
     * <p>
     * The idempotency token.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     *
     * @param clientToken <p>
     *            The idempotency token.
     *            </p>
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * The idempotency token.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     *
     * @param clientToken <p>
     *            The idempotency token.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateInstanceRequest withClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    /**
     * <p>
     * The type of identity management for your Amazon Connect users.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SAML, CONNECT_MANAGED, EXISTING_DIRECTORY
     *
     * @return <p>
     *         The type of identity management for your Amazon Connect users.
     *         </p>
     * @see DirectoryType
     */
    public String getIdentityManagementType() {
        return identityManagementType;
    }

    /**
     * <p>
     * The type of identity management for your Amazon Connect users.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SAML, CONNECT_MANAGED, EXISTING_DIRECTORY
     *
     * @param identityManagementType <p>
     *            The type of identity management for your Amazon Connect users.
     *            </p>
     * @see DirectoryType
     */
    public void setIdentityManagementType(String identityManagementType) {
        this.identityManagementType = identityManagementType;
    }

    /**
     * <p>
     * The type of identity management for your Amazon Connect users.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SAML, CONNECT_MANAGED, EXISTING_DIRECTORY
     *
     * @param identityManagementType <p>
     *            The type of identity management for your Amazon Connect users.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DirectoryType
     */
    public CreateInstanceRequest withIdentityManagementType(String identityManagementType) {
        this.identityManagementType = identityManagementType;
        return this;
    }

    /**
     * <p>
     * The type of identity management for your Amazon Connect users.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SAML, CONNECT_MANAGED, EXISTING_DIRECTORY
     *
     * @param identityManagementType <p>
     *            The type of identity management for your Amazon Connect users.
     *            </p>
     * @see DirectoryType
     */
    public void setIdentityManagementType(DirectoryType identityManagementType) {
        this.identityManagementType = identityManagementType.toString();
    }

    /**
     * <p>
     * The type of identity management for your Amazon Connect users.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SAML, CONNECT_MANAGED, EXISTING_DIRECTORY
     *
     * @param identityManagementType <p>
     *            The type of identity management for your Amazon Connect users.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DirectoryType
     */
    public CreateInstanceRequest withIdentityManagementType(DirectoryType identityManagementType) {
        this.identityManagementType = identityManagementType.toString();
        return this;
    }

    /**
     * <p>
     * The name for your instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 62<br/>
     * <b>Pattern: </b>^(?!d-)([\da-zA-Z]+)([-]*[\da-zA-Z])*$<br/>
     *
     * @return <p>
     *         The name for your instance.
     *         </p>
     */
    public String getInstanceAlias() {
        return instanceAlias;
    }

    /**
     * <p>
     * The name for your instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 62<br/>
     * <b>Pattern: </b>^(?!d-)([\da-zA-Z]+)([-]*[\da-zA-Z])*$<br/>
     *
     * @param instanceAlias <p>
     *            The name for your instance.
     *            </p>
     */
    public void setInstanceAlias(String instanceAlias) {
        this.instanceAlias = instanceAlias;
    }

    /**
     * <p>
     * The name for your instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 62<br/>
     * <b>Pattern: </b>^(?!d-)([\da-zA-Z]+)([-]*[\da-zA-Z])*$<br/>
     *
     * @param instanceAlias <p>
     *            The name for your instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateInstanceRequest withInstanceAlias(String instanceAlias) {
        this.instanceAlias = instanceAlias;
        return this;
    }

    /**
     * <p>
     * The identifier for the directory.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>^d-[0-9a-f]{10}$<br/>
     *
     * @return <p>
     *         The identifier for the directory.
     *         </p>
     */
    public String getDirectoryId() {
        return directoryId;
    }

    /**
     * <p>
     * The identifier for the directory.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>^d-[0-9a-f]{10}$<br/>
     *
     * @param directoryId <p>
     *            The identifier for the directory.
     *            </p>
     */
    public void setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
    }

    /**
     * <p>
     * The identifier for the directory.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>^d-[0-9a-f]{10}$<br/>
     *
     * @param directoryId <p>
     *            The identifier for the directory.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateInstanceRequest withDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }

    /**
     * <p>
     * Your contact center handles incoming contacts.
     * </p>
     *
     * @return <p>
     *         Your contact center handles incoming contacts.
     *         </p>
     */
    public Boolean isInboundCallsEnabled() {
        return inboundCallsEnabled;
    }

    /**
     * <p>
     * Your contact center handles incoming contacts.
     * </p>
     *
     * @return <p>
     *         Your contact center handles incoming contacts.
     *         </p>
     */
    public Boolean getInboundCallsEnabled() {
        return inboundCallsEnabled;
    }

    /**
     * <p>
     * Your contact center handles incoming contacts.
     * </p>
     *
     * @param inboundCallsEnabled <p>
     *            Your contact center handles incoming contacts.
     *            </p>
     */
    public void setInboundCallsEnabled(Boolean inboundCallsEnabled) {
        this.inboundCallsEnabled = inboundCallsEnabled;
    }

    /**
     * <p>
     * Your contact center handles incoming contacts.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inboundCallsEnabled <p>
     *            Your contact center handles incoming contacts.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateInstanceRequest withInboundCallsEnabled(Boolean inboundCallsEnabled) {
        this.inboundCallsEnabled = inboundCallsEnabled;
        return this;
    }

    /**
     * <p>
     * Your contact center allows outbound calls.
     * </p>
     *
     * @return <p>
     *         Your contact center allows outbound calls.
     *         </p>
     */
    public Boolean isOutboundCallsEnabled() {
        return outboundCallsEnabled;
    }

    /**
     * <p>
     * Your contact center allows outbound calls.
     * </p>
     *
     * @return <p>
     *         Your contact center allows outbound calls.
     *         </p>
     */
    public Boolean getOutboundCallsEnabled() {
        return outboundCallsEnabled;
    }

    /**
     * <p>
     * Your contact center allows outbound calls.
     * </p>
     *
     * @param outboundCallsEnabled <p>
     *            Your contact center allows outbound calls.
     *            </p>
     */
    public void setOutboundCallsEnabled(Boolean outboundCallsEnabled) {
        this.outboundCallsEnabled = outboundCallsEnabled;
    }

    /**
     * <p>
     * Your contact center allows outbound calls.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param outboundCallsEnabled <p>
     *            Your contact center allows outbound calls.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateInstanceRequest withOutboundCallsEnabled(Boolean outboundCallsEnabled) {
        this.outboundCallsEnabled = outboundCallsEnabled;
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
        if (getClientToken() != null)
            sb.append("ClientToken: " + getClientToken() + ",");
        if (getIdentityManagementType() != null)
            sb.append("IdentityManagementType: " + getIdentityManagementType() + ",");
        if (getInstanceAlias() != null)
            sb.append("InstanceAlias: " + getInstanceAlias() + ",");
        if (getDirectoryId() != null)
            sb.append("DirectoryId: " + getDirectoryId() + ",");
        if (getInboundCallsEnabled() != null)
            sb.append("InboundCallsEnabled: " + getInboundCallsEnabled() + ",");
        if (getOutboundCallsEnabled() != null)
            sb.append("OutboundCallsEnabled: " + getOutboundCallsEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime
                * hashCode
                + ((getIdentityManagementType() == null) ? 0 : getIdentityManagementType()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getInstanceAlias() == null) ? 0 : getInstanceAlias().hashCode());
        hashCode = prime * hashCode
                + ((getDirectoryId() == null) ? 0 : getDirectoryId().hashCode());
        hashCode = prime * hashCode
                + ((getInboundCallsEnabled() == null) ? 0 : getInboundCallsEnabled().hashCode());
        hashCode = prime * hashCode
                + ((getOutboundCallsEnabled() == null) ? 0 : getOutboundCallsEnabled().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateInstanceRequest == false)
            return false;
        CreateInstanceRequest other = (CreateInstanceRequest) obj;

        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null
                && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getIdentityManagementType() == null ^ this.getIdentityManagementType() == null)
            return false;
        if (other.getIdentityManagementType() != null
                && other.getIdentityManagementType().equals(this.getIdentityManagementType()) == false)
            return false;
        if (other.getInstanceAlias() == null ^ this.getInstanceAlias() == null)
            return false;
        if (other.getInstanceAlias() != null
                && other.getInstanceAlias().equals(this.getInstanceAlias()) == false)
            return false;
        if (other.getDirectoryId() == null ^ this.getDirectoryId() == null)
            return false;
        if (other.getDirectoryId() != null
                && other.getDirectoryId().equals(this.getDirectoryId()) == false)
            return false;
        if (other.getInboundCallsEnabled() == null ^ this.getInboundCallsEnabled() == null)
            return false;
        if (other.getInboundCallsEnabled() != null
                && other.getInboundCallsEnabled().equals(this.getInboundCallsEnabled()) == false)
            return false;
        if (other.getOutboundCallsEnabled() == null ^ this.getOutboundCallsEnabled() == null)
            return false;
        if (other.getOutboundCallsEnabled() != null
                && other.getOutboundCallsEnabled().equals(this.getOutboundCallsEnabled()) == false)
            return false;
        return true;
    }
}
