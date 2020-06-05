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

package com.amazonaws.services.personalize.model;

import java.io.Serializable;

/**
 * <p>
 * Describes an algorithm image.
 * </p>
 */
public class AlgorithmImage implements Serializable {
    /**
     * <p>
     * The name of the algorithm image.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9][a-zA-Z0-9\-_]*<br/>
     */
    private String name;

    /**
     * <p>
     * The URI of the Docker container for the algorithm image.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     */
    private String dockerURI;

    /**
     * <p>
     * The name of the algorithm image.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9][a-zA-Z0-9\-_]*<br/>
     *
     * @return <p>
     *         The name of the algorithm image.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the algorithm image.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9][a-zA-Z0-9\-_]*<br/>
     *
     * @param name <p>
     *            The name of the algorithm image.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the algorithm image.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9][a-zA-Z0-9\-_]*<br/>
     *
     * @param name <p>
     *            The name of the algorithm image.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AlgorithmImage withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The URI of the Docker container for the algorithm image.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @return <p>
     *         The URI of the Docker container for the algorithm image.
     *         </p>
     */
    public String getDockerURI() {
        return dockerURI;
    }

    /**
     * <p>
     * The URI of the Docker container for the algorithm image.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param dockerURI <p>
     *            The URI of the Docker container for the algorithm image.
     *            </p>
     */
    public void setDockerURI(String dockerURI) {
        this.dockerURI = dockerURI;
    }

    /**
     * <p>
     * The URI of the Docker container for the algorithm image.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param dockerURI <p>
     *            The URI of the Docker container for the algorithm image.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AlgorithmImage withDockerURI(String dockerURI) {
        this.dockerURI = dockerURI;
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
        if (getName() != null)
            sb.append("name: " + getName() + ",");
        if (getDockerURI() != null)
            sb.append("dockerURI: " + getDockerURI());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDockerURI() == null) ? 0 : getDockerURI().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AlgorithmImage == false)
            return false;
        AlgorithmImage other = (AlgorithmImage) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDockerURI() == null ^ this.getDockerURI() == null)
            return false;
        if (other.getDockerURI() != null
                && other.getDockerURI().equals(this.getDockerURI()) == false)
            return false;
        return true;
    }
}
