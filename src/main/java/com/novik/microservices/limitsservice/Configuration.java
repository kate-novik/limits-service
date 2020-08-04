package com.novik.microservices.limitsservice;

import org.springframework.boot.context.properties.ConfigurationProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Configuration for getting data from application.properties.
 * @author Kate Novik
 */
@Setter
@Getter
@NoArgsConstructor
@ConfigurationProperties("limits-service")
public class Configuration {

  private int minimum;
  private int maximum;
}
