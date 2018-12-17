/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Gets a list of all aliases in the caller's AWS account and region. You cannot
 * list aliases in other accounts. For more information about aliases, see
 * <a>CreateAlias</a>.
 * </p>
 * <p>
 * By default, the <code>ListAliases</code> command returns all aliases in the
 * account and region. To get only the aliases that point to a particular
 * customer master key (CMK), use the <code>KeyId</code> parameter.
 * </p>
 * <p>
 * The <code>ListAliases</code> response might include several aliases have no
 * <code>TargetKeyId</code> field. These are predefined aliases that AWS has
 * created but has not yet associated with a CMK. Aliases that AWS creates in
 * your account, including predefined aliases, do not count against your <a
 * href=
 * "http://docs.aws.amazon.com/kms/latest/developerguide/limits.html#aliases-limit"
 * >AWS KMS aliases limit</a>.
 * </p>
 */
public class ListAliasesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Lists only aliases that refer to the specified CMK. The value of this
     * parameter can be the ID or Amazon Resource Name (ARN) of a CMK in the
     * caller's account and region. You cannot use an alias name or alias ARN in
     * this value.
     * </p>
     * <p>
     * This parameter is optional. If you omit it, <code>ListAliases</code>
     * returns all aliases in the account and region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     */
    private String keyId;

    /**
     * <p>
     * Use this parameter to specify the maximum number of items to return. When
     * this value is present, AWS KMS does not return more than the specified
     * number of items, but it might return fewer.
     * </p>
     * <p>
     * This value is optional. If you include a value, it must be between 1 and
     * 100, inclusive. If you do not include a value, it defaults to 50.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     */
    private Integer limit;

    /**
     * <p>
     * Use this parameter in a subsequent request after you receive a response
     * with truncated results. Set it to the value of <code>NextMarker</code>
     * from the truncated response you just received.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[ -\u00FF]*<br/>
     */
    private String marker;

    /**
     * <p>
     * Lists only aliases that refer to the specified CMK. The value of this
     * parameter can be the ID or Amazon Resource Name (ARN) of a CMK in the
     * caller's account and region. You cannot use an alias name or alias ARN in
     * this value.
     * </p>
     * <p>
     * This parameter is optional. If you omit it, <code>ListAliases</code>
     * returns all aliases in the account and region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @return <p>
     *         Lists only aliases that refer to the specified CMK. The value of
     *         this parameter can be the ID or Amazon Resource Name (ARN) of a
     *         CMK in the caller's account and region. You cannot use an alias
     *         name or alias ARN in this value.
     *         </p>
     *         <p>
     *         This parameter is optional. If you omit it,
     *         <code>ListAliases</code> returns all aliases in the account and
     *         region.
     *         </p>
     */
    public String getKeyId() {
        return keyId;
    }

    /**
     * <p>
     * Lists only aliases that refer to the specified CMK. The value of this
     * parameter can be the ID or Amazon Resource Name (ARN) of a CMK in the
     * caller's account and region. You cannot use an alias name or alias ARN in
     * this value.
     * </p>
     * <p>
     * This parameter is optional. If you omit it, <code>ListAliases</code>
     * returns all aliases in the account and region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param keyId <p>
     *            Lists only aliases that refer to the specified CMK. The value
     *            of this parameter can be the ID or Amazon Resource Name (ARN)
     *            of a CMK in the caller's account and region. You cannot use an
     *            alias name or alias ARN in this value.
     *            </p>
     *            <p>
     *            This parameter is optional. If you omit it,
     *            <code>ListAliases</code> returns all aliases in the account
     *            and region.
     *            </p>
     */
    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    /**
     * <p>
     * Lists only aliases that refer to the specified CMK. The value of this
     * parameter can be the ID or Amazon Resource Name (ARN) of a CMK in the
     * caller's account and region. You cannot use an alias name or alias ARN in
     * this value.
     * </p>
     * <p>
     * This parameter is optional. If you omit it, <code>ListAliases</code>
     * returns all aliases in the account and region.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param keyId <p>
     *            Lists only aliases that refer to the specified CMK. The value
     *            of this parameter can be the ID or Amazon Resource Name (ARN)
     *            of a CMK in the caller's account and region. You cannot use an
     *            alias name or alias ARN in this value.
     *            </p>
     *            <p>
     *            This parameter is optional. If you omit it,
     *            <code>ListAliases</code> returns all aliases in the account
     *            and region.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAliasesRequest withKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }

    /**
     * <p>
     * Use this parameter to specify the maximum number of items to return. When
     * this value is present, AWS KMS does not return more than the specified
     * number of items, but it might return fewer.
     * </p>
     * <p>
     * This value is optional. If you include a value, it must be between 1 and
     * 100, inclusive. If you do not include a value, it defaults to 50.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @return <p>
     *         Use this parameter to specify the maximum number of items to
     *         return. When this value is present, AWS KMS does not return more
     *         than the specified number of items, but it might return fewer.
     *         </p>
     *         <p>
     *         This value is optional. If you include a value, it must be
     *         between 1 and 100, inclusive. If you do not include a value, it
     *         defaults to 50.
     *         </p>
     */
    public Integer getLimit() {
        return limit;
    }

    /**
     * <p>
     * Use this parameter to specify the maximum number of items to return. When
     * this value is present, AWS KMS does not return more than the specified
     * number of items, but it might return fewer.
     * </p>
     * <p>
     * This value is optional. If you include a value, it must be between 1 and
     * 100, inclusive. If you do not include a value, it defaults to 50.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param limit <p>
     *            Use this parameter to specify the maximum number of items to
     *            return. When this value is present, AWS KMS does not return
     *            more than the specified number of items, but it might return
     *            fewer.
     *            </p>
     *            <p>
     *            This value is optional. If you include a value, it must be
     *            between 1 and 100, inclusive. If you do not include a value,
     *            it defaults to 50.
     *            </p>
     */
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * Use this parameter to specify the maximum number of items to return. When
     * this value is present, AWS KMS does not return more than the specified
     * number of items, but it might return fewer.
     * </p>
     * <p>
     * This value is optional. If you include a value, it must be between 1 and
     * 100, inclusive. If you do not include a value, it defaults to 50.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param limit <p>
     *            Use this parameter to specify the maximum number of items to
     *            return. When this value is present, AWS KMS does not return
     *            more than the specified number of items, but it might return
     *            fewer.
     *            </p>
     *            <p>
     *            This value is optional. If you include a value, it must be
     *            between 1 and 100, inclusive. If you do not include a value,
     *            it defaults to 50.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAliasesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * <p>
     * Use this parameter in a subsequent request after you receive a response
     * with truncated results. Set it to the value of <code>NextMarker</code>
     * from the truncated response you just received.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[ -\u00FF]*<br/>
     *
     * @return <p>
     *         Use this parameter in a subsequent request after you receive a
     *         response with truncated results. Set it to the value of
     *         <code>NextMarker</code> from the truncated response you just
     *         received.
     *         </p>
     */
    public String getMarker() {
        return marker;
    }

    /**
     * <p>
     * Use this parameter in a subsequent request after you receive a response
     * with truncated results. Set it to the value of <code>NextMarker</code>
     * from the truncated response you just received.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[ -\u00FF]*<br/>
     *
     * @param marker <p>
     *            Use this parameter in a subsequent request after you receive a
     *            response with truncated results. Set it to the value of
     *            <code>NextMarker</code> from the truncated response you just
     *            received.
     *            </p>
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * Use this parameter in a subsequent request after you receive a response
     * with truncated results. Set it to the value of <code>NextMarker</code>
     * from the truncated response you just received.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[ -\u00FF]*<br/>
     *
     * @param marker <p>
     *            Use this parameter in a subsequent request after you receive a
     *            response with truncated results. Set it to the value of
     *            <code>NextMarker</code> from the truncated response you just
     *            received.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAliasesRequest withMarker(String marker) {
        this.marker = marker;
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
        if (getLimit() != null)
            sb.append("Limit: " + getLimit() + ",");
        if (getMarker() != null)
            sb.append("Marker: " + getMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyId() == null) ? 0 : getKeyId().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAliasesRequest == false)
            return false;
        ListAliasesRequest other = (ListAliasesRequest) obj;

        if (other.getKeyId() == null ^ this.getKeyId() == null)
            return false;
        if (other.getKeyId() != null && other.getKeyId().equals(this.getKeyId()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        return true;
    }
}
