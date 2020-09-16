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
 * <p>Retrieve information about one or more parameters in a specific hierarchy. </p> <note> <p>Request results are returned on a best-effort basis. If you specify <code>MaxResults</code> in the request, the response includes information up to the limit specified. The number of items returned, however, can be between zero and the value of <code>MaxResults</code>. If the service reaches an internal limit while processing the results, it stops the operation and returns the matching values up to that point and a <code>NextToken</code>. You can specify the <code>NextToken</code> in a subsequent call to get the next set of results.</p> </note>
 */
public class GetParametersByPathRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>The hierarchy for the parameter. Hierarchies start with a forward slash (/) and end with the parameter name. A parameter name hierarchy can have a maximum of 15 levels. Here is an example of a hierarchy: <code>/Finance/Prod/IAD/WinServ2016/license33</code> </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     */
    private String path;

    /**
     * <p>Retrieve all parameters within a hierarchy.</p> <important> <p>If a user has access to a path, then the user can access all levels of that path. For example, if a user has permission to access path <code>/a</code>, then the user can also access <code>/a/b</code>. Even if a user has explicitly been denied access in IAM for parameter <code>/a/b</code>, they can still call the GetParametersByPath API action recursively for <code>/a</code> and view <code>/a/b</code>.</p> </important>
     */
    private Boolean recursive;

    /**
     * <p>Filters to limit the request results.</p> <note> <p>For <code>GetParametersByPath</code>, the following filter <code>Key</code> names are supported: <code>Type</code>, <code>KeyId</code>, <code>Label</code>, and <code>DataType</code>.</p> <p>The following <code>Key</code> values are not supported for <code>GetParametersByPath</code>: <code>tag</code>, <code>Name</code>, <code>Path</code>, and <code>Tier</code>.</p> </note>
     */
    private java.util.List<ParameterStringFilter> parameterFilters;

    /**
     * <p>Retrieve all parameters in a hierarchy with their value decrypted.</p>
     */
    private Boolean withDecryption;

    /**
     * <p>The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10<br/>
     */
    private Integer maxResults;

    /**
     * <p>A token to start the list. Use this token to get the next set of results. </p>
     */
    private String nextToken;

    /**
     * <p>The hierarchy for the parameter. Hierarchies start with a forward slash (/) and end with the parameter name. A parameter name hierarchy can have a maximum of 15 levels. Here is an example of a hierarchy: <code>/Finance/Prod/IAD/WinServ2016/license33</code> </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @return <p>The hierarchy for the parameter. Hierarchies start with a forward slash (/) and end with the parameter name. A parameter name hierarchy can have a maximum of 15 levels. Here is an example of a hierarchy: <code>/Finance/Prod/IAD/WinServ2016/license33</code> </p>
     */
    public String getPath() {
        return path;
    }

    /**
     * <p>The hierarchy for the parameter. Hierarchies start with a forward slash (/) and end with the parameter name. A parameter name hierarchy can have a maximum of 15 levels. Here is an example of a hierarchy: <code>/Finance/Prod/IAD/WinServ2016/license33</code> </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param path <p>The hierarchy for the parameter. Hierarchies start with a forward slash (/) and end with the parameter name. A parameter name hierarchy can have a maximum of 15 levels. Here is an example of a hierarchy: <code>/Finance/Prod/IAD/WinServ2016/license33</code> </p>
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * <p>The hierarchy for the parameter. Hierarchies start with a forward slash (/) and end with the parameter name. A parameter name hierarchy can have a maximum of 15 levels. Here is an example of a hierarchy: <code>/Finance/Prod/IAD/WinServ2016/license33</code> </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param path <p>The hierarchy for the parameter. Hierarchies start with a forward slash (/) and end with the parameter name. A parameter name hierarchy can have a maximum of 15 levels. Here is an example of a hierarchy: <code>/Finance/Prod/IAD/WinServ2016/license33</code> </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetParametersByPathRequest withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * <p>Retrieve all parameters within a hierarchy.</p> <important> <p>If a user has access to a path, then the user can access all levels of that path. For example, if a user has permission to access path <code>/a</code>, then the user can also access <code>/a/b</code>. Even if a user has explicitly been denied access in IAM for parameter <code>/a/b</code>, they can still call the GetParametersByPath API action recursively for <code>/a</code> and view <code>/a/b</code>.</p> </important>
     *
     * @return <p>Retrieve all parameters within a hierarchy.</p> <important> <p>If a user has access to a path, then the user can access all levels of that path. For example, if a user has permission to access path <code>/a</code>, then the user can also access <code>/a/b</code>. Even if a user has explicitly been denied access in IAM for parameter <code>/a/b</code>, they can still call the GetParametersByPath API action recursively for <code>/a</code> and view <code>/a/b</code>.</p> </important>
     */
    public Boolean isRecursive() {
        return recursive;
    }

    /**
     * <p>Retrieve all parameters within a hierarchy.</p> <important> <p>If a user has access to a path, then the user can access all levels of that path. For example, if a user has permission to access path <code>/a</code>, then the user can also access <code>/a/b</code>. Even if a user has explicitly been denied access in IAM for parameter <code>/a/b</code>, they can still call the GetParametersByPath API action recursively for <code>/a</code> and view <code>/a/b</code>.</p> </important>
     *
     * @return <p>Retrieve all parameters within a hierarchy.</p> <important> <p>If a user has access to a path, then the user can access all levels of that path. For example, if a user has permission to access path <code>/a</code>, then the user can also access <code>/a/b</code>. Even if a user has explicitly been denied access in IAM for parameter <code>/a/b</code>, they can still call the GetParametersByPath API action recursively for <code>/a</code> and view <code>/a/b</code>.</p> </important>
     */
    public Boolean getRecursive() {
        return recursive;
    }

    /**
     * <p>Retrieve all parameters within a hierarchy.</p> <important> <p>If a user has access to a path, then the user can access all levels of that path. For example, if a user has permission to access path <code>/a</code>, then the user can also access <code>/a/b</code>. Even if a user has explicitly been denied access in IAM for parameter <code>/a/b</code>, they can still call the GetParametersByPath API action recursively for <code>/a</code> and view <code>/a/b</code>.</p> </important>
     *
     * @param recursive <p>Retrieve all parameters within a hierarchy.</p> <important> <p>If a user has access to a path, then the user can access all levels of that path. For example, if a user has permission to access path <code>/a</code>, then the user can also access <code>/a/b</code>. Even if a user has explicitly been denied access in IAM for parameter <code>/a/b</code>, they can still call the GetParametersByPath API action recursively for <code>/a</code> and view <code>/a/b</code>.</p> </important>
     */
    public void setRecursive(Boolean recursive) {
        this.recursive = recursive;
    }

    /**
     * <p>Retrieve all parameters within a hierarchy.</p> <important> <p>If a user has access to a path, then the user can access all levels of that path. For example, if a user has permission to access path <code>/a</code>, then the user can also access <code>/a/b</code>. Even if a user has explicitly been denied access in IAM for parameter <code>/a/b</code>, they can still call the GetParametersByPath API action recursively for <code>/a</code> and view <code>/a/b</code>.</p> </important>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param recursive <p>Retrieve all parameters within a hierarchy.</p> <important> <p>If a user has access to a path, then the user can access all levels of that path. For example, if a user has permission to access path <code>/a</code>, then the user can also access <code>/a/b</code>. Even if a user has explicitly been denied access in IAM for parameter <code>/a/b</code>, they can still call the GetParametersByPath API action recursively for <code>/a</code> and view <code>/a/b</code>.</p> </important>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetParametersByPathRequest withRecursive(Boolean recursive) {
        this.recursive = recursive;
        return this;
    }

    /**
     * <p>Filters to limit the request results.</p> <note> <p>For <code>GetParametersByPath</code>, the following filter <code>Key</code> names are supported: <code>Type</code>, <code>KeyId</code>, <code>Label</code>, and <code>DataType</code>.</p> <p>The following <code>Key</code> values are not supported for <code>GetParametersByPath</code>: <code>tag</code>, <code>Name</code>, <code>Path</code>, and <code>Tier</code>.</p> </note>
     *
     * @return <p>Filters to limit the request results.</p> <note> <p>For <code>GetParametersByPath</code>, the following filter <code>Key</code> names are supported: <code>Type</code>, <code>KeyId</code>, <code>Label</code>, and <code>DataType</code>.</p> <p>The following <code>Key</code> values are not supported for <code>GetParametersByPath</code>: <code>tag</code>, <code>Name</code>, <code>Path</code>, and <code>Tier</code>.</p> </note>
     */
    public java.util.List<ParameterStringFilter> getParameterFilters() {
        return parameterFilters;
    }

    /**
     * <p>Filters to limit the request results.</p> <note> <p>For <code>GetParametersByPath</code>, the following filter <code>Key</code> names are supported: <code>Type</code>, <code>KeyId</code>, <code>Label</code>, and <code>DataType</code>.</p> <p>The following <code>Key</code> values are not supported for <code>GetParametersByPath</code>: <code>tag</code>, <code>Name</code>, <code>Path</code>, and <code>Tier</code>.</p> </note>
     *
     * @param parameterFilters <p>Filters to limit the request results.</p> <note> <p>For <code>GetParametersByPath</code>, the following filter <code>Key</code> names are supported: <code>Type</code>, <code>KeyId</code>, <code>Label</code>, and <code>DataType</code>.</p> <p>The following <code>Key</code> values are not supported for <code>GetParametersByPath</code>: <code>tag</code>, <code>Name</code>, <code>Path</code>, and <code>Tier</code>.</p> </note>
     */
    public void setParameterFilters(java.util.Collection<ParameterStringFilter> parameterFilters) {
        if (parameterFilters == null) {
            this.parameterFilters = null;
            return;
        }

        this.parameterFilters = new java.util.ArrayList<ParameterStringFilter>(parameterFilters);
    }

    /**
     * <p>Filters to limit the request results.</p> <note> <p>For <code>GetParametersByPath</code>, the following filter <code>Key</code> names are supported: <code>Type</code>, <code>KeyId</code>, <code>Label</code>, and <code>DataType</code>.</p> <p>The following <code>Key</code> values are not supported for <code>GetParametersByPath</code>: <code>tag</code>, <code>Name</code>, <code>Path</code>, and <code>Tier</code>.</p> </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param parameterFilters <p>Filters to limit the request results.</p> <note> <p>For <code>GetParametersByPath</code>, the following filter <code>Key</code> names are supported: <code>Type</code>, <code>KeyId</code>, <code>Label</code>, and <code>DataType</code>.</p> <p>The following <code>Key</code> values are not supported for <code>GetParametersByPath</code>: <code>tag</code>, <code>Name</code>, <code>Path</code>, and <code>Tier</code>.</p> </note>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetParametersByPathRequest withParameterFilters(ParameterStringFilter... parameterFilters) {
        if (getParameterFilters() == null) {
            this.parameterFilters = new java.util.ArrayList<ParameterStringFilter>(parameterFilters.length);
        }
        for (ParameterStringFilter value : parameterFilters) {
            this.parameterFilters.add(value);
        }
        return this;
    }

    /**
     * <p>Filters to limit the request results.</p> <note> <p>For <code>GetParametersByPath</code>, the following filter <code>Key</code> names are supported: <code>Type</code>, <code>KeyId</code>, <code>Label</code>, and <code>DataType</code>.</p> <p>The following <code>Key</code> values are not supported for <code>GetParametersByPath</code>: <code>tag</code>, <code>Name</code>, <code>Path</code>, and <code>Tier</code>.</p> </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param parameterFilters <p>Filters to limit the request results.</p> <note> <p>For <code>GetParametersByPath</code>, the following filter <code>Key</code> names are supported: <code>Type</code>, <code>KeyId</code>, <code>Label</code>, and <code>DataType</code>.</p> <p>The following <code>Key</code> values are not supported for <code>GetParametersByPath</code>: <code>tag</code>, <code>Name</code>, <code>Path</code>, and <code>Tier</code>.</p> </note>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetParametersByPathRequest withParameterFilters(java.util.Collection<ParameterStringFilter> parameterFilters) {
        setParameterFilters(parameterFilters);
        return this;
    }

    /**
     * <p>Retrieve all parameters in a hierarchy with their value decrypted.</p>
     *
     * @return <p>Retrieve all parameters in a hierarchy with their value decrypted.</p>
     */
    public Boolean isWithDecryption() {
        return withDecryption;
    }

    /**
     * <p>Retrieve all parameters in a hierarchy with their value decrypted.</p>
     *
     * @return <p>Retrieve all parameters in a hierarchy with their value decrypted.</p>
     */
    public Boolean getWithDecryption() {
        return withDecryption;
    }

    /**
     * <p>Retrieve all parameters in a hierarchy with their value decrypted.</p>
     *
     * @param withDecryption <p>Retrieve all parameters in a hierarchy with their value decrypted.</p>
     */
    public void setWithDecryption(Boolean withDecryption) {
        this.withDecryption = withDecryption;
    }

    /**
     * <p>Retrieve all parameters in a hierarchy with their value decrypted.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param withDecryption <p>Retrieve all parameters in a hierarchy with their value decrypted.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetParametersByPathRequest withWithDecryption(Boolean withDecryption) {
        this.withDecryption = withDecryption;
        return this;
    }

    /**
     * <p>The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10<br/>
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
     * <b>Range: </b>1 - 10<br/>
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
     * <b>Range: </b>1 - 10<br/>
     *
     * @param maxResults <p>The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetParametersByPathRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>A token to start the list. Use this token to get the next set of results. </p>
     *
     * @return <p>A token to start the list. Use this token to get the next set of results. </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>A token to start the list. Use this token to get the next set of results. </p>
     *
     * @param nextToken <p>A token to start the list. Use this token to get the next set of results. </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>A token to start the list. Use this token to get the next set of results. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken <p>A token to start the list. Use this token to get the next set of results. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetParametersByPathRequest withNextToken(String nextToken) {
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
        if (getPath() != null) sb.append("Path: " + getPath() + ",");
        if (getRecursive() != null) sb.append("Recursive: " + getRecursive() + ",");
        if (getParameterFilters() != null) sb.append("ParameterFilters: " + getParameterFilters() + ",");
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

        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode());
        hashCode = prime * hashCode + ((getRecursive() == null) ? 0 : getRecursive().hashCode());
        hashCode = prime * hashCode + ((getParameterFilters() == null) ? 0 : getParameterFilters().hashCode());
        hashCode = prime * hashCode + ((getWithDecryption() == null) ? 0 : getWithDecryption().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetParametersByPathRequest == false) return false;
        GetParametersByPathRequest other = (GetParametersByPathRequest)obj;

        if (other.getPath() == null ^ this.getPath() == null) return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false) return false;
        if (other.getRecursive() == null ^ this.getRecursive() == null) return false;
        if (other.getRecursive() != null && other.getRecursive().equals(this.getRecursive()) == false) return false;
        if (other.getParameterFilters() == null ^ this.getParameterFilters() == null) return false;
        if (other.getParameterFilters() != null && other.getParameterFilters().equals(this.getParameterFilters()) == false) return false;
        if (other.getWithDecryption() == null ^ this.getWithDecryption() == null) return false;
        if (other.getWithDecryption() != null && other.getWithDecryption().equals(this.getWithDecryption()) == false) return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null) return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false) return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false;
        return true;
    }
}
