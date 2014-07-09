/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.android.kinesisrecorder.internal;

import java.util.Iterator;

public interface RecordStore {
    
    /**
     * Saves a text representation of a PutRecordRequest to be retrieved later. 
     * @param record The text representation of the PutRecordRequest
     * @return If it was a successful save
     */
	public boolean put(final String record);
	
	/**
	 * Retrieve an iterator to parse through the saved records
	 * @return An instance of RecordIterator
	 */
	public RecordIterator iterator();
	
	public static interface RecordIterator extends Iterator<String> {
	    /**
	     * Removes all records that have been read through the next() iterator call
	     */
		public void removeReadRecords();
		public void removeAllRecords();
		public String peek();
	}
}
