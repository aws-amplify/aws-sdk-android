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

package com.amazonaws.services.amazoncodegurureviewer.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Associates an AWS CodeCommit repository with Amazon CodeGuru Reviewer. When
 * you associate an AWS CodeCommit repository with Amazon CodeGuru Reviewer,
 * Amazon CodeGuru Reviewer will provide recommendations for each pull request
 * raised within the repository. You can view recommendations in the AWS
 * CodeCommit repository.
 * </p>
 * <p>
 * You can associate a GitHub repository using the Amazon CodeGuru Reviewer
 * console.
 * </p>
 */
public class AssociateRepositoryRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The repository to associate.
     * </p>
     */
    private Repository repository;

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request.
     * </p>
     * <p>
     * To add a new repository association, this parameter specifies a unique
     * identifier for the new repository association that helps ensure
     * idempotency.
     * </p>
     * <p>
     * If you use the AWS CLI or one of the AWS SDKs to call this operation, you
     * can leave this parameter empty. The CLI or SDK generates a random UUID
     * for you and includes that in the request. If you don't use the SDK and
     * instead generate a raw HTTP request to the Secrets Manager service
     * endpoint, you must generate a ClientRequestToken yourself for new
     * versions and include that value in the request.
     * </p>
     * <p>
     * You typically interact with this value if you implement your own retry
     * logic and want to ensure that a given repository association is not
     * created twice. We recommend that you generate a UUID-type value to ensure
     * uniqueness within the specified repository association.
     * </p>
     * <p>
     * Amazon CodeGuru Reviewer uses this value to prevent the accidental
     * creation of duplicate repository associations if there are failures and
     * retries.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[\w-]+$<br/>
     */
    private String clientRequestToken;

    /**
     * <p>
     * The repository to associate.
     * </p>
     *
     * @return <p>
     *         The repository to associate.
     *         </p>
     */
    public Repository getRepository() {
        return repository;
    }

    /**
     * <p>
     * The repository to associate.
     * </p>
     *
     * @param repository <p>
     *            The repository to associate.
     *            </p>
     */
    public void setRepository(Repository repository) {
        this.repository = repository;
    }

    /**
     * <p>
     * The repository to associate.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param repository <p>
     *            The repository to associate.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssociateRepositoryRequest withRepository(Repository repository) {
        this.repository = repository;
        return this;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request.
     * </p>
     * <p>
     * To add a new repository association, this parameter specifies a unique
     * identifier for the new repository association that helps ensure
     * idempotency.
     * </p>
     * <p>
     * If you use the AWS CLI or one of the AWS SDKs to call this operation, you
     * can leave this parameter empty. The CLI or SDK generates a random UUID
     * for you and includes that in the request. If you don't use the SDK and
     * instead generate a raw HTTP request to the Secrets Manager service
     * endpoint, you must generate a ClientRequestToken yourself for new
     * versions and include that value in the request.
     * </p>
     * <p>
     * You typically interact with this value if you implement your own retry
     * logic and want to ensure that a given repository association is not
     * created twice. We recommend that you generate a UUID-type value to ensure
     * uniqueness within the specified repository association.
     * </p>
     * <p>
     * Amazon CodeGuru Reviewer uses this value to prevent the accidental
     * creation of duplicate repository associations if there are failures and
     * retries.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[\w-]+$<br/>
     *
     * @return <p>
     *         Unique, case-sensitive identifier that you provide to ensure the
     *         idempotency of the request.
     *         </p>
     *         <p>
     *         To add a new repository association, this parameter specifies a
     *         unique identifier for the new repository association that helps
     *         ensure idempotency.
     *         </p>
     *         <p>
     *         If you use the AWS CLI or one of the AWS SDKs to call this
     *         operation, you can leave this parameter empty. The CLI or SDK
     *         generates a random UUID for you and includes that in the request.
     *         If you don't use the SDK and instead generate a raw HTTP request
     *         to the Secrets Manager service endpoint, you must generate a
     *         ClientRequestToken yourself for new versions and include that
     *         value in the request.
     *         </p>
     *         <p>
     *         You typically interact with this value if you implement your own
     *         retry logic and want to ensure that a given repository
     *         association is not created twice. We recommend that you generate
     *         a UUID-type value to ensure uniqueness within the specified
     *         repository association.
     *         </p>
     *         <p>
     *         Amazon CodeGuru Reviewer uses this value to prevent the
     *         accidental creation of duplicate repository associations if there
     *         are failures and retries.
     *         </p>
     */
    public String getClientRequestToken() {
        return clientRequestToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request.
     * </p>
     * <p>
     * To add a new repository association, this parameter specifies a unique
     * identifier for the new repository association that helps ensure
     * idempotency.
     * </p>
     * <p>
     * If you use the AWS CLI or one of the AWS SDKs to call this operation, you
     * can leave this parameter empty. The CLI or SDK generates a random UUID
     * for you and includes that in the request. If you don't use the SDK and
     * instead generate a raw HTTP request to the Secrets Manager service
     * endpoint, you must generate a ClientRequestToken yourself for new
     * versions and include that value in the request.
     * </p>
     * <p>
     * You typically interact with this value if you implement your own retry
     * logic and want to ensure that a given repository association is not
     * created twice. We recommend that you generate a UUID-type value to ensure
     * uniqueness within the specified repository association.
     * </p>
     * <p>
     * Amazon CodeGuru Reviewer uses this value to prevent the accidental
     * creation of duplicate repository associations if there are failures and
     * retries.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[\w-]+$<br/>
     *
     * @param clientRequestToken <p>
     *            Unique, case-sensitive identifier that you provide to ensure
     *            the idempotency of the request.
     *            </p>
     *            <p>
     *            To add a new repository association, this parameter specifies
     *            a unique identifier for the new repository association that
     *            helps ensure idempotency.
     *            </p>
     *            <p>
     *            If you use the AWS CLI or one of the AWS SDKs to call this
     *            operation, you can leave this parameter empty. The CLI or SDK
     *            generates a random UUID for you and includes that in the
     *            request. If you don't use the SDK and instead generate a raw
     *            HTTP request to the Secrets Manager service endpoint, you must
     *            generate a ClientRequestToken yourself for new versions and
     *            include that value in the request.
     *            </p>
     *            <p>
     *            You typically interact with this value if you implement your
     *            own retry logic and want to ensure that a given repository
     *            association is not created twice. We recommend that you
     *            generate a UUID-type value to ensure uniqueness within the
     *            specified repository association.
     *            </p>
     *            <p>
     *            Amazon CodeGuru Reviewer uses this value to prevent the
     *            accidental creation of duplicate repository associations if
     *            there are failures and retries.
     *            </p>
     */
    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request.
     * </p>
     * <p>
     * To add a new repository association, this parameter specifies a unique
     * identifier for the new repository association that helps ensure
     * idempotency.
     * </p>
     * <p>
     * If you use the AWS CLI or one of the AWS SDKs to call this operation, you
     * can leave this parameter empty. The CLI or SDK generates a random UUID
     * for you and includes that in the request. If you don't use the SDK and
     * instead generate a raw HTTP request to the Secrets Manager service
     * endpoint, you must generate a ClientRequestToken yourself for new
     * versions and include that value in the request.
     * </p>
     * <p>
     * You typically interact with this value if you implement your own retry
     * logic and want to ensure that a given repository association is not
     * created twice. We recommend that you generate a UUID-type value to ensure
     * uniqueness within the specified repository association.
     * </p>
     * <p>
     * Amazon CodeGuru Reviewer uses this value to prevent the accidental
     * creation of duplicate repository associations if there are failures and
     * retries.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[\w-]+$<br/>
     *
     * @param clientRequestToken <p>
     *            Unique, case-sensitive identifier that you provide to ensure
     *            the idempotency of the request.
     *            </p>
     *            <p>
     *            To add a new repository association, this parameter specifies
     *            a unique identifier for the new repository association that
     *            helps ensure idempotency.
     *            </p>
     *            <p>
     *            If you use the AWS CLI or one of the AWS SDKs to call this
     *            operation, you can leave this parameter empty. The CLI or SDK
     *            generates a random UUID for you and includes that in the
     *            request. If you don't use the SDK and instead generate a raw
     *            HTTP request to the Secrets Manager service endpoint, you must
     *            generate a ClientRequestToken yourself for new versions and
     *            include that value in the request.
     *            </p>
     *            <p>
     *            You typically interact with this value if you implement your
     *            own retry logic and want to ensure that a given repository
     *            association is not created twice. We recommend that you
     *            generate a UUID-type value to ensure uniqueness within the
     *            specified repository association.
     *            </p>
     *            <p>
     *            Amazon CodeGuru Reviewer uses this value to prevent the
     *            accidental creation of duplicate repository associations if
     *            there are failures and retries.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssociateRepositoryRequest withClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
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
        if (getRepository() != null)
            sb.append("Repository: " + getRepository() + ",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: " + getClientRequestToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRepository() == null) ? 0 : getRepository().hashCode());
        hashCode = prime * hashCode
                + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateRepositoryRequest == false)
            return false;
        AssociateRepositoryRequest other = (AssociateRepositoryRequest) obj;

        if (other.getRepository() == null ^ this.getRepository() == null)
            return false;
        if (other.getRepository() != null
                && other.getRepository().equals(this.getRepository()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null
                && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        return true;
    }
}
