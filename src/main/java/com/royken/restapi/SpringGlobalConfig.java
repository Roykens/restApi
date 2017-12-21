/**
 * 
 */
package com.royken.restapi;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.royken.restapi.dao.SpringDaoConfig;
import com.royken.restapi.data.SpringPersistenceConfig;
import com.royken.restapi.service.SpringServiceConfig;

/**
 * @author Kenfack Valmy-Roi <roykenvalmy@gmail.com>
 *
 */
@Configuration
@EnableWebMvc
@EnableTransactionManagement
@ComponentScan({ "com.bracongo.pdv.dao", "com.bracongo.pdv.service", "com.bracongo.pdv.test",
		"com.bracongo.pdv.controller" })
@Import({ SpringPersistenceConfig.class, SpringDaoConfig.class, SpringServiceConfig.class })

public class SpringGlobalConfig {

}
