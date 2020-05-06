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
package com.amazonaws.services.codestar-connections.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>Returns the connection ARN and details such as status, owner, and provider type.</p>
 */
public class GetConnectionRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>The Amazon Resource Name (ARN) of a connection.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>arn:aws(-[\w]+)*:.+:.+:[0-9]{12}:.+<br/>
     */
    private String connectionArn;

    /**
     * <p>The Amazon Resource Name (ARN) of a connection.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>arn:aws(-[\w]+)*:.+:.+:[0-9]{12}:.+<br/>
     *
     * @return <p>The Amazon Resource Name (ARN) of a connection.</p>
     */
    public String getConnectionArn() {
        return connectionArn;
    }

    /**
     * <p>The Amazon Resource Name (ARN) of a connection.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>arn:aws(-[\w]+)*:.+:.+:[0-9]{12}:.+<br/>
     *
     * @param connectionArn <p>The Amazon Resource Name (ARN) of a connection.</p>
     */
    public void setConnectionArn(String connectionArn) {
        this.connectionArn = connectionArn;
    }

    /**
     * <p>The Amazon Resource Name (ARN) of a connection.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>arn:aws(-[\w]+)*:.+:.+:[0-9]{12}:.+<br/>
     *
     * @param connectionArn <p>The Amazon Resource Name (ARN) of a connection.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetConnectionRequest withConnectionArn(String connectionArn) {
        this.connectionArn = connectionArn;
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
        if (getConnectionArn() != null) sb.append("ConnectionArn: " + getConnectionArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConnectionArn() == null) ? 0 : getConnectionArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetConnectionRequest == false) return false;
        GetConnectionRequest other = (GetConnectionRequest)obj;

        if (other.getConnectionArn() == null ^ this.getConnectionArn() == null) return false;
        if (other.getConnectionArn() != null && other.getConnectionArn().equals(this.getConnectionArn()) == false) return false;
        return true;
    }
}
