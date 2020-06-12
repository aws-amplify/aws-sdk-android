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
 * Returns summary information about the versions of a type.
 * </p>
 */
public class ListTypeVersionsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The kind of the type.
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
     * The name of the type for which you want version summary information.
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
     * The Amazon Resource Name (ARN) of the type for which you want version
     * summary information.
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
     * }:[0-9]{12}:type/.+<br/>
     */
    private String arn;

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
     * The deprecation status of the type versions that you want to get summary
     * information about.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LIVE</code>: The type version is registered and can be used in
     * CloudFormation operations, dependent on its provisioning behavior and
     * visibility scope.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DEPRECATED</code>: The type version has been deregistered and can
     * no longer be used in CloudFormation operations.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The default is <code>LIVE</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LIVE, DEPRECATED
     */
    private String deprecatedStatus;

    /**
     * <p>
     * The kind of the type.
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
     *         The kind of the type.
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
     * The kind of the type.
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
     *            The kind of the type.
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
     * The kind of the type.
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
     *            The kind of the type.
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
    public ListTypeVersionsRequest withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The kind of the type.
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
     *            The kind of the type.
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
     * The kind of the type.
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
     *            The kind of the type.
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
    public ListTypeVersionsRequest withType(RegistryType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The name of the type for which you want version summary information.
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
     *         The name of the type for which you want version summary
     *         information.
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
     * The name of the type for which you want version summary information.
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
     *            The name of the type for which you want version summary
     *            information.
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
     * The name of the type for which you want version summary information.
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
     *            The name of the type for which you want version summary
     *            information.
     *            </p>
     *            <p>
     *            Conditional: You must specify either <code>TypeName</code> and
     *            <code>Type</code>, or <code>Arn</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTypeVersionsRequest withTypeName(String typeName) {
        this.typeName = typeName;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the type for which you want version
     * summary information.
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
     * }:[0-9]{12}:type/.+<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the type for which you want
     *         version summary information.
     *         </p>
     *         <p>
     *         Conditional: You must specify either <code>TypeName</code> and
     *         <code>Type</code>, or <code>Arn</code>.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the type for which you want version
     * summary information.
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
     * }:[0-9]{12}:type/.+<br/>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the type for which you want
     *            version summary information.
     *            </p>
     *            <p>
     *            Conditional: You must specify either <code>TypeName</code> and
     *            <code>Type</code>, or <code>Arn</code>.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the type for which you want version
     * summary information.
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
     * }:[0-9]{12}:type/.+<br/>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the type for which you want
     *            version summary information.
     *            </p>
     *            <p>
     *            Conditional: You must specify either <code>TypeName</code> and
     *            <code>Type</code>, or <code>Arn</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTypeVersionsRequest withArn(String arn) {
        this.arn = arn;
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
    public ListTypeVersionsRequest withMaxResults(Integer maxResults) {
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
    public ListTypeVersionsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The deprecation status of the type versions that you want to get summary
     * information about.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LIVE</code>: The type version is registered and can be used in
     * CloudFormation operations, dependent on its provisioning behavior and
     * visibility scope.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DEPRECATED</code>: The type version has been deregistered and can
     * no longer be used in CloudFormation operations.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The default is <code>LIVE</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LIVE, DEPRECATED
     *
     * @return <p>
     *         The deprecation status of the type versions that you want to get
     *         summary information about.
     *         </p>
     *         <p>
     *         Valid values include:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>LIVE</code>: The type version is registered and can be used
     *         in CloudFormation operations, dependent on its provisioning
     *         behavior and visibility scope.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DEPRECATED</code>: The type version has been deregistered
     *         and can no longer be used in CloudFormation operations.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The default is <code>LIVE</code>.
     *         </p>
     * @see DeprecatedStatus
     */
    public String getDeprecatedStatus() {
        return deprecatedStatus;
    }

    /**
     * <p>
     * The deprecation status of the type versions that you want to get summary
     * information about.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LIVE</code>: The type version is registered and can be used in
     * CloudFormation operations, dependent on its provisioning behavior and
     * visibility scope.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DEPRECATED</code>: The type version has been deregistered and can
     * no longer be used in CloudFormation operations.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The default is <code>LIVE</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LIVE, DEPRECATED
     *
     * @param deprecatedStatus <p>
     *            The deprecation status of the type versions that you want to
     *            get summary information about.
     *            </p>
     *            <p>
     *            Valid values include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>LIVE</code>: The type version is registered and can be
     *            used in CloudFormation operations, dependent on its
     *            provisioning behavior and visibility scope.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DEPRECATED</code>: The type version has been
     *            deregistered and can no longer be used in CloudFormation
     *            operations.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            The default is <code>LIVE</code>.
     *            </p>
     * @see DeprecatedStatus
     */
    public void setDeprecatedStatus(String deprecatedStatus) {
        this.deprecatedStatus = deprecatedStatus;
    }

    /**
     * <p>
     * The deprecation status of the type versions that you want to get summary
     * information about.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LIVE</code>: The type version is registered and can be used in
     * CloudFormation operations, dependent on its provisioning behavior and
     * visibility scope.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DEPRECATED</code>: The type version has been deregistered and can
     * no longer be used in CloudFormation operations.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The default is <code>LIVE</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LIVE, DEPRECATED
     *
     * @param deprecatedStatus <p>
     *            The deprecation status of the type versions that you want to
     *            get summary information about.
     *            </p>
     *            <p>
     *            Valid values include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>LIVE</code>: The type version is registered and can be
     *            used in CloudFormation operations, dependent on its
     *            provisioning behavior and visibility scope.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DEPRECATED</code>: The type version has been
     *            deregistered and can no longer be used in CloudFormation
     *            operations.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            The default is <code>LIVE</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DeprecatedStatus
     */
    public ListTypeVersionsRequest withDeprecatedStatus(String deprecatedStatus) {
        this.deprecatedStatus = deprecatedStatus;
        return this;
    }

    /**
     * <p>
     * The deprecation status of the type versions that you want to get summary
     * information about.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LIVE</code>: The type version is registered and can be used in
     * CloudFormation operations, dependent on its provisioning behavior and
     * visibility scope.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DEPRECATED</code>: The type version has been deregistered and can
     * no longer be used in CloudFormation operations.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The default is <code>LIVE</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LIVE, DEPRECATED
     *
     * @param deprecatedStatus <p>
     *            The deprecation status of the type versions that you want to
     *            get summary information about.
     *            </p>
     *            <p>
     *            Valid values include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>LIVE</code>: The type version is registered and can be
     *            used in CloudFormation operations, dependent on its
     *            provisioning behavior and visibility scope.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DEPRECATED</code>: The type version has been
     *            deregistered and can no longer be used in CloudFormation
     *            operations.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            The default is <code>LIVE</code>.
     *            </p>
     * @see DeprecatedStatus
     */
    public void setDeprecatedStatus(DeprecatedStatus deprecatedStatus) {
        this.deprecatedStatus = deprecatedStatus.toString();
    }

    /**
     * <p>
     * The deprecation status of the type versions that you want to get summary
     * information about.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LIVE</code>: The type version is registered and can be used in
     * CloudFormation operations, dependent on its provisioning behavior and
     * visibility scope.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DEPRECATED</code>: The type version has been deregistered and can
     * no longer be used in CloudFormation operations.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The default is <code>LIVE</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LIVE, DEPRECATED
     *
     * @param deprecatedStatus <p>
     *            The deprecation status of the type versions that you want to
     *            get summary information about.
     *            </p>
     *            <p>
     *            Valid values include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>LIVE</code>: The type version is registered and can be
     *            used in CloudFormation operations, dependent on its
     *            provisioning behavior and visibility scope.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DEPRECATED</code>: The type version has been
     *            deregistered and can no longer be used in CloudFormation
     *            operations.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            The default is <code>LIVE</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DeprecatedStatus
     */
    public ListTypeVersionsRequest withDeprecatedStatus(DeprecatedStatus deprecatedStatus) {
        this.deprecatedStatus = deprecatedStatus.toString();
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
        if (getArn() != null)
            sb.append("Arn: " + getArn() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getDeprecatedStatus() != null)
            sb.append("DeprecatedStatus: " + getDeprecatedStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getTypeName() == null) ? 0 : getTypeName().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode
                + ((getDeprecatedStatus() == null) ? 0 : getDeprecatedStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListTypeVersionsRequest == false)
            return false;
        ListTypeVersionsRequest other = (ListTypeVersionsRequest) obj;

        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getTypeName() == null ^ this.getTypeName() == null)
            return false;
        if (other.getTypeName() != null && other.getTypeName().equals(this.getTypeName()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
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
        if (other.getDeprecatedStatus() == null ^ this.getDeprecatedStatus() == null)
            return false;
        if (other.getDeprecatedStatus() != null
                && other.getDeprecatedStatus().equals(this.getDeprecatedStatus()) == false)
            return false;
        return true;
    }
}
