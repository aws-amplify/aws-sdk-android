/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;

/**
 * <p>
 * Provides information about the configuration, dimension, and other settings
 * for a segment.
 * </p>
 */
public class SegmentResponse implements Serializable {
    /**
     * <p>
     * The unique identifier for the application that the segment is associated
     * with.
     * </p>
     */
    private String applicationId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the segment.
     * </p>
     */
    private String arn;

    /**
     * <p>
     * The date and time when the segment was created.
     * </p>
     */
    private String creationDate;

    /**
     * <p>
     * The dimension settings for the segment.
     * </p>
     */
    private SegmentDimensions dimensions;

    /**
     * <p>
     * The unique identifier for the segment.
     * </p>
     */
    private String id;

    /**
     * <p>
     * The settings for the import job that's associated with the segment.
     * </p>
     */
    private SegmentImportResource importDefinition;

    /**
     * <p>
     * The date and time when the segment was last modified.
     * </p>
     */
    private String lastModifiedDate;

    /**
     * <p>
     * The name of the segment.
     * </p>
     */
    private String name;

    /**
     * <p>
     * A list of one or more segment groups that apply to the segment. Each
     * segment group consists of zero or more base segments and the dimensions
     * that are applied to those base segments.
     * </p>
     */
    private SegmentGroupList segmentGroups;

    /**
     * <p>
     * The segment type. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * DIMENSIONAL - A dynamic segment, which is a segment that uses selection
     * criteria that you specify and is based on endpoint data that's reported
     * by your app. Dynamic segments can change over time.
     * </p>
     * </li>
     * <li>
     * <p>
     * IMPORT - A static segment, which is a segment that uses selection
     * criteria that you specify and is based on endpoint definitions that you
     * import from a file. Imported segments are static; they don't change over
     * time.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DIMENSIONAL, IMPORT
     */
    private String segmentType;

    /**
     * <p>
     * A string-to-string map of key-value pairs that identifies the tags that
     * are associated with the segment. Each tag consists of a required tag key
     * and an associated tag value.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The version number of the segment.
     * </p>
     */
    private Integer version;

    /**
     * <p>
     * The unique identifier for the application that the segment is associated
     * with.
     * </p>
     *
     * @return <p>
     *         The unique identifier for the application that the segment is
     *         associated with.
     *         </p>
     */
    public String getApplicationId() {
        return applicationId;
    }

    /**
     * <p>
     * The unique identifier for the application that the segment is associated
     * with.
     * </p>
     *
     * @param applicationId <p>
     *            The unique identifier for the application that the segment is
     *            associated with.
     *            </p>
     */
    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The unique identifier for the application that the segment is associated
     * with.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param applicationId <p>
     *            The unique identifier for the application that the segment is
     *            associated with.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SegmentResponse withApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the segment.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the segment.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the segment.
     * </p>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the segment.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the segment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the segment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SegmentResponse withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * <p>
     * The date and time when the segment was created.
     * </p>
     *
     * @return <p>
     *         The date and time when the segment was created.
     *         </p>
     */
    public String getCreationDate() {
        return creationDate;
    }

    /**
     * <p>
     * The date and time when the segment was created.
     * </p>
     *
     * @param creationDate <p>
     *            The date and time when the segment was created.
     *            </p>
     */
    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date and time when the segment was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationDate <p>
     *            The date and time when the segment was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SegmentResponse withCreationDate(String creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    /**
     * <p>
     * The dimension settings for the segment.
     * </p>
     *
     * @return <p>
     *         The dimension settings for the segment.
     *         </p>
     */
    public SegmentDimensions getDimensions() {
        return dimensions;
    }

    /**
     * <p>
     * The dimension settings for the segment.
     * </p>
     *
     * @param dimensions <p>
     *            The dimension settings for the segment.
     *            </p>
     */
    public void setDimensions(SegmentDimensions dimensions) {
        this.dimensions = dimensions;
    }

    /**
     * <p>
     * The dimension settings for the segment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dimensions <p>
     *            The dimension settings for the segment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SegmentResponse withDimensions(SegmentDimensions dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    /**
     * <p>
     * The unique identifier for the segment.
     * </p>
     *
     * @return <p>
     *         The unique identifier for the segment.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The unique identifier for the segment.
     * </p>
     *
     * @param id <p>
     *            The unique identifier for the segment.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier for the segment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id <p>
     *            The unique identifier for the segment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SegmentResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The settings for the import job that's associated with the segment.
     * </p>
     *
     * @return <p>
     *         The settings for the import job that's associated with the
     *         segment.
     *         </p>
     */
    public SegmentImportResource getImportDefinition() {
        return importDefinition;
    }

    /**
     * <p>
     * The settings for the import job that's associated with the segment.
     * </p>
     *
     * @param importDefinition <p>
     *            The settings for the import job that's associated with the
     *            segment.
     *            </p>
     */
    public void setImportDefinition(SegmentImportResource importDefinition) {
        this.importDefinition = importDefinition;
    }

    /**
     * <p>
     * The settings for the import job that's associated with the segment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param importDefinition <p>
     *            The settings for the import job that's associated with the
     *            segment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SegmentResponse withImportDefinition(SegmentImportResource importDefinition) {
        this.importDefinition = importDefinition;
        return this;
    }

    /**
     * <p>
     * The date and time when the segment was last modified.
     * </p>
     *
     * @return <p>
     *         The date and time when the segment was last modified.
     *         </p>
     */
    public String getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * <p>
     * The date and time when the segment was last modified.
     * </p>
     *
     * @param lastModifiedDate <p>
     *            The date and time when the segment was last modified.
     *            </p>
     */
    public void setLastModifiedDate(String lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * <p>
     * The date and time when the segment was last modified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModifiedDate <p>
     *            The date and time when the segment was last modified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SegmentResponse withLastModifiedDate(String lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
        return this;
    }

    /**
     * <p>
     * The name of the segment.
     * </p>
     *
     * @return <p>
     *         The name of the segment.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the segment.
     * </p>
     *
     * @param name <p>
     *            The name of the segment.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the segment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            The name of the segment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SegmentResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * A list of one or more segment groups that apply to the segment. Each
     * segment group consists of zero or more base segments and the dimensions
     * that are applied to those base segments.
     * </p>
     *
     * @return <p>
     *         A list of one or more segment groups that apply to the segment.
     *         Each segment group consists of zero or more base segments and the
     *         dimensions that are applied to those base segments.
     *         </p>
     */
    public SegmentGroupList getSegmentGroups() {
        return segmentGroups;
    }

    /**
     * <p>
     * A list of one or more segment groups that apply to the segment. Each
     * segment group consists of zero or more base segments and the dimensions
     * that are applied to those base segments.
     * </p>
     *
     * @param segmentGroups <p>
     *            A list of one or more segment groups that apply to the
     *            segment. Each segment group consists of zero or more base
     *            segments and the dimensions that are applied to those base
     *            segments.
     *            </p>
     */
    public void setSegmentGroups(SegmentGroupList segmentGroups) {
        this.segmentGroups = segmentGroups;
    }

    /**
     * <p>
     * A list of one or more segment groups that apply to the segment. Each
     * segment group consists of zero or more base segments and the dimensions
     * that are applied to those base segments.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param segmentGroups <p>
     *            A list of one or more segment groups that apply to the
     *            segment. Each segment group consists of zero or more base
     *            segments and the dimensions that are applied to those base
     *            segments.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SegmentResponse withSegmentGroups(SegmentGroupList segmentGroups) {
        this.segmentGroups = segmentGroups;
        return this;
    }

    /**
     * <p>
     * The segment type. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * DIMENSIONAL - A dynamic segment, which is a segment that uses selection
     * criteria that you specify and is based on endpoint data that's reported
     * by your app. Dynamic segments can change over time.
     * </p>
     * </li>
     * <li>
     * <p>
     * IMPORT - A static segment, which is a segment that uses selection
     * criteria that you specify and is based on endpoint definitions that you
     * import from a file. Imported segments are static; they don't change over
     * time.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DIMENSIONAL, IMPORT
     *
     * @return <p>
     *         The segment type. Valid values are:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         DIMENSIONAL - A dynamic segment, which is a segment that uses
     *         selection criteria that you specify and is based on endpoint data
     *         that's reported by your app. Dynamic segments can change over
     *         time.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         IMPORT - A static segment, which is a segment that uses selection
     *         criteria that you specify and is based on endpoint definitions
     *         that you import from a file. Imported segments are static; they
     *         don't change over time.
     *         </p>
     *         </li>
     *         </ul>
     * @see SegmentType
     */
    public String getSegmentType() {
        return segmentType;
    }

    /**
     * <p>
     * The segment type. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * DIMENSIONAL - A dynamic segment, which is a segment that uses selection
     * criteria that you specify and is based on endpoint data that's reported
     * by your app. Dynamic segments can change over time.
     * </p>
     * </li>
     * <li>
     * <p>
     * IMPORT - A static segment, which is a segment that uses selection
     * criteria that you specify and is based on endpoint definitions that you
     * import from a file. Imported segments are static; they don't change over
     * time.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DIMENSIONAL, IMPORT
     *
     * @param segmentType <p>
     *            The segment type. Valid values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            DIMENSIONAL - A dynamic segment, which is a segment that uses
     *            selection criteria that you specify and is based on endpoint
     *            data that's reported by your app. Dynamic segments can change
     *            over time.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            IMPORT - A static segment, which is a segment that uses
     *            selection criteria that you specify and is based on endpoint
     *            definitions that you import from a file. Imported segments are
     *            static; they don't change over time.
     *            </p>
     *            </li>
     *            </ul>
     * @see SegmentType
     */
    public void setSegmentType(String segmentType) {
        this.segmentType = segmentType;
    }

    /**
     * <p>
     * The segment type. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * DIMENSIONAL - A dynamic segment, which is a segment that uses selection
     * criteria that you specify and is based on endpoint data that's reported
     * by your app. Dynamic segments can change over time.
     * </p>
     * </li>
     * <li>
     * <p>
     * IMPORT - A static segment, which is a segment that uses selection
     * criteria that you specify and is based on endpoint definitions that you
     * import from a file. Imported segments are static; they don't change over
     * time.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DIMENSIONAL, IMPORT
     *
     * @param segmentType <p>
     *            The segment type. Valid values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            DIMENSIONAL - A dynamic segment, which is a segment that uses
     *            selection criteria that you specify and is based on endpoint
     *            data that's reported by your app. Dynamic segments can change
     *            over time.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            IMPORT - A static segment, which is a segment that uses
     *            selection criteria that you specify and is based on endpoint
     *            definitions that you import from a file. Imported segments are
     *            static; they don't change over time.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SegmentType
     */
    public SegmentResponse withSegmentType(String segmentType) {
        this.segmentType = segmentType;
        return this;
    }

    /**
     * <p>
     * The segment type. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * DIMENSIONAL - A dynamic segment, which is a segment that uses selection
     * criteria that you specify and is based on endpoint data that's reported
     * by your app. Dynamic segments can change over time.
     * </p>
     * </li>
     * <li>
     * <p>
     * IMPORT - A static segment, which is a segment that uses selection
     * criteria that you specify and is based on endpoint definitions that you
     * import from a file. Imported segments are static; they don't change over
     * time.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DIMENSIONAL, IMPORT
     *
     * @param segmentType <p>
     *            The segment type. Valid values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            DIMENSIONAL - A dynamic segment, which is a segment that uses
     *            selection criteria that you specify and is based on endpoint
     *            data that's reported by your app. Dynamic segments can change
     *            over time.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            IMPORT - A static segment, which is a segment that uses
     *            selection criteria that you specify and is based on endpoint
     *            definitions that you import from a file. Imported segments are
     *            static; they don't change over time.
     *            </p>
     *            </li>
     *            </ul>
     * @see SegmentType
     */
    public void setSegmentType(SegmentType segmentType) {
        this.segmentType = segmentType.toString();
    }

    /**
     * <p>
     * The segment type. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * DIMENSIONAL - A dynamic segment, which is a segment that uses selection
     * criteria that you specify and is based on endpoint data that's reported
     * by your app. Dynamic segments can change over time.
     * </p>
     * </li>
     * <li>
     * <p>
     * IMPORT - A static segment, which is a segment that uses selection
     * criteria that you specify and is based on endpoint definitions that you
     * import from a file. Imported segments are static; they don't change over
     * time.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DIMENSIONAL, IMPORT
     *
     * @param segmentType <p>
     *            The segment type. Valid values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            DIMENSIONAL - A dynamic segment, which is a segment that uses
     *            selection criteria that you specify and is based on endpoint
     *            data that's reported by your app. Dynamic segments can change
     *            over time.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            IMPORT - A static segment, which is a segment that uses
     *            selection criteria that you specify and is based on endpoint
     *            definitions that you import from a file. Imported segments are
     *            static; they don't change over time.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SegmentType
     */
    public SegmentResponse withSegmentType(SegmentType segmentType) {
        this.segmentType = segmentType.toString();
        return this;
    }

    /**
     * <p>
     * A string-to-string map of key-value pairs that identifies the tags that
     * are associated with the segment. Each tag consists of a required tag key
     * and an associated tag value.
     * </p>
     *
     * @return <p>
     *         A string-to-string map of key-value pairs that identifies the
     *         tags that are associated with the segment. Each tag consists of a
     *         required tag key and an associated tag value.
     *         </p>
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A string-to-string map of key-value pairs that identifies the tags that
     * are associated with the segment. Each tag consists of a required tag key
     * and an associated tag value.
     * </p>
     *
     * @param tags <p>
     *            A string-to-string map of key-value pairs that identifies the
     *            tags that are associated with the segment. Each tag consists
     *            of a required tag key and an associated tag value.
     *            </p>
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A string-to-string map of key-value pairs that identifies the tags that
     * are associated with the segment. Each tag consists of a required tag key
     * and an associated tag value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A string-to-string map of key-value pairs that identifies the
     *            tags that are associated with the segment. Each tag consists
     *            of a required tag key and an associated tag value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SegmentResponse withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * <p>
     * A string-to-string map of key-value pairs that identifies the tags that
     * are associated with the segment. Each tag consists of a required tag key
     * and an associated tag value.
     * </p>
     * <p>
     * The method adds a new key-value pair into tags parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into tags.
     * @param value The corresponding value of the entry to be added into tags.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SegmentResponse addtagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into tags.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public SegmentResponse cleartagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The version number of the segment.
     * </p>
     *
     * @return <p>
     *         The version number of the segment.
     *         </p>
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * <p>
     * The version number of the segment.
     * </p>
     *
     * @param version <p>
     *            The version number of the segment.
     *            </p>
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * <p>
     * The version number of the segment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param version <p>
     *            The version number of the segment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SegmentResponse withVersion(Integer version) {
        this.version = version;
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
        if (getApplicationId() != null)
            sb.append("ApplicationId: " + getApplicationId() + ",");
        if (getArn() != null)
            sb.append("Arn: " + getArn() + ",");
        if (getCreationDate() != null)
            sb.append("CreationDate: " + getCreationDate() + ",");
        if (getDimensions() != null)
            sb.append("Dimensions: " + getDimensions() + ",");
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getImportDefinition() != null)
            sb.append("ImportDefinition: " + getImportDefinition() + ",");
        if (getLastModifiedDate() != null)
            sb.append("LastModifiedDate: " + getLastModifiedDate() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getSegmentGroups() != null)
            sb.append("SegmentGroups: " + getSegmentGroups() + ",");
        if (getSegmentType() != null)
            sb.append("SegmentType: " + getSegmentType() + ",");
        if (getTags() != null)
            sb.append("tags: " + getTags() + ",");
        if (getVersion() != null)
            sb.append("Version: " + getVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode
                + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode + ((getDimensions() == null) ? 0 : getDimensions().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode
                + ((getImportDefinition() == null) ? 0 : getImportDefinition().hashCode());
        hashCode = prime * hashCode
                + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getSegmentGroups() == null) ? 0 : getSegmentGroups().hashCode());
        hashCode = prime * hashCode
                + ((getSegmentType() == null) ? 0 : getSegmentType().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SegmentResponse == false)
            return false;
        SegmentResponse other = (SegmentResponse) obj;

        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null
                && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null
                && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getDimensions() == null ^ this.getDimensions() == null)
            return false;
        if (other.getDimensions() != null
                && other.getDimensions().equals(this.getDimensions()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getImportDefinition() == null ^ this.getImportDefinition() == null)
            return false;
        if (other.getImportDefinition() != null
                && other.getImportDefinition().equals(this.getImportDefinition()) == false)
            return false;
        if (other.getLastModifiedDate() == null ^ this.getLastModifiedDate() == null)
            return false;
        if (other.getLastModifiedDate() != null
                && other.getLastModifiedDate().equals(this.getLastModifiedDate()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSegmentGroups() == null ^ this.getSegmentGroups() == null)
            return false;
        if (other.getSegmentGroups() != null
                && other.getSegmentGroups().equals(this.getSegmentGroups()) == false)
            return false;
        if (other.getSegmentType() == null ^ this.getSegmentType() == null)
            return false;
        if (other.getSegmentType() != null
                && other.getSegmentType().equals(this.getSegmentType()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        return true;
    }
}
