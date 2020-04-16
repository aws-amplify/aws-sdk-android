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

package com.amazonaws.services.awselementalmediaconvert.model;

import java.io.Serializable;

/**
 * Required when you set (Type) under (OutputGroups)>(OutputGroupSettings) to
 * FILE_GROUP_SETTINGS.
 */
public class FileGroupSettings implements Serializable {
    /**
     * Use Destination (Destination) to specify the S3 output location and the
     * output filename base. Destination accepts format identifiers. If you do
     * not specify the base filename in the URI, the service will use the
     * filename of the input file. If your job has multiple inputs, the service
     * uses the filename of the first input file.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^s3:\/\/<br/>
     */
    private String destination;

    /**
     * Settings associated with the destination. Will vary based on the type of
     * destination
     */
    private DestinationSettings destinationSettings;

    /**
     * Use Destination (Destination) to specify the S3 output location and the
     * output filename base. Destination accepts format identifiers. If you do
     * not specify the base filename in the URI, the service will use the
     * filename of the input file. If your job has multiple inputs, the service
     * uses the filename of the first input file.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^s3:\/\/<br/>
     *
     * @return Use Destination (Destination) to specify the S3 output location
     *         and the output filename base. Destination accepts format
     *         identifiers. If you do not specify the base filename in the URI,
     *         the service will use the filename of the input file. If your job
     *         has multiple inputs, the service uses the filename of the first
     *         input file.
     */
    public String getDestination() {
        return destination;
    }

    /**
     * Use Destination (Destination) to specify the S3 output location and the
     * output filename base. Destination accepts format identifiers. If you do
     * not specify the base filename in the URI, the service will use the
     * filename of the input file. If your job has multiple inputs, the service
     * uses the filename of the first input file.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^s3:\/\/<br/>
     *
     * @param destination Use Destination (Destination) to specify the S3 output
     *            location and the output filename base. Destination accepts
     *            format identifiers. If you do not specify the base filename in
     *            the URI, the service will use the filename of the input file.
     *            If your job has multiple inputs, the service uses the filename
     *            of the first input file.
     */
    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * Use Destination (Destination) to specify the S3 output location and the
     * output filename base. Destination accepts format identifiers. If you do
     * not specify the base filename in the URI, the service will use the
     * filename of the input file. If your job has multiple inputs, the service
     * uses the filename of the first input file.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^s3:\/\/<br/>
     *
     * @param destination Use Destination (Destination) to specify the S3 output
     *            location and the output filename base. Destination accepts
     *            format identifiers. If you do not specify the base filename in
     *            the URI, the service will use the filename of the input file.
     *            If your job has multiple inputs, the service uses the filename
     *            of the first input file.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FileGroupSettings withDestination(String destination) {
        this.destination = destination;
        return this;
    }

    /**
     * Settings associated with the destination. Will vary based on the type of
     * destination
     *
     * @return Settings associated with the destination. Will vary based on the
     *         type of destination
     */
    public DestinationSettings getDestinationSettings() {
        return destinationSettings;
    }

    /**
     * Settings associated with the destination. Will vary based on the type of
     * destination
     *
     * @param destinationSettings Settings associated with the destination. Will
     *            vary based on the type of destination
     */
    public void setDestinationSettings(DestinationSettings destinationSettings) {
        this.destinationSettings = destinationSettings;
    }

    /**
     * Settings associated with the destination. Will vary based on the type of
     * destination
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param destinationSettings Settings associated with the destination. Will
     *            vary based on the type of destination
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FileGroupSettings withDestinationSettings(DestinationSettings destinationSettings) {
        this.destinationSettings = destinationSettings;
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
        if (getDestination() != null)
            sb.append("Destination: " + getDestination() + ",");
        if (getDestinationSettings() != null)
            sb.append("DestinationSettings: " + getDestinationSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDestination() == null) ? 0 : getDestination().hashCode());
        hashCode = prime * hashCode
                + ((getDestinationSettings() == null) ? 0 : getDestinationSettings().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FileGroupSettings == false)
            return false;
        FileGroupSettings other = (FileGroupSettings) obj;

        if (other.getDestination() == null ^ this.getDestination() == null)
            return false;
        if (other.getDestination() != null
                && other.getDestination().equals(this.getDestination()) == false)
            return false;
        if (other.getDestinationSettings() == null ^ this.getDestinationSettings() == null)
            return false;
        if (other.getDestinationSettings() != null
                && other.getDestinationSettings().equals(this.getDestinationSettings()) == false)
            return false;
        return true;
    }
}
