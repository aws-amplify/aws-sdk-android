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

package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Gets information about one or more applications. The maximum number of
 * applications that can be returned is 100.
 * </p>
 */
public class BatchGetApplicationsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A list of application names separated by spaces. The maximum number of
     * application names you can specify is 100.
     * </p>
     */
    private java.util.List<String> applicationNames;

    /**
     * <p>
     * A list of application names separated by spaces. The maximum number of
     * application names you can specify is 100.
     * </p>
     *
     * @return <p>
     *         A list of application names separated by spaces. The maximum
     *         number of application names you can specify is 100.
     *         </p>
     */
    public java.util.List<String> getApplicationNames() {
        return applicationNames;
    }

    /**
     * <p>
     * A list of application names separated by spaces. The maximum number of
     * application names you can specify is 100.
     * </p>
     *
     * @param applicationNames <p>
     *            A list of application names separated by spaces. The maximum
     *            number of application names you can specify is 100.
     *            </p>
     */
    public void setApplicationNames(java.util.Collection<String> applicationNames) {
        if (applicationNames == null) {
            this.applicationNames = null;
            return;
        }

        this.applicationNames = new java.util.ArrayList<String>(applicationNames);
    }

    /**
     * <p>
     * A list of application names separated by spaces. The maximum number of
     * application names you can specify is 100.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param applicationNames <p>
     *            A list of application names separated by spaces. The maximum
     *            number of application names you can specify is 100.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetApplicationsRequest withApplicationNames(String... applicationNames) {
        if (getApplicationNames() == null) {
            this.applicationNames = new java.util.ArrayList<String>(applicationNames.length);
        }
        for (String value : applicationNames) {
            this.applicationNames.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of application names separated by spaces. The maximum number of
     * application names you can specify is 100.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param applicationNames <p>
     *            A list of application names separated by spaces. The maximum
     *            number of application names you can specify is 100.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetApplicationsRequest withApplicationNames(
            java.util.Collection<String> applicationNames) {
        setApplicationNames(applicationNames);
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
        if (getApplicationNames() != null)
            sb.append("applicationNames: " + getApplicationNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getApplicationNames() == null) ? 0 : getApplicationNames().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetApplicationsRequest == false)
            return false;
        BatchGetApplicationsRequest other = (BatchGetApplicationsRequest) obj;

        if (other.getApplicationNames() == null ^ this.getApplicationNames() == null)
            return false;
        if (other.getApplicationNames() != null
                && other.getApplicationNames().equals(this.getApplicationNames()) == false)
            return false;
        return true;
    }
}
