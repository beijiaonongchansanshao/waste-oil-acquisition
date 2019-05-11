package com.gy.oil.config;

import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import com.gy.oil.common.httpmessageconvert.TextMappingJackson2HttpMessageConverter;

@Configuration
public class BootApplicationConfig {
	@Bean
	public HttpMessageConverters customConverters() {
		HttpMessageConverter<?> textJsonConvert = new TextMappingJackson2HttpMessageConverter();
		HttpMessageConverters converts =  new HttpMessageConverters(textJsonConvert);
		return converts;
	}
}
