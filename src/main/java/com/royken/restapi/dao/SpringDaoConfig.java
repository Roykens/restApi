/**
 * 
 */
package com.royken.restapi.dao;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author Kenfack Valmy-Roi <roykenvalmy@gmail.com>
 *
 */
@Configuration
@EnableJpaRepositories(basePackages = "com.bracongo.pdv.dao")
public class SpringDaoConfig {

}
