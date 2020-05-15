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

package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns a list of registration tokens for the specified type(s).
 * </p>
 */
public class ListTypeRegistrationsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The kind of type.
     * </p>
     * <p>
     * Currently the only valid value is <code>RESOURCE</code>.
     * </p>
     * <p>
     * Conditional: You must specify either <code>TypeName</code> and
     * <code>Type</code>, or <code>Arn</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RESOURCE
     */
    private String type;

    /**
     * <p>
     * The name of the type.
     * </p>
     * <p>
     * Conditional: You must specify either <code>TypeName</code> and
     * <code>Type</code>, or <code>Arn</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>10 - 196<br/>
     * <b>Pattern: </b>[A-Za-z0-9]{2,64}::[A-Za-z0-9]{2,64}::[A-Za-z0-9]{2,64}
     * <br/>
     */
    private String typeName;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the type.
     * </p>
     * <p>
     * Conditional: You must specify either <code>TypeName</code> and
     * <code>Type</code>, or <code>Arn</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern:
     * </b>arn:aws[A-Za-z0-9-]{0,64}:cloudformation:[A-Za-z0-9-]{1,64
     * }:([0-9]{12})?:type/.+<br/>
     */
    private String typeArn;

    /**
     * <p>
     * The current status of the type registration request.
     * </p>
     * <p>
     * The default is <code>IN_PROGRESS</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLETE, IN_PROGRESS, FAILED
     */
    private String registrationStatusFilter;

    /**
     * <p>
     * The maximum number of results to be returned with a single call. If the
     * number of available results exceeds this maximum, the response includes a
     * <code>NextToken</code> value that you can assign to the
     * <code>NextToken</code> request parameter to get the next set of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * If the previous paginated request didn't return all of the remaining
     * results, the response object's <code>NextToken</code> parameter value is
     * set to a token. To retrieve the next set of results, call this action
     * again and assign that token to the request object's
     * <code>NextToken</code> parameter. If there are no remaining results, the
     * previous response object's <code>NextToken</code> parameter is set to
     * <code>null</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String nextToken;

    /**
     * <p>
     * The kind of type.
     * </p>
     * <p>
     * Currently the only valid value is <code>RESOURCE</code>.
     * </p>
     * <p>
     * Conditional: You must specify either <code>TypeName</code> and
     * <code>Type</code>, or <code>Arn</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RESOURCE
     *
     * @return <p>
     *         The kind of type.
     *         </p>
     *         <p>
     *         Currently the only valid value is <code>RESOURCE</code>.
     *         </p>
     *         <p>
     *         Conditional: You must specify either <code>TypeName</code> and
     *         <code>Type</code>, or <code>Arn</code>.
     *         </p>
     * @see RegistryType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The kind of type.
     * </p>
     * <p>
     * Currently the only valid value is <code>RESOURCE</code>.
     * </p>
     * <p>
     * Conditional: You must specify either <code>TypeName</code> and
     * <code>Type</code>, or <code>Arn</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RESOURCE
     *
     * @param type <p>
     *            The kind of type.
     *            </p>
     *            <p>
     *            Currently the only valid value is <code>RESOURCE</code>.
     *            </p>
     *            <p>
     *            Conditional: You must specify either <code>TypeName</code> and
     *            <code>Type</code>, or <code>Arn</code>.
     *            </p>
     * @see RegistryType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The kind of type.
     * </p>
     * <p>
     * Currently the only valid value is <code>RESOURCE</code>.
     * </p>
     * <p>
     * Conditional: You must specify either <code>TypeName</code> and
     * <code>Type</code>, or <code>Arn</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RESOURCE
     *
     * @param type <p>
     *            The kind of type.
     *            </p>
     *            <p>
     *            Currently the only valid value is <code>RESOURCE</code>.
     *            </p>
     *            <p>
     *            Conditional: You must specify either <code>TypeName</code> and
     *            <code>Type</code>, or <code>Arn</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RegistryType
     */
    public ListTypeRegistrationsRequest withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The kind of type.
     * </p>
     * <p>
     * Currently the only valid value is <code>RESOURCE</code>.
     * </p>
     * <p>
     * Conditional: You must specify either <code>TypeName</code> and
     * <code>Type</code>, or <code>Arn</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RESOURCE
     *
     * @param type <p>
     *            The kind of type.
     *            </p>
     *            <p>
     *            Currently the only valid value is <code>RESOURCE</code>.
     *            </p>
     *            <p>
     *            Conditional: You must specify either <code>TypeName</code> and
     *            <code>Type</code>, or <code>Arn</code>.
     *            </p>
     * @see RegistryType
     */
    public void setType(RegistryType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The kind of type.
     * </p>
     * <p>
     * Currently the only valid value is <code>RESOURCE</code>.
     * </p>
     * <p>
     * Conditional: You must specify either <code>TypeName</code> and
     * <code>Type</code>, or <code>Arn</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RESOURCE
     *
     * @param type <p>
     *            The kind of type.
     *            </p>
     *            <p>
     *            Currently the only valid value is <code>RESOURCE</code>.
     *            </p>
     *            <p>
     *            Conditional: You must specify either <code>TypeName</code> and
     *            <code>Type</code>, or <code>Arn</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RegistryType
     */
    public ListTypeRegistrationsRequest withType(RegistryType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The name of the type.
     * </p>
     * <p>
     * Conditional: You must specify either <code>TypeName</code> and
     * <code>Type</code>, or <code>Arn</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>10 - 196<br/>
     * <b>Pattern: </b>[A-Za-z0-9]{2,64}::[A-Za-z0-9]{2,64}::[A-Za-z0-9]{2,64}
     * <br/>
     *
     * @return <p>
     *         The name of the type.
     *         </p>
     *         <p>
     *         Conditional: You must specify either <code>TypeName</code> and
     *         <code>Type</code>, or <code>Arn</code>.
     *         </p>
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * <p>
     * The name of the type.
     * </p>
     * <p>
     * Conditional: You must specify either <code>TypeName</code> and
     * <code>Type</code>, or <code>Arn</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>10 - 196<br/>
     * <b>Pattern: </b>[A-Za-z0-9]{2,64}::[A-Za-z0-9]{2,64}::[A-Za-z0-9]{2,64}
     * <br/>
     *
     * @param typeName <p>
     *            The name of the type.
     *            </p>
     *            <p>
     *            Conditional: You must specify either <code>TypeName</code> and
     *            <code>Type</code>, or <code>Arn</code>.
     *            </p>
     */
    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    /**
     * <p>
     * The name of the type.
     * </p>
     * <p>
     * Conditional: You must specify either <code>TypeName</code> and
     * <code>Type</code>, or <code>Arn</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>10 - 196<br/>
     * <b>Pattern: </b>[A-Za-z0-9]{2,64}::[A-Za-z0-9]{2,64}::[A-Za-z0-9]{2,64}
     * <br/>
     *
     * @param typeName <p>
     *            The name of the type.
     *            </p>
     *            <p>
     *            Conditional: You must specify either <code>TypeName</code> and
     *            <code>Type</code>, or <code>Arn</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTypeRegistrationsRequest withTypeName(String typeName) {
        this.typeName = typeName;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the type.
     * </p>
     * <p>
     * Conditional: You must specify either <code>TypeName</code> and
     * <code>Type</code>, or <code>Arn</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern:
     * </b>arn:aws[A-Za-z0-9-]{0,64}:cloudformation:[A-Za-z0-9-]{1,64
     * }:([0-9]{12})?:type/.+<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the type.
     *         </p>
     *         <p>
     *         Conditional: You must specify either <code>TypeName</code> and
     *         <code>Type</code>, or <code>Arn</code>.
     *         </p>
     */
    public String getTypeArn() {
        return typeArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the type.
     * </p>
     * <p>
     * Conditional: You must specify either <code>TypeName</code> and
     * <code>Type</code>, or <code>Arn</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern:
     * </b>arn:aws[A-Za-z0-9-]{0,64}:cloudformation:[A-Za-z0-9-]{1,64
     * }:([0-9]{12})?:type/.+<br/>
     *
     * @param typeArn <p>
     *            The Amazon Resource Name (ARN) of the type.
     *            </p>
     *            <p>
     *            Conditional: You must specify either <code>TypeName</code> and
     *            <code>Type</code>, or <code>Arn</code>.
     *            </p>
     */
    public void setTypeArn(String typeArn) {
        this.typeArn = typeArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the type.
     * </p>
     * <p>
     * Conditional: You must specify either <code>TypeName</code> and
     * <code>Type</code>, or <code>Arn</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern:
     * </b>arn:aws[A-Za-z0-9-]{0,64}:cloudformation:[A-Za-z0-9-]{1,64
     * }:([0-9]{12})?:type/.+<br/>
     *
     * @param typeArn <p>
     *            The Amazon Resource Name (ARN) of the type.
     *            </p>
     *            <p>
     *            Conditional: You must specify either <code>TypeName</code> and
     *            <code>Type</code>, or <code>Arn</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTypeRegistrationsRequest withTypeArn(String typeArn) {
        this.typeArn = typeArn;
        return this;
    }

    /**
     * <p>
     * The current status of the type registration request.
     * </p>
     * <p>
     * The default is <code>IN_PROGRESS</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLETE, IN_PROGRESS, FAILED
     *
     * @return <p>
     *         The current status of the type registration request.
     *         </p>
     *         <p>
     *         The default is <code>IN_PROGRESS</code>.
     *         </p>
     * @see RegistrationStatus
     */
    public String getRegistrationStatusFilter() {
        return registrationStatusFilter;
    }

    /**
     * <p>
     * The current status of the type registration request.
     * </p>
     * <p>
     * The default is <code>IN_PROGRESS</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLETE, IN_PROGRESS, FAILED
     *
     * @param registrationStatusFilter <p>
     *            The current status of the type registration request.
     *            </p>
     *            <p>
     *            The default is <code>IN_PROGRESS</code>.
     *            </p>
     * @see RegistrationStatus
     */
    public void setRegistrationStatusFilter(String registrationStatusFilter) {
        this.registrationStatusFilter = registrationStatusFilter;
    }

    /**
     * <p>
     * The current status of the type registration request.
     * </p>
     * <p>
     * The default is <code>IN_PROGRESS</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLETE, IN_PROGRESS, FAILED
     *
     * @param registrationStatusFilter <p>
     *            The current status of the type registration request.
     *            </p>
     *            <p>
     *            The default is <code>IN_PROGRESS</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RegistrationStatus
     */
    public ListTypeRegistrationsRequest withRegistrationStatusFilter(String registrationStatusFilter) {
        this.registrationStatusFilter = registrationStatusFilter;
        return this;
    }

    /**
     * <p>
     * The current status of the type registration request.
     * </p>
     * <p>
     * The default is <code>IN_PROGRESS</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLETE, IN_PROGRESS, FAILED
     *
     * @param registrationStatusFilter <p>
     *            The current status of the type registration request.
     *            </p>
     *            <p>
     *            The default is <code>IN_PROGRESS</code>.
     *            </p>
     * @see RegistrationStatus
     */
    public void setRegistrationStatusFilter(RegistrationStatus registrationStatusFilter) {
        this.registrationStatusFilter = registrationStatusFilter.toString();
    }

    /**
     * <p>
     * The current status of the type registration request.
     * </p>
     * <p>
     * The default is <code>IN_PROGRESS</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLETE, IN_PROGRESS, FAILED
     *
     * @param registrationStatusFilter <p>
     *            The current status of the type registration request.
     *            </p>
     *            <p>
     *            The default is <code>IN_PROGRESS</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RegistrationStatus
     */
    public ListTypeRegistrationsRequest withRegistrationStatusFilter(
            RegistrationStatus registrationStatusFilter) {
        this.registrationStatusFilter = registrationStatusFilter.toString();
        return this;
    }

    /**
     * <p>
     * The maximum number of results to be returned with a single call. If the
     * number of available results exceeds this maximum, the response includes a
     * <code>NextToken</code> value that you can assign to the
     * <code>NextToken</code> request parameter to get the next set of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @return <p>
     *         The maximum number of results to be returned with a single call.
     *         If the number of available results exceeds this maximum, the
     *         response includes a <code>NextToken</code> value that you can
     *         assign to the <code>NextToken</code> request parameter to get the
     *         next set of results.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of results to be returned with a single call. If the
     * number of available results exceeds this maximum, the response includes a
     * <code>NextToken</code> value that you can assign to the
     * <code>NextToken</code> request parameter to get the next set of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to be returned with a single
     *            call. If the number of available results exceeds this maximum,
     *            the response includes a <code>NextToken</code> value that you
     *            can assign to the <code>NextToken</code> request parameter to
     *            get the next set of results.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to be returned with a single call. If the
     * number of available results exceeds this maximum, the response includes a
     * <code>NextToken</code> value that you can assign to the
     * <code>NextToken</code> request parameter to get the next set of results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to be returned with a single
     *            call. If the number of available results exceeds this maximum,
     *            the response includes a <code>NextToken</code> value that you
     *            can assign to the <code>NextToken</code> request parameter to
     *            get the next set of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTypeRegistrationsRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * If the previous paginated request didn't return all of the remaining
     * results, the response object's <code>NextToken</code> parameter value is
     * set to a token. To retrieve the next set of results, call this action
     * again and assign that token to the request object's
     * <code>NextToken</code> parameter. If there are no remaining results, the
     * previous response object's <code>NextToken</code> parameter is set to
     * <code>null</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         If the previous paginated request didn't return all of the
     *         remaining results, the response object's <code>NextToken</code>
     *         parameter value is set to a token. To retrieve the next set of
     *         results, call this action again and assign that token to the
     *         request object's <code>NextToken</code> parameter. If there are
     *         no remaining results, the previous response object's
     *         <code>NextToken</code> parameter is set to <code>null</code>.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If the previous paginated request didn't return all of the remaining
     * results, the response object's <code>NextToken</code> parameter value is
     * set to a token. To retrieve the next set of results, call this action
     * again and assign that token to the request object's
     * <code>NextToken</code> parameter. If there are no remaining results, the
     * previous response object's <code>NextToken</code> parameter is set to
     * <code>null</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param nextToken <p>
     *            If the previous paginated request didn't return all of the
     *            remaining results, the response object's
     *            <code>NextToken</code> parameter value is set to a token. To
     *            retrieve the next set of results, call this action again and
     *            assign that token to the request object's
     *            <code>NextToken</code> parameter. If there are no remaining
     *            results, the previous response object's <code>NextToken</code>
     *            parameter is set to <code>null</code>.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the previous paginated request didn't return all of the remaining
     * results, the response object's <code>NextToken</code> parameter value is
     * set to a token. To retrieve the next set of results, call this action
     * again and assign that token to the request object's
     * <code>NextToken</code> parameter. If there are no remaining results, the
     * previous response object's <code>NextToken</code> parameter is set to
     * <code>null</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param nextToken <p>
     *            If the previous paginated request didn't return all of the
     *            remaining results, the response object's
     *            <code>NextToken</code> parameter value is set to a token. To
     *            retrieve the next set of results, call this action again and
     *            assign that token to the request object's
     *            <code>NextToken</code> parameter. If there are no remaining
     *            results, the previous response object's <code>NextToken</code>
     *            parameter is set to <code>null</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTypeRegistrationsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getTypeName() != null)
            sb.append("TypeName: " + getTypeName() + ",");
        if (getTypeArn() != null)
            sb.append("TypeArn: " + getTypeArn() + ",");
        if (getRegistrationStatusFilter() != null)
            sb.append("RegistrationStatusFilter: " + getRegistrationStatusFilter() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getTypeName() == null) ? 0 : getTypeName().hashCode());
        hashCode = prime * hashCode + ((getTypeArn() == null) ? 0 : getTypeArn().hashCode());
        hashCode = prime
                * hashCode
                + ((getRegistrationStatusFilter() == null) ? 0 : getRegistrationStatusFilter()
                        .hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListTypeRegistrationsRequest == false)
            return false;
        ListTypeRegistrationsRequest other = (ListTypeRegistrationsRequest) obj;

        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getTypeName() == null ^ this.getTypeName() == null)
            return false;
        if (other.getTypeName() != null && other.getTypeName().equals(this.getTypeName()) == false)
            return false;
        if (other.getTypeArn() == null ^ this.getTypeArn() == null)
            return false;
        if (other.getTypeArn() != null && other.getTypeArn().equals(this.getTypeArn()) == false)
            return false;
        if (other.getRegistrationStatusFilter() == null
                ^ this.getRegistrationStatusFilter() == null)
            return false;
        if (other.getRegistrationStatusFilter() != null
                && other.getRegistrationStatusFilter().equals(this.getRegistrationStatusFilter()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null
                && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
