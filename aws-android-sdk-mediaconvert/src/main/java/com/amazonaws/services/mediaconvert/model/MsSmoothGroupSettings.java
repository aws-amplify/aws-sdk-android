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

package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;

/**
 * Required when you set (Type) under (OutputGroups)>(OutputGroupSettings) to
 * MS_SMOOTH_GROUP_SETTINGS.
 */
public class MsSmoothGroupSettings implements Serializable {
    /**
     * By default, the service creates one .ism Microsoft Smooth Streaming
     * manifest for each Microsoft Smooth Streaming output group in your job.
     * This default manifest references every output in the output group. To
     * create additional manifests that reference a subset of the outputs in the
     * output group, specify a list of them here.
     */
    private java.util.List<MsSmoothAdditionalManifest> additionalManifests;

    /**
     * COMBINE_DUPLICATE_STREAMS combines identical audio encoding settings
     * across a Microsoft Smooth output group into a single audio stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMBINE_DUPLICATE_STREAMS, NONE
     */
    private String audioDeduplication;

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
     * If you are using DRM, set DRM System (MsSmoothEncryptionSettings) to
     * specify the value SpekeKeyProvider.
     */
    private MsSmoothEncryptionSettings encryption;

    /**
     * Use Fragment length (FragmentLength) to specify the mp4 fragment sizes in
     * seconds. Fragment length must be compatible with GOP size and frame rate.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 2147483647<br/>
     */
    private Integer fragmentLength;

    /**
     * Use Manifest encoding (MsSmoothManifestEncoding) to specify the encoding
     * format for the server and client manifest. Valid options are utf8 and
     * utf16.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UTF8, UTF16
     */
    private String manifestEncoding;

    /**
     * By default, the service creates one .ism Microsoft Smooth Streaming
     * manifest for each Microsoft Smooth Streaming output group in your job.
     * This default manifest references every output in the output group. To
     * create additional manifests that reference a subset of the outputs in the
     * output group, specify a list of them here.
     *
     * @return By default, the service creates one .ism Microsoft Smooth
     *         Streaming manifest for each Microsoft Smooth Streaming output
     *         group in your job. This default manifest references every output
     *         in the output group. To create additional manifests that
     *         reference a subset of the outputs in the output group, specify a
     *         list of them here.
     */
    public java.util.List<MsSmoothAdditionalManifest> getAdditionalManifests() {
        return additionalManifests;
    }

    /**
     * By default, the service creates one .ism Microsoft Smooth Streaming
     * manifest for each Microsoft Smooth Streaming output group in your job.
     * This default manifest references every output in the output group. To
     * create additional manifests that reference a subset of the outputs in the
     * output group, specify a list of them here.
     *
     * @param additionalManifests By default, the service creates one .ism
     *            Microsoft Smooth Streaming manifest for each Microsoft Smooth
     *            Streaming output group in your job. This default manifest
     *            references every output in the output group. To create
     *            additional manifests that reference a subset of the outputs in
     *            the output group, specify a list of them here.
     */
    public void setAdditionalManifests(
            java.util.Collection<MsSmoothAdditionalManifest> additionalManifests) {
        if (additionalManifests == null) {
            this.additionalManifests = null;
            return;
        }

        this.additionalManifests = new java.util.ArrayList<MsSmoothAdditionalManifest>(
                additionalManifests);
    }

    /**
     * By default, the service creates one .ism Microsoft Smooth Streaming
     * manifest for each Microsoft Smooth Streaming output group in your job.
     * This default manifest references every output in the output group. To
     * create additional manifests that reference a subset of the outputs in the
     * output group, specify a list of them here.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param additionalManifests By default, the service creates one .ism
     *            Microsoft Smooth Streaming manifest for each Microsoft Smooth
     *            Streaming output group in your job. This default manifest
     *            references every output in the output group. To create
     *            additional manifests that reference a subset of the outputs in
     *            the output group, specify a list of them here.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MsSmoothGroupSettings withAdditionalManifests(
            MsSmoothAdditionalManifest... additionalManifests) {
        if (getAdditionalManifests() == null) {
            this.additionalManifests = new java.util.ArrayList<MsSmoothAdditionalManifest>(
                    additionalManifests.length);
        }
        for (MsSmoothAdditionalManifest value : additionalManifests) {
            this.additionalManifests.add(value);
        }
        return this;
    }

    /**
     * By default, the service creates one .ism Microsoft Smooth Streaming
     * manifest for each Microsoft Smooth Streaming output group in your job.
     * This default manifest references every output in the output group. To
     * create additional manifests that reference a subset of the outputs in the
     * output group, specify a list of them here.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param additionalManifests By default, the service creates one .ism
     *            Microsoft Smooth Streaming manifest for each Microsoft Smooth
     *            Streaming output group in your job. This default manifest
     *            references every output in the output group. To create
     *            additional manifests that reference a subset of the outputs in
     *            the output group, specify a list of them here.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MsSmoothGroupSettings withAdditionalManifests(
            java.util.Collection<MsSmoothAdditionalManifest> additionalManifests) {
        setAdditionalManifests(additionalManifests);
        return this;
    }

    /**
     * COMBINE_DUPLICATE_STREAMS combines identical audio encoding settings
     * across a Microsoft Smooth output group into a single audio stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMBINE_DUPLICATE_STREAMS, NONE
     *
     * @return COMBINE_DUPLICATE_STREAMS combines identical audio encoding
     *         settings across a Microsoft Smooth output group into a single
     *         audio stream.
     * @see MsSmoothAudioDeduplication
     */
    public String getAudioDeduplication() {
        return audioDeduplication;
    }

    /**
     * COMBINE_DUPLICATE_STREAMS combines identical audio encoding settings
     * across a Microsoft Smooth output group into a single audio stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMBINE_DUPLICATE_STREAMS, NONE
     *
     * @param audioDeduplication COMBINE_DUPLICATE_STREAMS combines identical
     *            audio encoding settings across a Microsoft Smooth output group
     *            into a single audio stream.
     * @see MsSmoothAudioDeduplication
     */
    public void setAudioDeduplication(String audioDeduplication) {
        this.audioDeduplication = audioDeduplication;
    }

    /**
     * COMBINE_DUPLICATE_STREAMS combines identical audio encoding settings
     * across a Microsoft Smooth output group into a single audio stream.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMBINE_DUPLICATE_STREAMS, NONE
     *
     * @param audioDeduplication COMBINE_DUPLICATE_STREAMS combines identical
     *            audio encoding settings across a Microsoft Smooth output group
     *            into a single audio stream.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MsSmoothAudioDeduplication
     */
    public MsSmoothGroupSettings withAudioDeduplication(String audioDeduplication) {
        this.audioDeduplication = audioDeduplication;
        return this;
    }

    /**
     * COMBINE_DUPLICATE_STREAMS combines identical audio encoding settings
     * across a Microsoft Smooth output group into a single audio stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMBINE_DUPLICATE_STREAMS, NONE
     *
     * @param audioDeduplication COMBINE_DUPLICATE_STREAMS combines identical
     *            audio encoding settings across a Microsoft Smooth output group
     *            into a single audio stream.
     * @see MsSmoothAudioDeduplication
     */
    public void setAudioDeduplication(MsSmoothAudioDeduplication audioDeduplication) {
        this.audioDeduplication = audioDeduplication.toString();
    }

    /**
     * COMBINE_DUPLICATE_STREAMS combines identical audio encoding settings
     * across a Microsoft Smooth output group into a single audio stream.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMBINE_DUPLICATE_STREAMS, NONE
     *
     * @param audioDeduplication COMBINE_DUPLICATE_STREAMS combines identical
     *            audio encoding settings across a Microsoft Smooth output group
     *            into a single audio stream.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MsSmoothAudioDeduplication
     */
    public MsSmoothGroupSettings withAudioDeduplication(
            MsSmoothAudioDeduplication audioDeduplication) {
        this.audioDeduplication = audioDeduplication.toString();
        return this;
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
    public MsSmoothGroupSettings withDestination(String destination) {
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
    public MsSmoothGroupSettings withDestinationSettings(DestinationSettings destinationSettings) {
        this.destinationSettings = destinationSettings;
        return this;
    }

    /**
     * If you are using DRM, set DRM System (MsSmoothEncryptionSettings) to
     * specify the value SpekeKeyProvider.
     *
     * @return If you are using DRM, set DRM System (MsSmoothEncryptionSettings)
     *         to specify the value SpekeKeyProvider.
     */
    public MsSmoothEncryptionSettings getEncryption() {
        return encryption;
    }

    /**
     * If you are using DRM, set DRM System (MsSmoothEncryptionSettings) to
     * specify the value SpekeKeyProvider.
     *
     * @param encryption If you are using DRM, set DRM System
     *            (MsSmoothEncryptionSettings) to specify the value
     *            SpekeKeyProvider.
     */
    public void setEncryption(MsSmoothEncryptionSettings encryption) {
        this.encryption = encryption;
    }

    /**
     * If you are using DRM, set DRM System (MsSmoothEncryptionSettings) to
     * specify the value SpekeKeyProvider.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param encryption If you are using DRM, set DRM System
     *            (MsSmoothEncryptionSettings) to specify the value
     *            SpekeKeyProvider.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MsSmoothGroupSettings withEncryption(MsSmoothEncryptionSettings encryption) {
        this.encryption = encryption;
        return this;
    }

    /**
     * Use Fragment length (FragmentLength) to specify the mp4 fragment sizes in
     * seconds. Fragment length must be compatible with GOP size and frame rate.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 2147483647<br/>
     *
     * @return Use Fragment length (FragmentLength) to specify the mp4 fragment
     *         sizes in seconds. Fragment length must be compatible with GOP
     *         size and frame rate.
     */
    public Integer getFragmentLength() {
        return fragmentLength;
    }

    /**
     * Use Fragment length (FragmentLength) to specify the mp4 fragment sizes in
     * seconds. Fragment length must be compatible with GOP size and frame rate.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 2147483647<br/>
     *
     * @param fragmentLength Use Fragment length (FragmentLength) to specify the
     *            mp4 fragment sizes in seconds. Fragment length must be
     *            compatible with GOP size and frame rate.
     */
    public void setFragmentLength(Integer fragmentLength) {
        this.fragmentLength = fragmentLength;
    }

    /**
     * Use Fragment length (FragmentLength) to specify the mp4 fragment sizes in
     * seconds. Fragment length must be compatible with GOP size and frame rate.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 2147483647<br/>
     *
     * @param fragmentLength Use Fragment length (FragmentLength) to specify the
     *            mp4 fragment sizes in seconds. Fragment length must be
     *            compatible with GOP size and frame rate.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MsSmoothGroupSettings withFragmentLength(Integer fragmentLength) {
        this.fragmentLength = fragmentLength;
        return this;
    }

    /**
     * Use Manifest encoding (MsSmoothManifestEncoding) to specify the encoding
     * format for the server and client manifest. Valid options are utf8 and
     * utf16.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UTF8, UTF16
     *
     * @return Use Manifest encoding (MsSmoothManifestEncoding) to specify the
     *         encoding format for the server and client manifest. Valid options
     *         are utf8 and utf16.
     * @see MsSmoothManifestEncoding
     */
    public String getManifestEncoding() {
        return manifestEncoding;
    }

    /**
     * Use Manifest encoding (MsSmoothManifestEncoding) to specify the encoding
     * format for the server and client manifest. Valid options are utf8 and
     * utf16.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UTF8, UTF16
     *
     * @param manifestEncoding Use Manifest encoding (MsSmoothManifestEncoding)
     *            to specify the encoding format for the server and client
     *            manifest. Valid options are utf8 and utf16.
     * @see MsSmoothManifestEncoding
     */
    public void setManifestEncoding(String manifestEncoding) {
        this.manifestEncoding = manifestEncoding;
    }

    /**
     * Use Manifest encoding (MsSmoothManifestEncoding) to specify the encoding
     * format for the server and client manifest. Valid options are utf8 and
     * utf16.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UTF8, UTF16
     *
     * @param manifestEncoding Use Manifest encoding (MsSmoothManifestEncoding)
     *            to specify the encoding format for the server and client
     *            manifest. Valid options are utf8 and utf16.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MsSmoothManifestEncoding
     */
    public MsSmoothGroupSettings withManifestEncoding(String manifestEncoding) {
        this.manifestEncoding = manifestEncoding;
        return this;
    }

    /**
     * Use Manifest encoding (MsSmoothManifestEncoding) to specify the encoding
     * format for the server and client manifest. Valid options are utf8 and
     * utf16.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UTF8, UTF16
     *
     * @param manifestEncoding Use Manifest encoding (MsSmoothManifestEncoding)
     *            to specify the encoding format for the server and client
     *            manifest. Valid options are utf8 and utf16.
     * @see MsSmoothManifestEncoding
     */
    public void setManifestEncoding(MsSmoothManifestEncoding manifestEncoding) {
        this.manifestEncoding = manifestEncoding.toString();
    }

    /**
     * Use Manifest encoding (MsSmoothManifestEncoding) to specify the encoding
     * format for the server and client manifest. Valid options are utf8 and
     * utf16.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UTF8, UTF16
     *
     * @param manifestEncoding Use Manifest encoding (MsSmoothManifestEncoding)
     *            to specify the encoding format for the server and client
     *            manifest. Valid options are utf8 and utf16.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MsSmoothManifestEncoding
     */
    public MsSmoothGroupSettings withManifestEncoding(MsSmoothManifestEncoding manifestEncoding) {
        this.manifestEncoding = manifestEncoding.toString();
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
        if (getAdditionalManifests() != null)
            sb.append("AdditionalManifests: " + getAdditionalManifests() + ",");
        if (getAudioDeduplication() != null)
            sb.append("AudioDeduplication: " + getAudioDeduplication() + ",");
        if (getDestination() != null)
            sb.append("Destination: " + getDestination() + ",");
        if (getDestinationSettings() != null)
            sb.append("DestinationSettings: " + getDestinationSettings() + ",");
        if (getEncryption() != null)
            sb.append("Encryption: " + getEncryption() + ",");
        if (getFragmentLength() != null)
            sb.append("FragmentLength: " + getFragmentLength() + ",");
        if (getManifestEncoding() != null)
            sb.append("ManifestEncoding: " + getManifestEncoding());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAdditionalManifests() == null) ? 0 : getAdditionalManifests().hashCode());
        hashCode = prime * hashCode
                + ((getAudioDeduplication() == null) ? 0 : getAudioDeduplication().hashCode());
        hashCode = prime * hashCode
                + ((getDestination() == null) ? 0 : getDestination().hashCode());
        hashCode = prime * hashCode
                + ((getDestinationSettings() == null) ? 0 : getDestinationSettings().hashCode());
        hashCode = prime * hashCode + ((getEncryption() == null) ? 0 : getEncryption().hashCode());
        hashCode = prime * hashCode
                + ((getFragmentLength() == null) ? 0 : getFragmentLength().hashCode());
        hashCode = prime * hashCode
                + ((getManifestEncoding() == null) ? 0 : getManifestEncoding().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MsSmoothGroupSettings == false)
            return false;
        MsSmoothGroupSettings other = (MsSmoothGroupSettings) obj;

        if (other.getAdditionalManifests() == null ^ this.getAdditionalManifests() == null)
            return false;
        if (other.getAdditionalManifests() != null
                && other.getAdditionalManifests().equals(this.getAdditionalManifests()) == false)
            return false;
        if (other.getAudioDeduplication() == null ^ this.getAudioDeduplication() == null)
            return false;
        if (other.getAudioDeduplication() != null
                && other.getAudioDeduplication().equals(this.getAudioDeduplication()) == false)
            return false;
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
        if (other.getEncryption() == null ^ this.getEncryption() == null)
            return false;
        if (other.getEncryption() != null
                && other.getEncryption().equals(this.getEncryption()) == false)
            return false;
        if (other.getFragmentLength() == null ^ this.getFragmentLength() == null)
            return false;
        if (other.getFragmentLength() != null
                && other.getFragmentLength().equals(this.getFragmentLength()) == false)
            return false;
        if (other.getManifestEncoding() == null ^ this.getManifestEncoding() == null)
            return false;
        if (other.getManifestEncoding() != null
                && other.getManifestEncoding().equals(this.getManifestEncoding()) == false)
            return false;
        return true;
    }
}
