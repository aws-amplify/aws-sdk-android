package com.amazonaws.mobileconnectors.dynamodbv2.document;

import com.amazonaws.services.dynamodbv2.model.ReturnValue;

/**
 * Configuration for the Table.PutItem operation
 */
public class PutItemOperationConfig {

    private ReturnValue returnValue;

    /**
     * Flag specifying what values should be returned. PutItem only supports
     * ReturnValues.AllOldAttributes and ReturnValues.None
     *
     * @return {@link ReturnValue}.
     */
    public ReturnValue getReturnValue() {
        return returnValue;
    }

    /**
     * @param returnValue Flag specifying what values should be returned.
     *            PutItem only supports ReturnValues.AllOldAttributes and
     *            ReturnValues.None
     */
    public void setReturnValue(ReturnValue returnValue) {
        this.returnValue = returnValue;
    }

    /**
     * Flag specifying what values should be returned. PutItem only supports
     * ReturnValues.AllOldAttributes and ReturnValues.None
     *
     * @param returnValue Flag specifying what values should be returned.
     *            PutItem only supports ReturnValues.AllOldAttributes and
     *            ReturnValues.None
     * @return the current instance of {@link PutItemOperationConfig}.
     */
    @SuppressWarnings("checkstyle:hiddenfield")
    public PutItemOperationConfig withReturnValues(ReturnValue returnValue) {
        setReturnValue(returnValue);
        return this;
    }

}
