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

package com.amazonaws.services.kms.model;

import java.io.Serializable;

/**
 * <p>
 * Contains information about an entry in a list of grants.
 * </p>
 */
public class GrantListEntry implements Serializable {
    /**
     * <p>
     * The unique identifier for the customer master key (CMK) to which the
     * grant applies.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     */
    private String keyId;

    /**
     * <p>
     * The unique identifier for the grant.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     */
    private String grantId;

    /**
     * <p>
     * The friendly name that identifies the grant. If a name was provided in
     * the <a>CreateGrant</a> request, that name is returned. Otherwise this
     * value is null.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9:/_-]+$<br/>
     */
    private String name;

    /**
     * <p>
     * The date and time when the grant was created.
     * </p>
     */
    private java.util.Date creationDate;

    /**
     * <p>
     * The principal that receives the grant's permissions.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^[\w+=,.@:/-]+$<br/>
     */
    private String granteePrincipal;

    /**
     * <p>
     * The principal that can retire the grant.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^[\w+=,.@:/-]+$<br/>
     */
    private String retiringPrincipal;

    /**
     * <p>
     * The AWS account under which the grant was issued.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^[\w+=,.@:/-]+$<br/>
     */
    private String issuingAccount;

    /**
     * <p>
     * The list of operations permitted by the grant.
     * </p>
     */
    private java.util.List<String> operations = new java.util.ArrayList<String>();

    /**
     * <p>
     * A list of key-value pairs that must be present in the encryption context
     * of certain subsequent operations that the grant allows.
     * </p>
     */
    private GrantConstraints constraints;

    /**
     * <p>
     * The unique identifier for the customer master key (CMK) to which the
     * grant applies.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @return <p>
     *         The unique identifier for the customer master key (CMK) to which
     *         the grant applies.
     *         </p>
     */
    public String getKeyId() {
        return keyId;
    }

    /**
     * <p>
     * The unique identifier for the customer master key (CMK) to which the
     * grant applies.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param keyId <p>
     *            The unique identifier for the customer master key (CMK) to
     *            which the grant applies.
     *            </p>
     */
    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    /**
     * <p>
     * The unique identifier for the customer master key (CMK) to which the
     * grant applies.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param keyId <p>
     *            The unique identifier for the customer master key (CMK) to
     *            which the grant applies.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GrantListEntry withKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }

    /**
     * <p>
     * The unique identifier for the grant.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @return <p>
     *         The unique identifier for the grant.
     *         </p>
     */
    public String getGrantId() {
        return grantId;
    }

    /**
     * <p>
     * The unique identifier for the grant.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param grantId <p>
     *            The unique identifier for the grant.
     *            </p>
     */
    public void setGrantId(String grantId) {
        this.grantId = grantId;
    }

    /**
     * <p>
     * The unique identifier for the grant.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param grantId <p>
     *            The unique identifier for the grant.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GrantListEntry withGrantId(String grantId) {
        this.grantId = grantId;
        return this;
    }

    /**
     * <p>
     * The friendly name that identifies the grant. If a name was provided in
     * the <a>CreateGrant</a> request, that name is returned. Otherwise this
     * value is null.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9:/_-]+$<br/>
     *
     * @return <p>
     *         The friendly name that identifies the grant. If a name was
     *         provided in the <a>CreateGrant</a> request, that name is
     *         returned. Otherwise this value is null.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The friendly name that identifies the grant. If a name was provided in
     * the <a>CreateGrant</a> request, that name is returned. Otherwise this
     * value is null.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9:/_-]+$<br/>
     *
     * @param name <p>
     *            The friendly name that identifies the grant. If a name was
     *            provided in the <a>CreateGrant</a> request, that name is
     *            returned. Otherwise this value is null.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The friendly name that identifies the grant. If a name was provided in
     * the <a>CreateGrant</a> request, that name is returned. Otherwise this
     * value is null.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9:/_-]+$<br/>
     *
     * @param name <p>
     *            The friendly name that identifies the grant. If a name was
     *            provided in the <a>CreateGrant</a> request, that name is
     *            returned. Otherwise this value is null.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GrantListEntry withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The date and time when the grant was created.
     * </p>
     *
     * @return <p>
     *         The date and time when the grant was created.
     *         </p>
     */
    public java.util.Date getCreationDate() {
        return creationDate;
    }

    /**
     * <p>
     * The date and time when the grant was created.
     * </p>
     *
     * @param creationDate <p>
     *            The date and time when the grant was created.
     *            </p>
     */
    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date and time when the grant was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationDate <p>
     *            The date and time when the grant was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GrantListEntry withCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    /**
     * <p>
     * The principal that receives the grant's permissions.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^[\w+=,.@:/-]+$<br/>
     *
     * @return <p>
     *         The principal that receives the grant's permissions.
     *         </p>
     */
    public String getGranteePrincipal() {
        return granteePrincipal;
    }

    /**
     * <p>
     * The principal that receives the grant's permissions.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^[\w+=,.@:/-]+$<br/>
     *
     * @param granteePrincipal <p>
     *            The principal that receives the grant's permissions.
     *            </p>
     */
    public void setGranteePrincipal(String granteePrincipal) {
        this.granteePrincipal = granteePrincipal;
    }

    /**
     * <p>
     * The principal that receives the grant's permissions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^[\w+=,.@:/-]+$<br/>
     *
     * @param granteePrincipal <p>
     *            The principal that receives the grant's permissions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GrantListEntry withGranteePrincipal(String granteePrincipal) {
        this.granteePrincipal = granteePrincipal;
        return this;
    }

    /**
     * <p>
     * The principal that can retire the grant.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^[\w+=,.@:/-]+$<br/>
     *
     * @return <p>
     *         The principal that can retire the grant.
     *         </p>
     */
    public String getRetiringPrincipal() {
        return retiringPrincipal;
    }

    /**
     * <p>
     * The principal that can retire the grant.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^[\w+=,.@:/-]+$<br/>
     *
     * @param retiringPrincipal <p>
     *            The principal that can retire the grant.
     *            </p>
     */
    public void setRetiringPrincipal(String retiringPrincipal) {
        this.retiringPrincipal = retiringPrincipal;
    }

    /**
     * <p>
     * The principal that can retire the grant.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^[\w+=,.@:/-]+$<br/>
     *
     * @param retiringPrincipal <p>
     *            The principal that can retire the grant.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GrantListEntry withRetiringPrincipal(String retiringPrincipal) {
        this.retiringPrincipal = retiringPrincipal;
        return this;
    }

    /**
     * <p>
     * The AWS account under which the grant was issued.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^[\w+=,.@:/-]+$<br/>
     *
     * @return <p>
     *         The AWS account under which the grant was issued.
     *         </p>
     */
    public String getIssuingAccount() {
        return issuingAccount;
    }

    /**
     * <p>
     * The AWS account under which the grant was issued.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^[\w+=,.@:/-]+$<br/>
     *
     * @param issuingAccount <p>
     *            The AWS account under which the grant was issued.
     *            </p>
     */
    public void setIssuingAccount(String issuingAccount) {
        this.issuingAccount = issuingAccount;
    }

    /**
     * <p>
     * The AWS account under which the grant was issued.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^[\w+=,.@:/-]+$<br/>
     *
     * @param issuingAccount <p>
     *            The AWS account under which the grant was issued.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GrantListEntry withIssuingAccount(String issuingAccount) {
        this.issuingAccount = issuingAccount;
        return this;
    }

    /**
     * <p>
     * The list of operations permitted by the grant.
     * </p>
     *
     * @return <p>
     *         The list of operations permitted by the grant.
     *         </p>
     */
    public java.util.List<String> getOperations() {
        return operations;
    }

    /**
     * <p>
     * The list of operations permitted by the grant.
     * </p>
     *
     * @param operations <p>
     *            The list of operations permitted by the grant.
     *            </p>
     */
    public void setOperations(java.util.Collection<String> operations) {
        if (operations == null) {
            this.operations = null;
            return;
        }

        this.operations = new java.util.ArrayList<String>(operations);
    }

    /**
     * <p>
     * The list of operations permitted by the grant.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param operations <p>
     *            The list of operations permitted by the grant.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GrantListEntry withOperations(String... operations) {
        if (getOperations() == null) {
            this.operations = new java.util.ArrayList<String>(operations.length);
        }
        for (String value : operations) {
            this.operations.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of operations permitted by the grant.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param operations <p>
     *            The list of operations permitted by the grant.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GrantListEntry withOperations(java.util.Collection<String> operations) {
        setOperations(operations);
        return this;
    }

    /**
     * <p>
     * A list of key-value pairs that must be present in the encryption context
     * of certain subsequent operations that the grant allows.
     * </p>
     *
     * @return <p>
     *         A list of key-value pairs that must be present in the encryption
     *         context of certain subsequent operations that the grant allows.
     *         </p>
     */
    public GrantConstraints getConstraints() {
        return constraints;
    }

    /**
     * <p>
     * A list of key-value pairs that must be present in the encryption context
     * of certain subsequent operations that the grant allows.
     * </p>
     *
     * @param constraints <p>
     *            A list of key-value pairs that must be present in the
     *            encryption context of certain subsequent operations that the
     *            grant allows.
     *            </p>
     */
    public void setConstraints(GrantConstraints constraints) {
        this.constraints = constraints;
    }

    /**
     * <p>
     * A list of key-value pairs that must be present in the encryption context
     * of certain subsequent operations that the grant allows.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param constraints <p>
     *            A list of key-value pairs that must be present in the
     *            encryption context of certain subsequent operations that the
     *            grant allows.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GrantListEntry withConstraints(GrantConstraints constraints) {
        this.constraints = constraints;
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
        if (getKeyId() != null)
            sb.append("KeyId: " + getKeyId() + ",");
        if (getGrantId() != null)
            sb.append("GrantId: " + getGrantId() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getCreationDate() != null)
            sb.append("CreationDate: " + getCreationDate() + ",");
        if (getGranteePrincipal() != null)
            sb.append("GranteePrincipal: " + getGranteePrincipal() + ",");
        if (getRetiringPrincipal() != null)
            sb.append("RetiringPrincipal: " + getRetiringPrincipal() + ",");
        if (getIssuingAccount() != null)
            sb.append("IssuingAccount: " + getIssuingAccount() + ",");
        if (getOperations() != null)
            sb.append("Operations: " + getOperations() + ",");
        if (getConstraints() != null)
            sb.append("Constraints: " + getConstraints());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyId() == null) ? 0 : getKeyId().hashCode());
        hashCode = prime * hashCode + ((getGrantId() == null) ? 0 : getGrantId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode
                + ((getGranteePrincipal() == null) ? 0 : getGranteePrincipal().hashCode());
        hashCode = prime * hashCode
                + ((getRetiringPrincipal() == null) ? 0 : getRetiringPrincipal().hashCode());
        hashCode = prime * hashCode
                + ((getIssuingAccount() == null) ? 0 : getIssuingAccount().hashCode());
        hashCode = prime * hashCode + ((getOperations() == null) ? 0 : getOperations().hashCode());
        hashCode = prime * hashCode
                + ((getConstraints() == null) ? 0 : getConstraints().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GrantListEntry == false)
            return false;
        GrantListEntry other = (GrantListEntry) obj;

        if (other.getKeyId() == null ^ this.getKeyId() == null)
            return false;
        if (other.getKeyId() != null && other.getKeyId().equals(this.getKeyId()) == false)
            return false;
        if (other.getGrantId() == null ^ this.getGrantId() == null)
            return false;
        if (other.getGrantId() != null && other.getGrantId().equals(this.getGrantId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null
                && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getGranteePrincipal() == null ^ this.getGranteePrincipal() == null)
            return false;
        if (other.getGranteePrincipal() != null
                && other.getGranteePrincipal().equals(this.getGranteePrincipal()) == false)
            return false;
        if (other.getRetiringPrincipal() == null ^ this.getRetiringPrincipal() == null)
            return false;
        if (other.getRetiringPrincipal() != null
                && other.getRetiringPrincipal().equals(this.getRetiringPrincipal()) == false)
            return false;
        if (other.getIssuingAccount() == null ^ this.getIssuingAccount() == null)
            return false;
        if (other.getIssuingAccount() != null
                && other.getIssuingAccount().equals(this.getIssuingAccount()) == false)
            return false;
        if (other.getOperations() == null ^ this.getOperations() == null)
            return false;
        if (other.getOperations() != null
                && other.getOperations().equals(this.getOperations()) == false)
            return false;
        if (other.getConstraints() == null ^ this.getConstraints() == null)
            return false;
        if (other.getConstraints() != null
                && other.getConstraints().equals(this.getConstraints()) == false)
            return false;
        return true;
    }
}
