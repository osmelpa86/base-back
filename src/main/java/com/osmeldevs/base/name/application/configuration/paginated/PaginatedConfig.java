package com.osmeldevs.base.name.application.configuration.paginated;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "paginated")
@Data
public class PaginatedConfig {
    private int defaultPageValue;
    private int defaultSizeValue;
    private String defaultSortValue;
    private String defaultLanguageValue;
}
