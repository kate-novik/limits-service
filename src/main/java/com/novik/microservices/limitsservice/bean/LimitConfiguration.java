package com.novik.microservices.limitsservice.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * LimitConfiguration.
 *
 * @author Kate Novik
 */
@Data
@AllArgsConstructor
public class LimitConfiguration {

  private int minimum;
  private int maximum;

}
