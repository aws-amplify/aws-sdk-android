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
package com.amazonaws.services.aws-android-sdk-secretsmanager.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>Lists all of the versions attached to the specified secret. The output does not include the <code>SecretString</code> or <code>SecretBinary</code> fields. By default, the list includes only versions that have at least one staging label in <code>VersionStage</code> attached.</p> <note> <p>Always check the <code>NextToken</code> response parameter when calling any of the <code>List*</code> operations. These operations can occasionally return an empty or shorter than expected list of results even when there more results become available. When this happens, the <code>NextToken</code> response parameter contains a value to pass to the next call to the same API to request the next part of the list.</p> </note> <p> <b>Minimum permissions</b> </p> <p>To run this command, you must have the following permissions:</p> <ul> <li> <p>secretsmanager:ListSecretVersionIds</p> </li> </ul> <p> <b>Related operations</b> </p> <ul> <li> <p>To list the secrets in an account, use <a>ListSecrets</a>.</p> </li> </ul>
 */
public class ListSecretVersionIdsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>The identifier for the secret containing the versions you want to list. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret.</p> <note> <p>If you specify an ARN, we generally recommend that you specify a complete ARN. You can specify a partial ARN too—for example, if you don’t include the final hyphen and six random characters that Secrets Manager adds at the end of the ARN when you created the secret. A partial ARN match can work as long as it uniquely matches only one secret. However, if your secret has a name that ends in a hyphen followed by six characters (before Secrets Manager adds the hyphen and six characters to the ARN) and you try to use that as a partial ARN, then those characters cause Secrets Manager to assume that you’re specifying a complete ARN. This confusion can cause unexpected results. To avoid this situation, we recommend that you don’t create secret names ending with a hyphen followed by six characters.</p> <p>If you specify an incomplete ARN without the random suffix, and instead provide the 'friendly name', you <i>must</i> not include the random suffix. If you do include the random suffix added by Secrets Manager, you receive either a <i>ResourceNotFoundException</i> or an <i>AccessDeniedException</i> error, depending on your permissions.</p> </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     */
    private String secretId;

    /**
     * <p>(Optional) Limits the number of results you want to include in the response. If you don't include this parameter, it defaults to a value that's specific to the operation. If additional items exist beyond the maximum you specify, the <code>NextToken</code> response element is present and has a value (isn't null). Include that value as the <code>NextToken</code> request parameter in the next call to the operation to get the next part of the results. Note that Secrets Manager might return fewer results than the maximum even when there are more results available. You should check <code>NextToken</code> after every operation to ensure that you receive all of the results.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     */
    private Integer maxResults;

    /**
     * <p>(Optional) Use this parameter in a request if you receive a <code>NextToken</code> response in a previous request indicating there's more output available. In a subsequent call, set it to the value of the previous call <code>NextToken</code> response to indicate where the output should continue from.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     */
    private String nextToken;

    /**
     * <p>(Optional) Specifies that you want the results to include versions that do not have any staging labels attached to them. Such versions are considered deprecated and are subject to deletion by Secrets Manager as needed.</p>
     */
    private Boolean includeDeprecated;

    /**
     * <p>The identifier for the secret containing the versions you want to list. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret.</p> <note> <p>If you specify an ARN, we generally recommend that you specify a complete ARN. You can specify a partial ARN too—for example, if you don’t include the final hyphen and six random characters that Secrets Manager adds at the end of the ARN when you created the secret. A partial ARN match can work as long as it uniquely matches only one secret. However, if your secret has a name that ends in a hyphen followed by six characters (before Secrets Manager adds the hyphen and six characters to the ARN) and you try to use that as a partial ARN, then those characters cause Secrets Manager to assume that you’re specifying a complete ARN. This confusion can cause unexpected results. To avoid this situation, we recommend that you don’t create secret names ending with a hyphen followed by six characters.</p> <p>If you specify an incomplete ARN without the random suffix, and instead provide the 'friendly name', you <i>must</i> not include the random suffix. If you do include the random suffix added by Secrets Manager, you receive either a <i>ResourceNotFoundException</i> or an <i>AccessDeniedException</i> error, depending on your permissions.</p> </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @return <p>The identifier for the secret containing the versions you want to list. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret.</p> <note> <p>If you specify an ARN, we generally recommend that you specify a complete ARN. You can specify a partial ARN too—for example, if you don’t include the final hyphen and six random characters that Secrets Manager adds at the end of the ARN when you created the secret. A partial ARN match can work as long as it uniquely matches only one secret. However, if your secret has a name that ends in a hyphen followed by six characters (before Secrets Manager adds the hyphen and six characters to the ARN) and you try to use that as a partial ARN, then those characters cause Secrets Manager to assume that you’re specifying a complete ARN. This confusion can cause unexpected results. To avoid this situation, we recommend that you don’t create secret names ending with a hyphen followed by six characters.</p> <p>If you specify an incomplete ARN without the random suffix, and instead provide the 'friendly name', you <i>must</i> not include the random suffix. If you do include the random suffix added by Secrets Manager, you receive either a <i>ResourceNotFoundException</i> or an <i>AccessDeniedException</i> error, depending on your permissions.</p> </note>
     */
    public String getSecretId() {
        return secretId;
    }

    /**
     * <p>The identifier for the secret containing the versions you want to list. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret.</p> <note> <p>If you specify an ARN, we generally recommend that you specify a complete ARN. You can specify a partial ARN too—for example, if you don’t include the final hyphen and six random characters that Secrets Manager adds at the end of the ARN when you created the secret. A partial ARN match can work as long as it uniquely matches only one secret. However, if your secret has a name that ends in a hyphen followed by six characters (before Secrets Manager adds the hyphen and six characters to the ARN) and you try to use that as a partial ARN, then those characters cause Secrets Manager to assume that you’re specifying a complete ARN. This confusion can cause unexpected results. To avoid this situation, we recommend that you don’t create secret names ending with a hyphen followed by six characters.</p> <p>If you specify an incomplete ARN without the random suffix, and instead provide the 'friendly name', you <i>must</i> not include the random suffix. If you do include the random suffix added by Secrets Manager, you receive either a <i>ResourceNotFoundException</i> or an <i>AccessDeniedException</i> error, depending on your permissions.</p> </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param secretId <p>The identifier for the secret containing the versions you want to list. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret.</p> <note> <p>If you specify an ARN, we generally recommend that you specify a complete ARN. You can specify a partial ARN too—for example, if you don’t include the final hyphen and six random characters that Secrets Manager adds at the end of the ARN when you created the secret. A partial ARN match can work as long as it uniquely matches only one secret. However, if your secret has a name that ends in a hyphen followed by six characters (before Secrets Manager adds the hyphen and six characters to the ARN) and you try to use that as a partial ARN, then those characters cause Secrets Manager to assume that you’re specifying a complete ARN. This confusion can cause unexpected results. To avoid this situation, we recommend that you don’t create secret names ending with a hyphen followed by six characters.</p> <p>If you specify an incomplete ARN without the random suffix, and instead provide the 'friendly name', you <i>must</i> not include the random suffix. If you do include the random suffix added by Secrets Manager, you receive either a <i>ResourceNotFoundException</i> or an <i>AccessDeniedException</i> error, depending on your permissions.</p> </note>
     */
    public void setSecretId(String secretId) {
        this.secretId = secretId;
    }

    /**
     * <p>The identifier for the secret containing the versions you want to list. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret.</p> <note> <p>If you specify an ARN, we generally recommend that you specify a complete ARN. You can specify a partial ARN too—for example, if you don’t include the final hyphen and six random characters that Secrets Manager adds at the end of the ARN when you created the secret. A partial ARN match can work as long as it uniquely matches only one secret. However, if your secret has a name that ends in a hyphen followed by six characters (before Secrets Manager adds the hyphen and six characters to the ARN) and you try to use that as a partial ARN, then those characters cause Secrets Manager to assume that you’re specifying a complete ARN. This confusion can cause unexpected results. To avoid this situation, we recommend that you don’t create secret names ending with a hyphen followed by six characters.</p> <p>If you specify an incomplete ARN without the random suffix, and instead provide the 'friendly name', you <i>must</i> not include the random suffix. If you do include the random suffix added by Secrets Manager, you receive either a <i>ResourceNotFoundException</i> or an <i>AccessDeniedException</i> error, depending on your permissions.</p> </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param secretId <p>The identifier for the secret containing the versions you want to list. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret.</p> <note> <p>If you specify an ARN, we generally recommend that you specify a complete ARN. You can specify a partial ARN too—for example, if you don’t include the final hyphen and six random characters that Secrets Manager adds at the end of the ARN when you created the secret. A partial ARN match can work as long as it uniquely matches only one secret. However, if your secret has a name that ends in a hyphen followed by six characters (before Secrets Manager adds the hyphen and six characters to the ARN) and you try to use that as a partial ARN, then those characters cause Secrets Manager to assume that you’re specifying a complete ARN. This confusion can cause unexpected results. To avoid this situation, we recommend that you don’t create secret names ending with a hyphen followed by six characters.</p> <p>If you specify an incomplete ARN without the random suffix, and instead provide the 'friendly name', you <i>must</i> not include the random suffix. If you do include the random suffix added by Secrets Manager, you receive either a <i>ResourceNotFoundException</i> or an <i>AccessDeniedException</i> error, depending on your permissions.</p> </note>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ListSecretVersionIdsRequest withSecretId(String secretId) {
        this.secretId = secretId;
        return this;
    }

    /**
     * <p>(Optional) Limits the number of results you want to include in the response. If you don't include this parameter, it defaults to a value that's specific to the operation. If additional items exist beyond the maximum you specify, the <code>NextToken</code> response element is present and has a value (isn't null). Include that value as the <code>NextToken</code> request parameter in the next call to the operation to get the next part of the results. Note that Secrets Manager might return fewer results than the maximum even when there are more results available. You should check <code>NextToken</code> after every operation to ensure that you receive all of the results.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @return <p>(Optional) Limits the number of results you want to include in the response. If you don't include this parameter, it defaults to a value that's specific to the operation. If additional items exist beyond the maximum you specify, the <code>NextToken</code> response element is present and has a value (isn't null). Include that value as the <code>NextToken</code> request parameter in the next call to the operation to get the next part of the results. Note that Secrets Manager might return fewer results than the maximum even when there are more results available. You should check <code>NextToken</code> after every operation to ensure that you receive all of the results.</p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>(Optional) Limits the number of results you want to include in the response. If you don't include this parameter, it defaults to a value that's specific to the operation. If additional items exist beyond the maximum you specify, the <code>NextToken</code> response element is present and has a value (isn't null). Include that value as the <code>NextToken</code> request parameter in the next call to the operation to get the next part of the results. Note that Secrets Manager might return fewer results than the maximum even when there are more results available. You should check <code>NextToken</code> after every operation to ensure that you receive all of the results.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param maxResults <p>(Optional) Limits the number of results you want to include in the response. If you don't include this parameter, it defaults to a value that's specific to the operation. If additional items exist beyond the maximum you specify, the <code>NextToken</code> response element is present and has a value (isn't null). Include that value as the <code>NextToken</code> request parameter in the next call to the operation to get the next part of the results. Note that Secrets Manager might return fewer results than the maximum even when there are more results available. You should check <code>NextToken</code> after every operation to ensure that you receive all of the results.</p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>(Optional) Limits the number of results you want to include in the response. If you don't include this parameter, it defaults to a value that's specific to the operation. If additional items exist beyond the maximum you specify, the <code>NextToken</code> response element is present and has a value (isn't null). Include that value as the <code>NextToken</code> request parameter in the next call to the operation to get the next part of the results. Note that Secrets Manager might return fewer results than the maximum even when there are more results available. You should check <code>NextToken</code> after every operation to ensure that you receive all of the results.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param maxResults <p>(Optional) Limits the number of results you want to include in the response. If you don't include this parameter, it defaults to a value that's specific to the operation. If additional items exist beyond the maximum you specify, the <code>NextToken</code> response element is present and has a value (isn't null). Include that value as the <code>NextToken</code> request parameter in the next call to the operation to get the next part of the results. Note that Secrets Manager might return fewer results than the maximum even when there are more results available. You should check <code>NextToken</code> after every operation to ensure that you receive all of the results.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ListSecretVersionIdsRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>(Optional) Use this parameter in a request if you receive a <code>NextToken</code> response in a previous request indicating there's more output available. In a subsequent call, set it to the value of the previous call <code>NextToken</code> response to indicate where the output should continue from.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     *
     * @return <p>(Optional) Use this parameter in a request if you receive a <code>NextToken</code> response in a previous request indicating there's more output available. In a subsequent call, set it to the value of the previous call <code>NextToken</code> response to indicate where the output should continue from.</p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>(Optional) Use this parameter in a request if you receive a <code>NextToken</code> response in a previous request indicating there's more output available. In a subsequent call, set it to the value of the previous call <code>NextToken</code> response to indicate where the output should continue from.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     *
     * @param nextToken <p>(Optional) Use this parameter in a request if you receive a <code>NextToken</code> response in a previous request indicating there's more output available. In a subsequent call, set it to the value of the previous call <code>NextToken</code> response to indicate where the output should continue from.</p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>(Optional) Use this parameter in a request if you receive a <code>NextToken</code> response in a previous request indicating there's more output available. In a subsequent call, set it to the value of the previous call <code>NextToken</code> response to indicate where the output should continue from.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     *
     * @param nextToken <p>(Optional) Use this parameter in a request if you receive a <code>NextToken</code> response in a previous request indicating there's more output available. In a subsequent call, set it to the value of the previous call <code>NextToken</code> response to indicate where the output should continue from.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ListSecretVersionIdsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>(Optional) Specifies that you want the results to include versions that do not have any staging labels attached to them. Such versions are considered deprecated and are subject to deletion by Secrets Manager as needed.</p>
     *
     * @return <p>(Optional) Specifies that you want the results to include versions that do not have any staging labels attached to them. Such versions are considered deprecated and are subject to deletion by Secrets Manager as needed.</p>
     */
    public Boolean isIncludeDeprecated() {
        return includeDeprecated;
    }

    /**
     * <p>(Optional) Specifies that you want the results to include versions that do not have any staging labels attached to them. Such versions are considered deprecated and are subject to deletion by Secrets Manager as needed.</p>
     *
     * @return <p>(Optional) Specifies that you want the results to include versions that do not have any staging labels attached to them. Such versions are considered deprecated and are subject to deletion by Secrets Manager as needed.</p>
     */
    public Boolean getIncludeDeprecated() {
        return includeDeprecated;
    }

    /**
     * <p>(Optional) Specifies that you want the results to include versions that do not have any staging labels attached to them. Such versions are considered deprecated and are subject to deletion by Secrets Manager as needed.</p>
     *
     * @param includeDeprecated <p>(Optional) Specifies that you want the results to include versions that do not have any staging labels attached to them. Such versions are considered deprecated and are subject to deletion by Secrets Manager as needed.</p>
     */
    public void setIncludeDeprecated(Boolean includeDeprecated) {
        this.includeDeprecated = includeDeprecated;
    }

    /**
     * <p>(Optional) Specifies that you want the results to include versions that do not have any staging labels attached to them. Such versions are considered deprecated and are subject to deletion by Secrets Manager as needed.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param includeDeprecated <p>(Optional) Specifies that you want the results to include versions that do not have any staging labels attached to them. Such versions are considered deprecated and are subject to deletion by Secrets Manager as needed.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ListSecretVersionIdsRequest withIncludeDeprecated(Boolean includeDeprecated) {
        this.includeDeprecated = includeDeprecated;
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
        if (getSecretId() != null) sb.append("SecretId: " + getSecretId() + ",");
        if (getMaxResults() != null) sb.append("MaxResults: " + getMaxResults() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() + ",");
        if (getIncludeDeprecated() != null) sb.append("IncludeDeprecated: " + getIncludeDeprecated());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSecretId() == null) ? 0 : getSecretId().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getIncludeDeprecated() == null) ? 0 : getIncludeDeprecated().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListSecretVersionIdsRequest == false) return false;
        ListSecretVersionIdsRequest other = (ListSecretVersionIdsRequest)obj;

        if (other.getSecretId() == null ^ this.getSecretId() == null) return false;
        if (other.getSecretId() != null && other.getSecretId().equals(this.getSecretId()) == false) return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null) return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false) return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false;
        if (other.getIncludeDeprecated() == null ^ this.getIncludeDeprecated() == null) return false;
        if (other.getIncludeDeprecated() != null && other.getIncludeDeprecated().equals(this.getIncludeDeprecated()) == false) return false;
        return true;
    }
}
