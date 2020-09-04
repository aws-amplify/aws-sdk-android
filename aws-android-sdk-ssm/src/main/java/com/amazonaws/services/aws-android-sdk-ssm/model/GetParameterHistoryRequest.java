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
package com.amazonaws.services.aws-android-sdk-ssm.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>Query a list of all parameters used by the AWS account.</p>
 */
public class GetParameterHistoryRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>The name of a parameter you want to query.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     */
    private String name;

    /**
     * <p>Return decrypted values for secure string parameters. This flag is ignored for String and StringList parameter types.</p>
     */
    private Boolean withDecryption;

    /**
     * <p>The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     */
    private Integer maxResults;

    /**
     * <p>The token for the next set of items to return. (You received this token from a previous call.)</p>
     */
    private String nextToken;

    /**
     * <p>The name of a parameter you want to query.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @return <p>The name of a parameter you want to query.</p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>The name of a parameter you want to query.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param name <p>The name of a parameter you want to query.</p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>The name of a parameter you want to query.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param name <p>The name of a parameter you want to query.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetParameterHistoryRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>Return decrypted values for secure string parameters. This flag is ignored for String and StringList parameter types.</p>
     *
     * @return <p>Return decrypted values for secure string parameters. This flag is ignored for String and StringList parameter types.</p>
     */
    public Boolean isWithDecryption() {
        return withDecryption;
    }

    /**
     * <p>Return decrypted values for secure string parameters. This flag is ignored for String and StringList parameter types.</p>
     *
     * @return <p>Return decrypted values for secure string parameters. This flag is ignored for String and StringList parameter types.</p>
     */
    public Boolean getWithDecryption() {
        return withDecryption;
    }

    /**
     * <p>Return decrypted values for secure string parameters. This flag is ignored for String and StringList parameter types.</p>
     *
     * @param withDecryption <p>Return decrypted values for secure string parameters. This flag is ignored for String and StringList parameter types.</p>
     */
    public void setWithDecryption(Boolean withDecryption) {
        this.withDecryption = withDecryption;
    }

    /**
     * <p>Return decrypted values for secure string parameters. This flag is ignored for String and StringList parameter types.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param withDecryption <p>Return decrypted values for secure string parameters. This flag is ignored for String and StringList parameter types.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetParameterHistoryRequest withWithDecryption(Boolean withDecryption) {
        this.withDecryption = withDecryption;
        return this;
    }

    /**
     * <p>The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     *
     * @return <p>The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.</p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     *
     * @param maxResults <p>The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.</p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     *
     * @param maxResults <p>The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetParameterHistoryRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>The token for the next set of items to return. (You received this token from a previous call.)</p>
     *
     * @return <p>The token for the next set of items to return. (You received this token from a previous call.)</p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>The token for the next set of items to return. (You received this token from a previous call.)</p>
     *
     * @param nextToken <p>The token for the next set of items to return. (You received this token from a previous call.)</p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>The token for the next set of items to return. (You received this token from a previous call.)</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken <p>The token for the next set of items to return. (You received this token from a previous call.)</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetParameterHistoryRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getName() != null) sb.append("Name: " + getName() + ",");
        if (getWithDecryption() != null) sb.append("WithDecryption: " + getWithDecryption() + ",");
        if (getMaxResults() != null) sb.append("MaxResults: " + getMaxResults() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getWithDecryption() == null) ? 0 : getWithDecryption().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetParameterHistoryRequest == false) return false;
        GetParameterHistoryRequest other = (GetParameterHistoryRequest)obj;

        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false;
        if (other.getWithDecryption() == null ^ this.getWithDecryption() == null) return false;
        if (other.getWithDecryption() != null && other.getWithDecryption().equals(this.getWithDecryption()) == false) return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null) return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false) return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false;
        return true;
    }
}
