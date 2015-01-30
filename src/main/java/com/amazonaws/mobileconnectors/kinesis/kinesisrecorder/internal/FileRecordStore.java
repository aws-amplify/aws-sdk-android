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
package com.amazonaws.mobileconnectors.kinesis.kinesisrecorder.internal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.concurrent.locks.ReentrantLock;

import com.amazonaws.AmazonClientException;
import com.amazonaws.mobileconnectors.kinesis.kinesisrecorder.KinesisRecorderConfig;
import com.amazonaws.mobileconnectors.kinesis.kinesisrecorder.internal.logging.Logger;

/**
 *  The FileRecordStore is responsible for recording Kinesis PutRecordRequests to the Android disk.  Currently it stores each request as a JSON object
 *  representing it's properties.  One request per line.
 *
 */
public class FileRecordStore implements RecordStore {
	private static final Logger logger = Logger.getLogger(FileRecordStore.class);
	static final String KEY_MAX_STORAGE_SIZE = "maxStorageSize";
	static final double ERROR_LENGTH_THRESHOLD_PERCENTAGE = 1.1;
	private final ReentrantLock accessLock = new ReentrantLock(true);

	/** The file the requests are stored in **/
	private File recordFile;
	
	/** The FileManager used for interacting with the FS **/
	private FileManager fileManager;
	
	/** The configuration used for different values such as max file size ect... **/
	private KinesisRecorderConfig config;
	
	/**
	 * Creates the FileRecordStore 
	 * @param recorderDirectory  The directory (which the FileRecordStore is only used for the KinesisRecorder) to use to store requests in
	 * @param config
	 */
	public FileRecordStore(final File recorderDirectory,KinesisRecorderConfig config) {
		this.fileManager = new FileManager(recorderDirectory);
		this.config = config;
		tryCreateRecordsFile();
	}

	@Override
	public boolean put(final String record) {
		boolean success = false;
		Writer writer = null;
		accessLock.lock();
		try {
			writer = tryInitializeWriter();
			if(writer != null) {
				if(recordFile.length() + record.getBytes().length <= config.getMaxStorageSize()) {
					writer.write(record+"\n");
					writer.flush();
					success = true;
				} else {
					logger.e("The record file exceeded its allowed size of " + config.getMaxStorageSize() + " bytes");
				}
			}
		} catch (IOException e) {
			logger.e("Failed to persist the record", e);
		} finally {
			accessLock.unlock();
			tryCloseWriter(writer);
		}
		
		return success;
	}
	
	private boolean tryCreateRecordsFile() {
		if(recordFile != null && recordFile.exists()) {
			return true;
		}
		
		synchronized(this) {
			if(recordFile != null && recordFile.exists()) {
				return true;
			}
			
			try {
				File recordDir = fileManager.createDirectory(
                                        Constants.RECORDS_DIRECTORY);
				recordFile = fileManager.createFile(new File(
                                        recordDir, Constants.RECORDS_FILE_NAME));
				return true;
	        } catch (IOException e) {
	            logger.deve("Unable to open records file");
	            logger.e("An error occurred while attempting to create/open the records file", e);
	        }
			return false;
		}
	}

	private Writer tryInitializeWriter() {
		Writer writer = null;
		try {
			if(tryCreateRecordsFile()) {
				OutputStream stream = fileManager.newOutputStream(recordFile, true);
				writer = new OutputStreamWriter(stream);
			} else {
				throw new AmazonClientException("Unable to create record file");
			}
		} catch (FileNotFoundException e) {
			logger.e("Records file not found to persist record to", e);
			throw new AmazonClientException("Unable to open record file writer", e);
		} catch (Exception e) {
			throw new AmazonClientException("Unexpected error while creating recordsFile writer", e);
		}
		return writer;
	}
	
	private void tryCloseWriter(final Writer writer) {
		if(writer != null) {
			try {
				writer.close();
			} catch(IOException e) {
				logger.e("Unable to close writer for records file", e);
			}
		}
	}
	
	private File deleteAllRecords(){
	    File recordsDir = fileManager.createDirectory(
                    Constants.RECORDS_DIRECTORY);
	    
	    if(!recordFile.delete()) {
            logger.e("Failed to delete records file that exceeds the max storage size");
        }
        try {
            recordFile = fileManager.createFile(new File(
                    recordsDir, Constants.RECORDS_FILE_NAME));
        } catch (IOException e) {
            logger.e("An error occurred while attempting to create the records file", e);
        }
        return recordFile;
	}

	private File deleteReadRecords(final int lineNumber) {
		//Write all records after line number to a temporary file
		File recordsDir = fileManager.createDirectory(
                        Constants.RECORDS_DIRECTORY);

        File tempRecordsFile = null;
        try {
        	File tempFile = new File(
                        recordsDir, Constants.RECORDS_FILE_NAME + ".tmp");
            if(tempFile.exists()) {
            	if(!tempFile.delete()) {
            		logger.e("Failed to delete previous temp file");
            	}
            }
        	tempRecordsFile = fileManager.createFile(tempFile);
        } catch (IOException e) {
            logger.e("An error occurred while attempting to create/open the temporary records file", e);
            return recordFile;
        }
        
        boolean errorsOccurred = false;
        if(tempRecordsFile != null && recordFile.exists() && tempRecordsFile.exists()) {
        	BufferedReader reader = null;
        	PrintWriter writer = null;
			try {
				reader = new BufferedReader(new FileReader(recordFile));
				writer = new PrintWriter(new FileWriter(tempRecordsFile, true));

        		String line = null;
        		int currentLineNumber = 0;
				while ((line = reader.readLine()) != null) {
					currentLineNumber++;
					if (currentLineNumber > lineNumber) {
						writer.println(line);
						writer.flush();
					}
				}
			} catch (FileNotFoundException e) {
				errorsOccurred = true;
				logger.e("The records file count not be found", e);
			} catch (IOException e) {
				logger.e("An error occurred while attempting to delete the read records", e);
				errorsOccurred = true;
			} finally {
				if(writer != null) {
					writer.close();
				}
				if(reader != null) {
					try {
						reader.close();
					} catch (IOException e) {

					}
				}
				
				if(!errorsOccurred) {
					if(recordFile.delete()) {
						if(!tempRecordsFile.renameTo(recordFile)) {
							logger.e("Failed to rename temp file to records file");
						}
						try {
							recordFile = fileManager.createFile(new File(recordsDir, Constants.RECORDS_FILE_NAME));
						} catch (IOException e) {
							logger.e("An error occurred while attempting to create the recordsFile", e);
						}
					} else {
						logger.e("Failed to delete previous records file");
					}
				}
			}
			
			File tempFile = new File(
                                recordsDir, Constants.RECORDS_FILE_NAME + ".tmp");
            if(tempFile.exists()) {
            	if(!tempFile.delete()) {
            		logger.e("Failed to delete temp file");
            	}
            }
        }
		return recordFile;
	}

	@Override
	public RecordIterator iterator() {
		return new RecordIterator() {
			int linesRead = 0;
			String nextBuffer = null;
			BufferedReader reader = null;
			boolean isEndOfFile = false;

			private boolean tryOpenReader() {
				if(reader != null) {
					return true;
				}

				if(!isEndOfFile) {
					InputStreamReader streamReader = null;
					try {
						streamReader = new InputStreamReader(fileManager.newInputStream(recordFile));
					} catch (FileNotFoundException e) {
						logger.e("Could not open the records file", e);
					}

					if(streamReader != null) {
				         reader = new BufferedReader(streamReader);
				        return true;
					}
				}
				return false;
			}

			private void tryCloseReader() {
				if(reader != null) {
					try {
						reader.close();
					} catch (IOException ioe) {
						logger.e("Unable to close reader for records file", ioe);
					} finally {
						reader = null;
					}
				}
			}

			@Override
			public boolean hasNext() {
				boolean hasNext = false;
				accessLock.lock();
				try {
					//If there is something already buffered then there is a next
					if(nextBuffer != null) {
						hasNext = true;
					} else {
						if(!tryOpenReader()) {
							return hasNext;
						}
						//Nothing was previously buffered so try to read one more line
						boolean found = false;
						while(!found) {
							try {
								nextBuffer = reader.readLine();
								found = true;
							}  catch (IOException e) {
								nextBuffer = null;
								found = true;
							}
						}
						if(nextBuffer != null) {
							//There was at least one more line so there is a next
							hasNext = true;
						} else {
							//The next line was null so it should be the end of the file. Try to close the reader
							isEndOfFile = true;
							tryCloseReader();
						}
					}
					return hasNext;
				} finally {
					accessLock.unlock();
				}
			}

			@Override
			public String next() {
				String next = null;
				accessLock.lock();
				try {
					if(nextBuffer != null) {
						next = nextBuffer;
						linesRead++;
						nextBuffer = null;
					} else {
						if(!tryOpenReader()) {
							return next;
						}
						boolean found = false;
						while(!found) {
							try {
								next = reader.readLine();
								found = true;
							} catch (IOException e) {
								next = null;
								found = true;
							}
						}
						if(next != null) {
							linesRead++;
						} else {
							isEndOfFile = true;
							tryCloseReader();
						}
					}
					return next;
				} finally {
					accessLock.unlock();
				}
			}

			@Override
			public String peek() {
				accessLock.lock();
				try {
					hasNext();
					return nextBuffer;
				} finally {
					accessLock.unlock();
				}
			}

			@Override
			public void remove() {
				throw new UnsupportedOperationException("The remove() operation is not supported for this iterator");
			}

			@Override
			public void removeReadRecords() {
				accessLock.lock();
				try {
					deleteReadRecords(linesRead);
					resetReader();
				} finally {
					accessLock.unlock();
				}
			}
			
			@Override
			public void removeAllRecords() {
			    accessLock.lock();
			    try{
			        deleteAllRecords();
			        resetReader();
			    }finally {
			        accessLock.unlock();
			    }
			}

			private void resetReader() {
				tryCloseReader();
				linesRead = 0;
				nextBuffer = null;
			}
		};
	}
}
