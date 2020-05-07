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

package com.amazonaws.services.codebuild.model;

import java.io.Serializable;

public class ListSourceCredentialsResult implements Serializable {
    /**
     * <p>
     * A list of <code>SourceCredentialsInfo</code> objects. Each
     * <code>SourceCredentialsInfo</code> object includes the authentication
     * type, token ARN, and type of source provider for one set of credentials.
     * </p>
     */
    private java.util.List<SourceCredentialsInfo> sourceCredentialsInfos;

    /**
     * <p>
     * A list of <code>SourceCredentialsInfo</code> objects. Each
     * <code>SourceCredentialsInfo</code> object includes the authentication
     * type, token ARN, and type of source provider for one set of credentials.
     * </p>
     *
     * @return <p>
     *         A list of <code>SourceCredentialsInfo</code> objects. Each
     *         <code>SourceCredentialsInfo</code> object includes the
     *         authentication type, token ARN, and type of source provider for
     *         one set of credentials.
     *         </p>
     */
    public java.util.List<SourceCredentialsInfo> getSourceCredentialsInfos() {
        return sourceCredentialsInfos;
    }

    /**
     * <p>
     * A list of <code>SourceCredentialsInfo</code> objects. Each
     * <code>SourceCredentialsInfo</code> object includes the authentication
     * type, token ARN, and type of source provider for one set of credentials.
     * </p>
     *
     * @param sourceCredentialsInfos <p>
     *            A list of <code>SourceCredentialsInfo</code> objects. Each
     *            <code>SourceCredentialsInfo</code> object includes the
     *            authentication type, token ARN, and type of source provider
     *            for one set of credentials.
     *            </p>
     */
    public void setSourceCredentialsInfos(
            java.util.Collection<SourceCredentialsInfo> sourceCredentialsInfos) {
        if (sourceCredentialsInfos == null) {
            this.sourceCredentialsInfos = null;
            return;
        }

        this.sourceCredentialsInfos = new java.util.ArrayList<SourceCredentialsInfo>(
                sourceCredentialsInfos);
    }

    /**
     * <p>
     * A list of <code>SourceCredentialsInfo</code> objects. Each
     * <code>SourceCredentialsInfo</code> object includes the authentication
     * type, token ARN, and type of source provider for one set of credentials.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceCredentialsInfos <p>
     *            A list of <code>SourceCredentialsInfo</code> objects. Each
     *            <code>SourceCredentialsInfo</code> object includes the
     *            authentication type, token ARN, and type of source provider
     *            for one set of credentials.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListSourceCredentialsResult withSourceCredentialsInfos(
            SourceCredentialsInfo... sourceCredentialsInfos) {
        if (getSourceCredentialsInfos() == null) {
            this.sourceCredentialsInfos = new java.util.ArrayList<SourceCredentialsInfo>(
                    sourceCredentialsInfos.length);
        }
        for (SourceCredentialsInfo value : sourceCredentialsInfos) {
            this.sourceCredentialsInfos.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>SourceCredentialsInfo</code> objects. Each
     * <code>SourceCredentialsInfo</code> object includes the authentication
     * type, token ARN, and type of source provider for one set of credentials.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceCredentialsInfos <p>
     *            A list of <code>SourceCredentialsInfo</code> objects. Each
     *            <code>SourceCredentialsInfo</code> object includes the
     *            authentication type, token ARN, and type of source provider
     *            for one set of credentials.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListSourceCredentialsResult withSourceCredentialsInfos(
            java.util.Collection<SourceCredentialsInfo> sourceCredentialsInfos) {
        setSourceCredentialsInfos(sourceCredentialsInfos);
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
        if (getSourceCredentialsInfos() != null)
            sb.append("sourceCredentialsInfos: " + getSourceCredentialsInfos());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getSourceCredentialsInfos() == null) ? 0 : getSourceCredentialsInfos()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListSourceCredentialsResult == false)
            return false;
        ListSourceCredentialsResult other = (ListSourceCredentialsResult) obj;

        if (other.getSourceCredentialsInfos() == null ^ this.getSourceCredentialsInfos() == null)
            return false;
        if (other.getSourceCredentialsInfos() != null
                && other.getSourceCredentialsInfos().equals(this.getSourceCredentialsInfos()) == false)
            return false;
        return true;
    }
}
