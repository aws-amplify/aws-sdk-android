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

package com.amazonaws.services.iam.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns information about the service-specific credentials associated with
 * the specified IAM user. If none exists, the operation returns an empty list.
 * The service-specific credentials returned by this operation are used only for
 * authenticating the IAM user to a specific service. For more information about
 * using service-specific credentials to authenticate to an AWS service, see <a
 * href=
 * "https://docs.aws.amazon.com/codecommit/latest/userguide/setting-up-gc.html"
 * >Set Up service-specific credentials</a> in the AWS CodeCommit User Guide.
 * </p>
 */
public class ListServiceSpecificCredentialsRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the user whose service-specific credentials you want
     * information about. If this value is not specified, then the operation
     * assumes the user whose credentials are used to call the operation.
     * </p>
     * <p>
     * This parameter allows (through its <a
     * href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of upper and lowercase alphanumeric characters with
     * no spaces. You can also include any of the following characters: _+=,.@-
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     */
    private String userName;

    /**
     * <p>
     * Filters the returned results to only those for the specified AWS service.
     * If not specified, then AWS returns service-specific credentials for all
     * services.
     * </p>
     */
    private String serviceName;

    /**
     * <p>
     * The name of the user whose service-specific credentials you want
     * information about. If this value is not specified, then the operation
     * assumes the user whose credentials are used to call the operation.
     * </p>
     * <p>
     * This parameter allows (through its <a
     * href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of upper and lowercase alphanumeric characters with
     * no spaces. You can also include any of the following characters: _+=,.@-
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @return <p>
     *         The name of the user whose service-specific credentials you want
     *         information about. If this value is not specified, then the
     *         operation assumes the user whose credentials are used to call the
     *         operation.
     *         </p>
     *         <p>
     *         This parameter allows (through its <a
     *         href="http://wikipedia.org/wiki/regex">regex pattern</a>) a
     *         string of characters consisting of upper and lowercase
     *         alphanumeric characters with no spaces. You can also include any
     *         of the following characters: _+=,.@-
     *         </p>
     */
    public String getUserName() {
        return userName;
    }

    /**
     * <p>
     * The name of the user whose service-specific credentials you want
     * information about. If this value is not specified, then the operation
     * assumes the user whose credentials are used to call the operation.
     * </p>
     * <p>
     * This parameter allows (through its <a
     * href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of upper and lowercase alphanumeric characters with
     * no spaces. You can also include any of the following characters: _+=,.@-
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @param userName <p>
     *            The name of the user whose service-specific credentials you
     *            want information about. If this value is not specified, then
     *            the operation assumes the user whose credentials are used to
     *            call the operation.
     *            </p>
     *            <p>
     *            This parameter allows (through its <a
     *            href="http://wikipedia.org/wiki/regex">regex pattern</a>) a
     *            string of characters consisting of upper and lowercase
     *            alphanumeric characters with no spaces. You can also include
     *            any of the following characters: _+=,.@-
     *            </p>
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * <p>
     * The name of the user whose service-specific credentials you want
     * information about. If this value is not specified, then the operation
     * assumes the user whose credentials are used to call the operation.
     * </p>
     * <p>
     * This parameter allows (through its <a
     * href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of upper and lowercase alphanumeric characters with
     * no spaces. You can also include any of the following characters: _+=,.@-
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @param userName <p>
     *            The name of the user whose service-specific credentials you
     *            want information about. If this value is not specified, then
     *            the operation assumes the user whose credentials are used to
     *            call the operation.
     *            </p>
     *            <p>
     *            This parameter allows (through its <a
     *            href="http://wikipedia.org/wiki/regex">regex pattern</a>) a
     *            string of characters consisting of upper and lowercase
     *            alphanumeric characters with no spaces. You can also include
     *            any of the following characters: _+=,.@-
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListServiceSpecificCredentialsRequest withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * <p>
     * Filters the returned results to only those for the specified AWS service.
     * If not specified, then AWS returns service-specific credentials for all
     * services.
     * </p>
     *
     * @return <p>
     *         Filters the returned results to only those for the specified AWS
     *         service. If not specified, then AWS returns service-specific
     *         credentials for all services.
     *         </p>
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * <p>
     * Filters the returned results to only those for the specified AWS service.
     * If not specified, then AWS returns service-specific credentials for all
     * services.
     * </p>
     *
     * @param serviceName <p>
     *            Filters the returned results to only those for the specified
     *            AWS service. If not specified, then AWS returns
     *            service-specific credentials for all services.
     *            </p>
     */
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * <p>
     * Filters the returned results to only those for the specified AWS service.
     * If not specified, then AWS returns service-specific credentials for all
     * services.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serviceName <p>
     *            Filters the returned results to only those for the specified
     *            AWS service. If not specified, then AWS returns
     *            service-specific credentials for all services.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListServiceSpecificCredentialsRequest withServiceName(String serviceName) {
        this.serviceName = serviceName;
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
        if (getUserName() != null)
            sb.append("UserName: " + getUserName() + ",");
        if (getServiceName() != null)
            sb.append("ServiceName: " + getServiceName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserName() == null) ? 0 : getUserName().hashCode());
        hashCode = prime * hashCode
                + ((getServiceName() == null) ? 0 : getServiceName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListServiceSpecificCredentialsRequest == false)
            return false;
        ListServiceSpecificCredentialsRequest other = (ListServiceSpecificCredentialsRequest) obj;

        if (other.getUserName() == null ^ this.getUserName() == null)
            return false;
        if (other.getUserName() != null && other.getUserName().equals(this.getUserName()) == false)
            return false;
        if (other.getServiceName() == null ^ this.getServiceName() == null)
            return false;
        if (other.getServiceName() != null
                && other.getServiceName().equals(this.getServiceName()) == false)
            return false;
        return true;
    }
}
