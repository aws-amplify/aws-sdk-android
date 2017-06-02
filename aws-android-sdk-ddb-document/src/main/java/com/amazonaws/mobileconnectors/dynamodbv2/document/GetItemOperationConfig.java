package com.amazonaws.mobileconnectors.dynamodbv2.document;

import java.util.List;

/**
 * Configuration for the Table.GetItem operation
 */
public class GetItemOperationConfig {

    private List<String> attributesToGet;

    private boolean consistentRead;

    /**
     * List of attributes to retrieve
     *
     * @return List of attributes to retrieve.
     */
    public List<String> getAttributesToGet() {
        return attributesToGet;
    }

    /**
     * set List of attributes to retrieve
     *
     * @param attributesToGet List of attributes to retrieve.
     */
    public void setAttributesToGet(List<String> attributesToGet) {
        this.attributesToGet = attributesToGet;
    }

    /**
     * If set to true, this flag ensures that the most recently written data is
     * returned.
     *
     * @return if Table.GetItem operation is consistent read.
     */
    public boolean isConsistentRead() {
        return consistentRead;
    }

    /**
     * If set to true, this flag ensures that the most recently written data is
     * returned.
     *
     * @param consistentRead If set to true, this flag ensures that the most
     *            recently written data is returned.
     */
    public void setConsistentRead(boolean consistentRead) {
        this.consistentRead = consistentRead;
    }

}
