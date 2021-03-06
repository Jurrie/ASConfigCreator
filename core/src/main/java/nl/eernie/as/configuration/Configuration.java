package nl.eernie.as.configuration;

import nl.eernie.as.application_server.ApplicationServer;

import java.io.File;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Configuration
{
	private final List<ApplicationServer> applicationServers = new LinkedList<>();
	private final List<String> contexts = new LinkedList<>();
	private final Map<String, String> properties = new HashMap<>();
	private String fromTag;
	private String toTag;
	private File outputDirectoryPath;

	public List<ApplicationServer> getApplicationServers()
	{
		return applicationServers;
	}

	public List<String> getContexts()
	{
		return contexts;
	}

	public File getOutputDirectoryPath()
	{
		return outputDirectoryPath;
	}

	public void setOutputDirectoryPath(File outputDirectoryPath)
	{
		this.outputDirectoryPath = outputDirectoryPath;
	}

	public Map<String, String> getProperties()
	{
		return properties;
	}

	public void addProperties(Map<String, String> properties)
	{
		this.properties.putAll(properties);
	}

	public String getToTag()
	{
		return toTag;
	}

	public void setToTag(String toTag)
	{
		this.toTag = toTag;
	}

	public String getFromTag()
	{
		return fromTag;
	}

	public void setFromTag(String fromTag)
	{
		this.fromTag = fromTag;
	}

	@Override
	public String toString()
	{
		return "Configuration{" +
			"applicationServers=" + applicationServers +
			", contexts=" + contexts +
			", properties=" + properties +
			", fromTag='" + fromTag + '\'' +
			", toTag='" + toTag + '\'' +
			", outputDirectoryPath=" + outputDirectoryPath +
			'}';
	}
}
