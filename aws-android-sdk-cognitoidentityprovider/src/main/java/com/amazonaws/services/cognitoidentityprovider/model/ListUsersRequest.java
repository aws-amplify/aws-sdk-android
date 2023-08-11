/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.cognitoidentityprovider.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Lists users and their basic details in a user pool.
 * </p>
 * <note>
 * <p>
 * Amazon Cognito evaluates Identity and Access Management (IAM) policies in
 * requests for this API operation. For this operation, you must use IAM
 * credentials to authorize requests, and you must grant yourself the
 * corresponding IAM permission in a policy.
 * </p>
 * <p class="title">
 * <b>Learn more</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_aws-signing.html"
 * >Signing Amazon Web Services API Requests</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pools-API-operations.html"
 * >Using the Amazon Cognito user pools API and user pool endpoints</a>
 * </p>
 * </li>
 * </ul>
 * </note>
 */
public class ListUsersRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The user pool ID for the user pool on which the search should be
     * performed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     */
    private String userPoolId;

    /**
     * <p>
     * A JSON array of user attribute names, for example <code>given_name</code>
     * , that you want Amazon Cognito to include in the response for each user.
     * When you don't provide an <code>AttributesToGet</code> parameter, Amazon
     * Cognito returns all attributes for each user.
     * </p>
     */
    private java.util.List<String> attributesToGet;

    /**
     * <p>
     * Maximum number of users to be returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 60<br/>
     */
    private Integer limit;

    /**
     * <p>
     * An identifier that was returned from the previous call to this operation,
     * which can be used to return the next set of items in the list.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>[\S]+<br/>
     */
    private String paginationToken;

    /**
     * <p>
     * A filter string of the form
     * "<i>AttributeName</i> <i>Filter-Type</i> "<i>AttributeValue</i>"".
     * Quotation marks within the filter string must be escaped using the
     * backslash (\) character. For example, "<code>family_name</code> =
     * \"Reddy\"".
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>AttributeName</i>: The name of the attribute to search for. You can
     * only search for one attribute at a time.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Filter-Type</i>: For an exact match, use =, for example, "
     * <code>given_name</code> = \"Jon\"". For a prefix ("starts with") match,
     * use ^=, for example, "<code>given_name</code> ^= \"Jon\"".
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>AttributeValue</i>: The attribute value that must be matched for each
     * user.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the filter string is empty, <code>ListUsers</code> returns all users
     * in the user pool.
     * </p>
     * <p>
     * You can only search for the following standard attributes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>username</code> (case-sensitive)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>email</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>phone_number</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>name</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>given_name</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>family_name</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>preferred_username</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cognito:user_status</code> (called <b>Status</b> in the Console)
     * (case-insensitive)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status (called <b>Enabled</b> in the Console) (case-sensitive)</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sub</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Custom attributes aren't searchable.
     * </p>
     * <note>
     * <p>
     * You can also list users with a client-side filter. The server-side filter
     * matches no more than one attribute. For an advanced search, use a
     * client-side filter with the <code>--query</code> parameter of the
     * <code>list-users</code> action in the CLI. When you use a client-side
     * filter, ListUsers returns a paginated list of zero or more users. You can
     * receive multiple pages in a row with zero results. Repeat the query with
     * each pagination token that is returned until you receive a null
     * pagination token value, and then review the combined result.
     * </p>
     * <p>
     * For more information about server-side and client-side filtering, see <a
     * href=
     * "https://docs.aws.amazon.com/cli/latest/userguide/cli-usage-filter.html"
     * >FilteringCLI output</a> in the <a href=
     * "https://docs.aws.amazon.com/cli/latest/userguide/cli-usage-filter.html"
     * >Command Line Interface User Guide</a>.
     * </p>
     * </note>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/how-to-manage-user-accounts.html#cognito-user-pools-searching-for-users-using-listusers-api"
     * >Searching for Users Using the ListUsers API</a> and <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/how-to-manage-user-accounts.html#cognito-user-pools-searching-for-users-listusers-api-examples"
     * >Examples of Using the ListUsers API</a> in the <i>Amazon Cognito
     * Developer Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     */
    private String filter;

    /**
     * <p>
     * The user pool ID for the user pool on which the search should be
     * performed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     *
     * @return <p>
     *         The user pool ID for the user pool on which the search should be
     *         performed.
     *         </p>
     */
    public String getUserPoolId() {
        return userPoolId;
    }

    /**
     * <p>
     * The user pool ID for the user pool on which the search should be
     * performed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     *
     * @param userPoolId <p>
     *            The user pool ID for the user pool on which the search should
     *            be performed.
     *            </p>
     */
    public void setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
    }

    /**
     * <p>
     * The user pool ID for the user pool on which the search should be
     * performed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     *
     * @param userPoolId <p>
     *            The user pool ID for the user pool on which the search should
     *            be performed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListUsersRequest withUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
        return this;
    }

    /**
     * <p>
     * A JSON array of user attribute names, for example <code>given_name</code>
     * , that you want Amazon Cognito to include in the response for each user.
     * When you don't provide an <code>AttributesToGet</code> parameter, Amazon
     * Cognito returns all attributes for each user.
     * </p>
     *
     * @return <p>
     *         A JSON array of user attribute names, for example
     *         <code>given_name</code>, that you want Amazon Cognito to include
     *         in the response for each user. When you don't provide an
     *         <code>AttributesToGet</code> parameter, Amazon Cognito returns
     *         all attributes for each user.
     *         </p>
     */
    public java.util.List<String> getAttributesToGet() {
        return attributesToGet;
    }

    /**
     * <p>
     * A JSON array of user attribute names, for example <code>given_name</code>
     * , that you want Amazon Cognito to include in the response for each user.
     * When you don't provide an <code>AttributesToGet</code> parameter, Amazon
     * Cognito returns all attributes for each user.
     * </p>
     *
     * @param attributesToGet <p>
     *            A JSON array of user attribute names, for example
     *            <code>given_name</code>, that you want Amazon Cognito to
     *            include in the response for each user. When you don't provide
     *            an <code>AttributesToGet</code> parameter, Amazon Cognito
     *            returns all attributes for each user.
     *            </p>
     */
    public void setAttributesToGet(java.util.Collection<String> attributesToGet) {
        if (attributesToGet == null) {
            this.attributesToGet = null;
            return;
        }

        this.attributesToGet = new java.util.ArrayList<String>(attributesToGet);
    }

    /**
     * <p>
     * A JSON array of user attribute names, for example <code>given_name</code>
     * , that you want Amazon Cognito to include in the response for each user.
     * When you don't provide an <code>AttributesToGet</code> parameter, Amazon
     * Cognito returns all attributes for each user.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attributesToGet <p>
     *            A JSON array of user attribute names, for example
     *            <code>given_name</code>, that you want Amazon Cognito to
     *            include in the response for each user. When you don't provide
     *            an <code>AttributesToGet</code> parameter, Amazon Cognito
     *            returns all attributes for each user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListUsersRequest withAttributesToGet(String... attributesToGet) {
        if (getAttributesToGet() == null) {
            this.attributesToGet = new java.util.ArrayList<String>(attributesToGet.length);
        }
        for (String value : attributesToGet) {
            this.attributesToGet.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A JSON array of user attribute names, for example <code>given_name</code>
     * , that you want Amazon Cognito to include in the response for each user.
     * When you don't provide an <code>AttributesToGet</code> parameter, Amazon
     * Cognito returns all attributes for each user.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attributesToGet <p>
     *            A JSON array of user attribute names, for example
     *            <code>given_name</code>, that you want Amazon Cognito to
     *            include in the response for each user. When you don't provide
     *            an <code>AttributesToGet</code> parameter, Amazon Cognito
     *            returns all attributes for each user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListUsersRequest withAttributesToGet(java.util.Collection<String> attributesToGet) {
        setAttributesToGet(attributesToGet);
        return this;
    }

    /**
     * <p>
     * Maximum number of users to be returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 60<br/>
     *
     * @return <p>
     *         Maximum number of users to be returned.
     *         </p>
     */
    public Integer getLimit() {
        return limit;
    }

    /**
     * <p>
     * Maximum number of users to be returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 60<br/>
     *
     * @param limit <p>
     *            Maximum number of users to be returned.
     *            </p>
     */
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * Maximum number of users to be returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 60<br/>
     *
     * @param limit <p>
     *            Maximum number of users to be returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListUsersRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * <p>
     * An identifier that was returned from the previous call to this operation,
     * which can be used to return the next set of items in the list.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>[\S]+<br/>
     *
     * @return <p>
     *         An identifier that was returned from the previous call to this
     *         operation, which can be used to return the next set of items in
     *         the list.
     *         </p>
     */
    public String getPaginationToken() {
        return paginationToken;
    }

    /**
     * <p>
     * An identifier that was returned from the previous call to this operation,
     * which can be used to return the next set of items in the list.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>[\S]+<br/>
     *
     * @param paginationToken <p>
     *            An identifier that was returned from the previous call to this
     *            operation, which can be used to return the next set of items
     *            in the list.
     *            </p>
     */
    public void setPaginationToken(String paginationToken) {
        this.paginationToken = paginationToken;
    }

    /**
     * <p>
     * An identifier that was returned from the previous call to this operation,
     * which can be used to return the next set of items in the list.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>[\S]+<br/>
     *
     * @param paginationToken <p>
     *            An identifier that was returned from the previous call to this
     *            operation, which can be used to return the next set of items
     *            in the list.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListUsersRequest withPaginationToken(String paginationToken) {
        this.paginationToken = paginationToken;
        return this;
    }

    /**
     * <p>
     * A filter string of the form
     * "<i>AttributeName</i> <i>Filter-Type</i> "<i>AttributeValue</i>"".
     * Quotation marks within the filter string must be escaped using the
     * backslash (\) character. For example, "<code>family_name</code> =
     * \"Reddy\"".
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>AttributeName</i>: The name of the attribute to search for. You can
     * only search for one attribute at a time.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Filter-Type</i>: For an exact match, use =, for example, "
     * <code>given_name</code> = \"Jon\"". For a prefix ("starts with") match,
     * use ^=, for example, "<code>given_name</code> ^= \"Jon\"".
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>AttributeValue</i>: The attribute value that must be matched for each
     * user.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the filter string is empty, <code>ListUsers</code> returns all users
     * in the user pool.
     * </p>
     * <p>
     * You can only search for the following standard attributes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>username</code> (case-sensitive)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>email</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>phone_number</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>name</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>given_name</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>family_name</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>preferred_username</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cognito:user_status</code> (called <b>Status</b> in the Console)
     * (case-insensitive)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status (called <b>Enabled</b> in the Console) (case-sensitive)</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sub</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Custom attributes aren't searchable.
     * </p>
     * <note>
     * <p>
     * You can also list users with a client-side filter. The server-side filter
     * matches no more than one attribute. For an advanced search, use a
     * client-side filter with the <code>--query</code> parameter of the
     * <code>list-users</code> action in the CLI. When you use a client-side
     * filter, ListUsers returns a paginated list of zero or more users. You can
     * receive multiple pages in a row with zero results. Repeat the query with
     * each pagination token that is returned until you receive a null
     * pagination token value, and then review the combined result.
     * </p>
     * <p>
     * For more information about server-side and client-side filtering, see <a
     * href=
     * "https://docs.aws.amazon.com/cli/latest/userguide/cli-usage-filter.html"
     * >FilteringCLI output</a> in the <a href=
     * "https://docs.aws.amazon.com/cli/latest/userguide/cli-usage-filter.html"
     * >Command Line Interface User Guide</a>.
     * </p>
     * </note>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/how-to-manage-user-accounts.html#cognito-user-pools-searching-for-users-using-listusers-api"
     * >Searching for Users Using the ListUsers API</a> and <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/how-to-manage-user-accounts.html#cognito-user-pools-searching-for-users-listusers-api-examples"
     * >Examples of Using the ListUsers API</a> in the <i>Amazon Cognito
     * Developer Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @return <p>
     *         A filter string of the form
     *         "<i>AttributeName</i> <i>Filter-Type</i> "
     *         <i>AttributeValue</i>"". Quotation marks within the filter string
     *         must be escaped using the backslash (\) character. For example, "
     *         <code>family_name</code> = \"Reddy\"".
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>AttributeName</i>: The name of the attribute to search for.
     *         You can only search for one attribute at a time.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Filter-Type</i>: For an exact match, use =, for example, "
     *         <code>given_name</code> = \"Jon\"". For a prefix ("starts with")
     *         match, use ^=, for example, "<code>given_name</code> ^= \"Jon\"".
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>AttributeValue</i>: The attribute value that must be matched
     *         for each user.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If the filter string is empty, <code>ListUsers</code> returns all
     *         users in the user pool.
     *         </p>
     *         <p>
     *         You can only search for the following standard attributes:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>username</code> (case-sensitive)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>email</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>phone_number</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>name</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>given_name</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>family_name</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>preferred_username</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>cognito:user_status</code> (called <b>Status</b> in the
     *         Console) (case-insensitive)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>status (called <b>Enabled</b> in the Console) (case-sensitive)</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>sub</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Custom attributes aren't searchable.
     *         </p>
     *         <note>
     *         <p>
     *         You can also list users with a client-side filter. The
     *         server-side filter matches no more than one attribute. For an
     *         advanced search, use a client-side filter with the
     *         <code>--query</code> parameter of the <code>list-users</code>
     *         action in the CLI. When you use a client-side filter, ListUsers
     *         returns a paginated list of zero or more users. You can receive
     *         multiple pages in a row with zero results. Repeat the query with
     *         each pagination token that is returned until you receive a null
     *         pagination token value, and then review the combined result.
     *         </p>
     *         <p>
     *         For more information about server-side and client-side filtering,
     *         see <a href=
     *         "https://docs.aws.amazon.com/cli/latest/userguide/cli-usage-filter.html"
     *         >FilteringCLI output</a> in the <a href=
     *         "https://docs.aws.amazon.com/cli/latest/userguide/cli-usage-filter.html"
     *         >Command Line Interface User Guide</a>.
     *         </p>
     *         </note>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/cognito/latest/developerguide/how-to-manage-user-accounts.html#cognito-user-pools-searching-for-users-using-listusers-api"
     *         >Searching for Users Using the ListUsers API</a> and <a href=
     *         "https://docs.aws.amazon.com/cognito/latest/developerguide/how-to-manage-user-accounts.html#cognito-user-pools-searching-for-users-listusers-api-examples"
     *         >Examples of Using the ListUsers API</a> in the <i>Amazon Cognito
     *         Developer Guide</i>.
     *         </p>
     */
    public String getFilter() {
        return filter;
    }

    /**
     * <p>
     * A filter string of the form
     * "<i>AttributeName</i> <i>Filter-Type</i> "<i>AttributeValue</i>"".
     * Quotation marks within the filter string must be escaped using the
     * backslash (\) character. For example, "<code>family_name</code> =
     * \"Reddy\"".
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>AttributeName</i>: The name of the attribute to search for. You can
     * only search for one attribute at a time.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Filter-Type</i>: For an exact match, use =, for example, "
     * <code>given_name</code> = \"Jon\"". For a prefix ("starts with") match,
     * use ^=, for example, "<code>given_name</code> ^= \"Jon\"".
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>AttributeValue</i>: The attribute value that must be matched for each
     * user.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the filter string is empty, <code>ListUsers</code> returns all users
     * in the user pool.
     * </p>
     * <p>
     * You can only search for the following standard attributes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>username</code> (case-sensitive)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>email</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>phone_number</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>name</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>given_name</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>family_name</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>preferred_username</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cognito:user_status</code> (called <b>Status</b> in the Console)
     * (case-insensitive)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status (called <b>Enabled</b> in the Console) (case-sensitive)</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sub</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Custom attributes aren't searchable.
     * </p>
     * <note>
     * <p>
     * You can also list users with a client-side filter. The server-side filter
     * matches no more than one attribute. For an advanced search, use a
     * client-side filter with the <code>--query</code> parameter of the
     * <code>list-users</code> action in the CLI. When you use a client-side
     * filter, ListUsers returns a paginated list of zero or more users. You can
     * receive multiple pages in a row with zero results. Repeat the query with
     * each pagination token that is returned until you receive a null
     * pagination token value, and then review the combined result.
     * </p>
     * <p>
     * For more information about server-side and client-side filtering, see <a
     * href=
     * "https://docs.aws.amazon.com/cli/latest/userguide/cli-usage-filter.html"
     * >FilteringCLI output</a> in the <a href=
     * "https://docs.aws.amazon.com/cli/latest/userguide/cli-usage-filter.html"
     * >Command Line Interface User Guide</a>.
     * </p>
     * </note>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/how-to-manage-user-accounts.html#cognito-user-pools-searching-for-users-using-listusers-api"
     * >Searching for Users Using the ListUsers API</a> and <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/how-to-manage-user-accounts.html#cognito-user-pools-searching-for-users-listusers-api-examples"
     * >Examples of Using the ListUsers API</a> in the <i>Amazon Cognito
     * Developer Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param filter <p>
     *            A filter string of the form
     *            "<i>AttributeName</i> <i>Filter-Type</i> "
     *            <i>AttributeValue</i>"". Quotation marks within the filter
     *            string must be escaped using the backslash (\) character. For
     *            example, "<code>family_name</code> = \"Reddy\"".
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <i>AttributeName</i>: The name of the attribute to search for.
     *            You can only search for one attribute at a time.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>Filter-Type</i>: For an exact match, use =, for example, "
     *            <code>given_name</code> = \"Jon\"". For a prefix
     *            ("starts with") match, use ^=, for example, "
     *            <code>given_name</code> ^= \"Jon\"".
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>AttributeValue</i>: The attribute value that must be
     *            matched for each user.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If the filter string is empty, <code>ListUsers</code> returns
     *            all users in the user pool.
     *            </p>
     *            <p>
     *            You can only search for the following standard attributes:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>username</code> (case-sensitive)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>email</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>phone_number</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>name</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>given_name</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>family_name</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>preferred_username</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>cognito:user_status</code> (called <b>Status</b> in the
     *            Console) (case-insensitive)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>status (called <b>Enabled</b> in the Console) (case-sensitive)</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>sub</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Custom attributes aren't searchable.
     *            </p>
     *            <note>
     *            <p>
     *            You can also list users with a client-side filter. The
     *            server-side filter matches no more than one attribute. For an
     *            advanced search, use a client-side filter with the
     *            <code>--query</code> parameter of the <code>list-users</code>
     *            action in the CLI. When you use a client-side filter,
     *            ListUsers returns a paginated list of zero or more users. You
     *            can receive multiple pages in a row with zero results. Repeat
     *            the query with each pagination token that is returned until
     *            you receive a null pagination token value, and then review the
     *            combined result.
     *            </p>
     *            <p>
     *            For more information about server-side and client-side
     *            filtering, see <a href=
     *            "https://docs.aws.amazon.com/cli/latest/userguide/cli-usage-filter.html"
     *            >FilteringCLI output</a> in the <a href=
     *            "https://docs.aws.amazon.com/cli/latest/userguide/cli-usage-filter.html"
     *            >Command Line Interface User Guide</a>.
     *            </p>
     *            </note>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/cognito/latest/developerguide/how-to-manage-user-accounts.html#cognito-user-pools-searching-for-users-using-listusers-api"
     *            >Searching for Users Using the ListUsers API</a> and <a href=
     *            "https://docs.aws.amazon.com/cognito/latest/developerguide/how-to-manage-user-accounts.html#cognito-user-pools-searching-for-users-listusers-api-examples"
     *            >Examples of Using the ListUsers API</a> in the <i>Amazon
     *            Cognito Developer Guide</i>.
     *            </p>
     */
    public void setFilter(String filter) {
        this.filter = filter;
    }

    /**
     * <p>
     * A filter string of the form
     * "<i>AttributeName</i> <i>Filter-Type</i> "<i>AttributeValue</i>"".
     * Quotation marks within the filter string must be escaped using the
     * backslash (\) character. For example, "<code>family_name</code> =
     * \"Reddy\"".
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>AttributeName</i>: The name of the attribute to search for. You can
     * only search for one attribute at a time.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Filter-Type</i>: For an exact match, use =, for example, "
     * <code>given_name</code> = \"Jon\"". For a prefix ("starts with") match,
     * use ^=, for example, "<code>given_name</code> ^= \"Jon\"".
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>AttributeValue</i>: The attribute value that must be matched for each
     * user.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the filter string is empty, <code>ListUsers</code> returns all users
     * in the user pool.
     * </p>
     * <p>
     * You can only search for the following standard attributes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>username</code> (case-sensitive)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>email</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>phone_number</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>name</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>given_name</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>family_name</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>preferred_username</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cognito:user_status</code> (called <b>Status</b> in the Console)
     * (case-insensitive)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status (called <b>Enabled</b> in the Console) (case-sensitive)</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sub</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Custom attributes aren't searchable.
     * </p>
     * <note>
     * <p>
     * You can also list users with a client-side filter. The server-side filter
     * matches no more than one attribute. For an advanced search, use a
     * client-side filter with the <code>--query</code> parameter of the
     * <code>list-users</code> action in the CLI. When you use a client-side
     * filter, ListUsers returns a paginated list of zero or more users. You can
     * receive multiple pages in a row with zero results. Repeat the query with
     * each pagination token that is returned until you receive a null
     * pagination token value, and then review the combined result.
     * </p>
     * <p>
     * For more information about server-side and client-side filtering, see <a
     * href=
     * "https://docs.aws.amazon.com/cli/latest/userguide/cli-usage-filter.html"
     * >FilteringCLI output</a> in the <a href=
     * "https://docs.aws.amazon.com/cli/latest/userguide/cli-usage-filter.html"
     * >Command Line Interface User Guide</a>.
     * </p>
     * </note>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/how-to-manage-user-accounts.html#cognito-user-pools-searching-for-users-using-listusers-api"
     * >Searching for Users Using the ListUsers API</a> and <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/how-to-manage-user-accounts.html#cognito-user-pools-searching-for-users-listusers-api-examples"
     * >Examples of Using the ListUsers API</a> in the <i>Amazon Cognito
     * Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param filter <p>
     *            A filter string of the form
     *            "<i>AttributeName</i> <i>Filter-Type</i> "
     *            <i>AttributeValue</i>"". Quotation marks within the filter
     *            string must be escaped using the backslash (\) character. For
     *            example, "<code>family_name</code> = \"Reddy\"".
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <i>AttributeName</i>: The name of the attribute to search for.
     *            You can only search for one attribute at a time.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>Filter-Type</i>: For an exact match, use =, for example, "
     *            <code>given_name</code> = \"Jon\"". For a prefix
     *            ("starts with") match, use ^=, for example, "
     *            <code>given_name</code> ^= \"Jon\"".
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>AttributeValue</i>: The attribute value that must be
     *            matched for each user.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If the filter string is empty, <code>ListUsers</code> returns
     *            all users in the user pool.
     *            </p>
     *            <p>
     *            You can only search for the following standard attributes:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>username</code> (case-sensitive)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>email</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>phone_number</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>name</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>given_name</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>family_name</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>preferred_username</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>cognito:user_status</code> (called <b>Status</b> in the
     *            Console) (case-insensitive)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>status (called <b>Enabled</b> in the Console) (case-sensitive)</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>sub</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Custom attributes aren't searchable.
     *            </p>
     *            <note>
     *            <p>
     *            You can also list users with a client-side filter. The
     *            server-side filter matches no more than one attribute. For an
     *            advanced search, use a client-side filter with the
     *            <code>--query</code> parameter of the <code>list-users</code>
     *            action in the CLI. When you use a client-side filter,
     *            ListUsers returns a paginated list of zero or more users. You
     *            can receive multiple pages in a row with zero results. Repeat
     *            the query with each pagination token that is returned until
     *            you receive a null pagination token value, and then review the
     *            combined result.
     *            </p>
     *            <p>
     *            For more information about server-side and client-side
     *            filtering, see <a href=
     *            "https://docs.aws.amazon.com/cli/latest/userguide/cli-usage-filter.html"
     *            >FilteringCLI output</a> in the <a href=
     *            "https://docs.aws.amazon.com/cli/latest/userguide/cli-usage-filter.html"
     *            >Command Line Interface User Guide</a>.
     *            </p>
     *            </note>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/cognito/latest/developerguide/how-to-manage-user-accounts.html#cognito-user-pools-searching-for-users-using-listusers-api"
     *            >Searching for Users Using the ListUsers API</a> and <a href=
     *            "https://docs.aws.amazon.com/cognito/latest/developerguide/how-to-manage-user-accounts.html#cognito-user-pools-searching-for-users-listusers-api-examples"
     *            >Examples of Using the ListUsers API</a> in the <i>Amazon
     *            Cognito Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListUsersRequest withFilter(String filter) {
        this.filter = filter;
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
        if (getUserPoolId() != null)
            sb.append("UserPoolId: " + getUserPoolId() + ",");
        if (getAttributesToGet() != null)
            sb.append("AttributesToGet: " + getAttributesToGet() + ",");
        if (getLimit() != null)
            sb.append("Limit: " + getLimit() + ",");
        if (getPaginationToken() != null)
            sb.append("PaginationToken: " + getPaginationToken() + ",");
        if (getFilter() != null)
            sb.append("Filter: " + getFilter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserPoolId() == null) ? 0 : getUserPoolId().hashCode());
        hashCode = prime * hashCode
                + ((getAttributesToGet() == null) ? 0 : getAttributesToGet().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        hashCode = prime * hashCode
                + ((getPaginationToken() == null) ? 0 : getPaginationToken().hashCode());
        hashCode = prime * hashCode + ((getFilter() == null) ? 0 : getFilter().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListUsersRequest == false)
            return false;
        ListUsersRequest other = (ListUsersRequest) obj;

        if (other.getUserPoolId() == null ^ this.getUserPoolId() == null)
            return false;
        if (other.getUserPoolId() != null
                && other.getUserPoolId().equals(this.getUserPoolId()) == false)
            return false;
        if (other.getAttributesToGet() == null ^ this.getAttributesToGet() == null)
            return false;
        if (other.getAttributesToGet() != null
                && other.getAttributesToGet().equals(this.getAttributesToGet()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        if (other.getPaginationToken() == null ^ this.getPaginationToken() == null)
            return false;
        if (other.getPaginationToken() != null
                && other.getPaginationToken().equals(this.getPaginationToken()) == false)
            return false;
        if (other.getFilter() == null ^ this.getFilter() == null)
            return false;
        if (other.getFilter() != null && other.getFilter().equals(this.getFilter()) == false)
            return false;
        return true;
    }
}
