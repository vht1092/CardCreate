package com.wscw;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Dung de ho tro get value tu file config cho component khong quan ly boi
 * Spring
 */
@Component
public class SpringConfigurationValueHelper {

	@Value("${path.file.root}")
	private String pathFileRoot;

	@Value("${time.refresh.content}")
	private int sTimeRefreshContent;
	
	@Value("${url.ws}")
	private String urlWs;
	
	public int sTimeRefreshContent() {
		return sTimeRefreshContent;
	}

	public String getPathFileRoot() {
		return pathFileRoot;
	}

	public String getUrlWs() {
		return urlWs;
	}
	
	


}
