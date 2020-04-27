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

package com.amazonaws.services.amazonsagemakerservice.model;

import java.io.Serializable;

/**
 * <p>
 * Configuration to run a processing job in a specified container image.
 * </p>
 */
public class AppSpecification implements Serializable {
    /**
     * <p>
     * The container image to be run by the processing job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     * <b>Pattern: </b>.*<br/>
     */
    private String imageUri;

    /**
     * <p>
     * The entrypoint for a container used to run a processing job.
     * </p>
     */
    private java.util.List<String> containerEntrypoint;

    /**
     * <p>
     * The arguments for a container used to run a processing job.
     * </p>
     */
    private java.util.List<String> containerArguments;

    /**
     * <p>
     * The container image to be run by the processing job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @return <p>
     *         The container image to be run by the processing job.
     *         </p>
     */
    public String getImageUri() {
        return imageUri;
    }

    /**
     * <p>
     * The container image to be run by the processing job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param imageUri <p>
     *            The container image to be run by the processing job.
     *            </p>
     */
    public void setImageUri(String imageUri) {
        this.imageUri = imageUri;
    }

    /**
     * <p>
     * The container image to be run by the processing job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param imageUri <p>
     *            The container image to be run by the processing job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AppSpecification withImageUri(String imageUri) {
        this.imageUri = imageUri;
        return this;
    }

    /**
     * <p>
     * The entrypoint for a container used to run a processing job.
     * </p>
     *
     * @return <p>
     *         The entrypoint for a container used to run a processing job.
     *         </p>
     */
    public java.util.List<String> getContainerEntrypoint() {
        return containerEntrypoint;
    }

    /**
     * <p>
     * The entrypoint for a container used to run a processing job.
     * </p>
     *
     * @param containerEntrypoint <p>
     *            The entrypoint for a container used to run a processing job.
     *            </p>
     */
    public void setContainerEntrypoint(java.util.Collection<String> containerEntrypoint) {
        if (containerEntrypoint == null) {
            this.containerEntrypoint = null;
            return;
        }

        this.containerEntrypoint = new java.util.ArrayList<String>(containerEntrypoint);
    }

    /**
     * <p>
     * The entrypoint for a container used to run a processing job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param containerEntrypoint <p>
     *            The entrypoint for a container used to run a processing job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AppSpecification withContainerEntrypoint(String... containerEntrypoint) {
        if (getContainerEntrypoint() == null) {
            this.containerEntrypoint = new java.util.ArrayList<String>(containerEntrypoint.length);
        }
        for (String value : containerEntrypoint) {
            this.containerEntrypoint.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The entrypoint for a container used to run a processing job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param containerEntrypoint <p>
     *            The entrypoint for a container used to run a processing job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AppSpecification withContainerEntrypoint(java.util.Collection<String> containerEntrypoint) {
        setContainerEntrypoint(containerEntrypoint);
        return this;
    }

    /**
     * <p>
     * The arguments for a container used to run a processing job.
     * </p>
     *
     * @return <p>
     *         The arguments for a container used to run a processing job.
     *         </p>
     */
    public java.util.List<String> getContainerArguments() {
        return containerArguments;
    }

    /**
     * <p>
     * The arguments for a container used to run a processing job.
     * </p>
     *
     * @param containerArguments <p>
     *            The arguments for a container used to run a processing job.
     *            </p>
     */
    public void setContainerArguments(java.util.Collection<String> containerArguments) {
        if (containerArguments == null) {
            this.containerArguments = null;
            return;
        }

        this.containerArguments = new java.util.ArrayList<String>(containerArguments);
    }

    /**
     * <p>
     * The arguments for a container used to run a processing job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param containerArguments <p>
     *            The arguments for a container used to run a processing job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AppSpecification withContainerArguments(String... containerArguments) {
        if (getContainerArguments() == null) {
            this.containerArguments = new java.util.ArrayList<String>(containerArguments.length);
        }
        for (String value : containerArguments) {
            this.containerArguments.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The arguments for a container used to run a processing job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param containerArguments <p>
     *            The arguments for a container used to run a processing job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AppSpecification withContainerArguments(java.util.Collection<String> containerArguments) {
        setContainerArguments(containerArguments);
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
        if (getImageUri() != null)
            sb.append("ImageUri: " + getImageUri() + ",");
        if (getContainerEntrypoint() != null)
            sb.append("ContainerEntrypoint: " + getContainerEntrypoint() + ",");
        if (getContainerArguments() != null)
            sb.append("ContainerArguments: " + getContainerArguments());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getImageUri() == null) ? 0 : getImageUri().hashCode());
        hashCode = prime * hashCode
                + ((getContainerEntrypoint() == null) ? 0 : getContainerEntrypoint().hashCode());
        hashCode = prime * hashCode
                + ((getContainerArguments() == null) ? 0 : getContainerArguments().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AppSpecification == false)
            return false;
        AppSpecification other = (AppSpecification) obj;

        if (other.getImageUri() == null ^ this.getImageUri() == null)
            return false;
        if (other.getImageUri() != null && other.getImageUri().equals(this.getImageUri()) == false)
            return false;
        if (other.getContainerEntrypoint() == null ^ this.getContainerEntrypoint() == null)
            return false;
        if (other.getContainerEntrypoint() != null
                && other.getContainerEntrypoint().equals(this.getContainerEntrypoint()) == false)
            return false;
        if (other.getContainerArguments() == null ^ this.getContainerArguments() == null)
            return false;
        if (other.getContainerArguments() != null
                && other.getContainerArguments().equals(this.getContainerArguments()) == false)
            return false;
        return true;
    }
}
