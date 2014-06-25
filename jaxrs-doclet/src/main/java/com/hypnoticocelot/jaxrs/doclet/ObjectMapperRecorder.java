package com.hypnoticocelot.jaxrs.doclet;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.google.common.io.ByteStreams;
import com.hypnoticocelot.jaxrs.doclet.model.ApiDeclaration;
import com.hypnoticocelot.jaxrs.doclet.model.ResourceListing;

public class ObjectMapperRecorder implements Recorder {

	private final ObjectMapper mapper = new ObjectMapper();

	/**
	 * This creates a ObjectMapperRecorder
	 */
	public ObjectMapperRecorder() {
		this.mapper.configure(SerializationFeature.INDENT_OUTPUT, true);
		this.mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
	}

	/**
	 * {@inheritDoc}
	 * @see com.hypnoticocelot.jaxrs.doclet.Recorder#record(java.io.File, com.hypnoticocelot.jaxrs.doclet.model.ApiDeclaration)
	 */
	public void record(File file, ApiDeclaration declaration) throws IOException {
		this.mapper.writeValue(file, declaration);
	}

	/**
	 * {@inheritDoc}
	 * @see com.hypnoticocelot.jaxrs.doclet.Recorder#record(java.io.File, com.hypnoticocelot.jaxrs.doclet.model.ResourceListing)
	 */
	public void record(File file, ResourceListing listing) throws IOException {
		this.mapper.writeValue(file, listing);
	}

	/**
	 * {@inheritDoc}
	 * @see com.hypnoticocelot.jaxrs.doclet.Recorder#record(java.io.File, java.io.InputStream)
	 */
	public void record(File file, InputStream stream) throws IOException {
		final FileOutputStream outputStream = new FileOutputStream(file);
		ByteStreams.copy(stream, outputStream);
		outputStream.flush();
		outputStream.close();
	}
}
