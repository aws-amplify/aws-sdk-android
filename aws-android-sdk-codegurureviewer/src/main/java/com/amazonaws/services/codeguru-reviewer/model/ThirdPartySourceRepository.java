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
package com.amazonaws.services.codeguru-reviewer.model;

import java.io.Serializable;


/**
 * <p> Information about a third party source repository connected through CodeStar Connections. </p>
 */
public class ThirdPartySourceRepository implements Serializable {
    /**
     * <p> The name of the third party source repository. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^\S[\w.-]*$<br/>
     */
    private String name;

    /**
     * <p> The Amazon Resource Name (ARN) identifying the repository connection. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>arn:aws(-[\w]+)*:.+:.+:[0-9]{12}:.+<br/>
     */
    private String connectionArn;

    /**
     * <p> The username of the owner of the repository. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^\S(.*\S)?$<br/>
     */
    private String owner;

    /**
     * <p> The name of the third party source repository. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^\S[\w.-]*$<br/>
     *
     * @return <p> The name of the third party source repository. </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p> The name of the third party source repository. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^\S[\w.-]*$<br/>
     *
     * @param name <p> The name of the third party source repository. </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p> The name of the third party source repository. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^\S[\w.-]*$<br/>
     *
     * @param name <p> The name of the third party source repository. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ThirdPartySourceRepository withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p> The Amazon Resource Name (ARN) identifying the repository connection. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>arn:aws(-[\w]+)*:.+:.+:[0-9]{12}:.+<br/>
     *
     * @return <p> The Amazon Resource Name (ARN) identifying the repository connection. </p>
     */
    public String getConnectionArn() {
        return connectionArn;
    }

    /**
     * <p> The Amazon Resource Name (ARN) identifying the repository connection. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>arn:aws(-[\w]+)*:.+:.+:[0-9]{12}:.+<br/>
     *
     * @param connectionArn <p> The Amazon Resource Name (ARN) identifying the repository connection. </p>
     */
    public void setConnectionArn(String connectionArn) {
        this.connectionArn = connectionArn;
    }

    /**
     * <p> The Amazon Resource Name (ARN) identifying the repository connection. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>arn:aws(-[\w]+)*:.+:.+:[0-9]{12}:.+<br/>
     *
     * @param connectionArn <p> The Amazon Resource Name (ARN) identifying the repository connection. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ThirdPartySourceRepository withConnectionArn(String connectionArn) {
        this.connectionArn = connectionArn;
        return this;
    }

    /**
     * <p> The username of the owner of the repository. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^\S(.*\S)?$<br/>
     *
     * @return <p> The username of the owner of the repository. </p>
     */
    public String getOwner() {
        return owner;
    }

    /**
     * <p> The username of the owner of the repository. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^\S(.*\S)?$<br/>
     *
     * @param owner <p> The username of the owner of the repository. </p>
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * <p> The username of the owner of the repository. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^\S(.*\S)?$<br/>
     *
     * @param owner <p> The username of the owner of the repository. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ThirdPartySourceRepository withOwner(String owner) {
        this.owner = owner;
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
        if (getConnectionArn() != null) sb.append("ConnectionArn: " + getConnectionArn() + ",");
        if (getOwner() != null) sb.append("Owner: " + getOwner());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getConnectionArn() == null) ? 0 : getConnectionArn().hashCode());
        hashCode = prime * hashCode + ((getOwner() == null) ? 0 : getOwner().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ThirdPartySourceRepository == false) return false;
        ThirdPartySourceRepository other = (ThirdPartySourceRepository)obj;

        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false;
        if (other.getConnectionArn() == null ^ this.getConnectionArn() == null) return false;
        if (other.getConnectionArn() != null && other.getConnectionArn().equals(this.getConnectionArn()) == false) return false;
        if (other.getOwner() == null ^ this.getOwner() == null) return false;
        if (other.getOwner() != null && other.getOwner().equals(this.getOwner()) == false) return false;
        return true;
    }
}
